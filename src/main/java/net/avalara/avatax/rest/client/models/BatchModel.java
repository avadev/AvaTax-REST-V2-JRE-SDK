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
 * Represents a batch of uploaded documents.
 */
public class BatchModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this batch.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this batch.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * The user-friendly readable name for this batch.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The user-friendly readable name for this batch.
     */
    public void setName(String value) {
        this.name = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The Account ID number of the account that owns this batch.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The Account ID number of the account that owns this batch.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The Company ID number of the company that owns this batch.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The Company ID number of the company that owns this batch.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private BatchType type;

    /**
     * Getter for type
     *
     * The type of this batch.
     */
    public BatchType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of this batch.
     */
    public void setType(BatchType value) {
        this.type = value;
    }


    private BatchStatus status;

    /**
     * Getter for status
     *
     * This batch's current processing status
     */
    public BatchStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * This batch's current processing status
     */
    public void setStatus(BatchStatus value) {
        this.status = value;
    }


    private String options;

    /**
     * Getter for options
     *
     * Any optional flags provided for this batch
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for options
     *
     * Any optional flags provided for this batch
     */
    public void setOptions(String value) {
        this.options = value;
    }


    private String batchAgent;

    /**
     * Getter for batchAgent
     *
     * The agent used to create this batch
     */
    public String getBatchAgent() {
        return this.batchAgent;
    }

    /**
     * Setter for batchAgent
     *
     * The agent used to create this batch
     */
    public void setBatchAgent(String value) {
        this.batchAgent = value;
    }


    private Date startedDate;

    /**
     * Getter for startedDate
     *
     * The date/time when this batch started processing
     */
    public Date getStartedDate() {
        return this.startedDate;
    }

    /**
     * Setter for startedDate
     *
     * The date/time when this batch started processing
     */
    public void setStartedDate(Date value) {
        this.startedDate = value;
    }


    private Integer recordCount;

    /**
     * Getter for recordCount
     *
     * The number of records in this batch; determined by the server
     */
    public Integer getRecordCount() {
        return this.recordCount;
    }

    /**
     * Setter for recordCount
     *
     * The number of records in this batch; determined by the server
     */
    public void setRecordCount(Integer value) {
        this.recordCount = value;
    }


    private Integer currentRecord;

    /**
     * Getter for currentRecord
     *
     * The current record being processed
     */
    public Integer getCurrentRecord() {
        return this.currentRecord;
    }

    /**
     * Setter for currentRecord
     *
     * The current record being processed
     */
    public void setCurrentRecord(Integer value) {
        this.currentRecord = value;
    }


    private Date completedDate;

    /**
     * Getter for completedDate
     *
     * The date/time when this batch was completely processed
     */
    public Date getCompletedDate() {
        return this.completedDate;
    }

    /**
     * Setter for completedDate
     *
     * The date/time when this batch was completely processed
     */
    public void setCompletedDate(Date value) {
        this.completedDate = value;
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


    private ArrayList<BatchFileModel> files;

    /**
     * Getter for files
     *
     * The list of files contained in this batch.
     */
    public ArrayList<BatchFileModel> getFiles() {
        return this.files;
    }

    /**
     * Setter for files
     *
     * The list of files contained in this batch.
     */
    public void setFiles(ArrayList<BatchFileModel> value) {
        this.files = value;
    }


    /**
     * Returns a JSON string representation of BatchModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
