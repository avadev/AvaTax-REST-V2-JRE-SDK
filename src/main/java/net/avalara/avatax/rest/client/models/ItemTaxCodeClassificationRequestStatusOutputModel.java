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
 * Represents a tax code classification request status output model
 */
public class ItemTaxCodeClassificationRequestStatusOutputModel {


    private Integer requestId;

    /**
     * Getter for requestId
     *
     * The unique Request Id of classification request
     */
    public Integer getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for requestId
     *
     * The unique Request Id of classification request
     */
    public void setRequestId(Integer value) {
        this.requestId = value;
    }

    private ClassificationDetailsModel classificationDetails;

    /**
     * Getter for classificationDetails
     *
     * 
     */
    public ClassificationDetailsModel getClassificationDetails() {
        return this.classificationDetails;
    }

    /**
     * Setter for classificationDetails
     *
     * 
     */
    public void setClassificationDetails(ClassificationDetailsModel value) {
        this.classificationDetails = value;
    }

    private Integer totalItems;

    /**
     * Getter for totalItems
     *
     * The total number of items for which classification is initiated in request
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * Setter for totalItems
     *
     * The total number of items for which classification is initiated in request
     */
    public void setTotalItems(Integer value) {
        this.totalItems = value;
    }

    private String status;

    /**
     * Getter for status
     *
     * The status of classification request
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of classification request
     */
    public void setStatus(String value) {
        this.status = value;
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

    /**
     * Returns a JSON string representation of ItemTaxCodeClassificationRequestStatusOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
