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
 */

/**
 * Cycle Safe Expiration results.
 */
public class FilingsCheckupAuthorityModel {


    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * Unique ID of the tax authority
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * Unique ID of the tax authority
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }


    private String locationCode;

    /**
     * Getter for locationCode
     *
     * Location Code of the tax authority
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode
     *
     * Location Code of the tax authority
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }


    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName
     *
     * Name of the tax authority
     */
    public String getTaxAuthorityName() {
        return this.taxAuthorityName;
    }

    /**
     * Setter for taxAuthorityName
     *
     * Name of the tax authority
     */
    public void setTaxAuthorityName(String value) {
        this.taxAuthorityName = value;
    }


    private Integer taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId
     *
     * Type Id of the tax authority
     */
    public Integer getTaxAuthorityTypeId() {
        return this.taxAuthorityTypeId;
    }

    /**
     * Setter for taxAuthorityTypeId
     *
     * Type Id of the tax authority
     */
    public void setTaxAuthorityTypeId(Integer value) {
        this.taxAuthorityTypeId = value;
    }


    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId
     *
     * Jurisdiction Id of the tax authority
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId
     *
     * Jurisdiction Id of the tax authority
     */
    public void setJurisdictionId(Integer value) {
        this.jurisdictionId = value;
    }


    private BigDecimal tax;

    /**
     * Getter for tax
     *
     * Amount of tax collected in this tax authority
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax
     *
     * Amount of tax collected in this tax authority
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }


    private String taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * Tax Type collected in the tax authority
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * Tax Type collected in the tax authority
     */
    public void setTaxTypeId(String value) {
        this.taxTypeId = value;
    }


    private ArrayList<FilingsCheckupSuggestedFormModel> suggestedForms;

    /**
     * Getter for suggestedForms
     *
     * Suggested forms to file due to tax collected
     */
    public ArrayList<FilingsCheckupSuggestedFormModel> getSuggestedForms() {
        return this.suggestedForms;
    }

    /**
     * Setter for suggestedForms
     *
     * Suggested forms to file due to tax collected
     */
    public void setSuggestedForms(ArrayList<FilingsCheckupSuggestedFormModel> value) {
        this.suggestedForms = value;
    }


    /**
     * Returns a JSON string representation of FilingsCheckupAuthorityModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
