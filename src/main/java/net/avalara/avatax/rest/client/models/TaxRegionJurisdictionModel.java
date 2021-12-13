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
 * The tax region jurisdiction model.
 */
public class TaxRegionJurisdictionModel {


    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId
     *
     * The id of the jurisdiction.
	 * 
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId
     *
     * The id of the jurisdiction.
     */
    public void setJurisdictionId(Integer value) {
        this.jurisdictionId = value;
    }

    private Integer taxRegionId;

    /**
     * Getter for taxRegionId
     *
     * The id of the tax region.
	 * 
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId
     *
     * The id of the tax region.
     */
    public void setTaxRegionId(Integer value) {
        this.taxRegionId = value;
    }

    private Integer jurisdictionLevelId;

    /**
     * Getter for jurisdictionLevelId
     *
     * The id of the jurisdiction level.
	 * 
     */
    public Integer getJurisdictionLevelId() {
        return this.jurisdictionLevelId;
    }

    /**
     * Setter for jurisdictionLevelId
     *
     * The id of the jurisdiction level.
     */
    public void setJurisdictionLevelId(Integer value) {
        this.jurisdictionLevelId = value;
    }

    private String rockName;

    /**
     * Getter for rockName
     *
     * The rock name.
	 * 
     */
    public String getRockName() {
        return this.rockName;
    }

    /**
     * Setter for rockName
     *
     * The rock name.
     */
    public void setRockName(String value) {
        this.rockName = value;
    }

    private Integer reportLevel;

    /**
     * Getter for reportLevel
     *
     * The report level.
	 * 
     */
    public Integer getReportLevel() {
        return this.reportLevel;
    }

    /**
     * Setter for reportLevel
     *
     * The report level.
     */
    public void setReportLevel(Integer value) {
        this.reportLevel = value;
    }

    private String stateAssignedCode;

    /**
     * Getter for stateAssignedCode
     *
     * The state assigned code.
	 * 
     */
    public String getStateAssignedCode() {
        return this.stateAssignedCode;
    }

    /**
     * Setter for stateAssignedCode
     *
     * The state assigned code.
     */
    public void setStateAssignedCode(String value) {
        this.stateAssignedCode = value;
    }

    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * The id of the tax authority.
	 * 
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * The id of the tax authority.
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }

    private String signatureCode;

    /**
     * Getter for signatureCode
     *
     * The signature code.
	 * 
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode
     *
     * The signature code.
     */
    public void setSignatureCode(String value) {
        this.signatureCode = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date in which this tax region jurisdiction starts to take effect.
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date in which this tax region jurisdiction starts to take effect.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date in which this tax region jurisdiction stops to take effect.
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date in which this tax region jurisdiction stops to take effect.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of TaxRegionJurisdictionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
