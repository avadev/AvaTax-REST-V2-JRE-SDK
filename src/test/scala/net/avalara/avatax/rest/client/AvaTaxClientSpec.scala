package net.avalara.avatax.rest.client

import java.util

import net.avalara.avatax.rest.client.enums._
import net.avalara.avatax.rest.client.models._
import org.scalatest.fixture

import scala.collection.JavaConverters._

class AvaTaxClientSpec extends fixture.FreeSpec {
  case class AccountInfo(username: String, password: String, accountId: Int, accountName: String)
  type FixtureParam = AccountInfo

  def withFixture(test: OneArgTest) = {
    val user: String = sys.env("USERNAME")
    val password: String = sys.env("PASSWORD")
    val accountId: Int = sys.env("ACCOUNTID").toInt
    val accountName: String = sys.env("ACCOUNTNAME")

    withFixture(test.toNoArgTest(AccountInfo(user, password, accountId, accountName)))
  }

  "AvaTaxClient should" - {
    var client = new AvaTaxClient("Test", "1.0", "Test", AvaTaxEnvironment.Sandbox)

    "successfully fetch an account" in { accountInfo =>
      val account = client.withSecurity(accountInfo.username, accountInfo.password).getAccount(accountInfo.accountId, "")
      assert(account.getAccountStatusId() == AccountStatusId.Active)
      assert(account.getName() == accountInfo.accountName)
      assert(account.getModifiedDate() != null)
      assert(account.getId() == accountInfo.accountId)
      assert(account.getEffectiveDate() != null)
      assert(account.getCreatedDate() != null)
    }
    "successfully validate an address" in { accountInfo =>
      val address = client.withSecurity(accountInfo.username, accountInfo.password).resolveAddress("100 ravine ln ne", "", "", "Bainbridge Island", "WA", "98110", "US", TextCase.Upper)
      assert(address.getValidatedAddresses.get(0).getLine1 == "100 RAVINE LN NE")
      assert(address.getValidatedAddresses.get(0).getCity == "BAINBRIDGE ISLAND")
      assert(address.getValidatedAddresses.get(0).getRegion == "WA")
      assert(address.getValidatedAddresses.get(0).getPostalCode == "98110-2687")
      assert(address.getValidatedAddresses.get(0).getCountry == "US")
    }
    "return the complete list of countries" in { accountInfo =>
      val countries = client.withSecurity(accountInfo.username, accountInfo.password).listCountries("", 0, 0, "").getValue.asScala
      assert(countries.length == 251)
    }
    "return a nexus by its address" in { accountInfo =>
      val nexusModel = client.withSecurity(accountInfo.username, accountInfo.password).listNexusByAddress("100 ravine ln ne", "", "", "Bainbridge Island", "WA", "98110", "US", "", 0, 0, "").getValue.asScala
      assert(nexusModel.nonEmpty)
    }
    "return a tax code" in { accountInfo =>
      val taxCodes = client.withSecurity(accountInfo.username, accountInfo.password).queryTaxCodes("", "", 1, 0, "taxCode DESC").getValue.asScala
      assert(taxCodes.head.getTaxCode.equals("TXINCL"))
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
    "create a transaction with an overridden tax date" in { accountInfo =>
      val dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
      val transaction = new TransactionBuilder(client.withSecurity(accountInfo.username, accountInfo.password), "DEFAULT", DocumentType.SalesOrder, "1")
        .withAddress(TransactionAddressType.ShipTo, "100 RAVINE LN", "", "", "BAINBRIDGE ISLAND", "WA", "98110", "US")
        .withAddress(TransactionAddressType.ShipFrom, "100 RAVINE LN", "", "", "BAINBRIDGE ISLAND", "WA", "98110", "US")
        .withAddress(TransactionAddressType.PointOfOrderAcceptance, "100 RAVINE LN", "", "", "BAINBRIDGE ISLAND", "WA", "98110", "US")
        .withCode("DOCCODE")
        .withDate(dateFormat.parse("2017-03-02T10:40:18"))
        .withTaxOverride(TaxOverrideType.TaxDate, "TaxDate", java.math.BigDecimal.valueOf(0), dateFormat.parse("2017-02-16T00:00:00"))
        .withLine(java.math.BigDecimal.valueOf(10), java.math.BigDecimal.valueOf(1), "P0000000")
        .Create()

      assert(transaction.getTotalTax().equals(new java.math.BigDecimal("0.87")))
    }
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
    "succesfully ping" in { accountInfo =>
      val pong = client.withSecurity(accountInfo.username, accountInfo.password).ping()
      assert(pong.getAuthenticatedUserName == accountInfo.username)
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
  }
}
