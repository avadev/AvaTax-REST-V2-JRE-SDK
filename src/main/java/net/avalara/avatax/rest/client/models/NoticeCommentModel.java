package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents communication between Avalara and the company regarding the processing of a tax notice.
 */
public class NoticeCommentModel {
    private String taxNoticeFileName;

    /**
     * Getter for taxNoticeFileName - TaxNoticeFileName
     */
    public String getTaxNoticeFileName() {
        return this.taxNoticeFileName;
    }

    /**
     * Setter for taxNoticeFileName - TaxNoticeFileName
     */
    public void setTaxNoticeFileName(String taxNoticeFileName) {
        this.taxNoticeFileName = taxNoticeFileName;
    }

    
    private String commentLink;

    /**
     * Getter for commentLink - TaxNoticeCommentLink
     */
    public String getCommentLink() {
        return this.commentLink;
    }

    /**
     * Setter for commentLink - TaxNoticeCommentLink
     */
    public void setCommentLink(String commentLink) {
        this.commentLink = commentLink;
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

    
    private Integer commentUserId;

    /**
     * Getter for commentUserId - TaxNoticeCommentUserId
     */
    public Integer getCommentUserId() {
        return this.commentUserId;
    }

    /**
     * Setter for commentUserId - TaxNoticeCommentUserId
     */
    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    
    private Integer commentTypeId;

    /**
     * Getter for commentTypeId - taxNoticeCommentTypeId
     */
    public Integer getCommentTypeId() {
        return this.commentTypeId;
    }

    /**
     * Setter for commentTypeId - taxNoticeCommentTypeId
     */
    public void setCommentTypeId(Integer commentTypeId) {
        this.commentTypeId = commentTypeId;
    }

    
    private String commentUserName;

    /**
     * Getter for commentUserName - TaxNoticeCommentUserName
     */
    public String getCommentUserName() {
        return this.commentUserName;
    }

    /**
     * Setter for commentUserName - TaxNoticeCommentUserName
     */
    public void setCommentUserName(String commentUserName) {
        this.commentUserName = commentUserName;
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
     * Getter for id - The unique ID number of this notice.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this notice.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Date date;

    /**
     * Getter for date - 
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date - 
     */
    public void setDate(Date date) {
        this.date = date;
    }

    
    private String comment;

    /**
     * Getter for comment - TaxNoticeComment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for comment - TaxNoticeComment
     */
    public void setComment(String comment) {
        this.comment = comment;
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

    
    private String commentType;

    /**
     * Getter for commentType - taxNoticeCommentType
     */
    public String getCommentType() {
        return this.commentType;
    }

    /**
     * Setter for commentType - taxNoticeCommentType
     */
    public void setCommentType(String commentType) {
        this.commentType = commentType;
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

    


    /**
     * Returns a JSON string representation of NoticeCommentModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    