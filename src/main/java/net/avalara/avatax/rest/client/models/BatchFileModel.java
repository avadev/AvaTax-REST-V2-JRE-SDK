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


    private string name;

    /**
     * Getter for name
     *
     * Logical Name of file (e.g. "Input" or "Error").
     */
    public string getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Logical Name of file (e.g. "Input" or "Error").
     */
    public void setName(string value) {
        this.name = value;
    }


    private string content;

    /**
     * Getter for content
     *
     * Content of the batch file.
     */
    public string getContent() {
        return this.content;
    }

    /**
     * Setter for content
     *
     * Content of the batch file.
     */
    public void setContent(string value) {
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


    private string contentType;

    /**
     * Getter for contentType
     *
     * Content mime type (e.g. text/csv). This is used for HTTP downloading.
     */
    public string getContentType() {
        return this.contentType;
    }

    /**
     * Setter for contentType
     *
     * Content mime type (e.g. text/csv). This is used for HTTP downloading.
     */
    public void setContentType(string value) {
        this.contentType = value;
    }


    private string fileExtension;

    /**
     * Getter for fileExtension
     *
     * File extension (e.g. CSV).
     */
    public string getFileExtension() {
        return this.fileExtension;
    }

    /**
     * Setter for fileExtension
     *
     * File extension (e.g. CSV).
     */
    public void setFileExtension(string value) {
        this.fileExtension = value;
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
