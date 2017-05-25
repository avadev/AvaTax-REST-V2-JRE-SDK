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


    private Integer id;

    /**
     * Getter for id
     *
     * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * 
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer noticeId;

    /**
     * Getter for noticeId
     *
     * 
     */
    public Integer getNoticeId() {
        return this.noticeId;
    }

    /**
     * Setter for noticeId
     *
     * 
     */
    public void setNoticeId(Integer value) {
        this.noticeId = value;
    }


    private Instant noticeDate;

    /**
     * Getter for noticeDate
     *
     * 
     */
    public Instant getNoticeDate() {
        return this.noticeDate;
    }

    /**
     * Setter for noticeDate
     *
     * 
     */
    public void setNoticeDate(Instant value) {
        this.noticeDate = value;
    }


    private Instant dueDate;

    /**
     * Getter for dueDate
     *
     * 
     */
    public Instant getDueDate() {
        return this.dueDate;
    }

    /**
     * Setter for dueDate
     *
     * 
     */
    public void setDueDate(Instant value) {
        this.dueDate = value;
    }


    private string noticeNumber;

    /**
     * Getter for noticeNumber
     *
     * 
     */
    public string getNoticeNumber() {
        return this.noticeNumber;
    }

    /**
     * Setter for noticeNumber
     *
     * 
     */
    public void setNoticeNumber(string value) {
        this.noticeNumber = value;
    }


    private Decimal taxDue;

    /**
     * Getter for taxDue
     *
     * 
     */
    public Decimal getTaxDue() {
        return this.taxDue;
    }

    /**
     * Setter for taxDue
     *
     * 
     */
    public void setTaxDue(Decimal value) {
        this.taxDue = value;
    }


    private Decimal penalty;

    /**
     * Getter for penalty
     *
     * 
     */
    public Decimal getPenalty() {
        return this.penalty;
    }

    /**
     * Setter for penalty
     *
     * 
     */
    public void setPenalty(Decimal value) {
        this.penalty = value;
    }


    private Decimal interest;

    /**
     * Getter for interest
     *
     * 
     */
    public Decimal getInterest() {
        return this.interest;
    }

    /**
     * Setter for interest
     *
     * 
     */
    public void setInterest(Decimal value) {
        this.interest = value;
    }


    private Decimal credits;

    /**
     * Getter for credits
     *
     * 
     */
    public Decimal getCredits() {
        return this.credits;
    }

    /**
     * Setter for credits
     *
     * 
     */
    public void setCredits(Decimal value) {
        this.credits = value;
    }


    private Decimal taxAbated;

    /**
     * Getter for taxAbated
     *
     * 
     */
    public Decimal getTaxAbated() {
        return this.taxAbated;
    }

    /**
     * Setter for taxAbated
     *
     * 
     */
    public void setTaxAbated(Decimal value) {
        this.taxAbated = value;
    }


    private Decimal customerPenalty;

    /**
     * Getter for customerPenalty
     *
     * 
     */
    public Decimal getCustomerPenalty() {
        return this.customerPenalty;
    }

    /**
     * Setter for customerPenalty
     *
     * 
     */
    public void setCustomerPenalty(Decimal value) {
        this.customerPenalty = value;
    }


    private Decimal customerInterest;

    /**
     * Getter for customerInterest
     *
     * 
     */
    public Decimal getCustomerInterest() {
        return this.customerInterest;
    }

    /**
     * Setter for customerInterest
     *
     * 
     */
    public void setCustomerInterest(Decimal value) {
        this.customerInterest = value;
    }


    private Decimal cspFeeRefund;

    /**
     * Getter for cspFeeRefund
     *
     * 
     */
    public Decimal getCspFeeRefund() {
        return this.cspFeeRefund;
    }

    /**
     * Setter for cspFeeRefund
     *
     * 
     */
    public void setCspFeeRefund(Decimal value) {
        this.cspFeeRefund = value;
    }


    private string fileName;

    /**
     * Getter for fileName
     *
     * resourceFileId
     */
    public string getFileName() {
        return this.fileName;
    }

    /**
     * Setter for fileName
     *
     * resourceFileId
     */
    public void setFileName(string value) {
        this.fileName = value;
    }


    private Long resourceFileId;

    /**
     * Getter for resourceFileId
     *
     * resourceFileId
     */
    public Long getResourceFileId() {
        return this.resourceFileId;
    }

    /**
     * Setter for resourceFileId
     *
     * resourceFileId
     */
    public void setResourceFileId(Long value) {
        this.resourceFileId = value;
    }


    private Instant createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Instant getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Instant value) {
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


    private Instant modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Instant getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Instant value) {
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


    private ResourceFileUploadRequestModel attachmentUploadRequest;

    /**
     * Getter for attachmentUploadRequest
     *
     * An attachment to the finance detail
     */
    public ResourceFileUploadRequestModel getAttachmentUploadRequest() {
        return this.attachmentUploadRequest;
    }

    /**
     * Setter for attachmentUploadRequest
     *
     * An attachment to the finance detail
     */
    public void setAttachmentUploadRequest(ResourceFileUploadRequestModel value) {
        this.attachmentUploadRequest = value;
    }


    /**
     * Returns a JSON string representation of NoticeFinanceModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
