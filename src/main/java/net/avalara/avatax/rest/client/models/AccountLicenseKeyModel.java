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
 * An account user who is permitted to use AvaTax.
 */
public class AccountLicenseKeyModel {


    private String name;

    /**
     * Getter for name
     *
     * The unique name for license key per account
	 * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The unique name for license key per account
     */
    public void setName(String value) {
        this.name = value;
    }

    private Integer accountId;

    /**
     * Getter for accountId
     *
     * AccountId for required license key
	 * 
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * AccountId for required license key
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
	 * 
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The user id for the user who created this record.
	 * 
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user id for the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
	 * 
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user id of user who last modified this record.
	 * 
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user id of user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    /**
     * Returns a JSON string representation of AccountLicenseKeyModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
