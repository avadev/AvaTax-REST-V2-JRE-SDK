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
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 * Swagger name: AvaTaxClient
 */

/**
 * Represents a declaration of nexus within a particular taxing jurisdiction.
*  
* To create a nexus declaration for your company, you must first call the Definitions API `ListNexus` to obtain a
* list of Avalara-defined nexus. Once you have determined which nexus you wish to declare, you should customize
* only the user-selectable fields in this object.
*  
* The user selectable fields for the nexus object are `companyId`, `effectiveDate`, `endDate`, `localNexusTypeId`,
* `taxId`, `nexusTypeId`, `hasPermanentEstablishment`, and `isSellerImporterOfRecord`.
*  
* When calling `CreateNexus` or `UpdateNexus`, all values in your nexus object except for the user-selectable fields
* must match an Avalara-defined system nexus object. You can retrieve a list of Avalara-defined system nexus objects
* by calling `ListNexus`. If any data does not match, AvaTax may not recognize your nexus declaration.
 */
public class NexusModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this declaration of nexus.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this declaration of nexus.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that declared nexus.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that declared nexus.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * Name or ISO 3166 code identifying the country in which this company declared nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Name or ISO 3166 code identifying the country in which this company declared nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * Name or ISO 3166 code identifying the region within the country.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Name or ISO 3166 code identifying the region within the country.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private JurisTypeId jurisTypeId;

    /**
     * Getter for jurisTypeId
     *
     * DEPRECATED - Date: 12/20/2017, Version: 18.1, Message: Please use jurisdictionTypeId instead.
    * The jurisdiction type of the jurisdiction in which this company declared nexus.
	 * 
     */
    public JurisTypeId getJurisTypeId() {
        return this.jurisTypeId;
    }

    /**
     * Setter for jurisTypeId
     *
     * DEPRECATED - Date: 12/20/2017, Version: 18.1, Message: Please use jurisdictionTypeId instead.
    * The jurisdiction type of the jurisdiction in which this company declared nexus.
     */
    public void setJurisTypeId(JurisTypeId value) {
        this.jurisTypeId = value;
    }

    private JurisdictionType jurisdictionTypeId;

    /**
     * Getter for jurisdictionTypeId
     *
     * The type of the jurisdiction in which this company declared nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public JurisdictionType getJurisdictionTypeId() {
        return this.jurisdictionTypeId;
    }

    /**
     * Setter for jurisdictionTypeId
     *
     * The type of the jurisdiction in which this company declared nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setJurisdictionTypeId(JurisdictionType value) {
        this.jurisdictionTypeId = value;
    }

    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * The code identifying the jurisdiction in which this company declared nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * The code identifying the jurisdiction in which this company declared nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }

    private String jurisName;

    /**
     * Getter for jurisName
     *
     * The common name of the jurisdiction in which this company declared nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The common name of the jurisdiction in which this company declared nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date when this nexus began. If not known, set to null.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date when this nexus began. If not known, set to null.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * If this nexus will end or has ended on a specific date, set this to the date when this nexus ends.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * If this nexus will end or has ended on a specific date, set this to the date when this nexus ends.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private String shortName;

    /**
     * Getter for shortName
     *
     * The short name of the jurisdiction.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Setter for shortName
     *
     * The short name of the jurisdiction.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    private String signatureCode;

    /**
     * Getter for signatureCode
     *
     * The signature code of the boundary region as defined by Avalara.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode
     *
     * The signature code of the boundary region as defined by Avalara.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setSignatureCode(String value) {
        this.signatureCode = value;
    }

    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo
     *
     * The state assigned number of this jurisdiction.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public String getStateAssignedNo() {
        return this.stateAssignedNo;
    }

    /**
     * Setter for stateAssignedNo
     *
     * The state assigned number of this jurisdiction.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setStateAssignedNo(String value) {
        this.stateAssignedNo = value;
    }

    private NexusTypeId nexusTypeId;

    /**
     * Getter for nexusTypeId
     *
     * The type of nexus that this company is declaring.
    *  
    * If you are voluntarily declaring nexus in a jurisdiction, you should select `SalesOrSellersUseTax` for your
    * nexus type option. This option allows you to calculate tax correctly whether you are selling in-state or
    * shipping from an out-of-state location.
    *  
    * If you are legally obligated to declare nexus due to physical presence or other sufficient nexus, you
    * should select `SalesTax`. This indicates that, as a legal requirement, your company must always collect
    * and remit full sales tax in this jurisdiction.
    *  
    * If you are participating in the Streamlined Sales Tax program, your SST administrator will select nexus
    * settings for you in all SST jurisdictions. Do not select any SST options by yourself.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
	 * 
     */
    public NexusTypeId getNexusTypeId() {
        return this.nexusTypeId;
    }

    /**
     * Setter for nexusTypeId
     *
     * The type of nexus that this company is declaring.
    *  
    * If you are voluntarily declaring nexus in a jurisdiction, you should select `SalesOrSellersUseTax` for your
    * nexus type option. This option allows you to calculate tax correctly whether you are selling in-state or
    * shipping from an out-of-state location.
    *  
    * If you are legally obligated to declare nexus due to physical presence or other sufficient nexus, you
    * should select `SalesTax`. This indicates that, as a legal requirement, your company must always collect
    * and remit full sales tax in this jurisdiction.
    *  
    * If you are participating in the Streamlined Sales Tax program, your SST administrator will select nexus
    * settings for you in all SST jurisdictions. Do not select any SST options by yourself.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
     */
    public void setNexusTypeId(NexusTypeId value) {
        this.nexusTypeId = value;
    }

    private Sourcing sourcing;

    /**
     * Getter for sourcing
     *
     * Indicates whether this nexus is defined as origin or destination nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing
     *
     * Indicates whether this nexus is defined as origin or destination nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setSourcing(Sourcing value) {
        this.sourcing = value;
    }

    private Boolean hasLocalNexus;

    /**
     * Getter for hasLocalNexus
     *
     * True if you are also declaring local nexus within this jurisdiction.
    * Many U.S. states have options for declaring nexus in local jurisdictions as well as within the state.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public Boolean getHasLocalNexus() {
        return this.hasLocalNexus;
    }

    /**
     * Setter for hasLocalNexus
     *
     * True if you are also declaring local nexus within this jurisdiction.
    * Many U.S. states have options for declaring nexus in local jurisdictions as well as within the state.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setHasLocalNexus(Boolean value) {
        this.hasLocalNexus = value;
    }

    private LocalNexusTypeId localNexusTypeId;

    /**
     * Getter for localNexusTypeId
     *
     * If you are declaring local nexus within this jurisdiction, this indicates whether you are declaring only
    * a specified list of local jurisdictions, all state-administered local jurisdictions, or all local jurisdictions.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
	 * 
     */
    public LocalNexusTypeId getLocalNexusTypeId() {
        return this.localNexusTypeId;
    }

    /**
     * Setter for localNexusTypeId
     *
     * If you are declaring local nexus within this jurisdiction, this indicates whether you are declaring only
    * a specified list of local jurisdictions, all state-administered local jurisdictions, or all local jurisdictions.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
     */
    public void setLocalNexusTypeId(LocalNexusTypeId value) {
        this.localNexusTypeId = value;
    }

    private Boolean hasPermanentEstablishment;

    /**
     * Getter for hasPermanentEstablishment
     *
     * Set this value to true if your company has a permanent establishment within this jurisdiction.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
	 * 
     */
    public Boolean getHasPermanentEstablishment() {
        return this.hasPermanentEstablishment;
    }

    /**
     * Setter for hasPermanentEstablishment
     *
     * Set this value to true if your company has a permanent establishment within this jurisdiction.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
     */
    public void setHasPermanentEstablishment(Boolean value) {
        this.hasPermanentEstablishment = value;
    }

    private String taxId;

    /**
     * Getter for taxId
     *
     * Optional - the tax identification number under which you declared nexus.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
	 * 
     */
    public String getTaxId() {
        return this.taxId;
    }

    /**
     * Setter for taxId
     *
     * Optional - the tax identification number under which you declared nexus.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    private Boolean streamlinedSalesTax;

    /**
     * Getter for streamlinedSalesTax
     *
     * DEPRECATED - Date: 4/29/2017, Version: 19.4, Message: Please use isSSTActive instead.
    * For the United States, this flag indicates whether this particular nexus falls within a U.S. State that participates
    * in the Streamlined Sales Tax program. For countries other than the US, this flag is null.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public Boolean getStreamlinedSalesTax() {
        return this.streamlinedSalesTax;
    }

    /**
     * Setter for streamlinedSalesTax
     *
     * DEPRECATED - Date: 4/29/2017, Version: 19.4, Message: Please use isSSTActive instead.
    * For the United States, this flag indicates whether this particular nexus falls within a U.S. State that participates
    * in the Streamlined Sales Tax program. For countries other than the US, this flag is null.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setStreamlinedSalesTax(Boolean value) {
        this.streamlinedSalesTax = value;
    }

    private Boolean isSSTActive;

    /**
     * Getter for isSSTActive
     *
     * For the United States, this flag indicates whether this particular nexus falls within a U.S. State that participates
    * in the Streamlined Sales Tax program and if the account associated with the Nexus has an active AvaTaxCsp subscription.
    * For countries other than the US, this flag is null.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public Boolean getIsSSTActive() {
        return this.isSSTActive;
    }

    /**
     * Setter for isSSTActive
     *
     * For the United States, this flag indicates whether this particular nexus falls within a U.S. State that participates
    * in the Streamlined Sales Tax program and if the account associated with the Nexus has an active AvaTaxCsp subscription.
    * For countries other than the US, this flag is null.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setIsSSTActive(Boolean value) {
        this.isSSTActive = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
	 * 
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
	 * 
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
	 * 
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
	 * 
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
    *  
    * This field is defined automatically when you declare nexus. You do not need to provide a value for this field.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    private String taxTypeGroup;

    /**
     * Getter for taxTypeGroup
     *
     * The type group of nexus that this company is declaring
    * Use [ListTaxTypeGroups](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListTaxTypeGroups/) API for a list of nexus tax type groups.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
    * NOTE: This optional field will trigger nexus subtype lookup when populated. When using make sure TaxTypeGroup matches corresponding NexusTaxTypeGroup
	 * 
     */
    public String getTaxTypeGroup() {
        return this.taxTypeGroup;
    }

    /**
     * Setter for taxTypeGroup
     *
     * The type group of nexus that this company is declaring
    * Use [ListTaxTypeGroups](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListTaxTypeGroups/) API for a list of nexus tax type groups.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
    * NOTE: This optional field will trigger nexus subtype lookup when populated. When using make sure TaxTypeGroup matches corresponding NexusTaxTypeGroup
     */
    public void setTaxTypeGroup(String value) {
        this.taxTypeGroup = value;
    }

    private String nexusTaxTypeGroup;

    /**
     * Getter for nexusTaxTypeGroup
     *
     * The type of nexus that this company is declaring.Replaces NexusTypeId.
    * Use [ListNexusTaxTypeGroups](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListNexusTaxTypeGroups/) API for a list of nexus tax type groups.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public String getNexusTaxTypeGroup() {
        return this.nexusTaxTypeGroup;
    }

    /**
     * Setter for nexusTaxTypeGroup
     *
     * The type of nexus that this company is declaring.Replaces NexusTypeId.
    * Use [ListNexusTaxTypeGroups](https://developer.avalara.com/api-reference/avatax/rest/v2/methods/Definitions/ListNexusTaxTypeGroups/) API for a list of nexus tax type groups.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setNexusTaxTypeGroup(String value) {
        this.nexusTaxTypeGroup = value;
    }

    private Long taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * A unique ID number of the tax authority that is associated with this nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
	 * 
     */
    public Long getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * A unique ID number of the tax authority that is associated with this nexus.
    *  
    * This field is defined by Avalara. All Avalara-defined fields must match an Avalara-defined nexus object found by calling `ListNexus`.
     */
    public void setTaxAuthorityId(Long value) {
        this.taxAuthorityId = value;
    }

    private Boolean isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord
     *
     * For nexus declarations at the country level, specifies whether this company is considered the importer of record in this nexus region.
    *  
    * Some taxes only apply if the seller is the importer of record for a product. In cases where companies are working together to
    * ship products, there may be mutual agreement as to which company is the entity designated as importer of record. The importer
    * of record will then be the company designated to pay taxes marked as being obligated to the importer of record.
    *  
    * Set this value to `true` to consider your company as the importer of record and collect these taxes. Leave this value as false
    * or null and taxes will be calculated as if your company is not the importer of record.
    *  
    * This value may also be set during each transaction API call. See `CreateTransaction()` for more information.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
	 * 
     */
    public Boolean getIsSellerImporterOfRecord() {
        return this.isSellerImporterOfRecord;
    }

    /**
     * Setter for isSellerImporterOfRecord
     *
     * For nexus declarations at the country level, specifies whether this company is considered the importer of record in this nexus region.
    *  
    * Some taxes only apply if the seller is the importer of record for a product. In cases where companies are working together to
    * ship products, there may be mutual agreement as to which company is the entity designated as importer of record. The importer
    * of record will then be the company designated to pay taxes marked as being obligated to the importer of record.
    *  
    * Set this value to `true` to consider your company as the importer of record and collect these taxes. Leave this value as false
    * or null and taxes will be calculated as if your company is not the importer of record.
    *  
    * This value may also be set during each transaction API call. See `CreateTransaction()` for more information.
    *  
    * This field is user-selectable and should be provided when creating or updating a nexus object.
     */
    public void setIsSellerImporterOfRecord(Boolean value) {
        this.isSellerImporterOfRecord = value;
    }

    private String taxName;

    /**
     * Getter for taxName
     *
     * A description of corresponding tax type applied to the nexus.
    *  
    * When a custom nexus is created, it'll have to be matched to a system nexus to be validated successfully. The matched system nexus has a
    * field to describe the tax type applied to it, that field will be copied over to the nexus that is being created.
    *  
    * This field is defined by Avalara. Its main purpose is to give a simple description of the tax type associated with the nexus so
    * users have a better understanding of the nexus when it is displayed.
	 * 
     */
    public String getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName
     *
     * A description of corresponding tax type applied to the nexus.
    *  
    * When a custom nexus is created, it'll have to be matched to a system nexus to be validated successfully. The matched system nexus has a
    * field to describe the tax type applied to it, that field will be copied over to the nexus that is being created.
    *  
    * This field is defined by Avalara. Its main purpose is to give a simple description of the tax type associated with the nexus so
    * users have a better understanding of the nexus when it is displayed.
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    private ArrayList<NexusParameterDetailModel> parameters;

    /**
     * Getter for parameters
     *
     * List of nexus parameters.
	 * 
     */
    public ArrayList<NexusParameterDetailModel> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * List of nexus parameters.
     */
    public void setParameters(ArrayList<NexusParameterDetailModel> value) {
        this.parameters = value;
    }

    private Boolean taxableNexus;

    /**
     * Getter for taxableNexus
     *
     * Shows if system nexus records are associated with tax collection
	 * 
     */
    public Boolean getTaxableNexus() {
        return this.taxableNexus;
    }

    /**
     * Setter for taxableNexus
     *
     * Shows if system nexus records are associated with tax collection
     */
    public void setTaxableNexus(Boolean value) {
        this.taxableNexus = value;
    }

    /**
     * Returns a JSON string representation of NexusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
