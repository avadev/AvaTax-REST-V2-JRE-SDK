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
 * A request to upload a file to Resource Files
 */
public class ResourceFileUploadRequestModel {


    private String content;

    /**
     * Getter for content
     *
     * This stream contains the bytes of the file being uploaded.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for content
     *
     * This stream contains the bytes of the file being uploaded.
     */
    public void setContent(String value) {
        this.content = value;
    }


    private String username;

    /**
     * Getter for username
     *
     * The username adding the file
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for username
     *
     * The username adding the file
     */
    public void setUsername(String value) {
        this.username = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The account ID to which this file will be attached.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The account ID to which this file will be attached.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The company ID to which this file will be attached.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The company ID to which this file will be attached.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * The original name of this file.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The original name of this file.
     */
    public void setName(String value) {
        this.name = value;
    }


    private Integer resourceFileTypeId;

    /**
     * Getter for resourceFileTypeId
     *
     * The resource type ID of this file.
     */
    public Integer getResourceFileTypeId() {
        return this.resourceFileTypeId;
    }

    /**
     * Setter for resourceFileTypeId
     *
     * The resource type ID of this file.
     */
    public void setResourceFileTypeId(Integer value) {
        this.resourceFileTypeId = value;
    }


    private Long length;

    /**
     * Getter for length
     *
     * Length of the file in bytes.
     */
    public Long getLength() {
        return this.length;
    }

    /**
     * Setter for length
     *
     * Length of the file in bytes.
     */
    public void setLength(Long value) {
        this.length = value;
    }


    /**
     * Returns a JSON string representation of ResourceFileUploadRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
