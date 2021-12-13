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
 * An AvaTax account.
 */
public class AccountMigrationStatusModel {


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number assigned to this account.
	 * 
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number assigned to this account.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    private String accountName;

    /**
     * Getter for accountName
     *
     * The name of this account.
	 * 
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Setter for accountName
     *
     * The name of this account.
     */
    public void setAccountName(String value) {
        this.accountName = value;
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
     * The user ID of the user who last modified this record.
	 * 
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

    private Integer accountMigrationStatusId;

    /**
     * Getter for accountMigrationStatusId
     *
     * The Tss Read Write Mode.
	 * 
     */
    public Integer getAccountMigrationStatusId() {
        return this.accountMigrationStatusId;
    }

    /**
     * Setter for accountMigrationStatusId
     *
     * The Tss Read Write Mode.
     */
    public void setAccountMigrationStatusId(Integer value) {
        this.accountMigrationStatusId = value;
    }

    /**
     * Returns a JSON string representation of AccountMigrationStatusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
