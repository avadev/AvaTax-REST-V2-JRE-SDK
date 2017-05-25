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
 * Represents communication between Avalara and the company regarding the processing of a tax notice.
 */
public class NoticeCommentModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this notice.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this notice.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private int noticeId;

    /**
     * Getter for noticeId
     *
     * The ID of the notice this comment is attached too
     */
    public int getNoticeId() {
        return this.noticeId;
    }

    /**
     * Setter for noticeId
     *
     * The ID of the notice this comment is attached too
     */
    public void setNoticeId(int value) {
        this.noticeId = value;
    }


    private Instant date;

    /**
     * Getter for date
     *
     * The date this comment was entered
     */
    public Instant getDate() {
        return this.date;
    }

    /**
     * Setter for date
     *
     * The date this comment was entered
     */
    public void setDate(Instant value) {
        this.date = value;
    }


    private string comment;

    /**
     * Getter for comment
     *
     * TaxNoticeComment
     */
    public string getComment() {
        return this.comment;
    }

    /**
     * Setter for comment
     *
     * TaxNoticeComment
     */
    public void setComment(string value) {
        this.comment = value;
    }


    private Integer commentUserId;

    /**
     * Getter for commentUserId
     *
     * TaxNoticeCommentUserId
     */
    public Integer getCommentUserId() {
        return this.commentUserId;
    }

    /**
     * Setter for commentUserId
     *
     * TaxNoticeCommentUserId
     */
    public void setCommentUserId(Integer value) {
        this.commentUserId = value;
    }


    private string commentUserName;

    /**
     * Getter for commentUserName
     *
     * TaxNoticeCommentUserName
     */
    public string getCommentUserName() {
        return this.commentUserName;
    }

    /**
     * Setter for commentUserName
     *
     * TaxNoticeCommentUserName
     */
    public void setCommentUserName(string value) {
        this.commentUserName = value;
    }


    private Integer commentTypeId;

    /**
     * Getter for commentTypeId
     *
     * taxNoticeCommentTypeId
     */
    public Integer getCommentTypeId() {
        return this.commentTypeId;
    }

    /**
     * Setter for commentTypeId
     *
     * taxNoticeCommentTypeId
     */
    public void setCommentTypeId(Integer value) {
        this.commentTypeId = value;
    }


    private CommentType commentType;

    /**
     * Getter for commentType
     *
     * taxNoticeCommentType
     */
    public CommentType getCommentType() {
        return this.commentType;
    }

    /**
     * Setter for commentType
     *
     * taxNoticeCommentType
     */
    public void setCommentType(CommentType value) {
        this.commentType = value;
    }


    private string commentLink;

    /**
     * Getter for commentLink
     *
     * TaxNoticeCommentLink
     */
    public string getCommentLink() {
        return this.commentLink;
    }

    /**
     * Setter for commentLink
     *
     * TaxNoticeCommentLink
     */
    public void setCommentLink(string value) {
        this.commentLink = value;
    }


    private string taxNoticeFileName;

    /**
     * Getter for taxNoticeFileName
     *
     * TaxNoticeFileName
     */
    public string getTaxNoticeFileName() {
        return this.taxNoticeFileName;
    }

    /**
     * Setter for taxNoticeFileName
     *
     * TaxNoticeFileName
     */
    public void setTaxNoticeFileName(string value) {
        this.taxNoticeFileName = value;
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
     * An attachment to the detail
     */
    public ResourceFileUploadRequestModel getAttachmentUploadRequest() {
        return this.attachmentUploadRequest;
    }

    /**
     * Setter for attachmentUploadRequest
     *
     * An attachment to the detail
     */
    public void setAttachmentUploadRequest(ResourceFileUploadRequestModel value) {
        this.attachmentUploadRequest = value;
    }


    /**
     * Returns a JSON string representation of NoticeCommentModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
