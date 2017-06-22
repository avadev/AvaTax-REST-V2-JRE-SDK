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
 * @version    17.6.0-89
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a declaration of nexus within a particular taxing jurisdiction.
 */
public class NexusModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this declaration of nexus.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this declaration of nexus.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that declared nexus.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that declared nexus.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * The two character ISO-3166 country code of the country in which this company declared nexus.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two character ISO-3166 country code of the country in which this company declared nexus.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * The two or three character ISO region code of the region, state, or province in which this company declared nexus.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The two or three character ISO region code of the region, state, or province in which this company declared nexus.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private JurisTypeId jurisTypeId;

    /**
     * Getter for jurisTypeId
     *
     * The jurisdiction type of the jurisdiction in which this company declared nexus.
     */
    public JurisTypeId getJurisTypeId() {
        return this.jurisTypeId;
    }

    /**
     * Setter for jurisTypeId
     *
     * The jurisdiction type of the jurisdiction in which this company declared nexus.
     */
    public void setJurisTypeId(JurisTypeId value) {
        this.jurisTypeId = value;
    }


    private String jurisCode;

    /**
     * Getter for jurisCode
     *
     * The code identifying the jurisdiction in which this company declared nexus.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * The code identifying the jurisdiction in which this company declared nexus.
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }


    private String jurisName;

    /**
     * Getter for jurisName
     *
     * The common name of the jurisdiction in which this company declared nexus.
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The common name of the jurisdiction in which this company declared nexus.
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date when this nexus began. If not known, set to null.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date when this nexus began. If not known, set to null.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * If this nexus will end or has ended on a specific date, set this to the date when this nexus ends.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * If this nexus will end or has ended on a specific date, set this to the date when this nexus ends.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private String shortName;

    /**
     * Getter for shortName
     *
     * The short name of the jurisdiction.
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Setter for shortName
     *
     * The short name of the jurisdiction.
     */
    public void setShortName(String value) {
        this.shortName = value;
    }


    private String signatureCode;

    /**
     * Getter for signatureCode
     *
     * The signature code of the boundary region as defined by Avalara.
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode
     *
     * The signature code of the boundary region as defined by Avalara.
     */
    public void setSignatureCode(String value) {
        this.signatureCode = value;
    }


    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo
     *
     * The state assigned number of this jurisdiction.
     */
    public String getStateAssignedNo() {
        return this.stateAssignedNo;
    }

    /**
     * Setter for stateAssignedNo
     *
     * The state assigned number of this jurisdiction.
     */
    public void setStateAssignedNo(String value) {
        this.stateAssignedNo = value;
    }


    private NexusTypeId nexusTypeId;

    /**
     * Getter for nexusTypeId
     *
     * (DEPRECATED) The type of nexus that this company is declaring.
    * Please use NexusTaxTypeGroupId instead.
     */
    public NexusTypeId getNexusTypeId() {
        return this.nexusTypeId;
    }

    /**
     * Setter for nexusTypeId
     *
     * (DEPRECATED) The type of nexus that this company is declaring.
    * Please use NexusTaxTypeGroupId instead.
     */
    public void setNexusTypeId(NexusTypeId value) {
        this.nexusTypeId = value;
    }


    private Sourcing sourcing;

    /**
     * Getter for sourcing
     *
     * Indicates whether this nexus is defined as origin or destination nexus.
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing
     *
     * Indicates whether this nexus is defined as origin or destination nexus.
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
     */
    public Boolean getHasLocalNexus() {
        return this.hasLocalNexus;
    }

    /**
     * Setter for hasLocalNexus
     *
     * True if you are also declaring local nexus within this jurisdiction.
    * Many U.S. states have options for declaring nexus in local jurisdictions as well as within the state.
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
     */
    public LocalNexusTypeId getLocalNexusTypeId() {
        return this.localNexusTypeId;
    }

    /**
     * Setter for localNexusTypeId
     *
     * If you are declaring local nexus within this jurisdiction, this indicates whether you are declaring only 
    * a specified list of local jurisdictions, all state-administered local jurisdictions, or all local jurisdictions.
     */
    public void setLocalNexusTypeId(LocalNexusTypeId value) {
        this.localNexusTypeId = value;
    }


    private Boolean hasPermanentEstablishment;

    /**
     * Getter for hasPermanentEstablishment
     *
     * Set this value to true if your company has a permanent establishment within this jurisdiction.
     */
    public Boolean getHasPermanentEstablishment() {
        return this.hasPermanentEstablishment;
    }

    /**
     * Setter for hasPermanentEstablishment
     *
     * Set this value to true if your company has a permanent establishment within this jurisdiction.
     */
    public void setHasPermanentEstablishment(Boolean value) {
        this.hasPermanentEstablishment = value;
    }


    private String taxId;

    /**
     * Getter for taxId
     *
     * Optional - the tax identification number under which you declared nexus.
     */
    public String getTaxId() {
        return this.taxId;
    }

    /**
     * Setter for taxId
     *
     * Optional - the tax identification number under which you declared nexus.
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }


    private Boolean streamlinedSalesTax;

    /**
     * Getter for streamlinedSalesTax
     *
     * For the United States, this flag indicates whether this particular nexus falls within a U.S. State that participates 
    * in the Streamlined Sales Tax program. For countries other than the US, this flag is null.
     */
    public Boolean getStreamlinedSalesTax() {
        return this.streamlinedSalesTax;
    }

    /**
     * Setter for streamlinedSalesTax
     *
     * For the United States, this flag indicates whether this particular nexus falls within a U.S. State that participates 
    * in the Streamlined Sales Tax program. For countries other than the US, this flag is null.
     */
    public void setStreamlinedSalesTax(Boolean value) {
        this.streamlinedSalesTax = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    private String nexusTaxTypeGroup;

    /**
     * Getter for nexusTaxTypeGroup
     *
     * The type of nexus that this company is declaring.Replaces NexusTypeId.
    * Use /api/v2/definitions/nexustaxtypegroup for a list of tax type groups.
     */
    public String getNexusTaxTypeGroup() {
        return this.nexusTaxTypeGroup;
    }

    /**
     * Setter for nexusTaxTypeGroup
     *
     * The type of nexus that this company is declaring.Replaces NexusTypeId.
    * Use /api/v2/definitions/nexustaxtypegroup for a list of tax type groups.
     */
    public void setNexusTaxTypeGroup(String value) {
        this.nexusTaxTypeGroup = value;
    }


    /**
     * Returns a JSON string representation of NexusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
