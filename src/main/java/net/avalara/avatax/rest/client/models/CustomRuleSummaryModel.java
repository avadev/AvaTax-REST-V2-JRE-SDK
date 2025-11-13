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
 * Base model for custom rules that can be either DynamicRuleModel or AdvancedRuleExecutionModel or TaxRuleModel
 */
public class CustomRuleSummaryModel {


    private String id;

    /**
     * Getter for id
     *
     * The unique identifier for this custom rule summary
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique identifier for this custom rule summary
     */
    public void setId(String value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The company ID that the custom rule belongs to
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The company ID that the custom rule belongs to
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private CustomRuleStatus status;

    /**
     * Getter for status
     *
     * The status of the custom rule
     */
    public CustomRuleStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of the custom rule
     */
    public void setStatus(CustomRuleStatus value) {
        this.status = value;
    }

    private CustomRuleType type;

    /**
     * Getter for type
     *
     * The type of custom rule
     */
    public CustomRuleType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of custom rule
     */
    public void setType(CustomRuleType value) {
        this.type = value;
    }

    private CustomRuleSubtype subtype;

    /**
     * Getter for subtype
     *
     * The subtypes of the custom rule
     */
    public CustomRuleSubtype getSubtype() {
        return this.subtype;
    }

    /**
     * Setter for subtype
     *
     * The subtypes of the custom rule
     */
    public void setSubtype(CustomRuleSubtype value) {
        this.subtype = value;
    }

    private ArrayList<String> subtypeDescription;

    /**
     * Getter for subtypeDescription
     *
     * The description of the subtypes of the custom rule
     */
    public ArrayList<String> getSubtypeDescription() {
        return this.subtypeDescription;
    }

    /**
     * Setter for subtypeDescription
     *
     * The description of the subtypes of the custom rule
     */
    public void setSubtypeDescription(ArrayList<String> value) {
        this.subtypeDescription = value;
    }

    private ArrayList<String> country;

    /**
     * Getter for country
     *
     * Name or ISO 3166 codes identifying the region where this rule will apply.
     */
    public ArrayList<String> getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Name or ISO 3166 codes identifying the region where this rule will apply.
     */
    public void setCountry(ArrayList<String> value) {
        this.country = value;
    }

    private ArrayList<String> region;

    /**
     * Getter for region
     *
     * Name or ISO 3166 code identifying the country where this rule will apply.
     */
    public ArrayList<String> getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Name or ISO 3166 code identifying the country where this rule will apply.
     */
    public void setRegion(ArrayList<String> value) {
        this.region = value;
    }

    private ArrayList<String> taxCode;

    /**
     * Getter for taxCode
     *
     * For rules that apply to a specific tax code only, this specifies which tax code is affected by this rule.
     */
    public ArrayList<String> getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * For rules that apply to a specific tax code only, this specifies which tax code is affected by this rule.
     */
    public void setTaxCode(ArrayList<String> value) {
        this.taxCode = value;
    }

    private ArrayList<String> taxType;

    /**
     * Getter for taxType
     *
     * Indicates the codes of the tax type that applies to this rule.
     */
    public ArrayList<String> getTaxType() {
        return this.taxType;
    }

    /**
     * Setter for taxType
     *
     * Indicates the codes of the tax type that applies to this rule.
     */
    public void setTaxType(ArrayList<String> value) {
        this.taxType = value;
    }

    private ArrayList<String> entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * The entity use code to which this rule applies.
     */
    public ArrayList<String> getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * The entity use code to which this rule applies.
     */
    public void setEntityUseCode(ArrayList<String> value) {
        this.entityUseCode = value;
    }

    private Integer order;

    /**
     * Getter for order
     *
     * The order of the rule executions (only applies to advanced rules)
     */
    public Integer getOrder() {
        return this.order;
    }

    /**
     * Setter for order
     *
     * The order of the rule executions (only applies to advanced rules)
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The first date at which this rule applies. If null, this rule will apply to all dates prior to the end date.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The first date at which this rule applies. If null, this rule will apply to all dates prior to the end date.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The last date for which this rule applies. If null, this rule will apply to all dates after the effective date.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The last date for which this rule applies. If null, this rule will apply to all dates after the effective date.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date the rule was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date the rule was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date the rule was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date the rule was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private HashMap<String, String> ruleEntity;

    /**
     * Getter for ruleEntity
     *
     * The rule entity data, which can be either a TaxRuleModel, a DynamicRuleModel, or an AdvancedRuleExecutionModel
     */
    public HashMap<String, String> getRuleEntity() {
        return this.ruleEntity;
    }

    /**
     * Setter for ruleEntity
     *
     * The rule entity data, which can be either a TaxRuleModel, a DynamicRuleModel, or an AdvancedRuleExecutionModel
     */
    public void setRuleEntity(HashMap<String, String> value) {
        this.ruleEntity = value;
    }

    /**
     * Returns a JSON string representation of CustomRuleSummaryModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
