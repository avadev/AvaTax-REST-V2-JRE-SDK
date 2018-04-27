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
 * Represents an advanced rule table
 */
public class AdvancedRuleTableModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID of the table
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID of the table
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * Account ID
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * Account ID
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private String csvTableName;

    /**
     * Getter for csvTableName
     *
     * The name of the table
     */
    public String getCsvTableName() {
        return this.csvTableName;
    }

    /**
     * Setter for csvTableName
     *
     * The name of the table
     */
    public void setCsvTableName(String value) {
        this.csvTableName = value;
    }


    private String csvTable;

    /**
     * Getter for csvTable
     *
     * The CSV data
     */
    public String getCsvTable() {
        return this.csvTable;
    }

    /**
     * Setter for csvTable
     *
     * The CSV data
     */
    public void setCsvTable(String value) {
        this.csvTable = value;
    }


    /**
     * Returns a JSON string representation of AdvancedRuleTableModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
