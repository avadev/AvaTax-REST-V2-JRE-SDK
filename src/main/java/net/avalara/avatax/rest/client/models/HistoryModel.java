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
 * Update history for Avalara.AvaTax.AccountServices.Models.v2.CustomerModel and Avalara.AvaTax.AccountServices.Models.v2.CertificateModel. This is exposed in the URL's `$includes`.
 */
public class HistoryModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this history.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this history.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String account;

    /**
     * Getter for account
     *
     * The account name this history belongs to.
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * Setter for account
     *
     * The account name this history belongs to.
     */
    public void setAccount(String value) {
        this.account = value;
    }

    private String field;

    /**
     * Getter for field
     *
     * The name of the field to update.
     */
    public String getField() {
        return this.field;
    }

    /**
     * Setter for field
     *
     * The name of the field to update.
     */
    public void setField(String value) {
        this.field = value;
    }

    private String oldValue;

    /**
     * Getter for oldValue
     *
     * The old value of the field.
     */
    public String getOldValue() {
        return this.oldValue;
    }

    /**
     * Setter for oldValue
     *
     * The old value of the field.
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    private String newValue;

    /**
     * Getter for newValue
     *
     * The new value of the field.
     */
    public String getNewValue() {
        return this.newValue;
    }

    /**
     * Setter for newValue
     *
     * The new value of the field.
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

    private Date created;

    /**
     * Getter for created
     *
     * The date/time when this history was created.
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Setter for created
     *
     * The date/time when this history was created.
     */
    public void setCreated(Date value) {
        this.created = value;
    }

    /**
     * Returns a JSON string representation of HistoryModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
