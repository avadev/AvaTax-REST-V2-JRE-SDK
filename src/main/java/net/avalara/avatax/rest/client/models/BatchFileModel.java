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


    private Int32? id;

    /**
     * Getter for id;
     * The unique ID number assigned to this batch file.
     */
    public Int32? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number assigned to this batch file.
     */
    public void setid(Int32? value) {;
        this.id = value;;
    }


    private Int32? batchId;

    /**
     * Getter for batchId;
     * The unique ID number of the batch that this file belongs to.
     */
    public Int32? getbatchId() {;
        return this.batchId;;
    }

    /**
     * Setter for batchId;
     * The unique ID number of the batch that this file belongs to.
     */
    public void setbatchId(Int32? value) {;
        this.batchId = value;;
    }


    private String name;

    /**
     * Getter for name;
     * Logical Name of file (e.g. "Input" or "Error").
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * Logical Name of file (e.g. "Input" or "Error").
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private Byte[] content;

    /**
     * Getter for content;
     * Content of the batch file.
     */
    public Byte[] getcontent() {;
        return this.content;;
    }

    /**
     * Setter for content;
     * Content of the batch file.
     */
    public void setcontent(Byte[] value) {;
        this.content = value;;
    }


    private Int32? contentLength;

    /**
     * Getter for contentLength;
     * Size of content, in bytes.
     */
    public Int32? getcontentLength() {;
        return this.contentLength;;
    }

    /**
     * Setter for contentLength;
     * Size of content, in bytes.
     */
    public void setcontentLength(Int32? value) {;
        this.contentLength = value;;
    }


    private String contentType;

    /**
     * Getter for contentType;
     * Content mime type (e.g. text/csv). This is used for HTTP downloading.
     */
    public String getcontentType() {;
        return this.contentType;;
    }

    /**
     * Setter for contentType;
     * Content mime type (e.g. text/csv). This is used for HTTP downloading.
     */
    public void setcontentType(String value) {;
        this.contentType = value;;
    }


    private String fileExtension;

    /**
     * Getter for fileExtension;
     * File extension (e.g. CSV).
     */
    public String getfileExtension() {;
        return this.fileExtension;;
    }

    /**
     * Setter for fileExtension;
     * File extension (e.g. CSV).
     */
    public void setfileExtension(String value) {;
        this.fileExtension = value;;
    }


    private Int32? errorCount;

    /**
     * Getter for errorCount;
     * Number of errors that occurred when processing this file.
     */
    public Int32? geterrorCount() {;
        return this.errorCount;;
    }

    /**
     * Setter for errorCount;
     * Number of errors that occurred when processing this file.
     */
    public void seterrorCount(Int32? value) {;
        this.errorCount = value;;
    }


    /**
     * Returns a JSON string representation of BatchFileModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
