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
 * Represents a tax code classification request output model
 */
public class ItemTaxCodeClassificationRequestOutputModel {


    private Integer requestId;

    /**
     * Getter for requestId
     *
     * The unique ID of the classification request
     */
    public Integer getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for requestId
     *
     * The unique ID of the classification request
     */
    public void setRequestId(Integer value) {
        this.requestId = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID of the company that created the classification request.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID of the company that created the classification request.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String request;

    /**
     * Getter for request
     *
     * The classification request
     */
    public String getRequest() {
        return this.request;
    }

    /**
     * Setter for request
     *
     * The classification request
     */
    public void setRequest(String value) {
        this.request = value;
    }

    private String status;

    /**
     * Getter for status
     *
     * The status of the classification request
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of the classification request
     */
    public void setStatus(String value) {
        this.status = value;
    }

    private String requestType;

    /**
     * Getter for requestType
     *
     * The request type of the classification request
     */
    public String getRequestType() {
        return this.requestType;
    }

    /**
     * Setter for requestType
     *
     * The request type of the classification request
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this classification request.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this classification request.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date/time when this request was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date/time when this request was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
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
     * Returns a JSON string representation of ItemTaxCodeClassificationRequestOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
