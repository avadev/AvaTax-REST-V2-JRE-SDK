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
 * API response for classification settings, including optimistic versioning and pipeline state.
 */
public class ClassificationSettingsOutputModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Company that owns the settings row.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Company that owns the settings row.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String mode;

    /**
     * Getter for mode
     *
     * Current classification mode.
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * Setter for mode
     *
     * Current classification mode.
     */
    public void setMode(String value) {
        this.mode = value;
    }

    private ClassificationCriteriaModel criteria;

    /**
     * Getter for criteria
     *
     * 
     */
    public ClassificationCriteriaModel getCriteria() {
        return this.criteria;
    }

    /**
     * Setter for criteria
     *
     * 
     */
    public void setCriteria(ClassificationCriteriaModel value) {
        this.criteria = value;
    }

    private CountryScopeModel countryScope;

    /**
     * Getter for countryScope
     *
     * 
     */
    public CountryScopeModel getCountryScope() {
        return this.countryScope;
    }

    /**
     * Setter for countryScope
     *
     * 
     */
    public void setCountryScope(CountryScopeModel value) {
        this.countryScope = value;
    }

    private Integer settingsVersion;

    /**
     * Getter for settingsVersion
     *
     * Monotonic settings version; increments when IMS updates the row.
     */
    public Integer getSettingsVersion() {
        return this.settingsVersion;
    }

    /**
     * Setter for settingsVersion
     *
     * Monotonic settings version; increments when IMS updates the row.
     */
    public void setSettingsVersion(Integer value) {
        this.settingsVersion = value;
    }

    private String processingState;

    /**
     * Getter for processingState
     *
     * `created` immediately after create/update from this API; downstream may set `processing` then `completed`.
     */
    public String getProcessingState() {
        return this.processingState;
    }

    /**
     * Setter for processingState
     *
     * `created` immediately after create/update from this API; downstream may set `processing` then `completed`.
     */
    public void setProcessingState(String value) {
        this.processingState = value;
    }

    private Integer processingVersion;

    /**
     * Getter for processingVersion
     *
     * Processing attempt counter aligned with downstream jobs.
     */
    public Integer getProcessingVersion() {
        return this.processingVersion;
    }

    /**
     * Setter for processingVersion
     *
     * Processing attempt counter aligned with downstream jobs.
     */
    public void setProcessingVersion(Integer value) {
        this.processingVersion = value;
    }

    private Date processingStartedDate;

    /**
     * Getter for processingStartedDate
     *
     * Set when IMS create/update last wrote the row (enters `created`).
     */
    public Date getProcessingStartedDate() {
        return this.processingStartedDate;
    }

    /**
     * Setter for processingStartedDate
     *
     * Set when IMS create/update last wrote the row (enters `created`).
     */
    public void setProcessingStartedDate(Date value) {
        this.processingStartedDate = value;
    }

    private Date processingCompletedDate;

    /**
     * Getter for processingCompletedDate
     *
     * Set by the downstream completion service when state becomes `completed`; null until then.
     */
    public Date getProcessingCompletedDate() {
        return this.processingCompletedDate;
    }

    /**
     * Setter for processingCompletedDate
     *
     * Set by the downstream completion service when state becomes `completed`; null until then.
     */
    public void setProcessingCompletedDate(Date value) {
        this.processingCompletedDate = value;
    }

    private String processingNote;

    /**
     * Getter for processingNote
     *
     * Optional pipeline note (`processingnote` on `dbo.itemclassificationsettings`).
     */
    public String getProcessingNote() {
        return this.processingNote;
    }

    /**
     * Setter for processingNote
     *
     * Optional pipeline note (`processingnote` on `dbo.itemclassificationsettings`).
     */
    public void setProcessingNote(String value) {
        this.processingNote = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * User id that created the row.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * User id that created the row.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * UTC creation timestamp.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * UTC creation timestamp.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * User id for the last modification.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * User id for the last modification.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * UTC last modification timestamp.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * UTC last modification timestamp.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    /**
     * Returns a JSON string representation of ClassificationSettingsOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
