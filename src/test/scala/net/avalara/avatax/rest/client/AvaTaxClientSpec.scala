package net.avalara.avatax.rest.client

import net.avalara.avatax.rest.client.enums._
import net.avalara.avatax.rest.client.models.{AddressInfo, CreateTransactionModel}
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
    var client = new AvaTaxClient("Test", "1.0", "Test", AvaTaxEnvironment.Production)

    "successfully fetch an account" in { accountInfo =>
      val account = client.withSecurity(accountInfo.username, accountInfo.password).getAccount(accountInfo.accountId, "")
      assert(account.getAccountStatusId() == AccountStatusId.Test)
      assert(account.getName() == accountInfo.accountName)
      assert(account.getModifiedDate() != null)
      assert(account.getId() == accountInfo.accountId)
      assert(account.getEffectiveDate() != null)
      assert(account.getCreatedDate() != null)
    }
    "successfully validate an address" in { accountInfo =>
      val address = client.withSecurity(accountInfo.username, accountInfo.password).resolveAddress("100 ravine ln ne", "", "", "Bainbridge Island", "WA", "98110", "US", TextCase.Upper, null, null)
      assert(address.getValidatedAddresses.get(0).getLine1 == "100 RAVINE LN NE")
      assert(address.getValidatedAddresses.get(0).getCity == "BAINBRIDGE ISLAND")
      assert(address.getValidatedAddresses.get(0).getRegion == "WA")
      assert(address.getValidatedAddresses.get(0).getPostalCode == "98110-2687")
      assert(address.getValidatedAddresses.get(0).getCountry == "US")
    }
    "return the complete list of countries" in { accountInfo =>
      val countries = client.withSecurity(accountInfo.username, accountInfo.password).listCountries().getValue.asScala
      assert(countries.length == 253)
    }
    "return a nexus by its address" in { accountInfo =>
      val nexusModel = client.withSecurity(accountInfo.username, accountInfo.password).listNexusByAddress("100 ravine ln ne", "", "", "Bainbridge Island", "WA", "98110", "US").getValue.asScala
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
        .withLine(java.math.BigDecimal.valueOf(1000), java.math.BigDecimal.ONE, "P0000000")
        .Create()

      assert(transaction.getTotalTax.equals(java.math.BigDecimal.valueOf(0f)))
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

      assert(transaction.getTotalTax().equals(java.math.BigDecimal.valueOf(0f)))
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
  }
}
