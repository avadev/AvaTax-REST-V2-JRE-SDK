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
 * Model representing a lookup file for a company
 */
public class AdvancedRuleLookupFileModel {


    private String lookupFileId;

    /**
     * Getter for lookupFileId
     *
     * LookupFile unique identifier
     */
    public String getLookupFileId() {
        return this.lookupFileId;
    }

    /**
     * Setter for lookupFileId
     *
     * LookupFile unique identifier
     */
    public void setLookupFileId(String value) {
        this.lookupFileId = value;
    }

    private String id;

    /**
     * Getter for id
     *
     * CompanyLookupFile unique identifier
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * CompanyLookupFile unique identifier
     */
    public void setId(String value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Name of lookup file
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Name of lookup file
     */
    public void setName(String value) {
        this.name = value;
    }

    private String content;

    /**
     * Getter for content
     *
     * Content of the lookup file.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for content
     *
     * Content of the lookup file.
     */
    public void setContent(String value) {
        this.content = value;
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

    private Boolean isTest;

    /**
     * Getter for isTest
     *
     * Is this a lookup file created for testing
     */
    public Boolean getIsTest() {
        return this.isTest;
    }

    /**
     * Setter for isTest
     *
     * Is this a lookup file created for testing
     */
    public void setIsTest(Boolean value) {
        this.isTest = value;
    }

    private Boolean inUse;

    /**
     * Getter for inUse
     *
     * Is this a lookup file in use for any rule
     */
    public Boolean getInUse() {
        return this.inUse;
    }

    /**
     * Setter for inUse
     *
     * Is this a lookup file in use for any rule
     */
    public void setInUse(Boolean value) {
        this.inUse = value;
    }

    private Integer version;

    /**
     * Getter for version
     *
     * Lookup file version
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Setter for version
     *
     * Lookup file version
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    private String createdDate;

    /**
     * Getter for createdDate
     *
     * Lookup file CreatedDate
     */
    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * Lookup file CreatedDate
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    private String modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * Lookup file ModifiedDate
     */
    public String getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * Lookup file ModifiedDate
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Returns a JSON string representation of AdvancedRuleLookupFileModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
