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
 * Represents everything downloaded from resource files
 */
public class ResourceFileDownloadResult {


    private Boolean success;

    /**
     * Getter for success
     *
     * True if this download succeeded
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * Setter for success
     *
     * True if this download succeeded
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }

    private String bytes;

    /**
     * Getter for bytes
     *
     * Bytes of the file
     */
    public String getBytes() {
        return this.bytes;
    }

    /**
     * Setter for bytes
     *
     * Bytes of the file
     */
    public void setBytes(String value) {
        this.bytes = value;
    }

    private String filename;

    /**
     * Getter for filename
     *
     * Original filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Setter for filename
     *
     * Original filename
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    private String contentType;

    /**
     * Getter for contentType
     *
     * Mime content type
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Setter for contentType
     *
     * Mime content type
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Returns a JSON string representation of ResourceFileDownloadResult
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
