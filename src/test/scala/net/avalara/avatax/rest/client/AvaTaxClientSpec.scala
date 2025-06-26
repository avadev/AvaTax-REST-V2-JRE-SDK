package net.avalara.avatax.rest.client

import java.util
import net.avalara.avatax.rest.client.enums._
import net.avalara.avatax.rest.client.models._
import org.scalatest.Matchers.{be, convertToAnyShouldWrapper, noException}
import org.scalatest.concurrent.ScalaFutures.whenReady
import org.scalatest.fixture

import java.time.OffsetDateTime
import java.io.{File, PrintWriter}
import java.nio.file.{Files, Paths, StandardCopyOption}
import java.util.Date
import scala.collection.JavaConverters._
import java.time.Instant
import java.time.temporal.ChronoUnit

class AvaTaxClientSpec extends fixture.FreeSpec {
  case class AccountInfo(username: String, password: String)
  type FixtureParam = AccountInfo

  def withFixture(test: OneArgTest) = {
   //  val user: String = "sdkSbxTest"
   //  val password: String ="SdkTest2192024!"
    val user: String = "jonathan.wenger.user"
    val password: String = "!6149908161aA"

    withFixture(test.toNoArgTest(AccountInfo(user, password)))
  }

  "AvaTaxClient should" - {
    var client = new AvaTaxClient("Test", "1.0", "Test", AvaTaxEnvironment.Production)

    "successfully fetch an account" in { accountInfo =>
      val account = client.withSecurity(accountInfo.username, accountInfo.password)
    }

  "DownloadReport find a company with reports and download one string" in { accountInfo =>

    val companyId = 6316697
//    val reports = client.listReports(companyId, null, 0, 10)
//    val report = reports.getValue
//    val singleReport = report.get(0)
//    val reportId = reports.get(0).getReportId()
    val reportId: Long = 3194478157205L
//    val downloaded = client.downloadReport(singleReport.getId)
    val downloaded = client.downloadReport(reportId)
    val lineCount: Long = downloaded.lines().count()

    val file = new File(s"report-$companyId-$reportId.csv")
    val pw   = new PrintWriter(file)
    try {
      pw.write(downloaded)
    } finally {
      pw.close()
    }

    // 2) Your existing non‐empty check still works:
    assert(downloaded.nonEmpty,
      s"Downloaded report for company $companyId was empty")

    // 3) Now assert against the numeric count:
    assert(lineCount > 0,
      s"Length was not longer than zero (got $lineCount)")
  }

    "DownloadReport find a company with reports and download one STREAM" in { accountInfo =>

      val companyId = 6316697
      val reportId: Long = 3194478157205L

      // 1) Fetch as InputStream and write it straight to disk
      val inputStream = client.downloadReportStream(reportId)
      val filePath = Paths.get(s"report-$companyId-$reportId-STREAM.csv")
      try {
        Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING)
      } finally {
        inputStream.close()
      }

      // 2) Ensure the file is non‐empty
      val fileSize = Files.size(filePath)
      assert(
        fileSize > 0,
        s"Downloaded report for company $companyId was empty (file size was $fileSize bytes)"
      )
    }

    "successfully validate an address" in { accountInfo =>
      val address = client.withSecurity(accountInfo.username, accountInfo.password).resolveAddress("100 ravine ln ne", "", "", "Bainbridge Island", "WA", "98110", "US", TextCase.Upper)
      assert(address.getValidatedAddresses.get(0).getLine1 == "100 RAVINE LN NE")
      assert(address.getValidatedAddresses.get(0).getCity == "BAINBRIDGE ISLAND")
      assert(address.getValidatedAddresses.get(0).getRegion == "WA")
      assert(address.getValidatedAddresses.get(0).getPostalCode == "98110-2687")
      assert(address.getValidatedAddresses.get(0).getCountry == "US")
    }
//    "return the complete list of countries" in { accountInfo =>
//      val countries = client.withSecurity(accountInfo.username, accountInfo.password).listCountries("", 0, 0, "").getValue.asScala
//      assert(countries.length == 251)
//    }
    "return a nexus by its address" in { accountInfo =>
      val nexusModel = client.withSecurity(accountInfo.username, accountInfo.password).listNexusByAddress("100 ravine ln ne", "", "", "Bainbridge Island", "WA", "98110", "US", "", 0, 0, "").getValue.asScala
      assert(nexusModel.nonEmpty)
    }

    "create a transaction" in { accountInfo =>
      val transaction = new TransactionBuilder(client.withSecurity(accountInfo.username, accountInfo.password), "DEFAULT", DocumentType.SalesOrder, "1")
        .withAddress(TransactionAddressType.ShipFrom, "100 ravine ln ne", "", "", "Bainbridge Island", "WA", "98110", "US")
        .withAddress(TransactionAddressType.ShipTo, "100 ravine ln ne", "", "", "Bainbridge Island", "WA", "98110", "US")
        .withLine(java.math.BigDecimal.valueOf(1000), java.math.BigDecimal.ONE, "P0000000", null, null, "ref1", "ref2")
        .Create()

      val lines = transaction.getLines()
      val line1 = lines.get(0)
      val ref1 = line1.getRef1
      val ref2 = line1.getRef2

      // transaction.getTotalTax
      assert(ref1.equals("ref1"))
      assert(ref2.equals("ref2"))
    }
    "create a transaction from the underlying model" in { accountInfo =>
      import org.scalatest.Matchers._

      noException should be thrownBy {
        val dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd")
        val api = client.withSecurity(accountInfo.username, accountInfo.password)
        val model = new CreateTransactionModel()
        val addrs = new AddressesModel()
        val ali = new AddressLocationInfo()

        ali.setLine1("100 Ravine Ln NE")
        ali.setCity("Bainbridge Island")
        ali.setRegion("WA")
        ali.setCountry("US")
        ali.setPostalCode("98110")

        addrs.setSingleLocation(ali)
        model.setAddresses(addrs)

        model.setCompanyCode("DEFAULT")
        model.setCustomerCode("0")
        model.setType(DocumentType.SalesOrder)
        model.setDiscount(java.math.BigDecimal.valueOf(20))
        model.setDate(dateFormat.parse("2017-11-28"))

        val list = new util.ArrayList[LineItemModel]()
        val line = new LineItemModel()
        line.setAmount(java.math.BigDecimal.valueOf(100))
        line.setDiscounted(true)
        list.add(line)

        model.setLines(list)
        val transaction = api.createTransaction(null, model)
      }
    }
//    "create a transaction with an overridden tax date" in { accountInfo =>
//      val dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
//      val transaction = new TransactionBuilder(client.withSecurity(accountInfo.username, accountInfo.password), "DEFAULT", DocumentType.SalesOrder, "1")
//        .withAddress(TransactionAddressType.ShipTo, "100 RAVINE LN", "", "", "BAINBRIDGE ISLAND", "WA", "98110", "US")
//        .withAddress(TransactionAddressType.ShipFrom, "100 RAVINE LN", "", "", "BAINBRIDGE ISLAND", "WA", "98110", "US")
//        .withAddress(TransactionAddressType.PointOfOrderAcceptance, "100 RAVINE LN", "", "", "BAINBRIDGE ISLAND", "WA", "98110", "US")
//        .withCode("DOCCODE")
//        .withDate(dateFormat.parse("2017-03-02T10:40:18"))
//        .withTaxOverride(TaxOverrideType.TaxDate, "TaxDate", java.math.BigDecimal.valueOf(0), dateFormat.parse("2017-02-16T00:00:00"))
//        .withLine(java.math.BigDecimal.valueOf(10), java.math.BigDecimal.valueOf(1), "P0000000")
//        .Create()
//
//      assert(transaction.getTotalTax().equals(new java.math.BigDecimal("0.87")))
//    }
    "throws an AvaTaxClientException with an ErrorResult containing the errors" in { accountInfo =>
      val dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
      assertThrows[AvaTaxClientException](new TransactionBuilder(client.withSecurity(accountInfo.username, accountInfo.password), "DEFAULT", DocumentType.SalesOrder, "1")
        .withAddress(TransactionAddressType.ShipTo, "!@#$ADFADSF100 ravine ln ne", "", "", "Bainb!@#$ADFADS", "WA", "ee981101", "US")
        .withAddress(TransactionAddressType.ShipFrom, "100 RAVINE LN", "", "", "BAINBRIDGE ISLAND", "WA", "98110", "US")
        .withAddress(TransactionAddressType.PointOfOrderAcceptance, "!@#$ADFADSF100 RAVINE LN", "", "", "B!@#$ADFADSFs", "WA", "e1122307", "US")
        .withCode("DOCCODE")
        .withDate(dateFormat.parse("2017-03-02T10:40:18"))
        .withTaxOverride(TaxOverrideType.TaxDate, "TaxDate", java.math.BigDecimal.valueOf(0), dateFormat.parse("2017-02-16T00:00:00"))
        .withLine(java.math.BigDecimal.valueOf(10), java.math.BigDecimal.valueOf(1), "P0000000")
        .Create)
      assert((try {
        new TransactionBuilder(client.withSecurity(accountInfo.username, accountInfo.password), "DEFAULT", DocumentType.SalesOrder, "1")
          .withAddress(TransactionAddressType.ShipTo, "!@#$ADFADSF100 ravine ln ne", "", "", "Bainb!@#$ADFADS", "WA", "ee981101", "US")
          .withAddress(TransactionAddressType.ShipFrom, "100 RAVINE LN", "", "", "BAINBRIDGE ISLAND", "WA", "98110", "US")
          .withAddress(TransactionAddressType.PointOfOrderAcceptance, "!@#$ADFADSF100 RAVINE LN", "", "", "B!@#$ADFADSFs", "WA", "e1122307", "US")
          .withCode("DOCCODE")
          .withDate(dateFormat.parse("2017-03-02T10:40:18"))
          .withTaxOverride(TaxOverrideType.TaxDate, "TaxDate", java.math.BigDecimal.valueOf(0), dateFormat.parse("2017-02-16T00:00:00"))
          .withLine(java.math.BigDecimal.valueOf(10), java.math.BigDecimal.valueOf(1), "P0000000")
          .Create

        new AvaTaxClientException("This never gets called")
      } catch {
        case ex: AvaTaxClientException ⇒ ex
      }).getErroneousRequest.isInstanceOf[CreateTransactionModel])
    }
    "successfully ping (case-insensitive)" in { accountInfo =>
      val pong = client
        .withSecurity(accountInfo.username, accountInfo.password)
        .ping()

      val actual   = pong.getAuthenticatedUserName.toLowerCase
      val expected = accountInfo.username.toLowerCase

      assert(
        actual == expected,
        s"Expected user name ‘$expected’ but got ‘$actual’"
      )
    }
    "update a company" in { accountInfo =>
      import org.scalatest.Matchers._

      noException should be thrownBy {
        val cli = client.withSecurity(accountInfo.username, accountInfo.password)
        val companies = cli.queryCompanies(null, null, 10, 0, null)

        for (company <- companies.getValue.asScala) {
          if (!company.getIsDefault) {
            if (company.getTaxpayerIdNumber != null && !company.getTaxpayerIdNumber.isEmpty && company.getDefaultCountry != null && !company.getDefaultCountry.isEmpty) {
              cli.updateCompany(company.getId, company)
            }
          }
        }
      }
    }

//    "can successfully initiate exportdocumentline" in { accountInfo =>
//      val client = new AvaTaxClient("Test", "1.0", "Test", AvaTaxEnvironment.Sandbox)
//        .withSecurity(accountInfo.username, accountInfo.password)
//      val exportDocumentLineModel = new ExportDocumentLineModel();
//      exportDocumentLineModel.setFormat(ReportFormat.CSV);
//      exportDocumentLineModel.setStartDate(Date.from(OffsetDateTime.parse("2025-03-10T00:00:00+00:00").toInstant()))
//      exportDocumentLineModel.setEndDate(Date.from(OffsetDateTime.parse("2025-04-10T00:00:00+00:00").toInstant()))
//      exportDocumentLineModel.setCountry("US");
//      exportDocumentLineModel.setState("All");
//      exportDocumentLineModel.setDateFilter(ReportDateFilter.DocumentDate);
//      exportDocumentLineModel.setDocType(ReportDocType.Sales)
//      exportDocumentLineModel.setCurrencyCode("USD")
//      exportDocumentLineModel.setNumberOfPartitions(10)
//      exportDocumentLineModel.setPartition(0)
//      exportDocumentLineModel.setIsLocked(true)
//      exportDocumentLineModel.setMerchantSellerIdentifier("abc,xyz")
//      exportDocumentLineModel.setDocumentStatus(DocumentStatus.Committed)
//      exportDocumentLineModel.setIsModifiedDateSameAsDocumentDate(false)
//      exportDocumentLineModel.setTaxGroup("Alcohol")
//      exportDocumentLineModel.setTaxName("VAT")
//      exportDocumentLineModel.setTaxCode("123")
//      exportDocumentLineModel.setTaxSubType("Prepared Food and Beverage")
//      exportDocumentLineModel.setReportSource(ReportSource.RETURNSAPI)
//
//      // Configure liability parameters model and attach it to the export document line model
//      val liabilityParameters = new LiabilityParametersModel()
//      liabilityParameters.setLiabilityType(ReturnsLiabilityType.ALL)
//      liabilityParameters.setReturnsReportType(ReturnsReportType.LIABILITYSUMMARYRETURNDETAIL)
//      liabilityParameters.setYear(2024)
//      liabilityParameters.setMonth(4)
//      exportDocumentLineModel.setLiabilityParameters(liabilityParameters)
//
//      // Set additional options
//      exportDocumentLineModel.setCompression(Compression.NONE)
//      exportDocumentLineModel.setIncludeDocumentLineDetails(false)
//      exportDocumentLineModel.setIncludeMultiTaxLineDetails(false)
//
//      // Initiate the asynchronous export report and verify the response using ScalaTest's whenReady
//      val result = client.initiateExportDocumentLineReport(7909134, exportDocumentLineModel)
//      println(s"Export initiated successfully: $result")
//    }

    "cleanly shut down when using close()" in { accountInfo =>
      val client = new AvaTaxClient("Test", "1.0", "Test", AvaTaxEnvironment.Sandbox)
        .withSecurity(accountInfo.username, accountInfo.password)

      noException should be thrownBy {
        client.close()
      }
    }

  }
}
