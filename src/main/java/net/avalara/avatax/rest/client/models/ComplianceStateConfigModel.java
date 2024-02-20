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
 * A flattened model for State Config.
 */
public class ComplianceStateConfigModel {


    private Long stateConfigId;

    /**
     * Getter for stateConfigId
     *
     * The Id of the StateConfig.
     */
    public Long getStateConfigId() {
        return this.stateConfigId;
    }

    /**
     * Setter for stateConfigId
     *
     * The Id of the StateConfig.
     */
    public void setStateConfigId(Long value) {
        this.stateConfigId = value;
    }

    private Date effDate;

    /**
     * Getter for effDate
     *
     * The Effective Date
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * The Effective Date
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The End Date
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The End Date
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean hasBoundary;

    /**
     * Getter for hasBoundary
     *
     * Has Boundary
     */
    public Boolean getHasBoundary() {
        return this.hasBoundary;
    }

    /**
     * Setter for hasBoundary
     *
     * Has Boundary
     */
    public void setHasBoundary(Boolean value) {
        this.hasBoundary = value;
    }

    private Boolean hasRates;

    /**
     * Getter for hasRates
     *
     * Has Rates
     */
    public Boolean getHasRates() {
        return this.hasRates;
    }

    /**
     * Setter for hasRates
     *
     * Has Rates
     */
    public void setHasRates(Boolean value) {
        this.hasRates = value;
    }

    private Boolean isLocalAdmin;

    /**
     * Getter for isLocalAdmin
     *
     * Is Local Admin
     */
    public Boolean getIsLocalAdmin() {
        return this.isLocalAdmin;
    }

    /**
     * Setter for isLocalAdmin
     *
     * Is Local Admin
     */
    public void setIsLocalAdmin(Boolean value) {
        this.isLocalAdmin = value;
    }

    private Boolean isLocalNexus;

    /**
     * Getter for isLocalNexus
     *
     * Is Local Nexus
     */
    public Boolean getIsLocalNexus() {
        return this.isLocalNexus;
    }

    /**
     * Setter for isLocalNexus
     *
     * Is Local Nexus
     */
    public void setIsLocalNexus(Boolean value) {
        this.isLocalNexus = value;
    }

    private Boolean isSerState;

    /**
     * Getter for isSerState
     *
     * IsSerState
     */
    public Boolean getIsSerState() {
        return this.isSerState;
    }

    /**
     * Setter for isSerState
     *
     * IsSerState
     */
    public void setIsSerState(Boolean value) {
        this.isSerState = value;
    }

    private Integer minBoundaryLevelId;

    /**
     * Getter for minBoundaryLevelId
     *
     * Min Boundary LevelId
     */
    public Integer getMinBoundaryLevelId() {
        return this.minBoundaryLevelId;
    }

    /**
     * Setter for minBoundaryLevelId
     *
     * Min Boundary LevelId
     */
    public void setMinBoundaryLevelId(Integer value) {
        this.minBoundaryLevelId = value;
    }

    private Integer sstStatusId;

    /**
     * Getter for sstStatusId
     *
     * Sst Status Id
     */
    public Integer getSstStatusId() {
        return this.sstStatusId;
    }

    /**
     * Setter for sstStatusId
     *
     * Sst Status Id
     */
    public void setSstStatusId(Integer value) {
        this.sstStatusId = value;
    }

    private String state;

    /**
     * Getter for state
     *
     * Short name of State.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * Short name of State.
     */
    public void setState(String value) {
        this.state = value;
    }

    private String stateFips;

    /**
     * Getter for stateFips
     *
     * StateFips
     */
    public String getStateFips() {
        return this.stateFips;
    }

    /**
     * Setter for stateFips
     *
     * StateFips
     */
    public void setStateFips(String value) {
        this.stateFips = value;
    }

    private String stateName;

    /**
     * Getter for stateName
     *
     * The name of the State.
     */
    public String getStateName() {
        return this.stateName;
    }

    /**
     * Setter for stateName
     *
     * The name of the State.
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    private String boundaryTableBaseName;

    /**
     * Getter for boundaryTableBaseName
     *
     * Boundary Table BaseName
     */
    public String getBoundaryTableBaseName() {
        return this.boundaryTableBaseName;
    }

    /**
     * Setter for boundaryTableBaseName
     *
     * Boundary Table BaseName
     */
    public void setBoundaryTableBaseName(String value) {
        this.boundaryTableBaseName = value;
    }

    private Integer stjCount;

    /**
     * Getter for stjCount
     *
     * STJCount
     */
    public Integer getStjCount() {
        return this.stjCount;
    }

    /**
     * Setter for stjCount
     *
     * STJCount
     */
    public void setStjCount(Integer value) {
        this.stjCount = value;
    }

    private String tsStateId;

    /**
     * Getter for tsStateId
     *
     * TsState Id
     */
    public String getTsStateId() {
        return this.tsStateId;
    }

    /**
     * Setter for tsStateId
     *
     * TsState Id
     */
    public void setTsStateId(String value) {
        this.tsStateId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The name of the country.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The name of the country.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private Integer isJaasEnabled;

    /**
     * Getter for isJaasEnabled
     *
     * IsJaasEnabled
     */
    public Integer getIsJaasEnabled() {
        return this.isJaasEnabled;
    }

    /**
     * Setter for isJaasEnabled
     *
     * IsJaasEnabled
     */
    public void setIsJaasEnabled(Integer value) {
        this.isJaasEnabled = value;
    }

    private Boolean hasSSTBoundary;

    /**
     * Getter for hasSSTBoundary
     *
     * The name of the country.
     */
    public Boolean getHasSSTBoundary() {
        return this.hasSSTBoundary;
    }

    /**
     * Setter for hasSSTBoundary
     *
     * The name of the country.
     */
    public void setHasSSTBoundary(Boolean value) {
        this.hasSSTBoundary = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The name of the country.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The name of the country.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    /**
     * Returns a JSON string representation of ComplianceStateConfigModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
