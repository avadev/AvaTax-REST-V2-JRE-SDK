package net.avalara.avatax.rest.client;

import com.google.gson.reflect.TypeToken;
import net.avalara.avatax.rest.client.models.*;
import net.avalara.avatax.rest.client.enums.*;

import java.math.BigDecimal;
import java.util.Base64;
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

    public AvaTaxClient withSecurity(String securityHeader) {
        this.restCallFactory.addSecurityHeader(securityHeader);

        return this;
    }

    public AvaTaxClient withSecurity(String username, String password) {
        String header = null;

        try {
            header = Base64.getEncoder().encodeToString((username + ":" + password).getBytes("utf-8"));
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
    
//endregion

//region Addresses
    /**
     * Retrieve geolocation information for a specified address
     */
    public Future<AddressResolutionModel> resolveAddressAsync(AddressInfo model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/addresses/resolve");
        return this.threadPool.submit((RestCall<AddressResolutionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<AddressResolutionModel>(){}));
    }

    public AddressResolutionModel resolveAddress(AddressInfo model) throws Exception {
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
    public Future<ErrorResult> deleteBatchAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteBatch(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
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
    public Future<FetchResult<BatchModel>> listBatchesByCompanyAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){}));
    }

    public FetchResult<BatchModel> listBatchesByCompany(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
    }
    
    /**
     * Retrieve all batches
     */
    public Future<FetchResult<BatchModel>> queryBatchesAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/batches");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){}));
    }

    public FetchResult<BatchModel> queryBatches(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/batches");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<BatchModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<BatchModel>>(){})).call();
    }
    
    /**
     * Update a single batch
     */
    public Future<BatchModel> updateBatchAsync(Integer companyId, Integer id, BatchModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<BatchModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<BatchModel>(){}));
    }

    public BatchModel updateBatch(Integer companyId, Integer id, BatchModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/batches/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<BatchModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<BatchModel>(){})).call();
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
     * Delete a single company
     */
    public Future<ErrorResult> deleteCompaniesAsync(Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteCompanies(Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{id}");
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
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
    public Future<ErrorResult> deleteContactAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteContact(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
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
    public Future<FetchResult<ContactModel>> listContactsByCompanyAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){}));
    }

    public FetchResult<ContactModel> listContactsByCompany(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/contacts");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){})).call();
    }
    
    /**
     * Retrieve all contacts
     */
    public Future<FetchResult<ContactModel>> queryContactsAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/contacts");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ContactModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ContactModel>>(){}));
    }

    public FetchResult<ContactModel> queryContacts(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/contacts");
        path.addQuery("$filter", $filter);
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
    public Future<ErrorResult> deleteItemAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteItem(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
    }
    
    /**
     * Retrieve a single item
     */
    public Future<ItemModel> getItemAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ItemModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ItemModel>(){}));
    }

    public ItemModel getItem(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<ItemModel>(){})).call();
    }
    
    /**
     * Retrieve items for this company
     */
    public Future<FetchResult<ItemModel>> listItemsByCompanyAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){}));
    }

    public FetchResult<ItemModel> listItemsByCompany(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }
    
    /**
     * Retrieve all items
     */
    public Future<FetchResult<ItemModel>> queryItemsAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/items");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){}));
    }

    public FetchResult<ItemModel> queryItems(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/items");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<ItemModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<ItemModel>>(){})).call();
    }
    
    /**
     * Update a single item
     */
    public Future<ItemModel> updateItemAsync(Integer companyId, Integer id, ItemModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ItemModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ItemModel>(){}));
    }

    public ItemModel updateItem(Integer companyId, Integer id, ItemModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/items/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ItemModel>)restCallFactory.createRestCall("put", path, model, new TypeToken<ItemModel>(){})).call();
    }
    
//endregion

//region Locations
    /**
     * Point of sale data file generation
     */
    public Future<String> buildPointOfSaleDataForLocationAsync(Integer companyId, Integer id, Date date, String format, Integer partnerId, Boolean includeJurisCodes) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}/pointofsaledata");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        path.addQuery("date", date);
        path.addQuery("format", format);
        path.addQuery("partnerId", partnerId);
        path.addQuery("includeJurisCodes", includeJurisCodes);
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("get", path, null, new TypeToken<String>(){}));
    }

    public String buildPointOfSaleDataForLocation(Integer companyId, Integer id, Date date, String format, Integer partnerId, Boolean includeJurisCodes) throws Exception {
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
    public Future<ErrorResult> deleteLocationAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteLocation(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
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
    public Future<FetchResult<LocationModel>> listLocationsByCompanyAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){}));
    }

    public FetchResult<LocationModel> listLocationsByCompany(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/locations");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){})).call();
    }
    
    /**
     * Retrieve all locations
     */
    public Future<FetchResult<LocationModel>> queryLocationsAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/locations");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<LocationModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<LocationModel>>(){}));
    }

    public FetchResult<LocationModel> queryLocations(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/locations");
        path.addQuery("$filter", $filter);
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
    public Future<ErrorResult> deleteNexusAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteNexus(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
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
     * Retrieve nexus for this company
     */
    public Future<FetchResult<NexusModel>> listNexusByCompanyAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    public FetchResult<NexusModel> listNexusByCompany(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/nexus");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){})).call();
    }
    
    /**
     * Retrieve all nexus
     */
    public Future<FetchResult<NexusModel>> queryNexusAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/nexus");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<NexusModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<NexusModel>>(){}));
    }

    public FetchResult<NexusModel> queryNexus(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/nexus");
        path.addQuery("$filter", $filter);
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

//region PointOfSale
    /**
     * Point of sale data file generation
     */
    public Future<String> buildPointOfSaleDataFileAsync(PointOfSaleDataRequestModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/pointofsaledata/build");
        return this.threadPool.submit((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){}));
    }

    public String buildPointOfSaleDataFile(PointOfSaleDataRequestModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/pointofsaledata/build");
        return ((RestCall<String>)restCallFactory.createRestCall("post", path, model, new TypeToken<String>(){})).call();
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
    public Future<ErrorResult> deleteSettingAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteSetting(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
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
    public Future<FetchResult<SettingModel>> listSettingsByCompanyAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){}));
    }

    public FetchResult<SettingModel> listSettingsByCompany(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/settings");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){})).call();
    }
    
    /**
     * Retrieve all settings
     */
    public Future<FetchResult<SettingModel>> querySettingsAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/settings");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<SettingModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<SettingModel>>(){}));
    }

    public FetchResult<SettingModel> querySettings(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/settings");
        path.addQuery("$filter", $filter);
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
    public Future<ErrorResult> deleteTaxCodeAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteTaxCode(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
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
    public Future<FetchResult<TaxCodeModel>> listTaxCodesByCompanyAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){}));
    }

    public FetchResult<TaxCodeModel> listTaxCodesByCompany(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxcodes");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){})).call();
    }
    
    /**
     * Retrieve all tax codes
     */
    public Future<FetchResult<TaxCodeModel>> queryTaxCodesAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxcodes");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxCodeModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxCodeModel>>(){}));
    }

    public FetchResult<TaxCodeModel> queryTaxCodes(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxcodes");
        path.addQuery("$filter", $filter);
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

//region TaxRates
    /**
     * Retrieve tax rates for a specified address
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
     * Retrieve tax rates for a specified country and postal code
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
    public Future<ErrorResult> deleteTaxRuleAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteTaxRule(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
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
    public Future<FetchResult<TaxRuleModel>> listTaxRulesAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){}));
    }

    public FetchResult<TaxRuleModel> listTaxRules(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/taxrules");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){})).call();
    }
    
    /**
     * Retrieve all tax rules
     */
    public Future<FetchResult<TaxRuleModel>> queryTaxRulesAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrules");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<TaxRuleModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<TaxRuleModel>>(){}));
    }

    public FetchResult<TaxRuleModel> queryTaxRules(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/taxrules");
        path.addQuery("$filter", $filter);
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
    public Future<TransactionModel> createTransactionAsync(CreateTransactionModel model) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/create");
        return this.threadPool.submit((RestCall<TransactionModel>)restCallFactory.createRestCall("post", path, model, new TypeToken<TransactionModel>(){}));
    }

    public TransactionModel createTransaction(CreateTransactionModel model) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/transactions/create");
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
    public Future<ErrorResult> deleteUPCAsync(Integer companyId, Integer id) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return this.threadPool.submit((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){}));
    }

    public ErrorResult deleteUPC(Integer companyId, Integer id) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs/{id}");
        path.applyField("companyId", companyId);
        path.applyField("id", id);
        return ((RestCall<ErrorResult>)restCallFactory.createRestCall("delete", path, null, new TypeToken<ErrorResult>(){})).call();
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
    public Future<FetchResult<UPCModel>> listUPCsByCompanyAsync(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){}));
    }

    public FetchResult<UPCModel> listUPCsByCompany(Integer companyId, String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/companies/{companyId}/upcs");
        path.applyField("companyId", companyId);
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return ((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){})).call();
    }
    
    /**
     * Retrieve all UPCs
     */
    public Future<FetchResult<UPCModel>> queryUPCsAsync(String $filter, Integer $top, Integer $skip, String $orderBy) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/upcs");
        path.addQuery("$filter", $filter);
        path.addQuery("$top", $top);
        path.addQuery("$skip", $skip);
        path.addQuery("$orderBy", $orderBy);
        return this.threadPool.submit((RestCall<FetchResult<UPCModel>>)restCallFactory.createRestCall("get", path, null, new TypeToken<FetchResult<UPCModel>>(){}));
    }

    public FetchResult<UPCModel> queryUPCs(String $filter, Integer $top, Integer $skip, String $orderBy) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/upcs");
        path.addQuery("$filter", $filter);
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
    public Future<SubscriptionModel> getMySubscriptionAsync(String serviceTypeId) {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions/{serviceTypeId}");
        path.applyField("serviceTypeId", serviceTypeId);
        return this.threadPool.submit((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){}));
    }

    public SubscriptionModel getMySubscription(String serviceTypeId) throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions/{serviceTypeId}");
        path.applyField("serviceTypeId", serviceTypeId);
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){})).call();
    }
    
    /**
     * List all services to which the current user is subscribed
     */
    public Future<SubscriptionModel> listMySubscriptionsAsync() {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions");
        return this.threadPool.submit((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){}));
    }

    public SubscriptionModel listMySubscriptions() throws Exception {
        AvaTaxPath path = new AvaTaxPath("/api/v2/utilities/subscriptions");
        return ((RestCall<SubscriptionModel>)restCallFactory.createRestCall("get", path, null, new TypeToken<SubscriptionModel>(){})).call();
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
    