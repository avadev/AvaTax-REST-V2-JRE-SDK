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
 * Reponse model for the returns specific nexus fetch API
 */
public class NexusForReturnsModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The nexus's id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The nexus's id
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Company Id
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Company Id
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private Integer assignedToCountryId;

    /**
     * Getter for assignedToCountryId
     *
     * For region nexus, the assigned id for the country.
    * For country nexus, null.
     */
    public Integer getAssignedToCountryId() {
        return this.assignedToCountryId;
    }

    /**
     * Setter for assignedToCountryId
     *
     * For region nexus, the assigned id for the country.
    * For country nexus, null.
     */
    public void setAssignedToCountryId(Integer value) {
        this.assignedToCountryId = value;
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

    private String jurisName;

    /**
     * Getter for jurisName
     *
     * Jurisdiction Name
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * Jurisdiction Name
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }

    private String nexusTaxTypeGroup;

    /**
     * Getter for nexusTaxTypeGroup
     *
     * Nexus Tax Type Group
     */
    public String getNexusTaxTypeGroup() {
        return this.nexusTaxTypeGroup;
    }

    /**
     * Setter for nexusTaxTypeGroup
     *
     * Nexus Tax Type Group
     */
    public void setNexusTaxTypeGroup(String value) {
        this.nexusTaxTypeGroup = value;
    }

    private NexusTypeId nexusTypeId;

    /**
     * Getter for nexusTypeId
     *
     * Nexus Type
     */
    public NexusTypeId getNexusTypeId() {
        return this.nexusTypeId;
    }

    /**
     * Setter for nexusTypeId
     *
     * Nexus Type
     */
    public void setNexusTypeId(NexusTypeId value) {
        this.nexusTypeId = value;
    }

    private Boolean hasLocalNexus;

    /**
     * Getter for hasLocalNexus
     *
     * Has Local Nexus?
     */
    public Boolean getHasLocalNexus() {
        return this.hasLocalNexus;
    }

    /**
     * Setter for hasLocalNexus
     *
     * Has Local Nexus?
     */
    public void setHasLocalNexus(Boolean value) {
        this.hasLocalNexus = value;
    }

    private String localNexusType;

    /**
     * Getter for localNexusType
     *
     * Local Nexus Tax Type or null if no local nexus
     */
    public String getLocalNexusType() {
        return this.localNexusType;
    }

    /**
     * Setter for localNexusType
     *
     * Local Nexus Tax Type or null if no local nexus
     */
    public void setLocalNexusType(String value) {
        this.localNexusType = value;
    }

    private Integer sstNexusId;

    /**
     * Getter for sstNexusId
     *
     * The id of the SST nexus record if there is one.
     */
    public Integer getSstNexusId() {
        return this.sstNexusId;
    }

    /**
     * Setter for sstNexusId
     *
     * The id of the SST nexus record if there is one.
     */
    public void setSstNexusId(Integer value) {
        this.sstNexusId = value;
    }

    private String sstType;

    /**
     * Getter for sstType
     *
     * If has SST Nexus, the nexus type id of the nexus
     */
    public String getSstType() {
        return this.sstType;
    }

    /**
     * Setter for sstType
     *
     * If has SST Nexus, the nexus type id of the nexus
     */
    public void setSstType(String value) {
        this.sstType = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * Min the effective Date can be
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * Min the effective Date can be
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * Max the end date can be
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * Max the end date can be
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Date sstEffectiveDate;

    /**
     * Getter for sstEffectiveDate
     *
     * SST Effective Date
     */
    public Date getSstEffectiveDate() {
        return this.sstEffectiveDate;
    }

    /**
     * Setter for sstEffectiveDate
     *
     * SST Effective Date
     */
    public void setSstEffectiveDate(Date value) {
        this.sstEffectiveDate = value;
    }

    private Date sstEndDate;

    /**
     * Getter for sstEndDate
     *
     * SST End Date
     */
    public Date getSstEndDate() {
        return this.sstEndDate;
    }

    /**
     * Setter for sstEndDate
     *
     * SST End Date
     */
    public void setSstEndDate(Date value) {
        this.sstEndDate = value;
    }

    private Boolean isRemoteSeller;

    /**
     * Getter for isRemoteSeller
     *
     * Has nexus parameter IsRemoteSeller?
     */
    public Boolean getIsRemoteSeller() {
        return this.isRemoteSeller;
    }

    /**
     * Setter for isRemoteSeller
     *
     * Has nexus parameter IsRemoteSeller?
     */
    public void setIsRemoteSeller(Boolean value) {
        this.isRemoteSeller = value;
    }

    /**
     * Returns a JSON string representation of NexusForReturnsModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
