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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a batch of uploaded documents.
 */
public class BatchModel {


    private Int32? id;

    /**
     * Getter for id;
     * The unique ID number of this batch.
     */
    public Int32? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this batch.
     */
    public void setid(Int32? value) {;
        this.id = value;;
    }


    private String name;

    /**
     * Getter for name;
     * The user-friendly readable name for this batch.
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The user-friendly readable name for this batch.
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private Int32? accountId;

    /**
     * Getter for accountId;
     * The Account ID number of the account that owns this batch.
     */
    public Int32? getaccountId() {;
        return this.accountId;;
    }

    /**
     * Setter for accountId;
     * The Account ID number of the account that owns this batch.
     */
    public void setaccountId(Int32? value) {;
        this.accountId = value;;
    }


    private Int32? companyId;

    /**
     * Getter for companyId;
     * The Company ID number of the company that owns this batch.
     */
    public Int32? getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The Company ID number of the company that owns this batch.
     */
    public void setcompanyId(Int32? value) {;
        this.companyId = value;;
    }


    private BatchType type;

    /**
     * Getter for type;
     * The type of this batch.
     */
    public BatchType gettype() {;
        return this.type;;
    }

    /**
     * Setter for type;
     * The type of this batch.
     */
    public void settype(BatchType value) {;
        this.type = value;;
    }


    private BatchStatus? status;

    /**
     * Getter for status;
     * This batch's current processing status
     */
    public BatchStatus? getstatus() {;
        return this.status;;
    }

    /**
     * Setter for status;
     * This batch's current processing status
     */
    public void setstatus(BatchStatus? value) {;
        this.status = value;;
    }


    private String options;

    /**
     * Getter for options;
     * Any optional flags provided for this batch
     */
    public String getoptions() {;
        return this.options;;
    }

    /**
     * Setter for options;
     * Any optional flags provided for this batch
     */
    public void setoptions(String value) {;
        this.options = value;;
    }


    private String batchAgent;

    /**
     * Getter for batchAgent;
     * The agent used to create this batch
     */
    public String getbatchAgent() {;
        return this.batchAgent;;
    }

    /**
     * Setter for batchAgent;
     * The agent used to create this batch
     */
    public void setbatchAgent(String value) {;
        this.batchAgent = value;;
    }


    private DateTime? startedDate;

    /**
     * Getter for startedDate;
     * The date/time when this batch started processing
     */
    public DateTime? getstartedDate() {;
        return this.startedDate;;
    }

    /**
     * Setter for startedDate;
     * The date/time when this batch started processing
     */
    public void setstartedDate(DateTime? value) {;
        this.startedDate = value;;
    }


    private Int32? recordCount;

    /**
     * Getter for recordCount;
     * The number of records in this batch; determined by the server
     */
    public Int32? getrecordCount() {;
        return this.recordCount;;
    }

    /**
     * Setter for recordCount;
     * The number of records in this batch; determined by the server
     */
    public void setrecordCount(Int32? value) {;
        this.recordCount = value;;
    }


    private Int32? currentRecord;

    /**
     * Getter for currentRecord;
     * The current record being processed
     */
    public Int32? getcurrentRecord() {;
        return this.currentRecord;;
    }

    /**
     * Setter for currentRecord;
     * The current record being processed
     */
    public void setcurrentRecord(Int32? value) {;
        this.currentRecord = value;;
    }


    private DateTime? completedDate;

    /**
     * Getter for completedDate;
     * The date/time when this batch was completely processed
     */
    public DateTime? getcompletedDate() {;
        return this.completedDate;;
    }

    /**
     * Setter for completedDate;
     * The date/time when this batch was completely processed
     */
    public void setcompletedDate(DateTime? value) {;
        this.completedDate = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    private List<BatchFileModel> files;

    /**
     * Getter for files;
     * The list of files contained in this batch.
     */
    public List<BatchFileModel> getfiles() {;
        return this.files;;
    }

    /**
     * Setter for files;
     * The list of files contained in this batch.
     */
    public void setfiles(List<BatchFileModel> value) {;
        this.files = value;;
    }


    /**
     * Returns a JSON string representation of BatchModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
