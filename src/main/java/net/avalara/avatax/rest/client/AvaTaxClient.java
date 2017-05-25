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


//region Accounts
    /**
     * Reset this account's license key
     */
    public Future<LicenseKeyModel> accountResetLicenseKeyAsync(Integer id, ResetLicenseKeyModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/resetlicensekey");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<LicenseKeyModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<LicenseKeyModel>(){}));
    }

    public LicenseKeyModel accountResetLicenseKey(Integer id, ResetLicenseKeyModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/resetlicensekey");
        path.applyField("id", id);
        return ((RestCall<LicenseKeyModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<LicenseKeyModel>(){})).call();
    }
    
    /**
     * Activate an account by accepting terms and conditions
     */
    public Future<AccountModel> activateAccountAsync(Integer id, ActivateAccountModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/activate");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<AccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AccountModel>(){}));
    }

    public AccountModel activateAccount(Integer id, ActivateAccountModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/activate");
        path.applyField("id", id);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AccountModel>(){})).call();
    }
    
    /**
     * Retrieve a single account
     */
    public Future<AccountModel> getAccountAsync(Integer id, String $include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<AccountModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AccountModel>(){}));
    }

    public AccountModel getAccount(Integer id, String $include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        path.addQuery("$include", $include);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AccountModel>(){})).call();
    }
    
    /**
     * Get configuration settings for this account
     */
    public Future<ArrayList<AccountConfigurationModel>> getAccountConfigurationAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<AccountConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<AccountConfigurationModel>>(){}));
    }

    public ArrayList<AccountConfigurationModel> getAccountConfiguration(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.applyField("id", id);
        return ((RestCall<ArrayList<AccountConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<AccountConfigurationModel>>(){})).call();
    }
    
    /**
     * Change configuration settings for this account
     */
    public Future<ArrayList<AccountConfigurationModel>> setAccountConfigurationAsync(Integer id, ArrayList<AccountConfigurationModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<AccountConfigurationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<AccountConfigurationModel>>(){}));
    }

    public ArrayList<AccountConfigurationModel> setAccountConfiguration(Integer id, ArrayList<AccountConfigurationModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}/configuration");
        path.applyField("id", id);
        return ((RestCall<ArrayList<AccountConfigurationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<AccountConfigurationModel>>(){})).call();
    }
    
//endregion

//region Addresses
    /**
     * Retrieve geolocation information for a specified address
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
     */
    public Future<AddressResolutionModel> resolveAddressPostAsync(AddressValidationInfo model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        return this.threadPool.submit((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AddressResolutionModel>(){}));
    }

    public AddressResolutionModel resolveAddressPost(AddressValidationInfo model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        return ((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AddressResolutionModel>(){})).call();
    }
    
//endregion

//region Batches
    /**
     * Create a new batch
     */
    public Future<ArrayList<BatchModel>> createBatchesAsync(Integer companyId, ArrayList<BatchModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<BatchModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<BatchModel>>(){}));
    }

    public ArrayList<BatchModel> createBatches(Integer companyId, ArrayList<BatchModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<BatchModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<BatchModel>>(){})).call();
    }
    
    /**
     * Delete a single batch
     */
    public Future<ArrayList<ErrorDetail>> deleteBatchAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteBatch(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Download a single batch file
     */
    public Future<HashMap<String, String>> downloadBatchAsync(Integer companyId, Integer batchId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{batchId}/files/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("batchId", batchId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){}));
    }

    public HashMap<String, String> downloadBatch(Integer companyId, Integer batchId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{batchId}/files/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("batchId", batchId);
        path.applyField("id", id);
        return ((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){})).call();
    }
    
    /**
     * Retrieve a single batch
     */
    public Future<BatchModel> getBatchAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<BatchModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<BatchModel>(){}));
    }

    public BatchModel getBatch(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<BatchModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<BatchModel>(){})).call();
    }
    
    /**
     * Retrieve all batches for this company
     */
    public Future<FetchResult<BatchModel>> listBatchesByCompanyAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){}));
    }

    public FetchResult<BatchModel> listBatchesByCompany(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
    }
    
    /**
     * Retrieve all batches
     */
    public Future<FetchResult<BatchModel>> queryBatchesAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/batches");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){}));
    }

    public FetchResult<BatchModel> queryBatches(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/batches");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
    }
    
//endregion

//region Companies
    /**
     * Quick setup for a company with a single physical address
     */
    public Future<CompanyModel> companyInitializeAsync(CompanyInitializationModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/initialize");
        return this.threadPool.submit((RestCall<CompanyModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<CompanyModel>(){}));
    }

    public CompanyModel companyInitialize(CompanyInitializationModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/initialize");
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<CompanyModel>(){})).call();
    }
    
    /**
     * Create new companies
     */
    public Future<ArrayList<CompanyModel>> createCompaniesAsync(ArrayList<CompanyModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        return this.threadPool.submit((RestCall<ArrayList<CompanyModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyModel>>(){}));
    }

    public ArrayList<CompanyModel> createCompanies(ArrayList<CompanyModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        return ((RestCall<ArrayList<CompanyModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyModel>>(){})).call();
    }
    
    /**
     * Request managed returns funding setup for a company
     */
    public Future<FundingStatusModel> createFundingRequestAsync(Integer id, FundingInitiateModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding/setup");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FundingStatusModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FundingStatusModel>(){}));
    }

    public FundingStatusModel createFundingRequest(Integer id, FundingInitiateModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding/setup");
        path.applyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FundingStatusModel>(){})).call();
    }
    
    /**
     * Delete a single company
     */
    public Future<ArrayList<ErrorDetail>> deleteCompanyAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteCompany(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single company
     */
    public Future<CompanyModel> getCompanyAsync(Integer id, String $include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<CompanyModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CompanyModel>(){}));
    }

    public CompanyModel getCompany(Integer id, String $include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        path.addQuery("$include", $include);
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CompanyModel>(){})).call();
    }
    
    /**
     * Get configuration settings for this company
     */
    public Future<ArrayList<CompanyConfigurationModel>> getCompanyConfigurationAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<CompanyConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<CompanyConfigurationModel>>(){}));
    }

    public ArrayList<CompanyConfigurationModel> getCompanyConfiguration(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.applyField("id", id);
        return ((RestCall<ArrayList<CompanyConfigurationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<CompanyConfigurationModel>>(){})).call();
    }
    
    /**
     * Check managed returns funding configuration for a company
     */
    public Future<ArrayList<FundingStatusModel>> listFundingRequestsByCompanyAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<FundingStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<FundingStatusModel>>(){}));
    }

    public ArrayList<FundingStatusModel> listFundingRequestsByCompany(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/funding");
        path.applyField("id", id);
        return ((RestCall<ArrayList<FundingStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<FundingStatusModel>>(){})).call();
    }
    
    /**
     * Retrieve all companies
     */
    public Future<FetchResult<CompanyModel>> queryCompaniesAsync(String $include, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<CompanyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CompanyModel>>(){}));
    }

    public FetchResult<CompanyModel> queryCompanies(String $include, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies");
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<CompanyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<CompanyModel>>(){})).call();
    }
    
    /**
     * Change configuration settings for this account
     */
    public Future<ArrayList<CompanyConfigurationModel>> setCompanyConfigurationAsync(Integer id, ArrayList<CompanyConfigurationModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<CompanyConfigurationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyConfigurationModel>>(){}));
    }

    public ArrayList<CompanyConfigurationModel> setCompanyConfiguration(Integer id, ArrayList<CompanyConfigurationModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}/configuration");
        path.applyField("id", id);
        return ((RestCall<ArrayList<CompanyConfigurationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<CompanyConfigurationModel>>(){})).call();
    }
    
    /**
     * Update a single company
     */
    public Future<CompanyModel> updateCompanyAsync(Integer id, CompanyModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CompanyModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CompanyModel>(){}));
    }

    public CompanyModel updateCompany(Integer id, CompanyModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return ((RestCall<CompanyModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<CompanyModel>(){})).call();
    }
    
//endregion

//region Contacts
    /**
     * Create a new contact
     */
    public Future<ArrayList<ContactModel>> createContactsAsync(Integer companyId, ArrayList<ContactModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<ContactModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<ContactModel>>(){}));
    }

    public ArrayList<ContactModel> createContacts(Integer companyId, ArrayList<ContactModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<ContactModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<ContactModel>>(){})).call();
    }
    
    /**
     * Delete a single contact
     */
    public Future<ArrayList<ErrorDetail>> deleteContactAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteContact(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single contact
     */
    public Future<ContactModel> getContactAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ContactModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ContactModel>(){}));
    }

    public ContactModel getContact(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ContactModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ContactModel>(){})).call();
    }
    
    /**
     * Retrieve contacts for this company
     */
    public Future<FetchResult<ContactModel>> listContactsByCompanyAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){}));
    }

    public FetchResult<ContactModel> listContactsByCompany(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){})).call();
    }
    
    /**
     * Retrieve all contacts
     */
    public Future<FetchResult<ContactModel>> queryContactsAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/contacts");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){}));
    }

    public FetchResult<ContactModel> queryContacts(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/contacts");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){})).call();
    }
    
    /**
     * Update a single contact
     */
    public Future<ContactModel> updateContactAsync(Integer companyId, Integer id, ContactModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ContactModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ContactModel>(){}));
    }

    public ContactModel updateContact(Integer companyId, Integer id, ContactModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ContactModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ContactModel>(){})).call();
    }
    
//endregion

//region Definitions
    /**
     * Retrieve the full list of Avalara-supported nexus for a country and region.
     */
    public Future<FetchResult<NexusModel>> definitionsNexusByCountryByRegionGetAsync(String country, String region) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}/{region}");
        path.applyField("country", country);
        path.applyField("region", region);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    public FetchResult<NexusModel> definitionsNexusByCountryByRegionGet(String country, String region) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}/{region}");
        path.applyField("country", country);
        path.applyField("region", region);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported nexus for a country.
     */
    public Future<FetchResult<NexusModel>> definitionsNexusByCountryGetAsync(String country) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}");
        path.applyField("country", country);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    public FetchResult<NexusModel> definitionsNexusByCountryGet(String country) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/{country}");
        path.applyField("country", country);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported nexus for all countries and regions.
     */
    public Future<FetchResult<NexusModel>> definitionsNexusGetAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus");
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    public FetchResult<NexusModel> definitionsNexusGet() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus");
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }
    
    /**
     * Test whether a form supports online login verification
     */
    public Future<FetchResult<SkyscraperStatusModel>> getLoginVerifierByFormAsync(String form) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers/{form}");
        path.applyField("form", form);
        return this.threadPool.submit((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){}));
    }

    public FetchResult<SkyscraperStatusModel> getLoginVerifierByForm(String form) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers/{form}");
        path.applyField("form", form);
        return ((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of the AvaFile Forms available
     */
    public Future<FetchResult<AvaFileFormModel>> listAvaFileFormsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/avafileforms");
        return this.threadPool.submit((RestCall<FetchResult<AvaFileFormModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<AvaFileFormModel>>(){}));
    }

    public FetchResult<AvaFileFormModel> listAvaFileForms() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/avafileforms");
        return ((RestCall<FetchResult<AvaFileFormModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<AvaFileFormModel>>(){})).call();
    }
    
    /**
     * List all ISO 3166 countries
     */
    public Future<FetchResult<IsoCountryModel>> listCountriesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries");
        return this.threadPool.submit((RestCall<FetchResult<IsoCountryModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoCountryModel>>(){}));
    }

    public FetchResult<IsoCountryModel> listCountries() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries");
        return ((RestCall<FetchResult<IsoCountryModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoCountryModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported entity use codes
     */
    public Future<FetchResult<EntityUseCodeModel>> listEntityUseCodesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/entityusecodes");
        return this.threadPool.submit((RestCall<FetchResult<EntityUseCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<EntityUseCodeModel>>(){}));
    }

    public FetchResult<EntityUseCodeModel> listEntityUseCodes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/entityusecodes");
        return ((RestCall<FetchResult<EntityUseCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<EntityUseCodeModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported filing frequencies.
     */
    public Future<FetchResult<FilingFrequencyModel>> listFilingFrequenciesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingfrequencies");
        return this.threadPool.submit((RestCall<FetchResult<FilingFrequencyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingFrequencyModel>>(){}));
    }

    public FetchResult<FilingFrequencyModel> listFilingFrequencies() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingfrequencies");
        return ((RestCall<FetchResult<FilingFrequencyModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingFrequencyModel>>(){})).call();
    }
    
    /**
     * List jurisdictions near a specific address
     */
    public Future<FetchResult<JurisdictionOverrideModel>> listJurisdictionsByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/jurisdictionsnearaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        return this.threadPool.submit((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){}));
    }

    public FetchResult<JurisdictionOverrideModel> listJurisdictionsByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/jurisdictionsnearaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
    }
    
    /**
     * Retrieve the list of questions that are required for a tax location
     */
    public Future<FetchResult<LocationQuestionModel>> listLocationQuestionsByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country, BigDecimal latitude, BigDecimal longitude) {
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
        return this.threadPool.submit((RestCall<FetchResult<LocationQuestionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationQuestionModel>>(){}));
    }

    public FetchResult<LocationQuestionModel> listLocationQuestionsByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country, BigDecimal latitude, BigDecimal longitude) throws Exception {
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
        return ((RestCall<FetchResult<LocationQuestionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationQuestionModel>>(){})).call();
    }
    
    /**
     * List all forms where logins can be verified automatically
     */
    public Future<FetchResult<SkyscraperStatusModel>> listLoginVerifiersAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers");
        return this.threadPool.submit((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){}));
    }

    public FetchResult<SkyscraperStatusModel> listLoginVerifiers() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/filingcalendars/loginverifiers");
        return ((RestCall<FetchResult<SkyscraperStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SkyscraperStatusModel>>(){})).call();
    }
    
    /**
     * List all nexus that apply to a specific address.
     */
    public Future<FetchResult<NexusModel>> listNexusByAddressAsync(String line1, String line2, String line3, String city, String region, String postalCode, String country) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    public FetchResult<NexusModel> listNexusByAddress(String line1, String line2, String line3, String city, String region, String postalCode, String country) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byaddress");
        path.addQuery("line1", line1);
        path.addQuery("line2", line2);
        path.addQuery("line3", line3);
        path.addQuery("city", city);
        path.addQuery("region", region);
        path.addQuery("postalCode", postalCode);
        path.addQuery("country", country);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }
    
    /**
     * List nexus related to a tax form
     */
    public Future<NexusByTaxFormModel> listNexusByFormCodeAsync(String formCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byform/{formCode}");
        path.applyField("formCode", formCode);
        return this.threadPool.submit((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusByTaxFormModel>(){}));
    }

    public NexusByTaxFormModel listNexusByFormCode(String formCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexus/byform/{formCode}");
        path.applyField("formCode", formCode);
        return ((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusByTaxFormModel>(){})).call();
    }
    
    /**
     * Retrieve the full list of nexus tax type groups
     */
    public Future<FetchResult<NexusTaxTypeGroupModel>> listNexusTaxTypeGroupsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexustaxtypegroups");
        return this.threadPool.submit((RestCall<FetchResult<NexusTaxTypeGroupModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusTaxTypeGroupModel>>(){}));
    }

    public FetchResult<NexusTaxTypeGroupModel> listNexusTaxTypeGroups() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/nexustaxtypegroups");
        return ((RestCall<FetchResult<NexusTaxTypeGroupModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusTaxTypeGroupModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax notice customer funding options.
     */
    public Future<FetchResult<NoticeCustomerFundingOptionModel>> listNoticeCustomerFundingOptionsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomerfundingoptions");
        return this.threadPool.submit((RestCall<FetchResult<NoticeCustomerFundingOptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCustomerFundingOptionModel>>(){}));
    }

    public FetchResult<NoticeCustomerFundingOptionModel> listNoticeCustomerFundingOptions() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomerfundingoptions");
        return ((RestCall<FetchResult<NoticeCustomerFundingOptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCustomerFundingOptionModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax notice customer types.
     */
    public Future<FetchResult<NoticeCustomerTypeModel>> listNoticeCustomerTypesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomertypes");
        return this.threadPool.submit((RestCall<FetchResult<NoticeCustomerTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCustomerTypeModel>>(){}));
    }

    public FetchResult<NoticeCustomerTypeModel> listNoticeCustomerTypes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticecustomertypes");
        return ((RestCall<FetchResult<NoticeCustomerTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCustomerTypeModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax notice filing types.
     */
    public Future<FetchResult<NoticeFilingTypeModel>> listNoticeFilingtypesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticefilingtypes");
        return this.threadPool.submit((RestCall<FetchResult<NoticeFilingTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeFilingTypeModel>>(){}));
    }

    public FetchResult<NoticeFilingTypeModel> listNoticeFilingtypes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticefilingtypes");
        return ((RestCall<FetchResult<NoticeFilingTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeFilingTypeModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax notice priorities.
     */
    public Future<FetchResult<NoticePriorityModel>> listNoticePrioritiesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticepriorities");
        return this.threadPool.submit((RestCall<FetchResult<NoticePriorityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticePriorityModel>>(){}));
    }

    public FetchResult<NoticePriorityModel> listNoticePriorities() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticepriorities");
        return ((RestCall<FetchResult<NoticePriorityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticePriorityModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax notice reasons.
     */
    public Future<FetchResult<NoticeReasonModel>> listNoticeReasonsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticereasons");
        return this.threadPool.submit((RestCall<FetchResult<NoticeReasonModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeReasonModel>>(){}));
    }

    public FetchResult<NoticeReasonModel> listNoticeReasons() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticereasons");
        return ((RestCall<FetchResult<NoticeReasonModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeReasonModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax notice responsibility ids
     */
    public Future<FetchResult<NoticeResponsibilityModel>> listNoticeResponsibilitiesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticeresponsibilities");
        return this.threadPool.submit((RestCall<FetchResult<NoticeResponsibilityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeResponsibilityModel>>(){}));
    }

    public FetchResult<NoticeResponsibilityModel> listNoticeResponsibilities() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticeresponsibilities");
        return ((RestCall<FetchResult<NoticeResponsibilityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeResponsibilityModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax notice root causes
     */
    public Future<FetchResult<NoticeRootCauseModel>> listNoticeRootCausesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticerootcauses");
        return this.threadPool.submit((RestCall<FetchResult<NoticeRootCauseModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeRootCauseModel>>(){}));
    }

    public FetchResult<NoticeRootCauseModel> listNoticeRootCauses() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticerootcauses");
        return ((RestCall<FetchResult<NoticeRootCauseModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeRootCauseModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax notice statuses.
     */
    public Future<FetchResult<NoticeStatusModel>> listNoticeStatusesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticestatuses");
        return this.threadPool.submit((RestCall<FetchResult<NoticeStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeStatusModel>>(){}));
    }

    public FetchResult<NoticeStatusModel> listNoticeStatuses() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticestatuses");
        return ((RestCall<FetchResult<NoticeStatusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeStatusModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax notice types.
     */
    public Future<FetchResult<NoticeTypeModel>> listNoticeTypesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticetypes");
        return this.threadPool.submit((RestCall<FetchResult<NoticeTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeTypeModel>>(){}));
    }

    public FetchResult<NoticeTypeModel> listNoticeTypes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/noticetypes");
        return ((RestCall<FetchResult<NoticeTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeTypeModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported extra parameters for creating transactions.
     */
    public Future<FetchResult<ParameterModel>> listParametersAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/parameters");
        return this.threadPool.submit((RestCall<FetchResult<ParameterModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ParameterModel>>(){}));
    }

    public FetchResult<ParameterModel> listParameters() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/parameters");
        return ((RestCall<FetchResult<ParameterModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ParameterModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported permissions
     */
    public Future<FetchResult<String>> listPermissionsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/permissions");
        return this.threadPool.submit((RestCall<FetchResult<String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<String>>(){}));
    }

    public FetchResult<String> listPermissions() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/permissions");
        return ((RestCall<FetchResult<String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<String>>(){})).call();
    }
    
    /**
     * Retrieve the full list of rate types for each country
     */
    public Future<FetchResult<RateTypeModel>> listRateTypesByCountryAsync(String country) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/ratetypes");
        path.applyField("country", country);
        return this.threadPool.submit((RestCall<FetchResult<RateTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<RateTypeModel>>(){}));
    }

    public FetchResult<RateTypeModel> listRateTypesByCountry(String country) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/ratetypes");
        path.applyField("country", country);
        return ((RestCall<FetchResult<RateTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<RateTypeModel>>(){})).call();
    }
    
    /**
     * List all ISO 3166 regions
     */
    public Future<FetchResult<IsoRegionModel>> listRegionsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/regions");
        return this.threadPool.submit((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){}));
    }

    public FetchResult<IsoRegionModel> listRegions() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/regions");
        return ((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){})).call();
    }
    
    /**
     * List all ISO 3166 regions for a country
     */
    public Future<FetchResult<IsoRegionModel>> listRegionsByCountryAsync(String country) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/regions");
        path.applyField("country", country);
        return this.threadPool.submit((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){}));
    }

    public FetchResult<IsoRegionModel> listRegionsByCountry(String country) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/countries/{country}/regions");
        path.applyField("country", country);
        return ((RestCall<FetchResult<IsoRegionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<IsoRegionModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported resource file types
     */
    public Future<FetchResult<ResourceFileTypeModel>> listResourceFileTypesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/resourcefiletypes");
        return this.threadPool.submit((RestCall<FetchResult<ResourceFileTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ResourceFileTypeModel>>(){}));
    }

    public FetchResult<ResourceFileTypeModel> listResourceFileTypes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/resourcefiletypes");
        return ((RestCall<FetchResult<ResourceFileTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ResourceFileTypeModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported permissions
     */
    public Future<FetchResult<SecurityRoleModel>> listSecurityRolesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/securityroles");
        return this.threadPool.submit((RestCall<FetchResult<SecurityRoleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SecurityRoleModel>>(){}));
    }

    public FetchResult<SecurityRoleModel> listSecurityRoles() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/securityroles");
        return ((RestCall<FetchResult<SecurityRoleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SecurityRoleModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported subscription types
     */
    public Future<FetchResult<SubscriptionTypeModel>> listSubscriptionTypesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/subscriptiontypes");
        return this.threadPool.submit((RestCall<FetchResult<SubscriptionTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionTypeModel>>(){}));
    }

    public FetchResult<SubscriptionTypeModel> listSubscriptionTypes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/subscriptiontypes");
        return ((RestCall<FetchResult<SubscriptionTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionTypeModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax authorities.
     */
    public Future<FetchResult<TaxAuthorityModel>> listTaxAuthoritiesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorities");
        return this.threadPool.submit((RestCall<FetchResult<TaxAuthorityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityModel>>(){}));
    }

    public FetchResult<TaxAuthorityModel> listTaxAuthorities() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorities");
        return ((RestCall<FetchResult<TaxAuthorityModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported forms for each tax authority.
     */
    public Future<FetchResult<TaxAuthorityFormModel>> listTaxAuthorityFormsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorityforms");
        return this.threadPool.submit((RestCall<FetchResult<TaxAuthorityFormModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityFormModel>>(){}));
    }

    public FetchResult<TaxAuthorityFormModel> listTaxAuthorityForms() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthorityforms");
        return ((RestCall<FetchResult<TaxAuthorityFormModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityFormModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax authority types.
     */
    public Future<FetchResult<TaxAuthorityTypeModel>> listTaxAuthorityTypesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthoritytypes");
        return this.threadPool.submit((RestCall<FetchResult<TaxAuthorityTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityTypeModel>>(){}));
    }

    public FetchResult<TaxAuthorityTypeModel> listTaxAuthorityTypes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxauthoritytypes");
        return ((RestCall<FetchResult<TaxAuthorityTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxAuthorityTypeModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax code types.
     */
    public Future<TaxCodeTypesModel> listTaxCodeTypesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodetypes");
        return this.threadPool.submit((RestCall<TaxCodeTypesModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxCodeTypesModel>(){}));
    }

    public TaxCodeTypesModel listTaxCodeTypes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodetypes");
        return ((RestCall<TaxCodeTypesModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxCodeTypesModel>(){})).call();
    }
    
    /**
     * Retrieve the full list of Avalara-supported tax codes.
     */
    public Future<FetchResult<TaxCodeModel>> listTaxCodesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodes");
        return this.threadPool.submit((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){}));
    }

    public FetchResult<TaxCodeModel> listTaxCodes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxcodes");
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of tax sub types
     */
    public Future<FetchResult<TaxSubTypeModel>> listTaxSubTypesAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxsubtypes");
        return this.threadPool.submit((RestCall<FetchResult<TaxSubTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxSubTypeModel>>(){}));
    }

    public FetchResult<TaxSubTypeModel> listTaxSubTypes() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxsubtypes");
        return ((RestCall<FetchResult<TaxSubTypeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxSubTypeModel>>(){})).call();
    }
    
    /**
     * Retrieve the full list of tax type groups
     */
    public Future<FetchResult<TaxTypeGroupModel>> listTaxTypeGroupsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxtypegroups");
        return this.threadPool.submit((RestCall<FetchResult<TaxTypeGroupModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxTypeGroupModel>>(){}));
    }

    public FetchResult<TaxTypeGroupModel> listTaxTypeGroups() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/definitions/taxtypegroups");
        return ((RestCall<FetchResult<TaxTypeGroupModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxTypeGroupModel>>(){})).call();
    }
    
//endregion

//region FilingCalendars
    /**
     * Retrieve a single filing calendar
     */
    public Future<FilingCalendarModel> companiesByCompanyIdFilingcalendarsByIdGetAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingCalendarModel>(){}));
    }

    public FilingCalendarModel companiesByCompanyIdFilingcalendarsByIdGet(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingCalendarModel>(){})).call();
    }
    
    /**
     * Retrieve all filing calendars for this company
     */
    public Future<FetchResult<FilingCalendarModel>> companiesByCompanyIdFilingcalendarsGetAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){}));
    }

    public FetchResult<FilingCalendarModel> companiesByCompanyIdFilingcalendarsGet(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){})).call();
    }
    
    /**
     * Retrieve all filing requests for this company
     */
    public Future<FetchResult<FilingRequestModel>> companiesByCompanyIdFilingrequestsGetAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){}));
    }

    public FetchResult<FilingRequestModel> companiesByCompanyIdFilingrequestsGet(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){})).call();
    }
    
    /**
     * Returns a list of options for adding the specified form.
     */
    public Future<ArrayList<CycleAddOptionModel>> cycleSafeAddAsync(Integer companyId, String formCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/options");
        path.applyField("companyId", companyId);
        path.addQuery("formCode", formCode);
        return this.threadPool.submit((RestCall<ArrayList<CycleAddOptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<CycleAddOptionModel>>(){}));
    }

    public ArrayList<CycleAddOptionModel> cycleSafeAdd(Integer companyId, String formCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/options");
        path.applyField("companyId", companyId);
        path.addQuery("formCode", formCode);
        return ((RestCall<ArrayList<CycleAddOptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<ArrayList<CycleAddOptionModel>>(){})).call();
    }
    
    /**
     * Indicates when changes are allowed to be made to a filing calendar.
     */
    public Future<CycleEditOptionModel> cycleSafeEditAsync(Integer companyId, Integer id, ArrayList<FilingCalendarEditModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/options");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CycleEditOptionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<CycleEditOptionModel>(){}));
    }

    public CycleEditOptionModel cycleSafeEdit(Integer companyId, Integer id, ArrayList<FilingCalendarEditModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/options");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<CycleEditOptionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<CycleEditOptionModel>(){})).call();
    }
    
    /**
     * Returns a list of options for expiring a filing calendar
     */
    public Future<CycleExpireModel> cycleSafeExpirationAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/options");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<CycleExpireModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CycleExpireModel>(){}));
    }

    public CycleExpireModel cycleSafeExpiration(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/options");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<CycleExpireModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<CycleExpireModel>(){})).call();
    }
    
    /**
     * Delete a single filing calendar.
     */
    public Future<ArrayList<ErrorDetail>> deleteFilingCalendarAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteFilingCalendar(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Edit existing Filing Calendar's Notes
     */
    public Future<FilingCalendarModel> filingCalendarUpdateAsync(Integer companyId, Integer id, FilingCalendarModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingCalendarModel>(){}));
    }

    public FilingCalendarModel filingCalendarUpdate(Integer companyId, Integer id, FilingCalendarModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingCalendarModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingCalendarModel>(){})).call();
    }
    
    /**
     * Create a new filing request to create a filing calendar
     */
    public Future<FilingRequestModel> filingRequestsAddAsync(Integer companyId, ArrayList<FilingRequestModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/request");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){}));
    }

    public FilingRequestModel filingRequestsAdd(Integer companyId, ArrayList<FilingRequestModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/add/request");
        path.applyField("companyId", companyId);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }
    
    /**
     * Approve existing Filing Request
     */
    public Future<FilingRequestModel> filingRequestsApproveAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/approve");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<FilingRequestModel>(){}));
    }

    public FilingRequestModel filingRequestsApprove(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/approve");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }
    
    /**
     * Cancel existing Filing Request
     */
    public Future<FilingRequestModel> filingRequestsCancelAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/cancel");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<FilingRequestModel>(){}));
    }

    public FilingRequestModel filingRequestsCancel(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}/cancel");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }
    
    /**
     * Create a new filing request to cancel a filing calendar
     */
    public Future<FilingRequestModel> filingRequestsNewCancelAsync(Integer companyId, Integer id, ArrayList<FilingRequestModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/request");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){}));
    }

    public FilingRequestModel filingRequestsNewCancel(Integer companyId, Integer id, ArrayList<FilingRequestModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/cancel/request");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }
    
    /**
     * Create a new filing request to edit a filing calendar
     */
    public Future<FilingRequestModel> filingRequestsNewEditAsync(Integer companyId, Integer id, ArrayList<FilingRequestModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/request");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){}));
    }

    public FilingRequestModel filingRequestsNewEdit(Integer companyId, Integer id, ArrayList<FilingRequestModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingcalendars/{id}/edit/request");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }
    
    /**
     * Edit existing Filing Request
     */
    public Future<FilingRequestModel> filingRequestsUpdateAsync(Integer companyId, Integer id, FilingRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingRequestModel>(){}));
    }

    public FilingRequestModel filingRequestsUpdate(Integer companyId, Integer id, FilingRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingRequestModel>(){})).call();
    }
    
    /**
     * Retrieve all filing calendars
     */
    public Future<FetchResult<FilingCalendarModel>> queryFilingCalendarsAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){}));
    }

    public FetchResult<FilingCalendarModel> queryFilingCalendars(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<FilingCalendarModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingCalendarModel>>(){})).call();
    }
    
    /**
     * Retrieve all filing requests
     */
    public Future<FetchResult<FilingRequestModel>> queryFilingRequestsAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingrequests");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){}));
    }

    public FetchResult<FilingRequestModel> queryFilingRequests(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingrequests");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<FilingRequestModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingRequestModel>>(){})).call();
    }
    
    /**
     * Retrieve a single filing request
     */
    public Future<FilingRequestModel> filingRequestsAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingRequestModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingRequestModel>(){}));
    }

    public FilingRequestModel filingRequests(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filingrequests/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingRequestModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingRequestModel>(){})).call();
    }
    
    /**
     * Gets the request status and Login Result
     */
    public Future<LoginVerificationOutputModel> loginVerificationGetAsync(Integer jobId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/{jobId}");
        path.applyField("jobId", jobId);
        return this.threadPool.submit((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LoginVerificationOutputModel>(){}));
    }

    public LoginVerificationOutputModel loginVerificationGet(Integer jobId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/{jobId}");
        path.applyField("jobId", jobId);
        return ((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LoginVerificationOutputModel>(){})).call();
    }
    
    /**
     * New request for getting for validating customer's login credentials
     */
    public Future<LoginVerificationOutputModel> loginVerificationPostAsync(LoginVerificationInputModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/verify");
        return this.threadPool.submit((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<LoginVerificationOutputModel>(){}));
    }

    public LoginVerificationOutputModel loginVerificationPost(LoginVerificationInputModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/filingcalendars/credentials/verify");
        return ((RestCall<LoginVerificationOutputModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<LoginVerificationOutputModel>(){})).call();
    }
    
//endregion

//region Filings
    /**
     * Approve all filings for the specified company in the given filing period.
     */
    public Future<ArrayList<FilingModel>> approveFilingsAsync(Integer companyId, Short year, Byte month, ApproveFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){}));
    }

    public ArrayList<FilingModel> approveFilings(Integer companyId, Short year, Byte month, ApproveFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){})).call();
    }
    
    /**
     * Approve all filings for the specified company in the given filing period and country.
     */
    public Future<ArrayList<FilingModel>> approveFilingsCountryAsync(Integer companyId, Short year, Byte month, String country, ApproveFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return this.threadPool.submit((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){}));
    }

    public ArrayList<FilingModel> approveFilingsCountry(Integer companyId, Short year, Byte month, String country, ApproveFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/approve");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return ((RestCall<ArrayList<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<FilingModel>>(){})).call();
    }
    
    /**
     * Approve all filings for the specified company in the given filing period, country and region.
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
     * Add an adjustment to a given filing.
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
     * Add an augmentation for a given filing.
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
     * Delete an adjustment for a given filing.
     */
    public Future<ArrayList<ErrorDetail>> deleteReturnAdjustmentAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteReturnAdjustment(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Delete an augmentation for a given filing.
     */
    public Future<ArrayList<ErrorDetail>> deleteReturnAugmentationAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteReturnAugmentation(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve worksheet checkup report for company and filing period.
     */
    public Future<FilingsCheckupModel> filingsCheckupReportAsync(Integer worksheetId, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{worksheetId}/checkup");
        path.applyField("worksheetId", worksheetId);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingsCheckupModel>(){}));
    }

    public FilingsCheckupModel filingsCheckupReport(Integer worksheetId, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{worksheetId}/checkup");
        path.applyField("worksheetId", worksheetId);
        path.applyField("companyId", companyId);
        return ((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingsCheckupModel>(){})).call();
    }
    
    /**
     * Retrieve worksheet checkup report for company and filing period.
     */
    public Future<FilingsCheckupModel> filingsCheckupReportsAsync(Integer companyId, Integer year, Integer month) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/checkup");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingsCheckupModel>(){}));
    }

    public FilingsCheckupModel filingsCheckupReports(Integer companyId, Integer year, Integer month) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/checkup");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<FilingsCheckupModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FilingsCheckupModel>(){})).call();
    }
    
    /**
     * Retrieve a single attachment for a filing
     */
    public Future<HashMap<String, String>> getFilingAttachmentAsync(Integer companyId, Long filingId, Long fileId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{filingId}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("filingId", filingId);
        path.addQuery("fileId", fileId);
        return this.threadPool.submit((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){}));
    }

    public HashMap<String, String> getFilingAttachment(Integer companyId, Long filingId, Long fileId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{filingId}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("filingId", filingId);
        path.addQuery("fileId", fileId);
        return ((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){})).call();
    }
    
    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     */
    public Future<HashMap<String, String>> getFilingAttachmentsAsync(Integer companyId, Short year, Byte month) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){}));
    }

    public HashMap<String, String> getFilingAttachments(Integer companyId, Short year, Byte month) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){})).call();
    }
    
    /**
     * Retrieve a single trace file for a company filing period
     */
    public Future<HashMap<String, String>> getFilingAttachmentsTraceFileAsync(Integer companyId, Short year, Byte month) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments/tracefile");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){}));
    }

    public HashMap<String, String> getFilingAttachmentsTraceFile(Integer companyId, Short year, Byte month) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/attachments/tracefile");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){})).call();
    }
    
    /**
     * Retrieve a list of filings for the specified company in the year and month of a given filing period.
     */
    public Future<FetchResult<FilingModel>> getFilingsAsync(Integer companyId, Short year, Byte month) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    public FetchResult<FilingModel> getFilings(Integer companyId, Short year, Byte month) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }
    
    /**
     * Retrieve a list of filings for the specified company in the given filing period and country.
     */
    public Future<FetchResult<FilingModel>> getFilingsByCountryAsync(Integer companyId, Short year, Byte month, String country) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    public FetchResult<FilingModel> getFilingsByCountry(Integer companyId, Short year, Byte month, String country) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }
    
    /**
     * Retrieve a list of filings for the specified company in the filing period, country and region.
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
     * Retrieve a list of filings for the specified company in the given filing period, country, region and form.
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
     * Rebuild a set of filings for the specified company in the given filing period.
     */
    public Future<FetchResult<FilingModel>> rebuildFilingsAsync(Integer companyId, Short year, Byte month, RebuildFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    public FetchResult<FilingModel> rebuildFilings(Integer companyId, Short year, Byte month, RebuildFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }
    
    /**
     * Rebuild a set of filings for the specified company in the given filing period and country.
     */
    public Future<FetchResult<FilingModel>> rebuildFilingsByCountryAsync(Integer companyId, Short year, Byte month, String country, RebuildFilingsModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return this.threadPool.submit((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){}));
    }

    public FetchResult<FilingModel> rebuildFilingsByCountry(Integer companyId, Short year, Byte month, String country, RebuildFilingsModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/{year}/{month}/{country}/rebuild");
        path.applyField("companyId", companyId);
        path.applyField("year", year);
        path.applyField("month", month);
        path.applyField("country", country);
        return ((RestCall<FetchResult<FilingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<FetchResult<FilingModel>>(){})).call();
    }
    
    /**
     * Rebuild a set of filings for the specified company in the given filing period, country and region.
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
     * Edit an adjustment for a given filing.
     */
    public Future<FilingAdjustmentModel> updateReturnAdjustmentAsync(Integer companyId, Long id, FilingAdjustmentModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingAdjustmentModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingAdjustmentModel>(){}));
    }

    public FilingAdjustmentModel updateReturnAdjustment(Integer companyId, Long id, FilingAdjustmentModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/adjust/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingAdjustmentModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingAdjustmentModel>(){})).call();
    }
    
    /**
     * Edit an augmentation for a given filing.
     */
    public Future<FilingModel> updateReturnAugmentationAsync(Integer companyId, Long id, FilingAugmentationModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FilingModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingModel>(){}));
    }

    public FilingModel updateReturnAugmentation(Integer companyId, Long id, FilingAugmentationModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/filings/augment/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<FilingModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<FilingModel>(){})).call();
    }
    
//endregion

//region Free
    /**
     * FREE API - Request a free trial of AvaTax
     */
    public Future<NewAccountModel> requestFreeTrialAsync(FreeTrialRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/freetrials/request");
        return this.threadPool.submit((RestCall<NewAccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<NewAccountModel>(){}));
    }

    public NewAccountModel requestFreeTrial(FreeTrialRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/freetrials/request");
        return ((RestCall<NewAccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<NewAccountModel>(){})).call();
    }
    
    /**
     * FREE API - Sales tax rates for a specified address
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
     * FREE API - Sales tax rates for a specified country and postal code
     */
    public Future<TaxRateModel> taxRatesByPostalCodeAsync(String country, String postalCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/bypostalcode");
        path.addQuery("country", country);
        path.addQuery("postalCode", postalCode);
        return this.threadPool.submit((RestCall<TaxRateModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRateModel>(){}));
    }

    public TaxRateModel taxRatesByPostalCode(String country, String postalCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrates/bypostalcode");
        path.addQuery("country", country);
        path.addQuery("postalCode", postalCode);
        return ((RestCall<TaxRateModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRateModel>(){})).call();
    }
    
//endregion

//region FundingRequests
    /**
     * Request the javascript for a funding setup widget
     */
    public Future<FundingStatusModel> activateFundingRequestAsync(Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}/widget");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FundingStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingStatusModel>(){}));
    }

    public FundingStatusModel activateFundingRequest(Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}/widget");
        path.applyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingStatusModel>(){})).call();
    }
    
    /**
     * Retrieve status about a funding setup request
     */
    public Future<FundingStatusModel> fundingRequestStatusAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<FundingStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingStatusModel>(){}));
    }

    public FundingStatusModel fundingRequestStatus(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/fundingrequests/{id}");
        path.applyField("id", id);
        return ((RestCall<FundingStatusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<FundingStatusModel>(){})).call();
    }
    
//endregion

//region Items
    /**
     * Create a new item
     */
    public Future<ArrayList<ItemModel>> createItemsAsync(Integer companyId, ArrayList<ItemModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<ItemModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<ItemModel>>(){}));
    }

    public ArrayList<ItemModel> createItems(Integer companyId, ArrayList<ItemModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<ItemModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<ItemModel>>(){})).call();
    }
    
    /**
     * Delete a single item
     */
    public Future<ArrayList<ErrorDetail>> deleteItemAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteItem(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single item
     */
    public Future<ItemModel> getItemAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ItemModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ItemModel>(){}));
    }

    public ItemModel getItem(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ItemModel>(){})).call();
    }
    
    /**
     * Retrieve items for this company
     */
    public Future<FetchResult<ItemModel>> listItemsByCompanyAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){}));
    }

    public FetchResult<ItemModel> listItemsByCompany(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }
    
    /**
     * Retrieve all items
     */
    public Future<FetchResult<ItemModel>> queryItemsAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/items");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){}));
    }

    public FetchResult<ItemModel> queryItems(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/items");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }
    
    /**
     * Update a single item
     */
    public Future<ItemModel> updateItemAsync(Integer companyId, Long id, ItemModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ItemModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ItemModel>(){}));
    }

    public ItemModel updateItem(Integer companyId, Long id, ItemModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ItemModel>(){})).call();
    }
    
//endregion

//region JurisdictionOverrides
    /**
     * Create one or more overrides
     */
    public Future<ArrayList<JurisdictionOverrideModel>> createJurisdictionOverridesAsync(Integer accountId, ArrayList<JurisdictionOverrideModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<ArrayList<JurisdictionOverrideModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<JurisdictionOverrideModel>>(){}));
    }

    public ArrayList<JurisdictionOverrideModel> createJurisdictionOverrides(Integer accountId, ArrayList<JurisdictionOverrideModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.applyField("accountId", accountId);
        return ((RestCall<ArrayList<JurisdictionOverrideModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<JurisdictionOverrideModel>>(){})).call();
    }
    
    /**
     * Delete a single override
     */
    public Future<ArrayList<ErrorDetail>> deleteJurisdictionOverrideAsync(Integer accountId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteJurisdictionOverride(Integer accountId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single override
     */
    public Future<JurisdictionOverrideModel> getJurisdictionOverrideAsync(Integer accountId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<JurisdictionOverrideModel>(){}));
    }

    public JurisdictionOverrideModel getJurisdictionOverride(Integer accountId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<JurisdictionOverrideModel>(){})).call();
    }
    
    /**
     * Retrieve overrides for this account
     */
    public Future<FetchResult<JurisdictionOverrideModel>> listJurisdictionOverridesByAccountAsync(Integer accountId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.applyField("accountId", accountId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){}));
    }

    public FetchResult<JurisdictionOverrideModel> listJurisdictionOverridesByAccount(Integer accountId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides");
        path.applyField("accountId", accountId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
    }
    
    /**
     * Retrieve all overrides
     */
    public Future<FetchResult<JurisdictionOverrideModel>> queryJurisdictionOverridesAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/jurisdictionoverrides");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){}));
    }

    public FetchResult<JurisdictionOverrideModel> queryJurisdictionOverrides(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/jurisdictionoverrides");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<JurisdictionOverrideModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<JurisdictionOverrideModel>>(){})).call();
    }
    
    /**
     * Update a single jurisdictionoverride
     */
    public Future<JurisdictionOverrideModel> updateJurisdictionOverrideAsync(Integer accountId, Integer id, JurisdictionOverrideModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<JurisdictionOverrideModel>(){}));
    }

    public JurisdictionOverrideModel updateJurisdictionOverride(Integer accountId, Integer id, JurisdictionOverrideModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/jurisdictionoverrides/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<JurisdictionOverrideModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<JurisdictionOverrideModel>(){})).call();
    }
    
//endregion

//region Locations
    /**
     * Point of sale data file generation
     */
    public Future<HashMap<String, String>> buildPointOfSaleDataForLocationAsync(Integer companyId, Integer id, Date date, PointOfSaleFileType format, PointOfSalePartnerId partnerId, Boolean includeJurisCodes) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/pointofsaledata");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("date", date);
        path.addQuery("format", format);
        path.addQuery("partnerId", partnerId);
        path.addQuery("includeJurisCodes", includeJurisCodes);
        return this.threadPool.submit((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){}));
    }

    public HashMap<String, String> buildPointOfSaleDataForLocation(Integer companyId, Integer id, Date date, PointOfSaleFileType format, PointOfSalePartnerId partnerId, Boolean includeJurisCodes) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/pointofsaledata");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("date", date);
        path.addQuery("format", format);
        path.addQuery("partnerId", partnerId);
        path.addQuery("includeJurisCodes", includeJurisCodes);
        return ((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){})).call();
    }
    
    /**
     * Create a new location
     */
    public Future<ArrayList<LocationModel>> createLocationsAsync(Integer companyId, ArrayList<LocationModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<LocationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<LocationModel>>(){}));
    }

    public ArrayList<LocationModel> createLocations(Integer companyId, ArrayList<LocationModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<LocationModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<LocationModel>>(){})).call();
    }
    
    /**
     * Delete a single location
     */
    public Future<ArrayList<ErrorDetail>> deleteLocationAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteLocation(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single location
     */
    public Future<LocationModel> getLocationAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<LocationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LocationModel>(){}));
    }

    public LocationModel getLocation(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<LocationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LocationModel>(){})).call();
    }
    
    /**
     * Retrieve locations for this company
     */
    public Future<FetchResult<LocationModel>> listLocationsByCompanyAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){}));
    }

    public FetchResult<LocationModel> listLocationsByCompany(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){})).call();
    }
    
    /**
     * Retrieve all locations
     */
    public Future<FetchResult<LocationModel>> queryLocationsAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/locations");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){}));
    }

    public FetchResult<LocationModel> queryLocations(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/locations");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){})).call();
    }
    
    /**
     * Update a single location
     */
    public Future<LocationModel> updateLocationAsync(Integer companyId, Integer id, LocationModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<LocationModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<LocationModel>(){}));
    }

    public LocationModel updateLocation(Integer companyId, Integer id, LocationModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<LocationModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<LocationModel>(){})).call();
    }
    
    /**
     * Validate the location against local requirements
     */
    public Future<LocationValidationModel> validateLocationAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/validate");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<LocationValidationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LocationValidationModel>(){}));
    }

    public LocationValidationModel validateLocation(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/validate");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<LocationValidationModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<LocationValidationModel>(){})).call();
    }
    
//endregion

//region Nexus
    /**
     * Create a new nexus
     */
    public Future<ArrayList<NexusModel>> createNexusAsync(Integer companyId, ArrayList<NexusModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<NexusModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NexusModel>>(){}));
    }

    public ArrayList<NexusModel> createNexus(Integer companyId, ArrayList<NexusModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<NexusModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NexusModel>>(){})).call();
    }
    
    /**
     * Delete a single nexus
     */
    public Future<ArrayList<ErrorDetail>> deleteNexusAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteNexus(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single nexus
     */
    public Future<NexusModel> getNexusAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<NexusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusModel>(){}));
    }

    public NexusModel getNexus(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<NexusModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusModel>(){})).call();
    }
    
    /**
     * List company nexus related to a tax form
     */
    public Future<NexusByTaxFormModel> getNexusByFormCodeAsync(Integer companyId, String formCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/byform/{formCode}");
        path.applyField("companyId", companyId);
        path.applyField("formCode", formCode);
        return this.threadPool.submit((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusByTaxFormModel>(){}));
    }

    public NexusByTaxFormModel getNexusByFormCode(Integer companyId, String formCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/byform/{formCode}");
        path.applyField("companyId", companyId);
        path.applyField("formCode", formCode);
        return ((RestCall<NexusByTaxFormModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NexusByTaxFormModel>(){})).call();
    }
    
    /**
     * Retrieve nexus for this company
     */
    public Future<FetchResult<NexusModel>> listNexusByCompanyAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    public FetchResult<NexusModel> listNexusByCompany(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }
    
    /**
     * Retrieve all nexus
     */
    public Future<FetchResult<NexusModel>> queryNexusAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/nexus");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    public FetchResult<NexusModel> queryNexus(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/nexus");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }
    
    /**
     * Update a single nexus
     */
    public Future<NexusModel> updateNexusAsync(Integer companyId, Integer id, NexusModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<NexusModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<NexusModel>(){}));
    }

    public NexusModel updateNexus(Integer companyId, Integer id, NexusModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<NexusModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<NexusModel>(){})).call();
    }
    
//endregion

//region Notices
    /**
     * Create a new notice comment.
     */
    public Future<ArrayList<NoticeCommentModel>> createNoticeCommentAsync(Integer companyId, Integer id, ArrayList<NoticeCommentModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<NoticeCommentModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeCommentModel>>(){}));
    }

    public ArrayList<NoticeCommentModel> createNoticeComment(Integer companyId, Integer id, ArrayList<NoticeCommentModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<NoticeCommentModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeCommentModel>>(){})).call();
    }
    
    /**
     * Create a new notice finance details.
     */
    public Future<ArrayList<NoticeFinanceModel>> createNoticeFinanceDetailsAsync(Integer companyId, Integer id, ArrayList<NoticeFinanceModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<NoticeFinanceModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeFinanceModel>>(){}));
    }

    public ArrayList<NoticeFinanceModel> createNoticeFinanceDetails(Integer companyId, Integer id, ArrayList<NoticeFinanceModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<NoticeFinanceModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeFinanceModel>>(){})).call();
    }
    
    /**
     * Create a new notice responsibility.
     */
    public Future<ArrayList<NoticeResponsibilityDetailModel>> createNoticeResponsibilitiesAsync(Integer companyId, Integer id, ArrayList<NoticeResponsibilityDetailModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeResponsibilityDetailModel>>(){}));
    }

    public ArrayList<NoticeResponsibilityDetailModel> createNoticeResponsibilities(Integer companyId, Integer id, ArrayList<NoticeResponsibilityDetailModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeResponsibilityDetailModel>>(){})).call();
    }
    
    /**
     * Create a new notice root cause.
     */
    public Future<ArrayList<NoticeRootCauseDetailModel>> createNoticeRootCausesAsync(Integer companyId, Integer id, ArrayList<NoticeRootCauseDetailModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeRootCauseDetailModel>>(){}));
    }

    public ArrayList<NoticeRootCauseDetailModel> createNoticeRootCauses(Integer companyId, Integer id, ArrayList<NoticeRootCauseDetailModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeRootCauseDetailModel>>(){})).call();
    }
    
    /**
     * Create a new notice.
     */
    public Future<ArrayList<NoticeModel>> createNoticesAsync(Integer companyId, ArrayList<NoticeModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<NoticeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeModel>>(){}));
    }

    public ArrayList<NoticeModel> createNotices(Integer companyId, ArrayList<NoticeModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<NoticeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<NoticeModel>>(){})).call();
    }
    
    /**
     * Delete a single notice.
     */
    public Future<ArrayList<ErrorDetail>> deleteNoticeAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteNotice(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single attachment
     */
    public Future<HashMap<String, String>> downloadNoticeAttachmentAsync(Integer companyId, Long id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){}));
    }

    public HashMap<String, String> downloadNoticeAttachment(Integer companyId, Long id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/{id}/attachment");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("get", path, null, new TypeToken<HashMap<String, String>>(){})).call();
    }
    
    /**
     * Retrieve a single notice.
     */
    public Future<NoticeModel> getNoticeAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<NoticeModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NoticeModel>(){}));
    }

    public NoticeModel getNotice(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<NoticeModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<NoticeModel>(){})).call();
    }
    
    /**
     * Retrieve notice comments for a specific notice.
     */
    public Future<FetchResult<NoticeCommentModel>> getNoticeCommentsAsync(Integer id, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FetchResult<NoticeCommentModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCommentModel>>(){}));
    }

    public FetchResult<NoticeCommentModel> getNoticeComments(Integer id, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/comments");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeCommentModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeCommentModel>>(){})).call();
    }
    
    /**
     * Retrieve notice finance details for a specific notice.
     */
    public Future<FetchResult<NoticeFinanceModel>> getNoticeFinanceDetailsAsync(Integer id, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FetchResult<NoticeFinanceModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeFinanceModel>>(){}));
    }

    public FetchResult<NoticeFinanceModel> getNoticeFinanceDetails(Integer id, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/financedetails");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeFinanceModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeFinanceModel>>(){})).call();
    }
    
    /**
     * Retrieve notice responsibilities for a specific notice.
     */
    public Future<FetchResult<NoticeResponsibilityDetailModel>> getNoticeResponsibilitiesAsync(Integer id, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FetchResult<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeResponsibilityDetailModel>>(){}));
    }

    public FetchResult<NoticeResponsibilityDetailModel> getNoticeResponsibilities(Integer id, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/responsibilities");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeResponsibilityDetailModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeResponsibilityDetailModel>>(){})).call();
    }
    
    /**
     * Retrieve notice root causes for a specific notice.
     */
    public Future<FetchResult<NoticeRootCauseDetailModel>> getNoticeRootCausesAsync(Integer id, Integer companyId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<FetchResult<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeRootCauseDetailModel>>(){}));
    }

    public FetchResult<NoticeRootCauseDetailModel> getNoticeRootCauses(Integer id, Integer companyId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}/rootcauses");
        path.applyField("id", id);
        path.applyField("companyId", companyId);
        return ((RestCall<FetchResult<NoticeRootCauseDetailModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeRootCauseDetailModel>>(){})).call();
    }
    
    /**
     * Retrieve notices for a company.
     */
    public Future<FetchResult<NoticeModel>> listNoticesByCompanyAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeModel>>(){}));
    }

    public FetchResult<NoticeModel> listNoticesByCompany(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeModel>>(){})).call();
    }
    
    /**
     * Retrieve all notices.
     */
    public Future<FetchResult<NoticeModel>> queryNoticesAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/notices");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeModel>>(){}));
    }

    public FetchResult<NoticeModel> queryNotices(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/notices");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<NoticeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NoticeModel>>(){})).call();
    }
    
    /**
     * Update a single notice.
     */
    public Future<NoticeModel> updateNoticeAsync(Integer companyId, Integer id, NoticeModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<NoticeModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<NoticeModel>(){}));
    }

    public NoticeModel updateNotice(Integer companyId, Integer id, NoticeModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<NoticeModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<NoticeModel>(){})).call();
    }
    
    /**
     * Retrieve a single attachment
     */
    public Future<String> uploadAttachmentAsync(Integer companyId, ResourceFileUploadRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/attachment");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){}));
    }

    public String uploadAttachment(Integer companyId, ResourceFileUploadRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/notices/files/attachment");
        path.applyField("companyId", companyId);
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){})).call();
    }
    
//endregion

//region Onboarding
    /**
     * Request a new Avalara account
     */
    public Future<NewAccountModel> requestNewAccountAsync(NewAccountRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/request");
        return this.threadPool.submit((RestCall<NewAccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<NewAccountModel>(){}));
    }

    public NewAccountModel requestNewAccount(NewAccountRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/request");
        return ((RestCall<NewAccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<NewAccountModel>(){})).call();
    }
    
//endregion

//region PointOfSale
    /**
     * Point of sale data file generation
     */
    public Future<HashMap<String, String>> buildPointOfSaleDataFileAsync(PointOfSaleDataRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/pointofsaledata/build");
        return this.threadPool.submit((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("post", path, model, new TypeToken<HashMap<String, String>>(){}));
    }

    public HashMap<String, String> buildPointOfSaleDataFile(PointOfSaleDataRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/pointofsaledata/build");
        return ((RestCall<HashMap<String, String>>)restCallFactory.createRestCall("post", path, model, new TypeToken<HashMap<String, String>>(){})).call();
    }
    
//endregion

//region Registrar
    /**
     * Change Password
     */
    public Future<String> changePasswordAsync(PasswordChangeModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords");
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("put", path, model, new TypeToken<String>(){}));
    }

    public String changePassword(PasswordChangeModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords");
        return ((RestCall<String>)restCallFactory.createRestCall("put", path, model, new TypeToken<String>(){})).call();
    }
    
    /**
     * Create a new account
     */
    public Future<AccountModel> createAccountAsync(AccountModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        return this.threadPool.submit((RestCall<AccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AccountModel>(){}));
    }

    public AccountModel createAccount(AccountModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AccountModel>(){})).call();
    }
    
    /**
     * Create a new subscription
     */
    public Future<ArrayList<SubscriptionModel>> createSubscriptionsAsync(Integer accountId, ArrayList<SubscriptionModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<ArrayList<SubscriptionModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<SubscriptionModel>>(){}));
    }

    public ArrayList<SubscriptionModel> createSubscriptions(Integer accountId, ArrayList<SubscriptionModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.applyField("accountId", accountId);
        return ((RestCall<ArrayList<SubscriptionModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<SubscriptionModel>>(){})).call();
    }
    
    /**
     * Create new users
     */
    public Future<ArrayList<UserModel>> createUsersAsync(Integer accountId, ArrayList<UserModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<ArrayList<UserModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<UserModel>>(){}));
    }

    public ArrayList<UserModel> createUsers(Integer accountId, ArrayList<UserModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.applyField("accountId", accountId);
        return ((RestCall<ArrayList<UserModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<UserModel>>(){})).call();
    }
    
    /**
     * Delete a single account
     */
    public Future<ArrayList<ErrorDetail>> deleteAccountAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteAccount(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Delete a single subscription
     */
    public Future<ArrayList<ErrorDetail>> deleteSubscriptionAsync(Integer accountId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteSubscription(Integer accountId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Delete a single user
     */
    public Future<ArrayList<ErrorDetail>> deleteUserAsync(Integer id, Integer accountId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteUser(Integer id, Integer accountId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve all accounts
     */
    public Future<FetchResult<AccountModel>> queryAccountsAsync(String $include, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<AccountModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<AccountModel>>(){}));
    }

    public FetchResult<AccountModel> queryAccounts(String $include, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts");
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<AccountModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<AccountModel>>(){})).call();
    }
    
    /**
     * Reset a user's password programmatically
     */
    public Future<String> resetPasswordAsync(Integer userId, SetPasswordModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords/{userId}/reset");
        path.applyField("userId", userId);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){}));
    }

    public String resetPassword(Integer userId, SetPasswordModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/passwords/{userId}/reset");
        path.applyField("userId", userId);
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){})).call();
    }
    
    /**
     * Update a single account
     */
    public Future<AccountModel> updateAccountAsync(Integer id, AccountModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<AccountModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<AccountModel>(){}));
    }

    public AccountModel updateAccount(Integer id, AccountModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{id}");
        path.applyField("id", id);
        return ((RestCall<AccountModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<AccountModel>(){})).call();
    }
    
    /**
     * Update a single subscription
     */
    public Future<SubscriptionModel> updateSubscriptionAsync(Integer accountId, Integer id, SubscriptionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<SubscriptionModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<SubscriptionModel>(){}));
    }

    public SubscriptionModel updateSubscription(Integer accountId, Integer id, SubscriptionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<SubscriptionModel>(){})).call();
    }
    
//endregion

//region Settings
    /**
     * Create a new setting
     */
    public Future<ArrayList<SettingModel>> createSettingsAsync(Integer companyId, ArrayList<SettingModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<SettingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<SettingModel>>(){}));
    }

    public ArrayList<SettingModel> createSettings(Integer companyId, ArrayList<SettingModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<SettingModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<SettingModel>>(){})).call();
    }
    
    /**
     * Delete a single setting
     */
    public Future<ArrayList<ErrorDetail>> deleteSettingAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteSetting(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single setting
     */
    public Future<SettingModel> getSettingAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<SettingModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SettingModel>(){}));
    }

    public SettingModel getSetting(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<SettingModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SettingModel>(){})).call();
    }
    
    /**
     * Retrieve all settings for this company
     */
    public Future<FetchResult<SettingModel>> listSettingsByCompanyAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){}));
    }

    public FetchResult<SettingModel> listSettingsByCompany(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){})).call();
    }
    
    /**
     * Retrieve all settings
     */
    public Future<FetchResult<SettingModel>> querySettingsAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/settings");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){}));
    }

    public FetchResult<SettingModel> querySettings(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/settings");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){})).call();
    }
    
    /**
     * Update a single setting
     */
    public Future<SettingModel> updateSettingAsync(Integer companyId, Integer id, SettingModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<SettingModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<SettingModel>(){}));
    }

    public SettingModel updateSetting(Integer companyId, Integer id, SettingModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<SettingModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<SettingModel>(){})).call();
    }
    
//endregion

//region Subscriptions
    /**
     * Retrieve a single subscription
     */
    public Future<SubscriptionModel> getSubscriptionAsync(Integer accountId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){}));
    }

    public SubscriptionModel getSubscription(Integer accountId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions/{id}");
        path.applyField("accountId", accountId);
        path.applyField("id", id);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){})).call();
    }
    
    /**
     * Retrieve subscriptions for this account
     */
    public Future<FetchResult<SubscriptionModel>> listSubscriptionsByAccountAsync(Integer accountId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.applyField("accountId", accountId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){}));
    }

    public FetchResult<SubscriptionModel> listSubscriptionsByAccount(Integer accountId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/subscriptions");
        path.applyField("accountId", accountId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
    }
    
    /**
     * Retrieve all subscriptions
     */
    public Future<FetchResult<SubscriptionModel>> querySubscriptionsAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/subscriptions");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){}));
    }

    public FetchResult<SubscriptionModel> querySubscriptions(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/subscriptions");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
    }
    
//endregion

//region TaxCodes
    /**
     * Create a new tax code
     */
    public Future<ArrayList<TaxCodeModel>> createTaxCodesAsync(Integer companyId, ArrayList<TaxCodeModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<TaxCodeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<TaxCodeModel>>(){}));
    }

    public ArrayList<TaxCodeModel> createTaxCodes(Integer companyId, ArrayList<TaxCodeModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<TaxCodeModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<TaxCodeModel>>(){})).call();
    }
    
    /**
     * Delete a single tax code
     */
    public Future<ArrayList<ErrorDetail>> deleteTaxCodeAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteTaxCode(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single tax code
     */
    public Future<TaxCodeModel> getTaxCodeAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<TaxCodeModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxCodeModel>(){}));
    }

    public TaxCodeModel getTaxCode(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<TaxCodeModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxCodeModel>(){})).call();
    }
    
    /**
     * Retrieve tax codes for this company
     */
    public Future<FetchResult<TaxCodeModel>> listTaxCodesByCompanyAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){}));
    }

    public FetchResult<TaxCodeModel> listTaxCodesByCompany(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
    }
    
    /**
     * Retrieve all tax codes
     */
    public Future<FetchResult<TaxCodeModel>> queryTaxCodesAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxcodes");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){}));
    }

    public FetchResult<TaxCodeModel> queryTaxCodes(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxcodes");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
    }
    
    /**
     * Update a single tax code
     */
    public Future<TaxCodeModel> updateTaxCodeAsync(Integer companyId, Integer id, TaxCodeModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<TaxCodeModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<TaxCodeModel>(){}));
    }

    public TaxCodeModel updateTaxCode(Integer companyId, Integer id, TaxCodeModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<TaxCodeModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<TaxCodeModel>(){})).call();
    }
    
//endregion

//region TaxRules
    /**
     * Create a new tax rule
     */
    public Future<ArrayList<TaxRuleModel>> createTaxRulesAsync(Integer companyId, ArrayList<TaxRuleModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<TaxRuleModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<TaxRuleModel>>(){}));
    }

    public ArrayList<TaxRuleModel> createTaxRules(Integer companyId, ArrayList<TaxRuleModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<TaxRuleModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<TaxRuleModel>>(){})).call();
    }
    
    /**
     * Delete a single tax rule
     */
    public Future<ArrayList<ErrorDetail>> deleteTaxRuleAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteTaxRule(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single tax rule
     */
    public Future<TaxRuleModel> getTaxRuleAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<TaxRuleModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRuleModel>(){}));
    }

    public TaxRuleModel getTaxRule(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<TaxRuleModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TaxRuleModel>(){})).call();
    }
    
    /**
     * Retrieve tax rules for this company
     */
    public Future<FetchResult<TaxRuleModel>> listTaxRulesAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){}));
    }

    public FetchResult<TaxRuleModel> listTaxRules(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){})).call();
    }
    
    /**
     * Retrieve all tax rules
     */
    public Future<FetchResult<TaxRuleModel>> queryTaxRulesAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrules");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){}));
    }

    public FetchResult<TaxRuleModel> queryTaxRules(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrules");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){})).call();
    }
    
    /**
     * Update a single tax rule
     */
    public Future<TaxRuleModel> updateTaxRuleAsync(Integer companyId, Integer id, TaxRuleModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<TaxRuleModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<TaxRuleModel>(){}));
    }

    public TaxRuleModel updateTaxRule(Integer companyId, Integer id, TaxRuleModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<TaxRuleModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<TaxRuleModel>(){})).call();
    }
    
//endregion

//region Transactions
    /**
     * Add lines to an existing unlocked transaction
     */
    public Future<TransactionModel> addLinesAsync(String $include, AddTransactionLineModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/add");
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel addLines(String $include, AddTransactionLineModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/add");
        path.addQuery("$include", $include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Correct a previously created transaction
     */
    public Future<TransactionModel> adjustTransactionAsync(String companyCode, String transactionCode, AdjustTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/adjust");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel adjustTransaction(String companyCode, String transactionCode, AdjustTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/adjust");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Get audit information about a transaction
     */
    public Future<AuditTransactionModel> auditTransactionAsync(String companyCode, String transactionCode) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/audit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return this.threadPool.submit((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditTransactionModel>(){}));
    }

    public AuditTransactionModel auditTransaction(String companyCode, String transactionCode) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/audit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return ((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditTransactionModel>(){})).call();
    }
    
    /**
     * Get audit information about a transaction
     */
    public Future<AuditTransactionModel> auditTransactionWithTypeAsync(String companyCode, String transactionCode, DocumentType documentType) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}/audit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.applyField("documentType", documentType);
        return this.threadPool.submit((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditTransactionModel>(){}));
    }

    public AuditTransactionModel auditTransactionWithType(String companyCode, String transactionCode, DocumentType documentType) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}/audit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.applyField("documentType", documentType);
        return ((RestCall<AuditTransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<AuditTransactionModel>(){})).call();
    }
    
    /**
     * Lock a set of documents
     */
    public Future<BulkLockTransactionResult> bulkLockTransactionAsync(BulkLockTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/lock");
        return this.threadPool.submit((RestCall<BulkLockTransactionResult>)restCallFactory.createRestCall("post", path, model, new TypeToken<BulkLockTransactionResult>(){}));
    }

    public BulkLockTransactionResult bulkLockTransaction(BulkLockTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/lock");
        return ((RestCall<BulkLockTransactionResult>)restCallFactory.createRestCall("post", path, model, new TypeToken<BulkLockTransactionResult>(){})).call();
    }
    
    /**
     * Change a transaction's code
     */
    public Future<TransactionModel> changeTransactionCodeAsync(String companyCode, String transactionCode, ChangeTransactionCodeModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/changecode");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel changeTransactionCode(String companyCode, String transactionCode, ChangeTransactionCodeModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/changecode");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Commit a transaction for reporting
     */
    public Future<TransactionModel> commitTransactionAsync(String companyCode, String transactionCode, CommitTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/commit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel commitTransaction(String companyCode, String transactionCode, CommitTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/commit");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Create a new transaction
     */
    public Future<TransactionModel> createOrAdjustTransactionAsync(String $include, CreateOrAdjustTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/createoradjust");
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel createOrAdjustTransaction(String $include, CreateOrAdjustTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/createoradjust");
        path.addQuery("$include", $include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Create a new transaction
     */
    public Future<TransactionModel> createTransactionAsync(String $include, CreateTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/create");
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel createTransaction(String $include, CreateTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/create");
        path.addQuery("$include", $include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Remove lines from an existing unlocked transaction
     */
    public Future<TransactionModel> deleteLinesAsync(String $include, RemoveTransactionLineModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/delete");
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel deleteLines(String $include, RemoveTransactionLineModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/transactions/lines/delete");
        path.addQuery("$include", $include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Retrieve a single transaction by code
     */
    public Future<TransactionModel> getTransactionByCodeAsync(String companyCode, String transactionCode, String $include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel getTransactionByCode(String companyCode, String transactionCode, String $include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("$include", $include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Retrieve a single transaction by code
     */
    public Future<TransactionModel> getTransactionByCodeAndTypeAsync(String companyCode, String transactionCode, DocumentType documentType, String $include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.applyField("documentType", documentType);
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel getTransactionByCodeAndType(String companyCode, String transactionCode, DocumentType documentType, String $include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/types/{documentType}");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.applyField("documentType", documentType);
        path.addQuery("$include", $include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Retrieve a single transaction by ID
     */
    public Future<TransactionModel> getTransactionByIdAsync(Long id, String $include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/{id}");
        path.applyField("id", id);
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel getTransactionById(Long id, String $include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/{id}");
        path.applyField("id", id);
        path.addQuery("$include", $include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Retrieve all transactions
     */
    public Future<FetchResult<TransactionModel>> listTransactionsByCompanyAsync(String companyCode, String $include, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions");
        path.applyField("companyCode", companyCode);
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TransactionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TransactionModel>>(){}));
    }

    public FetchResult<TransactionModel> listTransactionsByCompany(String companyCode, String $include, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions");
        path.applyField("companyCode", companyCode);
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<TransactionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TransactionModel>>(){})).call();
    }
    
    /**
     * Lock a single transaction
     */
    public Future<TransactionModel> lockTransactionAsync(String companyCode, String transactionCode, LockTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/lock");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel lockTransaction(String companyCode, String transactionCode, LockTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/lock");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Create a refund for a transaction
     */
    public Future<TransactionModel> refundTransactionAsync(String companyCode, String transactionCode, String $include, RefundTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/refund");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel refundTransaction(String companyCode, String transactionCode, String $include, RefundTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/refund");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        path.addQuery("$include", $include);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Perform multiple actions on a transaction
     */
    public Future<TransactionModel> settleTransactionAsync(String companyCode, String transactionCode, SettleTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/settle");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel settleTransaction(String companyCode, String transactionCode, SettleTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/settle");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Verify a transaction
     */
    public Future<TransactionModel> verifyTransactionAsync(String companyCode, String transactionCode, VerifyTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/verify");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel verifyTransaction(String companyCode, String transactionCode, VerifyTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/verify");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
    /**
     * Void a transaction
     */
    public Future<TransactionModel> voidTransactionAsync(String companyCode, String transactionCode, VoidTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/void");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel voidTransaction(String companyCode, String transactionCode, VoidTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyCode}/transactions/{transactionCode}/void");
        path.applyField("companyCode", companyCode);
        path.applyField("transactionCode", transactionCode);
        return ((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){})).call();
    }
    
//endregion

//region Upcs
    /**
     * Create a new UPC
     */
    public Future<ArrayList<UPCModel>> createUPCsAsync(Integer companyId, ArrayList<UPCModel> model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        return this.threadPool.submit((RestCall<ArrayList<UPCModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<UPCModel>>(){}));
    }

    public ArrayList<UPCModel> createUPCs(Integer companyId, ArrayList<UPCModel> model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        return ((RestCall<ArrayList<UPCModel>>)restCallFactory.createRestCall("post", path, model, new TypeToken<ArrayList<UPCModel>>(){})).call();
    }
    
    /**
     * Delete a single UPC
     */
    public Future<ArrayList<ErrorDetail>> deleteUPCAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){}));
    }

    public ArrayList<ErrorDetail> deleteUPC(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ArrayList<ErrorDetail>>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ArrayList<ErrorDetail>>(){})).call();
    }
    
    /**
     * Retrieve a single UPC
     */
    public Future<UPCModel> getUPCAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<UPCModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UPCModel>(){}));
    }

    public UPCModel getUPC(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<UPCModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UPCModel>(){})).call();
    }
    
    /**
     * Retrieve UPCs for this company
     */
    public Future<FetchResult<UPCModel>> listUPCsByCompanyAsync(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){}));
    }

    public FetchResult<UPCModel> listUPCsByCompany(Integer companyId, String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){})).call();
    }
    
    /**
     * Retrieve all UPCs
     */
    public Future<FetchResult<UPCModel>> queryUPCsAsync(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/upcs");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){}));
    }

    public FetchResult<UPCModel> queryUPCs(String $filter, String $include, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/upcs");
        path.addQuery("$filter", $filter);
        path.addQuery("$include", $include);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){})).call();
    }
    
    /**
     * Update a single UPC
     */
    public Future<UPCModel> updateUPCAsync(Integer companyId, Integer id, UPCModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<UPCModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<UPCModel>(){}));
    }

    public UPCModel updateUPC(Integer companyId, Integer id, UPCModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<UPCModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<UPCModel>(){})).call();
    }
    
//endregion

//region Users
    /**
     * Retrieve a single user
     */
    public Future<UserModel> getUserAsync(Integer id, Integer accountId, String $include) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        path.addQuery("$include", $include);
        return this.threadPool.submit((RestCall<UserModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UserModel>(){}));
    }

    public UserModel getUser(Integer id, Integer accountId, String $include) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        path.addQuery("$include", $include);
        return ((RestCall<UserModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UserModel>(){})).call();
    }
    
    /**
     * Retrieve all entitlements for a single user
     */
    public Future<UserEntitlementModel> getUserEntitlementsAsync(Integer id, Integer accountId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}/entitlements");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<UserEntitlementModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UserEntitlementModel>(){}));
    }

    public UserEntitlementModel getUserEntitlements(Integer id, Integer accountId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}/entitlements");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return ((RestCall<UserEntitlementModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<UserEntitlementModel>(){})).call();
    }
    
    /**
     * Retrieve users for this account
     */
    public Future<FetchResult<UserModel>> listUsersByAccountAsync(Integer accountId, String $include, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.applyField("accountId", accountId);
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UserModel>>(){}));
    }

    public FetchResult<UserModel> listUsersByAccount(Integer accountId, String $include, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users");
        path.applyField("accountId", accountId);
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UserModel>>(){})).call();
    }
    
    /**
     * Retrieve all users
     */
    public Future<FetchResult<UserModel>> queryUsersAsync(String $include, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/users");
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UserModel>>(){}));
    }

    public FetchResult<UserModel> queryUsers(String $include, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/users");
        path.addQuery("$include", $include);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<UserModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UserModel>>(){})).call();
    }
    
    /**
     * Update a single user
     */
    public Future<UserModel> updateUserAsync(Integer id, Integer accountId, UserModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return this.threadPool.submit((RestCall<UserModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<UserModel>(){}));
    }

    public UserModel updateUser(Integer id, Integer accountId, UserModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/accounts/{accountId}/users/{id}");
        path.applyField("id", id);
        path.applyField("accountId", accountId);
        return ((RestCall<UserModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<UserModel>(){})).call();
    }
    
//endregion

//region Utilities
    /**
     * Checks if the current user is subscribed to a specific service
     */
    public Future<SubscriptionModel> getMySubscriptionAsync(ServiceTypeId serviceTypeId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions/{serviceTypeId}");
        path.applyField("serviceTypeId", serviceTypeId);
        return this.threadPool.submit((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){}));
    }

    public SubscriptionModel getMySubscription(ServiceTypeId serviceTypeId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions/{serviceTypeId}");
        path.applyField("serviceTypeId", serviceTypeId);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){})).call();
    }
    
    /**
     * List all services to which the current user is subscribed
     */
    public Future<FetchResult<SubscriptionModel>> listMySubscriptionsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions");
        return this.threadPool.submit((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){}));
    }

    public FetchResult<SubscriptionModel> listMySubscriptions() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions");
        return ((RestCall<FetchResult<SubscriptionModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SubscriptionModel>>(){})).call();
    }
    
    /**
     * Tests connectivity and version of the service
     */
    public Future<PingResultModel> pingAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/ping");
        return this.threadPool.submit((RestCall<PingResultModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<PingResultModel>(){}));
    }

    public PingResultModel ping() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/ping");
        return ((RestCall<PingResultModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<PingResultModel>(){})).call();
    }
    
//endregion

}
    