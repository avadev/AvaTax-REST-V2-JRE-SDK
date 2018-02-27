package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;
import net.avalara.avatax.rest.client.models.*;
import net.avalara.avatax.rest.client.enums.*;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.impl.client.HttpClientBuilder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */
 
public class AvaTaxClient {

    private final ExecutorService threadPool;
    private RestCallFactory restCallFactory;

    private AvaTaxClient() {
        this(null);
    }

    private AvaTaxClient(ExecutorService threadPool) {
        if (threadPool != null) {
            this.threadPool = threadPool;
        } else {
            this.threadPool = Executors.newFixedThreadPool(3);
        }
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, AvaTaxEnvironment environment) {
        this(appName, appVersion, machineName, environment, null);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, String environmentUrl) {
        this();
        this.restCallFactory = new RestCallFactory(appName, appVersion, machineName, environmentUrl);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, AvaTaxEnvironment environment, String proxyHost, int proxyPort, String proxySchema) {
        this(appName, appVersion, machineName, environment, proxyHost, proxyPort, proxySchema, null);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, String environmentUrl, String proxyHost, int proxyPort, String proxySchema) {
        this();
        this.restCallFactory = new RestCallFactory(appName, appVersion, machineName, environmentUrl, proxyHost, proxyPort, proxySchema);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, AvaTaxEnvironment environment, ExecutorService threadPool) {
        this(appName, appVersion, machineName, environment == AvaTaxEnvironment.Production ? AvaTaxConstants.Production_Url : AvaTaxConstants.Sandbox_Url, threadPool);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, AvaTaxEnvironment environment, ExecutorService threadPool, HttpClientBuilder httpClientBuilder) {
        this(appName, appVersion, machineName, environment == AvaTaxEnvironment.Production ? AvaTaxConstants.Production_Url : AvaTaxConstants.Sandbox_Url, threadPool, httpClientBuilder);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, String environmentUrl, ExecutorService threadPool) {
        this(threadPool);
        this.restCallFactory = new RestCallFactory(appName, appVersion, machineName, environmentUrl);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, String environmentUrl, ExecutorService threadPool, HttpClientBuilder httpClientBuilder) {
        this(threadPool);
        this.restCallFactory = new RestCallFactory(appName, appVersion, machineName, environmentUrl, httpClientBuilder);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, AvaTaxEnvironment environment, String proxyHost, int proxyPort, String proxySchema, ExecutorService threadPool) {
        this(appName, appVersion, machineName, environment == AvaTaxEnvironment.Production ? AvaTaxConstants.Production_Url : AvaTaxConstants.Sandbox_Url, proxyHost, proxyPort, proxySchema, threadPool);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, String environmentUrl, String proxyHost, int proxyPort, String proxySchema, ExecutorService threadPool) {
        this(threadPool);
        this.restCallFactory = new RestCallFactory(appName, appVersion, machineName, environmentUrl, proxyHost, proxyPort, proxySchema);
    }

    public AvaTaxClient withSecurity(String securityHeader) {
        this.restCallFactory.addSecurityHeader(securityHeader);

        return this;
    }

    public AvaTaxClient withSecurity(String username, String password) {
        String header = null;

        try {
            header = Base64.encodeBase64String((username + ":" + password).getBytes("utf-8"));
        } catch (java.io.UnsupportedEncodingException ex) {
            System.out.println("Could not find encoding for UTF-8.");
            ex.printStackTrace();
        }

        return withSecurity(header);
    }


//region Methods
    /**
     * Reset this account's license key
     * 
     * Resets the existing license key for this account to a new key.
     * 
     * To reset your account, you must specify the ID of the account you wish to reset and confirm the action.
     * 
     * This API is only available to account administrators for the account in question, and may only be called after
     * an account has been activated by reading and accepting Avalara's terms and conditions.  To activate your account
     * please log onto the AvaTax website or call the `ActivateAccount` API.
     * 
     * Resetting a license key cannot be undone.  Any previous license keys will immediately cease to work when a new key is created.
     * 
     * When you call this API, all account administrators for this account will receive an email with the newly updated license key.
     * 
     * @param id The ID of the account you wish to update.
     * @param model A request confirming that you wish to reset the license key of this account.
     * @return LicenseKeyModel
     */
    public LicenseKeyModel accountResetLicenseKey(Integer id, ResetLicenseKeyModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/resetlicensekey");
        path.applyField("id", id);
        return ((RestCall<LicenseKeyModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<LicenseKeyModel>(){})).call();
    }

    /**
     * Reset this account's license key
     * 
     * Resets the existing license key for this account to a new key.
     * 
     * To reset your account, you must specify the ID of the account you wish to reset and confirm the action.
     * 
     * This API is only available to account administrators for the account in question, and may only be called after
     * an account has been activated by reading and accepting Avalara's terms and conditions.  To activate your account
     * please log onto the AvaTax website or call the `ActivateAccount` API.
     * 
     * Resetting a license key cannot be undone.  Any previous license keys will immediately cease to work when a new key is created.
     * 
     * When you call this API, all account administrators for this account will receive an email with the newly updated license key.
     * 
     * @param id The ID of the account you wish to update.
     * @param model A request confirming that you wish to reset the license key of this account.
     * @return LicenseKeyModel
     */
    public Future<LicenseKeyModel> accountResetLicenseKeyAsync(Integer id, ResetLicenseKeyModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/resetlicensekey");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<LicenseKeyModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<LicenseKeyModel>(){}));
    }

    /**
     * Activate an account by accepting terms and conditions
     * 
     * Activate the account specified by the unique accountId number.
     * 
     * This activation request can only be called by account administrators.  You must indicate 
     * that you have read and accepted Avalara's terms and conditions to call this API.
     * 
     * Once you have activated your account, use the `AccountResetLicenseKey` API to generate
     * a license key for your account.
     * 
     * If you have not read or accepted the terms and conditions, this API call will return the
     * 
     * @param id The ID of the account to activate
     * @param include Elements to include when fetching the account
     * @param model The activation request
     * @return AccountModel
     */
    public AccountModel activateAccount(Integer id, String include, ActivateAccountModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/activate");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AccountModel>(){})).call();
    }

    /**
     * Activate an account by accepting terms and conditions
     * 
     * Activate the account specified by the unique accountId number.
     * 
     * This activation request can only be called by account administrators.  You must indicate 
     * that you have read and accepted Avalara's terms and conditions to call this API.
     * 
     * Once you have activated your account, use the `AccountResetLicenseKey` API to generate
     * a license key for your account.
     * 
     * If you have not read or accepted the terms and conditions, this API call will return the
     * 
     * @param id The ID of the account to activate
     * @param include Elements to include when fetching the account
     * @param model The activation request
     * @return AccountModel
     */
    public Future<AccountModel> activateAccountAsync(Integer id, String include, ActivateAccountModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/activate");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<AccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AccountModel>(){}));
    }

    /**
     * Retrieve a single account
     * 
     * Get the account object identified by this URL.
     * You may use the '$include' parameter to fetch additional nested data:
     * 
     * * Subscriptions
     * 
     * @param id The ID of the account to retrieve
     * @param include A comma separated list of special fetch options
     * @return AccountModel
     */
    public AccountModel getAccount(Integer id, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AccountModel>(){})).call();
    }

    /**
     * Retrieve a single account
     * 
     * Get the account object identified by this URL.
     * You may use the '$include' parameter to fetch additional nested data:
     * 
     * * Subscriptions
     * 
     * @param id The ID of the account to retrieve
     * @param include A comma separated list of special fetch options
     * @return AccountModel
     */
    public Future<AccountModel> getAccountAsync(Integer id, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<AccountModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AccountModel>(){}));
    }

    /**
     * Get configuration settings for this account
     * 
     * Retrieve a list of all configuration settings tied to this account.
     * 
     * Configuration settings provide you with the ability to control features of your account and of your
     * tax software.  The category names `TaxServiceConfig` and `AddressServiceConfig` are reserved for
     * Avalara internal software configuration values; to store your own account-level settings, please
     * create a new category name that begins with `X-`, for example, `X-MyCustomCategory`.
     * 
     * Account settings are permanent settings that cannot be deleted.  You can set the value of an
     * account setting to null if desired.
     * 
     * Avalara-based account settings for `TaxServiceConfig` and `AddressServiceConfig` affect your account's
     * 
     * @param id 
     * @return ArrayList<AccountConfigurationModel>
     */
    public ArrayList<AccountConfigurationModel> getAccountConfiguration(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.applyField("id", id);
        return ((RestCall<ArrayList<AccountConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<AccountConfigurationModel>>(){})).call();
    }

    /**
     * Get configuration settings for this account
     * 
     * Retrieve a list of all configuration settings tied to this account.
     * 
     * Configuration settings provide you with the ability to control features of your account and of your
     * tax software.  The category names `TaxServiceConfig` and `AddressServiceConfig` are reserved for
     * Avalara internal software configuration values; to store your own account-level settings, please
     * create a new category name that begins with `X-`, for example, `X-MyCustomCategory`.
     * 
     * Account settings are permanent settings that cannot be deleted.  You can set the value of an
     * account setting to null if desired.
     * 
     * Avalara-based account settings for `TaxServiceConfig` and `AddressServiceConfig` affect your account's
     * 
     * @param id 
     * @return ArrayList<AccountConfigurationModel>
     */
    public Future<ArrayList<AccountConfigurationModel>> getAccountConfigurationAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<AccountConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<AccountConfigurationModel>>(){}));
    }

    /**
     * Change configuration settings for this account
     * 
     * Update configuration settings tied to this account.
     * 
     * Configuration settings provide you with the ability to control features of your account and of your
     * tax software.  The category names `TaxServiceConfig` and `AddressServiceConfig` are reserved for
     * Avalara internal software configuration values; to store your own account-level settings, please
     * create a new category name that begins with `X-`, for example, `X-MyCustomCategory`.
     * 
     * Account settings are permanent settings that cannot be deleted.  You can set the value of an
     * account setting to null if desired.
     * 
     * Avalara-based account settings for `TaxServiceConfig` and `AddressServiceConfig` affect your account's
     * 
     * @param id 
     * @param model 
     * @return ArrayList<AccountConfigurationModel>
     */
    public ArrayList<AccountConfigurationModel> setAccountConfiguration(Integer id, ArrayList<AccountConfigurationModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.applyField("id", id);
        return ((RestCall<ArrayList<AccountConfigurationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<AccountConfigurationModel>>(){})).call();
    }

    /**
     * Change configuration settings for this account
     * 
     * Update configuration settings tied to this account.
     * 
     * Configuration settings provide you with the ability to control features of your account and of your
     * tax software.  The category names `TaxServiceConfig` and `AddressServiceConfig` are reserved for
     * Avalara internal software configuration values; to store your own account-level settings, please
     * create a new category name that begins with `X-`, for example, `X-MyCustomCategory`.
     * 
     * Account settings are permanent settings that cannot be deleted.  You can set the value of an
     * account setting to null if desired.
     * 
     * Avalara-based account settings for `TaxServiceConfig` and `AddressServiceConfig` affect your account's
     * 
     * @param id 
     * @param model 
     * @return ArrayList<AccountConfigurationModel>
     */
    public Future<ArrayList<AccountConfigurationModel>> setAccountConfigurationAsync(Integer id, ArrayList<AccountConfigurationModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<AccountConfigurationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<AccountConfigurationModel>>(){}));
    }

    /**
     * Retrieve geolocation information for a specified address
     * 
     * Resolve an address against Avalara's address-validation system.  If the address can be resolved, this API 
     * provides the latitude and longitude of the resolved location.  The value 'resolutionQuality' can be used 
     * to identify how closely this address can be located.  If the address cannot be clearly located, use the 
     * 'messages' structure to learn more about problems with this address.
     * This is the same API as the POST /api/v2/addresses/resolve endpoint.
     * 
     * @param line1 Line 1
     * @param line2 Line 2
     * @param line3 Line 3
     * @param city City
     * @param region State / Province / Region
     * @param postalCode Postal Code / Zip Code
     * @param country Two character ISO 3166 Country Code (see /api/v2/definitions/countries for a full list)
     * @param textCase selectable text case for address validation (See TextCase::* for a list of allowable values)
     * @param latitude Geospatial latitude measurement
     * @param longitude Geospatial longitude measurement
     * @return AddressResolutionModel
     */
    public AddressResolutionModel resolveAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country, TextCase textCase, BigDecimal latitude, BigDecimal longitude) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        path.addQuery("textCase", textCase);
        path.addQuery("latitude", latitude);
        path.addQuery("longitude", longitude);
        return ((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AddressResolutionModel>(){})).call();
    }

    /**
     * Retrieve geolocation information for a specified address
     * 
     * Resolve an address against Avalara's address-validation system.  If the address can be resolved, this API 
     * provides the latitude and longitude of the resolved location.  The value 'resolutionQuality' can be used 
     * to identify how closely this address can be located.  If the address cannot be clearly located, use the 
     * 'messages' structure to learn more about problems with this address.
     * This is the same API as the POST /api/v2/addresses/resolve endpoint.
     * 
     * @param line1 Line 1
     * @param line2 Line 2
     * @param line3 Line 3
     * @param city City
     * @param region State / Province / Region
     * @param postalCode Postal Code / Zip Code
     * @param country Two character ISO 3166 Country Code (see /api/v2/definitions/countries for a full list)
     * @param textCase selectable text case for address validation (See TextCase::* for a list of allowable values)
     * @param latitude Geospatial latitude measurement
     * @param longitude Geospatial longitude measurement
     * @return AddressResolutionModel
     */
    public Future<AddressResolutionModel> resolveAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country, TextCase textCase, BigDecimal latitude, BigDecimal longitude) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        path.addQuery("textCase", textCase);
        path.addQuery("latitude", latitude);
        path.addQuery("longitude", longitude);
        return this.threadPool.submit((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AddressResolutionModel>(){}));
    }

    /**
     * Retrieve geolocation information for a specified address
     * 
     * Resolve an address against Avalara's address-validation system.  If the address can be resolved, this API 
     * provides the latitude and longitude of the resolved location.  The value 'resolutionQuality' can be used 
     * to identify how closely this address can be located.  If the address cannot be clearly located, use the 
     * 'messages' structure to learn more about problems with this address.
     * This is the same API as the GET /api/v2/addresses/resolve endpoint.
     * 
     * @param model The address to resolve
     * @return AddressResolutionModel
     */
    public AddressResolutionModel resolveAddressPost(AddressValidationInfo model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        return ((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AddressResolutionModel>(){})).call();
    }

    /**
     * Retrieve geolocation information for a specified address
     * 
     * Resolve an address against Avalara's address-validation system.  If the address can be resolved, this API 
     * provides the latitude and longitude of the resolved location.  The value 'resolutionQuality' can be used 
     * to identify how closely this address can be located.  If the address cannot be clearly located, use the 
     * 'messages' structure to learn more about problems with this address.
     * This is the same API as the GET /api/v2/addresses/resolve endpoint.
     * 
     * @param model The address to resolve
     * @return AddressResolutionModel
     */
    public Future<AddressResolutionModel> resolveAddressPostAsync(AddressValidationInfo model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        return this.threadPool.submit((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AddressResolutionModel>(){}));
    }

    /**
     * Create a new batch
     * 
     * Create one or more new batch objects attached to this company.
     * When you create a batch, it is added to the AvaTaxBatch.Batch table and will be processed in the order it was received.
     * You may fetch a batch to check on its status and retrieve the results of the batch operation.
     * 
     * @param companyId The ID of the company that owns this batch.
     * @param model The batch you wish to create.
     * @return ArrayList<BatchModel>
     */
    public ArrayList<BatchModel> createBatches(Integer companyId, ArrayList<BatchModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<BatchModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<BatchModel>>(){})).call();
    }

    /**
     * Create a new batch
     * 
     * Create one or more new batch objects attached to this company.
     * When you create a batch, it is added to the AvaTaxBatch.Batch table and will be processed in the order it was received.
     * You may fetch a batch to check on its status and retrieve the results of the batch operation.
     * 
     * @param companyId The ID of the company that owns this batch.
     * @param model The batch you wish to create.
     * @return ArrayList<BatchModel>
     */
    public Future<ArrayList<BatchModel>> createBatchesAsync(Integer companyId, ArrayList<BatchModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<BatchModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<BatchModel>>(){}));
    }

    /**
     * Delete a single batch
     * 
     * @param companyId The ID of the company that owns this batch.
     * @param id The ID of the batch you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteBatch(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single batch
     * 
     * @param companyId The ID of the company that owns this batch.
     * @param id The ID of the batch you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteBatchAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Download a single batch file
     * 
     * @param companyId The ID of the company that owns this batch
     * @param batchId The ID of the batch object
     * @param id The primary key of this batch file object
     * @return String
     */
    public String downloadBatch(Integer companyId, Integer batchId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{batchId}/files/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("batchId", batchId);
        path.applyField("id", id);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Download a single batch file
     * 
     * @param companyId The ID of the company that owns this batch
     * @param batchId The ID of the batch object
     * @param id The primary key of this batch file object
     * @return String
     */
    public Future<String> downloadBatchAsync(Integer companyId, Integer batchId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{batchId}/files/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("batchId", batchId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Retrieve a single batch
     * 
     * Get the batch object identified by this URL.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * 
     * @param companyId The ID of the company that owns this batch
     * @param id The primary key of this batch
     * @return BatchModel
     */
    public BatchModel getBatch(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<BatchModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<BatchModel>(){})).call();
    }

    /**
     * Retrieve a single batch
     * 
     * Get the batch object identified by this URL.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * 
     * @param companyId The ID of the company that owns this batch
     * @param id The primary key of this batch
     * @return BatchModel
     */
    public Future<BatchModel> getBatchAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<BatchModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<BatchModel>(){}));
    }

    /**
     * Retrieve all batches for this company
     * 
     * List all batch objects attached to the specified company.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * You may fetch a batch to check on its status and retrieve the results of the batch operation.
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these batches
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<BatchModel>
     */
    public FetchResult<BatchModel> listBatchesByCompany(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
    }

    /**
     * Retrieve all batches for this company
     * 
     * List all batch objects attached to the specified company.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * You may fetch a batch to check on its status and retrieve the results of the batch operation.
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these batches
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<BatchModel>
     */
    public Future<FetchResult<BatchModel>> listBatchesByCompanyAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){}));
    }

    /**
     * Retrieve all batches
     * 
     * Get multiple batch objects across all companies.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * You may fetch a batch to check on its status and retrieve the results of the batch operation.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<BatchModel>
     */
    public FetchResult<BatchModel> queryBatches(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/batches");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
    }

    /**
     * Retrieve all batches
     * 
     * Get multiple batch objects across all companies.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * You may fetch a batch to check on its status and retrieve the results of the batch operation.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<BatchModel>
     */
    public Future<FetchResult<BatchModel>> queryBatchesAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/batches");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){}));
    }

    /**
     * Create a CertExpress invitation
     * 
     * Creates an invitation for a customer to self-report certificates using the CertExpress website.
     * 
     * This invitation is delivered by your choice of method, or you can present a hyperlink to the user
     * directly in your connector.  Your customer will be redirected to https://app.certexpress.com/ where
     * they can follow a step-by-step guide to enter information about their exemption certificates.  The
     * certificates entered will be recorded and automatically linked to their customer record.
     * 
     * The [CertExpress website](https://app.certexpress.com/home) is available for customers to use at any time.
     * Using CertExpress with this API will ensure that your certificates are automatically linked correctly into
     * your company so that they can be used for tax exemptions.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that will record certificates
     * @param customerCode The number of the customer where the request is sent to
     * @param model the requests to send out to customers
     * @return ArrayList<CertExpressInvitationStatusModel>
     */
    public ArrayList<CertExpressInvitationStatusModel> createCertExpressInvitation(Integer companyId, String customerCode, ArrayList<CreateCertExpressInvitationModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certexpressinvites");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return ((RestCall<ArrayList<CertExpressInvitationStatusModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CertExpressInvitationStatusModel>>(){})).call();
    }

    /**
     * Create a CertExpress invitation
     * 
     * Creates an invitation for a customer to self-report certificates using the CertExpress website.
     * 
     * This invitation is delivered by your choice of method, or you can present a hyperlink to the user
     * directly in your connector.  Your customer will be redirected to https://app.certexpress.com/ where
     * they can follow a step-by-step guide to enter information about their exemption certificates.  The
     * certificates entered will be recorded and automatically linked to their customer record.
     * 
     * The [CertExpress website](https://app.certexpress.com/home) is available for customers to use at any time.
     * Using CertExpress with this API will ensure that your certificates are automatically linked correctly into
     * your company so that they can be used for tax exemptions.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that will record certificates
     * @param customerCode The number of the customer where the request is sent to
     * @param model the requests to send out to customers
     * @return ArrayList<CertExpressInvitationStatusModel>
     */
    public Future<ArrayList<CertExpressInvitationStatusModel>> createCertExpressInvitationAsync(Integer companyId, String customerCode, ArrayList<CreateCertExpressInvitationModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certexpressinvites");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return this.threadPool.submit((RestCall<ArrayList<CertExpressInvitationStatusModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CertExpressInvitationStatusModel>>(){}));
    }

    /**
     * Retrieve a single CertExpress invitation
     * 
     * Retrieve an existing CertExpress invitation sent to a customer.
     * 
     * A CertExpression invitation allows a customer to follow a helpful step-by-step guide to provide information
     * about their certificates.  This step by step guide allows the customer to complete and upload the full 
     * certificate in a convenient, friendly web browser experience.  When the customer completes their certificates,
     * they will automatically be recorded to your company and linked to the customer record.
     * 
     * The [CertExpress website](https://app.certexpress.com/home) is available for customers to use at any time.
     * Using CertExpress with this API will ensure that your certificates are automatically linked correctly into
     * your company so that they can be used for tax exemptions.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that issued this invitation
     * @param customerCode The number of the customer where the request is sent to
     * @param id The unique ID number of this CertExpress invitation
     * @param include OPTIONAL: A comma separated list of special fetch options. No options are defined at this time.
     * @return CertExpressInvitationModel
     */
    public CertExpressInvitationModel getCertExpressInvitation(Integer companyId, String customerCode, Integer id, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certexpressinvites/{id}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        path.applyField("id", id);
        path.addQuery("$include", include);
        return ((RestCall<CertExpressInvitationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CertExpressInvitationModel>(){})).call();
    }

    /**
     * Retrieve a single CertExpress invitation
     * 
     * Retrieve an existing CertExpress invitation sent to a customer.
     * 
     * A CertExpression invitation allows a customer to follow a helpful step-by-step guide to provide information
     * about their certificates.  This step by step guide allows the customer to complete and upload the full 
     * certificate in a convenient, friendly web browser experience.  When the customer completes their certificates,
     * they will automatically be recorded to your company and linked to the customer record.
     * 
     * The [CertExpress website](https://app.certexpress.com/home) is available for customers to use at any time.
     * Using CertExpress with this API will ensure that your certificates are automatically linked correctly into
     * your company so that they can be used for tax exemptions.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that issued this invitation
     * @param customerCode The number of the customer where the request is sent to
     * @param id The unique ID number of this CertExpress invitation
     * @param include OPTIONAL: A comma separated list of special fetch options. No options are defined at this time.
     * @return CertExpressInvitationModel
     */
    public Future<CertExpressInvitationModel> getCertExpressInvitationAsync(Integer companyId, String customerCode, Integer id, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certexpressinvites/{id}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        path.applyField("id", id);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<CertExpressInvitationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CertExpressInvitationModel>(){}));
    }

    /**
     * List CertExpress invitations
     * 
     * Retrieve CertExpress invitations sent by this company.
     * 
     * A CertExpression invitation allows a customer to follow a helpful step-by-step guide to provide information
     * about their certificates.  This step by step guide allows the customer to complete and upload the full 
     * certificate in a convenient, friendly web browser experience.  When the customer completes their certificates,
     * they will automatically be recorded to your company and linked to the customer record.
     * 
     * The [CertExpress website](https://app.certexpress.com/home) is available for customers to use at any time.
     * Using CertExpress with this API will ensure that your certificates are automatically linked correctly into
     * your company so that they can be used for tax exemptions.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that issued this invitation
     * @param include OPTIONAL: A comma separated list of special fetch options.       No options are defined at this time.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CertExpressInvitationModel>
     */
    public FetchResult<CertExpressInvitationModel> listCertExpressInvitations(Integer companyId, String include, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certexpressinvites");
        path.applyField("companyId", companyId);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CertExpressInvitationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertExpressInvitationModel>>(){})).call();
    }

    /**
     * List CertExpress invitations
     * 
     * Retrieve CertExpress invitations sent by this company.
     * 
     * A CertExpression invitation allows a customer to follow a helpful step-by-step guide to provide information
     * about their certificates.  This step by step guide allows the customer to complete and upload the full 
     * certificate in a convenient, friendly web browser experience.  When the customer completes their certificates,
     * they will automatically be recorded to your company and linked to the customer record.
     * 
     * The [CertExpress website](https://app.certexpress.com/home) is available for customers to use at any time.
     * Using CertExpress with this API will ensure that your certificates are automatically linked correctly into
     * your company so that they can be used for tax exemptions.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that issued this invitation
     * @param include OPTIONAL: A comma separated list of special fetch options.       No options are defined at this time.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CertExpressInvitationModel>
     */
    public Future<FetchResult<CertExpressInvitationModel>> listCertExpressInvitationsAsync(Integer companyId, String include, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certexpressinvites");
        path.applyField("companyId", companyId);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CertExpressInvitationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertExpressInvitationModel>>(){}));
    }

    /**
     * Create certificates for this company
     * 
     * Record one or more certificates document for this company.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * When you create a certificate, it will be processed by Avalara and will become available for use in
     * calculating tax exemptions when processing is complete.  For a certificate to be used in calculating exemptions,
     * it must have the following:
     * 
     * * A list of exposure zones indicating where the certificate is valid
     * * A link to the customer that is allowed to use this certificate
     * * Your tax transaction must contain the correct customer code
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The ID number of the company recording this certificate
     * @param model Certificates to be created
     * @return ArrayList<CertificateModel>
     */
    public ArrayList<CertificateModel> createCertificates(Integer companyId, ArrayList<CertificateModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<CertificateModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CertificateModel>>(){})).call();
    }

    /**
     * Create certificates for this company
     * 
     * Record one or more certificates document for this company.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * When you create a certificate, it will be processed by Avalara and will become available for use in
     * calculating tax exemptions when processing is complete.  For a certificate to be used in calculating exemptions,
     * it must have the following:
     * 
     * * A list of exposure zones indicating where the certificate is valid
     * * A link to the customer that is allowed to use this certificate
     * * Your tax transaction must contain the correct customer code
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The ID number of the company recording this certificate
     * @param model Certificates to be created
     * @return ArrayList<CertificateModel>
     */
    public Future<ArrayList<CertificateModel>> createCertificatesAsync(Integer companyId, ArrayList<CertificateModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<CertificateModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CertificateModel>>(){}));
    }

    /**
     * Revoke and delete a certificate
     * 
     * Revoke the certificate identified by this URL, then delete it.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Revoked certificates can no longer be used.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @return CertificateModel
     */
    public CertificateModel deleteCertificate(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<CertificateModel>)restCallFactory.createRestCall("delete", path, null, new TypeToken<CertificateModel>(){})).call();
    }

    /**
     * Revoke and delete a certificate
     * 
     * Revoke the certificate identified by this URL, then delete it.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Revoked certificates can no longer be used.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @return CertificateModel
     */
    public Future<CertificateModel> deleteCertificateAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CertificateModel>)restCallFactory.createRestCall("delete", path, null, new TypeToken<CertificateModel>(){}));
    }

    /**
     * Download an image for this certificate
     * 
     * Download an image or PDF file for this certificate.
     * 
     * This API can be used to download either a single-page preview of the certificate or a full PDF document.
     * To retrieve a preview image, set the `$type` parameter to `Jpeg` and the `$page` parameter to `1`.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param page If you choose `$type`=`Jpeg`, you must specify which page number to retrieve.
     * @param type The data format in which to retrieve the certificate image (See CertificatePreviewType::* for a list of allowable values)
     * @return String
     */
    public String downloadCertificateImage(Integer companyId, Integer id, Integer page, CertificatePreviewType type) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("$page", page);
        path.addQuery("$type", type);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Download an image for this certificate
     * 
     * Download an image or PDF file for this certificate.
     * 
     * This API can be used to download either a single-page preview of the certificate or a full PDF document.
     * To retrieve a preview image, set the `$type` parameter to `Jpeg` and the `$page` parameter to `1`.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param page If you choose `$type`=`Jpeg`, you must specify which page number to retrieve.
     * @param type The data format in which to retrieve the certificate image (See CertificatePreviewType::* for a list of allowable values)
     * @return String
     */
    public Future<String> downloadCertificateImageAsync(Integer companyId, Integer id, Integer page, CertificatePreviewType type) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("$page", page);
        path.addQuery("$type", type);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Retrieve a single certificate
     * 
     * Get the current certificate identified by this URL.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * You can use the `$include` parameter to fetch the following additional objects for expansion:
     * 
     * * Customers - Retrieves the list of customers linked to the certificate.
     * * PoNumbers - Retrieves all PO numbers tied to the certificate.
     * * Attributes - Retrieves all attributes applied to the certificate.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param include OPTIONAL: A comma separated list of special fetch options. You can specify one or more of the following:      * Customers - Retrieves the list of customers linked to the certificate.   * PoNumbers - Retrieves all PO numbers tied to the certificate.   * Attributes - Retrieves all attributes applied to the certificate.
     * @return CertificateModel
     */
    public CertificateModel getCertificate(Integer companyId, Integer id, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("$include", include);
        return ((RestCall<CertificateModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CertificateModel>(){})).call();
    }

    /**
     * Retrieve a single certificate
     * 
     * Get the current certificate identified by this URL.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * You can use the `$include` parameter to fetch the following additional objects for expansion:
     * 
     * * Customers - Retrieves the list of customers linked to the certificate.
     * * PoNumbers - Retrieves all PO numbers tied to the certificate.
     * * Attributes - Retrieves all attributes applied to the certificate.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param include OPTIONAL: A comma separated list of special fetch options. You can specify one or more of the following:      * Customers - Retrieves the list of customers linked to the certificate.   * PoNumbers - Retrieves all PO numbers tied to the certificate.   * Attributes - Retrieves all attributes applied to the certificate.
     * @return CertificateModel
     */
    public Future<CertificateModel> getCertificateAsync(Integer companyId, Integer id, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<CertificateModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CertificateModel>(){}));
    }

    /**
     * Check a company's exemption certificate status.
     * 
     * Checks whether this company is configured to use exemption certificates in AvaTax.
     * 
     * Exemption certificates are tracked through a different auditable data store than the one that 
     * holds AvaTax transactions.  To use the AvaTax exemption certificate document store, please call
     * `GetCertificateSetup` to see if your company is configured to use the exemption certificate
     * document store.  To request setup, please call `RequestCertificateSetup` and your company will
     * 
     * @param companyId The company ID to check
     * @return ProvisionStatusModel
     */
    public ProvisionStatusModel getCertificateSetup(Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/setup");
        path.applyField("companyId", companyId);
        return ((RestCall<ProvisionStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ProvisionStatusModel>(){})).call();
    }

    /**
     * Check a company's exemption certificate status.
     * 
     * Checks whether this company is configured to use exemption certificates in AvaTax.
     * 
     * Exemption certificates are tracked through a different auditable data store than the one that 
     * holds AvaTax transactions.  To use the AvaTax exemption certificate document store, please call
     * `GetCertificateSetup` to see if your company is configured to use the exemption certificate
     * document store.  To request setup, please call `RequestCertificateSetup` and your company will
     * 
     * @param companyId The company ID to check
     * @return ProvisionStatusModel
     */
    public Future<ProvisionStatusModel> getCertificateSetupAsync(Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/setup");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ProvisionStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ProvisionStatusModel>(){}));
    }

    /**
     * Link attributes to a certificate
     * 
     * Link one or many attributes to a certificate.
     * 
     * A certificate may have multiple attributes that control its behavior.  You may link or unlink attributes to a
     * certificate at any time.  The full list of defined attributes may be found using `ListCertificateAttributes`.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The list of attributes to link to this certificate.
     * @return FetchResult<CertificateAttributeModel>
     */
    public FetchResult<CertificateAttributeModel> linkAttributesToCertificate(Integer companyId, Integer id, ArrayList<CertificateAttributeModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attributes/link");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FetchResult<CertificateAttributeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CertificateAttributeModel>>(){})).call();
    }

    /**
     * Link attributes to a certificate
     * 
     * Link one or many attributes to a certificate.
     * 
     * A certificate may have multiple attributes that control its behavior.  You may link or unlink attributes to a
     * certificate at any time.  The full list of defined attributes may be found using `ListCertificateAttributes`.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The list of attributes to link to this certificate.
     * @return FetchResult<CertificateAttributeModel>
     */
    public Future<FetchResult<CertificateAttributeModel>> linkAttributesToCertificateAsync(Integer companyId, Integer id, ArrayList<CertificateAttributeModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attributes/link");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FetchResult<CertificateAttributeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CertificateAttributeModel>>(){}));
    }

    /**
     * Link customers to a certificate
     * 
     * Link one or more customers to an existing certificate.
     * 
     * Customers and certificates must be linked before a customer can make use of a certificate to obtain
     * a tax exemption in AvaTax.  Since some certificates may cover more than one business entity, a certificate
     * can be connected to multiple customer records using the `LinkCustomersToCertificate` API.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The list of customers needed be added to the Certificate for exemption
     * @return FetchResult<CustomerModel>
     */
    public FetchResult<CustomerModel> linkCustomersToCertificate(Integer companyId, Integer id, LinkCustomersModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/customers/link");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FetchResult<CustomerModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CustomerModel>>(){})).call();
    }

    /**
     * Link customers to a certificate
     * 
     * Link one or more customers to an existing certificate.
     * 
     * Customers and certificates must be linked before a customer can make use of a certificate to obtain
     * a tax exemption in AvaTax.  Since some certificates may cover more than one business entity, a certificate
     * can be connected to multiple customer records using the `LinkCustomersToCertificate` API.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The list of customers needed be added to the Certificate for exemption
     * @return FetchResult<CustomerModel>
     */
    public Future<FetchResult<CustomerModel>> linkCustomersToCertificateAsync(Integer companyId, Integer id, LinkCustomersModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/customers/link");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FetchResult<CustomerModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CustomerModel>>(){}));
    }

    /**
     * List all attributes applied to this certificate
     * 
     * Retrieve the list of attributes that are linked to this certificate.
     * 
     * A certificate may have multiple attributes that control its behavior.  You may link or unlink attributes to a
     * certificate at any time.  The full list of defined attributes may be found using `/api/v2/definitions/certificateattributes`.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @return FetchResult<CertificateAttributeModel>
     */
    public FetchResult<CertificateAttributeModel> listAttributesForCertificate(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attributes");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FetchResult<CertificateAttributeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertificateAttributeModel>>(){})).call();
    }

    /**
     * List all attributes applied to this certificate
     * 
     * Retrieve the list of attributes that are linked to this certificate.
     * 
     * A certificate may have multiple attributes that control its behavior.  You may link or unlink attributes to a
     * certificate at any time.  The full list of defined attributes may be found using `/api/v2/definitions/certificateattributes`.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @return FetchResult<CertificateAttributeModel>
     */
    public Future<FetchResult<CertificateAttributeModel>> listAttributesForCertificateAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attributes");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FetchResult<CertificateAttributeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertificateAttributeModel>>(){}));
    }

    /**
     * List customers linked to this certificate
     * 
     * List all customers linked to this certificate.
     * 
     * Customers must be linked to a certificate in order to make use of its tax exemption features.  You
     * can link or unlink customers to a certificate at any time.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param include OPTIONAL: A comma separated list of special fetch options.    No options are currently available when fetching customers.
     * @return FetchResult<CustomerModel>
     */
    public FetchResult<CustomerModel> listCustomersForCertificate(Integer companyId, Integer id, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/customers");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("$include", include);
        return ((RestCall<FetchResult<CustomerModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CustomerModel>>(){})).call();
    }

    /**
     * List customers linked to this certificate
     * 
     * List all customers linked to this certificate.
     * 
     * Customers must be linked to a certificate in order to make use of its tax exemption features.  You
     * can link or unlink customers to a certificate at any time.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param include OPTIONAL: A comma separated list of special fetch options.    No options are currently available when fetching customers.
     * @return FetchResult<CustomerModel>
     */
    public Future<FetchResult<CustomerModel>> listCustomersForCertificateAsync(Integer companyId, Integer id, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/customers");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<FetchResult<CustomerModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CustomerModel>>(){}));
    }

    /**
     * List all certificates for a company
     * 
     * List all certificates recorded by a company
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * You can use the `$include` parameter to fetch the following additional objects for expansion:
     * 
     * * Customers - Retrieves the list of customers linked to the certificate.
     * * PoNumbers - Retrieves all PO numbers tied to the certificate.
     * * Attributes - Retrieves all attributes applied to the certificate.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The ID number of the company to search
     * @param include OPTIONAL: A comma separated list of special fetch options. You can specify one or more of the following:      * Customers - Retrieves the list of customers linked to the certificate.   * PoNumbers - Retrieves all PO numbers tied to the certificate.   * Attributes - Retrieves all attributes applied to the certificate.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CertificateModel>
     */
    public FetchResult<CertificateModel> queryCertificates(Integer companyId, String include, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates");
        path.applyField("companyId", companyId);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CertificateModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertificateModel>>(){})).call();
    }

    /**
     * List all certificates for a company
     * 
     * List all certificates recorded by a company
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * You can use the `$include` parameter to fetch the following additional objects for expansion:
     * 
     * * Customers - Retrieves the list of customers linked to the certificate.
     * * PoNumbers - Retrieves all PO numbers tied to the certificate.
     * * Attributes - Retrieves all attributes applied to the certificate.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The ID number of the company to search
     * @param include OPTIONAL: A comma separated list of special fetch options. You can specify one or more of the following:      * Customers - Retrieves the list of customers linked to the certificate.   * PoNumbers - Retrieves all PO numbers tied to the certificate.   * Attributes - Retrieves all attributes applied to the certificate.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CertificateModel>
     */
    public Future<FetchResult<CertificateModel>> queryCertificatesAsync(Integer companyId, String include, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates");
        path.applyField("companyId", companyId);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CertificateModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertificateModel>>(){}));
    }

    /**
     * Request setup of exemption certificates for this company.
     * 
     * Requests the setup of exemption certificates for this company.
     * 
     * Exemption certificates are tracked through a different auditable data store than the one that 
     * holds AvaTax transactions.  To use the AvaTax exemption certificate document store, please call
     * `GetCertificateSetup` to see if your company is configured to use the exemption certificate
     * document store.  To request setup, please call `RequestCertificateSetup` and your company will
     * be configured with data storage in the auditable certificate system.
     * 
     * 
     * @param companyId 
     * @return ProvisionStatusModel
     */
    public ProvisionStatusModel requestCertificateSetup(Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/setup");
        path.applyField("companyId", companyId);
        return ((RestCall<ProvisionStatusModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<ProvisionStatusModel>(){})).call();
    }

    /**
     * Request setup of exemption certificates for this company.
     * 
     * Requests the setup of exemption certificates for this company.
     * 
     * Exemption certificates are tracked through a different auditable data store than the one that 
     * holds AvaTax transactions.  To use the AvaTax exemption certificate document store, please call
     * `GetCertificateSetup` to see if your company is configured to use the exemption certificate
     * document store.  To request setup, please call `RequestCertificateSetup` and your company will
     * be configured with data storage in the auditable certificate system.
     * 
     * 
     * @param companyId 
     * @return ProvisionStatusModel
     */
    public Future<ProvisionStatusModel> requestCertificateSetupAsync(Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/setup");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ProvisionStatusModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<ProvisionStatusModel>(){}));
    }

    /**
     * Unlink attributes from a certificate
     * 
     * Unlink one or many attributes from a certificate.
     * 
     * A certificate may have multiple attributes that control its behavior.  You may link or unlink attributes to a
     * certificate at any time.  The full list of defined attributes may be found using `ListCertificateAttributes`.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The list of attributes to unlink from this certificate.
     * @return FetchResult<CertificateAttributeModel>
     */
    public FetchResult<CertificateAttributeModel> unlinkAttributesFromCertificate(Integer companyId, Integer id, ArrayList<CertificateAttributeModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attributes/unlink");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FetchResult<CertificateAttributeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CertificateAttributeModel>>(){})).call();
    }

    /**
     * Unlink attributes from a certificate
     * 
     * Unlink one or many attributes from a certificate.
     * 
     * A certificate may have multiple attributes that control its behavior.  You may link or unlink attributes to a
     * certificate at any time.  The full list of defined attributes may be found using `ListCertificateAttributes`.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The list of attributes to unlink from this certificate.
     * @return FetchResult<CertificateAttributeModel>
     */
    public Future<FetchResult<CertificateAttributeModel>> unlinkAttributesFromCertificateAsync(Integer companyId, Integer id, ArrayList<CertificateAttributeModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attributes/unlink");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FetchResult<CertificateAttributeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CertificateAttributeModel>>(){}));
    }

    /**
     * Unlink customers from a certificate
     * 
     * Unlinks one or more customers from a certificate.
     * 
     * Unlinking a certificate from a customer will prevent the certificate from being used to generate
     * tax exemptions for the customer in the future.  If any previous transactions for this customer had
     * used this linked certificate, those transactions will be unchanged and will still have a link to the
     * exemption certificate in question.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The list of customers to unlink from this certificate
     * @return FetchResult<CustomerModel>
     */
    public FetchResult<CustomerModel> unlinkCustomersFromCertificate(Integer companyId, Integer id, LinkCustomersModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/customers/unlink");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FetchResult<CustomerModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CustomerModel>>(){})).call();
    }

    /**
     * Unlink customers from a certificate
     * 
     * Unlinks one or more customers from a certificate.
     * 
     * Unlinking a certificate from a customer will prevent the certificate from being used to generate
     * tax exemptions for the customer in the future.  If any previous transactions for this customer had
     * used this linked certificate, those transactions will be unchanged and will still have a link to the
     * exemption certificate in question.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The list of customers to unlink from this certificate
     * @return FetchResult<CustomerModel>
     */
    public Future<FetchResult<CustomerModel>> unlinkCustomersFromCertificateAsync(Integer companyId, Integer id, LinkCustomersModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/customers/unlink");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FetchResult<CustomerModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CustomerModel>>(){}));
    }

    /**
     * Update a single certificate
     * 
     * Replace the certificate identified by this URL with a new one.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The new certificate object that will replace the existing one
     * @return CertificateModel
     */
    public CertificateModel updateCertificate(Integer companyId, Integer id, CertificateModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<CertificateModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CertificateModel>(){})).call();
    }

    /**
     * Update a single certificate
     * 
     * Replace the certificate identified by this URL with a new one.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param model The new certificate object that will replace the existing one
     * @return CertificateModel
     */
    public Future<CertificateModel> updateCertificateAsync(Integer companyId, Integer id, CertificateModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CertificateModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CertificateModel>(){}));
    }

    /**
     * Upload an image or PDF attachment for this certificate
     * 
     * Upload an image or PDF attachment for this certificate.
     * 
     * Image attachments can be of the format `PDF`, `JPEG`, `TIFF`, or `PNG`.  To upload a multi-page image, please
     * use the `PDF` data type.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param file The exemption certificate file you wanted to upload. Accepted formats are: PDF, JPEG, TIFF, PNG.
     * @return String
     */
    public String uploadCertificateImage(Integer companyId, Integer id, String file) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Upload an image or PDF attachment for this certificate
     * 
     * Upload an image or PDF attachment for this certificate.
     * 
     * Image attachments can be of the format `PDF`, `JPEG`, `TIFF`, or `PNG`.  To upload a multi-page image, please
     * use the `PDF` data type.
     * 
     * A certificate is a document stored in either AvaTax Exemptions or CertCapture.  The certificate document
     * can contain information about a customer's eligibility for exemption from sales or use taxes based on
     * criteria you specify when you store the certificate.  To view or manage your certificates directly, please 
     * log onto the administrative website for the product you purchased.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this certificate
     * @param id The unique ID number of this certificate
     * @param file The exemption certificate file you wanted to upload. Accepted formats are: PDF, JPEG, TIFF, PNG.
     * @return String
     */
    public Future<String> uploadCertificateImageAsync(Integer companyId, Integer id, String file) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/certificates/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, null, new TypeToken<String>(){}));
    }

    /**
     * Change the filing status of this company
     * 
     * Changes the current filing status of this company.
     * 
     * For customers using Avalara's Managed Returns Service, each company within their account can request
     * for Avalara to file tax returns on their behalf.  Avalara compliance team members will review all
     * requested filing calendars prior to beginning filing tax returns on behalf of this company.
     * 
     * The following changes may be requested through this API:
     * 
     * * If a company is in `NotYetFiling` status, the customer may request this be changed to `FilingRequested`.
     * * Avalara compliance team members may change a company from `FilingRequested` to `FirstFiling`.
     * * Avalara compliance team members may change a company from `FirstFiling` to `Active`.
     * 
     * 
     * @param id 
     * @param model 
     * @return String
     */
    public String changeFilingStatus(Integer id, FilingStatusChangeModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/filingstatus");
        path.applyField("id", id);
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){})).call();
    }

    /**
     * Change the filing status of this company
     * 
     * Changes the current filing status of this company.
     * 
     * For customers using Avalara's Managed Returns Service, each company within their account can request
     * for Avalara to file tax returns on their behalf.  Avalara compliance team members will review all
     * requested filing calendars prior to beginning filing tax returns on behalf of this company.
     * 
     * The following changes may be requested through this API:
     * 
     * * If a company is in `NotYetFiling` status, the customer may request this be changed to `FilingRequested`.
     * * Avalara compliance team members may change a company from `FilingRequested` to `FirstFiling`.
     * * Avalara compliance team members may change a company from `FirstFiling` to `Active`.
     * 
     * 
     * @param id 
     * @param model 
     * @return String
     */
    public Future<String> changeFilingStatusAsync(Integer id, FilingStatusChangeModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/filingstatus");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){}));
    }

    /**
     * Quick setup for a company with a single physical address
     * 
     * Shortcut to quickly setup a single-physical-location company with critical information and activate it.
     * This API provides quick and simple company setup functionality and does the following things:
     *             
     * * Create a company object with its own tax profile
     * * Add a key contact person for the company
     * * Set up one physical location for the main office
     * * Declare nexus in all taxing jurisdictions for that main office address
     * * Activate the company
     *             
     * This API only provides a limited subset of functionality compared to the 'Create Company' API call.  
     * If you need additional features or options not present in this 'Quick Setup' API call, please use the full 'Create Company' call instead.
     * 
     * @param model Information about the company you wish to create.
     * @return CompanyModel
     */
    public CompanyModel companyInitialize(CompanyInitializationModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/initialize");
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<CompanyModel>(){})).call();
    }

    /**
     * Quick setup for a company with a single physical address
     * 
     * Shortcut to quickly setup a single-physical-location company with critical information and activate it.
     * This API provides quick and simple company setup functionality and does the following things:
     *             
     * * Create a company object with its own tax profile
     * * Add a key contact person for the company
     * * Set up one physical location for the main office
     * * Declare nexus in all taxing jurisdictions for that main office address
     * * Activate the company
     *             
     * This API only provides a limited subset of functionality compared to the 'Create Company' API call.  
     * If you need additional features or options not present in this 'Quick Setup' API call, please use the full 'Create Company' call instead.
     * 
     * @param model Information about the company you wish to create.
     * @return CompanyModel
     */
    public Future<CompanyModel> companyInitializeAsync(CompanyInitializationModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/initialize");
        return this.threadPool.submit((RestCall<CompanyModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<CompanyModel>(){}));
    }

    /**
     * Create new companies
     * 
     * Create one or more new company objects.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * 
     * @param model Either a single company object or an array of companies to create
     * @return ArrayList<CompanyModel>
     */
    public ArrayList<CompanyModel> createCompanies(ArrayList<CompanyModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        return ((RestCall<ArrayList<CompanyModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyModel>>(){})).call();
    }

    /**
     * Create new companies
     * 
     * Create one or more new company objects.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * 
     * @param model Either a single company object or an array of companies to create
     * @return ArrayList<CompanyModel>
     */
    public Future<ArrayList<CompanyModel>> createCompaniesAsync(ArrayList<CompanyModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        return this.threadPool.submit((RestCall<ArrayList<CompanyModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyModel>>(){}));
    }

    /**
     * Request managed returns funding setup for a company
     * 
     * This API is available by invitation only.
     * Companies that use the Avalara Managed Returns or the SST Certified Service Provider services are 
     * required to setup their funding configuration before Avalara can begin filing tax returns on their 
     * behalf.
     * Funding configuration for each company is set up by submitting a funding setup request, which can
     * be sent either via email or via an embedded HTML widget.
     * When the funding configuration is submitted to Avalara, it will be reviewed by treasury team members
     * before approval.
     * This API records that an ambedded HTML funding setup widget was activated.
     * 
     * @param id The unique identifier of the company
     * @param model The funding initialization request
     * @return FundingStatusModel
     */
    public FundingStatusModel createFundingRequest(Integer id, FundingInitiateModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding/setup");
        path.applyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FundingStatusModel>(){})).call();
    }

    /**
     * Request managed returns funding setup for a company
     * 
     * This API is available by invitation only.
     * Companies that use the Avalara Managed Returns or the SST Certified Service Provider services are 
     * required to setup their funding configuration before Avalara can begin filing tax returns on their 
     * behalf.
     * Funding configuration for each company is set up by submitting a funding setup request, which can
     * be sent either via email or via an embedded HTML widget.
     * When the funding configuration is submitted to Avalara, it will be reviewed by treasury team members
     * before approval.
     * This API records that an ambedded HTML funding setup widget was activated.
     * 
     * @param id The unique identifier of the company
     * @param model The funding initialization request
     * @return FundingStatusModel
     */
    public Future<FundingStatusModel> createFundingRequestAsync(Integer id, FundingInitiateModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding/setup");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FundingStatusModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FundingStatusModel>(){}));
    }

    /**
     * Delete a single company
     * 
     * @param id The ID of the company you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteCompany(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single company
     * 
     * @param id The ID of the company you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteCompanyAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Check the funding configuration of a company
     * 
     * This API is available by invitation only.
     * Requires a subscription to Avalara Managed Returns or SST Certified Service Provider.
     * Returns the funding configuration of the requested company.
     * 
     * @param companyId The unique identifier of the company
     * @return FundingConfigurationModel
     */
    public FundingConfigurationModel fundingConfigurationByCompany(Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/funding/configuration");
        path.applyField("companyId", companyId);
        return ((RestCall<FundingConfigurationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingConfigurationModel>(){})).call();
    }

    /**
     * Check the funding configuration of a company
     * 
     * This API is available by invitation only.
     * Requires a subscription to Avalara Managed Returns or SST Certified Service Provider.
     * Returns the funding configuration of the requested company.
     * 
     * @param companyId The unique identifier of the company
     * @return FundingConfigurationModel
     */
    public Future<FundingConfigurationModel> fundingConfigurationByCompanyAsync(Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/funding/configuration");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FundingConfigurationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingConfigurationModel>(){}));
    }

    /**
     * Check the funding configuration of a company
     * 
     * This API is available by invitation only.
     * Requires a subscription to Avalara Managed Returns or SST Certified Service Provider.
     * Returns the funding configuration of the requested company.
     * 
     * @param companyId The unique identifier of the company
     * @param currency The currency of the funding. USD and CAD are the only valid currencies
     * @return ArrayList<FundingConfigurationModel>
     */
    public ArrayList<FundingConfigurationModel> fundingConfigurationsByCompanyAndCurrency(Integer companyId, String currency) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/funding/configurations");
        path.applyField("companyId", companyId);
        path.addQuery("currency", currency);
        return ((RestCall<ArrayList<FundingConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<FundingConfigurationModel>>(){})).call();
    }

    /**
     * Check the funding configuration of a company
     * 
     * This API is available by invitation only.
     * Requires a subscription to Avalara Managed Returns or SST Certified Service Provider.
     * Returns the funding configuration of the requested company.
     * 
     * @param companyId The unique identifier of the company
     * @param currency The currency of the funding. USD and CAD are the only valid currencies
     * @return ArrayList<FundingConfigurationModel>
     */
    public Future<ArrayList<FundingConfigurationModel>> fundingConfigurationsByCompanyAndCurrencyAsync(Integer companyId, String currency) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/funding/configurations");
        path.applyField("companyId", companyId);
        path.addQuery("currency", currency);
        return this.threadPool.submit((RestCall<ArrayList<FundingConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<FundingConfigurationModel>>(){}));
    }

    /**
     * Retrieve a single company
     * 
     * Get the company object identified by this URL.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     * 
     *  * Contacts
     *  * Items
     *  * Locations
     *  * Nexus
     *  * Settings
     *  * TaxCodes
     *  * TaxRules
     * 
     * @param id The ID of the company to retrieve.
     * @param include OPTIONAL: A comma separated list of special fetch options.       * Child objects - Specify one or more of the following to retrieve objects related to each company: "Contacts", "FilingCalendars", "Items", "Locations", "Nexus", "TaxCodes", or "TaxRules".   * Deleted objects - Specify "FetchDeleted" to retrieve information about previously deleted objects.
     * @return CompanyModel
     */
    public CompanyModel getCompany(Integer id, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CompanyModel>(){})).call();
    }

    /**
     * Retrieve a single company
     * 
     * Get the company object identified by this URL.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     * 
     *  * Contacts
     *  * Items
     *  * Locations
     *  * Nexus
     *  * Settings
     *  * TaxCodes
     *  * TaxRules
     * 
     * @param id The ID of the company to retrieve.
     * @param include OPTIONAL: A comma separated list of special fetch options.       * Child objects - Specify one or more of the following to retrieve objects related to each company: "Contacts", "FilingCalendars", "Items", "Locations", "Nexus", "TaxCodes", or "TaxRules".   * Deleted objects - Specify "FetchDeleted" to retrieve information about previously deleted objects.
     * @return CompanyModel
     */
    public Future<CompanyModel> getCompanyAsync(Integer id, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<CompanyModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CompanyModel>(){}));
    }

    /**
     * Get configuration settings for this company
     * 
     * Retrieve a list of all configuration settings tied to this company.
     * 
     * Configuration settings provide you with the ability to control features of your account and of your
     * tax software.  The category names `AvaCertServiceConfig` is reserved for
     * Avalara internal software configuration values; to store your own account-level settings, please
     * create a new category name that begins with `X-`, for example, `X-MyCustomCategory`.
     * 
     * Company settings are permanent settings that cannot be deleted.  You can set the value of a
     * company setting to null if desired.
     * 
     * Avalara-based account settings for `AvaCertServiceConfig` affect your account's exemption certificate
     * 
     * @param id 
     * @return ArrayList<CompanyConfigurationModel>
     */
    public ArrayList<CompanyConfigurationModel> getCompanyConfiguration(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.applyField("id", id);
        return ((RestCall<ArrayList<CompanyConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<CompanyConfigurationModel>>(){})).call();
    }

    /**
     * Get configuration settings for this company
     * 
     * Retrieve a list of all configuration settings tied to this company.
     * 
     * Configuration settings provide you with the ability to control features of your account and of your
     * tax software.  The category names `AvaCertServiceConfig` is reserved for
     * Avalara internal software configuration values; to store your own account-level settings, please
     * create a new category name that begins with `X-`, for example, `X-MyCustomCategory`.
     * 
     * Company settings are permanent settings that cannot be deleted.  You can set the value of a
     * company setting to null if desired.
     * 
     * Avalara-based account settings for `AvaCertServiceConfig` affect your account's exemption certificate
     * 
     * @param id 
     * @return ArrayList<CompanyConfigurationModel>
     */
    public Future<ArrayList<CompanyConfigurationModel>> getCompanyConfigurationAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<CompanyConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<CompanyConfigurationModel>>(){}));
    }

    /**
     * Get this company's filing status
     * 
     * Retrieve the current filing status of this company.
     * 
     * For customers using Avalara's Managed Returns Service, each company within their account can request
     * for Avalara to file tax returns on their behalf.  Avalara compliance team members will review all
     * requested filing calendars prior to beginning filing tax returns on behalf of this company.
     * 
     * A company's filing status can be one of the following values:
     * 
     * * `NoReporting` - This company is not configured to report tax returns; instead, it reports through a parent company.
     * * `NotYetFiling` - This company has not yet begun filing tax returns through Avalara's Managed Returns Service.
     * * `FilingRequested` - The company has requested to begin filing tax returns, but Avalara's compliance team has not yet begun filing.
     * * `FirstFiling` - The company has recently filing tax returns and is in a new status.
     * 
     * @param id 
     * @return String
     */
    public String getFilingStatus(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/filingstatus");
        path.applyField("id", id);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Get this company's filing status
     * 
     * Retrieve the current filing status of this company.
     * 
     * For customers using Avalara's Managed Returns Service, each company within their account can request
     * for Avalara to file tax returns on their behalf.  Avalara compliance team members will review all
     * requested filing calendars prior to beginning filing tax returns on behalf of this company.
     * 
     * A company's filing status can be one of the following values:
     * 
     * * `NoReporting` - This company is not configured to report tax returns; instead, it reports through a parent company.
     * * `NotYetFiling` - This company has not yet begun filing tax returns through Avalara's Managed Returns Service.
     * * `FilingRequested` - The company has requested to begin filing tax returns, but Avalara's compliance team has not yet begun filing.
     * * `FirstFiling` - The company has recently filing tax returns and is in a new status.
     * 
     * @param id 
     * @return String
     */
    public Future<String> getFilingStatusAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/filingstatus");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Check managed returns funding status for a company
     * 
     * This API is available by invitation only.
     * Requires a subscription to Avalara Managed Returns or SST Certified Service Provider.
     * Returns a list of funding setup requests and their current status.
     * 
     * @param id The unique identifier of the company
     * @return ArrayList<FundingStatusModel>
     */
    public ArrayList<FundingStatusModel> listFundingRequestsByCompany(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding");
        path.applyField("id", id);
        return ((RestCall<ArrayList<FundingStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<FundingStatusModel>>(){})).call();
    }

    /**
     * Check managed returns funding status for a company
     * 
     * This API is available by invitation only.
     * Requires a subscription to Avalara Managed Returns or SST Certified Service Provider.
     * Returns a list of funding setup requests and their current status.
     * 
     * @param id The unique identifier of the company
     * @return ArrayList<FundingStatusModel>
     */
    public Future<ArrayList<FundingStatusModel>> listFundingRequestsByCompanyAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<FundingStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<FundingStatusModel>>(){}));
    }

    /**
     * Retrieve a list of MRS Companies with account
     * 
     * This API is available by invitation only.
     * 
     * 
     * @return FetchResult<MrsCompanyModel>
     */
    public FetchResult<MrsCompanyModel> listMrsCompanies() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/mrs");
        return ((RestCall<FetchResult<MrsCompanyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<MrsCompanyModel>>(){})).call();
    }

    /**
     * Retrieve a list of MRS Companies with account
     * 
     * This API is available by invitation only.
     * 
     * 
     * @return FetchResult<MrsCompanyModel>
     */
    public Future<FetchResult<MrsCompanyModel>> listMrsCompaniesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/mrs");
        return this.threadPool.submit((RestCall<FetchResult<MrsCompanyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<MrsCompanyModel>>(){}));
    }

    /**
     * Retrieve all companies
     * 
     * Get multiple company objects.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Contacts
     * * Items
     * * Locations
     * * Nexus
     * * Settings
     * * TaxCodes
     * * TaxRules
     * 
     * @param include A comma separated list of objects to fetch underneath this company. Any object with a URL path underneath this company can be fetched by specifying its name.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CompanyModel>
     */
    public FetchResult<CompanyModel> queryCompanies(String include, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CompanyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CompanyModel>>(){})).call();
    }

    /**
     * Retrieve all companies
     * 
     * Get multiple company objects.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Contacts
     * * Items
     * * Locations
     * * Nexus
     * * Settings
     * * TaxCodes
     * * TaxRules
     * 
     * @param include A comma separated list of objects to fetch underneath this company. Any object with a URL path underneath this company can be fetched by specifying its name.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CompanyModel>
     */
    public Future<FetchResult<CompanyModel>> queryCompaniesAsync(String include, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CompanyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CompanyModel>>(){}));
    }

    /**
     * Change configuration settings for this account
     * 
     * Update configuration settings tied to this account.
     * 
     * Configuration settings provide you with the ability to control features of your account and of your
     * tax software.  The category names `AvaCertServiceConfig` is reserved for
     * Avalara internal software configuration values; to store your own account-level settings, please
     * create a new category name that begins with `X-`, for example, `X-MyCustomCategory`.
     * 
     * Company settings are permanent settings that cannot be deleted.  You can set the value of a
     * company setting to null if desired.
     * 
     * Avalara-based account settings for `AvaCertServiceConfig` affect your account's exemption certificate
     * 
     * @param id 
     * @param model 
     * @return ArrayList<CompanyConfigurationModel>
     */
    public ArrayList<CompanyConfigurationModel> setCompanyConfiguration(Integer id, ArrayList<CompanyConfigurationModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.applyField("id", id);
        return ((RestCall<ArrayList<CompanyConfigurationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyConfigurationModel>>(){})).call();
    }

    /**
     * Change configuration settings for this account
     * 
     * Update configuration settings tied to this account.
     * 
     * Configuration settings provide you with the ability to control features of your account and of your
     * tax software.  The category names `AvaCertServiceConfig` is reserved for
     * Avalara internal software configuration values; to store your own account-level settings, please
     * create a new category name that begins with `X-`, for example, `X-MyCustomCategory`.
     * 
     * Company settings are permanent settings that cannot be deleted.  You can set the value of a
     * company setting to null if desired.
     * 
     * Avalara-based account settings for `AvaCertServiceConfig` affect your account's exemption certificate
     * 
     * @param id 
     * @param model 
     * @return ArrayList<CompanyConfigurationModel>
     */
    public Future<ArrayList<CompanyConfigurationModel>> setCompanyConfigurationAsync(Integer id, ArrayList<CompanyConfigurationModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<CompanyConfigurationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyConfigurationModel>>(){}));
    }

    /**
     * Update a single company
     * 
     * Replace the existing company object at this URL with an updated object.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param id The ID of the company you wish to update.
     * @param model The company object you wish to update.
     * @return CompanyModel
     */
    public CompanyModel updateCompany(Integer id, CompanyModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CompanyModel>(){})).call();
    }

    /**
     * Update a single company
     * 
     * Replace the existing company object at this URL with an updated object.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param id The ID of the company you wish to update.
     * @param model The company object you wish to update.
     * @return CompanyModel
     */
    public Future<CompanyModel> updateCompanyAsync(Integer id, CompanyModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CompanyModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CompanyModel>(){}));
    }

    /**
     * Create a new contact
     * 
     * Create one or more new contact objects.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * 
     * @param companyId The ID of the company that owns this contact.
     * @param model The contacts you wish to create.
     * @return ArrayList<ContactModel>
     */
    public ArrayList<ContactModel> createContacts(Integer companyId, ArrayList<ContactModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<ContactModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<ContactModel>>(){})).call();
    }

    /**
     * Create a new contact
     * 
     * Create one or more new contact objects.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * 
     * @param companyId The ID of the company that owns this contact.
     * @param model The contacts you wish to create.
     * @return ArrayList<ContactModel>
     */
    public Future<ArrayList<ContactModel>> createContactsAsync(Integer companyId, ArrayList<ContactModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<ContactModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<ContactModel>>(){}));
    }

    /**
     * Delete a single contact
     * 
     * @param companyId The ID of the company that owns this contact.
     * @param id The ID of the contact you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteContact(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single contact
     * 
     * @param companyId The ID of the company that owns this contact.
     * @param id The ID of the contact you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteContactAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single contact
     * 
     * Get the contact object identified by this URL.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * 
     * @param companyId The ID of the company for this contact
     * @param id The primary key of this contact
     * @return ContactModel
     */
    public ContactModel getContact(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ContactModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ContactModel>(){})).call();
    }

    /**
     * Retrieve a single contact
     * 
     * Get the contact object identified by this URL.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * 
     * @param companyId The ID of the company for this contact
     * @param id The primary key of this contact
     * @return ContactModel
     */
    public Future<ContactModel> getContactAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ContactModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ContactModel>(){}));
    }

    /**
     * Retrieve contacts for this company
     * 
     * List all contact objects assigned to this company.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these contacts
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ContactModel>
     */
    public FetchResult<ContactModel> listContactsByCompany(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){})).call();
    }

    /**
     * Retrieve contacts for this company
     * 
     * List all contact objects assigned to this company.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these contacts
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ContactModel>
     */
    public Future<FetchResult<ContactModel>> listContactsByCompanyAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){}));
    }

    /**
     * Retrieve all contacts
     * 
     * Get multiple contact objects across all companies.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * a tax collecting and filing entity.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ContactModel>
     */
    public FetchResult<ContactModel> queryContacts(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/contacts");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){})).call();
    }

    /**
     * Retrieve all contacts
     * 
     * Get multiple contact objects across all companies.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * a tax collecting and filing entity.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ContactModel>
     */
    public Future<FetchResult<ContactModel>> queryContactsAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/contacts");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){}));
    }

    /**
     * Update a single contact
     * 
     * Replace the existing contact object at this URL with an updated object.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * a tax collecting and filing entity.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this contact belongs to.
     * @param id The ID of the contact you wish to update
     * @param model The contact you wish to update.
     * @return ContactModel
     */
    public ContactModel updateContact(Integer companyId, Integer id, ContactModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ContactModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ContactModel>(){})).call();
    }

    /**
     * Update a single contact
     * 
     * Replace the existing contact object at this URL with an updated object.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * a tax collecting and filing entity.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this contact belongs to.
     * @param id The ID of the contact you wish to update
     * @param model The contact you wish to update.
     * @return ContactModel
     */
    public Future<ContactModel> updateContactAsync(Integer companyId, Integer id, ContactModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ContactModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ContactModel>(){}));
    }

    /**
     * Create customers for this company
     * 
     * Create one or more customers for this company.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param model The list of customer objects to be created
     * @return ArrayList<CustomerModel>
     */
    public ArrayList<CustomerModel> createCustomers(Integer companyId, ArrayList<CustomerModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<CustomerModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CustomerModel>>(){})).call();
    }

    /**
     * Create customers for this company
     * 
     * Create one or more customers for this company.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param model The list of customer objects to be created
     * @return ArrayList<CustomerModel>
     */
    public Future<ArrayList<CustomerModel>> createCustomersAsync(Integer companyId, ArrayList<CustomerModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<CustomerModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CustomerModel>>(){}));
    }

    /**
     * Delete a customer record
     * 
     * Deletes the customer object referenced by this URL.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @return CustomerModel
     */
    public CustomerModel deleteCustomer(Integer companyId, String customerCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return ((RestCall<CustomerModel>)restCallFactory.createRestCall("delete", path, null, new TypeToken<CustomerModel>(){})).call();
    }

    /**
     * Delete a customer record
     * 
     * Deletes the customer object referenced by this URL.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @return CustomerModel
     */
    public Future<CustomerModel> deleteCustomerAsync(Integer companyId, String customerCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return this.threadPool.submit((RestCall<CustomerModel>)restCallFactory.createRestCall("delete", path, null, new TypeToken<CustomerModel>(){}));
    }

    /**
     * Retrieve a single customer
     * 
     * Retrieve the customer identified by this URL.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this customer object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * You can use the `$include` parameter to fetch the following additional objects for expansion:
     * 
     * * Certificates - Fetch a list of certificates linked to this customer.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param include Specify optional additional objects to include in this fetch request
     * @return CustomerModel
     */
    public CustomerModel getCustomer(Integer companyId, String customerCode, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        path.addQuery("$include", include);
        return ((RestCall<CustomerModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CustomerModel>(){})).call();
    }

    /**
     * Retrieve a single customer
     * 
     * Retrieve the customer identified by this URL.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this customer object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * You can use the `$include` parameter to fetch the following additional objects for expansion:
     * 
     * * Certificates - Fetch a list of certificates linked to this customer.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param include Specify optional additional objects to include in this fetch request
     * @return CustomerModel
     */
    public Future<CustomerModel> getCustomerAsync(Integer companyId, String customerCode, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<CustomerModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CustomerModel>(){}));
    }

    /**
     * Link certificates to a customer
     * 
     * Link one or more certificates to a customer.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param model The list of certificates to link to this customer
     * @return FetchResult<CertificateModel>
     */
    public FetchResult<CertificateModel> linkCertificatesToCustomer(Integer companyId, String customerCode, LinkCertificatesModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certificates/link");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return ((RestCall<FetchResult<CertificateModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CertificateModel>>(){})).call();
    }

    /**
     * Link certificates to a customer
     * 
     * Link one or more certificates to a customer.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param model The list of certificates to link to this customer
     * @return FetchResult<CertificateModel>
     */
    public Future<FetchResult<CertificateModel>> linkCertificatesToCustomerAsync(Integer companyId, String customerCode, LinkCertificatesModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certificates/link");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return this.threadPool.submit((RestCall<FetchResult<CertificateModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CertificateModel>>(){}));
    }

    /**
     * List certificates linked to a customer
     * 
     * List all certificates linked to a customer.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param include OPTIONAL: A comma separated list of special fetch options. You can specify one or more of the following:      * Customers - Retrieves the list of customers linked to the certificate.   * PoNumbers - Retrieves all PO numbers tied to the certificate.   * Attributes - Retrieves all attributes applied to the certificate.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CertificateModel>
     */
    public FetchResult<CertificateModel> listCertificatesForCustomer(Integer companyId, String customerCode, String include, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certificates");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CertificateModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertificateModel>>(){})).call();
    }

    /**
     * List certificates linked to a customer
     * 
     * List all certificates linked to a customer.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param include OPTIONAL: A comma separated list of special fetch options. You can specify one or more of the following:      * Customers - Retrieves the list of customers linked to the certificate.   * PoNumbers - Retrieves all PO numbers tied to the certificate.   * Attributes - Retrieves all attributes applied to the certificate.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CertificateModel>
     */
    public Future<FetchResult<CertificateModel>> listCertificatesForCustomerAsync(Integer companyId, String customerCode, String include, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certificates");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CertificateModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertificateModel>>(){}));
    }

    /**
     * List active certificates for a location
     * 
     * List valid certificates linked to a customer in a particular country and region.
     * 
     * This API is intended to help identify whether a customer has already provided a certificate that
     * applies to a particular country and region.  This API is intended to help you remind a customer
     * when they have or have not provided copies of their exemption certificates to you during the sales
     * order process.  
     * 
     * If a customer does not have a certificate on file and they wish to provide one, you should send the customer
     * a CertExpress invitation link so that the customer can upload proof of their exemption certificate.  Please
     * see the `CreateCertExpressInvitation` API to create an invitation link for this customer.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param country Search for certificates matching this country. Uses the ISO 3166 two character country code.
     * @param region Search for certificates matching this region. Uses the ISO 3166 two or three character state, region, or province code.
     * @return ExemptionStatusModel
     */
    public ExemptionStatusModel listValidCertificatesForCustomer(Integer companyId, String customerCode, String country, String region) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certificates/{country}/{region}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        path.applyField("country", country);
        path.applyField("region", region);
        return ((RestCall<ExemptionStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ExemptionStatusModel>(){})).call();
    }

    /**
     * List active certificates for a location
     * 
     * List valid certificates linked to a customer in a particular country and region.
     * 
     * This API is intended to help identify whether a customer has already provided a certificate that
     * applies to a particular country and region.  This API is intended to help you remind a customer
     * when they have or have not provided copies of their exemption certificates to you during the sales
     * order process.  
     * 
     * If a customer does not have a certificate on file and they wish to provide one, you should send the customer
     * a CertExpress invitation link so that the customer can upload proof of their exemption certificate.  Please
     * see the `CreateCertExpressInvitation` API to create an invitation link for this customer.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param country Search for certificates matching this country. Uses the ISO 3166 two character country code.
     * @param region Search for certificates matching this region. Uses the ISO 3166 two or three character state, region, or province code.
     * @return ExemptionStatusModel
     */
    public Future<ExemptionStatusModel> listValidCertificatesForCustomerAsync(Integer companyId, String customerCode, String country, String region) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certificates/{country}/{region}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        path.applyField("country", country);
        path.applyField("region", region);
        return this.threadPool.submit((RestCall<ExemptionStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ExemptionStatusModel>(){}));
    }

    /**
     * List all customers for this company
     * 
     * List all customers recorded by this company matching the specified criteria.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * You can use the `$include` parameter to fetch the following additional objects for expansion:
     * 
     * * Certificates - Fetch a list of certificates linked to this customer.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param include OPTIONAL - You can specify the value `certificates` to fetch information about certificates linked to the customer.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CustomerModel>
     */
    public FetchResult<CustomerModel> queryCustomers(Integer companyId, String include, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers");
        path.applyField("companyId", companyId);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CustomerModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CustomerModel>>(){})).call();
    }

    /**
     * List all customers for this company
     * 
     * List all customers recorded by this company matching the specified criteria.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * You can use the `$include` parameter to fetch the following additional objects for expansion:
     * 
     * * Certificates - Fetch a list of certificates linked to this customer.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param include OPTIONAL - You can specify the value `certificates` to fetch information about certificates linked to the customer.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CustomerModel>
     */
    public Future<FetchResult<CustomerModel>> queryCustomersAsync(Integer companyId, String include, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers");
        path.applyField("companyId", companyId);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CustomerModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CustomerModel>>(){}));
    }

    /**
     * Unlink certificates from a customer
     * 
     * Remove one or more certificates to a customer.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param model The list of certificates to link to this customer
     * @return FetchResult<CertificateModel>
     */
    public FetchResult<CertificateModel> unlinkCertificatesFromCustomer(Integer companyId, String customerCode, LinkCertificatesModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certificates/unlink");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return ((RestCall<FetchResult<CertificateModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CertificateModel>>(){})).call();
    }

    /**
     * Unlink certificates from a customer
     * 
     * Remove one or more certificates to a customer.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param model The list of certificates to link to this customer
     * @return FetchResult<CertificateModel>
     */
    public Future<FetchResult<CertificateModel>> unlinkCertificatesFromCustomerAsync(Integer companyId, String customerCode, LinkCertificatesModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}/certificates/unlink");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return this.threadPool.submit((RestCall<FetchResult<CertificateModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<CertificateModel>>(){}));
    }

    /**
     * Update a single customer
     * 
     * Replace the customer object at this URL with a new record.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param model The new customer model that will replace the existing record at this URL
     * @return CustomerModel
     */
    public CustomerModel updateCustomer(Integer companyId, String customerCode, CustomerModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return ((RestCall<CustomerModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CustomerModel>(){})).call();
    }

    /**
     * Update a single customer
     * 
     * Replace the customer object at this URL with a new record.
     * 
     * A customer object defines information about a person or business that purchases products from your
     * company.  When you create a tax transaction in AvaTax, you can use the `customerCode` from this
     * record in your `CreateTransaction` API call.  AvaTax will search for this `customerCode` value and
     * identify any certificates linked to this `customer` object.  If any certificate applies to the transaction,
     * AvaTax will record the appropriate elements of the transaction as exempt and link it to the `certificate`.
     * 
     * Using exemption certificates endpoints requires setup of an auditable document storage for each company that will use certificates.
     * Companies that do not have this storage system set up will receive the error `CertCaptureNotConfiguredError` when they call exemption
     * certificate related APIs.  To check if this company is set up, call `GetCertificateSetup`.  To request setup of the auditable document 
     * 
     * @param companyId The unique ID number of the company that recorded this customer
     * @param customerCode The unique code representing this customer
     * @param model The new customer model that will replace the existing record at this URL
     * @return CustomerModel
     */
    public Future<CustomerModel> updateCustomerAsync(Integer companyId, String customerCode, CustomerModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/customers/{customerCode}");
        path.applyField("companyId", companyId);
        path.applyField("customerCode", customerCode);
        return this.threadPool.submit((RestCall<CustomerModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CustomerModel>(){}));
    }

    /**
     * Lists all parents of an HS Code.
     * 
     * Retrieves the specified HS code and all of its parents, reflecting all sections, chapters, headings, and subheadings
     * 
     * a list of HS Codes that are the parents and information branches of the HS Code for the given 
     * destination country, if lower detail is available. 
     * 
     * This API will include information branches if applicable. These do not have HS Codes and cannot be referenced,
     * but can contain information relevant to deciding the correct HS Code. 
     * 
     * This API is intended to be useful to review the descriptive hierarchy of an HS Code, which can be particularly helpful
     * 
     * @param country The name or code of the destination country.
     * @param hsCode The partial or full HS Code for which you would like to view all of the parents.
     * @return FetchResult<HsCodeModel>
     */
    public FetchResult<HsCodeModel> getCrossBorderCode(String country, String hsCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/crossborder/{country}/{hsCode}/hierarchy");
        path.applyField("country", country);
        path.applyField("hsCode", hsCode);
        return ((RestCall<FetchResult<HsCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<HsCodeModel>>(){})).call();
    }

    /**
     * Lists all parents of an HS Code.
     * 
     * Retrieves the specified HS code and all of its parents, reflecting all sections, chapters, headings, and subheadings
     * 
     * a list of HS Codes that are the parents and information branches of the HS Code for the given 
     * destination country, if lower detail is available. 
     * 
     * This API will include information branches if applicable. These do not have HS Codes and cannot be referenced,
     * but can contain information relevant to deciding the correct HS Code. 
     * 
     * This API is intended to be useful to review the descriptive hierarchy of an HS Code, which can be particularly helpful
     * 
     * @param country The name or code of the destination country.
     * @param hsCode The partial or full HS Code for which you would like to view all of the parents.
     * @return FetchResult<HsCodeModel>
     */
    public Future<FetchResult<HsCodeModel>> getCrossBorderCodeAsync(String country, String hsCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/crossborder/{country}/{hsCode}/hierarchy");
        path.applyField("country", country);
        path.applyField("hsCode", hsCode);
        return this.threadPool.submit((RestCall<FetchResult<HsCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<HsCodeModel>>(){}));
    }

    /**
     * Test whether a form supports online login verification
     * 
     * This API is intended to be useful to identify whether the user should be allowed
     * 
     * @param form The name of the form you would like to verify. This can be the tax form code or the legacy return name
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SkyscraperStatusModel>
     */
    public FetchResult<SkyscraperStatusModel> getLoginVerifierByForm(String form, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers/{form}");
        path.applyField("form", form);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){})).call();
    }

    /**
     * Test whether a form supports online login verification
     * 
     * This API is intended to be useful to identify whether the user should be allowed
     * 
     * @param form The name of the form you would like to verify. This can be the tax form code or the legacy return name
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SkyscraperStatusModel>
     */
    public Future<FetchResult<SkyscraperStatusModel>> getLoginVerifierByFormAsync(String form, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers/{form}");
        path.applyField("form", form);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){}));
    }

    /**
     * Retrieve the full list of the AvaFile Forms available
     * 
     * This API is deprecated. 
     * 
     * Please use the ListTaxForms API.
     * 
     * Returns the full list of Avalara-supported AvaFile Forms
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<AvaFileFormModel>
     */
    public FetchResult<AvaFileFormModel> listAvaFileForms(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/avafileforms");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<AvaFileFormModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<AvaFileFormModel>>(){})).call();
    }

    /**
     * Retrieve the full list of the AvaFile Forms available
     * 
     * This API is deprecated. 
     * 
     * Please use the ListTaxForms API.
     * 
     * Returns the full list of Avalara-supported AvaFile Forms
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<AvaFileFormModel>
     */
    public Future<FetchResult<AvaFileFormModel>> listAvaFileFormsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/avafileforms");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<AvaFileFormModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<AvaFileFormModel>>(){}));
    }

    /**
     * List certificate attributes used by a company
     * 
     * List the certificate attributes defined by a company.
     * 
     * A certificate may have multiple attributes that control its behavior.  You may apply or remove attributes to a
     * certificate at any time.
     * 
     * If you see the 'CertCaptureNotConfiguredError', please use CheckProvision and RequestProvision endpoints to
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CertificateAttributeModel>
     */
    public FetchResult<CertificateAttributeModel> listCertificateAttributes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/certificateattributes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CertificateAttributeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertificateAttributeModel>>(){})).call();
    }

    /**
     * List certificate attributes used by a company
     * 
     * List the certificate attributes defined by a company.
     * 
     * A certificate may have multiple attributes that control its behavior.  You may apply or remove attributes to a
     * certificate at any time.
     * 
     * If you see the 'CertCaptureNotConfiguredError', please use CheckProvision and RequestProvision endpoints to
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CertificateAttributeModel>
     */
    public Future<FetchResult<CertificateAttributeModel>> listCertificateAttributesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/certificateattributes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CertificateAttributeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CertificateAttributeModel>>(){}));
    }

    /**
     * List certificate attributes used by a company
     * 
     * List the certificate exempt reasons defined by a company.
     * 
     * An exemption reason defines why a certificate allows a customer to be exempt
     * for purposes of tax calculation.
     * 
     * If you see the 'CertCaptureNotConfiguredError', please use CheckProvision and RequestProvision endpoints to
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ExemptionReasonModel>
     */
    public FetchResult<ExemptionReasonModel> listCertificateExemptReasons(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/certificateexemptreasons");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ExemptionReasonModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ExemptionReasonModel>>(){})).call();
    }

    /**
     * List certificate attributes used by a company
     * 
     * List the certificate exempt reasons defined by a company.
     * 
     * An exemption reason defines why a certificate allows a customer to be exempt
     * for purposes of tax calculation.
     * 
     * If you see the 'CertCaptureNotConfiguredError', please use CheckProvision and RequestProvision endpoints to
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ExemptionReasonModel>
     */
    public Future<FetchResult<ExemptionReasonModel>> listCertificateExemptReasonsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/certificateexemptreasons");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ExemptionReasonModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ExemptionReasonModel>>(){}));
    }

    /**
     * List certificate exposure zones used by a company
     * 
     * List the certificate exposure zones defined by a company.
     * 
     * An exposure zone is a location where a certificate can be valid.  Exposure zones may indicate a taxing
     * authority or other legal entity to which a certificate may apply.
     * 
     * If you see the 'CertCaptureNotConfiguredError', please use CheckProvision and RequestProvision endpoints to
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ExposureZoneModel>
     */
    public FetchResult<ExposureZoneModel> listCertificateExposureZones(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/certificateexposurezones");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ExposureZoneModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ExposureZoneModel>>(){})).call();
    }

    /**
     * List certificate exposure zones used by a company
     * 
     * List the certificate exposure zones defined by a company.
     * 
     * An exposure zone is a location where a certificate can be valid.  Exposure zones may indicate a taxing
     * authority or other legal entity to which a certificate may apply.
     * 
     * If you see the 'CertCaptureNotConfiguredError', please use CheckProvision and RequestProvision endpoints to
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ExposureZoneModel>
     */
    public Future<FetchResult<ExposureZoneModel>> listCertificateExposureZonesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/certificateexposurezones");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ExposureZoneModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ExposureZoneModel>>(){}));
    }

    /**
     * Retrieve the full list of communications transactiontypes
     * 
     * Returns full list of communications transaction types which
     * 
     * @param id The transaction type ID to examine
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CommunicationsTSPairModel>
     */
    public FetchResult<CommunicationsTSPairModel> listCommunicationsServiceTypes(Integer id, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/communications/transactiontypes/{id}/servicetypes");
        path.applyField("id", id);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CommunicationsTSPairModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CommunicationsTSPairModel>>(){})).call();
    }

    /**
     * Retrieve the full list of communications transactiontypes
     * 
     * Returns full list of communications transaction types which
     * 
     * @param id The transaction type ID to examine
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CommunicationsTSPairModel>
     */
    public Future<FetchResult<CommunicationsTSPairModel>> listCommunicationsServiceTypesAsync(Integer id, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/communications/transactiontypes/{id}/servicetypes");
        path.applyField("id", id);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CommunicationsTSPairModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CommunicationsTSPairModel>>(){}));
    }

    /**
     * Retrieve the full list of communications transactiontypes
     * 
     * Returns full list of communications transaction types which
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CommunicationsTransactionTypeModel>
     */
    public FetchResult<CommunicationsTransactionTypeModel> listCommunicationsTransactionTypes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/communications/transactiontypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CommunicationsTransactionTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CommunicationsTransactionTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of communications transactiontypes
     * 
     * Returns full list of communications transaction types which
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CommunicationsTransactionTypeModel>
     */
    public Future<FetchResult<CommunicationsTransactionTypeModel>> listCommunicationsTransactionTypesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/communications/transactiontypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CommunicationsTransactionTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CommunicationsTransactionTypeModel>>(){}));
    }

    /**
     * Retrieve the full list of communications transaction/service type pairs
     * 
     * Returns full list of communications transaction/service type pairs which
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CommunicationsTSPairModel>
     */
    public FetchResult<CommunicationsTSPairModel> listCommunicationsTSPairs(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/communications/tspairs");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CommunicationsTSPairModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CommunicationsTSPairModel>>(){})).call();
    }

    /**
     * Retrieve the full list of communications transaction/service type pairs
     * 
     * Returns full list of communications transaction/service type pairs which
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CommunicationsTSPairModel>
     */
    public Future<FetchResult<CommunicationsTSPairModel>> listCommunicationsTSPairsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/communications/tspairs");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CommunicationsTSPairModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CommunicationsTSPairModel>>(){}));
    }

    /**
     * List all ISO 3166 countries
     * 
     * Returns a list of all ISO 3166 country codes, and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a country for 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<IsoCountryModel>
     */
    public FetchResult<IsoCountryModel> listCountries(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<IsoCountryModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoCountryModel>>(){})).call();
    }

    /**
     * List all ISO 3166 countries
     * 
     * Returns a list of all ISO 3166 country codes, and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a country for 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<IsoCountryModel>
     */
    public Future<FetchResult<IsoCountryModel>> listCountriesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<IsoCountryModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoCountryModel>>(){}));
    }

    /**
     * List certificate exposure zones used by a company
     * 
     * List available cover letters that can be used when sending invitation to use CertExpress to upload certificates.
     * 
     * The CoverLetter model represents a message sent along with an invitation to use CertExpress to
     * upload certificates.  An invitation allows customers to use CertExpress to upload their exemption 
     * certificates directly; this cover letter explains why the invitation was sent.
     * 
     * If you see the 'CertCaptureNotConfiguredError', please use CheckProvision and RequestProvision endpoints to
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CoverLetterModel>
     */
    public FetchResult<CoverLetterModel> listCoverLetters(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/coverletters");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CoverLetterModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CoverLetterModel>>(){})).call();
    }

    /**
     * List certificate exposure zones used by a company
     * 
     * List available cover letters that can be used when sending invitation to use CertExpress to upload certificates.
     * 
     * The CoverLetter model represents a message sent along with an invitation to use CertExpress to
     * upload certificates.  An invitation allows customers to use CertExpress to upload their exemption 
     * certificates directly; this cover letter explains why the invitation was sent.
     * 
     * If you see the 'CertCaptureNotConfiguredError', please use CheckProvision and RequestProvision endpoints to
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CoverLetterModel>
     */
    public Future<FetchResult<CoverLetterModel>> listCoverLettersAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/coverletters");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CoverLetterModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CoverLetterModel>>(){}));
    }

    /**
     * Lists the next level of HS Codes given a destination country and HS Code prefix.
     * 
     * Retrieves a list of HS Codes that are the children of the prefix for the given destination country, if 
     * additional children are available. 
     * 
     * HS Code is interchangeable with "tariff code" and definitions are generally unique to a destination country.
     * An HS Code describes an item and its eligibility/rate for tariffs. HS Codes are organized by 
     * Section/Chapter/Heading/Subheading/Classification.
     * 
     * 
     * @param country The name or code of the destination country.
     * @param hsCode The Section or partial HS Code for which you would like to view the next level of HS Code detail, if more detail is available.
     * @return FetchResult<HsCodeModel>
     */
    public FetchResult<HsCodeModel> listCrossBorderCodes(String country, String hsCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/crossborder/{country}/{hsCode}");
        path.applyField("country", country);
        path.applyField("hsCode", hsCode);
        return ((RestCall<FetchResult<HsCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<HsCodeModel>>(){})).call();
    }

    /**
     * Lists the next level of HS Codes given a destination country and HS Code prefix.
     * 
     * Retrieves a list of HS Codes that are the children of the prefix for the given destination country, if 
     * additional children are available. 
     * 
     * HS Code is interchangeable with "tariff code" and definitions are generally unique to a destination country.
     * An HS Code describes an item and its eligibility/rate for tariffs. HS Codes are organized by 
     * Section/Chapter/Heading/Subheading/Classification.
     * 
     * 
     * @param country The name or code of the destination country.
     * @param hsCode The Section or partial HS Code for which you would like to view the next level of HS Code detail, if more detail is available.
     * @return FetchResult<HsCodeModel>
     */
    public Future<FetchResult<HsCodeModel>> listCrossBorderCodesAsync(String country, String hsCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/crossborder/{country}/{hsCode}");
        path.applyField("country", country);
        path.applyField("hsCode", hsCode);
        return this.threadPool.submit((RestCall<FetchResult<HsCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<HsCodeModel>>(){}));
    }

    /**
     * List top level HS Code Sections.
     * 
     * Returns the full list of top level HS Code Sections. Sections are the broadest level of detail for 
     * classifying tariff codes and the items to which they apply. HS Codes are organized 
     * by Section/Chapter/Heading/Subheading/Classification.
     * 
     * This API is intended to be useful to identify the top level Sections for 
     * 
     * @return FetchResult<HsCodeModel>
     */
    public FetchResult<HsCodeModel> listCrossBorderSections() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/crossborder/sections");
        return ((RestCall<FetchResult<HsCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<HsCodeModel>>(){})).call();
    }

    /**
     * List top level HS Code Sections.
     * 
     * Returns the full list of top level HS Code Sections. Sections are the broadest level of detail for 
     * classifying tariff codes and the items to which they apply. HS Codes are organized 
     * by Section/Chapter/Heading/Subheading/Classification.
     * 
     * This API is intended to be useful to identify the top level Sections for 
     * 
     * @return FetchResult<HsCodeModel>
     */
    public Future<FetchResult<HsCodeModel>> listCrossBorderSectionsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/crossborder/sections");
        return this.threadPool.submit((RestCall<FetchResult<HsCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<HsCodeModel>>(){}));
    }

    /**
     * List all ISO 4217 currencies supported by AvaTax.
     * 
     * Lists all ISO 4217 currencies supported by AvaTax.
     * 
     * This API produces a list of currency codes that can be used when calling AvaTax.  The values from this API can be used to fill out the
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CurrencyModel>
     */
    public FetchResult<CurrencyModel> listCurrencies(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/currencies");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CurrencyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CurrencyModel>>(){})).call();
    }

    /**
     * List all ISO 4217 currencies supported by AvaTax.
     * 
     * Lists all ISO 4217 currencies supported by AvaTax.
     * 
     * This API produces a list of currency codes that can be used when calling AvaTax.  The values from this API can be used to fill out the
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CurrencyModel>
     */
    public Future<FetchResult<CurrencyModel>> listCurrenciesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/currencies");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CurrencyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CurrencyModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported entity use codes
     * 
     * Returns the full list of Avalara-supported entity use codes.
     * Entity/Use Codes are definitions of the entity who is purchasing something, or the purpose for which the transaction
     * is occurring.  This information is generally used to determine taxability of the product.
     * In order to facilitate correct reporting of your taxes, you are encouraged to select the proper entity use codes for
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<EntityUseCodeModel>
     */
    public FetchResult<EntityUseCodeModel> listEntityUseCodes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/entityusecodes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<EntityUseCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<EntityUseCodeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported entity use codes
     * 
     * Returns the full list of Avalara-supported entity use codes.
     * Entity/Use Codes are definitions of the entity who is purchasing something, or the purpose for which the transaction
     * is occurring.  This information is generally used to determine taxability of the product.
     * In order to facilitate correct reporting of your taxes, you are encouraged to select the proper entity use codes for
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<EntityUseCodeModel>
     */
    public Future<FetchResult<EntityUseCodeModel>> listEntityUseCodesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/entityusecodes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<EntityUseCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<EntityUseCodeModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported filing frequencies.
     * 
     * Returns the full list of Avalara-supported filing frequencies.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<FilingFrequencyModel>
     */
    public FetchResult<FilingFrequencyModel> listFilingFrequencies(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingfrequencies");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingFrequencyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingFrequencyModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported filing frequencies.
     * 
     * Returns the full list of Avalara-supported filing frequencies.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<FilingFrequencyModel>
     */
    public Future<FetchResult<FilingFrequencyModel>> listFilingFrequenciesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingfrequencies");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<FilingFrequencyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingFrequencyModel>>(){}));
    }

    /**
     * List jurisdictions based on the filter provided
     * 
     * Returns a list of all Avalara-supported taxing jurisdictions.
     * 
     * This API allows you to examine all Avalara-supported jurisdictions. You can filter your search by supplying
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<JurisdictionModel>
     */
    public FetchResult<JurisdictionModel> listJurisdictions(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/jurisdictions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<JurisdictionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionModel>>(){})).call();
    }

    /**
     * List jurisdictions based on the filter provided
     * 
     * Returns a list of all Avalara-supported taxing jurisdictions.
     * 
     * This API allows you to examine all Avalara-supported jurisdictions. You can filter your search by supplying
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<JurisdictionModel>
     */
    public Future<FetchResult<JurisdictionModel>> listJurisdictionsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/jurisdictions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<JurisdictionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionModel>>(){}));
    }

    /**
     * List jurisdictions near a specific address
     * 
     * Returns a list of all Avalara-supported taxing jurisdictions that apply to this address.
     * 
     * This API allows you to identify which jurisdictions are nearby a specific address according to the best available geocoding information.
     * It is intended to allow you to create a "Jurisdiction Override", which allows an address to be configured as belonging to a nearby 
     * jurisdiction in AvaTax.
     *             
     * 
     * @param line1 The first address line portion of this address.
     * @param line2 The second address line portion of this address.
     * @param line3 The third address line portion of this address.
     * @param city The city portion of this address.
     * @param region The region, state, or province code portion of this address.
     * @param postalCode The postal code or zip code portion of this address.
     * @param country The two-character ISO-3166 code of the country portion of this address.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<JurisdictionOverrideModel>
     */
    public FetchResult<JurisdictionOverrideModel> listJurisdictionsByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/jurisdictionsnearaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
    }

    /**
     * List jurisdictions near a specific address
     * 
     * Returns a list of all Avalara-supported taxing jurisdictions that apply to this address.
     * 
     * This API allows you to identify which jurisdictions are nearby a specific address according to the best available geocoding information.
     * It is intended to allow you to create a "Jurisdiction Override", which allows an address to be configured as belonging to a nearby 
     * jurisdiction in AvaTax.
     *             
     * 
     * @param line1 The first address line portion of this address.
     * @param line2 The second address line portion of this address.
     * @param line3 The third address line portion of this address.
     * @param city The city portion of this address.
     * @param region The region, state, or province code portion of this address.
     * @param postalCode The postal code or zip code portion of this address.
     * @param country The two-character ISO-3166 code of the country portion of this address.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<JurisdictionOverrideModel>
     */
    public Future<FetchResult<JurisdictionOverrideModel>> listJurisdictionsByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/jurisdictionsnearaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){}));
    }

    /**
     * Retrieve the list of questions that are required for a tax location
     * 
     * Returns the list of additional questions you must answer when declaring a location in certain taxing jurisdictions.
     * Some tax jurisdictions require that you register or provide additional information to configure each physical place where
     * your company does business.
     * This information is not usually required in order to calculate tax correctly, but is almost always required to file your tax correctly.
     * You can call this API call for any address and obtain information about what questions must be answered in order to properly
     * 
     * @param line1 The first line of this location's address.
     * @param line2 The second line of this location's address.
     * @param line3 The third line of this location's address.
     * @param city The city part of this location's address.
     * @param region The region, state, or province part of this location's address.
     * @param postalCode The postal code of this location's address.
     * @param country The country part of this location's address.
     * @param latitude Optionally identify the location via latitude/longitude instead of via address.
     * @param longitude Optionally identify the location via latitude/longitude instead of via address.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<LocationQuestionModel>
     */
    public FetchResult<LocationQuestionModel> listLocationQuestionsByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country, BigDecimal latitude, BigDecimal longitude, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/locationquestions");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        path.addQuery("latitude", latitude);
        path.addQuery("longitude", longitude);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<LocationQuestionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationQuestionModel>>(){})).call();
    }

    /**
     * Retrieve the list of questions that are required for a tax location
     * 
     * Returns the list of additional questions you must answer when declaring a location in certain taxing jurisdictions.
     * Some tax jurisdictions require that you register or provide additional information to configure each physical place where
     * your company does business.
     * This information is not usually required in order to calculate tax correctly, but is almost always required to file your tax correctly.
     * You can call this API call for any address and obtain information about what questions must be answered in order to properly
     * 
     * @param line1 The first line of this location's address.
     * @param line2 The second line of this location's address.
     * @param line3 The third line of this location's address.
     * @param city The city part of this location's address.
     * @param region The region, state, or province part of this location's address.
     * @param postalCode The postal code of this location's address.
     * @param country The country part of this location's address.
     * @param latitude Optionally identify the location via latitude/longitude instead of via address.
     * @param longitude Optionally identify the location via latitude/longitude instead of via address.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<LocationQuestionModel>
     */
    public Future<FetchResult<LocationQuestionModel>> listLocationQuestionsByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country, BigDecimal latitude, BigDecimal longitude, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/locationquestions");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        path.addQuery("latitude", latitude);
        path.addQuery("longitude", longitude);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<LocationQuestionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationQuestionModel>>(){}));
    }

    /**
     * List all forms where logins can be verified automatically
     * 
     * List all forms where logins can be verified automatically.
     * This API is intended to be useful to identify whether the user should be allowed
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SkyscraperStatusModel>
     */
    public FetchResult<SkyscraperStatusModel> listLoginVerifiers(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){})).call();
    }

    /**
     * List all forms where logins can be verified automatically
     * 
     * List all forms where logins can be verified automatically.
     * This API is intended to be useful to identify whether the user should be allowed
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SkyscraperStatusModel>
     */
    public Future<FetchResult<SkyscraperStatusModel>> listLoginVerifiersAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for all countries and regions.
     * 
     * Returns the full list of all Avalara-supported nexus for all countries and regions. 
     * 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public FetchResult<NexusModel> listNexus(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for all countries and regions.
     * 
     * Returns the full list of all Avalara-supported nexus for all countries and regions. 
     * 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public Future<FetchResult<NexusModel>> listNexusAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    /**
     * List all nexus that apply to a specific address.
     * 
     * Returns a list of all Avalara-supported taxing jurisdictions that apply to this address.
     * This API allows you to identify which tax authorities apply to a physical location, salesperson address, or point of sale.
     * In general, it is usually expected that a company will declare nexus in all the jurisdictions that apply to each physical address
     * where the company does business.
     * 
     * @param line1 The first address line portion of this address.
     * @param line2 The first address line portion of this address.
     * @param line3 The first address line portion of this address.
     * @param city The city portion of this address.
     * @param region Name or ISO 3166 code identifying the region portion of the address.      This field supports many different region identifiers:   * Two and three character ISO 3166 region codes   * Fully spelled out names of the region in ISO supported languages   * Common alternative spellings for many regions      For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     * @param postalCode The postal code or zip code portion of this address.
     * @param country Name or ISO 3166 code identifying the country portion of this address.      This field supports many different country identifiers:   * Two character ISO 3166 codes   * Three character ISO 3166 codes   * Fully spelled out names of the country in ISO supported languages   * Common alternative spellings for many countries      For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public FetchResult<NexusModel> listNexusByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * List all nexus that apply to a specific address.
     * 
     * Returns a list of all Avalara-supported taxing jurisdictions that apply to this address.
     * This API allows you to identify which tax authorities apply to a physical location, salesperson address, or point of sale.
     * In general, it is usually expected that a company will declare nexus in all the jurisdictions that apply to each physical address
     * where the company does business.
     * 
     * @param line1 The first address line portion of this address.
     * @param line2 The first address line portion of this address.
     * @param line3 The first address line portion of this address.
     * @param city The city portion of this address.
     * @param region Name or ISO 3166 code identifying the region portion of the address.      This field supports many different region identifiers:   * Two and three character ISO 3166 region codes   * Fully spelled out names of the region in ISO supported languages   * Common alternative spellings for many regions      For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     * @param postalCode The postal code or zip code portion of this address.
     * @param country Name or ISO 3166 code identifying the country portion of this address.      This field supports many different country identifiers:   * Two character ISO 3166 codes   * Three character ISO 3166 codes   * Fully spelled out names of the country in ISO supported languages   * Common alternative spellings for many countries      For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public Future<FetchResult<NexusModel>> listNexusByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for a country.
     * 
     * Returns all Avalara-supported nexus for the specified country.
     * 
     * 
     * @param country The country in which you want to fetch the system nexus
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public FetchResult<NexusModel> listNexusByCountry(String country, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}");
        path.applyField("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for a country.
     * 
     * Returns all Avalara-supported nexus for the specified country.
     * 
     * 
     * @param country The country in which you want to fetch the system nexus
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public Future<FetchResult<NexusModel>> listNexusByCountryAsync(String country, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}");
        path.applyField("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for a country and region.
     * 
     * Returns all Avalara-supported nexus for the specified country and region.
     * 
     * 
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public FetchResult<NexusModel> listNexusByCountryAndRegion(String country, String region, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}/{region}");
        path.applyField("country", country);
        path.applyField("region", region);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for a country and region.
     * 
     * Returns all Avalara-supported nexus for the specified country and region.
     * 
     * 
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public Future<FetchResult<NexusModel>> listNexusByCountryAndRegionAsync(String country, String region, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}/{region}");
        path.applyField("country", country);
        path.applyField("region", region);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    /**
     * List nexus related to a tax form
     * 
     * Retrieves a list of nexus related to a tax form.
     * 
     * The concept of `Nexus` indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * 
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * 
     * This API is intended to provide useful information when examining a tax form.  If you are about to begin filing
     * a tax form, you may want to know whether you have declared nexus in all the jurisdictions related to that tax 
     * 
     * @param formCode The form code that we are looking up the nexus for
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return NexusByTaxFormModel
     */
    public NexusByTaxFormModel listNexusByFormCode(String formCode, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byform/{formCode}");
        path.applyField("formCode", formCode);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusByTaxFormModel>(){})).call();
    }

    /**
     * List nexus related to a tax form
     * 
     * Retrieves a list of nexus related to a tax form.
     * 
     * The concept of `Nexus` indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * 
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * 
     * This API is intended to provide useful information when examining a tax form.  If you are about to begin filing
     * a tax form, you may want to know whether you have declared nexus in all the jurisdictions related to that tax 
     * 
     * @param formCode The form code that we are looking up the nexus for
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return NexusByTaxFormModel
     */
    public Future<NexusByTaxFormModel> listNexusByFormCodeAsync(String formCode, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byform/{formCode}");
        path.applyField("formCode", formCode);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusByTaxFormModel>(){}));
    }

    /**
     * Retrieve the full list of nexus tax type groups
     * 
     * Returns the full list of Avalara-supported nexus tax type groups
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusTaxTypeGroupModel>
     */
    public FetchResult<NexusTaxTypeGroupModel> listNexusTaxTypeGroups(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexustaxtypegroups");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusTaxTypeGroupModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusTaxTypeGroupModel>>(){})).call();
    }

    /**
     * Retrieve the full list of nexus tax type groups
     * 
     * Returns the full list of Avalara-supported nexus tax type groups
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusTaxTypeGroupModel>
     */
    public Future<FetchResult<NexusTaxTypeGroupModel>> listNexusTaxTypeGroupsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexustaxtypegroups");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusTaxTypeGroupModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusTaxTypeGroupModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice customer funding options.
     * 
     * Returns the full list of Avalara-supported tax notice customer funding options.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeCustomerFundingOptionModel>
     */
    public FetchResult<NoticeCustomerFundingOptionModel> listNoticeCustomerFundingOptions(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomerfundingoptions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeCustomerFundingOptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCustomerFundingOptionModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice customer funding options.
     * 
     * Returns the full list of Avalara-supported tax notice customer funding options.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeCustomerFundingOptionModel>
     */
    public Future<FetchResult<NoticeCustomerFundingOptionModel>> listNoticeCustomerFundingOptionsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomerfundingoptions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeCustomerFundingOptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCustomerFundingOptionModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice customer types.
     * 
     * Returns the full list of Avalara-supported tax notice customer types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeCustomerTypeModel>
     */
    public FetchResult<NoticeCustomerTypeModel> listNoticeCustomerTypes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomertypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeCustomerTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCustomerTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice customer types.
     * 
     * Returns the full list of Avalara-supported tax notice customer types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeCustomerTypeModel>
     */
    public Future<FetchResult<NoticeCustomerTypeModel>> listNoticeCustomerTypesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomertypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeCustomerTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCustomerTypeModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice filing types.
     * 
     * Returns the full list of Avalara-supported tax notice filing types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeFilingTypeModel>
     */
    public FetchResult<NoticeFilingTypeModel> listNoticeFilingtypes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticefilingtypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeFilingTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeFilingTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice filing types.
     * 
     * Returns the full list of Avalara-supported tax notice filing types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeFilingTypeModel>
     */
    public Future<FetchResult<NoticeFilingTypeModel>> listNoticeFilingtypesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticefilingtypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeFilingTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeFilingTypeModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice priorities.
     * 
     * Returns the full list of Avalara-supported tax notice priorities.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticePriorityModel>
     */
    public FetchResult<NoticePriorityModel> listNoticePriorities(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticepriorities");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticePriorityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticePriorityModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice priorities.
     * 
     * Returns the full list of Avalara-supported tax notice priorities.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticePriorityModel>
     */
    public Future<FetchResult<NoticePriorityModel>> listNoticePrioritiesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticepriorities");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticePriorityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticePriorityModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice reasons.
     * 
     * Returns the full list of Avalara-supported tax notice reasons.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeReasonModel>
     */
    public FetchResult<NoticeReasonModel> listNoticeReasons(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticereasons");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeReasonModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeReasonModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice reasons.
     * 
     * Returns the full list of Avalara-supported tax notice reasons.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeReasonModel>
     */
    public Future<FetchResult<NoticeReasonModel>> listNoticeReasonsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticereasons");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeReasonModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeReasonModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice responsibility ids
     * 
     * Returns the full list of Avalara-supported tax notice responsibility ids
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeResponsibilityModel>
     */
    public FetchResult<NoticeResponsibilityModel> listNoticeResponsibilities(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticeresponsibilities");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeResponsibilityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeResponsibilityModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice responsibility ids
     * 
     * Returns the full list of Avalara-supported tax notice responsibility ids
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeResponsibilityModel>
     */
    public Future<FetchResult<NoticeResponsibilityModel>> listNoticeResponsibilitiesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticeresponsibilities");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeResponsibilityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeResponsibilityModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice root causes
     * 
     * Returns the full list of Avalara-supported tax notice root causes
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeRootCauseModel>
     */
    public FetchResult<NoticeRootCauseModel> listNoticeRootCauses(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticerootcauses");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeRootCauseModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeRootCauseModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice root causes
     * 
     * Returns the full list of Avalara-supported tax notice root causes
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeRootCauseModel>
     */
    public Future<FetchResult<NoticeRootCauseModel>> listNoticeRootCausesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticerootcauses");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeRootCauseModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeRootCauseModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice statuses.
     * 
     * Returns the full list of Avalara-supported tax notice statuses.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeStatusModel>
     */
    public FetchResult<NoticeStatusModel> listNoticeStatuses(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticestatuses");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeStatusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice statuses.
     * 
     * Returns the full list of Avalara-supported tax notice statuses.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeStatusModel>
     */
    public Future<FetchResult<NoticeStatusModel>> listNoticeStatusesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticestatuses");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeStatusModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice types.
     * 
     * Returns the full list of Avalara-supported tax notice types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeTypeModel>
     */
    public FetchResult<NoticeTypeModel> listNoticeTypes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticetypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice types.
     * 
     * Returns the full list of Avalara-supported tax notice types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeTypeModel>
     */
    public Future<FetchResult<NoticeTypeModel>> listNoticeTypesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticetypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeTypeModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported extra parameters for creating transactions.
     * 
     * Returns the full list of Avalara-supported extra parameters for the 'Create Transaction' API call.
     * This list of parameters is available for use when configuring your transaction.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ParameterModel>
     */
    public FetchResult<ParameterModel> listParameters(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/parameters");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ParameterModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ParameterModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported extra parameters for creating transactions.
     * 
     * Returns the full list of Avalara-supported extra parameters for the 'Create Transaction' API call.
     * This list of parameters is available for use when configuring your transaction.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ParameterModel>
     */
    public Future<FetchResult<ParameterModel>> listParametersAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/parameters");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ParameterModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ParameterModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported permissions
     * 
     * Returns the full list of Avalara-supported permission types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<String>
     */
    public FetchResult<String> listPermissions(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/permissions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<String>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported permissions
     * 
     * Returns the full list of Avalara-supported permission types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<String>
     */
    public Future<FetchResult<String>> listPermissionsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/permissions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<String>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported postal codes.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<PostalCodeModel>
     */
    public FetchResult<PostalCodeModel> listPostalCodes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/postalcodes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<PostalCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<PostalCodeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported postal codes.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<PostalCodeModel>
     */
    public Future<FetchResult<PostalCodeModel>> listPostalCodesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/postalcodes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<PostalCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<PostalCodeModel>>(){}));
    }

    /**
     * List all customs duty programs recognized by AvaTax
     * 
     * List all preferred customs duty programs recognized by AvaTax.
     * 
     * A customs duty program is an optional program you can use to obtain favorable treatment from customs and duty agents.
     * An example of a preferred program is NAFTA, which provides preferential rates for products being shipped from neighboring
     * countries.
     * 
     * To select a preferred program for calculating customs and duty rates, call this API to find the appropriate code for your
     * preferred program.  Next, set the parameter `AvaTax.LC.PreferredProgram` in your `CreateTransaction` call to the code of
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<PreferredProgramModel>
     */
    public FetchResult<PreferredProgramModel> listPreferredPrograms(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/preferredprograms");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<PreferredProgramModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<PreferredProgramModel>>(){})).call();
    }

    /**
     * List all customs duty programs recognized by AvaTax
     * 
     * List all preferred customs duty programs recognized by AvaTax.
     * 
     * A customs duty program is an optional program you can use to obtain favorable treatment from customs and duty agents.
     * An example of a preferred program is NAFTA, which provides preferential rates for products being shipped from neighboring
     * countries.
     * 
     * To select a preferred program for calculating customs and duty rates, call this API to find the appropriate code for your
     * preferred program.  Next, set the parameter `AvaTax.LC.PreferredProgram` in your `CreateTransaction` call to the code of
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<PreferredProgramModel>
     */
    public Future<FetchResult<PreferredProgramModel>> listPreferredProgramsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/preferredprograms");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<PreferredProgramModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<PreferredProgramModel>>(){}));
    }

    /**
     * Retrieve the full list of rate types for each country
     * 
     * Returns the full list of Avalara-supported rate type file types
     * 
     * @param country The country to examine for rate types
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<RateTypeModel>
     */
    public FetchResult<RateTypeModel> listRateTypesByCountry(String country, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/ratetypes");
        path.applyField("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<RateTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<RateTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of rate types for each country
     * 
     * Returns the full list of Avalara-supported rate type file types
     * 
     * @param country The country to examine for rate types
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<RateTypeModel>
     */
    public Future<FetchResult<RateTypeModel>> listRateTypesByCountryAsync(String country, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/ratetypes");
        path.applyField("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<RateTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<RateTypeModel>>(){}));
    }

    /**
     * List all ISO 3166 regions
     * 
     * Returns a list of all ISO 3166 region codes and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a region 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<IsoRegionModel>
     */
    public FetchResult<IsoRegionModel> listRegions(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/regions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){})).call();
    }

    /**
     * List all ISO 3166 regions
     * 
     * Returns a list of all ISO 3166 region codes and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a region 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<IsoRegionModel>
     */
    public Future<FetchResult<IsoRegionModel>> listRegionsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/regions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){}));
    }

    /**
     * List all ISO 3166 regions for a country
     * 
     * Returns a list of all ISO 3166 region codes for a specific country code, and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a region 
     * 
     * @param country The country of which you want to fetch ISO 3166 regions
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<IsoRegionModel>
     */
    public FetchResult<IsoRegionModel> listRegionsByCountry(String country, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/regions");
        path.applyField("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){})).call();
    }

    /**
     * List all ISO 3166 regions for a country
     * 
     * Returns a list of all ISO 3166 region codes for a specific country code, and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a region 
     * 
     * @param country The country of which you want to fetch ISO 3166 regions
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<IsoRegionModel>
     */
    public Future<FetchResult<IsoRegionModel>> listRegionsByCountryAsync(String country, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/regions");
        path.applyField("country", country);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported resource file types
     * 
     * Returns the full list of Avalara-supported resource file types
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ResourceFileTypeModel>
     */
    public FetchResult<ResourceFileTypeModel> listResourceFileTypes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/resourcefiletypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ResourceFileTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ResourceFileTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported resource file types
     * 
     * Returns the full list of Avalara-supported resource file types
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ResourceFileTypeModel>
     */
    public Future<FetchResult<ResourceFileTypeModel>> listResourceFileTypesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/resourcefiletypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ResourceFileTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ResourceFileTypeModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported permissions
     * 
     * Returns the full list of Avalara-supported permission types.
     * This API is intended to be useful when designing a user interface for selecting the security role of a user account.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SecurityRoleModel>
     */
    public FetchResult<SecurityRoleModel> listSecurityRoles(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/securityroles");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SecurityRoleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SecurityRoleModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported permissions
     * 
     * Returns the full list of Avalara-supported permission types.
     * This API is intended to be useful when designing a user interface for selecting the security role of a user account.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SecurityRoleModel>
     */
    public Future<FetchResult<SecurityRoleModel>> listSecurityRolesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/securityroles");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SecurityRoleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SecurityRoleModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported subscription types
     * 
     * Returns the full list of Avalara-supported subscription types.
     * This API is intended to be useful for identifying which features you have added to your account.
     * You may always contact Avalara's sales department for information on available products or services.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SubscriptionTypeModel>
     */
    public FetchResult<SubscriptionTypeModel> listSubscriptionTypes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/subscriptiontypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SubscriptionTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported subscription types
     * 
     * Returns the full list of Avalara-supported subscription types.
     * This API is intended to be useful for identifying which features you have added to your account.
     * You may always contact Avalara's sales department for information on available products or services.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SubscriptionTypeModel>
     */
    public Future<FetchResult<SubscriptionTypeModel>> listSubscriptionTypesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/subscriptiontypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SubscriptionTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionTypeModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax authorities.
     * 
     * Returns the full list of Avalara-supported tax authorities.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxAuthorityModel>
     */
    public FetchResult<TaxAuthorityModel> listTaxAuthorities(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorities");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxAuthorityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax authorities.
     * 
     * Returns the full list of Avalara-supported tax authorities.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxAuthorityModel>
     */
    public Future<FetchResult<TaxAuthorityModel>> listTaxAuthoritiesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorities");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxAuthorityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported forms for each tax authority.
     * 
     * Returns the full list of Avalara-supported forms for each tax authority.
     * This list represents tax forms that Avalara recognizes.
     * Customers who subscribe to Avalara Managed Returns Service can request these forms to be filed automatically 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxAuthorityFormModel>
     */
    public FetchResult<TaxAuthorityFormModel> listTaxAuthorityForms(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorityforms");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxAuthorityFormModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityFormModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported forms for each tax authority.
     * 
     * Returns the full list of Avalara-supported forms for each tax authority.
     * This list represents tax forms that Avalara recognizes.
     * Customers who subscribe to Avalara Managed Returns Service can request these forms to be filed automatically 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxAuthorityFormModel>
     */
    public Future<FetchResult<TaxAuthorityFormModel>> listTaxAuthorityFormsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorityforms");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxAuthorityFormModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityFormModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax authority types.
     * 
     * Returns the full list of Avalara-supported tax authority types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxAuthorityTypeModel>
     */
    public FetchResult<TaxAuthorityTypeModel> listTaxAuthorityTypes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthoritytypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxAuthorityTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax authority types.
     * 
     * Returns the full list of Avalara-supported tax authority types.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxAuthorityTypeModel>
     */
    public Future<FetchResult<TaxAuthorityTypeModel>> listTaxAuthorityTypesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthoritytypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxAuthorityTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityTypeModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax codes.
     * 
     * Retrieves the list of Avalara-supported system tax codes.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxCodeModel>
     */
    public FetchResult<TaxCodeModel> listTaxCodes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax codes.
     * 
     * Retrieves the list of Avalara-supported system tax codes.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxCodeModel>
     */
    public Future<FetchResult<TaxCodeModel>> listTaxCodesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){}));
    }

    /**
     * Retrieve the full list of Avalara-supported tax code types.
     * 
     * Returns the full list of recognized tax code types.
     * A 'Tax Code Type' represents a broad category of tax codes, and is less detailed than a single TaxCode.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return TaxCodeTypesModel
     */
    public TaxCodeTypesModel listTaxCodeTypes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodetypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<TaxCodeTypesModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxCodeTypesModel>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax code types.
     * 
     * Returns the full list of recognized tax code types.
     * A 'Tax Code Type' represents a broad category of tax codes, and is less detailed than a single TaxCode.
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return TaxCodeTypesModel
     */
    public Future<TaxCodeTypesModel> listTaxCodeTypesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodetypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<TaxCodeTypesModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxCodeTypesModel>(){}));
    }

    /**
     * Retrieve the full list of the Tax Forms available
     * 
     * Returns the full list of Avalara-supported Tax Forms
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<FormMasterModel>
     */
    public FetchResult<FormMasterModel> listTaxForms(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxforms");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FormMasterModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FormMasterModel>>(){})).call();
    }

    /**
     * Retrieve the full list of the Tax Forms available
     * 
     * Returns the full list of Avalara-supported Tax Forms
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<FormMasterModel>
     */
    public Future<FetchResult<FormMasterModel>> listTaxFormsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxforms");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<FormMasterModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FormMasterModel>>(){}));
    }

    /**
     * Retrieve the full list of tax sub types
     * 
     * Returns the full list of Avalara-supported tax sub-types
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxSubTypeModel>
     */
    public FetchResult<TaxSubTypeModel> listTaxSubTypes(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxsubtypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxSubTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxSubTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of tax sub types
     * 
     * Returns the full list of Avalara-supported tax sub-types
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxSubTypeModel>
     */
    public Future<FetchResult<TaxSubTypeModel>> listTaxSubTypesAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxsubtypes");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxSubTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxSubTypeModel>>(){}));
    }

    /**
     * Retrieve the full list of tax type groups
     * 
     * Returns the full list of Avalara-supported tax type groups
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxTypeGroupModel>
     */
    public FetchResult<TaxTypeGroupModel> listTaxTypeGroups(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxtypegroups");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxTypeGroupModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxTypeGroupModel>>(){})).call();
    }

    /**
     * Retrieve the full list of tax type groups
     * 
     * Returns the full list of Avalara-supported tax type groups
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxTypeGroupModel>
     */
    public Future<FetchResult<TaxTypeGroupModel>> listTaxTypeGroupsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxtypegroups");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxTypeGroupModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxTypeGroupModel>>(){}));
    }

    /**
     * List all defined units of measurement
     * 
     * List all units of measurement systems defined by Avalara.
     * 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UomModel>
     */
    public FetchResult<UomModel> listUnitOfMeasurement(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/unitofmeasurements");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UomModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UomModel>>(){})).call();
    }

    /**
     * List all defined units of measurement
     * 
     * List all units of measurement systems defined by Avalara.
     * 
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UomModel>
     */
    public Future<FetchResult<UomModel>> listUnitOfMeasurementAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/unitofmeasurements");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UomModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UomModel>>(){}));
    }

    /**
     * Create one or more DistanceThreshold objects
     * 
     * Create one or more DistanceThreshold objects for this company.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * 
     * @param companyId The unique ID number of the company that owns this DistanceThreshold
     * @param model The DistanceThreshold object or objects you wish to create.
     * @return ArrayList<CompanyDistanceThresholdModel>
     */
    public ArrayList<CompanyDistanceThresholdModel> createDistanceThreshold(Integer companyId, ArrayList<CompanyDistanceThresholdModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<CompanyDistanceThresholdModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyDistanceThresholdModel>>(){})).call();
    }

    /**
     * Create one or more DistanceThreshold objects
     * 
     * Create one or more DistanceThreshold objects for this company.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * 
     * @param companyId The unique ID number of the company that owns this DistanceThreshold
     * @param model The DistanceThreshold object or objects you wish to create.
     * @return ArrayList<CompanyDistanceThresholdModel>
     */
    public Future<ArrayList<CompanyDistanceThresholdModel>> createDistanceThresholdAsync(Integer companyId, ArrayList<CompanyDistanceThresholdModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<CompanyDistanceThresholdModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyDistanceThresholdModel>>(){}));
    }

    /**
     * Delete a single DistanceThreshold object
     * 
     * Marks the DistanceThreshold object identified by this URL as deleted.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * 
     * @param companyId The unique ID number of the company that owns this DistanceThreshold
     * @param id The unique ID number of the DistanceThreshold object you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteDistanceThreshold(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single DistanceThreshold object
     * 
     * Marks the DistanceThreshold object identified by this URL as deleted.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * 
     * @param companyId The unique ID number of the company that owns this DistanceThreshold
     * @param id The unique ID number of the DistanceThreshold object you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteDistanceThresholdAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single DistanceThreshold
     * 
     * Retrieves a single DistanceThreshold object defined by this URL.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * 
     * @param companyId The ID of the company that owns this DistanceThreshold object
     * @param id The unique ID number referring to this DistanceThreshold object
     * @return CompanyDistanceThresholdModel
     */
    public CompanyDistanceThresholdModel getDistanceThreshold(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<CompanyDistanceThresholdModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CompanyDistanceThresholdModel>(){})).call();
    }

    /**
     * Retrieve a single DistanceThreshold
     * 
     * Retrieves a single DistanceThreshold object defined by this URL.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * 
     * @param companyId The ID of the company that owns this DistanceThreshold object
     * @param id The unique ID number referring to this DistanceThreshold object
     * @return CompanyDistanceThresholdModel
     */
    public Future<CompanyDistanceThresholdModel> getDistanceThresholdAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CompanyDistanceThresholdModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CompanyDistanceThresholdModel>(){}));
    }

    /**
     * Retrieve all DistanceThresholds for this company.
     * 
     * Lists all DistanceThreshold objects that belong to this company.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * 
     * @param companyId The ID of the company whose DistanceThreshold objects you wish to list.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CompanyDistanceThresholdModel>
     */
    public FetchResult<CompanyDistanceThresholdModel> listDistanceThresholds(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CompanyDistanceThresholdModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CompanyDistanceThresholdModel>>(){})).call();
    }

    /**
     * Retrieve all DistanceThresholds for this company.
     * 
     * Lists all DistanceThreshold objects that belong to this company.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * 
     * @param companyId The ID of the company whose DistanceThreshold objects you wish to list.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CompanyDistanceThresholdModel>
     */
    public Future<FetchResult<CompanyDistanceThresholdModel>> listDistanceThresholdsAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CompanyDistanceThresholdModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CompanyDistanceThresholdModel>>(){}));
    }

    /**
     * Retrieve all DistanceThreshold objects
     * 
     * Lists all DistanceThreshold objects that belong to this account.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * to correctly calculate some value-added taxes.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CompanyDistanceThresholdModel>
     */
    public FetchResult<CompanyDistanceThresholdModel> queryDistanceThresholds(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/distancethresholds");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CompanyDistanceThresholdModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CompanyDistanceThresholdModel>>(){})).call();
    }

    /**
     * Retrieve all DistanceThreshold objects
     * 
     * Lists all DistanceThreshold objects that belong to this account.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * to correctly calculate some value-added taxes.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<CompanyDistanceThresholdModel>
     */
    public Future<FetchResult<CompanyDistanceThresholdModel>> queryDistanceThresholdsAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/distancethresholds");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CompanyDistanceThresholdModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CompanyDistanceThresholdModel>>(){}));
    }

    /**
     * Update a DistanceThreshold object
     * 
     * Replace the existing DistanceThreshold object at this URL with an updated object.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * to correctly calculate some value-added taxes.
     *             
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The unique ID number of the company that owns this DistanceThreshold object.
     * @param id The unique ID number of the DistanceThreshold object to replace.
     * @param model The new DistanceThreshold object to store.
     * @return CompanyDistanceThresholdModel
     */
    public CompanyDistanceThresholdModel updateDistanceThreshold(Integer companyId, Long id, CompanyDistanceThresholdModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<CompanyDistanceThresholdModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CompanyDistanceThresholdModel>(){})).call();
    }

    /**
     * Update a DistanceThreshold object
     * 
     * Replace the existing DistanceThreshold object at this URL with an updated object.
     * 
     * A company-distance-threshold model indicates the distance between a company
     * and the taxing borders of various countries.  Distance thresholds are necessary
     * to correctly calculate some value-added taxes.
     *             
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The unique ID number of the company that owns this DistanceThreshold object.
     * @param id The unique ID number of the DistanceThreshold object to replace.
     * @param model The new DistanceThreshold object to store.
     * @return CompanyDistanceThresholdModel
     */
    public Future<CompanyDistanceThresholdModel> updateDistanceThresholdAsync(Integer companyId, Long id, CompanyDistanceThresholdModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/distancethresholds/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CompanyDistanceThresholdModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CompanyDistanceThresholdModel>(){}));
    }

    /**
     * Approve existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * are reviewed and validated by Avalara Compliance before being implemented.
     * 
     * @param companyId The unique ID of the company that owns the filing request object
     * @param id The unique ID of the filing request object
     * @return FilingRequestModel
     */
    public FilingRequestModel approveFilingRequest(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/approve");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Approve existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * are reviewed and validated by Avalara Compliance before being implemented.
     * 
     * @param companyId The unique ID of the company that owns the filing request object
     * @param id The unique ID of the filing request object
     * @return FilingRequestModel
     */
    public Future<FilingRequestModel> approveFilingRequestAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/approve");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<FilingRequestModel>(){}));
    }

    /**
     * Cancel existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The unique ID of the company that owns the filing request object
     * @param id The unique ID of the filing request object
     * @return FilingRequestModel
     */
    public FilingRequestModel cancelFilingRequest(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/cancel");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Cancel existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The unique ID of the company that owns the filing request object
     * @param id The unique ID of the filing request object
     * @return FilingRequestModel
     */
    public Future<FilingRequestModel> cancelFilingRequestAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/cancel");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<FilingRequestModel>(){}));
    }

    /**
     * Create a new filing request to cancel a filing calendar
     * 
     * This API is available by invitation only.
     * 
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param id The unique ID number of the filing calendar to cancel
     * @param model The cancellation request for this filing calendar
     * @return FilingRequestModel
     */
    public FilingRequestModel cancelFilingRequests(Integer companyId, Integer id, ArrayList<FilingRequestModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/request");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Create a new filing request to cancel a filing calendar
     * 
     * This API is available by invitation only.
     * 
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param id The unique ID number of the filing calendar to cancel
     * @param model The cancellation request for this filing calendar
     * @return FilingRequestModel
     */
    public Future<FilingRequestModel> cancelFilingRequestsAsync(Integer companyId, Integer id, ArrayList<FilingRequestModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/request");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){}));
    }

    /**
     * Create a filing calendar
     * 
     * This API is available by invitation only and only available for users with Compliance access
     * 
     * @param companyId The unique ID of the company that will add the new filing calendar
     * @param model Filing calendars that will be added
     * @return FilingCalendarModel
     */
    public FilingCalendarModel createFilingCalendars(Integer companyId, ArrayList<FilingCalendarModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars");
        path.applyField("companyId", companyId);
        return ((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingCalendarModel>(){})).call();
    }

    /**
     * Create a filing calendar
     * 
     * This API is available by invitation only and only available for users with Compliance access
     * 
     * @param companyId The unique ID of the company that will add the new filing calendar
     * @param model Filing calendars that will be added
     * @return FilingCalendarModel
     */
    public Future<FilingCalendarModel> createFilingCalendarsAsync(Integer companyId, ArrayList<FilingCalendarModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingCalendarModel>(){}));
    }

    /**
     * Create a new filing request to create a filing calendar
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The unique ID of the company that will add the new filing calendar
     * @param model Information about the proposed new filing calendar
     * @return FilingRequestModel
     */
    public FilingRequestModel createFilingRequests(Integer companyId, ArrayList<FilingRequestModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/request");
        path.applyField("companyId", companyId);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Create a new filing request to create a filing calendar
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The unique ID of the company that will add the new filing calendar
     * @param model Information about the proposed new filing calendar
     * @return FilingRequestModel
     */
    public Future<FilingRequestModel> createFilingRequestsAsync(Integer companyId, ArrayList<FilingRequestModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/request");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){}));
    }

    /**
     * Returns a list of options for adding the specified form.
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param formCode The unique code of the form
     * @return ArrayList<CycleAddOptionModel>
     */
    public ArrayList<CycleAddOptionModel> cycleSafeAdd(Integer companyId, String formCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/options");
        path.applyField("companyId", companyId);
        path.addQuery("formCode", formCode);
        return ((RestCall<ArrayList<CycleAddOptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<CycleAddOptionModel>>(){})).call();
    }

    /**
     * Returns a list of options for adding the specified form.
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param formCode The unique code of the form
     * @return ArrayList<CycleAddOptionModel>
     */
    public Future<ArrayList<CycleAddOptionModel>> cycleSafeAddAsync(Integer companyId, String formCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/options");
        path.applyField("companyId", companyId);
        path.addQuery("formCode", formCode);
        return this.threadPool.submit((RestCall<ArrayList<CycleAddOptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<CycleAddOptionModel>>(){}));
    }

    /**
     * Indicates when changes are allowed to be made to a filing calendar.
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param id The unique ID of the filing calendar object
     * @param model A list of filing calendar edits to be made
     * @return CycleEditOptionModel
     */
    public CycleEditOptionModel cycleSafeEdit(Integer companyId, Integer id, ArrayList<FilingCalendarEditModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/options");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<CycleEditOptionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<CycleEditOptionModel>(){})).call();
    }

    /**
     * Indicates when changes are allowed to be made to a filing calendar.
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param id The unique ID of the filing calendar object
     * @param model A list of filing calendar edits to be made
     * @return CycleEditOptionModel
     */
    public Future<CycleEditOptionModel> cycleSafeEditAsync(Integer companyId, Integer id, ArrayList<FilingCalendarEditModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/options");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CycleEditOptionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<CycleEditOptionModel>(){}));
    }

    /**
     * Returns a list of options for expiring a filing calendar
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param id The unique ID of the filing calendar object
     * @return CycleExpireModel
     */
    public CycleExpireModel cycleSafeExpiration(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/options");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<CycleExpireModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CycleExpireModel>(){})).call();
    }

    /**
     * Returns a list of options for expiring a filing calendar
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param id The unique ID of the filing calendar object
     * @return CycleExpireModel
     */
    public Future<CycleExpireModel> cycleSafeExpirationAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/options");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CycleExpireModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CycleExpireModel>(){}));
    }

    /**
     * Delete a single filing calendar.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this filing calendar.
     * @param id The ID of the filing calendar you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteFilingCalendar(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single filing calendar.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this filing calendar.
     * @param id The ID of the filing calendar you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteFilingCalendarAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single filing calendar
     * 
     * @param companyId The ID of the company that owns this filing calendar
     * @param id The primary key of this filing calendar
     * @return FilingCalendarModel
     */
    public FilingCalendarModel getFilingCalendar(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingCalendarModel>(){})).call();
    }

    /**
     * Retrieve a single filing calendar
     * 
     * @param companyId The ID of the company that owns this filing calendar
     * @param id The primary key of this filing calendar
     * @return FilingCalendarModel
     */
    public Future<FilingCalendarModel> getFilingCalendarAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingCalendarModel>(){}));
    }

    /**
     * Retrieve a single filing request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The ID of the company that owns this filing calendar
     * @param id The primary key of this filing calendar
     * @return FilingRequestModel
     */
    public FilingRequestModel getFilingRequest(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Retrieve a single filing request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The ID of the company that owns this filing calendar
     * @param id The primary key of this filing calendar
     * @return FilingRequestModel
     */
    public Future<FilingRequestModel> getFilingRequestAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingRequestModel>(){}));
    }

    /**
     * Retrieve all filing calendars for this company
     * 
     * @param companyId The ID of the company that owns these batches
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @param returnCountry A comma separated list of countries
     * @param returnRegion A comma separated list of regions
     * @return FetchResult<FilingCalendarModel>
     */
    public FetchResult<FilingCalendarModel> listFilingCalendars(Integer companyId, String filter, Integer top, Integer skip, String orderBy, String returnCountry, String returnRegion) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        path.addQuery("returnCountry", returnCountry);
        path.addQuery("returnRegion", returnRegion);
        return ((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){})).call();
    }

    /**
     * Retrieve all filing calendars for this company
     * 
     * @param companyId The ID of the company that owns these batches
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @param returnCountry A comma separated list of countries
     * @param returnRegion A comma separated list of regions
     * @return FetchResult<FilingCalendarModel>
     */
    public Future<FetchResult<FilingCalendarModel>> listFilingCalendarsAsync(Integer companyId, String filter, Integer top, Integer skip, String orderBy, String returnCountry, String returnRegion) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        path.addQuery("returnCountry", returnCountry);
        path.addQuery("returnRegion", returnRegion);
        return this.threadPool.submit((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){}));
    }

    /**
     * Retrieve all filing requests for this company
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The ID of the company that owns these batches
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<FilingRequestModel>
     */
    public FetchResult<FilingRequestModel> listFilingRequests(Integer companyId, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){})).call();
    }

    /**
     * Retrieve all filing requests for this company
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The ID of the company that owns these batches
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<FilingRequestModel>
     */
    public Future<FetchResult<FilingRequestModel>> listFilingRequestsAsync(Integer companyId, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){}));
    }

    /**
     * New request for getting for validating customer's login credentials
     * 
     * This API is available by invitation only.
     * 
     * 
     * @param model The model of the login information we are verifying
     * @return LoginVerificationOutputModel
     */
    public LoginVerificationOutputModel loginVerificationRequest(LoginVerificationInputModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/verify");
        return ((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<LoginVerificationOutputModel>(){})).call();
    }

    /**
     * New request for getting for validating customer's login credentials
     * 
     * This API is available by invitation only.
     * 
     * 
     * @param model The model of the login information we are verifying
     * @return LoginVerificationOutputModel
     */
    public Future<LoginVerificationOutputModel> loginVerificationRequestAsync(LoginVerificationInputModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/verify");
        return this.threadPool.submit((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<LoginVerificationOutputModel>(){}));
    }

    /**
     * Gets the request status and Login Result
     * 
     * This API is available by invitation only.
     * 
     * This API checks the status of a login verification request.  It may only be called by authorized users from the account 
     * 
     * @param jobId The unique ID number of this login request
     * @return LoginVerificationOutputModel
     */
    public LoginVerificationOutputModel loginVerificationStatus(Integer jobId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/{jobId}");
        path.applyField("jobId", jobId);
        return ((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LoginVerificationOutputModel>(){})).call();
    }

    /**
     * Gets the request status and Login Result
     * 
     * This API is available by invitation only.
     * 
     * This API checks the status of a login verification request.  It may only be called by authorized users from the account 
     * 
     * @param jobId The unique ID number of this login request
     * @return LoginVerificationOutputModel
     */
    public Future<LoginVerificationOutputModel> loginVerificationStatusAsync(Integer jobId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/{jobId}");
        path.applyField("jobId", jobId);
        return this.threadPool.submit((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LoginVerificationOutputModel>(){}));
    }

    /**
     * Retrieve all filing calendars
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @param returnCountry If specified, fetches only filing calendars that apply to tax filings in this specific country. Uses ISO 3166 country codes.
     * @param returnRegion If specified, fetches only filing calendars that apply to tax filings in this specific region. Uses ISO 3166 region codes.
     * @return FetchResult<FilingCalendarModel>
     */
    public FetchResult<FilingCalendarModel> queryFilingCalendars(String filter, Integer top, Integer skip, String orderBy, String returnCountry, String returnRegion) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        path.addQuery("returnCountry", returnCountry);
        path.addQuery("returnRegion", returnRegion);
        return ((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){})).call();
    }

    /**
     * Retrieve all filing calendars
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @param returnCountry If specified, fetches only filing calendars that apply to tax filings in this specific country. Uses ISO 3166 country codes.
     * @param returnRegion If specified, fetches only filing calendars that apply to tax filings in this specific region. Uses ISO 3166 region codes.
     * @return FetchResult<FilingCalendarModel>
     */
    public Future<FetchResult<FilingCalendarModel>> queryFilingCalendarsAsync(String filter, Integer top, Integer skip, String orderBy, String returnCountry, String returnRegion) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        path.addQuery("returnCountry", returnCountry);
        path.addQuery("returnRegion", returnRegion);
        return this.threadPool.submit((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){}));
    }

    /**
     * Retrieve all filing requests
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * are reviewed and validated by Avalara Compliance before being implemented.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<FilingRequestModel>
     */
    public FetchResult<FilingRequestModel> queryFilingRequests(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingrequests");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){})).call();
    }

    /**
     * Retrieve all filing requests
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * are reviewed and validated by Avalara Compliance before being implemented.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<FilingRequestModel>
     */
    public Future<FetchResult<FilingRequestModel>> queryFilingRequestsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingrequests");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){}));
    }

    /**
     * Create a new filing request to edit a filing calendar
     * 
     * This API is available by invitation only.
     * 
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * are reviewed and validated by Avalara Compliance before being implemented.
     * 
     * Certain users may not update filing calendars directly.  Instead, they may submit an edit request
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param id The unique ID number of the filing calendar to edit
     * @param model A list of filing calendar edits to be made
     * @return FilingRequestModel
     */
    public FilingRequestModel requestFilingCalendarUpdate(Integer companyId, Integer id, ArrayList<FilingRequestModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/request");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Create a new filing request to edit a filing calendar
     * 
     * This API is available by invitation only.
     * 
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * are reviewed and validated by Avalara Compliance before being implemented.
     * 
     * Certain users may not update filing calendars directly.  Instead, they may submit an edit request
     * 
     * @param companyId The unique ID of the company that owns the filing calendar object
     * @param id The unique ID number of the filing calendar to edit
     * @param model A list of filing calendar edits to be made
     * @return FilingRequestModel
     */
    public Future<FilingRequestModel> requestFilingCalendarUpdateAsync(Integer companyId, Integer id, ArrayList<FilingRequestModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/request");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){}));
    }

    /**
     * Edit existing Filing Calendar
     * 
     * @param companyId The unique ID of the company that owns the filing request object
     * @param id The unique ID of the filing calendar object
     * @param model The filing calendar model you are wishing to update with.
     * @return FilingCalendarModel
     */
    public FilingCalendarModel updateFilingCalendar(Integer companyId, Integer id, FilingCalendarModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingCalendarModel>(){})).call();
    }

    /**
     * Edit existing Filing Calendar
     * 
     * @param companyId The unique ID of the company that owns the filing request object
     * @param id The unique ID of the filing calendar object
     * @param model The filing calendar model you are wishing to update with.
     * @return FilingCalendarModel
     */
    public Future<FilingCalendarModel> updateFilingCalendarAsync(Integer companyId, Integer id, FilingCalendarModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingCalendarModel>(){}));
    }

    /**
     * Edit existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The unique ID of the company that owns the filing request object
     * @param id The unique ID of the filing request object
     * @param model A list of filing calendar edits to be made
     * @return FilingRequestModel
     */
    public FilingRequestModel updateFilingRequest(Integer companyId, Integer id, FilingRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Edit existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param companyId The unique ID of the company that owns the filing request object
     * @param id The unique ID of the filing request object
     * @param model A list of filing calendar edits to be made
     * @return FilingRequestModel
     */
    public Future<FilingRequestModel> updateFilingRequestAsync(Integer companyId, Integer id, FilingRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingRequestModel>(){}));
    }

    /**
     * Approve all filings for the specified company in the given filing period.
     * 
     * This API is available by invitation only.
     * Approving a return means the customer is ready to let Avalara file that return.
     * Customer either approves themselves from admin console, 
     * else system auto-approves the night before the filing cycle.
     * Sometimes Compliance has to manually unapprove and reapprove to modify liability or filing for the customer.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to approve.
     * @param month The month of the filing period to approve.
     * @param model The approve request you wish to execute.
     * @return ArrayList<FilingModel>
     */
    public ArrayList<FilingModel> approveFilings(Integer companyId, Short year, Byte month, ApproveFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){})).call();
    }

    /**
     * Approve all filings for the specified company in the given filing period.
     * 
     * This API is available by invitation only.
     * Approving a return means the customer is ready to let Avalara file that return.
     * Customer either approves themselves from admin console, 
     * else system auto-approves the night before the filing cycle.
     * Sometimes Compliance has to manually unapprove and reapprove to modify liability or filing for the customer.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to approve.
     * @param month The month of the filing period to approve.
     * @param model The approve request you wish to execute.
     * @return ArrayList<FilingModel>
     */
    public Future<ArrayList<FilingModel>> approveFilingsAsync(Integer companyId, Short year, Byte month, ApproveFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){}));
    }

    /**
     * Approve all filings for the specified company in the given filing period and country.
     * 
     * This API is available by invitation only.
     * Approving a return means the customer is ready to let Avalara file that return.
     * Customer either approves themselves from admin console, 
     * else system auto-approves the night before the filing cycle.
     * Sometimes Compliance has to manually unapprove and reapprove to modify liability or filing for the customer.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to approve.
     * @param month The month of the filing period to approve.
     * @param country The two-character ISO-3166 code for the country.
     * @param model The approve request you wish to execute.
     * @return ArrayList<FilingModel>
     */
    public ArrayList<FilingModel> approveFilingsCountry(Integer companyId, Short year, Byte month, String country, ApproveFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return ((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){})).call();
    }

    /**
     * Approve all filings for the specified company in the given filing period and country.
     * 
     * This API is available by invitation only.
     * Approving a return means the customer is ready to let Avalara file that return.
     * Customer either approves themselves from admin console, 
     * else system auto-approves the night before the filing cycle.
     * Sometimes Compliance has to manually unapprove and reapprove to modify liability or filing for the customer.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to approve.
     * @param month The month of the filing period to approve.
     * @param country The two-character ISO-3166 code for the country.
     * @param model The approve request you wish to execute.
     * @return ArrayList<FilingModel>
     */
    public Future<ArrayList<FilingModel>> approveFilingsCountryAsync(Integer companyId, Short year, Byte month, String country, ApproveFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return this.threadPool.submit((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){}));
    }

    /**
     * Approve all filings for the specified company in the given filing period, country and region.
     * 
     * This API is available by invitation only.
     * Approving a return means the customer is ready to let Avalara file that return.
     * Customer either approves themselves from admin console, 
     * else system auto-approves the night before the filing cycle
     * Sometimes Compliance has to manually unapprove and reapprove to modify liability or filing for the customer.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to approve.
     * @param month The month of the filing period to approve.
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @param model The approve request you wish to execute.
     * @return ArrayList<FilingModel>
     */
    public ArrayList<FilingModel> approveFilingsCountryRegion(Integer companyId, Short year, Byte month, String country, String region, ApproveFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        return ((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){})).call();
    }

    /**
     * Approve all filings for the specified company in the given filing period, country and region.
     * 
     * This API is available by invitation only.
     * Approving a return means the customer is ready to let Avalara file that return.
     * Customer either approves themselves from admin console, 
     * else system auto-approves the night before the filing cycle
     * Sometimes Compliance has to manually unapprove and reapprove to modify liability or filing for the customer.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to approve.
     * @param month The month of the filing period to approve.
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @param model The approve request you wish to execute.
     * @return ArrayList<FilingModel>
     */
    public Future<ArrayList<FilingModel>> approveFilingsCountryRegionAsync(Integer companyId, Short year, Byte month, String country, String region, ApproveFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        return this.threadPool.submit((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){}));
    }

    /**
     * Add an adjustment to a given filing.
     * 
     * This API is available by invitation only.
     * An "Adjustment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API creates a new adjustment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param year The year of the filing's filing period being adjusted.
     * @param month The month of the filing's filing period being adjusted.
     * @param country The two-character ISO-3166 code for the country of the filing being adjusted.
     * @param region The two or three character region code for the region.
     * @param formCode The unique code of the form being adjusted.
     * @param model A list of Adjustments to be created for the specified filing.
     * @return ArrayList<FilingAdjustmentModel>
     */
    public ArrayList<FilingAdjustmentModel> createReturnAdjustment(Integer companyId, Short year, Byte month, String country, String region, String formCode, ArrayList<FilingAdjustmentModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/adjust");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        path.applyField("formCode", formCode);
        return ((RestCall<ArrayList<FilingAdjustmentModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingAdjustmentModel>>(){})).call();
    }

    /**
     * Add an adjustment to a given filing.
     * 
     * This API is available by invitation only.
     * An "Adjustment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API creates a new adjustment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param year The year of the filing's filing period being adjusted.
     * @param month The month of the filing's filing period being adjusted.
     * @param country The two-character ISO-3166 code for the country of the filing being adjusted.
     * @param region The two or three character region code for the region.
     * @param formCode The unique code of the form being adjusted.
     * @param model A list of Adjustments to be created for the specified filing.
     * @return ArrayList<FilingAdjustmentModel>
     */
    public Future<ArrayList<FilingAdjustmentModel>> createReturnAdjustmentAsync(Integer companyId, Short year, Byte month, String country, String region, String formCode, ArrayList<FilingAdjustmentModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/adjust");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        path.applyField("formCode", formCode);
        return this.threadPool.submit((RestCall<ArrayList<FilingAdjustmentModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingAdjustmentModel>>(){}));
    }

    /**
     * Add an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API creates a new augmentation for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being changed.
     * @param year The month of the filing's filing period being changed.
     * @param month The month of the filing's filing period being changed.
     * @param country The two-character ISO-3166 code for the country of the filing being changed.
     * @param region The two or three character region code for the region of the filing being changed.
     * @param formCode The unique code of the form being changed.
     * @param model A list of augmentations to be created for the specified filing.
     * @return ArrayList<FilingAugmentationModel>
     */
    public ArrayList<FilingAugmentationModel> createReturnAugmentation(Integer companyId, Short year, Byte month, String country, String region, String formCode, ArrayList<FilingAugmentationModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/augment");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        path.applyField("formCode", formCode);
        return ((RestCall<ArrayList<FilingAugmentationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingAugmentationModel>>(){})).call();
    }

    /**
     * Add an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API creates a new augmentation for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being changed.
     * @param year The month of the filing's filing period being changed.
     * @param month The month of the filing's filing period being changed.
     * @param country The two-character ISO-3166 code for the country of the filing being changed.
     * @param region The two or three character region code for the region of the filing being changed.
     * @param formCode The unique code of the form being changed.
     * @param model A list of augmentations to be created for the specified filing.
     * @return ArrayList<FilingAugmentationModel>
     */
    public Future<ArrayList<FilingAugmentationModel>> createReturnAugmentationAsync(Integer companyId, Short year, Byte month, String country, String region, String formCode, ArrayList<FilingAugmentationModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/augment");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        path.applyField("formCode", formCode);
        return this.threadPool.submit((RestCall<ArrayList<FilingAugmentationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingAugmentationModel>>(){}));
    }

    /**
     * Add an payment to a given filing.
     * 
     * This API is available by invitation only.
     * An "Payment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API creates a new payment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param year The year of the filing's filing period being adjusted.
     * @param month The month of the filing's filing period being adjusted.
     * @param country The two-character ISO-3166 code for the country of the filing being adjusted.
     * @param region The two or three character region code for the region.
     * @param formCode The unique code of the form being adjusted.
     * @param model A list of Payments to be created for the specified filing.
     * @return ArrayList<FilingPaymentModel>
     */
    public ArrayList<FilingPaymentModel> createReturnPayment(Integer companyId, Short year, Byte month, String country, String region, String formCode, ArrayList<FilingPaymentModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/payment");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        path.applyField("formCode", formCode);
        return ((RestCall<ArrayList<FilingPaymentModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingPaymentModel>>(){})).call();
    }

    /**
     * Add an payment to a given filing.
     * 
     * This API is available by invitation only.
     * An "Payment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API creates a new payment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param year The year of the filing's filing period being adjusted.
     * @param month The month of the filing's filing period being adjusted.
     * @param country The two-character ISO-3166 code for the country of the filing being adjusted.
     * @param region The two or three character region code for the region.
     * @param formCode The unique code of the form being adjusted.
     * @param model A list of Payments to be created for the specified filing.
     * @return ArrayList<FilingPaymentModel>
     */
    public Future<ArrayList<FilingPaymentModel>> createReturnPaymentAsync(Integer companyId, Short year, Byte month, String country, String region, String formCode, ArrayList<FilingPaymentModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/payment");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        path.applyField("formCode", formCode);
        return this.threadPool.submit((RestCall<ArrayList<FilingPaymentModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingPaymentModel>>(){}));
    }

    /**
     * Delete an adjustment for a given filing.
     * 
     * This API is available by invitation only.
     * An "Adjustment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API deletes an adjustment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param id The ID of the adjustment being deleted.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteReturnAdjustment(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete an adjustment for a given filing.
     * 
     * This API is available by invitation only.
     * An "Adjustment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API deletes an adjustment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param id The ID of the adjustment being deleted.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteReturnAdjustmentAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Delete an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API deletes an augmentation for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being changed.
     * @param id The ID of the augmentation being added.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteReturnAugmentation(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API deletes an augmentation for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being changed.
     * @param id The ID of the augmentation being added.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteReturnAugmentationAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Delete an payment for a given filing.
     * 
     * This API is available by invitation only.
     * An "Payment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API deletes an payment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param id The ID of the payment being deleted.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteReturnPayment(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/payment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete an payment for a given filing.
     * 
     * This API is available by invitation only.
     * An "Payment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API deletes an payment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param id The ID of the payment being deleted.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteReturnPaymentAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/payment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve worksheet checkup report for company and filing period.
     * 
     * @param filingsId The unique id of the worksheet.
     * @param companyId The unique ID of the company that owns the worksheet.
     * @return FilingsCheckupModel
     */
    public FilingsCheckupModel filingsCheckupReport(Integer filingsId, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{filingsId}/checkup");
        path.applyField("filingsId", filingsId);
        path.applyField("companyId", companyId);
        return ((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingsCheckupModel>(){})).call();
    }

    /**
     * Retrieve worksheet checkup report for company and filing period.
     * 
     * @param filingsId The unique id of the worksheet.
     * @param companyId The unique ID of the company that owns the worksheet.
     * @return FilingsCheckupModel
     */
    public Future<FilingsCheckupModel> filingsCheckupReportAsync(Integer filingsId, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{filingsId}/checkup");
        path.applyField("filingsId", filingsId);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingsCheckupModel>(){}));
    }

    /**
     * Retrieve worksheet checkup report for company and filing period.
     * 
     * @param companyId The unique ID of the company that owns the worksheets object.
     * @param year The year of the filing period.
     * @param month The month of the filing period.
     * @return FilingsCheckupModel
     */
    public FilingsCheckupModel filingsCheckupReports(Integer companyId, Integer year, Integer month) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/checkup");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingsCheckupModel>(){})).call();
    }

    /**
     * Retrieve worksheet checkup report for company and filing period.
     * 
     * @param companyId The unique ID of the company that owns the worksheets object.
     * @param year The year of the filing period.
     * @param month The month of the filing period.
     * @return FilingsCheckupModel
     */
    public Future<FilingsCheckupModel> filingsCheckupReportsAsync(Integer companyId, Integer year, Integer month) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/checkup");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingsCheckupModel>(){}));
    }

    /**
     * Retrieve a single attachment for a filing
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param filingReturnId The unique id of the worksheet return.
     * @param fileId The unique id of the document you are downloading
     * @return String
     */
    public String getFilingAttachment(Integer companyId, Long filingReturnId, Long fileId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{filingReturnId}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("filingReturnId", filingReturnId);
        path.addQuery("fileId", fileId);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Retrieve a single attachment for a filing
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param filingReturnId The unique id of the worksheet return.
     * @param fileId The unique id of the document you are downloading
     * @return String
     */
    public Future<String> getFilingAttachmentAsync(Integer companyId, Long filingReturnId, Long fileId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{filingReturnId}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("filingReturnId", filingReturnId);
        path.addQuery("fileId", fileId);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @return String
     */
    public String getFilingAttachments(Integer companyId, Short year, Byte month) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @return String
     */
    public Future<String> getFilingAttachmentsAsync(Integer companyId, Short year, Byte month) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Retrieve a single trace file for a company filing period
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @return String
     */
    public String getFilingAttachmentsTraceFile(Integer companyId, Short year, Byte month) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments/tracefile");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Retrieve a single trace file for a company filing period
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @return String
     */
    public Future<String> getFilingAttachmentsTraceFileAsync(Integer companyId, Short year, Byte month) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments/tracefile");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Retrieve a filing for the specified company and id.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param id The id of the filing return your retrieving
     * @return FetchResult<FilingReturnModel>
     */
    public FetchResult<FilingReturnModel> getFilingReturn(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/returns/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FetchResult<FilingReturnModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingReturnModel>>(){})).call();
    }

    /**
     * Retrieve a filing for the specified company and id.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param id The id of the filing return your retrieving
     * @return FetchResult<FilingReturnModel>
     */
    public Future<FetchResult<FilingReturnModel>> getFilingReturnAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/returns/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FetchResult<FilingReturnModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingReturnModel>>(){}));
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @return FetchResult<FilingModel>
     */
    public FetchResult<FilingModel> getFilings(Integer companyId, Short year, Byte month) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @return FetchResult<FilingModel>
     */
    public Future<FetchResult<FilingModel>> getFilingsAsync(Integer companyId, Short year, Byte month) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    /**
     * Retrieve a list of filings for the specified company in the given filing period and country.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @param country The two-character ISO-3166 code for the country.
     * @return FetchResult<FilingModel>
     */
    public FetchResult<FilingModel> getFilingsByCountry(Integer companyId, Short year, Byte month, String country) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the given filing period and country.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @param country The two-character ISO-3166 code for the country.
     * @return FetchResult<FilingModel>
     */
    public Future<FetchResult<FilingModel>> getFilingsByCountryAsync(Integer companyId, Short year, Byte month, String country) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    /**
     * Retrieve a list of filings for the specified company in the filing period, country and region.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @return FetchResult<FilingModel>
     */
    public FetchResult<FilingModel> getFilingsByCountryRegion(Integer companyId, Short year, Byte month, String country, String region) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the filing period, country and region.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @return FetchResult<FilingModel>
     */
    public Future<FetchResult<FilingModel>> getFilingsByCountryRegionAsync(Integer companyId, Short year, Byte month, String country, String region) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    /**
     * Retrieve a list of filings for the specified company in the given filing period, country, region and form.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @param formCode The unique code of the form.
     * @return FetchResult<FilingModel>
     */
    public FetchResult<FilingModel> getFilingsByReturnName(Integer companyId, Short year, Byte month, String country, String region, String formCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        path.applyField("formCode", formCode);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the given filing period, country, region and form.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period.
     * @param month The two digit month of the filing period.
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @param formCode The unique code of the form.
     * @return FetchResult<FilingModel>
     */
    public Future<FetchResult<FilingModel>> getFilingsByReturnNameAsync(Integer companyId, Short year, Byte month, String country, String region, String formCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        path.applyField("formCode", formCode);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.  
This gets the basic information from the filings and doesn't include anything extra.
     * 
     * @param companyId The ID of the company that owns these batches
     * @param endPeriodMonth The month of the period you are trying to retrieve
     * @param endPeriodYear The year of the period you are trying to retrieve
     * @param frequency The frequency of the return you are trying to retrieve (See FilingFrequencyId::* for a list of allowable values)
     * @param status The status of the return(s) you are trying to retrieve (See FilingStatusId::* for a list of allowable values)
     * @param country The country of the return(s) you are trying to retrieve
     * @param region The region of the return(s) you are trying to retrieve
     * @param filingCalendarId The filing calendar id of the return you are trying to retrieve
     * @return FetchResult<FilingReturnModelBasic>
     */
    public FetchResult<FilingReturnModelBasic> getFilingsReturns(Integer companyId, Integer endPeriodMonth, Integer endPeriodYear, FilingFrequencyId frequency, FilingStatusId status, String country, String region, Long filingCalendarId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/returns");
        path.applyField("companyId", companyId);
        path.addQuery("endPeriodMonth", endPeriodMonth);
        path.addQuery("endPeriodYear", endPeriodYear);
        path.addQuery("frequency", frequency);
        path.addQuery("status", status);
        path.addQuery("country", country);
        path.addQuery("region", region);
        path.addQuery("filingCalendarId", filingCalendarId);
        return ((RestCall<FetchResult<FilingReturnModelBasic>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingReturnModelBasic>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.  
This gets the basic information from the filings and doesn't include anything extra.
     * 
     * @param companyId The ID of the company that owns these batches
     * @param endPeriodMonth The month of the period you are trying to retrieve
     * @param endPeriodYear The year of the period you are trying to retrieve
     * @param frequency The frequency of the return you are trying to retrieve (See FilingFrequencyId::* for a list of allowable values)
     * @param status The status of the return(s) you are trying to retrieve (See FilingStatusId::* for a list of allowable values)
     * @param country The country of the return(s) you are trying to retrieve
     * @param region The region of the return(s) you are trying to retrieve
     * @param filingCalendarId The filing calendar id of the return you are trying to retrieve
     * @return FetchResult<FilingReturnModelBasic>
     */
    public Future<FetchResult<FilingReturnModelBasic>> getFilingsReturnsAsync(Integer companyId, Integer endPeriodMonth, Integer endPeriodYear, FilingFrequencyId frequency, FilingStatusId status, String country, String region, Long filingCalendarId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/returns");
        path.applyField("companyId", companyId);
        path.addQuery("endPeriodMonth", endPeriodMonth);
        path.addQuery("endPeriodYear", endPeriodYear);
        path.addQuery("frequency", frequency);
        path.addQuery("status", status);
        path.addQuery("country", country);
        path.addQuery("region", region);
        path.addQuery("filingCalendarId", filingCalendarId);
        return this.threadPool.submit((RestCall<FetchResult<FilingReturnModelBasic>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingReturnModelBasic>>(){}));
    }

    /**
     * Rebuild a set of filings for the specified company in the given filing period.
     * 
     * This API is available by invitation only.
     * Rebuilding a return means re-creating or updating the amounts to be filed (worksheet) for a filing.
     * Rebuilding has to be done whenever a customer adds transactions to a filing.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * based on filing frequency of filing.
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to be rebuilt.
     * @param month The month of the filing period to be rebuilt.
     * @param model The rebuild request you wish to execute.
     * @return FetchResult<FilingModel>
     */
    public FetchResult<FilingModel> rebuildFilings(Integer companyId, Short year, Byte month, RebuildFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Rebuild a set of filings for the specified company in the given filing period.
     * 
     * This API is available by invitation only.
     * Rebuilding a return means re-creating or updating the amounts to be filed (worksheet) for a filing.
     * Rebuilding has to be done whenever a customer adds transactions to a filing.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * based on filing frequency of filing.
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to be rebuilt.
     * @param month The month of the filing period to be rebuilt.
     * @param model The rebuild request you wish to execute.
     * @return FetchResult<FilingModel>
     */
    public Future<FetchResult<FilingModel>> rebuildFilingsAsync(Integer companyId, Short year, Byte month, RebuildFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    /**
     * Rebuild a set of filings for the specified company in the given filing period and country.
     * 
     * This API is available by invitation only.
     * Rebuilding a return means re-creating or updating the amounts to be filed (worksheet) for a filing.
     * Rebuilding has to be done whenever a customer adds transactions to a filing.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * based on filing frequency of filing.
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to be rebuilt.
     * @param month The month of the filing period to be rebuilt.
     * @param country The two-character ISO-3166 code for the country.
     * @param model The rebuild request you wish to execute.
     * @return FetchResult<FilingModel>
     */
    public FetchResult<FilingModel> rebuildFilingsByCountry(Integer companyId, Short year, Byte month, String country, RebuildFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Rebuild a set of filings for the specified company in the given filing period and country.
     * 
     * This API is available by invitation only.
     * Rebuilding a return means re-creating or updating the amounts to be filed (worksheet) for a filing.
     * Rebuilding has to be done whenever a customer adds transactions to a filing.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * based on filing frequency of filing.
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to be rebuilt.
     * @param month The month of the filing period to be rebuilt.
     * @param country The two-character ISO-3166 code for the country.
     * @param model The rebuild request you wish to execute.
     * @return FetchResult<FilingModel>
     */
    public Future<FetchResult<FilingModel>> rebuildFilingsByCountryAsync(Integer companyId, Short year, Byte month, String country, RebuildFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    /**
     * Rebuild a set of filings for the specified company in the given filing period, country and region.
     * 
     * This API is available by invitation only.audit.CheckAuthorizationReturns(null, companyId);
     * Rebuilding a return means re-creating or updating the amounts to be filed for a filing.
     * Rebuilding has to be done whenever a customer adds transactions to a filing.        
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * based on filing frequency of filing.
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to be rebuilt.
     * @param month The month of the filing period to be rebuilt.
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @param model The rebuild request you wish to execute.
     * @return FetchResult<FilingModel>
     */
    public FetchResult<FilingModel> rebuildFilingsByCountryRegion(Integer companyId, Short year, Byte month, String country, String region, RebuildFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Rebuild a set of filings for the specified company in the given filing period, country and region.
     * 
     * This API is available by invitation only.audit.CheckAuthorizationReturns(null, companyId);
     * Rebuilding a return means re-creating or updating the amounts to be filed for a filing.
     * Rebuilding has to be done whenever a customer adds transactions to a filing.        
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * based on filing frequency of filing.
     * 
     * @param companyId The ID of the company that owns the filings.
     * @param year The year of the filing period to be rebuilt.
     * @param month The month of the filing period to be rebuilt.
     * @param country The two-character ISO-3166 code for the country.
     * @param region The two or three character region code for the region.
     * @param model The rebuild request you wish to execute.
     * @return FetchResult<FilingModel>
     */
    public Future<FetchResult<FilingModel>> rebuildFilingsByCountryRegionAsync(Integer companyId, Short year, Byte month, String country, String region, RebuildFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        path.applyField("region", region);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    /**
     * Edit an adjustment for a given filing.
     * 
     * This API is available by invitation only.
     * An "Adjustment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API modifies an adjustment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param id The ID of the adjustment being edited.
     * @param model The updated Adjustment.
     * @return FilingAdjustmentModel
     */
    public FilingAdjustmentModel updateReturnAdjustment(Integer companyId, Long id, FilingAdjustmentModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingAdjustmentModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingAdjustmentModel>(){})).call();
    }

    /**
     * Edit an adjustment for a given filing.
     * 
     * This API is available by invitation only.
     * An "Adjustment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API modifies an adjustment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param id The ID of the adjustment being edited.
     * @param model The updated Adjustment.
     * @return FilingAdjustmentModel
     */
    public Future<FilingAdjustmentModel> updateReturnAdjustmentAsync(Integer companyId, Long id, FilingAdjustmentModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingAdjustmentModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingAdjustmentModel>(){}));
    }

    /**
     * Edit an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API modifies an augmentation for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being changed.
     * @param id The ID of the augmentation being edited.
     * @param model The updated Augmentation.
     * @return FilingModel
     */
    public FilingModel updateReturnAugmentation(Integer companyId, Long id, FilingAugmentationModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingModel>(){})).call();
    }

    /**
     * Edit an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API modifies an augmentation for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being changed.
     * @param id The ID of the augmentation being edited.
     * @param model The updated Augmentation.
     * @return FilingModel
     */
    public Future<FilingModel> updateReturnAugmentationAsync(Integer companyId, Long id, FilingAugmentationModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingModel>(){}));
    }

    /**
     * Edit an payment for a given filing.
     * 
     * This API is available by invitation only.
     * An "Payment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API modifies an payment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param id The ID of the payment being edited.
     * @param model The updated Payment.
     * @return FilingPaymentModel
     */
    public FilingPaymentModel updateReturnPayment(Integer companyId, Long id, FilingPaymentModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/payment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingPaymentModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingPaymentModel>(){})).call();
    }

    /**
     * Edit an payment for a given filing.
     * 
     * This API is available by invitation only.
     * An "Payment" is usually an increase or decrease to customer funding to Avalara,
     * such as early filer discount amounts that are refunded to the customer, or efile fees from websites. 
     * Sometimes may be a manual change in tax liability similar to an augmentation.
     * This API modifies an payment for an existing tax filing.
     * 
     * @param companyId The ID of the company that owns the filing being adjusted.
     * @param id The ID of the payment being edited.
     * @param model The updated Payment.
     * @return FilingPaymentModel
     */
    public Future<FilingPaymentModel> updateReturnPaymentAsync(Integer companyId, Long id, FilingPaymentModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/payment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingPaymentModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingPaymentModel>(){}));
    }

    /**
     * FREE API - Request a free trial of AvaTax
     * 
     * Call this API to obtain a free AvaTax sandbox account.
     * 
     * This API is free to use.  No authentication credentials are required to call this API.
     * The account will grant a full trial version of AvaTax (e.g. AvaTaxPro) for a limited period of time.
     * After this introductory period, you may continue to use the free TaxRates API.
     * 
     * Limitations on free trial accounts:
     *             
     * * Only one free trial per company.
     * * The free trial account does not expire.
     * * Includes a limited time free trial of AvaTaxPro; after that date, the free TaxRates API will continue to work.
     * 
     * @param model Required information to provision a free trial account.
     * @return NewAccountModel
     */
    public NewAccountModel requestFreeTrial(FreeTrialRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/freetrials/request");
        return ((RestCall<NewAccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<NewAccountModel>(){})).call();
    }

    /**
     * FREE API - Request a free trial of AvaTax
     * 
     * Call this API to obtain a free AvaTax sandbox account.
     * 
     * This API is free to use.  No authentication credentials are required to call this API.
     * The account will grant a full trial version of AvaTax (e.g. AvaTaxPro) for a limited period of time.
     * After this introductory period, you may continue to use the free TaxRates API.
     * 
     * Limitations on free trial accounts:
     *             
     * * Only one free trial per company.
     * * The free trial account does not expire.
     * * Includes a limited time free trial of AvaTaxPro; after that date, the free TaxRates API will continue to work.
     * 
     * @param model Required information to provision a free trial account.
     * @return NewAccountModel
     */
    public Future<NewAccountModel> requestFreeTrialAsync(FreeTrialRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/freetrials/request");
        return this.threadPool.submit((RestCall<NewAccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<NewAccountModel>(){}));
    }

    /**
     * FREE API - Sales tax rates for a specified address
     * 
     * # Free-To-Use
     * 
     * The TaxRates API is a free-to-use, no cost option for estimating sales tax rates.
     * Any customer can request a free AvaTax account and make use of the TaxRates API.
     * 
     * Usage of this API is subject to rate limits.  Users who exceed the rate limit will receive HTTP
     * response code 429 - `Too Many Requests`.
     * 
     * This API assumes that you are selling general tangible personal property at a retail point-of-sale
     * location in the United States only.  
     * 
     * For more powerful tax calculation, please consider upgrading to the `CreateTransaction` API,
     * which supports features including, but not limited to:
     * 
     * * Nexus declarations
     * * Taxability based on product/service type
     * * Sourcing rules affecting origin/destination states
     * * Customers who are exempt from certain taxes
     * * States that have dollar value thresholds for tax amounts
     * * Refunds for products purchased on a different date
     * * Detailed jurisdiction names and state assigned codes
     * * And more!
     * 
     * Please see [Estimating Tax with REST v2](http://developer.avalara.com/blog/2016/11/04/estimating-tax-with-rest-v2/)
     * 
     * @param line1 The street address of the location.
     * @param line2 The street address of the location.
     * @param line3 The street address of the location.
     * @param city The city name of the location.
     * @param region Name or ISO 3166 code identifying the region within the country.    This field supports many different region identifiers:   * Two and three character ISO 3166 region codes   * Fully spelled out names of the region in ISO supported languages   * Common alternative spellings for many regions    For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     * @param postalCode The postal code of the location.
     * @param country Name or ISO 3166 code identifying the country.    This field supports many different country identifiers:   * Two character ISO 3166 codes   * Three character ISO 3166 codes   * Fully spelled out names of the country in ISO supported languages   * Common alternative spellings for many countries    For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     * @return TaxRateModel
     */
    public TaxRateModel taxRatesByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/byaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        return ((RestCall<TaxRateModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRateModel>(){})).call();
    }

    /**
     * FREE API - Sales tax rates for a specified address
     * 
     * # Free-To-Use
     * 
     * The TaxRates API is a free-to-use, no cost option for estimating sales tax rates.
     * Any customer can request a free AvaTax account and make use of the TaxRates API.
     * 
     * Usage of this API is subject to rate limits.  Users who exceed the rate limit will receive HTTP
     * response code 429 - `Too Many Requests`.
     * 
     * This API assumes that you are selling general tangible personal property at a retail point-of-sale
     * location in the United States only.  
     * 
     * For more powerful tax calculation, please consider upgrading to the `CreateTransaction` API,
     * which supports features including, but not limited to:
     * 
     * * Nexus declarations
     * * Taxability based on product/service type
     * * Sourcing rules affecting origin/destination states
     * * Customers who are exempt from certain taxes
     * * States that have dollar value thresholds for tax amounts
     * * Refunds for products purchased on a different date
     * * Detailed jurisdiction names and state assigned codes
     * * And more!
     * 
     * Please see [Estimating Tax with REST v2](http://developer.avalara.com/blog/2016/11/04/estimating-tax-with-rest-v2/)
     * 
     * @param line1 The street address of the location.
     * @param line2 The street address of the location.
     * @param line3 The street address of the location.
     * @param city The city name of the location.
     * @param region Name or ISO 3166 code identifying the region within the country.    This field supports many different region identifiers:   * Two and three character ISO 3166 region codes   * Fully spelled out names of the region in ISO supported languages   * Common alternative spellings for many regions    For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     * @param postalCode The postal code of the location.
     * @param country Name or ISO 3166 code identifying the country.    This field supports many different country identifiers:   * Two character ISO 3166 codes   * Three character ISO 3166 codes   * Fully spelled out names of the country in ISO supported languages   * Common alternative spellings for many countries    For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     * @return TaxRateModel
     */
    public Future<TaxRateModel> taxRatesByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/byaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        return this.threadPool.submit((RestCall<TaxRateModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRateModel>(){}));
    }

    /**
     * FREE API - Sales tax rates for a specified country and postal code. This API is only available for US postal codes.
     * 
     * # Free-To-Use
     * 
     * This API is only available for a US postal codes.
     * 
     * The TaxRates API is a free-to-use, no cost option for estimating sales tax rates.
     * Any customer can request a free AvaTax account and make use of the TaxRates API.
     * 
     * Usage of this API is subject to rate limits.  Users who exceed the rate limit will receive HTTP
     * response code 429 - `Too Many Requests`.
     * 
     * This API assumes that you are selling general tangible personal property at a retail point-of-sale
     * location in the United States only.  
     * 
     * For more powerful tax calculation, please consider upgrading to the `CreateTransaction` API,
     * which supports features including, but not limited to:
     * 
     * * Nexus declarations
     * * Taxability based on product/service type
     * * Sourcing rules affecting origin/destination states
     * * Customers who are exempt from certain taxes
     * * States that have dollar value thresholds for tax amounts
     * * Refunds for products purchased on a different date
     * * Detailed jurisdiction names and state assigned codes
     * * And more!
     * 
     * Please see [Estimating Tax with REST v2](http://developer.avalara.com/blog/2016/11/04/estimating-tax-with-rest-v2/)
     * 
     * @param country Name or ISO 3166 code identifying the country.    This field supports many different country identifiers:   * Two character ISO 3166 codes   * Three character ISO 3166 codes   * Fully spelled out names of the country in ISO supported languages   * Common alternative spellings for many countries    For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     * @param postalCode The postal code of the location.
     * @return TaxRateModel
     */
    public TaxRateModel taxRatesByPostalCode(String country, String postalCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/bypostalcode");
        path.addQuery("country", country);
        path.addQuery("postalCode", postalCode);
        return ((RestCall<TaxRateModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRateModel>(){})).call();
    }

    /**
     * FREE API - Sales tax rates for a specified country and postal code. This API is only available for US postal codes.
     * 
     * # Free-To-Use
     * 
     * This API is only available for a US postal codes.
     * 
     * The TaxRates API is a free-to-use, no cost option for estimating sales tax rates.
     * Any customer can request a free AvaTax account and make use of the TaxRates API.
     * 
     * Usage of this API is subject to rate limits.  Users who exceed the rate limit will receive HTTP
     * response code 429 - `Too Many Requests`.
     * 
     * This API assumes that you are selling general tangible personal property at a retail point-of-sale
     * location in the United States only.  
     * 
     * For more powerful tax calculation, please consider upgrading to the `CreateTransaction` API,
     * which supports features including, but not limited to:
     * 
     * * Nexus declarations
     * * Taxability based on product/service type
     * * Sourcing rules affecting origin/destination states
     * * Customers who are exempt from certain taxes
     * * States that have dollar value thresholds for tax amounts
     * * Refunds for products purchased on a different date
     * * Detailed jurisdiction names and state assigned codes
     * * And more!
     * 
     * Please see [Estimating Tax with REST v2](http://developer.avalara.com/blog/2016/11/04/estimating-tax-with-rest-v2/)
     * 
     * @param country Name or ISO 3166 code identifying the country.    This field supports many different country identifiers:   * Two character ISO 3166 codes   * Three character ISO 3166 codes   * Fully spelled out names of the country in ISO supported languages   * Common alternative spellings for many countries    For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     * @param postalCode The postal code of the location.
     * @return TaxRateModel
     */
    public Future<TaxRateModel> taxRatesByPostalCodeAsync(String country, String postalCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/bypostalcode");
        path.addQuery("country", country);
        path.addQuery("postalCode", postalCode);
        return this.threadPool.submit((RestCall<TaxRateModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRateModel>(){}));
    }

    /**
     * Request the javascript for a funding setup widget
     * 
     * This API is available by invitation only.
     * Companies that use the Avalara Managed Returns or the SST Certified Service Provider services are 
     * required to setup their funding configuration before Avalara can begin filing tax returns on their 
     * behalf.
     * Funding configuration for each company is set up by submitting a funding setup request, which can
     * be sent either via email or via an embedded HTML widget.
     * When the funding configuration is submitted to Avalara, it will be reviewed by treasury team members
     * before approval.
     * This API returns back the actual javascript code to insert into your application to render the 
     * JavaScript funding setup widget inline.
     * Use the 'methodReturn.javaScript' return value to insert this widget into your HTML page.
     * 
     * @param id The unique ID number of this funding request
     * @return FundingStatusModel
     */
    public FundingStatusModel activateFundingRequest(Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}/widget");
        path.applyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingStatusModel>(){})).call();
    }

    /**
     * Request the javascript for a funding setup widget
     * 
     * This API is available by invitation only.
     * Companies that use the Avalara Managed Returns or the SST Certified Service Provider services are 
     * required to setup their funding configuration before Avalara can begin filing tax returns on their 
     * behalf.
     * Funding configuration for each company is set up by submitting a funding setup request, which can
     * be sent either via email or via an embedded HTML widget.
     * When the funding configuration is submitted to Avalara, it will be reviewed by treasury team members
     * before approval.
     * This API returns back the actual javascript code to insert into your application to render the 
     * JavaScript funding setup widget inline.
     * Use the 'methodReturn.javaScript' return value to insert this widget into your HTML page.
     * 
     * @param id The unique ID number of this funding request
     * @return FundingStatusModel
     */
    public Future<FundingStatusModel> activateFundingRequestAsync(Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}/widget");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FundingStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingStatusModel>(){}));
    }

    /**
     * Retrieve status about a funding setup request
     * 
     * This API is available by invitation only.
     * Companies that use the Avalara Managed Returns or the SST Certified Service Provider services are 
     * required to setup their funding configuration before Avalara can begin filing tax returns on their 
     * behalf.
     * Funding configuration for each company is set up by submitting a funding setup request, which can
     * be sent either via email or via an embedded HTML widget.
     * When the funding configuration is submitted to Avalara, it will be reviewed by treasury team members
     * before approval.
     * This API checks the status on an existing funding request.
     * 
     * @param id The unique ID number of this funding request
     * @return FundingStatusModel
     */
    public FundingStatusModel fundingRequestStatus(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}");
        path.applyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingStatusModel>(){})).call();
    }

    /**
     * Retrieve status about a funding setup request
     * 
     * This API is available by invitation only.
     * Companies that use the Avalara Managed Returns or the SST Certified Service Provider services are 
     * required to setup their funding configuration before Avalara can begin filing tax returns on their 
     * behalf.
     * Funding configuration for each company is set up by submitting a funding setup request, which can
     * be sent either via email or via an embedded HTML widget.
     * When the funding configuration is submitted to Avalara, it will be reviewed by treasury team members
     * before approval.
     * This API checks the status on an existing funding request.
     * 
     * @param id The unique ID number of this funding request
     * @return FundingStatusModel
     */
    public Future<FundingStatusModel> fundingRequestStatusAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FundingStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingStatusModel>(){}));
    }

    /**
     * Create a new item
     * 
     * Creates one or more new item objects attached to this company.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * 
     * @param companyId The ID of the company that owns this item.
     * @param model The item you wish to create.
     * @return ArrayList<ItemModel>
     */
    public ArrayList<ItemModel> createItems(Integer companyId, ArrayList<ItemModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<ItemModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<ItemModel>>(){})).call();
    }

    /**
     * Create a new item
     * 
     * Creates one or more new item objects attached to this company.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * 
     * @param companyId The ID of the company that owns this item.
     * @param model The item you wish to create.
     * @return ArrayList<ItemModel>
     */
    public Future<ArrayList<ItemModel>> createItemsAsync(Integer companyId, ArrayList<ItemModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<ItemModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<ItemModel>>(){}));
    }

    /**
     * Delete a single item
     * 
     * Marks the item object at this URL as deleted.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * 
     * @param companyId The ID of the company that owns this item.
     * @param id The ID of the item you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteItem(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single item
     * 
     * Marks the item object at this URL as deleted.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * 
     * @param companyId The ID of the company that owns this item.
     * @param id The ID of the item you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteItemAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single item
     * 
     * Get the item object identified by this URL.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * 
     * @param companyId The ID of the company that owns this item object
     * @param id The primary key of this item
     * @return ItemModel
     */
    public ItemModel getItem(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ItemModel>(){})).call();
    }

    /**
     * Retrieve a single item
     * 
     * Get the item object identified by this URL.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * 
     * @param companyId The ID of the company that owns this item object
     * @param id The primary key of this item
     * @return ItemModel
     */
    public Future<ItemModel> getItemAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ItemModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ItemModel>(){}));
    }

    /**
     * Retrieve items for this company
     * 
     * List all items defined for the current company.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * team can manage your item catalog and adjust the tax behavior of items without having to modify your software.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param companyId The ID of the company that defined these items
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ItemModel>
     */
    public FetchResult<ItemModel> listItemsByCompany(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }

    /**
     * Retrieve items for this company
     * 
     * List all items defined for the current company.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * team can manage your item catalog and adjust the tax behavior of items without having to modify your software.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param companyId The ID of the company that defined these items
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ItemModel>
     */
    public Future<FetchResult<ItemModel>> listItemsByCompanyAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){}));
    }

    /**
     * Retrieve all items
     * 
     * Get multiple item objects across all companies.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * team can manage your item catalog and adjust the tax behavior of items without having to modify your software.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ItemModel>
     */
    public FetchResult<ItemModel> queryItems(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/items");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }

    /**
     * Retrieve all items
     * 
     * Get multiple item objects across all companies.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * team can manage your item catalog and adjust the tax behavior of items without having to modify your software.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<ItemModel>
     */
    public Future<FetchResult<ItemModel>> queryItemsAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/items");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){}));
    }

    /**
     * Update a single item
     * 
     * Replace the existing `Item` object at this URL with an updated object.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * team can manage your item catalog and adjust the tax behavior of items without having to modify your software.
     * 
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this item belongs to.
     * @param id The ID of the item you wish to update
     * @param model The item object you wish to update.
     * @return ItemModel
     */
    public ItemModel updateItem(Integer companyId, Long id, ItemModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ItemModel>(){})).call();
    }

    /**
     * Update a single item
     * 
     * Replace the existing `Item` object at this URL with an updated object.
     * 
     * Items are a way of separating your tax calculation process from your tax configuration details.  If you choose, you
     * can provide `itemCode` values for each `CreateTransaction()` API call rather than specifying tax codes, parameters, descriptions,
     * and other data fields.  AvaTax will automatically look up each `itemCode` and apply the correct tax codes and parameters
     * from the item table instead.  This allows your CreateTransaction call to be as simple as possible, and your tax compliance
     * team can manage your item catalog and adjust the tax behavior of items without having to modify your software.
     * 
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this item belongs to.
     * @param id The ID of the item you wish to update
     * @param model The item object you wish to update.
     * @return ItemModel
     */
    public Future<ItemModel> updateItemAsync(Integer companyId, Long id, ItemModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ItemModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ItemModel>(){}));
    }

    /**
     * Create one or more overrides
     * 
     * Creates one or more jurisdiction override objects for this account.
     * 
     * A Jurisdiction Override is a configuration setting that allows you to select the taxing
     * jurisdiction for a specific address.  If you encounter an address that is on the boundary
     * between two different jurisdictions, you can choose to set up a jurisdiction override
     * 
     * @param accountId The ID of the account that owns this override
     * @param model The jurisdiction override objects to create
     * @return ArrayList<JurisdictionOverrideModel>
     */
    public ArrayList<JurisdictionOverrideModel> createJurisdictionOverrides(Integer accountId, ArrayList<JurisdictionOverrideModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.applyField("accountId", accountId);
        return ((RestCall<ArrayList<JurisdictionOverrideModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<JurisdictionOverrideModel>>(){})).call();
    }

    /**
     * Create one or more overrides
     * 
     * Creates one or more jurisdiction override objects for this account.
     * 
     * A Jurisdiction Override is a configuration setting that allows you to select the taxing
     * jurisdiction for a specific address.  If you encounter an address that is on the boundary
     * between two different jurisdictions, you can choose to set up a jurisdiction override
     * 
     * @param accountId The ID of the account that owns this override
     * @param model The jurisdiction override objects to create
     * @return ArrayList<JurisdictionOverrideModel>
     */
    public Future<ArrayList<JurisdictionOverrideModel>> createJurisdictionOverridesAsync(Integer accountId, ArrayList<JurisdictionOverrideModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<ArrayList<JurisdictionOverrideModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<JurisdictionOverrideModel>>(){}));
    }

    /**
     * Delete a single override
     * 
     * @param accountId The ID of the account that owns this override
     * @param id The ID of the override you wish to delete
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteJurisdictionOverride(Integer accountId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single override
     * 
     * @param accountId The ID of the account that owns this override
     * @param id The ID of the override you wish to delete
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteJurisdictionOverrideAsync(Integer accountId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single override
     * 
     * Get the item object identified by this URL.
     * 
     * A Jurisdiction Override is a configuration setting that allows you to select the taxing
     * jurisdiction for a specific address.  If you encounter an address that is on the boundary
     * between two different jurisdictions, you can choose to set up a jurisdiction override
     * 
     * @param accountId The ID of the account that owns this override
     * @param id The primary key of this override
     * @return JurisdictionOverrideModel
     */
    public JurisdictionOverrideModel getJurisdictionOverride(Integer accountId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<JurisdictionOverrideModel>(){})).call();
    }

    /**
     * Retrieve a single override
     * 
     * Get the item object identified by this URL.
     * 
     * A Jurisdiction Override is a configuration setting that allows you to select the taxing
     * jurisdiction for a specific address.  If you encounter an address that is on the boundary
     * between two different jurisdictions, you can choose to set up a jurisdiction override
     * 
     * @param accountId The ID of the account that owns this override
     * @param id The primary key of this override
     * @return JurisdictionOverrideModel
     */
    public Future<JurisdictionOverrideModel> getJurisdictionOverrideAsync(Integer accountId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<JurisdictionOverrideModel>(){}));
    }

    /**
     * Retrieve overrides for this account
     * 
     * List all jurisdiction override objects defined for this account.
     * 
     * A Jurisdiction Override is a configuration setting that allows you to select the taxing
     * jurisdiction for a specific address.  If you encounter an address that is on the boundary
     * between two different jurisdictions, you can choose to set up a jurisdiction override
     * to switch this address to use different taxing jurisdictions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param accountId The ID of the account that owns this override
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<JurisdictionOverrideModel>
     */
    public FetchResult<JurisdictionOverrideModel> listJurisdictionOverridesByAccount(Integer accountId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.applyField("accountId", accountId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
    }

    /**
     * Retrieve overrides for this account
     * 
     * List all jurisdiction override objects defined for this account.
     * 
     * A Jurisdiction Override is a configuration setting that allows you to select the taxing
     * jurisdiction for a specific address.  If you encounter an address that is on the boundary
     * between two different jurisdictions, you can choose to set up a jurisdiction override
     * to switch this address to use different taxing jurisdictions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param accountId The ID of the account that owns this override
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<JurisdictionOverrideModel>
     */
    public Future<FetchResult<JurisdictionOverrideModel>> listJurisdictionOverridesByAccountAsync(Integer accountId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.applyField("accountId", accountId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){}));
    }

    /**
     * Retrieve all overrides
     * 
     * Get multiple jurisdiction override objects across all companies.
     * 
     * A Jurisdiction Override is a configuration setting that allows you to select the taxing
     * jurisdiction for a specific address.  If you encounter an address that is on the boundary
     * between two different jurisdictions, you can choose to set up a jurisdiction override
     * to switch this address to use different taxing jurisdictions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<JurisdictionOverrideModel>
     */
    public FetchResult<JurisdictionOverrideModel> queryJurisdictionOverrides(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/jurisdictionoverrides");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
    }

    /**
     * Retrieve all overrides
     * 
     * Get multiple jurisdiction override objects across all companies.
     * 
     * A Jurisdiction Override is a configuration setting that allows you to select the taxing
     * jurisdiction for a specific address.  If you encounter an address that is on the boundary
     * between two different jurisdictions, you can choose to set up a jurisdiction override
     * to switch this address to use different taxing jurisdictions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<JurisdictionOverrideModel>
     */
    public Future<FetchResult<JurisdictionOverrideModel>> queryJurisdictionOverridesAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/jurisdictionoverrides");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){}));
    }

    /**
     * Update a single jurisdictionoverride
     * 
     * @param accountId The ID of the account that this jurisdictionoverride belongs to.
     * @param id The ID of the jurisdictionoverride you wish to update
     * @param model The jurisdictionoverride object you wish to update.
     * @return JurisdictionOverrideModel
     */
    public JurisdictionOverrideModel updateJurisdictionOverride(Integer accountId, Integer id, JurisdictionOverrideModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<JurisdictionOverrideModel>(){})).call();
    }

    /**
     * Update a single jurisdictionoverride
     * 
     * @param accountId The ID of the account that this jurisdictionoverride belongs to.
     * @param id The ID of the jurisdictionoverride you wish to update
     * @param model The jurisdictionoverride object you wish to update.
     * @return JurisdictionOverrideModel
     */
    public Future<JurisdictionOverrideModel> updateJurisdictionOverrideAsync(Integer accountId, Integer id, JurisdictionOverrideModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<JurisdictionOverrideModel>(){}));
    }

    /**
     * Create a new location
     * 
     * @param companyId The ID of the company that owns this location.
     * @param model The location you wish to create.
     * @return ArrayList<LocationModel>
     */
    public ArrayList<LocationModel> createLocations(Integer companyId, ArrayList<LocationModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<LocationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<LocationModel>>(){})).call();
    }

    /**
     * Create a new location
     * 
     * @param companyId The ID of the company that owns this location.
     * @param model The location you wish to create.
     * @return ArrayList<LocationModel>
     */
    public Future<ArrayList<LocationModel>> createLocationsAsync(Integer companyId, ArrayList<LocationModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<LocationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<LocationModel>>(){}));
    }

    /**
     * Delete a single location
     * 
     * @param companyId The ID of the company that owns this location.
     * @param id The ID of the location you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteLocation(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single location
     * 
     * @param companyId The ID of the company that owns this location.
     * @param id The ID of the location you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteLocationAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single location
     * 
     * Get the location object identified by this URL.
     * An 'Location' represents a physical address where a company does business.
     * Many taxing authorities require that you define a list of all locations where your company does business.
     * These locations may require additional custom configuration or tax registration with these authorities.
     * For more information on metadata requirements, see the '/api/v2/definitions/locationquestions' API.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param companyId The ID of the company that owns this location
     * @param id The primary key of this location
     * @param include A comma separated list of additional data to retrieve. You may specify `LocationSettings` to retrieve location settings.
     * @return LocationModel
     */
    public LocationModel getLocation(Integer companyId, Integer id, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("$include", include);
        return ((RestCall<LocationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LocationModel>(){})).call();
    }

    /**
     * Retrieve a single location
     * 
     * Get the location object identified by this URL.
     * An 'Location' represents a physical address where a company does business.
     * Many taxing authorities require that you define a list of all locations where your company does business.
     * These locations may require additional custom configuration or tax registration with these authorities.
     * For more information on metadata requirements, see the '/api/v2/definitions/locationquestions' API.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param companyId The ID of the company that owns this location
     * @param id The primary key of this location
     * @param include A comma separated list of additional data to retrieve. You may specify `LocationSettings` to retrieve location settings.
     * @return LocationModel
     */
    public Future<LocationModel> getLocationAsync(Integer companyId, Integer id, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<LocationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LocationModel>(){}));
    }

    /**
     * Retrieve locations for this company
     * 
     * List all location objects defined for this company.
     * An 'Location' represents a physical address where a company does business.
     * Many taxing authorities require that you define a list of all locations where your company does business.
     * These locations may require additional custom configuration or tax registration with these authorities.
     * For more information on metadata requirements, see the '/api/v2/definitions/locationquestions' API.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param companyId The ID of the company that owns these locations
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve. You may specify `LocationSettings` to retrieve location settings.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<LocationModel>
     */
    public FetchResult<LocationModel> listLocationsByCompany(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){})).call();
    }

    /**
     * Retrieve locations for this company
     * 
     * List all location objects defined for this company.
     * An 'Location' represents a physical address where a company does business.
     * Many taxing authorities require that you define a list of all locations where your company does business.
     * These locations may require additional custom configuration or tax registration with these authorities.
     * For more information on metadata requirements, see the '/api/v2/definitions/locationquestions' API.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param companyId The ID of the company that owns these locations
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve. You may specify `LocationSettings` to retrieve location settings.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<LocationModel>
     */
    public Future<FetchResult<LocationModel>> listLocationsByCompanyAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){}));
    }

    /**
     * Retrieve all locations
     * 
     * Get multiple location objects across all companies.
     * An 'Location' represents a physical address where a company does business.
     * Many taxing authorities require that you define a list of all locations where your company does business.
     * These locations may require additional custom configuration or tax registration with these authorities.
     * For more information on metadata requirements, see the '/api/v2/definitions/locationquestions' API.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve. You may specify `LocationSettings` to retrieve location settings.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<LocationModel>
     */
    public FetchResult<LocationModel> queryLocations(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/locations");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){})).call();
    }

    /**
     * Retrieve all locations
     * 
     * Get multiple location objects across all companies.
     * An 'Location' represents a physical address where a company does business.
     * Many taxing authorities require that you define a list of all locations where your company does business.
     * These locations may require additional custom configuration or tax registration with these authorities.
     * For more information on metadata requirements, see the '/api/v2/definitions/locationquestions' API.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve. You may specify `LocationSettings` to retrieve location settings.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<LocationModel>
     */
    public Future<FetchResult<LocationModel>> queryLocationsAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/locations");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){}));
    }

    /**
     * Update a single location
     * 
     * Replace the existing location object at this URL with an updated object.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this location belongs to.
     * @param id The ID of the location you wish to update
     * @param model The location you wish to update.
     * @return LocationModel
     */
    public LocationModel updateLocation(Integer companyId, Integer id, LocationModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<LocationModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<LocationModel>(){})).call();
    }

    /**
     * Update a single location
     * 
     * Replace the existing location object at this URL with an updated object.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this location belongs to.
     * @param id The ID of the location you wish to update
     * @param model The location you wish to update.
     * @return LocationModel
     */
    public Future<LocationModel> updateLocationAsync(Integer companyId, Integer id, LocationModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<LocationModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<LocationModel>(){}));
    }

    /**
     * Validate the location against local requirements
     * 
     * Returns validation information for this location.
     * This API call is intended to compare this location against the currently known taxing authority rules and regulations,
     * 
     * @param companyId The ID of the company that owns this location
     * @param id The primary key of this location
     * @return LocationValidationModel
     */
    public LocationValidationModel validateLocation(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/validate");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<LocationValidationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LocationValidationModel>(){})).call();
    }

    /**
     * Validate the location against local requirements
     * 
     * Returns validation information for this location.
     * This API call is intended to compare this location against the currently known taxing authority rules and regulations,
     * 
     * @param companyId The ID of the company that owns this location
     * @param id The primary key of this location
     * @return LocationValidationModel
     */
    public Future<LocationValidationModel> validateLocationAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/validate");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<LocationValidationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LocationValidationModel>(){}));
    }

    /**
     * Adjust a MultiDocument transaction
     * 
     * Adjusts the current MultiDocument transaction uniquely identified by this URL.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * When you adjust a transaction, that transaction's status is recorded as `Adjusted`. 
     * 
     * Both the revisions will be available for retrieval based on their code and ID numbers. Only transactions in Committed status can be reported on a tax filing by Avalara's Managed Returns Service.
     * 
     * 
     * @param code The transaction code for this MultiDocument transaction
     * @param type The transaction type for this MultiDocument transaction (See DocumentType::* for a list of allowable values)
     * @param include Specifies objects to include in this fetch call
     * @param model The adjust request you wish to execute
     * @return MultiDocumentModel
     */
    public MultiDocumentModel adjustMultiDocumentTransaction(String code, DocumentType type, String include, AdjustMultiDocumentModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}/adjust");
        path.applyField("code", code);
        path.applyField("type", type);
        path.addQuery("include", include);
        return ((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){})).call();
    }

    /**
     * Adjust a MultiDocument transaction
     * 
     * Adjusts the current MultiDocument transaction uniquely identified by this URL.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * When you adjust a transaction, that transaction's status is recorded as `Adjusted`. 
     * 
     * Both the revisions will be available for retrieval based on their code and ID numbers. Only transactions in Committed status can be reported on a tax filing by Avalara's Managed Returns Service.
     * 
     * 
     * @param code The transaction code for this MultiDocument transaction
     * @param type The transaction type for this MultiDocument transaction (See DocumentType::* for a list of allowable values)
     * @param include Specifies objects to include in this fetch call
     * @param model The adjust request you wish to execute
     * @return MultiDocumentModel
     */
    public Future<MultiDocumentModel> adjustMultiDocumentTransactionAsync(String code, DocumentType type, String include, AdjustMultiDocumentModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}/adjust");
        path.applyField("code", code);
        path.applyField("type", type);
        path.addQuery("include", include);
        return this.threadPool.submit((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){}));
    }

    /**
     * Get audit information about a MultiDocument transaction
     * 
     * Retrieve audit information about a MultiDocument transaction stored in AvaTax.
     *  
     * The audit API retrieves audit information related to a specific MultiDocument transaction.  This audit 
     * information includes the following:
     * 
     * * The `code` of the MultiDocument transaction
     * * The `type` of the MultiDocument transaction
     * * The server timestamp representing the exact server time when the transaction was created
     * * The server duration - how long it took to process this transaction
     * * Whether exact API call details were logged
     * * A reconstructed API call showing what the original create call looked like
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param code The transaction code for this MultiDocument transaction
     * @param type The transaction type for this MultiDocument transaction (See DocumentType::* for a list of allowable values)
     * @return AuditMultiDocumentModel
     */
    public AuditMultiDocumentModel auditMultiDocumentTransaction(String code, DocumentType type) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}/audit");
        path.applyField("code", code);
        path.applyField("type", type);
        return ((RestCall<AuditMultiDocumentModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditMultiDocumentModel>(){})).call();
    }

    /**
     * Get audit information about a MultiDocument transaction
     * 
     * Retrieve audit information about a MultiDocument transaction stored in AvaTax.
     *  
     * The audit API retrieves audit information related to a specific MultiDocument transaction.  This audit 
     * information includes the following:
     * 
     * * The `code` of the MultiDocument transaction
     * * The `type` of the MultiDocument transaction
     * * The server timestamp representing the exact server time when the transaction was created
     * * The server duration - how long it took to process this transaction
     * * Whether exact API call details were logged
     * * A reconstructed API call showing what the original create call looked like
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param code The transaction code for this MultiDocument transaction
     * @param type The transaction type for this MultiDocument transaction (See DocumentType::* for a list of allowable values)
     * @return AuditMultiDocumentModel
     */
    public Future<AuditMultiDocumentModel> auditMultiDocumentTransactionAsync(String code, DocumentType type) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}/audit");
        path.applyField("code", code);
        path.applyField("type", type);
        return this.threadPool.submit((RestCall<AuditMultiDocumentModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditMultiDocumentModel>(){}));
    }

    /**
     * Commit a MultiDocument transaction
     * 
     * Marks a list of transactions by changing its status to `Committed`.
     * 
     * Transactions that are committed are available to be reported to a tax authority by Avalara Managed Returns.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * 
     * @param model The commit request you wish to execute
     * @return MultiDocumentModel
     */
    public MultiDocumentModel commitMultiDocumentTransaction(CommitMultiDocumentModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/commit");
        return ((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){})).call();
    }

    /**
     * Commit a MultiDocument transaction
     * 
     * Marks a list of transactions by changing its status to `Committed`.
     * 
     * Transactions that are committed are available to be reported to a tax authority by Avalara Managed Returns.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * 
     * @param model The commit request you wish to execute
     * @return MultiDocumentModel
     */
    public Future<MultiDocumentModel> commitMultiDocumentTransactionAsync(CommitMultiDocumentModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/commit");
        return this.threadPool.submit((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){}));
    }

    /**
     * Create a new MultiDocument transaction
     * 
     * Records a new MultiDocument transaction in AvaTax.
     * 
     * A traditional transaction requires exactly two parties: a seller and a buyer.  MultiDocument transactions can
     * involve a marketplace of vendors, each of which contributes some portion of the final transaction.  Within
     * a MultiDocument transaction, each individual buyer and seller pair are matched up and converted to a separate
     * document.  This separation of documents allows each seller to file their taxes separately.
     * 
     * This API will report an error if you attempt to create a transaction when one already exists with the specified `code`.
     * If you would like the API to automatically update the transaction when it already exists, please set the `allowAdjust`
     * value to `true`.
     * 
     * To generate a refund for a transaction, use the `RefundTransaction` API.
     * 
     * The field `type` identifies the kind of transaction - for example, a sale, purchase, or refund.  If you do not specify
     * a `type` value, you will receive an estimate of type `SalesOrder`, which will not be recorded.
     * 
     * The origin and destination locations for a transaction must be identified by either address or geocode.  For address-based transactions, please
     * provide addresses in the fields `line`, `city`, `region`, `country` and `postalCode`.  For geocode-based transactions, please provide the geocode
     * information in the fields `latitude` and `longitude`.  If either `latitude` or `longitude` or both are null, the transaction will be calculated
     * using the best available address location information.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * * ForceTimeout - Simulates a timeout.  This adds a 30 second delay and error to your API call.  This can be used to test your code to ensure it can respond correctly in the case of a dropped connection.
     *             
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model the multi document transaction model
     * @return MultiDocumentModel
     */
    public MultiDocumentModel createMultiDocumentTransaction(String include, CreateMultiDocumentModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument");
        path.addQuery("$include", include);
        return ((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){})).call();
    }

    /**
     * Create a new MultiDocument transaction
     * 
     * Records a new MultiDocument transaction in AvaTax.
     * 
     * A traditional transaction requires exactly two parties: a seller and a buyer.  MultiDocument transactions can
     * involve a marketplace of vendors, each of which contributes some portion of the final transaction.  Within
     * a MultiDocument transaction, each individual buyer and seller pair are matched up and converted to a separate
     * document.  This separation of documents allows each seller to file their taxes separately.
     * 
     * This API will report an error if you attempt to create a transaction when one already exists with the specified `code`.
     * If you would like the API to automatically update the transaction when it already exists, please set the `allowAdjust`
     * value to `true`.
     * 
     * To generate a refund for a transaction, use the `RefundTransaction` API.
     * 
     * The field `type` identifies the kind of transaction - for example, a sale, purchase, or refund.  If you do not specify
     * a `type` value, you will receive an estimate of type `SalesOrder`, which will not be recorded.
     * 
     * The origin and destination locations for a transaction must be identified by either address or geocode.  For address-based transactions, please
     * provide addresses in the fields `line`, `city`, `region`, `country` and `postalCode`.  For geocode-based transactions, please provide the geocode
     * information in the fields `latitude` and `longitude`.  If either `latitude` or `longitude` or both are null, the transaction will be calculated
     * using the best available address location information.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * * ForceTimeout - Simulates a timeout.  This adds a 30 second delay and error to your API call.  This can be used to test your code to ensure it can respond correctly in the case of a dropped connection.
     *             
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model the multi document transaction model
     * @return MultiDocumentModel
     */
    public Future<MultiDocumentModel> createMultiDocumentTransactionAsync(String include, CreateMultiDocumentModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument");
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){}));
    }

    /**
     * Retrieve a MultiDocument transaction
     * 
     * Get the current MultiDocument transaction identified by this URL.
     * 
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param code 
     * @param type  (See DocumentType::* for a list of allowable values)
     * @param include Specifies objects to include in the response after transaction is created
     * @return MultiDocumentModel
     */
    public MultiDocumentModel getMultiDocumentTransactionByCodeAndType(String code, DocumentType type, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}");
        path.applyField("code", code);
        path.applyField("type", type);
        path.addQuery("$include", include);
        return ((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<MultiDocumentModel>(){})).call();
    }

    /**
     * Retrieve a MultiDocument transaction
     * 
     * Get the current MultiDocument transaction identified by this URL.
     * 
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param code 
     * @param type  (See DocumentType::* for a list of allowable values)
     * @param include Specifies objects to include in the response after transaction is created
     * @return MultiDocumentModel
     */
    public Future<MultiDocumentModel> getMultiDocumentTransactionByCodeAndTypeAsync(String code, DocumentType type, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}");
        path.applyField("code", code);
        path.applyField("type", type);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<MultiDocumentModel>(){}));
    }

    /**
     * Retrieve a MultiDocument transaction by ID
     * 
     * Get the unique MultiDocument transaction identified by this URL.
     * 
     * A traditional transaction requires exactly two parties: a seller and a buyer.  MultiDocument transactions can
     * involve a marketplace of vendors, each of which contributes some portion of the final transaction.  Within
     * a MultiDocument transaction, each individual buyer and seller pair are matched up and converted to a separate
     * document.  This separation of documents allows each seller to file their taxes separately.
     * 
     * This endpoint retrieves the exact transaction identified by this ID number even if that transaction was later adjusted
     * by using the `AdjustTransaction` endpoint.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param id The unique ID number of the MultiDocument transaction to retrieve
     * @param include Specifies objects to include in the response after transaction is created
     * @return MultiDocumentModel
     */
    public MultiDocumentModel getMultiDocumentTransactionById(Long id, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{id}");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return ((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<MultiDocumentModel>(){})).call();
    }

    /**
     * Retrieve a MultiDocument transaction by ID
     * 
     * Get the unique MultiDocument transaction identified by this URL.
     * 
     * A traditional transaction requires exactly two parties: a seller and a buyer.  MultiDocument transactions can
     * involve a marketplace of vendors, each of which contributes some portion of the final transaction.  Within
     * a MultiDocument transaction, each individual buyer and seller pair are matched up and converted to a separate
     * document.  This separation of documents allows each seller to file their taxes separately.
     * 
     * This endpoint retrieves the exact transaction identified by this ID number even if that transaction was later adjusted
     * by using the `AdjustTransaction` endpoint.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param id The unique ID number of the MultiDocument transaction to retrieve
     * @param include Specifies objects to include in the response after transaction is created
     * @return MultiDocumentModel
     */
    public Future<MultiDocumentModel> getMultiDocumentTransactionByIdAsync(Long id, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{id}");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<MultiDocumentModel>(){}));
    }

    /**
     * Retrieve all MultiDocument transactions
     * 
     * List all MultiDocument transactions within this account.
     * 
     * This endpoint is limited to returning 1,000 MultiDocument transactions at a time.  To retrieve more than 1,000 MultiDocument
     * transactions, please use the pagination features of the API.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include Specifies objects to include in the response after transaction is created
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<MultiDocumentModel>
     */
    public FetchResult<MultiDocumentModel> listMultiDocumentTransactions(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<MultiDocumentModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<MultiDocumentModel>>(){})).call();
    }

    /**
     * Retrieve all MultiDocument transactions
     * 
     * List all MultiDocument transactions within this account.
     * 
     * This endpoint is limited to returning 1,000 MultiDocument transactions at a time.  To retrieve more than 1,000 MultiDocument
     * transactions, please use the pagination features of the API.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include Specifies objects to include in the response after transaction is created
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<MultiDocumentModel>
     */
    public Future<FetchResult<MultiDocumentModel>> listMultiDocumentTransactionsAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<MultiDocumentModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<MultiDocumentModel>>(){}));
    }

    /**
     * Create a refund for a MultiDocument transaction
     * 
     * Create a refund for a MultiDocument transaction.
     * 
     * A traditional transaction requires exactly two parties: a seller and a buyer.  MultiDocument transactions can
     * involve a marketplace of vendors, each of which contributes some portion of the final transaction.  Within
     * a MultiDocument transaction, each individual buyer and seller pair are matched up and converted to a separate
     * document.  This separation of documents allows each seller to file their taxes separately.
     * 
     * The `RefundTransaction` API allows you to quickly and easily create a `ReturnInvoice` representing a refund
     * for a previously created `SalesInvoice` transaction.  You can choose to create a full or partial refund, and
     * specify individual line items from the original sale for refund.
     * 
     * The `RefundTransaction` API ensures that the tax amount you refund to the customer exactly matches the tax that
     * was calculated during the original transaction, regardless of any changes to your company's configuration, rules,
     * nexus, or any other setting.
     * 
     * This API is intended to be a shortcut to allow you to quickly and accurately generate a refund for the following 
     * common refund scenarios:
     * 
     * * A full refund of a previous sale
     * * Refunding the tax that was charged on a previous sale, when the customer provides an exemption certificate after the purchase
     * * Refunding one or more items (lines) from a previous sale
     * * Granting a customer a percentage refund of a previous sale
     * 
     * For more complex scenarios than the ones above, please use `CreateTransaction` with document type `ReturnInvoice` to
     * create a custom refund transaction.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     *             
     * 
     * @param code The code of this MultiDocument transaction
     * @param type The type of this MultiDocument transaction (See DocumentType::* for a list of allowable values)
     * @param include Specifies objects to include in the response after transaction is created
     * @param model Information about the refund to create
     * @return MultiDocumentModel
     */
    public MultiDocumentModel refundMultiDocumentTransaction(String code, DocumentType type, String include, RefundTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}/refund");
        path.applyField("code", code);
        path.applyField("type", type);
        path.addQuery("$include", include);
        return ((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){})).call();
    }

    /**
     * Create a refund for a MultiDocument transaction
     * 
     * Create a refund for a MultiDocument transaction.
     * 
     * A traditional transaction requires exactly two parties: a seller and a buyer.  MultiDocument transactions can
     * involve a marketplace of vendors, each of which contributes some portion of the final transaction.  Within
     * a MultiDocument transaction, each individual buyer and seller pair are matched up and converted to a separate
     * document.  This separation of documents allows each seller to file their taxes separately.
     * 
     * The `RefundTransaction` API allows you to quickly and easily create a `ReturnInvoice` representing a refund
     * for a previously created `SalesInvoice` transaction.  You can choose to create a full or partial refund, and
     * specify individual line items from the original sale for refund.
     * 
     * The `RefundTransaction` API ensures that the tax amount you refund to the customer exactly matches the tax that
     * was calculated during the original transaction, regardless of any changes to your company's configuration, rules,
     * nexus, or any other setting.
     * 
     * This API is intended to be a shortcut to allow you to quickly and accurately generate a refund for the following 
     * common refund scenarios:
     * 
     * * A full refund of a previous sale
     * * Refunding the tax that was charged on a previous sale, when the customer provides an exemption certificate after the purchase
     * * Refunding one or more items (lines) from a previous sale
     * * Granting a customer a percentage refund of a previous sale
     * 
     * For more complex scenarios than the ones above, please use `CreateTransaction` with document type `ReturnInvoice` to
     * create a custom refund transaction.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     *             
     * 
     * @param code The code of this MultiDocument transaction
     * @param type The type of this MultiDocument transaction (See DocumentType::* for a list of allowable values)
     * @param include Specifies objects to include in the response after transaction is created
     * @param model Information about the refund to create
     * @return MultiDocumentModel
     */
    public Future<MultiDocumentModel> refundMultiDocumentTransactionAsync(String code, DocumentType type, String include, RefundTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}/refund");
        path.applyField("code", code);
        path.applyField("type", type);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){}));
    }

    /**
     * Verify a MultiDocument transaction
     * 
     * Verifies that the MultiDocument transaction uniquely identified by this URL matches certain expected values.
     * 
     * If the transaction does not match these expected values, this API will return an error code indicating which value did not match.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param model Information from your accounting system to verify against this MultiDocument transaction as it is stored in AvaTax
     * @return MultiDocumentModel
     */
    public MultiDocumentModel verifyMultiDocumentTransaction(VerifyMultiDocumentModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/verify");
        return ((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){})).call();
    }

    /**
     * Verify a MultiDocument transaction
     * 
     * Verifies that the MultiDocument transaction uniquely identified by this URL matches certain expected values.
     * 
     * If the transaction does not match these expected values, this API will return an error code indicating which value did not match.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param model Information from your accounting system to verify against this MultiDocument transaction as it is stored in AvaTax
     * @return MultiDocumentModel
     */
    public Future<MultiDocumentModel> verifyMultiDocumentTransactionAsync(VerifyMultiDocumentModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/verify");
        return this.threadPool.submit((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){}));
    }

    /**
     * Void a MultiDocument transaction
     * 
     * Voids the current transaction uniquely identified by this URL.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * When you void a transaction, that transaction's status is recorded as `DocVoided`.
     * 
     * Transactions that have been previously reported to a tax authority by Avalara Managed Returns Service are considered `locked`,
     * 
     * @param code The transaction code for this MultiDocument transaction
     * @param type The transaction type for this MultiDocument transaction (See DocumentType::* for a list of allowable values)
     * @param model The void request you wish to execute
     * @return MultiDocumentModel
     */
    public MultiDocumentModel voidMultiDocumentTransaction(String code, DocumentType type, VoidTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}/void");
        path.applyField("code", code);
        path.applyField("type", type);
        return ((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){})).call();
    }

    /**
     * Void a MultiDocument transaction
     * 
     * Voids the current transaction uniquely identified by this URL.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * When you void a transaction, that transaction's status is recorded as `DocVoided`.
     * 
     * Transactions that have been previously reported to a tax authority by Avalara Managed Returns Service are considered `locked`,
     * 
     * @param code The transaction code for this MultiDocument transaction
     * @param type The transaction type for this MultiDocument transaction (See DocumentType::* for a list of allowable values)
     * @param model The void request you wish to execute
     * @return MultiDocumentModel
     */
    public Future<MultiDocumentModel> voidMultiDocumentTransactionAsync(String code, DocumentType type, VoidTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/multidocument/{code}/type/{type}/void");
        path.applyField("code", code);
        path.applyField("type", type);
        return this.threadPool.submit((RestCall<MultiDocumentModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<MultiDocumentModel>(){}));
    }

    /**
     * Create a new nexus
     * 
     * Creates one or more new nexus objects attached to this company.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * Note that not all fields within a nexus can be updated; Avalara publishes a list of all defined nexus at the
     * '/api/v2/definitions/nexus' endpoint.
     * You may only define nexus matching the official list of declared nexus.
     * 
     * @param companyId The ID of the company that owns this nexus.
     * @param model The nexus you wish to create.
     * @return ArrayList<NexusModel>
     */
    public ArrayList<NexusModel> createNexus(Integer companyId, ArrayList<NexusModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<NexusModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NexusModel>>(){})).call();
    }

    /**
     * Create a new nexus
     * 
     * Creates one or more new nexus objects attached to this company.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * Note that not all fields within a nexus can be updated; Avalara publishes a list of all defined nexus at the
     * '/api/v2/definitions/nexus' endpoint.
     * You may only define nexus matching the official list of declared nexus.
     * 
     * @param companyId The ID of the company that owns this nexus.
     * @param model The nexus you wish to create.
     * @return ArrayList<NexusModel>
     */
    public Future<ArrayList<NexusModel>> createNexusAsync(Integer companyId, ArrayList<NexusModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<NexusModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NexusModel>>(){}));
    }

    /**
     * Delete a single nexus
     * 
     * Marks the existing nexus object at this URL as deleted.
     * 
     * @param companyId The ID of the company that owns this nexus.
     * @param id The ID of the nexus you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteNexus(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single nexus
     * 
     * Marks the existing nexus object at this URL as deleted.
     * 
     * @param companyId The ID of the company that owns this nexus.
     * @param id The ID of the nexus you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteNexusAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single nexus
     * 
     * Get the nexus object identified by this URL.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * 
     * @param companyId The ID of the company that owns this nexus object
     * @param id The primary key of this nexus
     * @return NexusModel
     */
    public NexusModel getNexus(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<NexusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusModel>(){})).call();
    }

    /**
     * Retrieve a single nexus
     * 
     * Get the nexus object identified by this URL.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * 
     * @param companyId The ID of the company that owns this nexus object
     * @param id The primary key of this nexus
     * @return NexusModel
     */
    public Future<NexusModel> getNexusAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<NexusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusModel>(){}));
    }

    /**
     * List company nexus related to a tax form
     * 
     * Retrieves a list of nexus related to a tax form.
     * 
     * The concept of `Nexus` indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * 
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * 
     * This API is intended to provide useful information when examining a tax form.  If you are about to begin filing
     * a tax form, you may want to know whether you have declared nexus in all the jurisdictions related to that tax 
     * 
     * @param companyId The ID of the company that owns this nexus object
     * @param formCode The form code that we are looking up the nexus for
     * @return NexusByTaxFormModel
     */
    public NexusByTaxFormModel getNexusByFormCode(Integer companyId, String formCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/byform/{formCode}");
        path.applyField("companyId", companyId);
        path.applyField("formCode", formCode);
        return ((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusByTaxFormModel>(){})).call();
    }

    /**
     * List company nexus related to a tax form
     * 
     * Retrieves a list of nexus related to a tax form.
     * 
     * The concept of `Nexus` indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * 
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * 
     * This API is intended to provide useful information when examining a tax form.  If you are about to begin filing
     * a tax form, you may want to know whether you have declared nexus in all the jurisdictions related to that tax 
     * 
     * @param companyId The ID of the company that owns this nexus object
     * @param formCode The form code that we are looking up the nexus for
     * @return NexusByTaxFormModel
     */
    public Future<NexusByTaxFormModel> getNexusByFormCodeAsync(Integer companyId, String formCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/byform/{formCode}");
        path.applyField("companyId", companyId);
        path.applyField("formCode", formCode);
        return this.threadPool.submit((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusByTaxFormModel>(){}));
    }

    /**
     * Retrieve nexus for this company
     * 
     * List all nexus objects defined for this company.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these nexus objects
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public FetchResult<NexusModel> listNexusByCompany(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve nexus for this company
     * 
     * List all nexus objects defined for this company.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these nexus objects
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public Future<FetchResult<NexusModel>> listNexusByCompanyAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    /**
     * Retrieve all nexus
     * 
     * Get multiple nexus objects across all companies.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public FetchResult<NexusModel> queryNexus(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/nexus");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve all nexus
     * 
     * Get multiple nexus objects across all companies.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NexusModel>
     */
    public Future<FetchResult<NexusModel>> queryNexusAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/nexus");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    /**
     * Update a single nexus
     * 
     * Replace the existing nexus object at this URL with an updated object.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * Note that not all fields within a nexus can be updated; Avalara publishes a list of all defined nexus at the
     * '/api/v2/definitions/nexus' endpoint.
     * You may only define nexus matching the official list of declared nexus.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * To set a field's value to null, you may either set its value to null or omit that field from the object you post.
     * 
     * @param companyId The ID of the company that this nexus belongs to.
     * @param id The ID of the nexus you wish to update
     * @param model The nexus object you wish to update.
     * @return NexusModel
     */
    public NexusModel updateNexus(Integer companyId, Integer id, NexusModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<NexusModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<NexusModel>(){})).call();
    }

    /**
     * Update a single nexus
     * 
     * Replace the existing nexus object at this URL with an updated object.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * in all jurisdictions affected by your transactions.
     * Note that not all fields within a nexus can be updated; Avalara publishes a list of all defined nexus at the
     * '/api/v2/definitions/nexus' endpoint.
     * You may only define nexus matching the official list of declared nexus.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * To set a field's value to null, you may either set its value to null or omit that field from the object you post.
     * 
     * @param companyId The ID of the company that this nexus belongs to.
     * @param id The ID of the nexus you wish to update
     * @param model The nexus object you wish to update.
     * @return NexusModel
     */
    public Future<NexusModel> updateNexusAsync(Integer companyId, Integer id, NexusModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<NexusModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<NexusModel>(){}));
    }

    /**
     * Create a new notice comment.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the tax notice we are adding the comment for.
     * @param model The notice comments you wish to create.
     * @return ArrayList<NoticeCommentModel>
     */
    public ArrayList<NoticeCommentModel> createNoticeComment(Integer companyId, Integer id, ArrayList<NoticeCommentModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<NoticeCommentModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeCommentModel>>(){})).call();
    }

    /**
     * Create a new notice comment.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the tax notice we are adding the comment for.
     * @param model The notice comments you wish to create.
     * @return ArrayList<NoticeCommentModel>
     */
    public Future<ArrayList<NoticeCommentModel>> createNoticeCommentAsync(Integer companyId, Integer id, ArrayList<NoticeCommentModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<NoticeCommentModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeCommentModel>>(){}));
    }

    /**
     * Create a new notice finance details.
     * 
     * This API is available by invitation only.
     * 'Notice finance details' is the categorical breakdown of the total charge levied by the tax authority on our customer,
     * as broken down in our "notice log" found in Workflow. Main examples of the categories are 'Tax Due', 'Interest', 'Penalty', 'Total Abated'.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the notice added to the finance details.
     * @param model The notice finance details you wish to create.
     * @return ArrayList<NoticeFinanceModel>
     */
    public ArrayList<NoticeFinanceModel> createNoticeFinanceDetails(Integer companyId, Integer id, ArrayList<NoticeFinanceModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<NoticeFinanceModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeFinanceModel>>(){})).call();
    }

    /**
     * Create a new notice finance details.
     * 
     * This API is available by invitation only.
     * 'Notice finance details' is the categorical breakdown of the total charge levied by the tax authority on our customer,
     * as broken down in our "notice log" found in Workflow. Main examples of the categories are 'Tax Due', 'Interest', 'Penalty', 'Total Abated'.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the notice added to the finance details.
     * @param model The notice finance details you wish to create.
     * @return ArrayList<NoticeFinanceModel>
     */
    public Future<ArrayList<NoticeFinanceModel>> createNoticeFinanceDetailsAsync(Integer companyId, Integer id, ArrayList<NoticeFinanceModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<NoticeFinanceModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeFinanceModel>>(){}));
    }

    /**
     * Create a new notice responsibility.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the tax notice we are adding the responsibility for.
     * @param model The notice responsibilities you wish to create.
     * @return ArrayList<NoticeResponsibilityDetailModel>
     */
    public ArrayList<NoticeResponsibilityDetailModel> createNoticeResponsibilities(Integer companyId, Integer id, ArrayList<NoticeResponsibilityDetailModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeResponsibilityDetailModel>>(){})).call();
    }

    /**
     * Create a new notice responsibility.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the tax notice we are adding the responsibility for.
     * @param model The notice responsibilities you wish to create.
     * @return ArrayList<NoticeResponsibilityDetailModel>
     */
    public Future<ArrayList<NoticeResponsibilityDetailModel>> createNoticeResponsibilitiesAsync(Integer companyId, Integer id, ArrayList<NoticeResponsibilityDetailModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeResponsibilityDetailModel>>(){}));
    }

    /**
     * Create a new notice root cause.
     * 
     * This API is available by invitation only.
     * 'Notice root causes' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the tax notice we are adding the responsibility for.
     * @param model The notice root causes you wish to create.
     * @return ArrayList<NoticeRootCauseDetailModel>
     */
    public ArrayList<NoticeRootCauseDetailModel> createNoticeRootCauses(Integer companyId, Integer id, ArrayList<NoticeRootCauseDetailModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeRootCauseDetailModel>>(){})).call();
    }

    /**
     * Create a new notice root cause.
     * 
     * This API is available by invitation only.
     * 'Notice root causes' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the tax notice we are adding the responsibility for.
     * @param model The notice root causes you wish to create.
     * @return ArrayList<NoticeRootCauseDetailModel>
     */
    public Future<ArrayList<NoticeRootCauseDetailModel>> createNoticeRootCausesAsync(Integer companyId, Integer id, ArrayList<NoticeRootCauseDetailModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeRootCauseDetailModel>>(){}));
    }

    /**
     * Create a new notice.
     * 
     * This API is available by invitation only.
     * Create one or more new notice objects.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param model The notice object you wish to create.
     * @return ArrayList<NoticeModel>
     */
    public ArrayList<NoticeModel> createNotices(Integer companyId, ArrayList<NoticeModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<NoticeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeModel>>(){})).call();
    }

    /**
     * Create a new notice.
     * 
     * This API is available by invitation only.
     * Create one or more new notice objects.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param model The notice object you wish to create.
     * @return ArrayList<NoticeModel>
     */
    public Future<ArrayList<NoticeModel>> createNoticesAsync(Integer companyId, ArrayList<NoticeModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<NoticeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeModel>>(){}));
    }

    /**
     * Delete a single notice.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the notice you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteNotice(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single notice.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param id The ID of the notice you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteNoticeAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Delete a single responsibility
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param noticeId The ID of the notice you wish to delete.
     * @param id The ID of the responsibility you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteResponsibilities(Integer companyId, Integer noticeId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{noticeId}/responsibilities/{id}");
        path.applyField("companyId", companyId);
        path.applyField("noticeId", noticeId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single responsibility
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param noticeId The ID of the notice you wish to delete.
     * @param id The ID of the responsibility you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteResponsibilitiesAsync(Integer companyId, Integer noticeId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{noticeId}/responsibilities/{id}");
        path.applyField("companyId", companyId);
        path.applyField("noticeId", noticeId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Delete a single root cause.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param noticeId The ID of the notice you wish to delete.
     * @param id The ID of the root cause you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteRootCauses(Integer companyId, Integer noticeId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{noticeId}/rootcauses/{id}");
        path.applyField("companyId", companyId);
        path.applyField("noticeId", noticeId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single root cause.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company that owns this notice.
     * @param noticeId The ID of the notice you wish to delete.
     * @param id The ID of the root cause you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteRootCausesAsync(Integer companyId, Integer noticeId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{noticeId}/rootcauses/{id}");
        path.applyField("companyId", companyId);
        path.applyField("noticeId", noticeId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single attachment
     * 
     * This API is available by invitation only.
     * 
     * @param companyId The ID of the company for this attachment.
     * @param id The ResourceFileId of the attachment to download.
     * @return String
     */
    public String downloadNoticeAttachment(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Retrieve a single attachment
     * 
     * This API is available by invitation only.
     * 
     * @param companyId The ID of the company for this attachment.
     * @param id The ResourceFileId of the attachment to download.
     * @return String
     */
    public Future<String> downloadNoticeAttachmentAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Retrieve a single notice.
     * 
     * This API is available by invitation only.
     * Get the tax notice object identified by this URL.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company for this notice.
     * @param id The ID of this notice.
     * @return NoticeModel
     */
    public NoticeModel getNotice(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<NoticeModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NoticeModel>(){})).call();
    }

    /**
     * Retrieve a single notice.
     * 
     * This API is available by invitation only.
     * Get the tax notice object identified by this URL.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param companyId The ID of the company for this notice.
     * @param id The ID of this notice.
     * @return NoticeModel
     */
    public Future<NoticeModel> getNoticeAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<NoticeModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NoticeModel>(){}));
    }

    /**
     * Retrieve notice comments for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param id The ID of the notice.
     * @param companyId The ID of the company that owns these notices.
     * @return FetchResult<NoticeCommentModel>
     */
    public FetchResult<NoticeCommentModel> getNoticeComments(Integer id, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeCommentModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCommentModel>>(){})).call();
    }

    /**
     * Retrieve notice comments for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param id The ID of the notice.
     * @param companyId The ID of the company that owns these notices.
     * @return FetchResult<NoticeCommentModel>
     */
    public Future<FetchResult<NoticeCommentModel>> getNoticeCommentsAsync(Integer id, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FetchResult<NoticeCommentModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCommentModel>>(){}));
    }

    /**
     * Retrieve notice finance details for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice finance details' is the categorical breakdown of the total charge levied by the tax authority on our customer,
     * as broken down in our "notice log" found in Workflow. Main examples of the categories are 'Tax Due', 'Interest', 'Penalty', 'Total Abated'.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param id The ID of the company that owns these notices.
     * @param companyId The ID of the company that owns these notices.
     * @return FetchResult<NoticeFinanceModel>
     */
    public FetchResult<NoticeFinanceModel> getNoticeFinanceDetails(Integer id, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeFinanceModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeFinanceModel>>(){})).call();
    }

    /**
     * Retrieve notice finance details for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice finance details' is the categorical breakdown of the total charge levied by the tax authority on our customer,
     * as broken down in our "notice log" found in Workflow. Main examples of the categories are 'Tax Due', 'Interest', 'Penalty', 'Total Abated'.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param id The ID of the company that owns these notices.
     * @param companyId The ID of the company that owns these notices.
     * @return FetchResult<NoticeFinanceModel>
     */
    public Future<FetchResult<NoticeFinanceModel>> getNoticeFinanceDetailsAsync(Integer id, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FetchResult<NoticeFinanceModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeFinanceModel>>(){}));
    }

    /**
     * Retrieve notice responsibilities for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice responsibilities' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param id The ID of the notice.
     * @param companyId The ID of the company that owns these notices.
     * @return FetchResult<NoticeResponsibilityDetailModel>
     */
    public FetchResult<NoticeResponsibilityDetailModel> getNoticeResponsibilities(Integer id, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeResponsibilityDetailModel>>(){})).call();
    }

    /**
     * Retrieve notice responsibilities for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice responsibilities' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param id The ID of the notice.
     * @param companyId The ID of the company that owns these notices.
     * @return FetchResult<NoticeResponsibilityDetailModel>
     */
    public Future<FetchResult<NoticeResponsibilityDetailModel>> getNoticeResponsibilitiesAsync(Integer id, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FetchResult<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeResponsibilityDetailModel>>(){}));
    }

    /**
     * Retrieve notice root causes for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice root causes' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param id The ID of the notice.
     * @param companyId The ID of the company that owns these notices.
     * @return FetchResult<NoticeRootCauseDetailModel>
     */
    public FetchResult<NoticeRootCauseDetailModel> getNoticeRootCauses(Integer id, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeRootCauseDetailModel>>(){})).call();
    }

    /**
     * Retrieve notice root causes for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice root causes' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param id The ID of the notice.
     * @param companyId The ID of the company that owns these notices.
     * @return FetchResult<NoticeRootCauseDetailModel>
     */
    public Future<FetchResult<NoticeRootCauseDetailModel>> getNoticeRootCausesAsync(Integer id, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FetchResult<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeRootCauseDetailModel>>(){}));
    }

    /**
     * Retrieve notices for a company.
     * 
     * This API is available by invitation only.
     * List all tax notice objects assigned to this company.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * Returns customers often receive support and assistance from the Compliance Notices team in handling notices received by taxing authorities.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these notices.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeModel>
     */
    public FetchResult<NoticeModel> listNoticesByCompany(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeModel>>(){})).call();
    }

    /**
     * Retrieve notices for a company.
     * 
     * This API is available by invitation only.
     * List all tax notice objects assigned to this company.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * Returns customers often receive support and assistance from the Compliance Notices team in handling notices received by taxing authorities.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these notices.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeModel>
     */
    public Future<FetchResult<NoticeModel>> listNoticesByCompanyAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeModel>>(){}));
    }

    /**
     * Retrieve all notices.
     * 
     * This API is available by invitation only.
     * Get multiple notice objects across all companies.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * Returns customers often receive support and assistance from the Compliance Notices team in handling notices received by taxing authorities.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeModel>
     */
    public FetchResult<NoticeModel> queryNotices(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/notices");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeModel>>(){})).call();
    }

    /**
     * Retrieve all notices.
     * 
     * This API is available by invitation only.
     * Get multiple notice objects across all companies.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * Returns customers often receive support and assistance from the Compliance Notices team in handling notices received by taxing authorities.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<NoticeModel>
     */
    public Future<FetchResult<NoticeModel>> queryNoticesAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/notices");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeModel>>(){}));
    }

    /**
     * Update a single notice.
     * 
     * This API is available by invitation only.
     * Replace the existing notice object at this URL with an updated object.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * Returns customers often receive support and assistance from the Compliance Notices team in handling notices received by taxing authorities.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this notice belongs to.
     * @param id The ID of the notice you wish to update.
     * @param model The notice object you wish to update.
     * @return NoticeModel
     */
    public NoticeModel updateNotice(Integer companyId, Integer id, NoticeModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<NoticeModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<NoticeModel>(){})).call();
    }

    /**
     * Update a single notice.
     * 
     * This API is available by invitation only.
     * Replace the existing notice object at this URL with an updated object.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * Returns customers often receive support and assistance from the Compliance Notices team in handling notices received by taxing authorities.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this notice belongs to.
     * @param id The ID of the notice you wish to update.
     * @param model The notice object you wish to update.
     * @return NoticeModel
     */
    public Future<NoticeModel> updateNoticeAsync(Integer companyId, Integer id, NoticeModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<NoticeModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<NoticeModel>(){}));
    }

    /**
     * Retrieve a single attachment
     * 
     * This API is available by invitation only.
     * 
     * @param companyId The ID of the company for this attachment.
     * @param model The ResourceFileId of the attachment to download.
     * @return String
     */
    public String uploadAttachment(Integer companyId, ResourceFileUploadRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/attachment");
        path.applyField("companyId", companyId);
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){})).call();
    }

    /**
     * Retrieve a single attachment
     * 
     * This API is available by invitation only.
     * 
     * @param companyId The ID of the company for this attachment.
     * @param model The ResourceFileId of the attachment to download.
     * @return String
     */
    public Future<String> uploadAttachmentAsync(Integer companyId, ResourceFileUploadRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/attachment");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){}));
    }

    /**
     * Request a new Avalara account
     * 
     * This API is for use by partner onboarding services customers only.
     * 
     * Avalara invites select partners to refer new customers to the AvaTax service using the onboarding features
     * of AvaTax.  These partners can create accounts for new customers using this API.
     * 
     * Calling this API creates an account with the specified product subscriptions, but does not configure billing.
     * The customer will receive information from Avalara about how to configure billing for their account.
     * You should call this API when a customer has requested to begin using Avalara services.
     * 
     * If the newly created account owner wishes, they can confirm that they have read and agree to the Avalara
     * terms and conditions.  If they do so, they can receive a license key as part of this API and their
     * API will be created in `Active` status.  If the customer has not yet read and accepted these terms and
     * conditions, the account will be created in `New` status and they can receive a license key by logging
     * 
     * @param model Information about the account you wish to create and the selected product offerings.
     * @return NewAccountModel
     */
    public NewAccountModel requestNewAccount(NewAccountRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/request");
        return ((RestCall<NewAccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<NewAccountModel>(){})).call();
    }

    /**
     * Request a new Avalara account
     * 
     * This API is for use by partner onboarding services customers only.
     * 
     * Avalara invites select partners to refer new customers to the AvaTax service using the onboarding features
     * of AvaTax.  These partners can create accounts for new customers using this API.
     * 
     * Calling this API creates an account with the specified product subscriptions, but does not configure billing.
     * The customer will receive information from Avalara about how to configure billing for their account.
     * You should call this API when a customer has requested to begin using Avalara services.
     * 
     * If the newly created account owner wishes, they can confirm that they have read and agree to the Avalara
     * terms and conditions.  If they do so, they can receive a license key as part of this API and their
     * API will be created in `Active` status.  If the customer has not yet read and accepted these terms and
     * conditions, the account will be created in `New` status and they can receive a license key by logging
     * 
     * @param model Information about the account you wish to create and the selected product offerings.
     * @return NewAccountModel
     */
    public Future<NewAccountModel> requestNewAccountAsync(NewAccountRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/request");
        return this.threadPool.submit((RestCall<NewAccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<NewAccountModel>(){}));
    }

    /**
     * Change Password
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Allows a user to change their password via the API.
     * This API only allows the currently authenticated user to change their password; it cannot be used to apply to a
     * 
     * @param model An object containing your current password and the new password.
     * @return String
     */
    public String changePassword(PasswordChangeModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords");
        return ((RestCall<String>)restCallFactory.createRestCall("put", path, model, new TypeToken<String>(){})).call();
    }

    /**
     * Change Password
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Allows a user to change their password via the API.
     * This API only allows the currently authenticated user to change their password; it cannot be used to apply to a
     * 
     * @param model An object containing your current password and the new password.
     * @return String
     */
    public Future<String> changePasswordAsync(PasswordChangeModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords");
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("put", path, model, new TypeToken<String>(){}));
    }

    /**
     * Create a new account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Create a single new account object.  
     * 
     * @param model The account you wish to create.
     * @return AccountModel
     */
    public AccountModel createAccount(AccountModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AccountModel>(){})).call();
    }

    /**
     * Create a new account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Create a single new account object.  
     * 
     * @param model The account you wish to create.
     * @return AccountModel
     */
    public Future<AccountModel> createAccountAsync(AccountModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        return this.threadPool.submit((RestCall<AccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AccountModel>(){}));
    }

    /**
     * Create a new subscription
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Create one or more new subscription objects attached to this account.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * 
     * @param accountId The ID of the account that owns this subscription.
     * @param model The subscription you wish to create.
     * @return ArrayList<SubscriptionModel>
     */
    public ArrayList<SubscriptionModel> createSubscriptions(Integer accountId, ArrayList<SubscriptionModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.applyField("accountId", accountId);
        return ((RestCall<ArrayList<SubscriptionModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<SubscriptionModel>>(){})).call();
    }

    /**
     * Create a new subscription
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Create one or more new subscription objects attached to this account.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * 
     * @param accountId The ID of the account that owns this subscription.
     * @param model The subscription you wish to create.
     * @return ArrayList<SubscriptionModel>
     */
    public Future<ArrayList<SubscriptionModel>> createSubscriptionsAsync(Integer accountId, ArrayList<SubscriptionModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<ArrayList<SubscriptionModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<SubscriptionModel>>(){}));
    }

    /**
     * Delete a single account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Delete an account.
     * 
     * @param id The ID of the account you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteAccount(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Delete an account.
     * 
     * @param id The ID of the account you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteAccountAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Delete a single subscription
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param accountId The ID of the account that owns this subscription.
     * @param id The ID of the subscription you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteSubscription(Integer accountId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single subscription
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param accountId The ID of the account that owns this subscription.
     * @param id The ID of the subscription you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteSubscriptionAsync(Integer accountId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Delete a single user
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param id The ID of the user you wish to delete.
     * @param accountId The accountID of the user you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteUser(Integer id, Integer accountId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single user
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param id The ID of the user you wish to delete.
     * @param accountId The accountID of the user you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteUserAsync(Integer id, Integer accountId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve all accounts
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Get multiple account objects.
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Subscriptions
     * * Users
     *             
     * 
     * @param include A comma separated list of objects to fetch underneath this account. Any object with a URL path underneath this account can be fetched by specifying its name.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<AccountModel>
     */
    public FetchResult<AccountModel> queryAccounts(String include, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<AccountModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<AccountModel>>(){})).call();
    }

    /**
     * Retrieve all accounts
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Get multiple account objects.
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Subscriptions
     * * Users
     *             
     * 
     * @param include A comma separated list of objects to fetch underneath this account. Any object with a URL path underneath this account can be fetched by specifying its name.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<AccountModel>
     */
    public Future<FetchResult<AccountModel>> queryAccountsAsync(String include, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<AccountModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<AccountModel>>(){}));
    }

    /**
     * Reset a user's password programmatically
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Allows a system admin to reset the password for a specific user via the API.
     * This API is only available for Avalara Registrar Admins, and can be used to reset the password of any
     * 
     * @param userId The unique ID of the user whose password will be changed
     * @param model The new password for this user
     * @return String
     */
    public String resetPassword(Integer userId, SetPasswordModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords/{userId}/reset");
        path.applyField("userId", userId);
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){})).call();
    }

    /**
     * Reset a user's password programmatically
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Allows a system admin to reset the password for a specific user via the API.
     * This API is only available for Avalara Registrar Admins, and can be used to reset the password of any
     * 
     * @param userId The unique ID of the user whose password will be changed
     * @param model The new password for this user
     * @return String
     */
    public Future<String> resetPasswordAsync(Integer userId, SetPasswordModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords/{userId}/reset");
        path.applyField("userId", userId);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){}));
    }

    /**
     * Update a single account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param id The ID of the account you wish to update.
     * @param model The account object you wish to update.
     * @return AccountModel
     */
    public AccountModel updateAccount(Integer id, AccountModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<AccountModel>(){})).call();
    }

    /**
     * Update a single account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param id The ID of the account you wish to update.
     * @param model The account object you wish to update.
     * @return AccountModel
     */
    public Future<AccountModel> updateAccountAsync(Integer id, AccountModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<AccountModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<AccountModel>(){}));
    }

    /**
     * Update a single subscription
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Replace the existing subscription object at this URL with an updated object.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * To request or remove subscriptions, please contact Avalara sales or your customer account manager.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param accountId The ID of the account that this subscription belongs to.
     * @param id The ID of the subscription you wish to update
     * @param model The subscription you wish to update.
     * @return SubscriptionModel
     */
    public SubscriptionModel updateSubscription(Integer accountId, Integer id, SubscriptionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<SubscriptionModel>(){})).call();
    }

    /**
     * Update a single subscription
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Replace the existing subscription object at this URL with an updated object.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * To request or remove subscriptions, please contact Avalara sales or your customer account manager.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param accountId The ID of the account that this subscription belongs to.
     * @param id The ID of the subscription you wish to update
     * @param model The subscription you wish to update.
     * @return SubscriptionModel
     */
    public Future<SubscriptionModel> updateSubscriptionAsync(Integer accountId, Integer id, SubscriptionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<SubscriptionModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<SubscriptionModel>(){}));
    }

    /**
     * Download a report
     * 
     * This API downloads the file associated with a report.
     * 
     * If the report is not yet complete, you will receive a `ReportNotFinished` error.  To check if a report is complete,
     * use the `GetReport` API.
     * 
     * Reports are run as asynchronous report tasks on the server.  When complete, the report file will be available for download
     * for up to 30 days after completion.  To run an asynchronous report, you should follow these steps:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * * When a report's status is `Completed`, call `DownloadReport` to retrieve the file.
     * 
     * 
     * @param id The unique ID number of this report
     * @return String
     */
    public String downloadReport(Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/reports/{id}/attachment");
        path.applyField("id", id);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Download a report
     * 
     * This API downloads the file associated with a report.
     * 
     * If the report is not yet complete, you will receive a `ReportNotFinished` error.  To check if a report is complete,
     * use the `GetReport` API.
     * 
     * Reports are run as asynchronous report tasks on the server.  When complete, the report file will be available for download
     * for up to 30 days after completion.  To run an asynchronous report, you should follow these steps:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * * When a report's status is `Completed`, call `DownloadReport` to retrieve the file.
     * 
     * 
     * @param id The unique ID number of this report
     * @return String
     */
    public Future<String> downloadReportAsync(Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/reports/{id}/attachment");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Intiate and download an ExportDocumentLine report
     * 
     * This API is deprecated. 
     * 
     * Please use the asynchronous reports APIs:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * 
     * @param companyId The unique ID number of the company to report on.
     * @param model Options that may be configured to customize the report.
     * @return String
     */
    public String exportDocumentLine(Integer companyId, ExportDocumentLineModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/reports/exportdocumentline");
        path.applyField("companyId", companyId);
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){})).call();
    }

    /**
     * Intiate and download an ExportDocumentLine report
     * 
     * This API is deprecated. 
     * 
     * Please use the asynchronous reports APIs:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * 
     * @param companyId The unique ID number of the company to report on.
     * @param model Options that may be configured to customize the report.
     * @return String
     */
    public Future<String> exportDocumentLineAsync(Integer companyId, ExportDocumentLineModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/reports/exportdocumentline");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){}));
    }

    /**
     * Retrieve a single report
     * 
     * Retrieve a single report by its unique ID number.
     * 
     * Reports are run as asynchronous report tasks on the server.  When complete, the report file will be available for download
     * for up to 30 days after completion.  To run an asynchronous report, you should follow these steps:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * * When a report's status is `Completed`, call `DownloadReport` to retrieve the file.
     * 
     * 
     * @param id The unique ID number of the report to retrieve
     * @return ReportModel
     */
    public ReportModel getReport(Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/reports/{id}");
        path.applyField("id", id);
        return ((RestCall<ReportModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ReportModel>(){})).call();
    }

    /**
     * Retrieve a single report
     * 
     * Retrieve a single report by its unique ID number.
     * 
     * Reports are run as asynchronous report tasks on the server.  When complete, the report file will be available for download
     * for up to 30 days after completion.  To run an asynchronous report, you should follow these steps:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * * When a report's status is `Completed`, call `DownloadReport` to retrieve the file.
     * 
     * 
     * @param id The unique ID number of the report to retrieve
     * @return ReportModel
     */
    public Future<ReportModel> getReportAsync(Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/reports/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ReportModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ReportModel>(){}));
    }

    /**
     * Initiate an ExportDocumentLine report task
     * 
     * Begins running an `ExportDocumentLine` report task and returns the identity of the report.
     * 
     * Reports are run as asynchronous report tasks on the server.  When complete, the report file will be available for download
     * for up to 30 days after completion.  To run an asynchronous report, you should follow these steps:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * * When a report's status is `Completed`, call `DownloadReport` to retrieve the file.
     * 
     * 
     * @param companyId The unique ID number of the company to report on.
     * @param model Options that may be configured to customize the report.
     * @return String
     */
    public String initiateExportDocumentLineReport(Integer companyId, ExportDocumentLineModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/reports/exportdocumentline/initiate");
        path.applyField("companyId", companyId);
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){})).call();
    }

    /**
     * Initiate an ExportDocumentLine report task
     * 
     * Begins running an `ExportDocumentLine` report task and returns the identity of the report.
     * 
     * Reports are run as asynchronous report tasks on the server.  When complete, the report file will be available for download
     * for up to 30 days after completion.  To run an asynchronous report, you should follow these steps:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * * When a report's status is `Completed`, call `DownloadReport` to retrieve the file.
     * 
     * 
     * @param companyId The unique ID number of the company to report on.
     * @param model Options that may be configured to customize the report.
     * @return String
     */
    public Future<String> initiateExportDocumentLineReportAsync(Integer companyId, ExportDocumentLineModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/reports/exportdocumentline/initiate");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){}));
    }

    /**
     * List all report tasks for account
     * 
     * List all report tasks for your account.
     * 
     * Reports are run as asynchronous report tasks on the server.  When complete, the report file will be available for download
     * for up to 30 days after completion.  To run an asynchronous report, you should follow these steps:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * * When a report's status is `Completed`, call `DownloadReport` to retrieve the file.
     * 
     * 
     * @return FetchResult<ReportModel>
     */
    public FetchResult<ReportModel> listReports() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/reports");
        return ((RestCall<FetchResult<ReportModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ReportModel>>(){})).call();
    }

    /**
     * List all report tasks for account
     * 
     * List all report tasks for your account.
     * 
     * Reports are run as asynchronous report tasks on the server.  When complete, the report file will be available for download
     * for up to 30 days after completion.  To run an asynchronous report, you should follow these steps:
     * 
     * * Begin a report by calling the report's Initiate API.  There is a separate initiate API call for each report type.
     * * In the result of the Initiate API, you receive back a report's `id` value.
     * * Check the status of a report by calling `GetReport` and passing in the report's `id` value.
     * * When a report's status is `Completed`, call `DownloadReport` to retrieve the file.
     * 
     * 
     * @return FetchResult<ReportModel>
     */
    public Future<FetchResult<ReportModel>> listReportsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/reports");
        return this.threadPool.submit((RestCall<FetchResult<ReportModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ReportModel>>(){}));
    }

    /**
     * Create a new setting
     * 
     * Create one or more new setting objects attached to this company.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * 
     * @param companyId The ID of the company that owns this setting.
     * @param model The setting you wish to create.
     * @return ArrayList<SettingModel>
     */
    public ArrayList<SettingModel> createSettings(Integer companyId, ArrayList<SettingModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<SettingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<SettingModel>>(){})).call();
    }

    /**
     * Create a new setting
     * 
     * Create one or more new setting objects attached to this company.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * 
     * @param companyId The ID of the company that owns this setting.
     * @param model The setting you wish to create.
     * @return ArrayList<SettingModel>
     */
    public Future<ArrayList<SettingModel>> createSettingsAsync(Integer companyId, ArrayList<SettingModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<SettingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<SettingModel>>(){}));
    }

    /**
     * Delete a single setting
     * 
     * @param companyId The ID of the company that owns this setting.
     * @param id The ID of the setting you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteSetting(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single setting
     * 
     * @param companyId The ID of the company that owns this setting.
     * @param id The ID of the setting you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteSettingAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single setting
     * 
     * Get a single setting object by its unique ID.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * 
     * @param companyId The ID of the company that owns this setting
     * @param id The primary key of this setting
     * @return SettingModel
     */
    public SettingModel getSetting(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<SettingModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SettingModel>(){})).call();
    }

    /**
     * Retrieve a single setting
     * 
     * Get a single setting object by its unique ID.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * 
     * @param companyId The ID of the company that owns this setting
     * @param id The primary key of this setting
     * @return SettingModel
     */
    public Future<SettingModel> getSettingAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<SettingModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SettingModel>(){}));
    }

    /**
     * Retrieve all settings for this company
     * 
     * List all setting objects attached to this company.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * the 'set' data field.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these settings
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SettingModel>
     */
    public FetchResult<SettingModel> listSettingsByCompany(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){})).call();
    }

    /**
     * Retrieve all settings for this company
     * 
     * List all setting objects attached to this company.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * the 'set' data field.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these settings
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SettingModel>
     */
    public Future<FetchResult<SettingModel>> listSettingsByCompanyAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){}));
    }

    /**
     * Retrieve all settings
     * 
     * Get multiple setting objects across all companies.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * the 'set' data field.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SettingModel>
     */
    public FetchResult<SettingModel> querySettings(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/settings");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){})).call();
    }

    /**
     * Retrieve all settings
     * 
     * Get multiple setting objects across all companies.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * the 'set' data field.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SettingModel>
     */
    public Future<FetchResult<SettingModel>> querySettingsAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/settings");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){}));
    }

    /**
     * Update a single setting
     * 
     * Replace the existing setting object at this URL with an updated object.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * the 'set' data field.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this setting belongs to.
     * @param id The ID of the setting you wish to update
     * @param model The setting you wish to update.
     * @return SettingModel
     */
    public SettingModel updateSetting(Integer companyId, Integer id, SettingModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<SettingModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<SettingModel>(){})).call();
    }

    /**
     * Update a single setting
     * 
     * Replace the existing setting object at this URL with an updated object.
     * A 'setting' is a piece of user-defined data that can be attached to a company, and it provides you the ability to store information
     * not defined or managed by Avalara.
     * You may create, update, and delete your own settings objects as required, and there is no mandatory data format for the 'name' and 
     * 'value' data fields.
     * To ensure correct operation of other programs or connectors, please create a new GUID for your application and use that value for
     * the 'set' data field.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this setting belongs to.
     * @param id The ID of the setting you wish to update
     * @param model The setting you wish to update.
     * @return SettingModel
     */
    public Future<SettingModel> updateSettingAsync(Integer companyId, Integer id, SettingModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<SettingModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<SettingModel>(){}));
    }

    /**
     * Retrieve a single subscription
     * 
     * Get the subscription object identified by this URL.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * 
     * @param accountId The ID of the account that owns this subscription
     * @param id The primary key of this subscription
     * @return SubscriptionModel
     */
    public SubscriptionModel getSubscription(Integer accountId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){})).call();
    }

    /**
     * Retrieve a single subscription
     * 
     * Get the subscription object identified by this URL.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * 
     * @param accountId The ID of the account that owns this subscription
     * @param id The primary key of this subscription
     * @return SubscriptionModel
     */
    public Future<SubscriptionModel> getSubscriptionAsync(Integer accountId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){}));
    }

    /**
     * Retrieve subscriptions for this account
     * 
     * List all subscription objects attached to this account.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * To request or remove subscriptions, please contact Avalara sales or your customer account manager.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param accountId The ID of the account that owns these subscriptions
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SubscriptionModel>
     */
    public FetchResult<SubscriptionModel> listSubscriptionsByAccount(Integer accountId, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.applyField("accountId", accountId);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
    }

    /**
     * Retrieve subscriptions for this account
     * 
     * List all subscription objects attached to this account.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * To request or remove subscriptions, please contact Avalara sales or your customer account manager.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param accountId The ID of the account that owns these subscriptions
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SubscriptionModel>
     */
    public Future<FetchResult<SubscriptionModel>> listSubscriptionsByAccountAsync(Integer accountId, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.applyField("accountId", accountId);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){}));
    }

    /**
     * Retrieve all subscriptions
     * 
     * Get multiple subscription objects across all accounts.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * To request or remove subscriptions, please contact Avalara sales or your customer account manager.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SubscriptionModel>
     */
    public FetchResult<SubscriptionModel> querySubscriptions(String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/subscriptions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
    }

    /**
     * Retrieve all subscriptions
     * 
     * Get multiple subscription objects across all accounts.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * To request or remove subscriptions, please contact Avalara sales or your customer account manager.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<SubscriptionModel>
     */
    public Future<FetchResult<SubscriptionModel>> querySubscriptionsAsync(String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/subscriptions");
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){}));
    }

    /**
     * Create a new tax code
     * 
     * Create one or more new taxcode objects attached to this company.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param companyId The ID of the company that owns this tax code.
     * @param model The tax code you wish to create.
     * @return ArrayList<TaxCodeModel>
     */
    public ArrayList<TaxCodeModel> createTaxCodes(Integer companyId, ArrayList<TaxCodeModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<TaxCodeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<TaxCodeModel>>(){})).call();
    }

    /**
     * Create a new tax code
     * 
     * Create one or more new taxcode objects attached to this company.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param companyId The ID of the company that owns this tax code.
     * @param model The tax code you wish to create.
     * @return ArrayList<TaxCodeModel>
     */
    public Future<ArrayList<TaxCodeModel>> createTaxCodesAsync(Integer companyId, ArrayList<TaxCodeModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<TaxCodeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<TaxCodeModel>>(){}));
    }

    /**
     * Delete a single tax code
     * 
     * @param companyId The ID of the company that owns this tax code.
     * @param id The ID of the tax code you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteTaxCode(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single tax code
     * 
     * @param companyId The ID of the company that owns this tax code.
     * @param id The ID of the tax code you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteTaxCodeAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single tax code
     * 
     * Get the taxcode object identified by this URL.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param companyId The ID of the company that owns this tax code
     * @param id The primary key of this tax code
     * @return TaxCodeModel
     */
    public TaxCodeModel getTaxCode(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<TaxCodeModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxCodeModel>(){})).call();
    }

    /**
     * Retrieve a single tax code
     * 
     * Get the taxcode object identified by this URL.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param companyId The ID of the company that owns this tax code
     * @param id The primary key of this tax code
     * @return TaxCodeModel
     */
    public Future<TaxCodeModel> getTaxCodeAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<TaxCodeModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxCodeModel>(){}));
    }

    /**
     * Retrieve tax codes for this company
     * 
     * List all taxcode objects attached to this company.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * taxability rules for this product in all supported jurisdictions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these tax codes
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxCodeModel>
     */
    public FetchResult<TaxCodeModel> listTaxCodesByCompany(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
    }

    /**
     * Retrieve tax codes for this company
     * 
     * List all taxcode objects attached to this company.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * taxability rules for this product in all supported jurisdictions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these tax codes
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxCodeModel>
     */
    public Future<FetchResult<TaxCodeModel>> listTaxCodesByCompanyAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){}));
    }

    /**
     * Retrieve all tax codes
     * 
     * Get multiple taxcode objects across all companies.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * taxability rules for this product in all supported jurisdictions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxCodeModel>
     */
    public FetchResult<TaxCodeModel> queryTaxCodes(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxcodes");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
    }

    /**
     * Retrieve all tax codes
     * 
     * Get multiple taxcode objects across all companies.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * taxability rules for this product in all supported jurisdictions.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxCodeModel>
     */
    public Future<FetchResult<TaxCodeModel>> queryTaxCodesAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxcodes");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){}));
    }

    /**
     * Update a single tax code
     * 
     * Replace the existing taxcode object at this URL with an updated object.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * taxability rules for this product in all supported jurisdictions.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this tax code belongs to.
     * @param id The ID of the tax code you wish to update
     * @param model The tax code you wish to update.
     * @return TaxCodeModel
     */
    public TaxCodeModel updateTaxCode(Integer companyId, Integer id, TaxCodeModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<TaxCodeModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<TaxCodeModel>(){})).call();
    }

    /**
     * Update a single tax code
     * 
     * Replace the existing taxcode object at this URL with an updated object.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * taxability rules for this product in all supported jurisdictions.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this tax code belongs to.
     * @param id The ID of the tax code you wish to update
     * @param model The tax code you wish to update.
     * @return TaxCodeModel
     */
    public Future<TaxCodeModel> updateTaxCodeAsync(Integer companyId, Integer id, TaxCodeModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<TaxCodeModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<TaxCodeModel>(){}));
    }

    /**
     * Build a multi-location tax content file
     * 
     * Builds a tax content file containing information useful for a retail point-of-sale solution.
     * 
     * This file contains tax rates and rules for items and locations that can be used
     * to correctly calculate tax in the event a point-of-sale device is not able to reach AvaTax.
     * 
     * This data file can be customized for specific partner devices and usage conditions.
     * 
     * The result of this API is the file you requested in the format you requested using the `responseType` field.
     * 
     * This API builds the file on demand, and is limited to files with no more than 7500 scenarios.  To build a tax content
     * file for a single location at a time, please use `BuildTaxContentFileForLocation`.
     * 
     * 
     * @param model Parameters about the desired file format and report format, specifying which company, locations and TaxCodes to include.
     * @return String
     */
    public String buildTaxContentFile(PointOfSaleDataRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/pointofsaledata/build");
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){})).call();
    }

    /**
     * Build a multi-location tax content file
     * 
     * Builds a tax content file containing information useful for a retail point-of-sale solution.
     * 
     * This file contains tax rates and rules for items and locations that can be used
     * to correctly calculate tax in the event a point-of-sale device is not able to reach AvaTax.
     * 
     * This data file can be customized for specific partner devices and usage conditions.
     * 
     * The result of this API is the file you requested in the format you requested using the `responseType` field.
     * 
     * This API builds the file on demand, and is limited to files with no more than 7500 scenarios.  To build a tax content
     * file for a single location at a time, please use `BuildTaxContentFileForLocation`.
     * 
     * 
     * @param model Parameters about the desired file format and report format, specifying which company, locations and TaxCodes to include.
     * @return String
     */
    public Future<String> buildTaxContentFileAsync(PointOfSaleDataRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/pointofsaledata/build");
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){}));
    }

    /**
     * Build a tax content file for a single location
     * 
     * Builds a tax content file containing information useful for a retail point-of-sale solution.
     * 
     * This file contains tax rates and rules for all items for a single location.  Data from this API
     * can be used to correctly calculate tax in the event a point-of-sale device is not able to reach AvaTax.
     * 
     * This data file can be customized for specific partner devices and usage conditions.
     * 
     * The result of this API is the file you requested in the format you requested using the `responseType` field.
     * 
     * This API builds the file on demand, and is limited to files with no more than 7500 scenarios.  To build a tax content
     * file for a multiple locations in a single file, please use `BuildTaxContentFile`.
     * 
     * 
     * @param companyId The ID number of the company that owns this location.
     * @param id The ID number of the location to retrieve point-of-sale data.
     * @param date The date for which point-of-sale data would be calculated (today by default)
     * @param format The format of the file (JSON by default) (See PointOfSaleFileType::* for a list of allowable values)
     * @param partnerId If specified, requests a custom partner-formatted version of the file. (See PointOfSalePartnerId::* for a list of allowable values)
     * @param includeJurisCodes When true, the file will include jurisdiction codes in the result.
     * @return String
     */
    public String buildTaxContentFileForLocation(Integer companyId, Integer id, Date date, PointOfSaleFileType format, PointOfSalePartnerId partnerId, Boolean includeJurisCodes) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/pointofsaledata");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("date", date);
        path.addQuery("format", format);
        path.addQuery("partnerId", partnerId);
        path.addQuery("includeJurisCodes", includeJurisCodes);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Build a tax content file for a single location
     * 
     * Builds a tax content file containing information useful for a retail point-of-sale solution.
     * 
     * This file contains tax rates and rules for all items for a single location.  Data from this API
     * can be used to correctly calculate tax in the event a point-of-sale device is not able to reach AvaTax.
     * 
     * This data file can be customized for specific partner devices and usage conditions.
     * 
     * The result of this API is the file you requested in the format you requested using the `responseType` field.
     * 
     * This API builds the file on demand, and is limited to files with no more than 7500 scenarios.  To build a tax content
     * file for a multiple locations in a single file, please use `BuildTaxContentFile`.
     * 
     * 
     * @param companyId The ID number of the company that owns this location.
     * @param id The ID number of the location to retrieve point-of-sale data.
     * @param date The date for which point-of-sale data would be calculated (today by default)
     * @param format The format of the file (JSON by default) (See PointOfSaleFileType::* for a list of allowable values)
     * @param partnerId If specified, requests a custom partner-formatted version of the file. (See PointOfSalePartnerId::* for a list of allowable values)
     * @param includeJurisCodes When true, the file will include jurisdiction codes in the result.
     * @return String
     */
    public Future<String> buildTaxContentFileForLocationAsync(Integer companyId, Integer id, Date date, PointOfSaleFileType format, PointOfSalePartnerId partnerId, Boolean includeJurisCodes) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/pointofsaledata");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("date", date);
        path.addQuery("format", format);
        path.addQuery("partnerId", partnerId);
        path.addQuery("includeJurisCodes", includeJurisCodes);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Download a file listing tax rates by postal code
     * 
     * Download a CSV file containing all five digit postal codes in the United States and their sales
     * and use tax rates for tangible personal property.
     * 
     * This rates file is intended to be used as a default for tax calculation when your software cannot
     * call the `CreateTransaction` API call.  When using this file, your software will be unable to
     * handle complex tax rules such as:
     * 
     * * Zip+4 - This tax file contains five digit zip codes only.
     * * Different product types - This tax file contains tangible personal property tax rates only.
     * * Mixed sourcing - This tax file cannot be used to resolve origin-based taxes.
     * * Threshold-based taxes - This tax file does not contain information about thresholds.
     * 
     * If you use this file to provide default tax rates, please ensure that your software calls `CreateTransaction`
     * to reconcile the actual transaction and determine the difference between the estimated general tax
     * rate and the final transaction tax.
     * 
     * 
     * @param date The date for which point-of-sale data would be calculated (today by default). Example input: 2016-12-31
     * @return String
     */
    public String downloadTaxRatesByZipCode(Date date) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxratesbyzipcode/download/{date}");
        path.applyField("date", date);
        return ((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){})).call();
    }

    /**
     * Download a file listing tax rates by postal code
     * 
     * Download a CSV file containing all five digit postal codes in the United States and their sales
     * and use tax rates for tangible personal property.
     * 
     * This rates file is intended to be used as a default for tax calculation when your software cannot
     * call the `CreateTransaction` API call.  When using this file, your software will be unable to
     * handle complex tax rules such as:
     * 
     * * Zip+4 - This tax file contains five digit zip codes only.
     * * Different product types - This tax file contains tangible personal property tax rates only.
     * * Mixed sourcing - This tax file cannot be used to resolve origin-based taxes.
     * * Threshold-based taxes - This tax file does not contain information about thresholds.
     * 
     * If you use this file to provide default tax rates, please ensure that your software calls `CreateTransaction`
     * to reconcile the actual transaction and determine the difference between the estimated general tax
     * rate and the final transaction tax.
     * 
     * 
     * @param date The date for which point-of-sale data would be calculated (today by default). Example input: 2016-12-31
     * @return String
     */
    public Future<String> downloadTaxRatesByZipCodeAsync(Date date) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxratesbyzipcode/download/{date}");
        path.applyField("date", date);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    /**
     * Create a new tax rule
     * 
     * Create one or more new taxrule objects attached to this company.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * 
     * @param companyId The ID of the company that owns this tax rule.
     * @param model The tax rule you wish to create.
     * @return ArrayList<TaxRuleModel>
     */
    public ArrayList<TaxRuleModel> createTaxRules(Integer companyId, ArrayList<TaxRuleModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<TaxRuleModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<TaxRuleModel>>(){})).call();
    }

    /**
     * Create a new tax rule
     * 
     * Create one or more new taxrule objects attached to this company.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * 
     * @param companyId The ID of the company that owns this tax rule.
     * @param model The tax rule you wish to create.
     * @return ArrayList<TaxRuleModel>
     */
    public Future<ArrayList<TaxRuleModel>> createTaxRulesAsync(Integer companyId, ArrayList<TaxRuleModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<TaxRuleModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<TaxRuleModel>>(){}));
    }

    /**
     * Delete a single tax rule
     * 
     * @param companyId The ID of the company that owns this tax rule.
     * @param id The ID of the tax rule you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteTaxRule(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single tax rule
     * 
     * @param companyId The ID of the company that owns this tax rule.
     * @param id The ID of the tax rule you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteTaxRuleAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single tax rule
     * 
     * Get the taxrule object identified by this URL.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * 
     * @param companyId The ID of the company that owns this tax rule
     * @param id The primary key of this tax rule
     * @return TaxRuleModel
     */
    public TaxRuleModel getTaxRule(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<TaxRuleModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRuleModel>(){})).call();
    }

    /**
     * Retrieve a single tax rule
     * 
     * Get the taxrule object identified by this URL.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * 
     * @param companyId The ID of the company that owns this tax rule
     * @param id The primary key of this tax rule
     * @return TaxRuleModel
     */
    public Future<TaxRuleModel> getTaxRuleAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<TaxRuleModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRuleModel>(){}));
    }

    /**
     * Retrieve tax rules for this company
     * 
     * List all taxrule objects attached to this company.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * you may wish to create a TaxRule object to override the AvaTax engine's default behavior in those circumstances.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these tax rules
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxRuleModel>
     */
    public FetchResult<TaxRuleModel> listTaxRules(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){})).call();
    }

    /**
     * Retrieve tax rules for this company
     * 
     * List all taxrule objects attached to this company.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * you may wish to create a TaxRule object to override the AvaTax engine's default behavior in those circumstances.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these tax rules
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxRuleModel>
     */
    public Future<FetchResult<TaxRuleModel>> listTaxRulesAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){}));
    }

    /**
     * Retrieve all tax rules
     * 
     * Get multiple taxrule objects across all companies.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * you may wish to create a TaxRule object to override the AvaTax engine's default behavior in those circumstances.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxRuleModel>
     */
    public FetchResult<TaxRuleModel> queryTaxRules(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrules");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){})).call();
    }

    /**
     * Retrieve all tax rules
     * 
     * Get multiple taxrule objects across all companies.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * you may wish to create a TaxRule object to override the AvaTax engine's default behavior in those circumstances.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TaxRuleModel>
     */
    public Future<FetchResult<TaxRuleModel>> queryTaxRulesAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrules");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){}));
    }

    /**
     * Update a single tax rule
     * 
     * Replace the existing taxrule object at this URL with an updated object.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * you may wish to create a TaxRule object to override the AvaTax engine's default behavior in those circumstances.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this tax rule belongs to.
     * @param id The ID of the tax rule you wish to update
     * @param model The tax rule you wish to update.
     * @return TaxRuleModel
     */
    public TaxRuleModel updateTaxRule(Integer companyId, Integer id, TaxRuleModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<TaxRuleModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<TaxRuleModel>(){})).call();
    }

    /**
     * Update a single tax rule
     * 
     * Replace the existing taxrule object at this URL with an updated object.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * you may wish to create a TaxRule object to override the AvaTax engine's default behavior in those circumstances.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this tax rule belongs to.
     * @param id The ID of the tax rule you wish to update
     * @param model The tax rule you wish to update.
     * @return TaxRuleModel
     */
    public Future<TaxRuleModel> updateTaxRuleAsync(Integer companyId, Integer id, TaxRuleModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<TaxRuleModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<TaxRuleModel>(){}));
    }

    /**
     * Add lines to an existing unlocked transaction
     * 
     *  Add lines to an existing unlocked transaction.
     *  
     *  The `AddLines` API allows you to add additional transaction lines to existing transaction, so that customer will
     *  be able to append multiple calls together and form an extremely large transaction. If customer does not specify line number
     *  in the lines to be added, a new random Guid string will be generated for line number. If customer are not satisfied with
     *  the line number for the transaction lines, they can turn on the renumber switch to have REST v2 automatically renumber all 
     *  transaction lines for them, in this case, the line number becomes: "1", "2", "3", ...
     *  
     *  A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     *  sales, purchases, inventory transfer, and returns (also called refunds).
     *  You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     * 
     *  * Lines
     *  * Details (implies lines)
     *  * Summary (implies details)
     *  * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * 
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model information about the transaction and lines to be added
     * @return TransactionModel
     */
    public TransactionModel addLines(String include, AddTransactionLineModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/add");
        path.addQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Add lines to an existing unlocked transaction
     * 
     *  Add lines to an existing unlocked transaction.
     *  
     *  The `AddLines` API allows you to add additional transaction lines to existing transaction, so that customer will
     *  be able to append multiple calls together and form an extremely large transaction. If customer does not specify line number
     *  in the lines to be added, a new random Guid string will be generated for line number. If customer are not satisfied with
     *  the line number for the transaction lines, they can turn on the renumber switch to have REST v2 automatically renumber all 
     *  transaction lines for them, in this case, the line number becomes: "1", "2", "3", ...
     *  
     *  A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     *  sales, purchases, inventory transfer, and returns (also called refunds).
     *  You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     * 
     *  * Lines
     *  * Details (implies lines)
     *  * Summary (implies details)
     *  * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * 
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model information about the transaction and lines to be added
     * @return TransactionModel
     */
    public Future<TransactionModel> addLinesAsync(String include, AddTransactionLineModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/add");
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Correct a previously created transaction
     * 
     * Replaces the current transaction uniquely identified by this URL with a new transaction.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * When you adjust a committed transaction, the original transaction will be updated with the status code `Adjusted`, and
     * both revisions will be available for retrieval based on their code and ID numbers.
     * Only transactions in `Committed` status are reported by Avalara Managed Returns.
     * 
     * Transactions that have been previously reported to a tax authority by Avalara Managed Returns are considered `locked` and are 
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to adjust
     * @param documentType (Optional): The document type of the transaction to adjust. (See DocumentType::* for a list of allowable values)
     * @param model The adjustment you wish to make
     * @return TransactionModel
     */
    public TransactionModel adjustTransaction(String companyCode, String transactionCode, DocumentType documentType, AdjustTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/adjust");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Correct a previously created transaction
     * 
     * Replaces the current transaction uniquely identified by this URL with a new transaction.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * When you adjust a committed transaction, the original transaction will be updated with the status code `Adjusted`, and
     * both revisions will be available for retrieval based on their code and ID numbers.
     * Only transactions in `Committed` status are reported by Avalara Managed Returns.
     * 
     * Transactions that have been previously reported to a tax authority by Avalara Managed Returns are considered `locked` and are 
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to adjust
     * @param documentType (Optional): The document type of the transaction to adjust. (See DocumentType::* for a list of allowable values)
     * @param model The adjustment you wish to make
     * @return TransactionModel
     */
    public Future<TransactionModel> adjustTransactionAsync(String companyCode, String transactionCode, DocumentType documentType, AdjustTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/adjust");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Get audit information about a transaction
     * 
     * Retrieve audit information about a transaction stored in AvaTax.
     *  
     * The `AuditTransaction` API retrieves audit information related to a specific transaction.  This audit 
     * information includes the following:
     * 
     * * The `CompanyId` of the company that created the transaction
     * * The server timestamp representing the exact server time when the transaction was created
     * * The server duration - how long it took to process this transaction
     * * Whether exact API call details were logged
     * * A reconstructed API call showing what the original CreateTransaction call looked like
     * 
     * This API can be used to examine information about a previously created transaction.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The code identifying the company that owns this transaction
     * @param transactionCode The code identifying the transaction
     * @return AuditTransactionModel
     */
    public AuditTransactionModel auditTransaction(String companyCode, String transactionCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/audit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return ((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditTransactionModel>(){})).call();
    }

    /**
     * Get audit information about a transaction
     * 
     * Retrieve audit information about a transaction stored in AvaTax.
     *  
     * The `AuditTransaction` API retrieves audit information related to a specific transaction.  This audit 
     * information includes the following:
     * 
     * * The `CompanyId` of the company that created the transaction
     * * The server timestamp representing the exact server time when the transaction was created
     * * The server duration - how long it took to process this transaction
     * * Whether exact API call details were logged
     * * A reconstructed API call showing what the original CreateTransaction call looked like
     * 
     * This API can be used to examine information about a previously created transaction.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The code identifying the company that owns this transaction
     * @param transactionCode The code identifying the transaction
     * @return AuditTransactionModel
     */
    public Future<AuditTransactionModel> auditTransactionAsync(String companyCode, String transactionCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/audit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return this.threadPool.submit((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditTransactionModel>(){}));
    }

    /**
     * Get audit information about a transaction
     * 
     * Retrieve audit information about a transaction stored in AvaTax.
     *  
     * The `AuditTransaction` API retrieves audit information related to a specific transaction.  This audit 
     * information includes the following:
     * 
     * * The `CompanyId` of the company that created the transaction
     * * The server timestamp representing the exact server time when the transaction was created
     * * The server duration - how long it took to process this transaction
     * * Whether exact API call details were logged
     * * A reconstructed API call showing what the original CreateTransaction call looked like
     * 
     * This API can be used to examine information about a previously created transaction.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The code identifying the company that owns this transaction
     * @param transactionCode The code identifying the transaction
     * @param documentType The document type of the original transaction (See DocumentType::* for a list of allowable values)
     * @return AuditTransactionModel
     */
    public AuditTransactionModel auditTransactionWithType(String companyCode, String transactionCode, DocumentType documentType) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}/audit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.applyField("documentType", documentType);
        return ((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditTransactionModel>(){})).call();
    }

    /**
     * Get audit information about a transaction
     * 
     * Retrieve audit information about a transaction stored in AvaTax.
     *  
     * The `AuditTransaction` API retrieves audit information related to a specific transaction.  This audit 
     * information includes the following:
     * 
     * * The `CompanyId` of the company that created the transaction
     * * The server timestamp representing the exact server time when the transaction was created
     * * The server duration - how long it took to process this transaction
     * * Whether exact API call details were logged
     * * A reconstructed API call showing what the original CreateTransaction call looked like
     * 
     * This API can be used to examine information about a previously created transaction.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The code identifying the company that owns this transaction
     * @param transactionCode The code identifying the transaction
     * @param documentType The document type of the original transaction (See DocumentType::* for a list of allowable values)
     * @return AuditTransactionModel
     */
    public Future<AuditTransactionModel> auditTransactionWithTypeAsync(String companyCode, String transactionCode, DocumentType documentType) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}/audit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.applyField("documentType", documentType);
        return this.threadPool.submit((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditTransactionModel>(){}));
    }

    /**
     * Lock a set of documents
     * 
     * This API is available by invitation only.
     * 
     * Lock a set of transactions uniquely identified by DocumentIds provided. This API allows locking multiple documents at once.
     * After this API call succeeds, documents will be locked and can't be voided.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param model bulk lock request
     * @return BulkLockTransactionResult
     */
    public BulkLockTransactionResult bulkLockTransaction(BulkLockTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/lock");
        return ((RestCall<BulkLockTransactionResult>)restCallFactory.createRestCall("post", path, model, new TypeToken<BulkLockTransactionResult>(){})).call();
    }

    /**
     * Lock a set of documents
     * 
     * This API is available by invitation only.
     * 
     * Lock a set of transactions uniquely identified by DocumentIds provided. This API allows locking multiple documents at once.
     * After this API call succeeds, documents will be locked and can't be voided.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param model bulk lock request
     * @return BulkLockTransactionResult
     */
    public Future<BulkLockTransactionResult> bulkLockTransactionAsync(BulkLockTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/lock");
        return this.threadPool.submit((RestCall<BulkLockTransactionResult>)restCallFactory.createRestCall("post", path, model, new TypeToken<BulkLockTransactionResult>(){}));
    }

    /**
     * Change a transaction's code
     * 
     * Renames a transaction uniquely identified by this URL by changing its `code` value.
     * 
     * This API is available as long as the transaction is in `saved` or `posted` status.  When a transaction
     * is `committed`, it can be modified by using the [AdjustTransaction](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Transactions/AdjustTransaction/) method.
     * 
     * After this API call succeeds, the transaction will have a new URL matching its new `code`.
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to change
     * @param documentType (Optional): The document type of the transaction to change document code. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The code change request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel changeTransactionCode(String companyCode, String transactionCode, DocumentType documentType, ChangeTransactionCodeModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/changecode");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Change a transaction's code
     * 
     * Renames a transaction uniquely identified by this URL by changing its `code` value.
     * 
     * This API is available as long as the transaction is in `saved` or `posted` status.  When a transaction
     * is `committed`, it can be modified by using the [AdjustTransaction](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Transactions/AdjustTransaction/) method.
     * 
     * After this API call succeeds, the transaction will have a new URL matching its new `code`.
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to change
     * @param documentType (Optional): The document type of the transaction to change document code. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The code change request you wish to execute
     * @return TransactionModel
     */
    public Future<TransactionModel> changeTransactionCodeAsync(String companyCode, String transactionCode, DocumentType documentType, ChangeTransactionCodeModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/changecode");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Commit a transaction for reporting
     * 
     * Marks a transaction by changing its status to `Committed`.
     * 
     * Transactions that are committed are available to be reported to a tax authority by Avalara Managed Returns.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to commit
     * @param documentType (Optional): The document type of the transaction to commit. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The commit request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel commitTransaction(String companyCode, String transactionCode, DocumentType documentType, CommitTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/commit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Commit a transaction for reporting
     * 
     * Marks a transaction by changing its status to `Committed`.
     * 
     * Transactions that are committed are available to be reported to a tax authority by Avalara Managed Returns.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to commit
     * @param documentType (Optional): The document type of the transaction to commit. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The commit request you wish to execute
     * @return TransactionModel
     */
    public Future<TransactionModel> commitTransactionAsync(String companyCode, String transactionCode, DocumentType documentType, CommitTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/commit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Create or adjust a transaction
     * 
     * Records a new transaction or adjust an existing transaction in AvaTax.
     * 
     * The `CreateOrAdjustTransaction` endpoint is used to create a new transaction or update an existing one.  This API
     * can help you create an idempotent service that creates transactions 
     * If there exists a transaction identified by code, the original transaction will be adjusted by using the meta data 
     * in the input transaction.
     * 
     * The `CreateOrAdjustTransaction` API cannot modify any transaction that has been reported to a tax authority using 
     * the Avalara Managed Returns Service or any other tax filing service.  If you call this API to attempt to modify
     * a transaction that has been reported on a tax filing, you will receive the error `CannotModifyLockedTransaction`.
     * 
     * To generate a refund for a transaction, use the `RefundTransaction` API.
     *             
     * If you don't specify the field `type` in your request, you will get an estimate of type `SalesOrder`, which will not be recorded in the database.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * * ForceTimeout - Simulates a timeout.  This adds a 30 second delay and error to your API call.  This can be used to test your code to ensure it can respond correctly in the case of a dropped connection.
     *             
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model The transaction you wish to create or adjust
     * @return TransactionModel
     */
    public TransactionModel createOrAdjustTransaction(String include, CreateOrAdjustTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/createoradjust");
        path.addQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Create or adjust a transaction
     * 
     * Records a new transaction or adjust an existing transaction in AvaTax.
     * 
     * The `CreateOrAdjustTransaction` endpoint is used to create a new transaction or update an existing one.  This API
     * can help you create an idempotent service that creates transactions 
     * If there exists a transaction identified by code, the original transaction will be adjusted by using the meta data 
     * in the input transaction.
     * 
     * The `CreateOrAdjustTransaction` API cannot modify any transaction that has been reported to a tax authority using 
     * the Avalara Managed Returns Service or any other tax filing service.  If you call this API to attempt to modify
     * a transaction that has been reported on a tax filing, you will receive the error `CannotModifyLockedTransaction`.
     * 
     * To generate a refund for a transaction, use the `RefundTransaction` API.
     *             
     * If you don't specify the field `type` in your request, you will get an estimate of type `SalesOrder`, which will not be recorded in the database.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * * ForceTimeout - Simulates a timeout.  This adds a 30 second delay and error to your API call.  This can be used to test your code to ensure it can respond correctly in the case of a dropped connection.
     *             
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model The transaction you wish to create or adjust
     * @return TransactionModel
     */
    public Future<TransactionModel> createOrAdjustTransactionAsync(String include, CreateOrAdjustTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/createoradjust");
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Create a new transaction
     * 
     * Records a new transaction in AvaTax.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * The `CreateTransaction` endpoint uses the tax profile of your company to identify the correct tax rules
     * and rates to apply to all line items in this transaction.  The end result will be the total tax calculated by AvaTax based on your
     * company's configuration and the data provided in this API call.
     * 
     * The `CreateTransaction` API will report an error if a committed transaction already exists with the same `code`.  To
     * avoid this error, use the `CreateOrAdjustTransaction` API - it will create the transaction if it does not exist, or
     * update it if it does exist.
     * 
     * To generate a refund for a transaction, use the `RefundTransaction` API.
     * 
     * The field `type` identifies the kind of transaction - for example, a sale, purchase, or refund.  If you do not specify
     * a `type` value, you will receive an estimate of type `SalesOrder`, which will not be recorded.
     * 
     * The origin and destination locations for a transaction must be identified by either address or geocode.  For address-based transactions, please
     * provide addresses in the fields `line`, `city`, `region`, `country` and `postalCode`.  For geocode-based transactions, please provide the geocode
     * information in the fields `latitude` and `longitude`.  If either `latitude` or `longitude` or both are null, the transaction will be calculated
     * using the best available address location information.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * * ForceTimeout - Simulates a timeout.  This adds a 30 second delay and error to your API call.  This can be used to test your code to ensure it can respond correctly in the case of a dropped connection.
     *             
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model The transaction you wish to create
     * @return TransactionModel
     */
    public TransactionModel createTransaction(String include, CreateTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/create");
        path.addQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Create a new transaction
     * 
     * Records a new transaction in AvaTax.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * The `CreateTransaction` endpoint uses the tax profile of your company to identify the correct tax rules
     * and rates to apply to all line items in this transaction.  The end result will be the total tax calculated by AvaTax based on your
     * company's configuration and the data provided in this API call.
     * 
     * The `CreateTransaction` API will report an error if a committed transaction already exists with the same `code`.  To
     * avoid this error, use the `CreateOrAdjustTransaction` API - it will create the transaction if it does not exist, or
     * update it if it does exist.
     * 
     * To generate a refund for a transaction, use the `RefundTransaction` API.
     * 
     * The field `type` identifies the kind of transaction - for example, a sale, purchase, or refund.  If you do not specify
     * a `type` value, you will receive an estimate of type `SalesOrder`, which will not be recorded.
     * 
     * The origin and destination locations for a transaction must be identified by either address or geocode.  For address-based transactions, please
     * provide addresses in the fields `line`, `city`, `region`, `country` and `postalCode`.  For geocode-based transactions, please provide the geocode
     * information in the fields `latitude` and `longitude`.  If either `latitude` or `longitude` or both are null, the transaction will be calculated
     * using the best available address location information.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * * ForceTimeout - Simulates a timeout.  This adds a 30 second delay and error to your API call.  This can be used to test your code to ensure it can respond correctly in the case of a dropped connection.
     *             
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model The transaction you wish to create
     * @return TransactionModel
     */
    public Future<TransactionModel> createTransactionAsync(String include, CreateTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/create");
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Remove lines from an existing unlocked transaction
     * 
     *  Remove lines to an existing unlocked transaction.
     *  
     *  The `DeleteLines` API allows you to remove transaction lines from existing unlocked transaction, so that customer will
     *  be able to delete transaction lines and adjust original transaction the way they like
     *  
     *  A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     *  sales, purchases, inventory transfer, and returns (also called refunds).
     *  You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     * 
     *  * Lines
     *  * Details (implies lines)
     *  * Summary (implies details)
     *  * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * 
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model information about the transaction and lines to be removed
     * @return TransactionModel
     */
    public TransactionModel deleteLines(String include, RemoveTransactionLineModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/delete");
        path.addQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Remove lines from an existing unlocked transaction
     * 
     *  Remove lines to an existing unlocked transaction.
     *  
     *  The `DeleteLines` API allows you to remove transaction lines from existing unlocked transaction, so that customer will
     *  be able to delete transaction lines and adjust original transaction the way they like
     *  
     *  A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     *  sales, purchases, inventory transfer, and returns (also called refunds).
     *  You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     * 
     *  * Lines
     *  * Details (implies lines)
     *  * Summary (implies details)
     *  * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     * 
     * 
     * @param include Specifies objects to include in the response after transaction is created
     * @param model information about the transaction and lines to be removed
     * @return TransactionModel
     */
    public Future<TransactionModel> deleteLinesAsync(String include, RemoveTransactionLineModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/delete");
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Retrieve a single transaction by code
     * 
     * Get the current `SalesInvoice` transaction identified by this URL.
     * 
     * To fetch other kinds of transactions, use `GetTransactionByCodeAndType`.
     * 
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to retrieve
     * @param include Specifies objects to include in this fetch call
     * @return TransactionModel
     */
    public TransactionModel getTransactionByCode(String companyCode, String transactionCode, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve a single transaction by code
     * 
     * Get the current `SalesInvoice` transaction identified by this URL.
     * 
     * To fetch other kinds of transactions, use `GetTransactionByCodeAndType`.
     * 
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to retrieve
     * @param include Specifies objects to include in this fetch call
     * @return TransactionModel
     */
    public Future<TransactionModel> getTransactionByCodeAsync(String companyCode, String transactionCode, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Retrieve a single transaction by code
     * 
     * Get the current transaction identified by this URL.
     * 
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to retrieve
     * @param documentType The transaction type to retrieve (See DocumentType::* for a list of allowable values)
     * @param include Specifies objects to include in this fetch call
     * @return TransactionModel
     */
    public TransactionModel getTransactionByCodeAndType(String companyCode, String transactionCode, DocumentType documentType, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.applyField("documentType", documentType);
        path.addQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve a single transaction by code
     * 
     * Get the current transaction identified by this URL.
     * 
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to retrieve
     * @param documentType The transaction type to retrieve (See DocumentType::* for a list of allowable values)
     * @param include Specifies objects to include in this fetch call
     * @return TransactionModel
     */
    public Future<TransactionModel> getTransactionByCodeAndTypeAsync(String companyCode, String transactionCode, DocumentType documentType, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.applyField("documentType", documentType);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Retrieve a single transaction by ID
     * 
     * Get the unique transaction identified by this URL.
     * 
     * This endpoint retrieves the exact transaction identified by this ID number even if that transaction was later adjusted
     * by using the `AdjustTransaction` endpoint.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param id The unique ID number of the transaction to retrieve
     * @param include Specifies objects to include in this fetch call
     * @return TransactionModel
     */
    public TransactionModel getTransactionById(Long id, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/{id}");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve a single transaction by ID
     * 
     * Get the unique transaction identified by this URL.
     * 
     * This endpoint retrieves the exact transaction identified by this ID number even if that transaction was later adjusted
     * by using the `AdjustTransaction` endpoint.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param id The unique ID number of the transaction to retrieve
     * @param include Specifies objects to include in this fetch call
     * @return TransactionModel
     */
    public Future<TransactionModel> getTransactionByIdAsync(Long id, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/{id}");
        path.applyField("id", id);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Retrieve all transactions
     * 
     * List all transactions attached to this company.
     * 
     * This endpoint is limited to returning 1,000 transactions at a time maximum.
     * 
     * When listing transactions, you must specify a `date` range filter.  If you do not specify a `$filter` that includes a `date` field
     * criteria, the query will default to looking at only those transactions with `date` in the past 30 days.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param include Specifies objects to include in this fetch call
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TransactionModel>
     */
    public FetchResult<TransactionModel> listTransactionsByCompany(String companyCode, String include, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions");
        path.applyField("companyCode", companyCode);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TransactionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TransactionModel>>(){})).call();
    }

    /**
     * Retrieve all transactions
     * 
     * List all transactions attached to this company.
     * 
     * This endpoint is limited to returning 1,000 transactions at a time maximum.
     * 
     * When listing transactions, you must specify a `date` range filter.  If you do not specify a `$filter` that includes a `date` field
     * criteria, the query will default to looking at only those transactions with `date` in the past 30 days.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param include Specifies objects to include in this fetch call
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<TransactionModel>
     */
    public Future<FetchResult<TransactionModel>> listTransactionsByCompanyAsync(String companyCode, String include, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions");
        path.applyField("companyCode", companyCode);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TransactionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TransactionModel>>(){}));
    }

    /**
     * Lock a single transaction
     * 
     * Lock a transaction uniquely identified by this URL. 
     * 
     * This API is mainly used for connector developer to simulate what happens when Returns product locks a document.
     * After this API call succeeds, the document will be locked and can't be voided or adjusted.
     * 
     * This API is only available to customers in Sandbox with AvaTaxPro subscription.  On production servers, this API is available by invitation only.
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to lock
     * @param documentType (Optional): The document type of the transaction to lock. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The lock request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel lockTransaction(String companyCode, String transactionCode, DocumentType documentType, LockTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/lock");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Lock a single transaction
     * 
     * Lock a transaction uniquely identified by this URL. 
     * 
     * This API is mainly used for connector developer to simulate what happens when Returns product locks a document.
     * After this API call succeeds, the document will be locked and can't be voided or adjusted.
     * 
     * This API is only available to customers in Sandbox with AvaTaxPro subscription.  On production servers, this API is available by invitation only.
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to lock
     * @param documentType (Optional): The document type of the transaction to lock. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The lock request you wish to execute
     * @return TransactionModel
     */
    public Future<TransactionModel> lockTransactionAsync(String companyCode, String transactionCode, DocumentType documentType, LockTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/lock");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Create a refund for a transaction
     * 
     * Create a refund for a transaction.
     * 
     * The `RefundTransaction` API allows you to quickly and easily create a `ReturnInvoice` representing a refund
     * for a previously created `SalesInvoice` transaction.  You can choose to create a full or partial refund, and
     * specify individual line items from the original sale for refund.
     * 
     * The `RefundTransaction` API ensures that the tax amount you refund to the customer exactly matches the tax that
     * was calculated during the original transaction, regardless of any changes to your company's configuration, rules,
     * nexus, or any other setting.
     * 
     * This API is intended to be a shortcut to allow you to quickly and accurately generate a refund for the following 
     * common refund scenarios:
     * 
     * * A full refund of a previous sale
     * * Refunding the tax that was charged on a previous sale, when the customer provides an exemption certificate after the purchase
     * * Refunding one or more items (lines) from a previous sale
     * * Granting a customer a percentage refund of a previous sale
     * 
     * For more complex scenarios than the ones above, please use `CreateTransaction` with document type `ReturnInvoice` to
     * create a custom refund transaction.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     *             
     * 
     * @param companyCode The code of the company that made the original sale
     * @param transactionCode The transaction code of the original sale
     * @param include Specifies objects to include in the response after transaction is created
     * @param documentType (Optional): The document type of the transaction to refund. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model Information about the refund to create
     * @return TransactionModel
     */
    public TransactionModel refundTransaction(String companyCode, String transactionCode, String include, DocumentType documentType, RefundTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/refund");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("$include", include);
        path.addQuery("documentType", documentType);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Create a refund for a transaction
     * 
     * Create a refund for a transaction.
     * 
     * The `RefundTransaction` API allows you to quickly and easily create a `ReturnInvoice` representing a refund
     * for a previously created `SalesInvoice` transaction.  You can choose to create a full or partial refund, and
     * specify individual line items from the original sale for refund.
     * 
     * The `RefundTransaction` API ensures that the tax amount you refund to the customer exactly matches the tax that
     * was calculated during the original transaction, regardless of any changes to your company's configuration, rules,
     * nexus, or any other setting.
     * 
     * This API is intended to be a shortcut to allow you to quickly and accurately generate a refund for the following 
     * common refund scenarios:
     * 
     * * A full refund of a previous sale
     * * Refunding the tax that was charged on a previous sale, when the customer provides an exemption certificate after the purchase
     * * Refunding one or more items (lines) from a previous sale
     * * Granting a customer a percentage refund of a previous sale
     * 
     * For more complex scenarios than the ones above, please use `CreateTransaction` with document type `ReturnInvoice` to
     * create a custom refund transaction.
     * 
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     * * SummaryOnly (omit lines and details - reduces API response size)
     * * LinesOnly (omit details - reduces API response size)
     *             
     * 
     * @param companyCode The code of the company that made the original sale
     * @param transactionCode The transaction code of the original sale
     * @param include Specifies objects to include in the response after transaction is created
     * @param documentType (Optional): The document type of the transaction to refund. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model Information about the refund to create
     * @return TransactionModel
     */
    public Future<TransactionModel> refundTransactionAsync(String companyCode, String transactionCode, String include, DocumentType documentType, RefundTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/refund");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("$include", include);
        path.addQuery("documentType", documentType);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Perform multiple actions on a transaction
     * 
     * Performs one or more actions against the current transaction uniquely identified by this URL.
     * 
     * The `SettleTransaction` API call can perform the work of `ChangeCode`, `VerifyTransaction`, and `CommitTransaction`.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to settle
     * @param documentType (Optional): The document type of the transaction to settle. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The data from an external system to reconcile against AvaTax
     * @return TransactionModel
     */
    public TransactionModel settleTransaction(String companyCode, String transactionCode, DocumentType documentType, SettleTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/settle");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Perform multiple actions on a transaction
     * 
     * Performs one or more actions against the current transaction uniquely identified by this URL.
     * 
     * The `SettleTransaction` API call can perform the work of `ChangeCode`, `VerifyTransaction`, and `CommitTransaction`.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to settle
     * @param documentType (Optional): The document type of the transaction to settle. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The data from an external system to reconcile against AvaTax
     * @return TransactionModel
     */
    public Future<TransactionModel> settleTransactionAsync(String companyCode, String transactionCode, DocumentType documentType, SettleTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/settle");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Verify a transaction
     * 
     * Verifies that the transaction uniquely identified by this URL matches certain expected values.
     * 
     * If the transaction does not match these expected values, this API will return an error code indicating which value did not match.
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to settle
     * @param documentType (Optional): The document type of the transaction to verify. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The data from an external system to reconcile against AvaTax
     * @return TransactionModel
     */
    public TransactionModel verifyTransaction(String companyCode, String transactionCode, DocumentType documentType, VerifyTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/verify");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Verify a transaction
     * 
     * Verifies that the transaction uniquely identified by this URL matches certain expected values.
     * 
     * If the transaction does not match these expected values, this API will return an error code indicating which value did not match.
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to settle
     * @param documentType (Optional): The document type of the transaction to verify. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The data from an external system to reconcile against AvaTax
     * @return TransactionModel
     */
    public Future<TransactionModel> verifyTransactionAsync(String companyCode, String transactionCode, DocumentType documentType, VerifyTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/verify");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Void a transaction
     * 
     * Voids the current transaction uniquely identified by this URL.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * When you void a transaction, that transaction's status is recorded as `DocVoided`.
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to void
     * @param documentType (Optional): The document type of the transaction to void. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The void request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel voidTransaction(String companyCode, String transactionCode, DocumentType documentType, VoidTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/void");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Void a transaction
     * 
     * Voids the current transaction uniquely identified by this URL.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * When you void a transaction, that transaction's status is recorded as `DocVoided`.
     * 
     * If you have more than one document with the same `code`, specify the `documentType` parameter to choose between them.
     * 
     * 
     * @param companyCode The company code of the company that recorded this transaction
     * @param transactionCode The transaction code to void
     * @param documentType (Optional): The document type of the transaction to void. If not provided, the default is SalesInvoice. (See DocumentType::* for a list of allowable values)
     * @param model The void request you wish to execute
     * @return TransactionModel
     */
    public Future<TransactionModel> voidTransactionAsync(String companyCode, String transactionCode, DocumentType documentType, VoidTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/void");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("documentType", documentType);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    /**
     * Create a new UPC
     * 
     * Create one or more new UPC objects attached to this company.
     * 
     * @param companyId The ID of the company that owns this UPC.
     * @param model The UPC you wish to create.
     * @return ArrayList<UPCModel>
     */
    public ArrayList<UPCModel> createUPCs(Integer companyId, ArrayList<UPCModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<UPCModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<UPCModel>>(){})).call();
    }

    /**
     * Create a new UPC
     * 
     * Create one or more new UPC objects attached to this company.
     * 
     * @param companyId The ID of the company that owns this UPC.
     * @param model The UPC you wish to create.
     * @return ArrayList<UPCModel>
     */
    public Future<ArrayList<UPCModel>> createUPCsAsync(Integer companyId, ArrayList<UPCModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<UPCModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<UPCModel>>(){}));
    }

    /**
     * Delete a single UPC
     * 
     * @param companyId The ID of the company that owns this UPC.
     * @param id The ID of the UPC you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public ArrayList<ErrorDetail> deleteUPC(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single UPC
     * 
     * @param companyId The ID of the company that owns this UPC.
     * @param id The ID of the UPC you wish to delete.
     * @return ArrayList<ErrorDetail>
     */
    public Future<ArrayList<ErrorDetail>> deleteUPCAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    /**
     * Retrieve a single UPC
     * 
     * Get the UPC object identified by this URL.
     * 
     * @param companyId The ID of the company that owns this UPC
     * @param id The primary key of this UPC
     * @return UPCModel
     */
    public UPCModel getUPC(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<UPCModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UPCModel>(){})).call();
    }

    /**
     * Retrieve a single UPC
     * 
     * Get the UPC object identified by this URL.
     * 
     * @param companyId The ID of the company that owns this UPC
     * @param id The primary key of this UPC
     * @return UPCModel
     */
    public Future<UPCModel> getUPCAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<UPCModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UPCModel>(){}));
    }

    /**
     * Retrieve UPCs for this company
     * 
     * List all UPC objects attached to this company.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these UPCs
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UPCModel>
     */
    public FetchResult<UPCModel> listUPCsByCompany(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){})).call();
    }

    /**
     * Retrieve UPCs for this company
     * 
     * List all UPC objects attached to this company.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param companyId The ID of the company that owns these UPCs
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UPCModel>
     */
    public Future<FetchResult<UPCModel>> listUPCsByCompanyAsync(Integer companyId, String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){}));
    }

    /**
     * Retrieve all UPCs
     * 
     * Get multiple UPC objects across all companies.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UPCModel>
     */
    public FetchResult<UPCModel> queryUPCs(String filter, String include, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/upcs");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){})).call();
    }

    /**
     * Retrieve all UPCs
     * 
     * Get multiple UPC objects across all companies.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param include A comma separated list of additional data to retrieve.
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UPCModel>
     */
    public Future<FetchResult<UPCModel>> queryUPCsAsync(String filter, String include, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/upcs");
        path.addQuery("$filter", filter);
        path.addQuery("$include", include);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){}));
    }

    /**
     * Update a single UPC
     * 
     * Replace the existing UPC object at this URL with an updated object.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this UPC belongs to.
     * @param id The ID of the UPC you wish to update
     * @param model The UPC you wish to update.
     * @return UPCModel
     */
    public UPCModel updateUPC(Integer companyId, Integer id, UPCModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<UPCModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<UPCModel>(){})).call();
    }

    /**
     * Update a single UPC
     * 
     * Replace the existing UPC object at this URL with an updated object.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param companyId The ID of the company that this UPC belongs to.
     * @param id The ID of the UPC you wish to update
     * @param model The UPC you wish to update.
     * @return UPCModel
     */
    public Future<UPCModel> updateUPCAsync(Integer companyId, Integer id, UPCModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<UPCModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<UPCModel>(){}));
    }

    /**
     * Create new users
     * 
     * Create one or more new user objects attached to this account.
     * 
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Users who are account administrators or company users are permitted to create user records to invite
     * additional team members to work with AvaTax.
     * 
     * A newly created user will receive an email inviting them to create their password.  This means that you
     * 
     * @param accountId The unique ID number of the account where these users will be created.
     * @param model The user or array of users you wish to create.
     * @return ArrayList<UserModel>
     */
    public ArrayList<UserModel> createUsers(Integer accountId, ArrayList<UserModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.applyField("accountId", accountId);
        return ((RestCall<ArrayList<UserModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<UserModel>>(){})).call();
    }

    /**
     * Create new users
     * 
     * Create one or more new user objects attached to this account.
     * 
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Users who are account administrators or company users are permitted to create user records to invite
     * additional team members to work with AvaTax.
     * 
     * A newly created user will receive an email inviting them to create their password.  This means that you
     * 
     * @param accountId The unique ID number of the account where these users will be created.
     * @param model The user or array of users you wish to create.
     * @return ArrayList<UserModel>
     */
    public Future<ArrayList<UserModel>> createUsersAsync(Integer accountId, ArrayList<UserModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<ArrayList<UserModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<UserModel>>(){}));
    }

    /**
     * Retrieve a single user
     * 
     * Get the user object identified by this URL.
     * 
     * @param id The ID of the user to retrieve.
     * @param accountId The accountID of the user you wish to get.
     * @param include Optional fetch commands.
     * @return UserModel
     */
    public UserModel getUser(Integer id, Integer accountId, String include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        path.addQuery("$include", include);
        return ((RestCall<UserModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UserModel>(){})).call();
    }

    /**
     * Retrieve a single user
     * 
     * Get the user object identified by this URL.
     * 
     * @param id The ID of the user to retrieve.
     * @param accountId The accountID of the user you wish to get.
     * @param include Optional fetch commands.
     * @return UserModel
     */
    public Future<UserModel> getUserAsync(Integer id, Integer accountId, String include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        path.addQuery("$include", include);
        return this.threadPool.submit((RestCall<UserModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UserModel>(){}));
    }

    /**
     * Retrieve all entitlements for a single user
     * 
     * Return a list of all entitlements to which this user has rights to access.
     * Entitlements are a list of specified API calls the user is permitted to make, a list of identifier numbers for companies the user is 
     * allowed to use, and an access level identifier that indicates what types of access roles the user is allowed to use.
     * This API call is intended to provide a validation endpoint to determine, before making an API call, whether this call is likely to succeed.
     * For example, if user 567 within account 999 is attempting to create a new child company underneath company 12345, you could preview the user's
     * entitlements and predict whether this call would succeed:
     *             
     * * Retrieve entitlements by calling '/api/v2/accounts/999/users/567/entitlements' .  If the call fails, you do not have accurate 
     *     credentials for this user.
     * * If the 'accessLevel' field within entitlements is 'None', the call will fail.
     * * If the 'accessLevel' field within entitlements is 'SingleCompany' or 'SingleAccount', the call will fail if the companies
     *     table does not contain the ID number 12345.
     * * If the 'permissions' array within entitlements does not contain 'AccountSvc.CompanySave', the call will fail.
     *             
     * 
     * @param id The ID of the user to retrieve.
     * @param accountId The accountID of the user you wish to get.
     * @return UserEntitlementModel
     */
    public UserEntitlementModel getUserEntitlements(Integer id, Integer accountId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}/entitlements");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return ((RestCall<UserEntitlementModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UserEntitlementModel>(){})).call();
    }

    /**
     * Retrieve all entitlements for a single user
     * 
     * Return a list of all entitlements to which this user has rights to access.
     * Entitlements are a list of specified API calls the user is permitted to make, a list of identifier numbers for companies the user is 
     * allowed to use, and an access level identifier that indicates what types of access roles the user is allowed to use.
     * This API call is intended to provide a validation endpoint to determine, before making an API call, whether this call is likely to succeed.
     * For example, if user 567 within account 999 is attempting to create a new child company underneath company 12345, you could preview the user's
     * entitlements and predict whether this call would succeed:
     *             
     * * Retrieve entitlements by calling '/api/v2/accounts/999/users/567/entitlements' .  If the call fails, you do not have accurate 
     *     credentials for this user.
     * * If the 'accessLevel' field within entitlements is 'None', the call will fail.
     * * If the 'accessLevel' field within entitlements is 'SingleCompany' or 'SingleAccount', the call will fail if the companies
     *     table does not contain the ID number 12345.
     * * If the 'permissions' array within entitlements does not contain 'AccountSvc.CompanySave', the call will fail.
     *             
     * 
     * @param id The ID of the user to retrieve.
     * @param accountId The accountID of the user you wish to get.
     * @return UserEntitlementModel
     */
    public Future<UserEntitlementModel> getUserEntitlementsAsync(Integer id, Integer accountId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}/entitlements");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<UserEntitlementModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UserEntitlementModel>(){}));
    }

    /**
     * Retrieve users for this account
     * 
     * List all user objects attached to this account.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param accountId The accountID of the user you wish to list.
     * @param include Optional fetch commands.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UserModel>
     */
    public FetchResult<UserModel> listUsersByAccount(Integer accountId, String include, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.applyField("accountId", accountId);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UserModel>>(){})).call();
    }

    /**
     * Retrieve users for this account
     * 
     * List all user objects attached to this account.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param accountId The accountID of the user you wish to list.
     * @param include Optional fetch commands.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UserModel>
     */
    public Future<FetchResult<UserModel>> listUsersByAccountAsync(Integer accountId, String include, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.applyField("accountId", accountId);
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UserModel>>(){}));
    }

    /**
     * Retrieve all users
     * 
     * Get multiple user objects across all accounts.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param include Optional fetch commands.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UserModel>
     */
    public FetchResult<UserModel> queryUsers(String include, String filter, Integer top, Integer skip, String orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/users");
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UserModel>>(){})).call();
    }

    /**
     * Retrieve all users
     * 
     * Get multiple user objects across all accounts.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param include Optional fetch commands.
     * @param filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult<UserModel>
     */
    public Future<FetchResult<UserModel>> queryUsersAsync(String include, String filter, Integer top, Integer skip, String orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/users");
        path.addQuery("$include", include);
        path.addQuery("$filter", filter);
        path.addQuery("$top", top);
        path.addQuery("$skip", skip);
        path.addQuery("$orderBy", orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UserModel>>(){}));
    }

    /**
     * Update a single user
     * 
     * Replace the existing user object at this URL with an updated object.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param id The ID of the user you wish to update.
     * @param accountId The accountID of the user you wish to update.
     * @param model The user object you wish to update.
     * @return UserModel
     */
    public UserModel updateUser(Integer id, Integer accountId, UserModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return ((RestCall<UserModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<UserModel>(){})).call();
    }

    /**
     * Update a single user
     * 
     * Replace the existing user object at this URL with an updated object.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param id The ID of the user you wish to update.
     * @param accountId The accountID of the user you wish to update.
     * @param model The user object you wish to update.
     * @return UserModel
     */
    public Future<UserModel> updateUserAsync(Integer id, Integer accountId, UserModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<UserModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<UserModel>(){}));
    }

    /**
     * Checks if the current user is subscribed to a specific service
     * 
     * Returns a subscription object for the current account, or 404 Not Found if this subscription is not enabled for this account.
     * This API call is intended to allow you to identify whether you have the necessary account configuration to access certain
     * 
     * @param serviceTypeId The service to check (See ServiceTypeId::* for a list of allowable values)
     * @return SubscriptionModel
     */
    public SubscriptionModel getMySubscription(ServiceTypeId serviceTypeId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions/{serviceTypeId}");
        path.applyField("serviceTypeId", serviceTypeId);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){})).call();
    }

    /**
     * Checks if the current user is subscribed to a specific service
     * 
     * Returns a subscription object for the current account, or 404 Not Found if this subscription is not enabled for this account.
     * This API call is intended to allow you to identify whether you have the necessary account configuration to access certain
     * 
     * @param serviceTypeId The service to check (See ServiceTypeId::* for a list of allowable values)
     * @return SubscriptionModel
     */
    public Future<SubscriptionModel> getMySubscriptionAsync(ServiceTypeId serviceTypeId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions/{serviceTypeId}");
        path.applyField("serviceTypeId", serviceTypeId);
        return this.threadPool.submit((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){}));
    }

    /**
     * List all services to which the current user is subscribed
     * 
     * Returns the list of all subscriptions enabled for the current account.
     * This API is intended to help you determine whether you have the necessary subscription to use certain API calls
     * 
     * @return FetchResult<SubscriptionModel>
     */
    public FetchResult<SubscriptionModel> listMySubscriptions() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions");
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
    }

    /**
     * List all services to which the current user is subscribed
     * 
     * Returns the list of all subscriptions enabled for the current account.
     * This API is intended to help you determine whether you have the necessary subscription to use certain API calls
     * 
     * @return FetchResult<SubscriptionModel>
     */
    public Future<FetchResult<SubscriptionModel>> listMySubscriptionsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions");
        return this.threadPool.submit((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){}));
    }

    /**
     * Tests connectivity and version of the service
     * 
     * This API helps diagnose connectivity problems between your application and AvaTax; you may call this API even 
     * if you do not have verified connection credentials.
     * The results of this API call will help you determine whether your computer can contact AvaTax via the network,
     * whether your authentication credentials are recognized, and the roundtrip time it takes to communicate with
     * 
     * @return PingResultModel
     */
    public PingResultModel ping() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/ping");
        return ((RestCall<PingResultModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<PingResultModel>(){})).call();
    }

    /**
     * Tests connectivity and version of the service
     * 
     * This API helps diagnose connectivity problems between your application and AvaTax; you may call this API even 
     * if you do not have verified connection credentials.
     * The results of this API call will help you determine whether your computer can contact AvaTax via the network,
     * whether your authentication credentials are recognized, and the roundtrip time it takes to communicate with
     * 
     * @return PingResultModel
     */
    public Future<PingResultModel> pingAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/ping");
        return this.threadPool.submit((RestCall<PingResultModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<PingResultModel>(){}));
    }

//endregion

}
    
