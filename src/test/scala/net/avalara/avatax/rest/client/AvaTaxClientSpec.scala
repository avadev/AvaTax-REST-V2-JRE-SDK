package net.avalara.avatax.rest.client

import net.avalara.avatax.rest.client.enums.{AccountStatusId, AvaTaxEnvironment, DocumentType, TransactionAddressType}
import net.avalara.avatax.rest.client.models.{AddressInfo, CreateTransactionModel}
import org.scalatest.fixture

import scala.collection.JavaConverters._

class AvaTaxClientSpec extends fixture.FreeSpec {
  case class AccountInfo(username: String, password: String, accountId: Int, accountName: String)
  type FixtureParam = AccountInfo

  def withFixture(test: OneArgTest) = {
    val user: String = test.configMap.getRequired[String]("username")
    val password: String = test.configMap.getRequired[String]("password")
    val accountId: Int = test.configMap.getRequired[String]("accountid").toInt
    val accountName: String = test.configMap.getRequired[String]("accountname")

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
      val info = new AddressInfo()
      info.setLine1("100 ravine ln ne")
      info.setCity("Bainbridge Island")
      info.setRegion("WA")
      info.setPostalCode("98110")
      info.setCountry("US")
      val address = client.withSecurity(accountInfo.username, accountInfo.password).resolveAddress(info)
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
      val taxCodes = client.withSecurity(accountInfo.username, accountInfo.password).queryTaxCodes("", 1, 0, "taxCode DESC").getValue.asScala
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
    "succesfully ping" in { accountInfo =>
      val pong = client.withSecurity(accountInfo.username, accountInfo.password).ping()
      assert(pong.getAuthenticatedUserName == accountInfo.username)
    }
  }
}
