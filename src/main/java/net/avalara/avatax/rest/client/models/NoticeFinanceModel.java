package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents estimated financial results from responding to a tax notice.
 */
public class NoticeFinanceModel {
    private BigDecimal customerPenalty;

    /**
     * Getter for customerPenalty - Represents estimated financial results from responding to a tax notice.
     */
    public BigDecimal getCustomerPenalty() {
        return this.customerPenalty;
    }

    /**
     * Setter for customerPenalty - Represents estimated financial results from responding to a tax notice.
     */
    public void setCustomerPenalty(BigDecimal customerPenalty) {
        this.customerPenalty = customerPenalty;
    }

    
    private BigDecimal taxDue;

    /**
     * Getter for taxDue - Represents estimated financial results from responding to a tax notice.
     */
    public BigDecimal getTaxDue() {
        return this.taxDue;
    }

    /**
     * Setter for taxDue - Represents estimated financial results from responding to a tax notice.
     */
    public void setTaxDue(BigDecimal taxDue) {
        this.taxDue = taxDue;
    }

    
    private Date noticeDate;

    /**
     * Getter for noticeDate - Represents estimated financial results from responding to a tax notice.
     */
    public Date getNoticeDate() {
        return this.noticeDate;
    }

    /**
     * Setter for noticeDate - Represents estimated financial results from responding to a tax notice.
     */
    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents estimated financial results from responding to a tax notice.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents estimated financial results from responding to a tax notice.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private BigDecimal credits;

    /**
     * Getter for credits - Represents estimated financial results from responding to a tax notice.
     */
    public BigDecimal getCredits() {
        return this.credits;
    }

    /**
     * Setter for credits - Represents estimated financial results from responding to a tax notice.
     */
    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    
    private String fileName;

    /**
     * Getter for fileName - Represents estimated financial results from responding to a tax notice.
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Setter for fileName - Represents estimated financial results from responding to a tax notice.
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    
    private Integer noticeId;

    /**
     * Getter for noticeId - Represents estimated financial results from responding to a tax notice.
     */
    public Integer getNoticeId() {
        return this.noticeId;
    }

    /**
     * Setter for noticeId - Represents estimated financial results from responding to a tax notice.
     */
    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents estimated financial results from responding to a tax notice.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents estimated financial results from responding to a tax notice.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private BigDecimal cspFeeRefund;

    /**
     * Getter for cspFeeRefund - Represents estimated financial results from responding to a tax notice.
     */
    public BigDecimal getCspFeeRefund() {
        return this.cspFeeRefund;
    }

    /**
     * Setter for cspFeeRefund - Represents estimated financial results from responding to a tax notice.
     */
    public void setCspFeeRefund(BigDecimal cspFeeRefund) {
        this.cspFeeRefund = cspFeeRefund;
    }

    
    private BigDecimal interest;

    /**
     * Getter for interest - Represents estimated financial results from responding to a tax notice.
     */
    public BigDecimal getInterest() {
        return this.interest;
    }

    /**
     * Setter for interest - Represents estimated financial results from responding to a tax notice.
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    
    private ResourceFileUploadRequestModel attachmentUploadRequest;

    /**
     * Getter for attachmentUploadRequest - Represents estimated financial results from responding to a tax notice.
     */
    public ResourceFileUploadRequestModel getAttachmentUploadRequest() {
        return this.attachmentUploadRequest;
    }

    /**
     * Setter for attachmentUploadRequest - Represents estimated financial results from responding to a tax notice.
     */
    public void setAttachmentUploadRequest(ResourceFileUploadRequestModel attachmentUploadRequest) {
        this.attachmentUploadRequest = attachmentUploadRequest;
    }

    
    private BigDecimal taxAbated;

    /**
     * Getter for taxAbated - Represents estimated financial results from responding to a tax notice.
     */
    public BigDecimal getTaxAbated() {
        return this.taxAbated;
    }

    /**
     * Setter for taxAbated - Represents estimated financial results from responding to a tax notice.
     */
    public void setTaxAbated(BigDecimal taxAbated) {
        this.taxAbated = taxAbated;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents estimated financial results from responding to a tax notice.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents estimated financial results from responding to a tax notice.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date dueDate;

    /**
     * Getter for dueDate - Represents estimated financial results from responding to a tax notice.
     */
    public Date getDueDate() {
        return this.dueDate;
    }

    /**
     * Setter for dueDate - Represents estimated financial results from responding to a tax notice.
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents estimated financial results from responding to a tax notice.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents estimated financial results from responding to a tax notice.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Long resourceFileId;

    /**
     * Getter for resourceFileId - Represents estimated financial results from responding to a tax notice.
     */
    public Long getResourceFileId() {
        return this.resourceFileId;
    }

    /**
     * Setter for resourceFileId - Represents estimated financial results from responding to a tax notice.
     */
    public void setResourceFileId(Long resourceFileId) {
        this.resourceFileId = resourceFileId;
    }

    
    private BigDecimal penalty;

    /**
     * Getter for penalty - Represents estimated financial results from responding to a tax notice.
     */
    public BigDecimal getPenalty() {
        return this.penalty;
    }

    /**
     * Setter for penalty - Represents estimated financial results from responding to a tax notice.
     */
    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    
    private BigDecimal customerInterest;

    /**
     * Getter for customerInterest - Represents estimated financial results from responding to a tax notice.
     */
    public BigDecimal getCustomerInterest() {
        return this.customerInterest;
    }

    /**
     * Setter for customerInterest - Represents estimated financial results from responding to a tax notice.
     */
    public void setCustomerInterest(BigDecimal customerInterest) {
        this.customerInterest = customerInterest;
    }

    
    private String noticeNumber;

    /**
     * Getter for noticeNumber - Represents estimated financial results from responding to a tax notice.
     */
    public String getNoticeNumber() {
        return this.noticeNumber;
    }

    /**
     * Setter for noticeNumber - Represents estimated financial results from responding to a tax notice.
     */
    public void setNoticeNumber(String noticeNumber) {
        this.noticeNumber = noticeNumber;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents estimated financial results from responding to a tax notice.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents estimated financial results from responding to a tax notice.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of NoticeFinanceModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    