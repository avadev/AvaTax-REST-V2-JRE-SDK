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
 * Represents a create Custom Rules import batch request model. The payload is the Custom Rules
* export envelope (tax rules, dynamic rules, and advanced rules) which is stored as JSON in S3
* and processed downstream by BatchV2.
 */
public class CreateCustomRulesBatchRequestModel {


    private String name;

    /**
     * Getter for name
     *
     * The user-friendly readable name for this batch. Optional - when omitted it is derived
    * from Avalara.AvaTax.AccountServices.Models.v2.CreateCustomRulesBatchRequestModel.kind and Avalara.AvaTax.AccountServices.Models.v2.CreateCustomRulesBatchRequestModel.exportedAt.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The user-friendly readable name for this batch. Optional - when omitted it is derived
    * from Avalara.AvaTax.AccountServices.Models.v2.CreateCustomRulesBatchRequestModel.kind and Avalara.AvaTax.AccountServices.Models.v2.CreateCustomRulesBatchRequestModel.exportedAt.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String kind;

    /**
     * Getter for kind
     *
     * The kind of export this payload represents (e.g. "CustomRulesExport").
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Setter for kind
     *
     * The kind of export this payload represents (e.g. "CustomRulesExport").
     */
    public void setKind(String value) {
        this.kind = value;
    }

    private String schemaVersion;

    /**
     * Getter for schemaVersion
     *
     * The schema version of the export payload.
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * Setter for schemaVersion
     *
     * The schema version of the export payload.
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    private Date exportedAt;

    /**
     * Getter for exportedAt
     *
     * The UTC timestamp when the source rules were exported.
     */
    public Date getExportedAt() {
        return this.exportedAt;
    }

    /**
     * Setter for exportedAt
     *
     * The UTC timestamp when the source rules were exported.
     */
    public void setExportedAt(Date value) {
        this.exportedAt = value;
    }

    private CustomRuleExportUser exportedBy;

    /**
     * Getter for exportedBy
     *
     * 
     */
    public CustomRuleExportUser getExportedBy() {
        return this.exportedBy;
    }

    /**
     * Setter for exportedBy
     *
     * 
     */
    public void setExportedBy(CustomRuleExportUser value) {
        this.exportedBy = value;
    }

    private Long sourceAccountId;

    /**
     * Getter for sourceAccountId
     *
     * The account the rules were exported from.
     */
    public Long getSourceAccountId() {
        return this.sourceAccountId;
    }

    /**
     * Setter for sourceAccountId
     *
     * The account the rules were exported from.
     */
    public void setSourceAccountId(Long value) {
        this.sourceAccountId = value;
    }

    private Integer sourceCompanyId;

    /**
     * Getter for sourceCompanyId
     *
     * The company the rules were exported from.
     */
    public Integer getSourceCompanyId() {
        return this.sourceCompanyId;
    }

    /**
     * Setter for sourceCompanyId
     *
     * The company the rules were exported from.
     */
    public void setSourceCompanyId(Integer value) {
        this.sourceCompanyId = value;
    }

    private String filter;

    /**
     * Getter for filter
     *
     * The overall filter used to produce the export, if any.
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Setter for filter
     *
     * The overall filter used to produce the export, if any.
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    private String taxRuleFilter;

    /**
     * Getter for taxRuleFilter
     *
     * The tax-rule-specific filter used to produce the export, if any.
     */
    public String getTaxRuleFilter() {
        return this.taxRuleFilter;
    }

    /**
     * Setter for taxRuleFilter
     *
     * The tax-rule-specific filter used to produce the export, if any.
     */
    public void setTaxRuleFilter(String value) {
        this.taxRuleFilter = value;
    }

    private String advancedRuleFilter;

    /**
     * Getter for advancedRuleFilter
     *
     * The advanced-rule-specific filter used to produce the export, if any.
     */
    public String getAdvancedRuleFilter() {
        return this.advancedRuleFilter;
    }

    /**
     * Setter for advancedRuleFilter
     *
     * The advanced-rule-specific filter used to produce the export, if any.
     */
    public void setAdvancedRuleFilter(String value) {
        this.advancedRuleFilter = value;
    }

    private String dynamicRuleFilter;

    /**
     * Getter for dynamicRuleFilter
     *
     * The dynamic-rule-specific filter used to produce the export, if any.
     */
    public String getDynamicRuleFilter() {
        return this.dynamicRuleFilter;
    }

    /**
     * Setter for dynamicRuleFilter
     *
     * The dynamic-rule-specific filter used to produce the export, if any.
     */
    public void setDynamicRuleFilter(String value) {
        this.dynamicRuleFilter = value;
    }

    private String orderBy;

    /**
     * Getter for orderBy
     *
     * The order-by clause used to produce the export, if any.
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * Setter for orderBy
     *
     * The order-by clause used to produce the export, if any.
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    private Integer top;

    /**
     * Getter for top
     *
     * The page size used when producing the export.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Setter for top
     *
     * The page size used when producing the export.
     */
    public void setTop(Integer value) {
        this.top = value;
    }

    private Integer skip;

    /**
     * Getter for skip
     *
     * The number of records skipped when producing the export.
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * Setter for skip
     *
     * The number of records skipped when producing the export.
     */
    public void setSkip(Integer value) {
        this.skip = value;
    }

    private Integer totalCount;

    /**
     * Getter for totalCount
     *
     * The total number of rules contained in this payload.
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * Setter for totalCount
     *
     * The total number of rules contained in this payload.
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    private Integer taxRuleCount;

    /**
     * Getter for taxRuleCount
     *
     * The number of traditional tax rules contained in this payload.
     */
    public Integer getTaxRuleCount() {
        return this.taxRuleCount;
    }

    /**
     * Setter for taxRuleCount
     *
     * The number of traditional tax rules contained in this payload.
     */
    public void setTaxRuleCount(Integer value) {
        this.taxRuleCount = value;
    }

    private Integer dynamicRuleCount;

    /**
     * Getter for dynamicRuleCount
     *
     * The number of dynamic rules contained in this payload.
     */
    public Integer getDynamicRuleCount() {
        return this.dynamicRuleCount;
    }

    /**
     * Setter for dynamicRuleCount
     *
     * The number of dynamic rules contained in this payload.
     */
    public void setDynamicRuleCount(Integer value) {
        this.dynamicRuleCount = value;
    }

    private Integer advancedRuleCount;

    /**
     * Getter for advancedRuleCount
     *
     * The number of advanced rules contained in this payload.
     */
    public Integer getAdvancedRuleCount() {
        return this.advancedRuleCount;
    }

    /**
     * Setter for advancedRuleCount
     *
     * The number of advanced rules contained in this payload.
     */
    public void setAdvancedRuleCount(Integer value) {
        this.advancedRuleCount = value;
    }

    private ArrayList<TaxRuleModel> taxRules;

    /**
     * Getter for taxRules
     *
     * The traditional tax rules to import. Stored verbatim so downstream processing receives the
    * exact exported shape.
     */
    public ArrayList<TaxRuleModel> getTaxRules() {
        return this.taxRules;
    }

    /**
     * Setter for taxRules
     *
     * The traditional tax rules to import. Stored verbatim so downstream processing receives the
    * exact exported shape.
     */
    public void setTaxRules(ArrayList<TaxRuleModel> value) {
        this.taxRules = value;
    }

    private ArrayList<DynamicRuleInputModel> dynamicRules;

    /**
     * Getter for dynamicRules
     *
     * The dynamic (graph-based) rules to import. Stored verbatim so downstream processing receives
    * the exact exported shape.
     */
    public ArrayList<DynamicRuleInputModel> getDynamicRules() {
        return this.dynamicRules;
    }

    /**
     * Setter for dynamicRules
     *
     * The dynamic (graph-based) rules to import. Stored verbatim so downstream processing receives
    * the exact exported shape.
     */
    public void setDynamicRules(ArrayList<DynamicRuleInputModel> value) {
        this.dynamicRules = value;
    }

    private ArrayList<AdvancedRuleModel> advancedRules;

    /**
     * Getter for advancedRules
     *
     * The advanced rules to import. Stored verbatim so downstream processing receives the exact
    * exported shape.
     */
    public ArrayList<AdvancedRuleModel> getAdvancedRules() {
        return this.advancedRules;
    }

    /**
     * Setter for advancedRules
     *
     * The advanced rules to import. Stored verbatim so downstream processing receives the exact
    * exported shape.
     */
    public void setAdvancedRules(ArrayList<AdvancedRuleModel> value) {
        this.advancedRules = value;
    }

    /**
     * Returns a JSON string representation of CreateCustomRulesBatchRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
