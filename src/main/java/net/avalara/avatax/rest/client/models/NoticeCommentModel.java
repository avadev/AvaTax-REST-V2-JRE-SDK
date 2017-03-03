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
     * Getter for taxNoticeFileName - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public String getTaxNoticeFileName() {
        return this.taxNoticeFileName;
    }

    /**
     * Setter for taxNoticeFileName - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setTaxNoticeFileName(String taxNoticeFileName) {
        this.taxNoticeFileName = taxNoticeFileName;
    }

    
    private String commentLink;

    /**
     * Getter for commentLink - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public String getCommentLink() {
        return this.commentLink;
    }

    /**
     * Setter for commentLink - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setCommentLink(String commentLink) {
        this.commentLink = commentLink;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Integer commentUserId;

    /**
     * Getter for commentUserId - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public Integer getCommentUserId() {
        return this.commentUserId;
    }

    /**
     * Setter for commentUserId - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    
    private Integer commentTypeId;

    /**
     * Getter for commentTypeId - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public Integer getCommentTypeId() {
        return this.commentTypeId;
    }

    /**
     * Setter for commentTypeId - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setCommentTypeId(Integer commentTypeId) {
        this.commentTypeId = commentTypeId;
    }

    
    private String commentUserName;

    /**
     * Getter for commentUserName - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public String getCommentUserName() {
        return this.commentUserName;
    }

    /**
     * Setter for commentUserName - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setCommentUserName(String commentUserName) {
        this.commentUserName = commentUserName;
    }

    
    private Integer noticeId;

    /**
     * Getter for noticeId - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public Integer getNoticeId() {
        return this.noticeId;
    }

    /**
     * Setter for noticeId - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Date date;

    /**
     * Getter for date - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    
    private String comment;

    /**
     * Getter for comment - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for comment - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private String commentType;

    /**
     * Getter for commentType - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public String getCommentType() {
        return this.commentType;
    }

    /**
     * Setter for commentType - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    
    private Integer resourceFileId;

    /**
     * Getter for resourceFileId - Represents communication between Avalara and the company regarding the processing of a tax notice.
     */
    public Integer getResourceFileId() {
        return this.resourceFileId;
    }

    /**
     * Setter for resourceFileId - Represents communication between Avalara and the company regarding the processing of a tax notice.
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
    