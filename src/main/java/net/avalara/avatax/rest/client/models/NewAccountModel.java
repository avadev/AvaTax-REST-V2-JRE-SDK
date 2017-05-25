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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents information about a newly created account
 */
public class NewAccountModel {


    private Int32? accountId;

    /**
     * Getter for accountId;
     * This is the ID number of the account that was created
     */
    public Int32? getaccountId() {;
        return this.accountId;;
    }

    /**
     * Setter for accountId;
     * This is the ID number of the account that was created
     */
    public void setaccountId(Int32? value) {;
        this.accountId = value;;
    }


    private String accountDetailsEmailedTo;

    /**
     * Getter for accountDetailsEmailedTo;
     * This is the email address to which credentials were mailed
     */
    public String getaccountDetailsEmailedTo() {;
        return this.accountDetailsEmailedTo;;
    }

    /**
     * Setter for accountDetailsEmailedTo;
     * This is the email address to which credentials were mailed
     */
    public void setaccountDetailsEmailedTo(String value) {;
        this.accountDetailsEmailedTo = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date and time when this account was created
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date and time when this account was created
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private DateTime? emailedDate;

    /**
     * Getter for emailedDate;
     * The date and time when account information was emailed to the user
     */
    public DateTime? getemailedDate() {;
        return this.emailedDate;;
    }

    /**
     * Setter for emailedDate;
     * The date and time when account information was emailed to the user
     */
    public void setemailedDate(DateTime? value) {;
        this.emailedDate = value;;
    }


    private String limitations;

    /**
     * Getter for limitations;
     * If this account includes any limitations, specify them here
     */
    public String getlimitations() {;
        return this.limitations;;
    }

    /**
     * Setter for limitations;
     * If this account includes any limitations, specify them here
     */
    public void setlimitations(String value) {;
        this.limitations = value;;
    }


    /**
     * Returns a JSON string representation of NewAccountModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
