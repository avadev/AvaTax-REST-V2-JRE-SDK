package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;
import net.avalara.avatax.rest.client.models.*;
import net.avalara.avatax.rest.client.enums.*;

import org.apache.commons.codec.binary.Base64;

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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
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
        this(appName, appVersion, machineName, environment == AvaTaxEnvironment.Production ? AvaTaxConstants.Production_Url : AvaTaxConstants.Sandbox_Url);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, String environmentUrl) {
        this();
        this.restCallFactory = new RestCallFactory(appName, appVersion, machineName, environmentUrl);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, AvaTaxEnvironment environment, String proxyHost, int proxyPort, String proxySchema) {
        this(appName, appVersion, machineName, environment == AvaTaxEnvironment.Production ? AvaTaxConstants.Production_Url : AvaTaxConstants.Sandbox_Url, proxyHost, proxyPort, proxySchema);
    }

    public AvaTaxClient(String appName, String appVersion, String machineName, String environmentUrl, String proxyHost, int proxyPort, String proxySchema) {
        this();
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
     * To reset your account, you must specify the ID of the account you wish to reset and confirm the action.
     * 
     * @param int id The ID of the account you wish to update.
     * @param ResetLicenseKeyModel model A request confirming that you wish to reset the license key of this account.
     * @return LicenseKeyModel
     */
    public LicenseKeyModel accountResetLicenseKey(Int32 id, ResetLicenseKeyModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/resetlicensekey");
        path.ApplyField("id", id);
        return ((RestCall<LicenseKeyModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<LicenseKeyModel>(){})).call();
    }

    /**
     * Reset this account's license key
     * 
     * Resets the existing license key for this account to a new key.
     * To reset your account, you must specify the ID of the account you wish to reset and confirm the action.
     * 
     * @param int id The ID of the account you wish to update.
     * @param ResetLicenseKeyModel model A request confirming that you wish to reset the license key of this account.
     * @return LicenseKeyModel
     */
    public LicenseKeyModel accountResetLicenseKeyAsync(int id, ResetLicenseKeyModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/resetlicensekey");
        path.ApplyField("id", id);
        return ((RestCall<LicenseKeyModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<LicenseKeyModel>(){})).call();
    }

    /**
     * Activate an account by accepting terms and conditions
     * 
     * Activate the account specified by the unique accountId number.
     * 
     * This activation request can only be called by account administrators.  You must indicate 
     * that you have read and accepted Avalara's terms and conditions to call this API.
     * 
     * If you have not read or accepted the terms and conditions, this API call will return the
     * 
     * @param int id The ID of the account to activate
     * @param ActivateAccountModel model The activation request
     * @return AccountModel
     */
    public AccountModel activateAccount(Int32 id, ActivateAccountModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/activate");
        path.ApplyField("id", id);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<AccountModel>(){})).call();
    }

    /**
     * Activate an account by accepting terms and conditions
     * 
     * Activate the account specified by the unique accountId number.
     * 
     * This activation request can only be called by account administrators.  You must indicate 
     * that you have read and accepted Avalara's terms and conditions to call this API.
     * 
     * If you have not read or accepted the terms and conditions, this API call will return the
     * 
     * @param int id The ID of the account to activate
     * @param ActivateAccountModel model The activation request
     * @return AccountModel
     */
    public AccountModel activateAccountAsync(int id, ActivateAccountModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/activate");
        path.ApplyField("id", id);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<AccountModel>(){})).call();
    }

    /**
     * Retrieve a single account
     * 
     * Get the account object identified by this URL.
     * You may use the '$include' parameter to fetch additional nested data:
     * 
     * * Subscriptions
     * 
     * @param int id The ID of the account to retrieve
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return AccountModel
     */
    public AccountModel getAccount(Int32 id, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.ApplyField("id", id);
        path.AddQuery("$include", include);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<AccountModel>(){})).call();
    }

    /**
     * Retrieve a single account
     * 
     * Get the account object identified by this URL.
     * You may use the '$include' parameter to fetch additional nested data:
     * 
     * * Subscriptions
     * 
     * @param int id The ID of the account to retrieve
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return AccountModel
     */
    public AccountModel getAccountAsync(int id, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.ApplyField("id", id);
        path.AddQuery("$include", include);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<AccountModel>(){})).call();
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
     * @param int id 
     * @return AccountConfigurationModel[]
     */
    public List<AccountConfigurationModel> getAccountConfiguration(Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.ApplyField("id", id);
        return ((RestCall<List<AccountConfigurationModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<List<AccountConfigurationModel>>(){})).call();
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
     * @param int id 
     * @return AccountConfigurationModel[]
     */
    public AccountConfigurationModel[] getAccountConfigurationAsync(int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.ApplyField("id", id);
        return ((RestCall<List<AccountConfigurationModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<List<AccountConfigurationModel>>(){})).call();
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
     * @param int id 
     * @param AccountConfigurationModel[] model 
     * @return AccountConfigurationModel[]
     */
    public List<AccountConfigurationModel> setAccountConfiguration(Int32 id, List<AccountConfigurationModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.ApplyField("id", id);
        return ((RestCall<List<AccountConfigurationModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<AccountConfigurationModel>>(){})).call();
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
     * @param int id 
     * @param AccountConfigurationModel[] model 
     * @return AccountConfigurationModel[]
     */
    public AccountConfigurationModel[] setAccountConfigurationAsync(int id, AccountConfigurationModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.ApplyField("id", id);
        return ((RestCall<List<AccountConfigurationModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<AccountConfigurationModel>>(){})).call();
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
     * @param String line1 Line 1
     * @param String line2 Line 2
     * @param String line3 Line 3
     * @param String city City
     * @param String region State / Province / Region
     * @param String postalCode Postal Code / Zip Code
     * @param String country Two character ISO 3166 Country Code (see /api/v2/definitions/countries for a full list)
     * @param TextCase textCase selectable text case for address validation (See TextCase::* for a list of allowable values)
     * @param BigDecimal latitude Geospatial latitude measurement
     * @param BigDecimal longitude Geospatial longitude measurement
     * @return AddressResolutionModel
     */
    public AddressResolutionModel resolveAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country, TextCase? textCase, Decimal? latitude, Decimal? longitude)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        path.AddQuery("textCase", textCase);
        path.AddQuery("latitude", latitude);
        path.AddQuery("longitude", longitude);
        return ((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<AddressResolutionModel>(){})).call();
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
     * @param String line1 Line 1
     * @param String line2 Line 2
     * @param String line3 Line 3
     * @param String city City
     * @param String region State / Province / Region
     * @param String postalCode Postal Code / Zip Code
     * @param String country Two character ISO 3166 Country Code (see /api/v2/definitions/countries for a full list)
     * @param TextCase textCase selectable text case for address validation (See TextCase::* for a list of allowable values)
     * @param BigDecimal latitude Geospatial latitude measurement
     * @param BigDecimal longitude Geospatial longitude measurement
     * @return AddressResolutionModel
     */
    public AddressResolutionModel resolveAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country, TextCase textCase, BigDecimal latitude, BigDecimal longitude)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        path.AddQuery("textCase", textCase);
        path.AddQuery("latitude", latitude);
        path.AddQuery("longitude", longitude);
        return ((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<AddressResolutionModel>(){})).call();
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
     * @param AddressValidationInfo model The address to resolve
     * @return AddressResolutionModel
     */
    public AddressResolutionModel resolveAddressPost(AddressValidationInfo model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        return ((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<AddressResolutionModel>(){})).call();
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
     * @param AddressValidationInfo model The address to resolve
     * @return AddressResolutionModel
     */
    public AddressResolutionModel resolveAddressPostAsync(AddressValidationInfo model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        return ((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<AddressResolutionModel>(){})).call();
    }

    /**
     * Create a new batch
     * 
     * Create one or more new batch objects attached to this company.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * You may fetch a batch to check on its status and retrieve the results of the batch operation.
     * 
     * @param int companyId The ID of the company that owns this batch.
     * @param BatchModel[] model The batch you wish to create.
     * @return BatchModel[]
     */
    public List<BatchModel> createBatches(Int32 companyId, List<BatchModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<BatchModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<BatchModel>>(){})).call();
    }

    /**
     * Create a new batch
     * 
     * Create one or more new batch objects attached to this company.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * You may fetch a batch to check on its status and retrieve the results of the batch operation.
     * 
     * @param int companyId The ID of the company that owns this batch.
     * @param BatchModel[] model The batch you wish to create.
     * @return BatchModel[]
     */
    public BatchModel[] createBatchesAsync(int companyId, BatchModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<BatchModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<BatchModel>>(){})).call();
    }

    /**
     * Delete a single batch
     * 
     * @param int companyId The ID of the company that owns this batch.
     * @param int id The ID of the batch you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteBatch(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single batch
     * 
     * @param int companyId The ID of the company that owns this batch.
     * @param int id The ID of the batch you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteBatchAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Download a single batch file
     * 
     * @param int companyId The ID of the company that owns this batch
     * @param int batchId The ID of the batch object
     * @param int id The primary key of this batch file object
     * @return object
     */
    public FileResult downloadBatch(Int32 companyId, Int32 batchId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{batchId}/files/{id}/attachment");
        path.ApplyField("companyId", companyId);
        path.ApplyField("batchId", batchId);
        path.ApplyField("id", id);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Download a single batch file
     * 
     * @param int companyId The ID of the company that owns this batch
     * @param int batchId The ID of the batch object
     * @param int id The primary key of this batch file object
     * @return object
     */
    public object downloadBatchAsync(int companyId, int batchId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{batchId}/files/{id}/attachment");
        path.ApplyField("companyId", companyId);
        path.ApplyField("batchId", batchId);
        path.ApplyField("id", id);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a single batch
     * 
     * Get the batch object identified by this URL.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * 
     * @param int companyId The ID of the company that owns this batch
     * @param int id The primary key of this batch
     * @return BatchModel
     */
    public BatchModel getBatch(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<BatchModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<BatchModel>(){})).call();
    }

    /**
     * Retrieve a single batch
     * 
     * Get the batch object identified by this URL.
     * A batch object is a large collection of API calls stored in a compact file.
     * When you create a batch, it is added to the AvaTax Batch Queue and will be processed in the order it was received.
     * 
     * @param int companyId The ID of the company that owns this batch
     * @param int id The primary key of this batch
     * @return BatchModel
     */
    public BatchModel getBatchAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<BatchModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<BatchModel>(){})).call();
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
     * @param int companyId The ID of the company that owns these batches
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<BatchModel> listBatchesByCompany(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns these batches
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listBatchesByCompanyAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<BatchModel> queryBatches(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/batches");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryBatchesAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/batches");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
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
     * 
     * @param CompanyInitializationModel model Information about the company you wish to create.
     * @return CompanyModel
     */
    public CompanyModel companyInitialize(CompanyInitializationModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/initialize");
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<CompanyModel>(){})).call();
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
     * 
     * @param CompanyInitializationModel model Information about the company you wish to create.
     * @return CompanyModel
     */
    public CompanyModel companyInitializeAsync(CompanyInitializationModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/initialize");
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<CompanyModel>(){})).call();
    }

    /**
     * Create new companies
     * 
     * Create one or more new company objects.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * 
     * @param CompanyModel[] model Either a single company object or an array of companies to create
     * @return CompanyModel[]
     */
    public List<CompanyModel> createCompanies(List<CompanyModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        return ((RestCall<List<CompanyModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<CompanyModel>>(){})).call();
    }

    /**
     * Create new companies
     * 
     * Create one or more new company objects.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * 
     * @param CompanyModel[] model Either a single company object or an array of companies to create
     * @return CompanyModel[]
     */
    public CompanyModel[] createCompaniesAsync(CompanyModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        return ((RestCall<List<CompanyModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<CompanyModel>>(){})).call();
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
     * @param int id The unique identifier of the company
     * @param FundingInitiateModel model The funding initialization request
     * @return FundingStatusModel
     */
    public FundingStatusModel createFundingRequest(Int32 id, FundingInitiateModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding/setup");
        path.ApplyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FundingStatusModel>(){})).call();
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
     * @param int id The unique identifier of the company
     * @param FundingInitiateModel model The funding initialization request
     * @return FundingStatusModel
     */
    public FundingStatusModel createFundingRequestAsync(int id, FundingInitiateModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding/setup");
        path.ApplyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FundingStatusModel>(){})).call();
    }

    /**
     * Delete a single company
     * 
     * @param int id The ID of the company you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteCompany(Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single company
     * 
     * @param int id The ID of the company you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteCompanyAsync(int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
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
     * @param int id The ID of the company to retrieve.
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return CompanyModel
     */
    public CompanyModel getCompany(Int32 id, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.ApplyField("id", id);
        path.AddQuery("$include", include);
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<CompanyModel>(){})).call();
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
     * @param int id The ID of the company to retrieve.
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return CompanyModel
     */
    public CompanyModel getCompanyAsync(int id, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.ApplyField("id", id);
        path.AddQuery("$include", include);
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<CompanyModel>(){})).call();
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
     * @param int id 
     * @return CompanyConfigurationModel[]
     */
    public List<CompanyConfigurationModel> getCompanyConfiguration(Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.ApplyField("id", id);
        return ((RestCall<List<CompanyConfigurationModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<List<CompanyConfigurationModel>>(){})).call();
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
     * @param int id 
     * @return CompanyConfigurationModel[]
     */
    public CompanyConfigurationModel[] getCompanyConfigurationAsync(int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.ApplyField("id", id);
        return ((RestCall<List<CompanyConfigurationModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<List<CompanyConfigurationModel>>(){})).call();
    }

    /**
     * Check managed returns funding configuration for a company
     * 
     * This API is available by invitation only.
     * Requires a subscription to Avalara Managed Returns or SST Certified Service Provider.
     * Returns a list of funding setup requests and their current status.
     * 
     * @param int id The unique identifier of the company
     * @return FundingStatusModel[]
     */
    public List<FundingStatusModel> listFundingRequestsByCompany(Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding");
        path.ApplyField("id", id);
        return ((RestCall<List<FundingStatusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<List<FundingStatusModel>>(){})).call();
    }

    /**
     * Check managed returns funding configuration for a company
     * 
     * This API is available by invitation only.
     * Requires a subscription to Avalara Managed Returns or SST Certified Service Provider.
     * Returns a list of funding setup requests and their current status.
     * 
     * @param int id The unique identifier of the company
     * @return FundingStatusModel[]
     */
    public FundingStatusModel[] listFundingRequestsByCompanyAsync(int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding");
        path.ApplyField("id", id);
        return ((RestCall<List<FundingStatusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<List<FundingStatusModel>>(){})).call();
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
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<CompanyModel> queryCompanies(String include, String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CompanyModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<CompanyModel>>(){})).call();
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
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryCompaniesAsync(String include, String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<CompanyModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<CompanyModel>>(){})).call();
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
     * @param int id 
     * @param CompanyConfigurationModel[] model 
     * @return CompanyConfigurationModel[]
     */
    public List<CompanyConfigurationModel> setCompanyConfiguration(Int32 id, List<CompanyConfigurationModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.ApplyField("id", id);
        return ((RestCall<List<CompanyConfigurationModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<CompanyConfigurationModel>>(){})).call();
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
     * @param int id 
     * @param CompanyConfigurationModel[] model 
     * @return CompanyConfigurationModel[]
     */
    public CompanyConfigurationModel[] setCompanyConfigurationAsync(int id, CompanyConfigurationModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.ApplyField("id", id);
        return ((RestCall<List<CompanyConfigurationModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<CompanyConfigurationModel>>(){})).call();
    }

    /**
     * Update a single company
     * 
     * Replace the existing company object at this URL with an updated object.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int id The ID of the company you wish to update.
     * @param CompanyModel model The company object you wish to update.
     * @return CompanyModel
     */
    public CompanyModel updateCompany(Int32 id, CompanyModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.ApplyField("id", id);
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<CompanyModel>(){})).call();
    }

    /**
     * Update a single company
     * 
     * Replace the existing company object at this URL with an updated object.
     * A 'company' represents a single corporation or individual that is registered to handle transactional taxes.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int id The ID of the company you wish to update.
     * @param CompanyModel model The company object you wish to update.
     * @return CompanyModel
     */
    public CompanyModel updateCompanyAsync(int id, CompanyModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.ApplyField("id", id);
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<CompanyModel>(){})).call();
    }

    /**
     * Create a new contact
     * 
     * Create one or more new contact objects.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * 
     * @param int companyId The ID of the company that owns this contact.
     * @param ContactModel[] model The contacts you wish to create.
     * @return ContactModel[]
     */
    public List<ContactModel> createContacts(Int32 companyId, List<ContactModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<ContactModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<ContactModel>>(){})).call();
    }

    /**
     * Create a new contact
     * 
     * Create one or more new contact objects.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * 
     * @param int companyId The ID of the company that owns this contact.
     * @param ContactModel[] model The contacts you wish to create.
     * @return ContactModel[]
     */
    public ContactModel[] createContactsAsync(int companyId, ContactModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<ContactModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<ContactModel>>(){})).call();
    }

    /**
     * Delete a single contact
     * 
     * @param int companyId The ID of the company that owns this contact.
     * @param int id The ID of the contact you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteContact(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single contact
     * 
     * @param int companyId The ID of the company that owns this contact.
     * @param int id The ID of the contact you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteContactAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Retrieve a single contact
     * 
     * Get the contact object identified by this URL.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * 
     * @param int companyId The ID of the company for this contact
     * @param int id The primary key of this contact
     * @return ContactModel
     */
    public ContactModel getContact(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<ContactModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<ContactModel>(){})).call();
    }

    /**
     * Retrieve a single contact
     * 
     * Get the contact object identified by this URL.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * 
     * @param int companyId The ID of the company for this contact
     * @param int id The primary key of this contact
     * @return ContactModel
     */
    public ContactModel getContactAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<ContactModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<ContactModel>(){})).call();
    }

    /**
     * Retrieve contacts for this company
     * 
     * List all contact objects assigned to this company.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param int companyId The ID of the company that owns these contacts
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<ContactModel> listContactsByCompany(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ContactModel>>(){})).call();
    }

    /**
     * Retrieve contacts for this company
     * 
     * List all contact objects assigned to this company.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param int companyId The ID of the company that owns these contacts
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listContactsByCompanyAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ContactModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<ContactModel> queryContacts(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/contacts");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ContactModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryContactsAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/contacts");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ContactModel>>(){})).call();
    }

    /**
     * Update a single contact
     * 
     * Replace the existing contact object at this URL with an updated object.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * a tax collecting and filing entity.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int companyId The ID of the company that this contact belongs to.
     * @param int id The ID of the contact you wish to update
     * @param ContactModel model The contact you wish to update.
     * @return ContactModel
     */
    public ContactModel updateContact(Int32 companyId, Int32 id, ContactModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<ContactModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<ContactModel>(){})).call();
    }

    /**
     * Update a single contact
     * 
     * Replace the existing contact object at this URL with an updated object.
     * A 'contact' is a person associated with a company who is designated to handle certain responsibilities of
     * a tax collecting and filing entity.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int companyId The ID of the company that this contact belongs to.
     * @param int id The ID of the contact you wish to update
     * @param ContactModel model The contact you wish to update.
     * @return ContactModel
     */
    public ContactModel updateContactAsync(int companyId, int id, ContactModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<ContactModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<ContactModel>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for a country and region.
     * 
     * Returns all Avalara-supported nexus for the specified country and region.
     * 
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @return FetchResult
     */
    public FetchResult<NexusModel> apiV2DefinitionsNexusByCountryByRegionGet(String country, String region)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}/{region}");
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for a country and region.
     * 
     * Returns all Avalara-supported nexus for the specified country and region.
     * 
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @return FetchResult
     */
    public FetchResult apiV2DefinitionsNexusByCountryByRegionGetAsync(String country, String region)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}/{region}");
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for a country.
     * 
     * Returns all Avalara-supported nexus for the specified country.
     * 
     * @param String country 
     * @return FetchResult
     */
    public FetchResult<NexusModel> apiV2DefinitionsNexusByCountryGet(String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}");
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for a country.
     * 
     * Returns all Avalara-supported nexus for the specified country.
     * 
     * @param String country 
     * @return FetchResult
     */
    public FetchResult apiV2DefinitionsNexusByCountryGetAsync(String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}");
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for all countries and regions.
     * 
     * Returns the full list of all Avalara-supported nexus for all countries and regions.  
     * 
     * @return FetchResult
     */
    public FetchResult<NexusModel> apiV2DefinitionsNexusGet()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus");
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported nexus for all countries and regions.
     * 
     * Returns the full list of all Avalara-supported nexus for all countries and regions.  
     * 
     * @return FetchResult
     */
    public FetchResult apiV2DefinitionsNexusGetAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus");
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * Test whether a form supports online login verification
     * 
     * This API is intended to be useful to identify whether the user should be allowed
     * 
     * @param String form The name of the form you would like to verify. This can be the tax form code or the legacy return name
     * @return FetchResult
     */
    public FetchResult<SkyscraperStatusModel> getLoginVerifierByForm(String form)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers/{form}");
        path.ApplyField("form", form);
        return ((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){})).call();
    }

    /**
     * Test whether a form supports online login verification
     * 
     * This API is intended to be useful to identify whether the user should be allowed
     * 
     * @param String form The name of the form you would like to verify. This can be the tax form code or the legacy return name
     * @return FetchResult
     */
    public FetchResult getLoginVerifierByFormAsync(String form)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers/{form}");
        path.ApplyField("form", form);
        return ((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of the AvaFile Forms available
     * 
     * Returns the full list of Avalara-supported AvaFile Forms
     * 
     * @return FetchResult
     */
    public FetchResult<AvaFileFormModel> listAvaFileForms()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/avafileforms");
        return ((RestCall<FetchResult<AvaFileFormModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<AvaFileFormModel>>(){})).call();
    }

    /**
     * Retrieve the full list of the AvaFile Forms available
     * 
     * Returns the full list of Avalara-supported AvaFile Forms
     * 
     * @return FetchResult
     */
    public FetchResult listAvaFileFormsAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/avafileforms");
        return ((RestCall<FetchResult<AvaFileFormModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<AvaFileFormModel>>(){})).call();
    }

    /**
     * List all ISO 3166 countries
     * 
     * Returns a list of all ISO 3166 country codes, and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a country for 
     * 
     * @return FetchResult
     */
    public FetchResult<IsoCountryModel> listCountries()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries");
        return ((RestCall<FetchResult<IsoCountryModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<IsoCountryModel>>(){})).call();
    }

    /**
     * List all ISO 3166 countries
     * 
     * Returns a list of all ISO 3166 country codes, and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a country for 
     * 
     * @return FetchResult
     */
    public FetchResult listCountriesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries");
        return ((RestCall<FetchResult<IsoCountryModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<IsoCountryModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported entity use codes
     * 
     * Returns the full list of Avalara-supported entity use codes.
     * Entity/Use Codes are definitions of the entity who is purchasing something, or the purpose for which the transaction
     * is occurring.  This information is generally used to determine taxability of the product.
     * In order to facilitate correct reporting of your taxes, you are encouraged to select the proper entity use codes for
     * 
     * @return FetchResult
     */
    public FetchResult<EntityUseCodeModel> listEntityUseCodes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/entityusecodes");
        return ((RestCall<FetchResult<EntityUseCodeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<EntityUseCodeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported entity use codes
     * 
     * Returns the full list of Avalara-supported entity use codes.
     * Entity/Use Codes are definitions of the entity who is purchasing something, or the purpose for which the transaction
     * is occurring.  This information is generally used to determine taxability of the product.
     * In order to facilitate correct reporting of your taxes, you are encouraged to select the proper entity use codes for
     * 
     * @return FetchResult
     */
    public FetchResult listEntityUseCodesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/entityusecodes");
        return ((RestCall<FetchResult<EntityUseCodeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<EntityUseCodeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported filing frequencies.
     * 
     * Returns the full list of Avalara-supported filing frequencies.
     * 
     * @return FetchResult
     */
    public FetchResult<FilingFrequencyModel> listFilingFrequencies()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingfrequencies");
        return ((RestCall<FetchResult<FilingFrequencyModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingFrequencyModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported filing frequencies.
     * 
     * Returns the full list of Avalara-supported filing frequencies.
     * 
     * @return FetchResult
     */
    public FetchResult listFilingFrequenciesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingfrequencies");
        return ((RestCall<FetchResult<FilingFrequencyModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingFrequencyModel>>(){})).call();
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
     * @param String line1 The first address line portion of this address.
     * @param String line2 The second address line portion of this address.
     * @param String line3 The third address line portion of this address.
     * @param String city The city portion of this address.
     * @param String region The region, state, or province code portion of this address.
     * @param String postalCode The postal code or zip code portion of this address.
     * @param String country The two-character ISO-3166 code of the country portion of this address.
     * @return FetchResult
     */
    public FetchResult<JurisdictionOverrideModel> listJurisdictionsByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/jurisdictionsnearaddress");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
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
     * @param String line1 The first address line portion of this address.
     * @param String line2 The second address line portion of this address.
     * @param String line3 The third address line portion of this address.
     * @param String city The city portion of this address.
     * @param String region The region, state, or province code portion of this address.
     * @param String postalCode The postal code or zip code portion of this address.
     * @param String country The two-character ISO-3166 code of the country portion of this address.
     * @return FetchResult
     */
    public FetchResult listJurisdictionsByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/jurisdictionsnearaddress");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
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
     * @param String line1 The first line of this location's address.
     * @param String line2 The second line of this location's address.
     * @param String line3 The third line of this location's address.
     * @param String city The city part of this location's address.
     * @param String region The region, state, or province part of this location's address.
     * @param String postalCode The postal code of this location's address.
     * @param String country The country part of this location's address.
     * @param BigDecimal latitude Optionally identify the location via latitude/longitude instead of via address.
     * @param BigDecimal longitude Optionally identify the location via latitude/longitude instead of via address.
     * @return FetchResult
     */
    public FetchResult<LocationQuestionModel> listLocationQuestionsByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country, Decimal? latitude, Decimal? longitude)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/locationquestions");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        path.AddQuery("latitude", latitude);
        path.AddQuery("longitude", longitude);
        return ((RestCall<FetchResult<LocationQuestionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<LocationQuestionModel>>(){})).call();
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
     * @param String line1 The first line of this location's address.
     * @param String line2 The second line of this location's address.
     * @param String line3 The third line of this location's address.
     * @param String city The city part of this location's address.
     * @param String region The region, state, or province part of this location's address.
     * @param String postalCode The postal code of this location's address.
     * @param String country The country part of this location's address.
     * @param BigDecimal latitude Optionally identify the location via latitude/longitude instead of via address.
     * @param BigDecimal longitude Optionally identify the location via latitude/longitude instead of via address.
     * @return FetchResult
     */
    public FetchResult listLocationQuestionsByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country, BigDecimal latitude, BigDecimal longitude)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/locationquestions");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        path.AddQuery("latitude", latitude);
        path.AddQuery("longitude", longitude);
        return ((RestCall<FetchResult<LocationQuestionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<LocationQuestionModel>>(){})).call();
    }

    /**
     * List all forms where logins can be verified automatically
     * 
     * List all forms where logins can be verified automatically.
     * This API is intended to be useful to identify whether the user should be allowed
     * 
     * @return FetchResult
     */
    public FetchResult<SkyscraperStatusModel> listLoginVerifiers()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers");
        return ((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){})).call();
    }

    /**
     * List all forms where logins can be verified automatically
     * 
     * List all forms where logins can be verified automatically.
     * This API is intended to be useful to identify whether the user should be allowed
     * 
     * @return FetchResult
     */
    public FetchResult listLoginVerifiersAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers");
        return ((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){})).call();
    }

    /**
     * List all nexus that apply to a specific address.
     * 
     * Returns a list of all Avalara-supported taxing jurisdictions that apply to this address.
     * This API allows you to identify which tax authorities apply to a physical location, salesperson address, or point of sale.
     * In general, it is usually expected that a company will declare nexus in all the jurisdictions that apply to each physical address
     * where the company does business.
     * 
     * @param String line1 The first address line portion of this address.
     * @param String line2 The first address line portion of this address.
     * @param String line3 The first address line portion of this address.
     * @param String city The city portion of this address.
     * @param String region The region, state, or province code portion of this address.
     * @param String postalCode The postal code or zip code portion of this address.
     * @param String country The two-character ISO-3166 code of the country portion of this address.
     * @return FetchResult
     */
    public FetchResult<NexusModel> listNexusByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byaddress");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }

    /**
     * List all nexus that apply to a specific address.
     * 
     * Returns a list of all Avalara-supported taxing jurisdictions that apply to this address.
     * This API allows you to identify which tax authorities apply to a physical location, salesperson address, or point of sale.
     * In general, it is usually expected that a company will declare nexus in all the jurisdictions that apply to each physical address
     * where the company does business.
     * 
     * @param String line1 The first address line portion of this address.
     * @param String line2 The first address line portion of this address.
     * @param String line3 The first address line portion of this address.
     * @param String city The city portion of this address.
     * @param String region The region, state, or province code portion of this address.
     * @param String postalCode The postal code or zip code portion of this address.
     * @param String country The two-character ISO-3166 code of the country portion of this address.
     * @return FetchResult
     */
    public FetchResult listNexusByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byaddress");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
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
     * @param String formCode The form code that we are looking up the nexus for
     * @return NexusByTaxFormModel
     */
    public NexusByTaxFormModel listNexusByFormCode(String formCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byform/{formCode}");
        path.ApplyField("formCode", formCode);
        return ((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<NexusByTaxFormModel>(){})).call();
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
     * @param String formCode The form code that we are looking up the nexus for
     * @return NexusByTaxFormModel
     */
    public NexusByTaxFormModel listNexusByFormCodeAsync(String formCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byform/{formCode}");
        path.ApplyField("formCode", formCode);
        return ((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<NexusByTaxFormModel>(){})).call();
    }

    /**
     * Retrieve the full list of nexus tax type groups
     * 
     * Returns the full list of Avalara-supported nexus tax type groups
     * 
     * @return FetchResult
     */
    public FetchResult<NexusTaxTypeGroupModel> listNexusTaxTypeGroups()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexustaxtypegroups");
        return ((RestCall<FetchResult<NexusTaxTypeGroupModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusTaxTypeGroupModel>>(){})).call();
    }

    /**
     * Retrieve the full list of nexus tax type groups
     * 
     * Returns the full list of Avalara-supported nexus tax type groups
     * 
     * @return FetchResult
     */
    public FetchResult listNexusTaxTypeGroupsAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexustaxtypegroups");
        return ((RestCall<FetchResult<NexusTaxTypeGroupModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusTaxTypeGroupModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice customer funding options.
     * 
     * Returns the full list of Avalara-supported tax notice customer funding options.
     * 
     * @return FetchResult
     */
    public FetchResult<NoticeCustomerFundingOptionModel> listNoticeCustomerFundingOptions()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomerfundingoptions");
        return ((RestCall<FetchResult<NoticeCustomerFundingOptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeCustomerFundingOptionModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice customer funding options.
     * 
     * Returns the full list of Avalara-supported tax notice customer funding options.
     * 
     * @return FetchResult
     */
    public FetchResult listNoticeCustomerFundingOptionsAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomerfundingoptions");
        return ((RestCall<FetchResult<NoticeCustomerFundingOptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeCustomerFundingOptionModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice customer types.
     * 
     * Returns the full list of Avalara-supported tax notice customer types.
     * 
     * @return FetchResult
     */
    public FetchResult<NoticeCustomerTypeModel> listNoticeCustomerTypes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomertypes");
        return ((RestCall<FetchResult<NoticeCustomerTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeCustomerTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice customer types.
     * 
     * Returns the full list of Avalara-supported tax notice customer types.
     * 
     * @return FetchResult
     */
    public FetchResult listNoticeCustomerTypesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomertypes");
        return ((RestCall<FetchResult<NoticeCustomerTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeCustomerTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice filing types.
     * 
     * Returns the full list of Avalara-supported tax notice filing types.
     * 
     * @return FetchResult
     */
    public FetchResult<NoticeFilingTypeModel> listNoticeFilingtypes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticefilingtypes");
        return ((RestCall<FetchResult<NoticeFilingTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeFilingTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice filing types.
     * 
     * Returns the full list of Avalara-supported tax notice filing types.
     * 
     * @return FetchResult
     */
    public FetchResult listNoticeFilingtypesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticefilingtypes");
        return ((RestCall<FetchResult<NoticeFilingTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeFilingTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice priorities.
     * 
     * Returns the full list of Avalara-supported tax notice priorities.
     * 
     * @return FetchResult
     */
    public FetchResult<NoticePriorityModel> listNoticePriorities()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticepriorities");
        return ((RestCall<FetchResult<NoticePriorityModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticePriorityModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice priorities.
     * 
     * Returns the full list of Avalara-supported tax notice priorities.
     * 
     * @return FetchResult
     */
    public FetchResult listNoticePrioritiesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticepriorities");
        return ((RestCall<FetchResult<NoticePriorityModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticePriorityModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice reasons.
     * 
     * Returns the full list of Avalara-supported tax notice reasons.
     * 
     * @return FetchResult
     */
    public FetchResult<NoticeReasonModel> listNoticeReasons()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticereasons");
        return ((RestCall<FetchResult<NoticeReasonModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeReasonModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice reasons.
     * 
     * Returns the full list of Avalara-supported tax notice reasons.
     * 
     * @return FetchResult
     */
    public FetchResult listNoticeReasonsAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticereasons");
        return ((RestCall<FetchResult<NoticeReasonModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeReasonModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice responsibility ids
     * 
     * Returns the full list of Avalara-supported tax notice responsibility ids
     * 
     * @return FetchResult
     */
    public FetchResult<NoticeResponsibilityModel> listNoticeResponsibilities()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticeresponsibilities");
        return ((RestCall<FetchResult<NoticeResponsibilityModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeResponsibilityModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice responsibility ids
     * 
     * Returns the full list of Avalara-supported tax notice responsibility ids
     * 
     * @return FetchResult
     */
    public FetchResult listNoticeResponsibilitiesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticeresponsibilities");
        return ((RestCall<FetchResult<NoticeResponsibilityModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeResponsibilityModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice root causes
     * 
     * Returns the full list of Avalara-supported tax notice root causes
     * 
     * @return FetchResult
     */
    public FetchResult<NoticeRootCauseModel> listNoticeRootCauses()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticerootcauses");
        return ((RestCall<FetchResult<NoticeRootCauseModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeRootCauseModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice root causes
     * 
     * Returns the full list of Avalara-supported tax notice root causes
     * 
     * @return FetchResult
     */
    public FetchResult listNoticeRootCausesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticerootcauses");
        return ((RestCall<FetchResult<NoticeRootCauseModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeRootCauseModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice statuses.
     * 
     * Returns the full list of Avalara-supported tax notice statuses.
     * 
     * @return FetchResult
     */
    public FetchResult<NoticeStatusModel> listNoticeStatuses()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticestatuses");
        return ((RestCall<FetchResult<NoticeStatusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeStatusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice statuses.
     * 
     * Returns the full list of Avalara-supported tax notice statuses.
     * 
     * @return FetchResult
     */
    public FetchResult listNoticeStatusesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticestatuses");
        return ((RestCall<FetchResult<NoticeStatusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeStatusModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice types.
     * 
     * Returns the full list of Avalara-supported tax notice types.
     * 
     * @return FetchResult
     */
    public FetchResult<NoticeTypeModel> listNoticeTypes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticetypes");
        return ((RestCall<FetchResult<NoticeTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax notice types.
     * 
     * Returns the full list of Avalara-supported tax notice types.
     * 
     * @return FetchResult
     */
    public FetchResult listNoticeTypesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticetypes");
        return ((RestCall<FetchResult<NoticeTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported extra parameters for creating transactions.
     * 
     * Returns the full list of Avalara-supported extra parameters for the 'Create Transaction' API call.
     * This list of parameters is available for use when configuring your transaction.
     * 
     * @return FetchResult
     */
    public FetchResult<ParameterModel> listParameters()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/parameters");
        return ((RestCall<FetchResult<ParameterModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ParameterModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported extra parameters for creating transactions.
     * 
     * Returns the full list of Avalara-supported extra parameters for the 'Create Transaction' API call.
     * This list of parameters is available for use when configuring your transaction.
     * 
     * @return FetchResult
     */
    public FetchResult listParametersAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/parameters");
        return ((RestCall<FetchResult<ParameterModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ParameterModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported permissions
     * 
     * Returns the full list of Avalara-supported permission types.
     * 
     * @return FetchResult
     */
    public FetchResult<String> listPermissions()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/permissions");
        return ((RestCall<FetchResult<String>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<String>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported permissions
     * 
     * Returns the full list of Avalara-supported permission types.
     * 
     * @return FetchResult
     */
    public FetchResult listPermissionsAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/permissions");
        return ((RestCall<FetchResult<String>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<String>>(){})).call();
    }

    /**
     * Retrieve the full list of rate types for each country
     * 
     * Returns the full list of Avalara-supported rate type file types
     * 
     * @param String country 
     * @return FetchResult
     */
    public FetchResult<RateTypeModel> listRateTypesByCountry(String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/ratetypes");
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<RateTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<RateTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of rate types for each country
     * 
     * Returns the full list of Avalara-supported rate type file types
     * 
     * @param String country 
     * @return FetchResult
     */
    public FetchResult listRateTypesByCountryAsync(String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/ratetypes");
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<RateTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<RateTypeModel>>(){})).call();
    }

    /**
     * List all ISO 3166 regions
     * 
     * Returns a list of all ISO 3166 region codes and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a region 
     * 
     * @return FetchResult
     */
    public FetchResult<IsoRegionModel> listRegions()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/regions");
        return ((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){})).call();
    }

    /**
     * List all ISO 3166 regions
     * 
     * Returns a list of all ISO 3166 region codes and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a region 
     * 
     * @return FetchResult
     */
    public FetchResult listRegionsAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/regions");
        return ((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){})).call();
    }

    /**
     * List all ISO 3166 regions for a country
     * 
     * Returns a list of all ISO 3166 region codes for a specific country code, and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a region 
     * 
     * @param String country 
     * @return FetchResult
     */
    public FetchResult<IsoRegionModel> listRegionsByCountry(String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/regions");
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){})).call();
    }

    /**
     * List all ISO 3166 regions for a country
     * 
     * Returns a list of all ISO 3166 region codes for a specific country code, and their US English friendly names.
     * This API is intended to be useful when presenting a dropdown box in your website to allow customers to select a region 
     * 
     * @param String country 
     * @return FetchResult
     */
    public FetchResult listRegionsByCountryAsync(String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/regions");
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported resource file types
     * 
     * Returns the full list of Avalara-supported resource file types
     * 
     * @return FetchResult
     */
    public FetchResult<ResourceFileTypeModel> listResourceFileTypes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/resourcefiletypes");
        return ((RestCall<FetchResult<ResourceFileTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ResourceFileTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported resource file types
     * 
     * Returns the full list of Avalara-supported resource file types
     * 
     * @return FetchResult
     */
    public FetchResult listResourceFileTypesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/resourcefiletypes");
        return ((RestCall<FetchResult<ResourceFileTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ResourceFileTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported permissions
     * 
     * Returns the full list of Avalara-supported permission types.
     * This API is intended to be useful when designing a user interface for selecting the security role of a user account.
     * 
     * @return FetchResult
     */
    public FetchResult<SecurityRoleModel> listSecurityRoles()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/securityroles");
        return ((RestCall<FetchResult<SecurityRoleModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SecurityRoleModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported permissions
     * 
     * Returns the full list of Avalara-supported permission types.
     * This API is intended to be useful when designing a user interface for selecting the security role of a user account.
     * 
     * @return FetchResult
     */
    public FetchResult listSecurityRolesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/securityroles");
        return ((RestCall<FetchResult<SecurityRoleModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SecurityRoleModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported subscription types
     * 
     * Returns the full list of Avalara-supported subscription types.
     * This API is intended to be useful for identifying which features you have added to your account.
     * You may always contact Avalara's sales department for information on available products or services.
     * 
     * @return FetchResult
     */
    public FetchResult<SubscriptionTypeModel> listSubscriptionTypes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/subscriptiontypes");
        return ((RestCall<FetchResult<SubscriptionTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SubscriptionTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported subscription types
     * 
     * Returns the full list of Avalara-supported subscription types.
     * This API is intended to be useful for identifying which features you have added to your account.
     * You may always contact Avalara's sales department for information on available products or services.
     * 
     * @return FetchResult
     */
    public FetchResult listSubscriptionTypesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/subscriptiontypes");
        return ((RestCall<FetchResult<SubscriptionTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SubscriptionTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax authorities.
     * 
     * Returns the full list of Avalara-supported tax authorities.
     * 
     * @return FetchResult
     */
    public FetchResult<TaxAuthorityModel> listTaxAuthorities()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorities");
        return ((RestCall<FetchResult<TaxAuthorityModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxAuthorityModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax authorities.
     * 
     * Returns the full list of Avalara-supported tax authorities.
     * 
     * @return FetchResult
     */
    public FetchResult listTaxAuthoritiesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorities");
        return ((RestCall<FetchResult<TaxAuthorityModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxAuthorityModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported forms for each tax authority.
     * 
     * Returns the full list of Avalara-supported forms for each tax authority.
     * This list represents tax forms that Avalara recognizes.
     * Customers who subscribe to Avalara Managed Returns Service can request these forms to be filed automatically 
     * 
     * @return FetchResult
     */
    public FetchResult<TaxAuthorityFormModel> listTaxAuthorityForms()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorityforms");
        return ((RestCall<FetchResult<TaxAuthorityFormModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxAuthorityFormModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported forms for each tax authority.
     * 
     * Returns the full list of Avalara-supported forms for each tax authority.
     * This list represents tax forms that Avalara recognizes.
     * Customers who subscribe to Avalara Managed Returns Service can request these forms to be filed automatically 
     * 
     * @return FetchResult
     */
    public FetchResult listTaxAuthorityFormsAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorityforms");
        return ((RestCall<FetchResult<TaxAuthorityFormModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxAuthorityFormModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax authority types.
     * 
     * Returns the full list of Avalara-supported tax authority types.
     * 
     * @return FetchResult
     */
    public FetchResult<TaxAuthorityTypeModel> listTaxAuthorityTypes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthoritytypes");
        return ((RestCall<FetchResult<TaxAuthorityTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxAuthorityTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax authority types.
     * 
     * Returns the full list of Avalara-supported tax authority types.
     * 
     * @return FetchResult
     */
    public FetchResult listTaxAuthorityTypesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthoritytypes");
        return ((RestCall<FetchResult<TaxAuthorityTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxAuthorityTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax codes.
     * 
     * Retrieves the list of Avalara-supported system tax codes.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @return FetchResult
     */
    public FetchResult<TaxCodeModel> listTaxCodes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodes");
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax codes.
     * 
     * Retrieves the list of Avalara-supported system tax codes.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @return FetchResult
     */
    public FetchResult listTaxCodesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodes");
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax code types.
     * 
     * Returns the full list of recognized tax code types.
     * A 'Tax Code Type' represents a broad category of tax codes, and is less detailed than a single TaxCode.
     * 
     * @return TaxCodeTypesModel
     */
    public TaxCodeTypesModel listTaxCodeTypes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodetypes");
        return ((RestCall<TaxCodeTypesModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxCodeTypesModel>(){})).call();
    }

    /**
     * Retrieve the full list of Avalara-supported tax code types.
     * 
     * Returns the full list of recognized tax code types.
     * A 'Tax Code Type' represents a broad category of tax codes, and is less detailed than a single TaxCode.
     * 
     * @return TaxCodeTypesModel
     */
    public TaxCodeTypesModel listTaxCodeTypesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodetypes");
        return ((RestCall<TaxCodeTypesModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxCodeTypesModel>(){})).call();
    }

    /**
     * Retrieve the full list of tax sub types
     * 
     * Returns the full list of Avalara-supported tax sub-types
     * 
     * @return FetchResult
     */
    public FetchResult<TaxSubTypeModel> listTaxSubTypes()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxsubtypes");
        return ((RestCall<FetchResult<TaxSubTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxSubTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of tax sub types
     * 
     * Returns the full list of Avalara-supported tax sub-types
     * 
     * @return FetchResult
     */
    public FetchResult listTaxSubTypesAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxsubtypes");
        return ((RestCall<FetchResult<TaxSubTypeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxSubTypeModel>>(){})).call();
    }

    /**
     * Retrieve the full list of tax type groups
     * 
     * Returns the full list of Avalara-supported tax type groups
     * 
     * @return FetchResult
     */
    public FetchResult<TaxTypeGroupModel> listTaxTypeGroups()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxtypegroups");
        return ((RestCall<FetchResult<TaxTypeGroupModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxTypeGroupModel>>(){})).call();
    }

    /**
     * Retrieve the full list of tax type groups
     * 
     * Returns the full list of Avalara-supported tax type groups
     * 
     * @return FetchResult
     */
    public FetchResult listTaxTypeGroupsAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxtypegroups");
        return ((RestCall<FetchResult<TaxTypeGroupModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxTypeGroupModel>>(){})).call();
    }

    /**
     * Retrieve a single filing calendar
     * 
     * @param int companyId The ID of the company that owns this filing calendar
     * @param int id The primary key of this filing calendar
     * @return FilingCalendarModel
     */
    public FilingCalendarModel apiV2CompaniesByCompanyIdFilingcalendarsByIdGet(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FilingCalendarModel>(){})).call();
    }

    /**
     * Retrieve a single filing calendar
     * 
     * @param int companyId The ID of the company that owns this filing calendar
     * @param int id The primary key of this filing calendar
     * @return FilingCalendarModel
     */
    public FilingCalendarModel apiV2CompaniesByCompanyIdFilingcalendarsByIdGetAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FilingCalendarModel>(){})).call();
    }

    /**
     * Retrieve all filing calendars for this company
     * 
     * @param int companyId The ID of the company that owns these batches
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<FilingCalendarModel> apiV2CompaniesByCompanyIdFilingcalendarsGet(Int32 companyId, String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){})).call();
    }

    /**
     * Retrieve all filing calendars for this company
     * 
     * @param int companyId The ID of the company that owns these batches
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult apiV2CompaniesByCompanyIdFilingcalendarsGetAsync(int companyId, String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){})).call();
    }

    /**
     * Retrieve all filing requests for this company
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The ID of the company that owns these batches
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<FilingRequestModel> apiV2CompaniesByCompanyIdFilingrequestsGet(Int32 companyId, String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){})).call();
    }

    /**
     * Retrieve all filing requests for this company
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The ID of the company that owns these batches
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult apiV2CompaniesByCompanyIdFilingrequestsGetAsync(int companyId, String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){})).call();
    }

    /**
     * Returns a list of options for adding the specified form.
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param String formCode The unique code of the form
     * @return CycleAddOptionModel[]
     */
    public List<CycleAddOptionModel> cycleSafeAdd(Int32 companyId, String formCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/options");
        path.ApplyField("companyId", companyId);
        path.AddQuery("formCode", formCode);
        return ((RestCall<List<CycleAddOptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<List<CycleAddOptionModel>>(){})).call();
    }

    /**
     * Returns a list of options for adding the specified form.
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param String formCode The unique code of the form
     * @return CycleAddOptionModel[]
     */
    public CycleAddOptionModel[] cycleSafeAddAsync(int companyId, String formCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/options");
        path.ApplyField("companyId", companyId);
        path.AddQuery("formCode", formCode);
        return ((RestCall<List<CycleAddOptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<List<CycleAddOptionModel>>(){})).call();
    }

    /**
     * Indicates when changes are allowed to be made to a filing calendar.
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param int id The unique ID of the filing calendar object
     * @param FilingCalendarEditModel[] model A list of filing calendar edits to be made
     * @return CycleEditOptionModel
     */
    public CycleEditOptionModel cycleSafeEdit(Int32 companyId, Int32 id, List<FilingCalendarEditModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/options");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<CycleEditOptionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<CycleEditOptionModel>(){})).call();
    }

    /**
     * Indicates when changes are allowed to be made to a filing calendar.
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param int id The unique ID of the filing calendar object
     * @param FilingCalendarEditModel[] model A list of filing calendar edits to be made
     * @return CycleEditOptionModel
     */
    public CycleEditOptionModel cycleSafeEditAsync(int companyId, int id, FilingCalendarEditModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/options");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<CycleEditOptionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<CycleEditOptionModel>(){})).call();
    }

    /**
     * Returns a list of options for expiring a filing calendar
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param int id The unique ID of the filing calendar object
     * @return CycleExpireModel
     */
    public CycleExpireModel cycleSafeExpiration(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/options");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<CycleExpireModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<CycleExpireModel>(){})).call();
    }

    /**
     * Returns a list of options for expiring a filing calendar
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param int id The unique ID of the filing calendar object
     * @return CycleExpireModel
     */
    public CycleExpireModel cycleSafeExpirationAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/options");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<CycleExpireModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<CycleExpireModel>(){})).call();
    }

    /**
     * Delete a single filing calendar.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this filing calendar.
     * @param int id The ID of the filing calendar you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteFilingCalendar(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single filing calendar.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this filing calendar.
     * @param int id The ID of the filing calendar you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteFilingCalendarAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Edit existing Filing Calendar's Notes
     * 
     * This API is available by invitation only.
     * This API only allows updating of internal notes and company filing instructions.
     * 
     * @param int companyId The unique ID of the company that owns the filing request object
     * @param int id The unique ID of the filing calendar object
     * @param FilingCalendarModel model The filing calendar model you are wishing to update with.
     * @return FilingCalendarModel
     */
    public FilingCalendarModel filingCalendarUpdate(Int32 companyId, Int32 id, FilingCalendarModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<FilingCalendarModel>(){})).call();
    }

    /**
     * Edit existing Filing Calendar's Notes
     * 
     * This API is available by invitation only.
     * This API only allows updating of internal notes and company filing instructions.
     * 
     * @param int companyId The unique ID of the company that owns the filing request object
     * @param int id The unique ID of the filing calendar object
     * @param FilingCalendarModel model The filing calendar model you are wishing to update with.
     * @return FilingCalendarModel
     */
    public FilingCalendarModel filingCalendarUpdateAsync(int companyId, int id, FilingCalendarModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<FilingCalendarModel>(){})).call();
    }

    /**
     * Retrieve a single filing request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The ID of the company that owns this filing calendar
     * @param int id The primary key of this filing calendar
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequests(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Retrieve a single filing request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The ID of the company that owns this filing calendar
     * @param int id The primary key of this filing calendar
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Create a new filing request to create a filing calendar
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that will add the new filing calendar
     * @param FilingRequestModel[] model Information about the proposed new filing calendar
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsAdd(Int32 companyId, List<FilingRequestModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/request");
        path.ApplyField("companyId", companyId);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Create a new filing request to create a filing calendar
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that will add the new filing calendar
     * @param FilingRequestModel[] model Information about the proposed new filing calendar
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsAddAsync(int companyId, FilingRequestModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/request");
        path.ApplyField("companyId", companyId);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Approve existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * are reviewed and validated by Avalara Compliance before being implemented.
     * 
     * @param int companyId The unique ID of the company that owns the filing request object
     * @param int id The unique ID of the filing request object
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsApprove(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/approve");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Approve existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * are reviewed and validated by Avalara Compliance before being implemented.
     * 
     * @param int companyId The unique ID of the company that owns the filing request object
     * @param int id The unique ID of the filing request object
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsApproveAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/approve");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Cancel existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that owns the filing request object
     * @param int id The unique ID of the filing request object
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsCancel(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/cancel");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Cancel existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that owns the filing request object
     * @param int id The unique ID of the filing request object
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsCancelAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/cancel");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Create a new filing request to cancel a filing calendar
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param int id The unique ID number of the filing calendar to cancel
     * @param FilingRequestModel[] model The cancellation request for this filing calendar
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsNewCancel(Int32 companyId, Int32 id, List<FilingRequestModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/request");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Create a new filing request to cancel a filing calendar
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param int id The unique ID number of the filing calendar to cancel
     * @param FilingRequestModel[] model The cancellation request for this filing calendar
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsNewCancelAsync(int companyId, int id, FilingRequestModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/request");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Create a new filing request to edit a filing calendar
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param int id The unique ID number of the filing calendar to edit
     * @param FilingRequestModel[] model A list of filing calendar edits to be made
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsNewEdit(Int32 companyId, Int32 id, List<FilingRequestModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/request");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Create a new filing request to edit a filing calendar
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that owns the filing calendar object
     * @param int id The unique ID number of the filing calendar to edit
     * @param FilingRequestModel[] model A list of filing calendar edits to be made
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsNewEditAsync(int companyId, int id, FilingRequestModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/request");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Edit existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that owns the filing request object
     * @param int id The unique ID of the filing request object
     * @param FilingRequestModel model A list of filing calendar edits to be made
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsUpdate(Int32 companyId, Int32 id, FilingRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Edit existing Filing Request
     * 
     * This API is available by invitation only.
     * A "filing request" represents a request to change an existing filing calendar.  Filing requests
     * 
     * @param int companyId The unique ID of the company that owns the filing request object
     * @param int id The unique ID of the filing request object
     * @param FilingRequestModel model A list of filing calendar edits to be made
     * @return FilingRequestModel
     */
    public FilingRequestModel filingRequestsUpdateAsync(int companyId, int id, FilingRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }

    /**
     * Gets the request status and Login Result
     * 
     * @param int jobId The unique ID number of this login request
     * @return LoginVerificationOutputModel
     */
    public LoginVerificationOutputModel loginVerificationGet(Int32 jobId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/{jobId}");
        path.ApplyField("jobId", jobId);
        return ((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<LoginVerificationOutputModel>(){})).call();
    }

    /**
     * Gets the request status and Login Result
     * 
     * @param int jobId The unique ID number of this login request
     * @return LoginVerificationOutputModel
     */
    public LoginVerificationOutputModel loginVerificationGetAsync(int jobId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/{jobId}");
        path.ApplyField("jobId", jobId);
        return ((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<LoginVerificationOutputModel>(){})).call();
    }

    /**
     * New request for getting for validating customer's login credentials
     * 
     * @param LoginVerificationInputModel model The model of the login information we are verifying
     * @return LoginVerificationOutputModel
     */
    public LoginVerificationOutputModel loginVerificationPost(LoginVerificationInputModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/verify");
        return ((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<LoginVerificationOutputModel>(){})).call();
    }

    /**
     * New request for getting for validating customer's login credentials
     * 
     * @param LoginVerificationInputModel model The model of the login information we are verifying
     * @return LoginVerificationOutputModel
     */
    public LoginVerificationOutputModel loginVerificationPostAsync(LoginVerificationInputModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/verify");
        return ((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<LoginVerificationOutputModel>(){})).call();
    }

    /**
     * Retrieve all filing calendars
     * 
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<FilingCalendarModel> queryFilingCalendars(String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars");
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){})).call();
    }

    /**
     * Retrieve all filing calendars
     * 
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryFilingCalendarsAsync(String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars");
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<FilingRequestModel> queryFilingRequests(String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingrequests");
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryFilingRequestsAsync(String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingrequests");
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to approve.
     * @param byte month The month of the filing period to approve.
     * @param ApproveFilingsModel model The approve request you wish to execute.
     * @return FilingModel[]
     */
    public List<FilingModel> approveFilings(Int32 companyId, Int16 year, Byte month, ApproveFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/approve");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<List<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to approve.
     * @param byte month The month of the filing period to approve.
     * @param ApproveFilingsModel model The approve request you wish to execute.
     * @return FilingModel[]
     */
    public FilingModel[] approveFilingsAsync(int companyId, short year, byte month, ApproveFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/approve");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<List<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to approve.
     * @param byte month The month of the filing period to approve.
     * @param String country The two-character ISO-3166 code for the country.
     * @param ApproveFilingsModel model The approve request you wish to execute.
     * @return FilingModel[]
     */
    public List<FilingModel> approveFilingsCountry(Int32 companyId, Int16 year, Byte month, String country, ApproveFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/approve");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        return ((RestCall<List<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to approve.
     * @param byte month The month of the filing period to approve.
     * @param String country The two-character ISO-3166 code for the country.
     * @param ApproveFilingsModel model The approve request you wish to execute.
     * @return FilingModel[]
     */
    public FilingModel[] approveFilingsCountryAsync(int companyId, short year, byte month, String country, ApproveFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/approve");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        return ((RestCall<List<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to approve.
     * @param byte month The month of the filing period to approve.
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @param ApproveFilingsModel model The approve request you wish to execute.
     * @return FilingModel[]
     */
    public List<FilingModel> approveFilingsCountryRegion(Int32 companyId, Int16 year, Byte month, String country, String region, ApproveFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/approve");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        return ((RestCall<List<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to approve.
     * @param byte month The month of the filing period to approve.
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @param ApproveFilingsModel model The approve request you wish to execute.
     * @return FilingModel[]
     */
    public FilingModel[] approveFilingsCountryRegionAsync(int companyId, short year, byte month, String country, String region, ApproveFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/approve");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        return ((RestCall<List<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filing being adjusted.
     * @param short year The year of the filing's filing period being adjusted.
     * @param byte month The month of the filing's filing period being adjusted.
     * @param String country The two-character ISO-3166 code for the country of the filing being adjusted.
     * @param String region The two or three character region code for the region.
     * @param String formCode The unique code of the form being adjusted.
     * @param FilingAdjustmentModel[] model A list of Adjustments to be created for the specified filing.
     * @return FilingAdjustmentModel[]
     */
    public List<FilingAdjustmentModel> createReturnAdjustment(Int32 companyId, Int16 year, Byte month, String country, String region, String formCode, List<FilingAdjustmentModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/adjust");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        path.ApplyField("formCode", formCode);
        return ((RestCall<List<FilingAdjustmentModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingAdjustmentModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filing being adjusted.
     * @param short year The year of the filing's filing period being adjusted.
     * @param byte month The month of the filing's filing period being adjusted.
     * @param String country The two-character ISO-3166 code for the country of the filing being adjusted.
     * @param String region The two or three character region code for the region.
     * @param String formCode The unique code of the form being adjusted.
     * @param FilingAdjustmentModel[] model A list of Adjustments to be created for the specified filing.
     * @return FilingAdjustmentModel[]
     */
    public FilingAdjustmentModel[] createReturnAdjustmentAsync(int companyId, short year, byte month, String country, String region, String formCode, FilingAdjustmentModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/adjust");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        path.ApplyField("formCode", formCode);
        return ((RestCall<List<FilingAdjustmentModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingAdjustmentModel>>(){})).call();
    }

    /**
     * Add an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API creates a new augmentation for an existing tax filing.
     * 
     * @param int companyId The ID of the company that owns the filing being changed.
     * @param short year The month of the filing's filing period being changed.
     * @param byte month The month of the filing's filing period being changed.
     * @param String country The two-character ISO-3166 code for the country of the filing being changed.
     * @param String region The two or three character region code for the region of the filing being changed.
     * @param String formCode The unique code of the form being changed.
     * @param FilingAugmentationModel[] model A list of augmentations to be created for the specified filing.
     * @return FilingAugmentationModel[]
     */
    public List<FilingAugmentationModel> createReturnAugmentation(Int32 companyId, Int16 year, Byte month, String country, String region, String formCode, List<FilingAugmentationModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/augment");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        path.ApplyField("formCode", formCode);
        return ((RestCall<List<FilingAugmentationModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingAugmentationModel>>(){})).call();
    }

    /**
     * Add an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API creates a new augmentation for an existing tax filing.
     * 
     * @param int companyId The ID of the company that owns the filing being changed.
     * @param short year The month of the filing's filing period being changed.
     * @param byte month The month of the filing's filing period being changed.
     * @param String country The two-character ISO-3166 code for the country of the filing being changed.
     * @param String region The two or three character region code for the region of the filing being changed.
     * @param String formCode The unique code of the form being changed.
     * @param FilingAugmentationModel[] model A list of augmentations to be created for the specified filing.
     * @return FilingAugmentationModel[]
     */
    public FilingAugmentationModel[] createReturnAugmentationAsync(int companyId, short year, byte month, String country, String region, String formCode, FilingAugmentationModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}/augment");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        path.ApplyField("formCode", formCode);
        return ((RestCall<List<FilingAugmentationModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<FilingAugmentationModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filing being adjusted.
     * @param long id The ID of the adjustment being deleted.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteReturnAdjustment(Int32 companyId, Int64 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filing being adjusted.
     * @param long id The ID of the adjustment being deleted.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteReturnAdjustmentAsync(int companyId, long id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API deletes an augmentation for an existing tax filing.
     * 
     * @param int companyId The ID of the company that owns the filing being changed.
     * @param long id The ID of the augmentation being added.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteReturnAugmentation(Int32 companyId, Int64 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API deletes an augmentation for an existing tax filing.
     * 
     * @param int companyId The ID of the company that owns the filing being changed.
     * @param long id The ID of the augmentation being added.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteReturnAugmentationAsync(int companyId, long id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Retrieve worksheet checkup report for company and filing period.
     * 
     * @param int worksheetId The unique id of the worksheet.
     * @param int companyId The unique ID of the company that owns the worksheet.
     * @return FilingsCheckupModel
     */
    public FilingsCheckupModel filingsCheckupReport(Int32 worksheetId, Int32 companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{worksheetId}/checkup");
        path.ApplyField("worksheetId", worksheetId);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FilingsCheckupModel>(){})).call();
    }

    /**
     * Retrieve worksheet checkup report for company and filing period.
     * 
     * @param int worksheetId The unique id of the worksheet.
     * @param int companyId The unique ID of the company that owns the worksheet.
     * @return FilingsCheckupModel
     */
    public FilingsCheckupModel filingsCheckupReportAsync(int worksheetId, int companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{worksheetId}/checkup");
        path.ApplyField("worksheetId", worksheetId);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FilingsCheckupModel>(){})).call();
    }

    /**
     * Retrieve worksheet checkup report for company and filing period.
     * 
     * @param int companyId The unique ID of the company that owns the worksheets object.
     * @param int year The year of the filing period.
     * @param int month The month of the filing period.
     * @return FilingsCheckupModel
     */
    public FilingsCheckupModel filingsCheckupReports(Int32 companyId, Int32 year, Int32 month)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/checkup");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FilingsCheckupModel>(){})).call();
    }

    /**
     * Retrieve worksheet checkup report for company and filing period.
     * 
     * @param int companyId The unique ID of the company that owns the worksheets object.
     * @param int year The year of the filing period.
     * @param int month The month of the filing period.
     * @return FilingsCheckupModel
     */
    public FilingsCheckupModel filingsCheckupReportsAsync(int companyId, int year, int month)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/checkup");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FilingsCheckupModel>(){})).call();
    }

    /**
     * Retrieve a single attachment for a filing
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param long filingId The unique id of the worksheet return.
     * @param Long fileId The unique id of the document you are downloading
     * @return object
     */
    public FileResult getFilingAttachment(Int32 companyId, Int64 filingId, Int64? fileId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{filingId}/attachment");
        path.ApplyField("companyId", companyId);
        path.ApplyField("filingId", filingId);
        path.AddQuery("fileId", fileId);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a single attachment for a filing
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param long filingId The unique id of the worksheet return.
     * @param Long fileId The unique id of the document you are downloading
     * @return object
     */
    public object getFilingAttachmentAsync(int companyId, long filingId, Long fileId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{filingId}/attachment");
        path.ApplyField("companyId", companyId);
        path.ApplyField("filingId", filingId);
        path.AddQuery("fileId", fileId);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @return object
     */
    public FileResult getFilingAttachments(Int32 companyId, Int16 year, Byte month)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @return object
     */
    public object getFilingAttachmentsAsync(int companyId, short year, byte month)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a single trace file for a company filing period
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @return object
     */
    public FileResult getFilingAttachmentsTraceFile(Int32 companyId, Int16 year, Byte month)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments/tracefile");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a single trace file for a company filing period
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @return object
     */
    public object getFilingAttachmentsTraceFileAsync(int companyId, short year, byte month)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments/tracefile");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @return FetchResult
     */
    public FetchResult<FilingModel> getFilings(Int32 companyId, Int16 year, Byte month)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @return FetchResult
     */
    public FetchResult getFilingsAsync(int companyId, short year, byte month)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the given filing period and country.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @param String country The two-character ISO-3166 code for the country.
     * @return FetchResult
     */
    public FetchResult<FilingModel> getFilingsByCountry(Int32 companyId, Int16 year, Byte month, String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the given filing period and country.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @param String country The two-character ISO-3166 code for the country.
     * @return FetchResult
     */
    public FetchResult getFilingsByCountryAsync(int companyId, short year, byte month, String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the filing period, country and region.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @return FetchResult
     */
    public FetchResult<FilingModel> getFilingsByCountryRegion(Int32 companyId, Int16 year, Byte month, String country, String region)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the filing period, country and region.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @return FetchResult
     */
    public FetchResult getFilingsByCountryRegionAsync(int companyId, short year, byte month, String country, String region)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the given filing period, country, region and form.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @param String formCode The unique code of the form.
     * @return FetchResult
     */
    public FetchResult<FilingModel> getFilingsByReturnName(Int32 companyId, Int16 year, Byte month, String country, String region, String formCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        path.ApplyField("formCode", formCode);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Retrieve a list of filings for the specified company in the given filing period, country, region and form.
     * 
     * This API is available by invitation only.
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period.
     * @param byte month The two digit month of the filing period.
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @param String formCode The unique code of the form.
     * @return FetchResult
     */
    public FetchResult getFilingsByReturnNameAsync(int companyId, short year, byte month, String country, String region, String formCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/{formCode}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        path.ApplyField("formCode", formCode);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to be rebuilt.
     * @param byte month The month of the filing period to be rebuilt.
     * @param RebuildFilingsModel model The rebuild request you wish to execute.
     * @return FetchResult
     */
    public FetchResult<FilingModel> rebuildFilings(Int32 companyId, Int16 year, Byte month, RebuildFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/rebuild");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to be rebuilt.
     * @param byte month The month of the filing period to be rebuilt.
     * @param RebuildFilingsModel model The rebuild request you wish to execute.
     * @return FetchResult
     */
    public FetchResult rebuildFilingsAsync(int companyId, short year, byte month, RebuildFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/rebuild");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to be rebuilt.
     * @param byte month The month of the filing period to be rebuilt.
     * @param String country The two-character ISO-3166 code for the country.
     * @param RebuildFilingsModel model The rebuild request you wish to execute.
     * @return FetchResult
     */
    public FetchResult<FilingModel> rebuildFilingsByCountry(Int32 companyId, Int16 year, Byte month, String country, RebuildFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/rebuild");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to be rebuilt.
     * @param byte month The month of the filing period to be rebuilt.
     * @param String country The two-character ISO-3166 code for the country.
     * @param RebuildFilingsModel model The rebuild request you wish to execute.
     * @return FetchResult
     */
    public FetchResult rebuildFilingsByCountryAsync(int companyId, short year, byte month, String country, RebuildFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/rebuild");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Rebuild a set of filings for the specified company in the given filing period, country and region.
     * 
     * This API is available by invitation only.
     * Rebuilding a return means re-creating or updating the amounts to be filed for a filing.
     * Rebuilding has to be done whenever a customer adds transactions to a filing.        
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * based on filing frequency of filing.
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to be rebuilt.
     * @param byte month The month of the filing period to be rebuilt.
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @param RebuildFilingsModel model The rebuild request you wish to execute.
     * @return FetchResult
     */
    public FetchResult<FilingModel> rebuildFilingsByCountryRegion(Int32 companyId, Int16 year, Byte month, String country, String region, RebuildFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/rebuild");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }

    /**
     * Rebuild a set of filings for the specified company in the given filing period, country and region.
     * 
     * This API is available by invitation only.
     * Rebuilding a return means re-creating or updating the amounts to be filed for a filing.
     * Rebuilding has to be done whenever a customer adds transactions to a filing.        
     * A "filing period" is the year and month of the date of the latest customer transaction allowed to be reported on a filing, 
     * based on filing frequency of filing.
     * 
     * @param int companyId The ID of the company that owns the filings.
     * @param short year The year of the filing period to be rebuilt.
     * @param byte month The month of the filing period to be rebuilt.
     * @param String country The two-character ISO-3166 code for the country.
     * @param String region The two or three character region code for the region.
     * @param RebuildFilingsModel model The rebuild request you wish to execute.
     * @return FetchResult
     */
    public FetchResult rebuildFilingsByCountryRegionAsync(int companyId, short year, byte month, String country, String region, RebuildFilingsModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/{region}/rebuild");
        path.ApplyField("companyId", companyId);
        path.ApplyField("year", year);
        path.ApplyField("month", month);
        path.ApplyField("country", country);
        path.ApplyField("region", region);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns the filing being adjusted.
     * @param long id The ID of the adjustment being edited.
     * @param FilingAdjustmentModel model The updated Adjustment.
     * @return FilingAdjustmentModel
     */
    public FilingAdjustmentModel updateReturnAdjustment(Int32 companyId, Int64 id, FilingAdjustmentModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingAdjustmentModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<FilingAdjustmentModel>(){})).call();
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
     * @param int companyId The ID of the company that owns the filing being adjusted.
     * @param long id The ID of the adjustment being edited.
     * @param FilingAdjustmentModel model The updated Adjustment.
     * @return FilingAdjustmentModel
     */
    public FilingAdjustmentModel updateReturnAdjustmentAsync(int companyId, long id, FilingAdjustmentModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingAdjustmentModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<FilingAdjustmentModel>(){})).call();
    }

    /**
     * Edit an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API modifies an augmentation for an existing tax filing.
     * 
     * @param int companyId The ID of the company that owns the filing being changed.
     * @param long id The ID of the augmentation being edited.
     * @param FilingAugmentationModel model The updated Augmentation.
     * @return FilingModel
     */
    public FilingModel updateReturnAugmentation(Int32 companyId, Int64 id, FilingAugmentationModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<FilingModel>(){})).call();
    }

    /**
     * Edit an augmentation for a given filing.
     * 
     * This API is available by invitation only.
     * An "Augmentation" is a manually added increase or decrease in tax liability, by either customer or Avalara 
     * usually due to customer wanting to report tax Avatax does not support, e.g. bad debts, rental tax.
     * This API modifies an augmentation for an existing tax filing.
     * 
     * @param int companyId The ID of the company that owns the filing being changed.
     * @param long id The ID of the augmentation being edited.
     * @param FilingAugmentationModel model The updated Augmentation.
     * @return FilingModel
     */
    public FilingModel updateReturnAugmentationAsync(int companyId, long id, FilingAugmentationModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FilingModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<FilingModel>(){})).call();
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
     * @param FreeTrialRequestModel model Required information to provision a free trial account.
     * @return NewAccountModel
     */
    public NewAccountModel requestFreeTrial(FreeTrialRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/freetrials/request");
        return ((RestCall<NewAccountModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<NewAccountModel>(){})).call();
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
     * @param FreeTrialRequestModel model Required information to provision a free trial account.
     * @return NewAccountModel
     */
    public NewAccountModel requestFreeTrialAsync(FreeTrialRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/freetrials/request");
        return ((RestCall<NewAccountModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<NewAccountModel>(){})).call();
    }

    /**
     * FREE API - Sales tax rates for a specified address
     * 
     * # Free-To-Use
     * 
     * The TaxRates API is a free-to-use, no cost option for estimating sales tax rates.
     * Any customer can request a free AvaTax account and make use of the TaxRates API.
     * However, this API is currently limited for US only
     * 
     * Note that the TaxRates API assumes the sale of general tangible personal property when estimating the sales tax
     * rate for a specified address.  Avalara provides the `CreateTransaction` API, which provides extensive tax calculation 
     * support for scenarios including, but not limited to:
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
     * @param String line1 The street address of the location.
     * @param String line2 The street address of the location.
     * @param String line3 The street address of the location.
     * @param String city The city name of the location.
     * @param String region The state or region of the location
     * @param String postalCode The postal code of the location.
     * @param String country The two letter ISO-3166 country code.
     * @return TaxRateModel
     */
    public TaxRateModel taxRatesByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/byaddress");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        return ((RestCall<TaxRateModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxRateModel>(){})).call();
    }

    /**
     * FREE API - Sales tax rates for a specified address
     * 
     * # Free-To-Use
     * 
     * The TaxRates API is a free-to-use, no cost option for estimating sales tax rates.
     * Any customer can request a free AvaTax account and make use of the TaxRates API.
     * However, this API is currently limited for US only
     * 
     * Note that the TaxRates API assumes the sale of general tangible personal property when estimating the sales tax
     * rate for a specified address.  Avalara provides the `CreateTransaction` API, which provides extensive tax calculation 
     * support for scenarios including, but not limited to:
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
     * @param String line1 The street address of the location.
     * @param String line2 The street address of the location.
     * @param String line3 The street address of the location.
     * @param String city The city name of the location.
     * @param String region The state or region of the location
     * @param String postalCode The postal code of the location.
     * @param String country The two letter ISO-3166 country code.
     * @return TaxRateModel
     */
    public TaxRateModel taxRatesByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/byaddress");
        path.AddQuery("line1", line1);
        path.AddQuery("line2", line2);
        path.AddQuery("line3", line3);
        path.AddQuery("city", city);
        path.AddQuery("region", region);
        path.AddQuery("postalCode", postalCode);
        path.AddQuery("country", country);
        return ((RestCall<TaxRateModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxRateModel>(){})).call();
    }

    /**
     * FREE API - Sales tax rates for a specified country and postal code
     * 
     * # Free-To-Use
     * 
     * The TaxRates API is a free-to-use, no cost option for estimating sales tax rates.
     * Any customer can request a free AvaTax account and make use of the TaxRates API.
     * However, this API is currently limited for US only
     * 
     * Note that the TaxRates API assumes the sale of general tangible personal property when estimating the sales tax
     * rate for a specified address.  Avalara provides the `CreateTransaction` API, which provides extensive tax calculation 
     * support for scenarios including, but not limited to:
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
     * @param String country The two letter ISO-3166 country code.
     * @param String postalCode The postal code of the location.
     * @return TaxRateModel
     */
    public TaxRateModel taxRatesByPostalCode(String country, String postalCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/bypostalcode");
        path.AddQuery("country", country);
        path.AddQuery("postalCode", postalCode);
        return ((RestCall<TaxRateModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxRateModel>(){})).call();
    }

    /**
     * FREE API - Sales tax rates for a specified country and postal code
     * 
     * # Free-To-Use
     * 
     * The TaxRates API is a free-to-use, no cost option for estimating sales tax rates.
     * Any customer can request a free AvaTax account and make use of the TaxRates API.
     * However, this API is currently limited for US only
     * 
     * Note that the TaxRates API assumes the sale of general tangible personal property when estimating the sales tax
     * rate for a specified address.  Avalara provides the `CreateTransaction` API, which provides extensive tax calculation 
     * support for scenarios including, but not limited to:
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
     * @param String country The two letter ISO-3166 country code.
     * @param String postalCode The postal code of the location.
     * @return TaxRateModel
     */
    public TaxRateModel taxRatesByPostalCodeAsync(String country, String postalCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/bypostalcode");
        path.AddQuery("country", country);
        path.AddQuery("postalCode", postalCode);
        return ((RestCall<TaxRateModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxRateModel>(){})).call();
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
     * @param long id The unique ID number of this funding request
     * @return FundingStatusModel
     */
    public FundingStatusModel activateFundingRequest(Int64 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}/widget");
        path.ApplyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FundingStatusModel>(){})).call();
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
     * @param long id The unique ID number of this funding request
     * @return FundingStatusModel
     */
    public FundingStatusModel activateFundingRequestAsync(long id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}/widget");
        path.ApplyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FundingStatusModel>(){})).call();
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
     * @param int id The unique ID number of this funding request
     * @return FundingStatusModel
     */
    public FundingStatusModel fundingRequestStatus(Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}");
        path.ApplyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FundingStatusModel>(){})).call();
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
     * @param int id The unique ID number of this funding request
     * @return FundingStatusModel
     */
    public FundingStatusModel fundingRequestStatusAsync(int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}");
        path.ApplyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FundingStatusModel>(){})).call();
    }

    /**
     * Create a new item
     * 
     * @param int companyId The ID of the company that owns this item.
     * @param ItemModel[] model The item you wish to create.
     * @return ItemModel[]
     */
    public List<ItemModel> createItems(Int32 companyId, List<ItemModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<ItemModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<ItemModel>>(){})).call();
    }

    /**
     * Create a new item
     * 
     * @param int companyId The ID of the company that owns this item.
     * @param ItemModel[] model The item you wish to create.
     * @return ItemModel[]
     */
    public ItemModel[] createItemsAsync(int companyId, ItemModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<ItemModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<ItemModel>>(){})).call();
    }

    /**
     * Delete a single item
     * 
     * @param int companyId The ID of the company that owns this item.
     * @param long id The ID of the item you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteItem(Int32 companyId, Int64 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single item
     * 
     * @param int companyId The ID of the company that owns this item.
     * @param long id The ID of the item you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteItemAsync(int companyId, long id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Retrieve a single item
     * 
     * Get the item object identified by this URL.
     * 
     * @param int companyId The ID of the company that owns this item object
     * @param long id The primary key of this item
     * @return ItemModel
     */
    public ItemModel getItem(Int32 companyId, Int64 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<ItemModel>(){})).call();
    }

    /**
     * Retrieve a single item
     * 
     * Get the item object identified by this URL.
     * 
     * @param int companyId The ID of the company that owns this item object
     * @param long id The primary key of this item
     * @return ItemModel
     */
    public ItemModel getItemAsync(int companyId, long id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<ItemModel>(){})).call();
    }

    /**
     * Retrieve items for this company
     * 
     * List all items defined for the current company.
     * 
     * An 'Item' represents a product or service that your company offers for sale.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param int companyId The ID of the company that defined these items
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<ItemModel> listItemsByCompany(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }

    /**
     * Retrieve items for this company
     * 
     * List all items defined for the current company.
     * 
     * An 'Item' represents a product or service that your company offers for sale.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param int companyId The ID of the company that defined these items
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listItemsByCompanyAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }

    /**
     * Retrieve all items
     * 
     * Get multiple item objects across all companies.
     * An 'Item' represents a product or service that your company offers for sale.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<ItemModel> queryItems(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/items");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }

    /**
     * Retrieve all items
     * 
     * Get multiple item objects across all companies.
     * An 'Item' represents a product or service that your company offers for sale.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryItemsAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/items");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }

    /**
     * Update a single item
     * 
     * Replace the existing item object at this URL with an updated object.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int companyId The ID of the company that this item belongs to.
     * @param long id The ID of the item you wish to update
     * @param ItemModel model The item object you wish to update.
     * @return ItemModel
     */
    public ItemModel updateItem(Int32 companyId, Int64 id, ItemModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<ItemModel>(){})).call();
    }

    /**
     * Update a single item
     * 
     * Replace the existing item object at this URL with an updated object.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int companyId The ID of the company that this item belongs to.
     * @param long id The ID of the item you wish to update
     * @param ItemModel model The item object you wish to update.
     * @return ItemModel
     */
    public ItemModel updateItemAsync(int companyId, long id, ItemModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<ItemModel>(){})).call();
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
     * @param int accountId The ID of the account that owns this override
     * @param JurisdictionOverrideModel[] model The jurisdiction override objects to create
     * @return JurisdictionOverrideModel[]
     */
    public List<JurisdictionOverrideModel> createJurisdictionOverrides(Int32 accountId, List<JurisdictionOverrideModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.ApplyField("accountId", accountId);
        return ((RestCall<List<JurisdictionOverrideModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<JurisdictionOverrideModel>>(){})).call();
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
     * @param int accountId The ID of the account that owns this override
     * @param JurisdictionOverrideModel[] model The jurisdiction override objects to create
     * @return JurisdictionOverrideModel[]
     */
    public JurisdictionOverrideModel[] createJurisdictionOverridesAsync(int accountId, JurisdictionOverrideModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.ApplyField("accountId", accountId);
        return ((RestCall<List<JurisdictionOverrideModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<JurisdictionOverrideModel>>(){})).call();
    }

    /**
     * Delete a single override
     * 
     * @param int accountId The ID of the account that owns this override
     * @param int id The ID of the override you wish to delete
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteJurisdictionOverride(Int32 accountId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single override
     * 
     * @param int accountId The ID of the account that owns this override
     * @param int id The ID of the override you wish to delete
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteJurisdictionOverrideAsync(int accountId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
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
     * @param int accountId The ID of the account that owns this override
     * @param int id The primary key of this override
     * @return JurisdictionOverrideModel
     */
    public JurisdictionOverrideModel getJurisdictionOverride(Int32 accountId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<JurisdictionOverrideModel>(){})).call();
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
     * @param int accountId The ID of the account that owns this override
     * @param int id The primary key of this override
     * @return JurisdictionOverrideModel
     */
    public JurisdictionOverrideModel getJurisdictionOverrideAsync(int accountId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<JurisdictionOverrideModel>(){})).call();
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
     * @param int accountId The ID of the account that owns this override
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<JurisdictionOverrideModel> listJurisdictionOverridesByAccount(Int32 accountId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.ApplyField("accountId", accountId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
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
     * @param int accountId The ID of the account that owns this override
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listJurisdictionOverridesByAccountAsync(int accountId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.ApplyField("accountId", accountId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<JurisdictionOverrideModel> queryJurisdictionOverrides(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/jurisdictionoverrides");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryJurisdictionOverridesAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/jurisdictionoverrides");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
    }

    /**
     * Update a single jurisdictionoverride
     * 
     * @param int accountId The ID of the account that this jurisdictionoverride belongs to.
     * @param int id The ID of the jurisdictionoverride you wish to update
     * @param JurisdictionOverrideModel model The jurisdictionoverride object you wish to update.
     * @return JurisdictionOverrideModel
     */
    public JurisdictionOverrideModel updateJurisdictionOverride(Int32 accountId, Int32 id, JurisdictionOverrideModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<JurisdictionOverrideModel>(){})).call();
    }

    /**
     * Update a single jurisdictionoverride
     * 
     * @param int accountId The ID of the account that this jurisdictionoverride belongs to.
     * @param int id The ID of the jurisdictionoverride you wish to update
     * @param JurisdictionOverrideModel model The jurisdictionoverride object you wish to update.
     * @return JurisdictionOverrideModel
     */
    public JurisdictionOverrideModel updateJurisdictionOverrideAsync(int accountId, int id, JurisdictionOverrideModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<JurisdictionOverrideModel>(){})).call();
    }

    /**
     * Point of sale data file generation
     * 
     * Builds a point-of-sale data file containing tax rates and rules for this location, containing tax rates for all
     * items defined for this company.  This data file can be used to correctly calculate tax in the event a 
     * point-of-sale device is not able to reach AvaTax.
     * This data file can be customized for specific partner devices and usage conditions.
     * The result of this API is the file you requested in the format you requested using the 'responseType' field.
     * 
     * @param int companyId The ID number of the company that owns this location.
     * @param int id The ID number of the location to retrieve point-of-sale data.
     * @param Date date The date for which point-of-sale data would be calculated (today by default)
     * @param PointOfSaleFileType format The format of the file (JSON by default) (See PointOfSaleFileType::* for a list of allowable values)
     * @param PointOfSalePartnerId partnerId If specified, requests a custom partner-formatted version of the file. (See PointOfSalePartnerId::* for a list of allowable values)
     * @param Boolean includeJurisCodes When true, the file will include jurisdiction codes in the result.
     * @return object
     */
    public FileResult buildPointOfSaleDataForLocation(Int32 companyId, Int32 id, DateTime? date, PointOfSaleFileType? format, PointOfSalePartnerId? partnerId, Boolean? includeJurisCodes)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/pointofsaledata");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        path.AddQuery("date", date);
        path.AddQuery("format", format);
        path.AddQuery("partnerId", partnerId);
        path.AddQuery("includeJurisCodes", includeJurisCodes);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Point of sale data file generation
     * 
     * Builds a point-of-sale data file containing tax rates and rules for this location, containing tax rates for all
     * items defined for this company.  This data file can be used to correctly calculate tax in the event a 
     * point-of-sale device is not able to reach AvaTax.
     * This data file can be customized for specific partner devices and usage conditions.
     * The result of this API is the file you requested in the format you requested using the 'responseType' field.
     * 
     * @param int companyId The ID number of the company that owns this location.
     * @param int id The ID number of the location to retrieve point-of-sale data.
     * @param Date date The date for which point-of-sale data would be calculated (today by default)
     * @param PointOfSaleFileType format The format of the file (JSON by default) (See PointOfSaleFileType::* for a list of allowable values)
     * @param PointOfSalePartnerId partnerId If specified, requests a custom partner-formatted version of the file. (See PointOfSalePartnerId::* for a list of allowable values)
     * @param Boolean includeJurisCodes When true, the file will include jurisdiction codes in the result.
     * @return object
     */
    public object buildPointOfSaleDataForLocationAsync(int companyId, int id, Date date, PointOfSaleFileType format, PointOfSalePartnerId partnerId, Boolean includeJurisCodes)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/pointofsaledata");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        path.AddQuery("date", date);
        path.AddQuery("format", format);
        path.AddQuery("partnerId", partnerId);
        path.AddQuery("includeJurisCodes", includeJurisCodes);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Create a new location
     * 
     * @param int companyId The ID of the company that owns this location.
     * @param LocationModel[] model The location you wish to create.
     * @return LocationModel[]
     */
    public List<LocationModel> createLocations(Int32 companyId, List<LocationModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<LocationModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<LocationModel>>(){})).call();
    }

    /**
     * Create a new location
     * 
     * @param int companyId The ID of the company that owns this location.
     * @param LocationModel[] model The location you wish to create.
     * @return LocationModel[]
     */
    public LocationModel[] createLocationsAsync(int companyId, LocationModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<LocationModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<LocationModel>>(){})).call();
    }

    /**
     * Delete a single location
     * 
     * @param int companyId The ID of the company that owns this location.
     * @param int id The ID of the location you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteLocation(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single location
     * 
     * @param int companyId The ID of the company that owns this location.
     * @param int id The ID of the location you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteLocationAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Retrieve a single location
     * 
     * Get the location object identified by this URL.
     * An 'Location' represents a physical address where a company does business.
     * Many taxing authorities require that you define a list of all locations where your company does business.
     * These locations may require additional custom configuration or tax registration with these authorities.
     * 
     * @param int companyId The ID of the company that owns this location
     * @param int id The primary key of this location
     * @return LocationModel
     */
    public LocationModel getLocation(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<LocationModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<LocationModel>(){})).call();
    }

    /**
     * Retrieve a single location
     * 
     * Get the location object identified by this URL.
     * An 'Location' represents a physical address where a company does business.
     * Many taxing authorities require that you define a list of all locations where your company does business.
     * These locations may require additional custom configuration or tax registration with these authorities.
     * 
     * @param int companyId The ID of the company that owns this location
     * @param int id The primary key of this location
     * @return LocationModel
     */
    public LocationModel getLocationAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<LocationModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<LocationModel>(){})).call();
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
     * 
     * @param int companyId The ID of the company that owns these locations
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<LocationModel> listLocationsByCompany(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<LocationModel>>(){})).call();
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
     * 
     * @param int companyId The ID of the company that owns these locations
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listLocationsByCompanyAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<LocationModel>>(){})).call();
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
     * 
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<LocationModel> queryLocations(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/locations");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<LocationModel>>(){})).call();
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
     * 
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryLocationsAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/locations");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<LocationModel>>(){})).call();
    }

    /**
     * Update a single location
     * 
     * Replace the existing location object at this URL with an updated object.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int companyId The ID of the company that this location belongs to.
     * @param int id The ID of the location you wish to update
     * @param LocationModel model The location you wish to update.
     * @return LocationModel
     */
    public LocationModel updateLocation(Int32 companyId, Int32 id, LocationModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<LocationModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<LocationModel>(){})).call();
    }

    /**
     * Update a single location
     * 
     * Replace the existing location object at this URL with an updated object.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int companyId The ID of the company that this location belongs to.
     * @param int id The ID of the location you wish to update
     * @param LocationModel model The location you wish to update.
     * @return LocationModel
     */
    public LocationModel updateLocationAsync(int companyId, int id, LocationModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<LocationModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<LocationModel>(){})).call();
    }

    /**
     * Validate the location against local requirements
     * 
     * Returns validation information for this location.
     * This API call is intended to compare this location against the currently known taxing authority rules and regulations,
     * 
     * @param int companyId The ID of the company that owns this location
     * @param int id The primary key of this location
     * @return LocationValidationModel
     */
    public LocationValidationModel validateLocation(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/validate");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<LocationValidationModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<LocationValidationModel>(){})).call();
    }

    /**
     * Validate the location against local requirements
     * 
     * Returns validation information for this location.
     * This API call is intended to compare this location against the currently known taxing authority rules and regulations,
     * 
     * @param int companyId The ID of the company that owns this location
     * @param int id The primary key of this location
     * @return LocationValidationModel
     */
    public LocationValidationModel validateLocationAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/validate");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<LocationValidationModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<LocationValidationModel>(){})).call();
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
     * 
     * @param int companyId The ID of the company that owns this nexus.
     * @param NexusModel[] model The nexus you wish to create.
     * @return NexusModel[]
     */
    public List<NexusModel> createNexus(Int32 companyId, List<NexusModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<NexusModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NexusModel>>(){})).call();
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
     * 
     * @param int companyId The ID of the company that owns this nexus.
     * @param NexusModel[] model The nexus you wish to create.
     * @return NexusModel[]
     */
    public NexusModel[] createNexusAsync(int companyId, NexusModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<NexusModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NexusModel>>(){})).call();
    }

    /**
     * Delete a single nexus
     * 
     * @param int companyId The ID of the company that owns this nexus.
     * @param int id The ID of the nexus you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteNexus(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single nexus
     * 
     * @param int companyId The ID of the company that owns this nexus.
     * @param int id The ID of the nexus you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteNexusAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Retrieve a single nexus
     * 
     * Get the nexus object identified by this URL.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * 
     * @param int companyId The ID of the company that owns this nexus object
     * @param int id The primary key of this nexus
     * @return NexusModel
     */
    public NexusModel getNexus(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<NexusModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<NexusModel>(){})).call();
    }

    /**
     * Retrieve a single nexus
     * 
     * Get the nexus object identified by this URL.
     * The concept of 'Nexus' indicates a place where your company has sufficient physical presence and is obligated
     * to collect and remit transaction-based taxes.
     * When defining companies in AvaTax, you must declare nexus for your company in order to correctly calculate tax
     * 
     * @param int companyId The ID of the company that owns this nexus object
     * @param int id The primary key of this nexus
     * @return NexusModel
     */
    public NexusModel getNexusAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<NexusModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<NexusModel>(){})).call();
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
     * @param int companyId The ID of the company that owns this nexus object
     * @param String formCode The form code that we are looking up the nexus for
     * @return NexusByTaxFormModel
     */
    public NexusByTaxFormModel getNexusByFormCode(Int32 companyId, String formCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/byform/{formCode}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("formCode", formCode);
        return ((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<NexusByTaxFormModel>(){})).call();
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
     * @param int companyId The ID of the company that owns this nexus object
     * @param String formCode The form code that we are looking up the nexus for
     * @return NexusByTaxFormModel
     */
    public NexusByTaxFormModel getNexusByFormCodeAsync(int companyId, String formCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/byform/{formCode}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("formCode", formCode);
        return ((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<NexusByTaxFormModel>(){})).call();
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
     * @param int companyId The ID of the company that owns these nexus objects
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<NexusModel> listNexusByCompany(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns these nexus objects
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listNexusByCompanyAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<NexusModel> queryNexus(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/nexus");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryNexusAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/nexus");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
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
     * 
     * @param int companyId The ID of the company that this nexus belongs to.
     * @param int id The ID of the nexus you wish to update
     * @param NexusModel model The nexus object you wish to update.
     * @return NexusModel
     */
    public NexusModel updateNexus(Int32 companyId, Int32 id, NexusModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<NexusModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<NexusModel>(){})).call();
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
     * 
     * @param int companyId The ID of the company that this nexus belongs to.
     * @param int id The ID of the nexus you wish to update
     * @param NexusModel model The nexus object you wish to update.
     * @return NexusModel
     */
    public NexusModel updateNexusAsync(int companyId, int id, NexusModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<NexusModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<NexusModel>(){})).call();
    }

    /**
     * Create a new notice comment.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the tax notice we are adding the comment for.
     * @param NoticeCommentModel[] model The notice comments you wish to create.
     * @return NoticeCommentModel[]
     */
    public List<NoticeCommentModel> createNoticeComment(Int32 companyId, Int32 id, List<NoticeCommentModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<NoticeCommentModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeCommentModel>>(){})).call();
    }

    /**
     * Create a new notice comment.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the tax notice we are adding the comment for.
     * @param NoticeCommentModel[] model The notice comments you wish to create.
     * @return NoticeCommentModel[]
     */
    public NoticeCommentModel[] createNoticeCommentAsync(int companyId, int id, NoticeCommentModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<NoticeCommentModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeCommentModel>>(){})).call();
    }

    /**
     * Create a new notice finance details.
     * 
     * This API is available by invitation only.
     * 'Notice finance details' is the categorical breakdown of the total charge levied by the tax authority on our customer,
     * as broken down in our "notice log" found in Workflow. Main examples of the categories are 'Tax Due', 'Interest', 'Penalty', 'Total Abated'.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the notice added to the finance details.
     * @param NoticeFinanceModel[] model The notice finance details you wish to create.
     * @return NoticeFinanceModel[]
     */
    public List<NoticeFinanceModel> createNoticeFinanceDetails(Int32 companyId, Int32 id, List<NoticeFinanceModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<NoticeFinanceModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeFinanceModel>>(){})).call();
    }

    /**
     * Create a new notice finance details.
     * 
     * This API is available by invitation only.
     * 'Notice finance details' is the categorical breakdown of the total charge levied by the tax authority on our customer,
     * as broken down in our "notice log" found in Workflow. Main examples of the categories are 'Tax Due', 'Interest', 'Penalty', 'Total Abated'.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the notice added to the finance details.
     * @param NoticeFinanceModel[] model The notice finance details you wish to create.
     * @return NoticeFinanceModel[]
     */
    public NoticeFinanceModel[] createNoticeFinanceDetailsAsync(int companyId, int id, NoticeFinanceModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<NoticeFinanceModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeFinanceModel>>(){})).call();
    }

    /**
     * Create a new notice responsibility.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the tax notice we are adding the responsibility for.
     * @param NoticeResponsibilityDetailModel[] model The notice responsibilities you wish to create.
     * @return NoticeResponsibilityDetailModel[]
     */
    public List<NoticeResponsibilityDetailModel> createNoticeResponsibilities(Int32 companyId, Int32 id, List<NoticeResponsibilityDetailModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeResponsibilityDetailModel>>(){})).call();
    }

    /**
     * Create a new notice responsibility.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the tax notice we are adding the responsibility for.
     * @param NoticeResponsibilityDetailModel[] model The notice responsibilities you wish to create.
     * @return NoticeResponsibilityDetailModel[]
     */
    public NoticeResponsibilityDetailModel[] createNoticeResponsibilitiesAsync(int companyId, int id, NoticeResponsibilityDetailModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeResponsibilityDetailModel>>(){})).call();
    }

    /**
     * Create a new notice root cause.
     * 
     * This API is available by invitation only.
     * 'Notice root causes' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the tax notice we are adding the responsibility for.
     * @param NoticeRootCauseDetailModel[] model The notice root causes you wish to create.
     * @return NoticeRootCauseDetailModel[]
     */
    public List<NoticeRootCauseDetailModel> createNoticeRootCauses(Int32 companyId, Int32 id, List<NoticeRootCauseDetailModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeRootCauseDetailModel>>(){})).call();
    }

    /**
     * Create a new notice root cause.
     * 
     * This API is available by invitation only.
     * 'Notice root causes' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the tax notice we are adding the responsibility for.
     * @param NoticeRootCauseDetailModel[] model The notice root causes you wish to create.
     * @return NoticeRootCauseDetailModel[]
     */
    public NoticeRootCauseDetailModel[] createNoticeRootCausesAsync(int companyId, int id, NoticeRootCauseDetailModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeRootCauseDetailModel>>(){})).call();
    }

    /**
     * Create a new notice.
     * 
     * This API is available by invitation only.
     * Create one or more new notice objects.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param NoticeModel[] model The notice object you wish to create.
     * @return NoticeModel[]
     */
    public List<NoticeModel> createNotices(Int32 companyId, List<NoticeModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<NoticeModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeModel>>(){})).call();
    }

    /**
     * Create a new notice.
     * 
     * This API is available by invitation only.
     * Create one or more new notice objects.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param NoticeModel[] model The notice object you wish to create.
     * @return NoticeModel[]
     */
    public NoticeModel[] createNoticesAsync(int companyId, NoticeModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<NoticeModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<NoticeModel>>(){})).call();
    }

    /**
     * Delete a single notice.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the notice you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteNotice(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single notice.
     * 
     * This API is available by invitation only.
     * Mark the existing notice object at this URL as deleted.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company that owns this notice.
     * @param int id The ID of the notice you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteNoticeAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Retrieve a single attachment
     * 
     * This API is available by invitation only.
     * 
     * @param int companyId The ID of the company for this attachment.
     * @param long id The ResourceFileId of the attachment to download.
     * @return object
     */
    public FileResult downloadNoticeAttachment(Int32 companyId, Int64 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/{id}/attachment");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a single attachment
     * 
     * This API is available by invitation only.
     * 
     * @param int companyId The ID of the company for this attachment.
     * @param long id The ResourceFileId of the attachment to download.
     * @return object
     */
    public object downloadNoticeAttachmentAsync(int companyId, long id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/{id}/attachment");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a single notice.
     * 
     * This API is available by invitation only.
     * Get the tax notice object identified by this URL.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company for this notice.
     * @param int id The ID of this notice.
     * @return NoticeModel
     */
    public NoticeModel getNotice(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<NoticeModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<NoticeModel>(){})).call();
    }

    /**
     * Retrieve a single notice.
     * 
     * This API is available by invitation only.
     * Get the tax notice object identified by this URL.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int companyId The ID of the company for this notice.
     * @param int id The ID of this notice.
     * @return NoticeModel
     */
    public NoticeModel getNoticeAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<NoticeModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<NoticeModel>(){})).call();
    }

    /**
     * Retrieve notice comments for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int id The ID of the notice.
     * @param int companyId The ID of the company that owns these notices.
     * @return FetchResult
     */
    public FetchResult<NoticeCommentModel> getNoticeComments(Int32 id, Int32 companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.ApplyField("id", id);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeCommentModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeCommentModel>>(){})).call();
    }

    /**
     * Retrieve notice comments for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice comments' are updates by the notice team on the work to be done and that has been done so far on a notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int id The ID of the notice.
     * @param int companyId The ID of the company that owns these notices.
     * @return FetchResult
     */
    public FetchResult getNoticeCommentsAsync(int id, int companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.ApplyField("id", id);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeCommentModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeCommentModel>>(){})).call();
    }

    /**
     * Retrieve notice finance details for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice finance details' is the categorical breakdown of the total charge levied by the tax authority on our customer,
     * as broken down in our "notice log" found in Workflow. Main examples of the categories are 'Tax Due', 'Interest', 'Penalty', 'Total Abated'.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int id The ID of the company that owns these notices.
     * @param int companyId The ID of the company that owns these notices.
     * @return FetchResult
     */
    public FetchResult<NoticeFinanceModel> getNoticeFinanceDetails(Int32 id, Int32 companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.ApplyField("id", id);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeFinanceModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeFinanceModel>>(){})).call();
    }

    /**
     * Retrieve notice finance details for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice finance details' is the categorical breakdown of the total charge levied by the tax authority on our customer,
     * as broken down in our "notice log" found in Workflow. Main examples of the categories are 'Tax Due', 'Interest', 'Penalty', 'Total Abated'.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int id The ID of the company that owns these notices.
     * @param int companyId The ID of the company that owns these notices.
     * @return FetchResult
     */
    public FetchResult getNoticeFinanceDetailsAsync(int id, int companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.ApplyField("id", id);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeFinanceModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeFinanceModel>>(){})).call();
    }

    /**
     * Retrieve notice responsibilities for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice responsibilities' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int id The ID of the notice.
     * @param int companyId The ID of the company that owns these notices.
     * @return FetchResult
     */
    public FetchResult<NoticeResponsibilityDetailModel> getNoticeResponsibilities(Int32 id, Int32 companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.ApplyField("id", id);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeResponsibilityDetailModel>>(){})).call();
    }

    /**
     * Retrieve notice responsibilities for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice responsibilities' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int id The ID of the notice.
     * @param int companyId The ID of the company that owns these notices.
     * @return FetchResult
     */
    public FetchResult getNoticeResponsibilitiesAsync(int id, int companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.ApplyField("id", id);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeResponsibilityDetailModel>>(){})).call();
    }

    /**
     * Retrieve notice root causes for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice root causes' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int id The ID of the notice.
     * @param int companyId The ID of the company that owns these notices.
     * @return FetchResult
     */
    public FetchResult<NoticeRootCauseDetailModel> getNoticeRootCauses(Int32 id, Int32 companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.ApplyField("id", id);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeRootCauseDetailModel>>(){})).call();
    }

    /**
     * Retrieve notice root causes for a specific notice.
     * 
     * This API is available by invitation only.
     * 'Notice root causes' are are those who are responsible for the notice.
     * A 'notice' represents a letter sent to a business by a tax authority regarding tax filing issues.  Avalara
     * 
     * @param int id The ID of the notice.
     * @param int companyId The ID of the company that owns these notices.
     * @return FetchResult
     */
    public FetchResult getNoticeRootCausesAsync(int id, int companyId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.ApplyField("id", id);
        path.ApplyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeRootCauseDetailModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns these notices.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<NoticeModel> listNoticesByCompany(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns these notices.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listNoticesByCompanyAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<NoticeModel> queryNotices(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/notices");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryNoticesAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/notices");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<NoticeModel>>(){})).call();
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
     * @param int companyId The ID of the company that this notice belongs to.
     * @param int id The ID of the notice you wish to update.
     * @param NoticeModel model The notice object you wish to update.
     * @return NoticeModel
     */
    public NoticeModel updateNotice(Int32 companyId, Int32 id, NoticeModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<NoticeModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<NoticeModel>(){})).call();
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
     * @param int companyId The ID of the company that this notice belongs to.
     * @param int id The ID of the notice you wish to update.
     * @param NoticeModel model The notice object you wish to update.
     * @return NoticeModel
     */
    public NoticeModel updateNoticeAsync(int companyId, int id, NoticeModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<NoticeModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<NoticeModel>(){})).call();
    }

    /**
     * Retrieve a single attachment
     * 
     * This API is available by invitation only.
     * 
     * @param int companyId The ID of the company for this attachment.
     * @param ResourceFileUploadRequestModel model The ResourceFileId of the attachment to download.
     * @return object
     */
    public FileResult uploadAttachment(Int32 companyId, ResourceFileUploadRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/attachment");
        path.ApplyField("companyId", companyId);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Retrieve a single attachment
     * 
     * This API is available by invitation only.
     * 
     * @param int companyId The ID of the company for this attachment.
     * @param ResourceFileUploadRequestModel model The ResourceFileId of the attachment to download.
     * @return object
     */
    public object uploadAttachmentAsync(int companyId, ResourceFileUploadRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/attachment");
        path.ApplyField("companyId", companyId);
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Request a new Avalara account
     * 
     * This API is for use by partner onboarding services customers only.
     * Calling this API creates an account with the specified product subscriptions, but does not configure billing.
     * The customer will receive information from Avalara about how to configure billing for their account.
     * 
     * @param NewAccountRequestModel model Information about the account you wish to create and the selected product offerings.
     * @return NewAccountModel
     */
    public NewAccountModel requestNewAccount(NewAccountRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/request");
        return ((RestCall<NewAccountModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<NewAccountModel>(){})).call();
    }

    /**
     * Request a new Avalara account
     * 
     * This API is for use by partner onboarding services customers only.
     * Calling this API creates an account with the specified product subscriptions, but does not configure billing.
     * The customer will receive information from Avalara about how to configure billing for their account.
     * 
     * @param NewAccountRequestModel model Information about the account you wish to create and the selected product offerings.
     * @return NewAccountModel
     */
    public NewAccountModel requestNewAccountAsync(NewAccountRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/request");
        return ((RestCall<NewAccountModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<NewAccountModel>(){})).call();
    }

    /**
     * Point of sale data file generation
     * 
     * Builds a point-of-sale data file containing tax rates and rules for items and locations that can be used
     * to correctly calculate tax in the event a point-of-sale device is not able to reach AvaTax.
     * This data file can be customized for specific partner devices and usage conditions.
     * The result of this API is the file you requested in the format you requested using the 'responseType' field.
     * 
     * @param PointOfSaleDataRequestModel model Parameters about the desired file format and report format, specifying which company, locations and TaxCodes to include.
     * @return object
     */
    public FileResult buildPointOfSaleDataFile(PointOfSaleDataRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/pointofsaledata/build");
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FileResult>(){})).call();
    }

    /**
     * Point of sale data file generation
     * 
     * Builds a point-of-sale data file containing tax rates and rules for items and locations that can be used
     * to correctly calculate tax in the event a point-of-sale device is not able to reach AvaTax.
     * This data file can be customized for specific partner devices and usage conditions.
     * The result of this API is the file you requested in the format you requested using the 'responseType' field.
     * 
     * @param PointOfSaleDataRequestModel model Parameters about the desired file format and report format, specifying which company, locations and TaxCodes to include.
     * @return object
     */
    public object buildPointOfSaleDataFileAsync(PointOfSaleDataRequestModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/pointofsaledata/build");
        return ((RestCall<FileResult>)restCallFactory.createRestCall("Post", path, model, new TypeToken<FileResult>(){})).call();
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
     * @param PasswordChangeModel model An object containing your current password and the new password.
     * @return String
     */
    public String changePassword(PasswordChangeModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords");
        return ((RestCall<String>)restCallFactory.createRestCall("Put", path, model, new TypeToken<String>(){})).call();
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
     * @param PasswordChangeModel model An object containing your current password and the new password.
     * @return String
     */
    public String changePasswordAsync(PasswordChangeModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords");
        return ((RestCall<String>)restCallFactory.createRestCall("Put", path, model, new TypeToken<String>(){})).call();
    }

    /**
     * Create a new account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Create a single new account object.  
     * 
     * @param AccountModel model The account you wish to create.
     * @return AccountModel
     */
    public AccountModel createAccount(AccountModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<AccountModel>(){})).call();
    }

    /**
     * Create a new account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Create a single new account object.  
     * 
     * @param AccountModel model The account you wish to create.
     * @return AccountModel
     */
    public AccountModel createAccountAsync(AccountModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<AccountModel>(){})).call();
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
     * @param int accountId The ID of the account that owns this subscription.
     * @param SubscriptionModel[] model The subscription you wish to create.
     * @return SubscriptionModel[]
     */
    public List<SubscriptionModel> createSubscriptions(Int32 accountId, List<SubscriptionModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.ApplyField("accountId", accountId);
        return ((RestCall<List<SubscriptionModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<SubscriptionModel>>(){})).call();
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
     * @param int accountId The ID of the account that owns this subscription.
     * @param SubscriptionModel[] model The subscription you wish to create.
     * @return SubscriptionModel[]
     */
    public SubscriptionModel[] createSubscriptionsAsync(int accountId, SubscriptionModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.ApplyField("accountId", accountId);
        return ((RestCall<List<SubscriptionModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<SubscriptionModel>>(){})).call();
    }

    /**
     * Create new users
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Create one or more new user objects attached to this account.
     * 
     * @param int accountId The unique ID number of the account where these users will be created.
     * @param UserModel[] model The user or array of users you wish to create.
     * @return UserModel[]
     */
    public List<UserModel> createUsers(Int32 accountId, List<UserModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.ApplyField("accountId", accountId);
        return ((RestCall<List<UserModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<UserModel>>(){})).call();
    }

    /**
     * Create new users
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Create one or more new user objects attached to this account.
     * 
     * @param int accountId The unique ID number of the account where these users will be created.
     * @param UserModel[] model The user or array of users you wish to create.
     * @return UserModel[]
     */
    public UserModel[] createUsersAsync(int accountId, UserModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.ApplyField("accountId", accountId);
        return ((RestCall<List<UserModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<UserModel>>(){})).call();
    }

    /**
     * Delete a single account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Delete an account.
     * 
     * @param int id The ID of the account you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteAccount(Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * Delete an account.
     * 
     * @param int id The ID of the account you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteAccountAsync(int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single subscription
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param int accountId The ID of the account that owns this subscription.
     * @param int id The ID of the subscription you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteSubscription(Int32 accountId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single subscription
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param int accountId The ID of the account that owns this subscription.
     * @param int id The ID of the subscription you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteSubscriptionAsync(int accountId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single user
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param int id The ID of the user you wish to delete.
     * @param int accountId The accountID of the user you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteUser(Int32 id, Int32 accountId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.ApplyField("id", id);
        path.ApplyField("accountId", accountId);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single user
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param int id The ID of the user you wish to delete.
     * @param int accountId The accountID of the user you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteUserAsync(int id, int accountId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.ApplyField("id", id);
        path.ApplyField("accountId", accountId);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
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
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<AccountModel> queryAccounts(String include, String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<AccountModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<AccountModel>>(){})).call();
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
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryAccountsAsync(String include, String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<AccountModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<AccountModel>>(){})).call();
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
     * @param int userId The unique ID of the user whose password will be changed
     * @param SetPasswordModel model The new password for this user
     * @return String
     */
    public String resetPassword(Int32 userId, SetPasswordModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords/{userId}/reset");
        path.ApplyField("userId", userId);
        return ((RestCall<String>)restCallFactory.createRestCall("Post", path, model, new TypeToken<String>(){})).call();
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
     * @param int userId The unique ID of the user whose password will be changed
     * @param SetPasswordModel model The new password for this user
     * @return String
     */
    public String resetPasswordAsync(int userId, SetPasswordModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords/{userId}/reset");
        path.ApplyField("userId", userId);
        return ((RestCall<String>)restCallFactory.createRestCall("Post", path, model, new TypeToken<String>(){})).call();
    }

    /**
     * Update a single account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param int id The ID of the account you wish to update.
     * @param AccountModel model The account object you wish to update.
     * @return AccountModel
     */
    public AccountModel updateAccount(Int32 id, AccountModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.ApplyField("id", id);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<AccountModel>(){})).call();
    }

    /**
     * Update a single account
     * 
     * # For Registrar Use Only
     * This API is for use by Avalara Registrar administrative users only.
     * 
     * 
     * @param int id The ID of the account you wish to update.
     * @param AccountModel model The account object you wish to update.
     * @return AccountModel
     */
    public AccountModel updateAccountAsync(int id, AccountModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.ApplyField("id", id);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<AccountModel>(){})).call();
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
     * @param int accountId The ID of the account that this subscription belongs to.
     * @param int id The ID of the subscription you wish to update
     * @param SubscriptionModel model The subscription you wish to update.
     * @return SubscriptionModel
     */
    public SubscriptionModel updateSubscription(Int32 accountId, Int32 id, SubscriptionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<SubscriptionModel>(){})).call();
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
     * @param int accountId The ID of the account that this subscription belongs to.
     * @param int id The ID of the subscription you wish to update
     * @param SubscriptionModel model The subscription you wish to update.
     * @return SubscriptionModel
     */
    public SubscriptionModel updateSubscriptionAsync(int accountId, int id, SubscriptionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<SubscriptionModel>(){})).call();
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
     * @param int companyId The ID of the company that owns this setting.
     * @param SettingModel[] model The setting you wish to create.
     * @return SettingModel[]
     */
    public List<SettingModel> createSettings(Int32 companyId, List<SettingModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<SettingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<SettingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns this setting.
     * @param SettingModel[] model The setting you wish to create.
     * @return SettingModel[]
     */
    public SettingModel[] createSettingsAsync(int companyId, SettingModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<SettingModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<SettingModel>>(){})).call();
    }

    /**
     * Delete a single setting
     * 
     * @param int companyId The ID of the company that owns this setting.
     * @param int id The ID of the setting you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteSetting(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single setting
     * 
     * @param int companyId The ID of the company that owns this setting.
     * @param int id The ID of the setting you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteSettingAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
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
     * @param int companyId The ID of the company that owns this setting
     * @param int id The primary key of this setting
     * @return SettingModel
     */
    public SettingModel getSetting(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<SettingModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<SettingModel>(){})).call();
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
     * @param int companyId The ID of the company that owns this setting
     * @param int id The primary key of this setting
     * @return SettingModel
     */
    public SettingModel getSettingAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<SettingModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<SettingModel>(){})).call();
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
     * @param int companyId The ID of the company that owns these settings
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<SettingModel> listSettingsByCompany(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SettingModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns these settings
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listSettingsByCompanyAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SettingModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<SettingModel> querySettings(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/settings");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SettingModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult querySettingsAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/settings");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SettingModel>>(){})).call();
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
     * @param int companyId The ID of the company that this setting belongs to.
     * @param int id The ID of the setting you wish to update
     * @param SettingModel model The setting you wish to update.
     * @return SettingModel
     */
    public SettingModel updateSetting(Int32 companyId, Int32 id, SettingModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<SettingModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<SettingModel>(){})).call();
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
     * @param int companyId The ID of the company that this setting belongs to.
     * @param int id The ID of the setting you wish to update
     * @param SettingModel model The setting you wish to update.
     * @return SettingModel
     */
    public SettingModel updateSettingAsync(int companyId, int id, SettingModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<SettingModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<SettingModel>(){})).call();
    }

    /**
     * Retrieve a single subscription
     * 
     * Get the subscription object identified by this URL.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * 
     * @param int accountId The ID of the account that owns this subscription
     * @param int id The primary key of this subscription
     * @return SubscriptionModel
     */
    public SubscriptionModel getSubscription(Int32 accountId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<SubscriptionModel>(){})).call();
    }

    /**
     * Retrieve a single subscription
     * 
     * Get the subscription object identified by this URL.
     * A 'subscription' indicates a licensed subscription to a named Avalara service.
     * 
     * @param int accountId The ID of the account that owns this subscription
     * @param int id The primary key of this subscription
     * @return SubscriptionModel
     */
    public SubscriptionModel getSubscriptionAsync(int accountId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.ApplyField("accountId", accountId);
        path.ApplyField("id", id);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<SubscriptionModel>(){})).call();
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
     * @param int accountId The ID of the account that owns these subscriptions
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<SubscriptionModel> listSubscriptionsByAccount(Int32 accountId, String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.ApplyField("accountId", accountId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
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
     * @param int accountId The ID of the account that owns these subscriptions
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listSubscriptionsByAccountAsync(int accountId, String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.ApplyField("accountId", accountId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<SubscriptionModel> querySubscriptions(String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/subscriptions");
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult querySubscriptionsAsync(String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/subscriptions");
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
    }

    /**
     * Create a new tax code
     * 
     * Create one or more new taxcode objects attached to this company.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param int companyId The ID of the company that owns this tax code.
     * @param TaxCodeModel[] model The tax code you wish to create.
     * @return TaxCodeModel[]
     */
    public List<TaxCodeModel> createTaxCodes(Int32 companyId, List<TaxCodeModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<TaxCodeModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<TaxCodeModel>>(){})).call();
    }

    /**
     * Create a new tax code
     * 
     * Create one or more new taxcode objects attached to this company.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param int companyId The ID of the company that owns this tax code.
     * @param TaxCodeModel[] model The tax code you wish to create.
     * @return TaxCodeModel[]
     */
    public TaxCodeModel[] createTaxCodesAsync(int companyId, TaxCodeModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<TaxCodeModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<TaxCodeModel>>(){})).call();
    }

    /**
     * Delete a single tax code
     * 
     * @param int companyId The ID of the company that owns this tax code.
     * @param int id The ID of the tax code you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteTaxCode(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single tax code
     * 
     * @param int companyId The ID of the company that owns this tax code.
     * @param int id The ID of the tax code you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteTaxCodeAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Retrieve a single tax code
     * 
     * Get the taxcode object identified by this URL.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param int companyId The ID of the company that owns this tax code
     * @param int id The primary key of this tax code
     * @return TaxCodeModel
     */
    public TaxCodeModel getTaxCode(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<TaxCodeModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxCodeModel>(){})).call();
    }

    /**
     * Retrieve a single tax code
     * 
     * Get the taxcode object identified by this URL.
     * A 'TaxCode' represents a uniquely identified type of product, good, or service.
     * Avalara supports correct tax rates and taxability rules for all TaxCodes in all supported jurisdictions.
     * If you identify your products by tax code in your 'Create Transacion' API calls, Avalara will correctly calculate tax rates and
     * 
     * @param int companyId The ID of the company that owns this tax code
     * @param int id The primary key of this tax code
     * @return TaxCodeModel
     */
    public TaxCodeModel getTaxCodeAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<TaxCodeModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxCodeModel>(){})).call();
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
     * @param int companyId The ID of the company that owns these tax codes
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<TaxCodeModel> listTaxCodesByCompany(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns these tax codes
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listTaxCodesByCompanyAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<TaxCodeModel> queryTaxCodes(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxcodes");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryTaxCodesAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxcodes");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
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
     * @param int companyId The ID of the company that this tax code belongs to.
     * @param int id The ID of the tax code you wish to update
     * @param TaxCodeModel model The tax code you wish to update.
     * @return TaxCodeModel
     */
    public TaxCodeModel updateTaxCode(Int32 companyId, Int32 id, TaxCodeModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<TaxCodeModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<TaxCodeModel>(){})).call();
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
     * @param int companyId The ID of the company that this tax code belongs to.
     * @param int id The ID of the tax code you wish to update
     * @param TaxCodeModel model The tax code you wish to update.
     * @return TaxCodeModel
     */
    public TaxCodeModel updateTaxCodeAsync(int companyId, int id, TaxCodeModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<TaxCodeModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<TaxCodeModel>(){})).call();
    }

    /**
     * Create a new tax rule
     * 
     * Create one or more new taxrule objects attached to this company.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * 
     * @param int companyId The ID of the company that owns this tax rule.
     * @param TaxRuleModel[] model The tax rule you wish to create.
     * @return TaxRuleModel[]
     */
    public List<TaxRuleModel> createTaxRules(Int32 companyId, List<TaxRuleModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<TaxRuleModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<TaxRuleModel>>(){})).call();
    }

    /**
     * Create a new tax rule
     * 
     * Create one or more new taxrule objects attached to this company.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * 
     * @param int companyId The ID of the company that owns this tax rule.
     * @param TaxRuleModel[] model The tax rule you wish to create.
     * @return TaxRuleModel[]
     */
    public TaxRuleModel[] createTaxRulesAsync(int companyId, TaxRuleModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<TaxRuleModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<TaxRuleModel>>(){})).call();
    }

    /**
     * Delete a single tax rule
     * 
     * @param int companyId The ID of the company that owns this tax rule.
     * @param int id The ID of the tax rule you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteTaxRule(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single tax rule
     * 
     * @param int companyId The ID of the company that owns this tax rule.
     * @param int id The ID of the tax rule you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteTaxRuleAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Retrieve a single tax rule
     * 
     * Get the taxrule object identified by this URL.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * 
     * @param int companyId The ID of the company that owns this tax rule
     * @param int id The primary key of this tax rule
     * @return TaxRuleModel
     */
    public TaxRuleModel getTaxRule(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<TaxRuleModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxRuleModel>(){})).call();
    }

    /**
     * Retrieve a single tax rule
     * 
     * Get the taxrule object identified by this URL.
     * A tax rule represents a custom taxability rule for a product or service sold by your company.
     * If you have obtained a custom tax ruling from an auditor that changes the behavior of certain goods or services
     * within certain taxing jurisdictions, or you have obtained special tax concessions for certain dates or locations,
     * 
     * @param int companyId The ID of the company that owns this tax rule
     * @param int id The primary key of this tax rule
     * @return TaxRuleModel
     */
    public TaxRuleModel getTaxRuleAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<TaxRuleModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TaxRuleModel>(){})).call();
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
     * @param int companyId The ID of the company that owns these tax rules
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<TaxRuleModel> listTaxRules(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){})).call();
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
     * @param int companyId The ID of the company that owns these tax rules
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listTaxRulesAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<TaxRuleModel> queryTaxRules(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrules");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){})).call();
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
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryTaxRulesAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrules");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){})).call();
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
     * @param int companyId The ID of the company that this tax rule belongs to.
     * @param int id The ID of the tax rule you wish to update
     * @param TaxRuleModel model The tax rule you wish to update.
     * @return TaxRuleModel
     */
    public TaxRuleModel updateTaxRule(Int32 companyId, Int32 id, TaxRuleModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<TaxRuleModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<TaxRuleModel>(){})).call();
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
     * @param int companyId The ID of the company that this tax rule belongs to.
     * @param int id The ID of the tax rule you wish to update
     * @param TaxRuleModel model The tax rule you wish to update.
     * @return TaxRuleModel
     */
    public TaxRuleModel updateTaxRuleAsync(int companyId, int id, TaxRuleModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<TaxRuleModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<TaxRuleModel>(){})).call();
    }

    /**
     * Add lines to an existing unlocked transaction
     * 
     * Add lines to an existing unlocked transaction.
     * 
     * The `AddLines` API allows you to add additional transaction lines to existing transaction, so that customer will
     * be able to append multiple calls together and form an extremely large transaction. If customer does not specify line number
     * in the lines to be added, a new random Guid string will be generated for line number. If customer are not satisfied with
     * the line number for the transaction lines, they can turn on the renumber switch to have REST v2 automatically renumber all 
     * transaction lines for them, in this case, the line number becomes: "1", "2", "3", ...
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param AddTransactionLineModel model information about the transaction and lines to be added
     * @return TransactionModel
     */
    public TransactionModel addLines(String include, AddTransactionLineModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/add");
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Add lines to an existing unlocked transaction
     * 
     * Add lines to an existing unlocked transaction.
     * 
     * The `AddLines` API allows you to add additional transaction lines to existing transaction, so that customer will
     * be able to append multiple calls together and form an extremely large transaction. If customer does not specify line number
     * in the lines to be added, a new random Guid string will be generated for line number. If customer are not satisfied with
     * the line number for the transaction lines, they can turn on the renumber switch to have REST v2 automatically renumber all 
     * transaction lines for them, in this case, the line number becomes: "1", "2", "3", ...
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param AddTransactionLineModel model information about the transaction and lines to be added
     * @return TransactionModel
     */
    public TransactionModel addLinesAsync(String include, AddTransactionLineModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/add");
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
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
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to adjust
     * @param AdjustTransactionModel model The adjustment you wish to make
     * @return TransactionModel
     */
    public TransactionModel adjustTransaction(String companyCode, String transactionCode, AdjustTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/adjust");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
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
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to adjust
     * @param AdjustTransactionModel model The adjustment you wish to make
     * @return TransactionModel
     */
    public TransactionModel adjustTransactionAsync(String companyCode, String transactionCode, AdjustTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/adjust");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Get audit information about a transaction
     * 
     * Retrieve audit information about a transaction stored in AvaTax.
     *  
     * The 'AuditTransaction' endpoint retrieves audit information related to a specific transaction.  This audit 
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
     * @param String companyCode The code identifying the company that owns this transaction
     * @param String transactionCode The code identifying the transaction
     * @return AuditTransactionModel
     */
    public AuditTransactionModel auditTransaction(String companyCode, String transactionCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/audit");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<AuditTransactionModel>(){})).call();
    }

    /**
     * Get audit information about a transaction
     * 
     * Retrieve audit information about a transaction stored in AvaTax.
     *  
     * The 'AuditTransaction' endpoint retrieves audit information related to a specific transaction.  This audit 
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
     * @param String companyCode The code identifying the company that owns this transaction
     * @param String transactionCode The code identifying the transaction
     * @return AuditTransactionModel
     */
    public AuditTransactionModel auditTransactionAsync(String companyCode, String transactionCode)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/audit");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<AuditTransactionModel>(){})).call();
    }

    /**
     * Get audit information about a transaction
     * 
     * Retrieve audit information about a transaction stored in AvaTax.
     *  
     * The 'AuditTransaction' endpoint retrieves audit information related to a specific transaction.  This audit 
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
     * @param String companyCode The code identifying the company that owns this transaction
     * @param String transactionCode The code identifying the transaction
     * @param DocumentType documentType The document type of the original transaction (See DocumentType::* for a list of allowable values)
     * @return AuditTransactionModel
     */
    public AuditTransactionModel auditTransactionWithType(String companyCode, String transactionCode, DocumentType documentType)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}/audit");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        path.ApplyField("documentType", documentType);
        return ((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<AuditTransactionModel>(){})).call();
    }

    /**
     * Get audit information about a transaction
     * 
     * Retrieve audit information about a transaction stored in AvaTax.
     *  
     * The 'AuditTransaction' endpoint retrieves audit information related to a specific transaction.  This audit 
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
     * @param String companyCode The code identifying the company that owns this transaction
     * @param String transactionCode The code identifying the transaction
     * @param DocumentType documentType The document type of the original transaction (See DocumentType::* for a list of allowable values)
     * @return AuditTransactionModel
     */
    public AuditTransactionModel auditTransactionWithTypeAsync(String companyCode, String transactionCode, DocumentType documentType)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}/audit");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        path.ApplyField("documentType", documentType);
        return ((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<AuditTransactionModel>(){})).call();
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
     * @param BulkLockTransactionModel model bulk lock request
     * @return BulkLockTransactionResult
     */
    public BulkLockTransactionResult bulkLockTransaction(BulkLockTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/lock");
        return ((RestCall<BulkLockTransactionResult>)restCallFactory.createRestCall("Post", path, model, new TypeToken<BulkLockTransactionResult>(){})).call();
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
     * @param BulkLockTransactionModel model bulk lock request
     * @return BulkLockTransactionResult
     */
    public BulkLockTransactionResult bulkLockTransactionAsync(BulkLockTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/lock");
        return ((RestCall<BulkLockTransactionResult>)restCallFactory.createRestCall("Post", path, model, new TypeToken<BulkLockTransactionResult>(){})).call();
    }

    /**
     * Change a transaction's code
     * 
     * Renames a transaction uniquely identified by this URL by changing its code to a new code.
     * After this API call succeeds, the transaction will have a new URL matching its new code.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to change
     * @param ChangeTransactionCodeModel model The code change request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel changeTransactionCode(String companyCode, String transactionCode, ChangeTransactionCodeModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/changecode");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Change a transaction's code
     * 
     * Renames a transaction uniquely identified by this URL by changing its code to a new code.
     * After this API call succeeds, the transaction will have a new URL matching its new code.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to change
     * @param ChangeTransactionCodeModel model The code change request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel changeTransactionCodeAsync(String companyCode, String transactionCode, ChangeTransactionCodeModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/changecode");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Commit a transaction for reporting
     * 
     * Marks a transaction by changing its status to 'Committed'.
     * Transactions that are committed are available to be reported to a tax authority by Avalara Managed Returns.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to commit
     * @param CommitTransactionModel model The commit request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel commitTransaction(String companyCode, String transactionCode, CommitTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/commit");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Commit a transaction for reporting
     * 
     * Marks a transaction by changing its status to 'Committed'.
     * Transactions that are committed are available to be reported to a tax authority by Avalara Managed Returns.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to commit
     * @param CommitTransactionModel model The commit request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel commitTransactionAsync(String companyCode, String transactionCode, CommitTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/commit");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Create a new transaction
     * 
     * Records a new transaction or adjust an existing in AvaTax.
     * 
     * The `CreateOrAdjustTransaction` endpoint is used to create a new transaction if the input transaction does not exist
     * or if there exists a transaction identified by code, the original transaction will be adjusted by using the meta data 
     * in the input transaction
     * 
     * If you don't specify type in the provided data, a new transaction with type of SalesOrder will be recorded by default.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param CreateOrAdjustTransactionModel model The transaction you wish to create
     * @return TransactionModel
     */
    public TransactionModel createOrAdjustTransaction(String include, CreateOrAdjustTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/createoradjust");
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Create a new transaction
     * 
     * Records a new transaction or adjust an existing in AvaTax.
     * 
     * The `CreateOrAdjustTransaction` endpoint is used to create a new transaction if the input transaction does not exist
     * or if there exists a transaction identified by code, the original transaction will be adjusted by using the meta data 
     * in the input transaction
     * 
     * If you don't specify type in the provided data, a new transaction with type of SalesOrder will be recorded by default.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param CreateOrAdjustTransactionModel model The transaction you wish to create
     * @return TransactionModel
     */
    public TransactionModel createOrAdjustTransactionAsync(String include, CreateOrAdjustTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/createoradjust");
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Create a new transaction
     * 
     * Records a new transaction in AvaTax.
     * 
     * The `CreateTransaction` endpoint uses the configuration values specified by your company to identify the correct tax rules
     * and rates to apply to all line items in this transaction, and reports the total tax calculated by AvaTax based on your
     * company's configuration and the data provided in this API call.
     * 
     * If you don't specify type in the provided data, a new transaction with type of SalesOrder will be recorded by default.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param CreateTransactionModel model The transaction you wish to create
     * @return TransactionModel
     */
    public TransactionModel createTransaction(String include, CreateTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/create");
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Create a new transaction
     * 
     * Records a new transaction in AvaTax.
     * 
     * The `CreateTransaction` endpoint uses the configuration values specified by your company to identify the correct tax rules
     * and rates to apply to all line items in this transaction, and reports the total tax calculated by AvaTax based on your
     * company's configuration and the data provided in this API call.
     * 
     * If you don't specify type in the provided data, a new transaction with type of SalesOrder will be recorded by default.
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param CreateTransactionModel model The transaction you wish to create
     * @return TransactionModel
     */
    public TransactionModel createTransactionAsync(String include, CreateTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/create");
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Remove lines from an existing unlocked transaction
     * 
     * Remove lines to an existing unlocked transaction.
     * 
     * The `DeleteLines` API allows you to remove transaction lines from existing unlocked transaction, so that customer will
     * be able to delete transaction lines and adjust original transaction the way they like
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param RemoveTransactionLineModel model information about the transaction and lines to be removed
     * @return TransactionModel
     */
    public TransactionModel deleteLines(String include, RemoveTransactionLineModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/delete");
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Remove lines from an existing unlocked transaction
     * 
     * Remove lines to an existing unlocked transaction.
     * 
     * The `DeleteLines` API allows you to remove transaction lines from existing unlocked transaction, so that customer will
     * be able to delete transaction lines and adjust original transaction the way they like
     * 
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param RemoveTransactionLineModel model information about the transaction and lines to be removed
     * @return TransactionModel
     */
    public TransactionModel deleteLinesAsync(String include, RemoveTransactionLineModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/delete");
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve a single transaction by code
     * 
     * Get the current transaction identified by this URL.
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code, and previous revisions of
     * the transaction will be attached to the 'history' data field.
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to retrieve
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return TransactionModel
     */
    public TransactionModel getTransactionByCode(String companyCode, String transactionCode, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve a single transaction by code
     * 
     * Get the current transaction identified by this URL.
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code, and previous revisions of
     * the transaction will be attached to the 'history' data field.
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to retrieve
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return TransactionModel
     */
    public TransactionModel getTransactionByCodeAsync(String companyCode, String transactionCode, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve a single transaction by code
     * 
     * Get the current transaction identified by this URL.
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code, and previous revisions of
     * the transaction will be attached to the 'history' data field.
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to retrieve
     * @param DocumentType documentType The transaction type to retrieve (See DocumentType::* for a list of allowable values)
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return TransactionModel
     */
    public TransactionModel getTransactionByCodeAndType(String companyCode, String transactionCode, DocumentType documentType, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        path.ApplyField("documentType", documentType);
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve a single transaction by code
     * 
     * Get the current transaction identified by this URL.
     * If this transaction was adjusted, the return value of this API will be the current transaction with this code, and previous revisions of
     * the transaction will be attached to the 'history' data field.
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to retrieve
     * @param DocumentType documentType The transaction type to retrieve (See DocumentType::* for a list of allowable values)
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return TransactionModel
     */
    public TransactionModel getTransactionByCodeAndTypeAsync(String companyCode, String transactionCode, DocumentType documentType, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        path.ApplyField("documentType", documentType);
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve a single transaction by ID
     * 
     * Get the unique transaction identified by this URL.
     * This endpoint retrieves the exact transaction identified by this ID number even if that transaction was later adjusted
     * by using the 'Adjust Transaction' endpoint.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * 
     * @param long id The unique ID number of the transaction to retrieve
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return TransactionModel
     */
    public TransactionModel getTransactionById(Int64 id, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/{id}");
        path.ApplyField("id", id);
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve a single transaction by ID
     * 
     * Get the unique transaction identified by this URL.
     * This endpoint retrieves the exact transaction identified by this ID number even if that transaction was later adjusted
     * by using the 'Adjust Transaction' endpoint.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * 
     * @param long id The unique ID number of the transaction to retrieve
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return TransactionModel
     */
    public TransactionModel getTransactionByIdAsync(long id, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/{id}");
        path.ApplyField("id", id);
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Retrieve all transactions
     * 
     * List all transactions attached to this company.
     * This endpoint is limited to returning 1,000 transactions at a time maximum.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<TransactionModel> listTransactionsByCompany(String companyCode, String include, String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions");
        path.ApplyField("companyCode", companyCode);
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TransactionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TransactionModel>>(){})).call();
    }

    /**
     * Retrieve all transactions
     * 
     * List all transactions attached to this company.
     * This endpoint is limited to returning 1,000 transactions at a time maximum.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * Paginate your results using the `$top`, `$skip`, and `$orderby` parameters.
     * You may specify one or more of the following values in the `$include` parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listTransactionsByCompanyAsync(String companyCode, String include, String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions");
        path.ApplyField("companyCode", companyCode);
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<TransactionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<TransactionModel>>(){})).call();
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
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to lock
     * @param LockTransactionModel model The lock request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel lockTransaction(String companyCode, String transactionCode, LockTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/lock");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
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
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to lock
     * @param LockTransactionModel model The lock request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel lockTransactionAsync(String companyCode, String transactionCode, LockTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/lock");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
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
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String companyCode The code of the company that made the original sale
     * @param String transactionCode The transaction code of the original sale
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param RefundTransactionModel model Information about the refund to create
     * @return TransactionModel
     */
    public TransactionModel refundTransaction(String companyCode, String transactionCode, String include, RefundTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/refund");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
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
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * You may specify one or more of the following values in the '$include' parameter to fetch additional nested data, using commas to separate multiple values:
     *             
     * * Lines
     * * Details (implies lines)
     * * Summary (implies details)
     * * Addresses
     *             
     * 
     * @param String companyCode The code of the company that made the original sale
     * @param String transactionCode The transaction code of the original sale
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param RefundTransactionModel model Information about the refund to create
     * @return TransactionModel
     */
    public TransactionModel refundTransactionAsync(String companyCode, String transactionCode, String include, RefundTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/refund");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        path.AddQuery("$include", include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Perform multiple actions on a transaction
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to settle
     * @param SettleTransactionModel model The settle request containing the actions you wish to execute
     * @return TransactionModel
     */
    public TransactionModel settleTransaction(String companyCode, String transactionCode, SettleTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/settle");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Perform multiple actions on a transaction
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to settle
     * @param SettleTransactionModel model The settle request containing the actions you wish to execute
     * @return TransactionModel
     */
    public TransactionModel settleTransactionAsync(String companyCode, String transactionCode, SettleTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/settle");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Verify a transaction
     * 
     * Verifies that the transaction uniquely identified by this URL matches certain expected values.
     * If the transaction does not match these expected values, this API will return an error code indicating which value did not match.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to settle
     * @param VerifyTransactionModel model The settle request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel verifyTransaction(String companyCode, String transactionCode, VerifyTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/verify");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Verify a transaction
     * 
     * Verifies that the transaction uniquely identified by this URL matches certain expected values.
     * If the transaction does not match these expected values, this API will return an error code indicating which value did not match.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to settle
     * @param VerifyTransactionModel model The settle request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel verifyTransactionAsync(String companyCode, String transactionCode, VerifyTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/verify");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Void a transaction
     * 
     * Voids the current transaction uniquely identified by this URL.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * When you void a transaction, that transaction's status is recorded as 'DocVoided'.
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to void
     * @param VoidTransactionModel model The void request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel voidTransaction(String companyCode, String transactionCode, VoidTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/void");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Void a transaction
     * 
     * Voids the current transaction uniquely identified by this URL.
     * A transaction represents a unique potentially taxable action that your company has recorded, and transactions include actions like
     * sales, purchases, inventory transfer, and returns (also called refunds).
     * When you void a transaction, that transaction's status is recorded as 'DocVoided'.
     * 
     * @param String companyCode The company code of the company that recorded this transaction
     * @param String transactionCode The transaction code to void
     * @param VoidTransactionModel model The void request you wish to execute
     * @return TransactionModel
     */
    public TransactionModel voidTransactionAsync(String companyCode, String transactionCode, VoidTransactionModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/void");
        path.ApplyField("companyCode", companyCode);
        path.ApplyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("Post", path, model, new TypeToken<TransactionModel>(){})).call();
    }

    /**
     * Create a new UPC
     * 
     * Create one or more new UPC objects attached to this company.
     * 
     * @param int companyId The ID of the company that owns this UPC.
     * @param UPCModel[] model The UPC you wish to create.
     * @return UPCModel[]
     */
    public List<UPCModel> createUPCs(Int32 companyId, List<UPCModel> model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<UPCModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<UPCModel>>(){})).call();
    }

    /**
     * Create a new UPC
     * 
     * Create one or more new UPC objects attached to this company.
     * 
     * @param int companyId The ID of the company that owns this UPC.
     * @param UPCModel[] model The UPC you wish to create.
     * @return UPCModel[]
     */
    public UPCModel[] createUPCsAsync(int companyId, UPCModel[] model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.ApplyField("companyId", companyId);
        return ((RestCall<List<UPCModel>>)restCallFactory.createRestCall("Post", path, model, new TypeToken<List<UPCModel>>(){})).call();
    }

    /**
     * Delete a single UPC
     * 
     * @param int companyId The ID of the company that owns this UPC.
     * @param int id The ID of the UPC you wish to delete.
     * @return ErrorDetail[]
     */
    public List<ErrorDetail> deleteUPC(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Delete a single UPC
     * 
     * @param int companyId The ID of the company that owns this UPC.
     * @param int id The ID of the UPC you wish to delete.
     * @return ErrorDetail[]
     */
    public ErrorDetail[] deleteUPCAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<List<ErrorDetail>>)restCallFactory.createRestCall("Delete", path, null, new TypeToken<List<ErrorDetail>>(){})).call();
    }

    /**
     * Retrieve a single UPC
     * 
     * Get the UPC object identified by this URL.
     * 
     * @param int companyId The ID of the company that owns this UPC
     * @param int id The primary key of this UPC
     * @return UPCModel
     */
    public UPCModel getUPC(Int32 companyId, Int32 id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<UPCModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<UPCModel>(){})).call();
    }

    /**
     * Retrieve a single UPC
     * 
     * Get the UPC object identified by this URL.
     * 
     * @param int companyId The ID of the company that owns this UPC
     * @param int id The primary key of this UPC
     * @return UPCModel
     */
    public UPCModel getUPCAsync(int companyId, int id)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<UPCModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<UPCModel>(){})).call();
    }

    /**
     * Retrieve UPCs for this company
     * 
     * List all UPC objects attached to this company.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param int companyId The ID of the company that owns these UPCs
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<UPCModel> listUPCsByCompany(Int32 companyId, String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<UPCModel>>(){})).call();
    }

    /**
     * Retrieve UPCs for this company
     * 
     * List all UPC objects attached to this company.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param int companyId The ID of the company that owns these UPCs
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listUPCsByCompanyAsync(int companyId, String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.ApplyField("companyId", companyId);
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<UPCModel>>(){})).call();
    }

    /**
     * Retrieve all UPCs
     * 
     * Get multiple UPC objects across all companies.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<UPCModel> queryUPCs(String filter, String include, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/upcs");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<UPCModel>>(){})).call();
    }

    /**
     * Retrieve all UPCs
     * 
     * Get multiple UPC objects across all companies.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryUPCsAsync(String filter, String include, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/upcs");
        path.AddQuery("$filter", filter);
        path.AddQuery("$include", include);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<UPCModel>>(){})).call();
    }

    /**
     * Update a single UPC
     * 
     * Replace the existing UPC object at this URL with an updated object.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int companyId The ID of the company that this UPC belongs to.
     * @param int id The ID of the UPC you wish to update
     * @param UPCModel model The UPC you wish to update.
     * @return UPCModel
     */
    public UPCModel updateUPC(Int32 companyId, Int32 id, UPCModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<UPCModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<UPCModel>(){})).call();
    }

    /**
     * Update a single UPC
     * 
     * Replace the existing UPC object at this URL with an updated object.
     * A UPC represents a single UPC code in your catalog and matches this product to the tax code identified by this UPC.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int companyId The ID of the company that this UPC belongs to.
     * @param int id The ID of the UPC you wish to update
     * @param UPCModel model The UPC you wish to update.
     * @return UPCModel
     */
    public UPCModel updateUPCAsync(int companyId, int id, UPCModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.ApplyField("companyId", companyId);
        path.ApplyField("id", id);
        return ((RestCall<UPCModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<UPCModel>(){})).call();
    }

    /**
     * Retrieve a single user
     * 
     * Get the user object identified by this URL.
     * 
     * @param int id The ID of the user to retrieve.
     * @param int accountId The accountID of the user you wish to get.
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return UserModel
     */
    public UserModel getUser(Int32 id, Int32 accountId, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.ApplyField("id", id);
        path.ApplyField("accountId", accountId);
        path.AddQuery("$include", include);
        return ((RestCall<UserModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<UserModel>(){})).call();
    }

    /**
     * Retrieve a single user
     * 
     * Get the user object identified by this URL.
     * 
     * @param int id The ID of the user to retrieve.
     * @param int accountId The accountID of the user you wish to get.
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @return UserModel
     */
    public UserModel getUserAsync(int id, int accountId, String include)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.ApplyField("id", id);
        path.ApplyField("accountId", accountId);
        path.AddQuery("$include", include);
        return ((RestCall<UserModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<UserModel>(){})).call();
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
     * @param int id The ID of the user to retrieve.
     * @param int accountId The accountID of the user you wish to get.
     * @return UserEntitlementModel
     */
    public UserEntitlementModel getUserEntitlements(Int32 id, Int32 accountId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}/entitlements");
        path.ApplyField("id", id);
        path.ApplyField("accountId", accountId);
        return ((RestCall<UserEntitlementModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<UserEntitlementModel>(){})).call();
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
     * @param int id The ID of the user to retrieve.
     * @param int accountId The accountID of the user you wish to get.
     * @return UserEntitlementModel
     */
    public UserEntitlementModel getUserEntitlementsAsync(int id, int accountId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}/entitlements");
        path.ApplyField("id", id);
        path.ApplyField("accountId", accountId);
        return ((RestCall<UserEntitlementModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<UserEntitlementModel>(){})).call();
    }

    /**
     * Retrieve users for this account
     * 
     * List all user objects attached to this account.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param int accountId The accountID of the user you wish to list.
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<UserModel> listUsersByAccount(Int32 accountId, String include, String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.ApplyField("accountId", accountId);
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<UserModel>>(){})).call();
    }

    /**
     * Retrieve users for this account
     * 
     * List all user objects attached to this account.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param int accountId The accountID of the user you wish to list.
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult listUsersByAccountAsync(int accountId, String include, String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.ApplyField("accountId", accountId);
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<UserModel>>(){})).call();
    }

    /**
     * Retrieve all users
     * 
     * Get multiple user objects across all accounts.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult<UserModel> queryUsers(String include, String filter, Int32? top, Int32? skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/users");
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<UserModel>>(){})).call();
    }

    /**
     * Retrieve all users
     * 
     * Get multiple user objects across all accounts.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * 
     * Search for specific objects using the criteria in the `$filter` parameter; full documentation is available on [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * 
     * @param String include A comma separated list of child objects to return underneath the primary object.
     * @param String filter A filter statement to identify specific records to retrieve. For more information on filtering, see [Filtering in REST](http://developer.avalara.com/avatax/filtering-in-rest/) .
     * @param Integer top If nonzero, return no more than this number of results. Used with $skip to provide pagination for large datasets.
     * @param Integer skip If nonzero, skip this number of results before returning data. Used with $top to provide pagination for large datasets.
     * @param String orderBy A comma separated list of sort statements in the format `(fieldname) [ASC|DESC]`, for example `id ASC`.
     * @return FetchResult
     */
    public FetchResult queryUsersAsync(String include, String filter, Integer top, Integer skip, String orderBy)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/users");
        path.AddQuery("$include", include);
        path.AddQuery("$filter", filter);
        path.AddQuery("$top", top);
        path.AddQuery("$skip", skip);
        path.AddQuery("$orderBy", orderBy);
        return ((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<UserModel>>(){})).call();
    }

    /**
     * Update a single user
     * 
     * Replace the existing user object at this URL with an updated object.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int id The ID of the user you wish to update.
     * @param int accountId The accountID of the user you wish to update.
     * @param UserModel model The user object you wish to update.
     * @return UserModel
     */
    public UserModel updateUser(Int32 id, Int32 accountId, UserModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.ApplyField("id", id);
        path.ApplyField("accountId", accountId);
        return ((RestCall<UserModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<UserModel>(){})).call();
    }

    /**
     * Update a single user
     * 
     * Replace the existing user object at this URL with an updated object.
     * A user represents one person with access privileges to make API calls and work with a specific account.
     * All data from the existing object will be replaced with data in the object you PUT.  
     * 
     * @param int id The ID of the user you wish to update.
     * @param int accountId The accountID of the user you wish to update.
     * @param UserModel model The user object you wish to update.
     * @return UserModel
     */
    public UserModel updateUserAsync(int id, int accountId, UserModel model)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.ApplyField("id", id);
        path.ApplyField("accountId", accountId);
        return ((RestCall<UserModel>)restCallFactory.createRestCall("Put", path, model, new TypeToken<UserModel>(){})).call();
    }

    /**
     * Checks if the current user is subscribed to a specific service
     * 
     * Returns a subscription object for the current account, or 404 Not Found if this subscription is not enabled for this account.
     * This API call is intended to allow you to identify whether you have the necessary account configuration to access certain
     * 
     * @param ServiceTypeId serviceTypeId The service to check (See ServiceTypeId::* for a list of allowable values)
     * @return SubscriptionModel
     */
    public SubscriptionModel getMySubscription(ServiceTypeId serviceTypeId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions/{serviceTypeId}");
        path.ApplyField("serviceTypeId", serviceTypeId);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<SubscriptionModel>(){})).call();
    }

    /**
     * Checks if the current user is subscribed to a specific service
     * 
     * Returns a subscription object for the current account, or 404 Not Found if this subscription is not enabled for this account.
     * This API call is intended to allow you to identify whether you have the necessary account configuration to access certain
     * 
     * @param ServiceTypeId serviceTypeId The service to check (See ServiceTypeId::* for a list of allowable values)
     * @return SubscriptionModel
     */
    public SubscriptionModel getMySubscriptionAsync(ServiceTypeId serviceTypeId)
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions/{serviceTypeId}");
        path.ApplyField("serviceTypeId", serviceTypeId);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<SubscriptionModel>(){})).call();
    }

    /**
     * List all services to which the current user is subscribed
     * 
     * Returns the list of all subscriptions enabled for the current account.
     * This API is intended to help you determine whether you have the necessary subscription to use certain API calls
     * 
     * @return FetchResult
     */
    public FetchResult<SubscriptionModel> listMySubscriptions()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions");
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
    }

    /**
     * List all services to which the current user is subscribed
     * 
     * Returns the list of all subscriptions enabled for the current account.
     * This API is intended to help you determine whether you have the necessary subscription to use certain API calls
     * 
     * @return FetchResult
     */
    public FetchResult listMySubscriptionsAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions");
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("Get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
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
    public PingResultModel ping()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/ping");
        return ((RestCall<PingResultModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<PingResultModel>(){})).call();
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
    public PingResultModel pingAsync()
    {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/ping");
        return ((RestCall<PingResultModel>)restCallFactory.createRestCall("Get", path, null, new TypeToken<PingResultModel>(){})).call();
    }

//endregion

}
    