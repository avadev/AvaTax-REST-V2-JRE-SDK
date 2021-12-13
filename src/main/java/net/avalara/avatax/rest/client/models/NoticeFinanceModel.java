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
 * Represents estimated financial results from responding to a tax notice.
 */
public class NoticeFinanceModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The Unique Id of the Finance Model
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The Unique Id of the Finance Model
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer noticeId;

    /**
     * Getter for noticeId
     *
     * The unique ID of the the tax notice associated with the the finance detail
	 * 
     */
    public Integer getNoticeId() {
        return this.noticeId;
    }

    /**
     * Setter for noticeId
     *
     * The unique ID of the the tax notice associated with the the finance detail
     */
    public void setNoticeId(Integer value) {
        this.noticeId = value;
    }

    private Date noticeDate;

    /**
     * Getter for noticeDate
     *
     * The date of the notice
	 * 
     */
    public Date getNoticeDate() {
        return this.noticeDate;
    }

    /**
     * Setter for noticeDate
     *
     * The date of the notice
     */
    public void setNoticeDate(Date value) {
        this.noticeDate = value;
    }

    private Date dueDate;

    /**
     * Getter for dueDate
     *
     * The due date of the notice
	 * 
     */
    public Date getDueDate() {
        return this.dueDate;
    }

    /**
     * Setter for dueDate
     *
     * The due date of the notice
     */
    public void setDueDate(Date value) {
        this.dueDate = value;
    }

    private String noticeNumber;

    /**
     * Getter for noticeNumber
     *
     * The sequential number of the notice
	 * 
     */
    public String getNoticeNumber() {
        return this.noticeNumber;
    }

    /**
     * Setter for noticeNumber
     *
     * The sequential number of the notice
     */
    public void setNoticeNumber(String value) {
        this.noticeNumber = value;
    }

    private BigDecimal taxDue;

    /**
     * Getter for taxDue
     *
     * The amount of tax due on the notice
	 * 
     */
    public BigDecimal getTaxDue() {
        return this.taxDue;
    }

    /**
     * Setter for taxDue
     *
     * The amount of tax due on the notice
     */
    public void setTaxDue(BigDecimal value) {
        this.taxDue = value;
    }

    private BigDecimal penalty;

    /**
     * Getter for penalty
     *
     * The amound of penalty listed on the notice
	 * 
     */
    public BigDecimal getPenalty() {
        return this.penalty;
    }

    /**
     * Setter for penalty
     *
     * The amound of penalty listed on the notice
     */
    public void setPenalty(BigDecimal value) {
        this.penalty = value;
    }

    private BigDecimal interest;

    /**
     * Getter for interest
     *
     * The amount of interest listed on the notice
	 * 
     */
    public BigDecimal getInterest() {
        return this.interest;
    }

    /**
     * Setter for interest
     *
     * The amount of interest listed on the notice
     */
    public void setInterest(BigDecimal value) {
        this.interest = value;
    }

    private BigDecimal credits;

    /**
     * Getter for credits
     *
     * The amount of credits listed on the notice
	 * 
     */
    public BigDecimal getCredits() {
        return this.credits;
    }

    /**
     * Setter for credits
     *
     * The amount of credits listed on the notice
     */
    public void setCredits(BigDecimal value) {
        this.credits = value;
    }

    private BigDecimal taxAbated;

    /**
     * Getter for taxAbated
     *
     * The amount of tax abated on the notice
	 * 
     */
    public BigDecimal getTaxAbated() {
        return this.taxAbated;
    }

    /**
     * Setter for taxAbated
     *
     * The amount of tax abated on the notice
     */
    public void setTaxAbated(BigDecimal value) {
        this.taxAbated = value;
    }

    private BigDecimal customerPenalty;

    /**
     * Getter for customerPenalty
     *
     * The amount of customer penalty on the notice
	 * 
     */
    public BigDecimal getCustomerPenalty() {
        return this.customerPenalty;
    }

    /**
     * Setter for customerPenalty
     *
     * The amount of customer penalty on the notice
     */
    public void setCustomerPenalty(BigDecimal value) {
        this.customerPenalty = value;
    }

    private BigDecimal customerInterest;

    /**
     * Getter for customerInterest
     *
     * The amount of customer interest on the notice
	 * 
     */
    public BigDecimal getCustomerInterest() {
        return this.customerInterest;
    }

    /**
     * Setter for customerInterest
     *
     * The amount of customer interest on the notice
     */
    public void setCustomerInterest(BigDecimal value) {
        this.customerInterest = value;
    }

    private BigDecimal cspFeeRefund;

    /**
     * Getter for cspFeeRefund
     *
     * The amount of CSP Fee Refund on the notice
	 * 
     */
    public BigDecimal getCspFeeRefund() {
        return this.cspFeeRefund;
    }

    /**
     * Setter for cspFeeRefund
     *
     * The amount of CSP Fee Refund on the notice
     */
    public void setCspFeeRefund(BigDecimal value) {
        this.cspFeeRefund = value;
    }

    private String fileName;

    /**
     * Getter for fileName
     *
     * The name of the file attached to the finance detail
	 * 
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Setter for fileName
     *
     * The name of the file attached to the finance detail
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    private Long resourceFileId;

    /**
     * Getter for resourceFileId
     *
     * The ResourceFileId of the finance detail attachment
	 * 
     */
    public Long getResourceFileId() {
        return this.resourceFileId;
    }

    /**
     * Setter for resourceFileId
     *
     * The ResourceFileId of the finance detail attachment
     */
    public void setResourceFileId(Long value) {
        this.resourceFileId = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
	 * 
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
	 * 
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
	 * 
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
	 * 
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
     * 
	 * 
     */
    public ResourceFileUploadRequestModel getAttachmentUploadRequest() {
        return this.attachmentUploadRequest;
    }

    /**
     * Setter for attachmentUploadRequest
     *
     * 
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
