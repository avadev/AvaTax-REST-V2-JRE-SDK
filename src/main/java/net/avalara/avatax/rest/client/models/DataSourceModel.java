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
 * Data source object
 */
public class DataSourceModel {


    private Integer id;

    /**
     * Getter for id
     *
     * ToDo
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * ToDo
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * ToDo
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * ToDo
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String connectorId;

    /**
     * Getter for connectorId
     *
     * ToDo
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * Setter for connectorId
     *
     * ToDo
     */
    public void setConnectorId(String value) {
        this.connectorId = value;
    }


    private String connectionId;

    /**
     * Getter for connectionId
     *
     * ToDo
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * Setter for connectionId
     *
     * ToDo
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }


    private Boolean isEnabled;

    /**
     * Getter for isEnabled
     *
     * ToDo
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Setter for isEnabled
     *
     * ToDo
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }


    private Boolean isSynced;

    /**
     * Getter for isSynced
     *
     * ToDo
     */
    public Boolean getIsSynced() {
        return this.isSynced;
    }

    /**
     * Setter for isSynced
     *
     * ToDo
     */
    public void setIsSynced(Boolean value) {
        this.isSynced = value;
    }


    private Boolean isAuthorized;

    /**
     * Getter for isAuthorized
     *
     * ToDo
     */
    public Boolean getIsAuthorized() {
        return this.isAuthorized;
    }

    /**
     * Setter for isAuthorized
     *
     * ToDo
     */
    public void setIsAuthorized(Boolean value) {
        this.isAuthorized = value;
    }


    private Date lastSyncedDate;

    /**
     * Getter for lastSyncedDate
     *
     * ToDo
     */
    public Date getLastSyncedDate() {
        return this.lastSyncedDate;
    }

    /**
     * Setter for lastSyncedDate
     *
     * ToDo
     */
    public void setLastSyncedDate(Date value) {
        this.lastSyncedDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * ToDo
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * ToDo
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * ToDo
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * ToDo
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * ToDo
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * ToDo
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * ToDo
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * ToDo
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private Date deletedDate;

    /**
     * Getter for deletedDate
     *
     * ToDo
     */
    public Date getDeletedDate() {
        return this.deletedDate;
    }

    /**
     * Setter for deletedDate
     *
     * ToDo
     */
    public void setDeletedDate(Date value) {
        this.deletedDate = value;
    }


    /**
     * Returns a JSON string representation of DataSourceModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
