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
 * A Dynamic Rule is a type of a custom rule which is similar to an Advanced Rule, but
* has a graph-based execution flow made up of modular Conditions and Actions that may
* be linked to one or more traditional custom Tax Rules.
 */
public class DynamicRuleOutputModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique identifier for the execution
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique identifier for the execution
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private DynamicRuleDefinitionOutputModel definition;

    /**
     * Getter for definition
     *
     * 
     */
    public DynamicRuleDefinitionOutputModel getDefinition() {
        return this.definition;
    }

    /**
     * Setter for definition
     *
     * 
     */
    public void setDefinition(DynamicRuleDefinitionOutputModel value) {
        this.definition = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The company ID of the execution
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The company ID of the execution
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the execution
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the execution
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * The description of the execution
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description of the execution
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The start date when the execution is valid
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The start date when the execution is valid
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The end date when the execution is valid
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date when the execution is valid
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean enabled;

    /**
     * Getter for enabled
     *
     * Whether the execution is enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for enabled
     *
     * Whether the execution is enabled
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    private Boolean continueOnError;

    /**
     * Getter for continueOnError
     *
     * Whether to continue execution if this rule fails
     */
    public Boolean getContinueOnError() {
        return this.continueOnError;
    }

    /**
     * Setter for continueOnError
     *
     * Whether to continue execution if this rule fails
     */
    public void setContinueOnError(Boolean value) {
        this.continueOnError = value;
    }

    private Integer version;

    /**
     * Getter for version
     *
     * Version number of the rule
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Setter for version
     *
     * Version number of the rule
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when the execution was created
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when the execution was created
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The user who created the execution
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user who created the execution
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date when the execution was last modified
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date when the execution was last modified
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user who last modified the execution
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user who last modified the execution
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
