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
 * 
 */
public class CompanyUserDefinedFieldModel {


    private Long id;

    /**
     * Getter for id
     *
     * The id of the datasource.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The id of the datasource.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The id of the company to which the datasource belongs to.
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

    private String name;

    /**
     * Getter for name
     *
     * The extractor/connector id.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The extractor/connector id.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String friendlyName;

    /**
     * Getter for friendlyName
     *
     * The unique ID number of this connection.
     */
    public String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Setter for friendlyName
     *
     * The unique ID number of this connection.
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    private UserDefinedFieldDataType dataType;

    /**
     * Getter for dataType
     *
     * The unique ID number of this connection.
     */
    public UserDefinedFieldDataType getDataType() {
        return this.dataType;
    }

    /**
     * Setter for dataType
     *
     * The unique ID number of this connection.
     */
    public void setDataType(UserDefinedFieldDataType value) {
        this.dataType = value;
    }

    private UserDefinedFieldType userDefinedFieldType;

    /**
     * Getter for userDefinedFieldType
     *
     * The category of user defined type For Example: Document level or Line level UDF.
     */
    public UserDefinedFieldType getUserDefinedFieldType() {
        return this.userDefinedFieldType;
    }

    /**
     * Setter for userDefinedFieldType
     *
     * The category of user defined type For Example: Document level or Line level UDF.
     */
    public void setUserDefinedFieldType(UserDefinedFieldType value) {
        this.userDefinedFieldType = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
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

    /**
     * Returns a JSON string representation of CompanyUserDefinedFieldModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
