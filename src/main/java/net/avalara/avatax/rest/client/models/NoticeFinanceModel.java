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
     * Getter for customerPenalty - 
     */
    public BigDecimal getCustomerPenalty() {
        return this.customerPenalty;
    }

    /**
     * Setter for customerPenalty - 
     */
    public void setCustomerPenalty(BigDecimal customerPenalty) {
        this.customerPenalty = customerPenalty;
    }

    
    private BigDecimal taxDue;

    /**
     * Getter for taxDue - 
     */
    public BigDecimal getTaxDue() {
        return this.taxDue;
    }

    /**
     * Setter for taxDue - 
     */
    public void setTaxDue(BigDecimal taxDue) {
        this.taxDue = taxDue;
    }

    
    private Date noticeDate;

    /**
     * Getter for noticeDate - 
     */
    public Date getNoticeDate() {
        return this.noticeDate;
    }

    /**
     * Setter for noticeDate - 
     */
    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - The date/time when this record was last modified.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private BigDecimal credits;

    /**
     * Getter for credits - 
     */
    public BigDecimal getCredits() {
        return this.credits;
    }

    /**
     * Setter for credits - 
     */
    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    
    private String fileName;

    /**
     * Getter for fileName - resourceFileId
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Setter for fileName - resourceFileId
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    
    private Integer noticeId;

    /**
     * Getter for noticeId - 
     */
    public Integer getNoticeId() {
        return this.noticeId;
    }

    /**
     * Setter for noticeId - 
     */
    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    
    private Integer id;

    /**
     * Getter for id - 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private BigDecimal cspFeeRefund;

    /**
     * Getter for cspFeeRefund - 
     */
    public BigDecimal getCspFeeRefund() {
        return this.cspFeeRefund;
    }

    /**
     * Setter for cspFeeRefund - 
     */
    public void setCspFeeRefund(BigDecimal cspFeeRefund) {
        this.cspFeeRefund = cspFeeRefund;
    }

    
    private BigDecimal interest;

    /**
     * Getter for interest - 
     */
    public BigDecimal getInterest() {
        return this.interest;
    }

    /**
     * Setter for interest - 
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    
    private BigDecimal taxAbated;

    /**
     * Getter for taxAbated - 
     */
    public BigDecimal getTaxAbated() {
        return this.taxAbated;
    }

    /**
     * Setter for taxAbated - 
     */
    public void setTaxAbated(BigDecimal taxAbated) {
        this.taxAbated = taxAbated;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date dueDate;

    /**
     * Getter for dueDate - 
     */
    public Date getDueDate() {
        return this.dueDate;
    }

    /**
     * Setter for dueDate - 
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Integer resourceFileId;

    /**
     * Getter for resourceFileId - resourceFileId
     */
    public Integer getResourceFileId() {
        return this.resourceFileId;
    }

    /**
     * Setter for resourceFileId - resourceFileId
     */
    public void setResourceFileId(Integer resourceFileId) {
        this.resourceFileId = resourceFileId;
    }

    
    private BigDecimal penalty;

    /**
     * Getter for penalty - 
     */
    public BigDecimal getPenalty() {
        return this.penalty;
    }

    /**
     * Setter for penalty - 
     */
    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    
    private BigDecimal customerInterest;

    /**
     * Getter for customerInterest - 
     */
    public BigDecimal getCustomerInterest() {
        return this.customerInterest;
    }

    /**
     * Setter for customerInterest - 
     */
    public void setCustomerInterest(BigDecimal customerInterest) {
        this.customerInterest = customerInterest;
    }

    
    private String noticeNumber;

    /**
     * Getter for noticeNumber - 
     */
    public String getNoticeNumber() {
        return this.noticeNumber;
    }

    /**
     * Setter for noticeNumber - 
     */
    public void setNoticeNumber(String noticeNumber) {
        this.noticeNumber = noticeNumber;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - The date when this record was created.
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
    