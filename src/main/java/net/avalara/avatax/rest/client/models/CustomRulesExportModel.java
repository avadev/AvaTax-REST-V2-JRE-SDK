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
 * A portable export envelope containing the custom rules (tax rules, custom rules, and
* advanced rules) matched by an ExportCustomRules request. This envelope can be re-imported
* into another company or account using the CreateCustomRulesBatch endpoint.
 */
public class CustomRulesExportModel {


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
     * The UTC timestamp when the rules were exported.
     */
    public Date getExportedAt() {
        return this.exportedAt;
    }

    /**
     * Setter for exportedAt
     *
     * The UTC timestamp when the rules were exported.
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

    private String customRuleFilter;

    /**
     * Getter for customRuleFilter
     *
     * The custom-rule-specific filter used to produce the export, if any.
     */
    public String getCustomRuleFilter() {
        return this.customRuleFilter;
    }

    /**
     * Setter for customRuleFilter
     *
     * The custom-rule-specific filter used to produce the export, if any.
     */
    public void setCustomRuleFilter(String value) {
        this.customRuleFilter = value;
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

    private Integer customRuleCount;

    /**
     * Getter for customRuleCount
     *
     * The number of custom rules contained in this payload.
     */
    public Integer getCustomRuleCount() {
        return this.customRuleCount;
    }

    /**
     * Setter for customRuleCount
     *
     * The number of custom rules contained in this payload.
     */
    public void setCustomRuleCount(Integer value) {
        this.customRuleCount = value;
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
     * The traditional tax rules matched by this export.
     */
    public ArrayList<TaxRuleModel> getTaxRules() {
        return this.taxRules;
    }

    /**
     * Setter for taxRules
     *
     * The traditional tax rules matched by this export.
     */
    public void setTaxRules(ArrayList<TaxRuleModel> value) {
        this.taxRules = value;
    }

    private ArrayList<CustomRuleOutputModel> customRules;

    /**
     * Getter for customRules
     *
     * The custom (graph-based) rules matched by this export.
     */
    public ArrayList<CustomRuleOutputModel> getCustomRules() {
        return this.customRules;
    }

    /**
     * Setter for customRules
     *
     * The custom (graph-based) rules matched by this export.
     */
    public void setCustomRules(ArrayList<CustomRuleOutputModel> value) {
        this.customRules = value;
    }

    private ArrayList<AdvancedRuleExecutionModel> advancedRules;

    /**
     * Getter for advancedRules
     *
     * The advanced rules matched by this export.
     */
    public ArrayList<AdvancedRuleExecutionModel> getAdvancedRules() {
        return this.advancedRules;
    }

    /**
     * Setter for advancedRules
     *
     * The advanced rules matched by this export.
     */
    public void setAdvancedRules(ArrayList<AdvancedRuleExecutionModel> value) {
        this.advancedRules = value;
    }

    /**
     * Returns a JSON string representation of CustomRulesExportModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
