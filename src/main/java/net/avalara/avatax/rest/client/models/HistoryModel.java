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
 * Update history for Avalara.AvaTax.AccountServices.Models.v2.CustomerModel and Avalara.AvaTax.AccountServices.Models.v2.CertificateModel. Exposed in url $includes
 */
public class HistoryModel {


    private Integer id;

    /**
     * Getter for id
     *
     * ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * ID
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String account;

    /**
     * Getter for account
     *
     * Account name whose history this is
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * Setter for account
     *
     * Account name whose history this is
     */
    public void setAccount(String value) {
        this.account = value;
    }

    private String field;

    /**
     * Getter for field
     *
     * Field name which is updated
     */
    public String getField() {
        return this.field;
    }

    /**
     * Setter for field
     *
     * Field name which is updated
     */
    public void setField(String value) {
        this.field = value;
    }

    private String oldValue;

    /**
     * Getter for oldValue
     *
     * Old value of the field
     */
    public String getOldValue() {
        return this.oldValue;
    }

    /**
     * Setter for oldValue
     *
     * Old value of the field
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    private String newValue;

    /**
     * Getter for newValue
     *
     * New value of the field
     */
    public String getNewValue() {
        return this.newValue;
    }

    /**
     * Setter for newValue
     *
     * New value of the field
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

    private Date created;

    /**
     * Getter for created
     *
     * Date of creation of this history object
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Setter for created
     *
     * Date of creation of this history object
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
