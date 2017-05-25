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
 * Represents estimated financial results from responding to a tax notice.
 */
public class NoticeFinanceModel {


    private Int32? id;

    /**
     * Getter for id;
     * 
     */
    public Int32? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * 
     */
    public void setid(Int32? value) {;
        this.id = value;;
    }


    private Int32? noticeId;

    /**
     * Getter for noticeId;
     * 
     */
    public Int32? getnoticeId() {;
        return this.noticeId;;
    }

    /**
     * Setter for noticeId;
     * 
     */
    public void setnoticeId(Int32? value) {;
        this.noticeId = value;;
    }


    private DateTime? noticeDate;

    /**
     * Getter for noticeDate;
     * 
     */
    public DateTime? getnoticeDate() {;
        return this.noticeDate;;
    }

    /**
     * Setter for noticeDate;
     * 
     */
    public void setnoticeDate(DateTime? value) {;
        this.noticeDate = value;;
    }


    private DateTime? dueDate;

    /**
     * Getter for dueDate;
     * 
     */
    public DateTime? getdueDate() {;
        return this.dueDate;;
    }

    /**
     * Setter for dueDate;
     * 
     */
    public void setdueDate(DateTime? value) {;
        this.dueDate = value;;
    }


    private String noticeNumber;

    /**
     * Getter for noticeNumber;
     * 
     */
    public String getnoticeNumber() {;
        return this.noticeNumber;;
    }

    /**
     * Setter for noticeNumber;
     * 
     */
    public void setnoticeNumber(String value) {;
        this.noticeNumber = value;;
    }


    private Decimal? taxDue;

    /**
     * Getter for taxDue;
     * 
     */
    public Decimal? gettaxDue() {;
        return this.taxDue;;
    }

    /**
     * Setter for taxDue;
     * 
     */
    public void settaxDue(Decimal? value) {;
        this.taxDue = value;;
    }


    private Decimal? penalty;

    /**
     * Getter for penalty;
     * 
     */
    public Decimal? getpenalty() {;
        return this.penalty;;
    }

    /**
     * Setter for penalty;
     * 
     */
    public void setpenalty(Decimal? value) {;
        this.penalty = value;;
    }


    private Decimal? interest;

    /**
     * Getter for interest;
     * 
     */
    public Decimal? getinterest() {;
        return this.interest;;
    }

    /**
     * Setter for interest;
     * 
     */
    public void setinterest(Decimal? value) {;
        this.interest = value;;
    }


    private Decimal? credits;

    /**
     * Getter for credits;
     * 
     */
    public Decimal? getcredits() {;
        return this.credits;;
    }

    /**
     * Setter for credits;
     * 
     */
    public void setcredits(Decimal? value) {;
        this.credits = value;;
    }


    private Decimal? taxAbated;

    /**
     * Getter for taxAbated;
     * 
     */
    public Decimal? gettaxAbated() {;
        return this.taxAbated;;
    }

    /**
     * Setter for taxAbated;
     * 
     */
    public void settaxAbated(Decimal? value) {;
        this.taxAbated = value;;
    }


    private Decimal? customerPenalty;

    /**
     * Getter for customerPenalty;
     * 
     */
    public Decimal? getcustomerPenalty() {;
        return this.customerPenalty;;
    }

    /**
     * Setter for customerPenalty;
     * 
     */
    public void setcustomerPenalty(Decimal? value) {;
        this.customerPenalty = value;;
    }


    private Decimal? customerInterest;

    /**
     * Getter for customerInterest;
     * 
     */
    public Decimal? getcustomerInterest() {;
        return this.customerInterest;;
    }

    /**
     * Setter for customerInterest;
     * 
     */
    public void setcustomerInterest(Decimal? value) {;
        this.customerInterest = value;;
    }


    private Decimal? cspFeeRefund;

    /**
     * Getter for cspFeeRefund;
     * 
     */
    public Decimal? getcspFeeRefund() {;
        return this.cspFeeRefund;;
    }

    /**
     * Setter for cspFeeRefund;
     * 
     */
    public void setcspFeeRefund(Decimal? value) {;
        this.cspFeeRefund = value;;
    }


    private String fileName;

    /**
     * Getter for fileName;
     * resourceFileId
     */
    public String getfileName() {;
        return this.fileName;;
    }

    /**
     * Setter for fileName;
     * resourceFileId
     */
    public void setfileName(String value) {;
        this.fileName = value;;
    }


    private Int64? resourceFileId;

    /**
     * Getter for resourceFileId;
     * resourceFileId
     */
    public Int64? getresourceFileId() {;
        return this.resourceFileId;;
    }

    /**
     * Setter for resourceFileId;
     * resourceFileId
     */
    public void setresourceFileId(Int64? value) {;
        this.resourceFileId = value;;
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


    private ResourceFileUploadRequestModel attachmentUploadRequest;

    /**
     * Getter for attachmentUploadRequest;
     * An attachment to the finance detail
     */
    public ResourceFileUploadRequestModel getattachmentUploadRequest() {;
        return this.attachmentUploadRequest;;
    }

    /**
     * Setter for attachmentUploadRequest;
     * An attachment to the finance detail
     */
    public void setattachmentUploadRequest(ResourceFileUploadRequestModel value) {;
        this.attachmentUploadRequest = value;;
    }


    /**
     * Returns a JSON string representation of NoticeFinanceModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
