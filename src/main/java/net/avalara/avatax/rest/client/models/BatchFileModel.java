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
 * Represents one file in a batch upload.
 */
public class BatchFileModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number assigned to this batch file.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number assigned to this batch file.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer batchId;

    /**
     * Getter for batchId
     *
     * The unique ID number of the batch that this file belongs to.
     */
    public Integer getBatchId() {
        return this.batchId;
    }

    /**
     * Setter for batchId
     *
     * The unique ID number of the batch that this file belongs to.
     */
    public void setBatchId(Integer value) {
        this.batchId = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * Logical Name of file (e.g. "Input" or "Error").
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Logical Name of file (e.g. "Input" or "Error").
     */
    public void setName(String value) {
        this.name = value;
    }


    private String content;

    /**
     * Getter for content
     *
     * Content of the batch file.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for content
     *
     * Content of the batch file.
     */
    public void setContent(String value) {
        this.content = value;
    }


    private Integer contentLength;

    /**
     * Getter for contentLength
     *
     * Size of content, in bytes.
     */
    public Integer getContentLength() {
        return this.contentLength;
    }

    /**
     * Setter for contentLength
     *
     * Size of content, in bytes.
     */
    public void setContentLength(Integer value) {
        this.contentLength = value;
    }


    private String contentType;

    /**
     * Getter for contentType
     *
     * Content mime type (e.g. text/csv). This is used for HTTP downloading.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Setter for contentType
     *
     * Content mime type (e.g. text/csv). This is used for HTTP downloading.
     */
    public void setContentType(String value) {
        this.contentType = value;
    }


    private String fileExtension;

    /**
     * Getter for fileExtension
     *
     * File extension (e.g. CSV).
     */
    public String getFileExtension() {
        return this.fileExtension;
    }

    /**
     * Setter for fileExtension
     *
     * File extension (e.g. CSV).
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }


    private String filePath;

    /**
     * Getter for filePath
     *
     * Path to the file - name/S3 key
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * Setter for filePath
     *
     * Path to the file - name/S3 key
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }


    private Integer errorCount;

    /**
     * Getter for errorCount
     *
     * Number of errors that occurred when processing this file.
     */
    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * Setter for errorCount
     *
     * Number of errors that occurred when processing this file.
     */
    public void setErrorCount(Integer value) {
        this.errorCount = value;
    }


    /**
     * Returns a JSON string representation of BatchFileModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
