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


    private Date noticeDate;

    /**
     * Getter for noticeDate
     *
     * 
     */
    public Date getNoticeDate() {
        return this.noticeDate;
    }

    /**
     * Setter for noticeDate
     *
     * 
     */
    public void setNoticeDate(Date value) {
        this.noticeDate = value;
    }


    private Date dueDate;

    /**
     * Getter for dueDate
     *
     * 
     */
    public Date getDueDate() {
        return this.dueDate;
    }

    /**
     * Setter for dueDate
     *
     * 
     */
    public void setDueDate(Date value) {
        this.dueDate = value;
    }


    private String noticeNumber;

    /**
     * Getter for noticeNumber
     *
     * 
     */
    public String getNoticeNumber() {
        return this.noticeNumber;
    }

    /**
     * Setter for noticeNumber
     *
     * 
     */
    public void setNoticeNumber(String value) {
        this.noticeNumber = value;
    }


    private BigDecimal taxDue;

    /**
     * Getter for taxDue
     *
     * 
     */
    public BigDecimal getTaxDue() {
        return this.taxDue;
    }

    /**
     * Setter for taxDue
     *
     * 
     */
    public void setTaxDue(BigDecimal value) {
        this.taxDue = value;
    }


    private BigDecimal penalty;

    /**
     * Getter for penalty
     *
     * 
     */
    public BigDecimal getPenalty() {
        return this.penalty;
    }

    /**
     * Setter for penalty
     *
     * 
     */
    public void setPenalty(BigDecimal value) {
        this.penalty = value;
    }


    private BigDecimal interest;

    /**
     * Getter for interest
     *
     * 
     */
    public BigDecimal getInterest() {
        return this.interest;
    }

    /**
     * Setter for interest
     *
     * 
     */
    public void setInterest(BigDecimal value) {
        this.interest = value;
    }


    private BigDecimal credits;

    /**
     * Getter for credits
     *
     * 
     */
    public BigDecimal getCredits() {
        return this.credits;
    }

    /**
     * Setter for credits
     *
     * 
     */
    public void setCredits(BigDecimal value) {
        this.credits = value;
    }


    private BigDecimal taxAbated;

    /**
     * Getter for taxAbated
     *
     * 
     */
    public BigDecimal getTaxAbated() {
        return this.taxAbated;
    }

    /**
     * Setter for taxAbated
     *
     * 
     */
    public void setTaxAbated(BigDecimal value) {
        this.taxAbated = value;
    }


    private BigDecimal customerPenalty;

    /**
     * Getter for customerPenalty
     *
     * 
     */
    public BigDecimal getCustomerPenalty() {
        return this.customerPenalty;
    }

    /**
     * Setter for customerPenalty
     *
     * 
     */
    public void setCustomerPenalty(BigDecimal value) {
        this.customerPenalty = value;
    }


    private BigDecimal customerInterest;

    /**
     * Getter for customerInterest
     *
     * 
     */
    public BigDecimal getCustomerInterest() {
        return this.customerInterest;
    }

    /**
     * Setter for customerInterest
     *
     * 
     */
    public void setCustomerInterest(BigDecimal value) {
        this.customerInterest = value;
    }


    private BigDecimal cspFeeRefund;

    /**
     * Getter for cspFeeRefund
     *
     * 
     */
    public BigDecimal getCspFeeRefund() {
        return this.cspFeeRefund;
    }

    /**
     * Setter for cspFeeRefund
     *
     * 
     */
    public void setCspFeeRefund(BigDecimal value) {
        this.cspFeeRefund = value;
    }


    private String fileName;

    /**
     * Getter for fileName
     *
     * resourceFileId
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Setter for fileName
     *
     * resourceFileId
     */
    public void setFileName(String value) {
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
