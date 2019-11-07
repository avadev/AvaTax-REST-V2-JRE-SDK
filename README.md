# AvaTax-REST-V2-JRE-SDK
This GitHub repository is the Java Runtime Environment SDK for Avalara's world-class tax service, AvaTax. It uses the AvaTax REST v2 API, which is a fully REST implementation and provides a single client for all AvaTax functionality. For more information about AvaTax REST v2, please visit [Avalara's Developer Network](https://developer.avalara.com) or view the [online Swagger documentation](https://sandbox-rest.avatax.com/swagger/ui/index.html).

# Build Status

Maven Central

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.avalara.avatax/avatax-rest-v2-api-java_2.11/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.avalara.avatax/avatax-rest-v2-api-java_2.11)

Travis-CI

[![Travis](https://api.travis-ci.org/avadev/AvaTax-REST-V2-JRE-SDK.svg?branch=master&style=plastic)](https://travis-ci.org/avadev/AvaTax-REST-V2-JRE-SDK)

# Installing the JRE SDK

The AvaTax JRE SDK is available for download on [Maven](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22net.avalara.avatax%22).

For the AvaTax JRE SDK, there are four different files available to download:
* **pom** : This Project Object Model is an XML file that contains information about the project and configuration details used by Maven to build the project. This file is not needed in order to run the AvaTax JRE SDK. 
* **jar** : This is what file you will use to import into your project in order to access AvaTax. This file is needed in order to run the AvaTax JRE SDK. 
* **javadoc.jar** : This file is documentation generated from the source code in the jar file. This file is not needed in order to run the AvaTax JRE SDK.
* **sources.jar** : This file contains the source code for the jar file. This file is not needed in order to run the AvaTax JRE SDK, but it is helpful to use in order to view the code within the jar file in the editor. In order to view the code, download this file and attach it as a source to the jar file. 

Once you have the jar file downloaded, import it into your editor as an external jar file. 

# Using the JRE SDK

The JRE SDK uses a fluent interface to define a connection to AvaTax and to make API calls to calculate tax on transactions. Here's an example of how to connect to AvaTax in Java:

```java
import java.math.BigDecimal;
import net.avalara.avatax.rest.client.AvaTaxClient;
import net.avalara.avatax.rest.client.TransactionBuilder;
import net.avalara.avatax.rest.client.enums.AvaTaxEnvironment;
import net.avalara.avatax.rest.client.enums.DocumentType;
import net.avalara.avatax.rest.client.enums.TransactionAddressType;
import net.avalara.avatax.rest.client.models.PingResultModel;
import net.avalara.avatax.rest.client.models.TransactionModel;

public class Program {
	public static void main(String[] args) {
		//creates our AvaTaxClient
		AvaTaxClient client = new AvaTaxClient("Test", "1.0", "localhost", AvaTaxEnvironment.Sandbox)
				.withSecurity("MyUsername", "MyPassword"); //replace with your username and password
		
		try {
			//verify that we can ping successfully
			PingResultModel ping = client.ping();
			if(ping.getAuthenticated()) {
				System.out.print("Successfully created a client!");
			}
		} catch (Exception e) {}		
		
		//builds the Transaction and creates the TransactionModel
		try {
			TransactionModel transaction = new TransactionBuilder(client, "DEFAULT", DocumentType.SalesInvoice, "ABC")
			.withAddress(TransactionAddressType.SingleLocation, "123 Main Street", null, null, "Irvine", "CA", "92615", "US")
			.withLine( new BigDecimal(100.0), new BigDecimal(1), "P0000000")
            .Create();
		} catch (Exception e) {}
		
	}

}
```
# Updates

Two functions have been updated in 19.9.1

```java
	downloadTaxRatesByZipCodeAsync(Date date, String region)
	downloadTaxRatesByZipCodeAsync(Date date, String region)
```
have been changed to 
```java
	downloadTaxRatesByZipCodeAsync(String date, String region)
	downloadTaxRatesByZipCodeAsync(String date, String region)
```