object TemplateConstants {
  val APIClassTemplate =
    """package net.avalara.avatax.rest.client;
      |
      |import com.fasterxml.jackson.core.type.TypeReference;
      |import net.avalara.avatax.rest.client.models.*;
      |import net.avalara.avatax.rest.client.enums.*;
      |
      |import org.apache.commons.codec.binary.Base64;
      |
      |import java.math.BigDecimal;
      |import java.util.Date;
      |import java.util.HashMap;
      |import java.util.concurrent.ExecutorService;
      |import java.util.concurrent.Executors;
      |import java.util.concurrent.Future;
      |import java.util.ArrayList;
      |
      |public class AvaTaxClient {
      |
      |    private final ExecutorService threadPool;
      |    private RestCallFactory restCallFactory;
      |
      |    private AvaTaxClient() {
      |        this(null);
      |    }
      |
      |    private AvaTaxClient(ExecutorService threadPool) {
      |        if (threadPool != null) {
      |            this.threadPool = threadPool;
      |        } else {
      |            this.threadPool = Executors.newFixedThreadPool(3);
      |        }
      |    }
      |
      |    public AvaTaxClient(String appName, String appVersion, String machineName, AvaTaxEnvironment environment) {
      |        this(appName, appVersion, machineName, environment == AvaTaxEnvironment.Production ? AvaTaxConstants.Production_Url : AvaTaxConstants.Sandbox_Url);
      |    }
      |
      |    public AvaTaxClient(String appName, String appVersion, String machineName, String environmentUrl) {
      |        this();
      |        this.restCallFactory = new RestCallFactory(appName, appVersion, machineName, environmentUrl);
      |    }
      |
      |    public AvaTaxClient(String appName, String appVersion, String machineName, AvaTaxEnvironment environment, String proxyHost, int proxyPort, String proxySchema) {
      |        this(appName, appVersion, machineName, environment == AvaTaxEnvironment.Production ? AvaTaxConstants.Production_Url : AvaTaxConstants.Sandbox_Url, proxyHost, proxyPort, proxySchema);
      |    }
      |
      |    public AvaTaxClient(String appName, String appVersion, String machineName, String environmentUrl, String proxyHost, int proxyPort, String proxySchema) {
      |        this();
      |        this.restCallFactory = new RestCallFactory(appName, appVersion, machineName, environmentUrl, proxyHost, proxyPort, proxySchema);
      |    }
      |
      |
      |    public AvaTaxClient withSecurity(String securityHeader) {
      |        this.restCallFactory.addSecurityHeader(securityHeader);
      |
      |        return this;
      |    }
      |
      |    public AvaTaxClient withSecurity(String username, String password) {
      |        String header = null;
      |
      |        try {
      |            header = Base64.encodeBase64String((username + ":" + password).getBytes("utf-8"));
      |        } catch (java.io.UnsupportedEncodingException ex) {
      |            System.out.println("Could not find encoding for UTF-8.");
      |            ex.printStackTrace();
      |        }
      |
      |        return withSecurity(header);
      |    }
      |
      |
      |@@APILIST@@
      |}
    """.stripMargin
  val APIClassMethodTemplate =
    """    /**
      |     * @@COMMENT@@
      |     */
      |    public Future<@@TYPENAME@@> @@APINAME@@Async(@@PARAMS@@) {
      |        AvaTaxPath path = new AvaTaxPath("@@URI@@");@@PARAMBUILDER@@
      |        return this.threadPool.submit((RestCall<@@TYPENAME@@>)restCallFactory.createRestCall("@@HTTPVERB@@", path, @@PAYLOAD@@, new TypeReference<@@TYPENAME@@>(){}));
      |    }
      |
      |    public @@TYPENAME@@ @@APINAME@@(@@PARAMS@@) throws Exception {
      |        AvaTaxPath path = new AvaTaxPath("@@URI@@");@@PARAMBUILDER@@
      |        return ((RestCall<@@TYPENAME@@>)restCallFactory.createRestCall("@@HTTPVERB@@", path, @@PAYLOAD@@, new TypeReference<@@TYPENAME@@>(){})).call();
      |    }
    """.stripMargin

  val EnumClassTemplate =
    """package net.avalara.avatax.rest.client.enums;
      |
      |/**
      | * @@COMMENT@@
      | */
      |public enum @@ENUMCLASS@@ {
      |@@VALUELIST@@
      |}
    """.stripMargin

  val EnumValueTemplate =
    """    /**
      |     * @@COMMENT@@
      |     */
      |    @@VALUE@@,
    """.stripMargin

  val ModelClassTemplate =
    """package net.avalara.avatax.rest.client.models;
      |
      |import net.avalara.avatax.rest.client.enums.*;
      |import net.avalara.avatax.rest.client.serializer.JsonSerializer;
      |
      |import java.lang.Override;
      |import java.math.BigDecimal;
      |import java.util.ArrayList;
      |import java.util.Date;
      |import java.util.HashMap;
      |
      |/**
      | * @@COMMENT@@
      | */
      |public class @@MODELCLASS@@ {
      |@@PROPERTYLIST@@
      |
      |    /**
      |     * Returns a JSON string representation of @@MODELCLASS@@.
      |     */
      |    @Override
      |    public String toString() {
      |        return JsonSerializer.SerializeObject(this);
      |    }
      |}
    """.stripMargin

  val ModelPropertyTemplate =
    """    private @@PROPERTYTYPE@@ @@PROPERTYNAME@@;
      |
      |    /**
      |     * Getter for @@PROPERTYNAME@@ - @@COMMENT@@
      |     */
      |    public @@PROPERTYTYPE@@ get@@UPPERPROPERTYNAME@@() {
      |        return this.@@PROPERTYNAME@@;
      |    }
      |
      |    /**
      |     * Setter for @@PROPERTYNAME@@ - @@COMMENT@@
      |     */
      |    public void set@@UPPERPROPERTYNAME@@(@@PROPERTYTYPE@@ @@PROPERTYNAME@@) {
      |        this.@@PROPERTYNAME@@ = @@PROPERTYNAME@@;
      |    }
      |
    """.stripMargin
}