package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

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

/**
 * A company or business entity.
 */
public class CompanyModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this company.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this company.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 accountId;

    /**
     * Getter for accountId;
     * The unique ID number of the account this company belongs to.
     */
    public Int32 getaccountId() {;
        return this.accountId;;
    }

    /**
     * Setter for accountId;
     * The unique ID number of the account this company belongs to.
     */
    public void setaccountId(Int32 value) {;
        this.accountId = value;;
    }


    private Int32? parentCompanyId;

    /**
     * Getter for parentCompanyId;
     * If this company is fully owned by another company, this is the unique identity of the parent company.
     */
    public Int32? getparentCompanyId() {;
        return this.parentCompanyId;;
    }

    /**
     * Setter for parentCompanyId;
     * If this company is fully owned by another company, this is the unique identity of the parent company.
     */
    public void setparentCompanyId(Int32? value) {;
        this.parentCompanyId = value;;
    }


    private String sstPid;

    /**
     * Getter for sstPid;
     * If this company files Streamlined Sales Tax, this is the PID of this company as defined by the Streamlined Sales Tax governing board.
     */
    public String getsstPid() {;
        return this.sstPid;;
    }

    /**
     * Setter for sstPid;
     * If this company files Streamlined Sales Tax, this is the PID of this company as defined by the Streamlined Sales Tax governing board.
     */
    public void setsstPid(String value) {;
        this.sstPid = value;;
    }


    private String companyCode;

    /**
     * Getter for companyCode;
     * A unique code that references this company within your account.
     */
    public String getcompanyCode() {;
        return this.companyCode;;
    }

    /**
     * Setter for companyCode;
     * A unique code that references this company within your account.
     */
    public void setcompanyCode(String value) {;
        this.companyCode = value;;
    }


    private String name;

    /**
     * Getter for name;
     * The name of this company, as shown to customers.
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The name of this company, as shown to customers.
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private Boolean? isDefault;

    /**
     * Getter for isDefault;
     * This flag is true if this company is the default company for this account. Only one company may be set as the default.
     */
    public Boolean? getisDefault() {;
        return this.isDefault;;
    }

    /**
     * Setter for isDefault;
     * This flag is true if this company is the default company for this account. Only one company may be set as the default.
     */
    public void setisDefault(Boolean? value) {;
        this.isDefault = value;;
    }


    private Int32? defaultLocationId;

    /**
     * Getter for defaultLocationId;
     * If set, this is the unique ID number of the default location for this company.
     */
    public Int32? getdefaultLocationId() {;
        return this.defaultLocationId;;
    }

    /**
     * Setter for defaultLocationId;
     * If set, this is the unique ID number of the default location for this company.
     */
    public void setdefaultLocationId(Int32? value) {;
        this.defaultLocationId = value;;
    }


    private Boolean? isActive;

    /**
     * Getter for isActive;
     * This flag indicates whether tax activity can occur for this company. Set this flag to true to permit the company to process transactions.
     */
    public Boolean? getisActive() {;
        return this.isActive;;
    }

    /**
     * Setter for isActive;
     * This flag indicates whether tax activity can occur for this company. Set this flag to true to permit the company to process transactions.
     */
    public void setisActive(Boolean? value) {;
        this.isActive = value;;
    }


    private String taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber;
     * For United States companies, this field contains your Taxpayer Identification Number. 
    * This is a nine digit number that is usually called an EIN for an Employer Identification Number if this company is a corporation, 
    * or SSN for a Social Security Number if this company is a person.
    * This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
    * but it is optional if you do not subscribe to either of those services.
     */
    public String gettaxpayerIdNumber() {;
        return this.taxpayerIdNumber;;
    }

    /**
     * Setter for taxpayerIdNumber;
     * For United States companies, this field contains your Taxpayer Identification Number. 
    * This is a nine digit number that is usually called an EIN for an Employer Identification Number if this company is a corporation, 
    * or SSN for a Social Security Number if this company is a person.
    * This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
    * but it is optional if you do not subscribe to either of those services.
     */
    public void settaxpayerIdNumber(String value) {;
        this.taxpayerIdNumber = value;;
    }


    private Boolean? hasProfile;

    /**
     * Getter for hasProfile;
     * Set this flag to true to give this company its own unique tax profile.
    * If this flag is true, this company will have its own Nexus, TaxRule, TaxCode, and Item definitions.
    * If this flag is false, this company will inherit all profile values from its parent.
     */
    public Boolean? gethasProfile() {;
        return this.hasProfile;;
    }

    /**
     * Setter for hasProfile;
     * Set this flag to true to give this company its own unique tax profile.
    * If this flag is true, this company will have its own Nexus, TaxRule, TaxCode, and Item definitions.
    * If this flag is false, this company will inherit all profile values from its parent.
     */
    public void sethasProfile(Boolean? value) {;
        this.hasProfile = value;;
    }


    private Boolean? isReportingEntity;

    /**
     * Getter for isReportingEntity;
     * Set this flag to true if this company must file its own tax returns.
    * For users who have Returns enabled, this flag turns on monthly Worksheet generation for the company.
     */
    public Boolean? getisReportingEntity() {;
        return this.isReportingEntity;;
    }

    /**
     * Setter for isReportingEntity;
     * Set this flag to true if this company must file its own tax returns.
    * For users who have Returns enabled, this flag turns on monthly Worksheet generation for the company.
     */
    public void setisReportingEntity(Boolean? value) {;
        this.isReportingEntity = value;;
    }


    private DateTime? sstEffectiveDate;

    /**
     * Getter for sstEffectiveDate;
     * If this company participates in Streamlined Sales Tax, this is the date when the company joined the SST program.
     */
    public DateTime? getsstEffectiveDate() {;
        return this.sstEffectiveDate;;
    }

    /**
     * Setter for sstEffectiveDate;
     * If this company participates in Streamlined Sales Tax, this is the date when the company joined the SST program.
     */
    public void setsstEffectiveDate(DateTime? value) {;
        this.sstEffectiveDate = value;;
    }


    private String defaultCountry;

    /**
     * Getter for defaultCountry;
     * The two character ISO-3166 country code of the default country for this company.
     */
    public String getdefaultCountry() {;
        return this.defaultCountry;;
    }

    /**
     * Setter for defaultCountry;
     * The two character ISO-3166 country code of the default country for this company.
     */
    public void setdefaultCountry(String value) {;
        this.defaultCountry = value;;
    }


    private String baseCurrencyCode;

    /**
     * Getter for baseCurrencyCode;
     * This is the three character ISO-4217 currency code of the default currency used by this company.
     */
    public String getbaseCurrencyCode() {;
        return this.baseCurrencyCode;;
    }

    /**
     * Setter for baseCurrencyCode;
     * This is the three character ISO-4217 currency code of the default currency used by this company.
     */
    public void setbaseCurrencyCode(String value) {;
        this.baseCurrencyCode = value;;
    }


    private RoundingLevelId? roundingLevelId;

    /**
     * Getter for roundingLevelId;
     * Indicates whether this company prefers to round amounts at the document level or line level.
     */
    public RoundingLevelId? getroundingLevelId() {;
        return this.roundingLevelId;;
    }

    /**
     * Setter for roundingLevelId;
     * Indicates whether this company prefers to round amounts at the document level or line level.
     */
    public void setroundingLevelId(RoundingLevelId? value) {;
        this.roundingLevelId = value;;
    }


    private Boolean? warningsEnabled;

    /**
     * Getter for warningsEnabled;
     * Set this value to true to receive warnings in API calls via SOAP.
     */
    public Boolean? getwarningsEnabled() {;
        return this.warningsEnabled;;
    }

    /**
     * Setter for warningsEnabled;
     * Set this value to true to receive warnings in API calls via SOAP.
     */
    public void setwarningsEnabled(Boolean? value) {;
        this.warningsEnabled = value;;
    }


    private Boolean? isTest;

    /**
     * Getter for isTest;
     * Set this flag to true to indicate that this company is a test company.
    * If you have Returns enabled, Test companies will not file tax returns and can be used for validation purposes.
     */
    public Boolean? getisTest() {;
        return this.isTest;;
    }

    /**
     * Setter for isTest;
     * Set this flag to true to indicate that this company is a test company.
    * If you have Returns enabled, Test companies will not file tax returns and can be used for validation purposes.
     */
    public void setisTest(Boolean? value) {;
        this.isTest = value;;
    }


    private TaxDependencyLevelId? taxDependencyLevelId;

    /**
     * Getter for taxDependencyLevelId;
     * Used to apply tax detail dependency at a jurisdiction level.
     */
    public TaxDependencyLevelId? gettaxDependencyLevelId() {;
        return this.taxDependencyLevelId;;
    }

    /**
     * Setter for taxDependencyLevelId;
     * Used to apply tax detail dependency at a jurisdiction level.
     */
    public void settaxDependencyLevelId(TaxDependencyLevelId? value) {;
        this.taxDependencyLevelId = value;;
    }


    private Boolean? inProgress;

    /**
     * Getter for inProgress;
     * Set this value to true to indicate that you are still working to finish configuring this company.
    * While this value is true, no tax reporting will occur and the company will not be usable for transactions.
     */
    public Boolean? getinProgress() {;
        return this.inProgress;;
    }

    /**
     * Setter for inProgress;
     * Set this value to true to indicate that you are still working to finish configuring this company.
    * While this value is true, no tax reporting will occur and the company will not be usable for transactions.
     */
    public void setinProgress(Boolean? value) {;
        this.inProgress = value;;
    }


    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo;
     * Business Identification No
     */
    public String getbusinessIdentificationNo() {;
        return this.businessIdentificationNo;;
    }

    /**
     * Setter for businessIdentificationNo;
     * Business Identification No
     */
    public void setbusinessIdentificationNo(String value) {;
        this.businessIdentificationNo = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    private List<ContactModel> contacts;

    /**
     * Getter for contacts;
     * Optional: A list of contacts defined for this company. To fetch this list, add the query string "?$include=Contacts" to your URL.
     */
    public List<ContactModel> getcontacts() {;
        return this.contacts;;
    }

    /**
     * Setter for contacts;
     * Optional: A list of contacts defined for this company. To fetch this list, add the query string "?$include=Contacts" to your URL.
     */
    public void setcontacts(List<ContactModel> value) {;
        this.contacts = value;;
    }


    private List<ItemModel> items;

    /**
     * Getter for items;
     * Optional: A list of items defined for this company. To fetch this list, add the query string "?$include=Items" to your URL.
     */
    public List<ItemModel> getitems() {;
        return this.items;;
    }

    /**
     * Setter for items;
     * Optional: A list of items defined for this company. To fetch this list, add the query string "?$include=Items" to your URL.
     */
    public void setitems(List<ItemModel> value) {;
        this.items = value;;
    }


    private List<LocationModel> locations;

    /**
     * Getter for locations;
     * Optional: A list of locations defined for this company. To fetch this list, add the query string "?$include=Locations" to your URL.
     */
    public List<LocationModel> getlocations() {;
        return this.locations;;
    }

    /**
     * Setter for locations;
     * Optional: A list of locations defined for this company. To fetch this list, add the query string "?$include=Locations" to your URL.
     */
    public void setlocations(List<LocationModel> value) {;
        this.locations = value;;
    }


    private List<NexusModel> nexus;

    /**
     * Getter for nexus;
     * Optional: A list of nexus defined for this company. To fetch this list, add the query string "?$include=Nexus" to your URL.
     */
    public List<NexusModel> getnexus() {;
        return this.nexus;;
    }

    /**
     * Setter for nexus;
     * Optional: A list of nexus defined for this company. To fetch this list, add the query string "?$include=Nexus" to your URL.
     */
    public void setnexus(List<NexusModel> value) {;
        this.nexus = value;;
    }


    private List<SettingModel> settings;

    /**
     * Getter for settings;
     * Optional: A list of settings defined for this company. To fetch this list, add the query string "?$include=Settings" to your URL.
     */
    public List<SettingModel> getsettings() {;
        return this.settings;;
    }

    /**
     * Setter for settings;
     * Optional: A list of settings defined for this company. To fetch this list, add the query string "?$include=Settings" to your URL.
     */
    public void setsettings(List<SettingModel> value) {;
        this.settings = value;;
    }


    private List<TaxCodeModel> taxCodes;

    /**
     * Getter for taxCodes;
     * Optional: A list of tax codes defined for this company. To fetch this list, add the query string "?$include=TaxCodes" to your URL.
     */
    public List<TaxCodeModel> gettaxCodes() {;
        return this.taxCodes;;
    }

    /**
     * Setter for taxCodes;
     * Optional: A list of tax codes defined for this company. To fetch this list, add the query string "?$include=TaxCodes" to your URL.
     */
    public void settaxCodes(List<TaxCodeModel> value) {;
        this.taxCodes = value;;
    }


    private List<TaxRuleModel> taxRules;

    /**
     * Getter for taxRules;
     * Optional: A list of tax rules defined for this company. To fetch this list, add the query string "?$include=TaxRules" to your URL.
     */
    public List<TaxRuleModel> gettaxRules() {;
        return this.taxRules;;
    }

    /**
     * Setter for taxRules;
     * Optional: A list of tax rules defined for this company. To fetch this list, add the query string "?$include=TaxRules" to your URL.
     */
    public void settaxRules(List<TaxRuleModel> value) {;
        this.taxRules = value;;
    }


    private List<UPCModel> upcs;

    /**
     * Getter for upcs;
     * Optional: A list of UPCs defined for this company. To fetch this list, add the query string "?$include=UPCs" to your URL.
     */
    public List<UPCModel> getupcs() {;
        return this.upcs;;
    }

    /**
     * Setter for upcs;
     * Optional: A list of UPCs defined for this company. To fetch this list, add the query string "?$include=UPCs" to your URL.
     */
    public void setupcs(List<UPCModel> value) {;
        this.upcs = value;;
    }


    /**
     * Returns a JSON string representation of CompanyModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
