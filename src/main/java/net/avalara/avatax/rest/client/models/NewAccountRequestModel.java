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
 * Represents a request for a new account with Avalara for a new subscriber.
* Contains information about the account requested and the rate plan selected.
 */
public class NewAccountRequestModel {


    private List<String> products;

    /**
     * Getter for products;
     * The list of products to which this account would like to subscribe.
     */
    public List<String> getproducts() {;
        return this.products;;
    }

    /**
     * Setter for products;
     * The list of products to which this account would like to subscribe.
     */
    public void setproducts(List<String> value) {;
        this.products = value;;
    }


    private String connectorName;

    /**
     * Getter for connectorName;
     * The name of the connector that will be the primary method of access used to call the account created.
    * For a list of available connectors, please contact your Avalara representative.
     */
    public String getconnectorName() {;
        return this.connectorName;;
    }

    /**
     * Setter for connectorName;
     * The name of the connector that will be the primary method of access used to call the account created.
    * For a list of available connectors, please contact your Avalara representative.
     */
    public void setconnectorName(String value) {;
        this.connectorName = value;;
    }


    private String parentAccountNumber;

    /**
     * Getter for parentAccountNumber;
     * An approved partner account can be referenced when provisioning an account, allowing a link between 
    * the partner and the provisioned account.
     */
    public String getparentAccountNumber() {;
        return this.parentAccountNumber;;
    }

    /**
     * Setter for parentAccountNumber;
     * An approved partner account can be referenced when provisioning an account, allowing a link between 
    * the partner and the provisioned account.
     */
    public void setparentAccountNumber(String value) {;
        this.parentAccountNumber = value;;
    }


    private String referrerId;

    /**
     * Getter for referrerId;
     * Identifies a referring partner for the assessment of referral-based commissions.
     */
    public String getreferrerId() {;
        return this.referrerId;;
    }

    /**
     * Setter for referrerId;
     * Identifies a referring partner for the assessment of referral-based commissions.
     */
    public void setreferrerId(String value) {;
        this.referrerId = value;;
    }


    private String paymentMethodId;

    /**
     * Getter for paymentMethodId;
     * Zuora-generated Payment ID to which the new account should be associated. For free trial accounts, an empty string is acceptable.
     */
    public String getpaymentMethodId() {;
        return this.paymentMethodId;;
    }

    /**
     * Setter for paymentMethodId;
     * Zuora-generated Payment ID to which the new account should be associated. For free trial accounts, an empty string is acceptable.
     */
    public void setpaymentMethodId(String value) {;
        this.paymentMethodId = value;;
    }


    private DateTime? effectiveDate;

    /**
     * Getter for effectiveDate;
     * The date on which the account should take effect. If null, defaults to today.
     */
    public DateTime? geteffectiveDate() {;
        return this.effectiveDate;;
    }

    /**
     * Setter for effectiveDate;
     * The date on which the account should take effect. If null, defaults to today.
     */
    public void seteffectiveDate(DateTime? value) {;
        this.effectiveDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * The date on which the account should expire. If null, defaults to a 90-day trial account.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * The date on which the account should expire. If null, defaults to a 90-day trial account.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private String accountName;

    /**
     * Getter for accountName;
     * Account Name
     */
    public String getaccountName() {;
        return this.accountName;;
    }

    /**
     * Setter for accountName;
     * Account Name
     */
    public void setaccountName(String value) {;
        this.accountName = value;;
    }


    private String firstName;

    /**
     * Getter for firstName;
     * First Name of the primary contact person for this account
     */
    public String getfirstName() {;
        return this.firstName;;
    }

    /**
     * Setter for firstName;
     * First Name of the primary contact person for this account
     */
    public void setfirstName(String value) {;
        this.firstName = value;;
    }


    private String lastName;

    /**
     * Getter for lastName;
     * Last Name of the primary contact person for this account
     */
    public String getlastName() {;
        return this.lastName;;
    }

    /**
     * Setter for lastName;
     * Last Name of the primary contact person for this account
     */
    public void setlastName(String value) {;
        this.lastName = value;;
    }


    private String title;

    /**
     * Getter for title;
     * Title of the primary contact person for this account
     */
    public String gettitle() {;
        return this.title;;
    }

    /**
     * Setter for title;
     * Title of the primary contact person for this account
     */
    public void settitle(String value) {;
        this.title = value;;
    }


    private String phoneNumber;

    /**
     * Getter for phoneNumber;
     * Phone number of the primary contact person for this account
     */
    public String getphoneNumber() {;
        return this.phoneNumber;;
    }

    /**
     * Setter for phoneNumber;
     * Phone number of the primary contact person for this account
     */
    public void setphoneNumber(String value) {;
        this.phoneNumber = value;;
    }


    private String email;

    /**
     * Getter for email;
     * Email of the primary contact person for this account
     */
    public String getemail() {;
        return this.email;;
    }

    /**
     * Setter for email;
     * Email of the primary contact person for this account
     */
    public void setemail(String value) {;
        this.email = value;;
    }


    private String userPassword;

    /**
     * Getter for userPassword;
     * If no password is supplied, an a tempoarary password is generated by the system and emailed to the user. The user will 
    * be challenged to change this password upon logging in to the Admin Console. If supplied, will be the set password for 
    * the default created user, and the user will not be challenged to change their password upon login to the Admin Console.
     */
    public String getuserPassword() {;
        return this.userPassword;;
    }

    /**
     * Setter for userPassword;
     * If no password is supplied, an a tempoarary password is generated by the system and emailed to the user. The user will 
    * be challenged to change this password upon logging in to the Admin Console. If supplied, will be the set password for 
    * the default created user, and the user will not be challenged to change their password upon login to the Admin Console.
     */
    public void setuserPassword(String value) {;
        this.userPassword = value;;
    }


    /**
     * Returns a JSON string representation of NewAccountRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
