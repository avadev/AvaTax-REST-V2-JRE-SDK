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
 * A company and account
 */
public class MrsCompanyModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of this company.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of this company.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String companyName;

    /**
     * Getter for companyName
     *
     * The name of this company, as shown to customers.
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * Setter for companyName
     *
     * The name of this company, as shown to customers.
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number of the account this company belongs to.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number of the account this company belongs to.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private String accountName;

    /**
     * Getter for accountName
     *
     * The name of this account, as shown to customers.
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Setter for accountName
     *
     * The name of this account, as shown to customers.
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }


    private String tin;

    /**
     * Getter for tin
     *
     * The taxpayer identification number for the company
     */
    public String getTin() {
        return this.tin;
    }

    /**
     * Setter for tin
     *
     * The taxpayer identification number for the company
     */
    public void setTin(String value) {
        this.tin = value;
    }


    private String companyCode;

    /**
     * Getter for companyCode
     *
     * The company code for the company
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * The company code for the company
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }


    /**
     * Returns a JSON string representation of MrsCompanyModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
