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
 * A MultiDocument transaction represents a sale or purchase that occurred between more than two companies.
* 
* A traditional transaction requires exactly two parties: a seller and a buyer. MultiDocument transactions can
* involve a marketplace of vendors, each of which contributes some portion of the final transaction. Within
* a MultiDocument transaction, each individual buyer and seller pair are matched up and converted to a separate
* document. This separation of documents allows each seller to file their taxes separately.
 */
public class MultiDocumentModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this MultiDocument object.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this MultiDocument object.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number of the AvaTax customer account that created this MultiDocument object.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number of the AvaTax customer account that created this MultiDocument object.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private String code;

    /**
     * Getter for code
     *
     * The transaction code of the MultiDocument transaction.
    * 
    * All individual transactions within this MultiDocument object will have this code as a prefix.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The transaction code of the MultiDocument transaction.
    * 
    * All individual transactions within this MultiDocument object will have this code as a prefix.
     */
    public void setCode(String value) {
        this.code = value;
    }


    private DocumentType type;

    /**
     * Getter for type
     *
     * Indicates the type of MultiDocument transaction. Common values are:
    * 
    * * SalesOrder - An estimate that is not permanently recorded
    * * SalesInvoice - An invoice that can be reported on a tax return
    * 
    * For more information about document types, see [DocumentType](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/DocumentType/)
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Indicates the type of MultiDocument transaction. Common values are:
    * 
    * * SalesOrder - An estimate that is not permanently recorded
    * * SalesInvoice - An invoice that can be reported on a tax return
    * 
    * For more information about document types, see [DocumentType](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/DocumentType/)
     */
    public void setType(DocumentType value) {
        this.type = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The user ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date/time when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date/time when this record was created.
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


    private ArrayList<TransactionModel> documents;

    /**
     * Getter for documents
     *
     * A separate document will exist for each unique combination of buyer and seller in this MultiDocument transaction.
     */
    public ArrayList<TransactionModel> getDocuments() {
        return this.documents;
    }

    /**
     * Setter for documents
     *
     * A separate document will exist for each unique combination of buyer and seller in this MultiDocument transaction.
     */
    public void setDocuments(ArrayList<TransactionModel> value) {
        this.documents = value;
    }


    /**
     * Returns a JSON string representation of MultiDocumentModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
