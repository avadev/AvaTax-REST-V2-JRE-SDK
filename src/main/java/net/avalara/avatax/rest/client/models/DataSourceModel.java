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
 * Data source object
 */
public class DataSourceModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The id of the datasource.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The id of the datasource.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The id of the company to which the datasource belongs to.
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The id of the company to which the datasource belongs to.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String source;

    /**
     * Getter for source
     *
     * The extractor/connector id.
	 * 
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Setter for source
     *
     * The extractor/connector id.
     */
    public void setSource(String value) {
        this.source = value;
    }

    private String instance;

    /**
     * Getter for instance
     *
     * The unique ID number of this connection.
	 * 
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * Setter for instance
     *
     * The unique ID number of this connection.
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    private Boolean isEnabled;

    /**
     * Getter for isEnabled
     *
     * The connection using the connection_id is enabled. The customer is responsible to enable or disable.
	 * 
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Setter for isEnabled
     *
     * The connection using the connection_id is enabled. The customer is responsible to enable or disable.
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    private Boolean isSynced;

    /**
     * Getter for isSynced
     *
     * If all the information has been transferred from the extractor to the database.
	 * 
     */
    public Boolean getIsSynced() {
        return this.isSynced;
    }

    /**
     * Setter for isSynced
     *
     * If all the information has been transferred from the extractor to the database.
     */
    public void setIsSynced(Boolean value) {
        this.isSynced = value;
    }

    private Boolean isAuthorized;

    /**
     * Getter for isAuthorized
     *
     * True if this data source is authorized.
	 * 
     */
    public Boolean getIsAuthorized() {
        return this.isAuthorized;
    }

    /**
     * Setter for isAuthorized
     *
     * True if this data source is authorized.
     */
    public void setIsAuthorized(Boolean value) {
        this.isAuthorized = value;
    }

    private Date lastSyncedDate;

    /**
     * Getter for lastSyncedDate
     *
     * The date when the information was last synched.
	 * 
     */
    public Date getLastSyncedDate() {
        return this.lastSyncedDate;
    }

    /**
     * Setter for lastSyncedDate
     *
     * The date when the information was last synched.
     */
    public void setLastSyncedDate(Date value) {
        this.lastSyncedDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
	 * 
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

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
	 * 
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

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
	 * 
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

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
	 * 
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

    private Date deletedDate;

    /**
     * Getter for deletedDate
     *
     * The date when this record was deleted.
	 * 
     */
    public Date getDeletedDate() {
        return this.deletedDate;
    }

    /**
     * Setter for deletedDate
     *
     * The date when this record was deleted.
     */
    public void setDeletedDate(Date value) {
        this.deletedDate = value;
    }

    private Boolean recalculate;

    /**
     * Getter for recalculate
     *
     * Specifies whether transactions created by this data source needs to re-calculate tax or not
	 * 
     */
    public Boolean getRecalculate() {
        return this.recalculate;
    }

    /**
     * Setter for recalculate
     *
     * Specifies whether transactions created by this data source needs to re-calculate tax or not
     */
    public void setRecalculate(Boolean value) {
        this.recalculate = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Specifies the name of the extractor
	 * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Specifies the name of the extractor
     */
    public void setName(String value) {
        this.name = value;
    }

    private String externalState;

    /**
     * Getter for externalState
     *
     * Specifies any implementation-specific information along with the DataSource.This field has no internal meaning in AvaTax and is purely for the convenience of the DataSource API user
	 * 
     */
    public String getExternalState() {
        return this.externalState;
    }

    /**
     * Setter for externalState
     *
     * Specifies any implementation-specific information along with the DataSource.This field has no internal meaning in AvaTax and is purely for the convenience of the DataSource API user
     */
    public void setExternalState(String value) {
        this.externalState = value;
    }

    /**
     * Returns a JSON string representation of DataSourceModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
