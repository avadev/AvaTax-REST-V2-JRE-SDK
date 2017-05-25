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


    private Int32? id;

    /**
     * Getter for id;
     * The unique ID number of this notice.
     */
    public Int32? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this notice.
     */
    public void setid(Int32? value) {;
        this.id = value;;
    }


    private Int32 noticeId;

    /**
     * Getter for noticeId;
     * The ID of the notice this comment is attached too
     */
    public Int32 getnoticeId() {;
        return this.noticeId;;
    }

    /**
     * Setter for noticeId;
     * The ID of the notice this comment is attached too
     */
    public void setnoticeId(Int32 value) {;
        this.noticeId = value;;
    }


    private DateTime? date;

    /**
     * Getter for date;
     * The date this comment was entered
     */
    public DateTime? getdate() {;
        return this.date;;
    }

    /**
     * Setter for date;
     * The date this comment was entered
     */
    public void setdate(DateTime? value) {;
        this.date = value;;
    }


    private String comment;

    /**
     * Getter for comment;
     * TaxNoticeComment
     */
    public String getcomment() {;
        return this.comment;;
    }

    /**
     * Setter for comment;
     * TaxNoticeComment
     */
    public void setcomment(String value) {;
        this.comment = value;;
    }


    private Int32? commentUserId;

    /**
     * Getter for commentUserId;
     * TaxNoticeCommentUserId
     */
    public Int32? getcommentUserId() {;
        return this.commentUserId;;
    }

    /**
     * Setter for commentUserId;
     * TaxNoticeCommentUserId
     */
    public void setcommentUserId(Int32? value) {;
        this.commentUserId = value;;
    }


    private String commentUserName;

    /**
     * Getter for commentUserName;
     * TaxNoticeCommentUserName
     */
    public String getcommentUserName() {;
        return this.commentUserName;;
    }

    /**
     * Setter for commentUserName;
     * TaxNoticeCommentUserName
     */
    public void setcommentUserName(String value) {;
        this.commentUserName = value;;
    }


    private Int32? commentTypeId;

    /**
     * Getter for commentTypeId;
     * taxNoticeCommentTypeId
     */
    public Int32? getcommentTypeId() {;
        return this.commentTypeId;;
    }

    /**
     * Setter for commentTypeId;
     * taxNoticeCommentTypeId
     */
    public void setcommentTypeId(Int32? value) {;
        this.commentTypeId = value;;
    }


    private CommentType commentType;

    /**
     * Getter for commentType;
     * taxNoticeCommentType
     */
    public CommentType getcommentType() {;
        return this.commentType;;
    }

    /**
     * Setter for commentType;
     * taxNoticeCommentType
     */
    public void setcommentType(CommentType value) {;
        this.commentType = value;;
    }


    private String commentLink;

    /**
     * Getter for commentLink;
     * TaxNoticeCommentLink
     */
    public String getcommentLink() {;
        return this.commentLink;;
    }

    /**
     * Setter for commentLink;
     * TaxNoticeCommentLink
     */
    public void setcommentLink(String value) {;
        this.commentLink = value;;
    }


    private String taxNoticeFileName;

    /**
     * Getter for taxNoticeFileName;
     * TaxNoticeFileName
     */
    public String gettaxNoticeFileName() {;
        return this.taxNoticeFileName;;
    }

    /**
     * Setter for taxNoticeFileName;
     * TaxNoticeFileName
     */
    public void settaxNoticeFileName(String value) {;
        this.taxNoticeFileName = value;;
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
     * An attachment to the detail
     */
    public ResourceFileUploadRequestModel getattachmentUploadRequest() {;
        return this.attachmentUploadRequest;;
    }

    /**
     * Setter for attachmentUploadRequest;
     * An attachment to the detail
     */
    public void setattachmentUploadRequest(ResourceFileUploadRequestModel value) {;
        this.attachmentUploadRequest = value;;
    }


    /**
     * Returns a JSON string representation of NoticeCommentModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
