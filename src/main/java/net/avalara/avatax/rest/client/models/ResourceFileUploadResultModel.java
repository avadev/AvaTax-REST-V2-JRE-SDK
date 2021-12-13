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
 * Swagger name: AvaTaxClient
 */

/**
 * Encapsulates the result of uploading a file to the resource system
 */
public class ResourceFileUploadResultModel {


    private String message;

    /**
     * Getter for message
     *
     * If the request failed, this contains a description of the error.
	 * 
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * If the request failed, this contains a description of the error.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    private Long resourceFileId;

    /**
     * Getter for resourceFileId
     *
     * If the request succeeded, this is the ID number of the file.
	 * 
     */
    public Long getResourceFileId() {
        return this.resourceFileId;
    }

    /**
     * Setter for resourceFileId
     *
     * If the request succeeded, this is the ID number of the file.
     */
    public void setResourceFileId(Long value) {
        this.resourceFileId = value;
    }

    private Boolean aaa_success;

    /**
     * Getter for aaa_success
     *
     * True if the upload request succeeded.
	 * 
     */
    public Boolean getAaa_success() {
        return this.aaa_success;
    }

    /**
     * Setter for aaa_success
     *
     * True if the upload request succeeded.
     */
    public void setAaa_success(Boolean value) {
        this.aaa_success = value;
    }

    /**
     * Returns a JSON string representation of ResourceFileUploadResultModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
