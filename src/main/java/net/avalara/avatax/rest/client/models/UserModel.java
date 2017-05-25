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
 * An account user who is permitted to use AvaTax.
 */
public class UserModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this user.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this user.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 accountId;

    /**
     * Getter for accountId;
     * The unique ID number of the account to which this user belongs.
     */
    public Int32 getaccountId() {;
        return this.accountId;;
    }

    /**
     * Setter for accountId;
     * The unique ID number of the account to which this user belongs.
     */
    public void setaccountId(Int32 value) {;
        this.accountId = value;;
    }


    private Int32? companyId;

    /**
     * Getter for companyId;
     * If this user is locked to one company (and its children), this is the unique ID number of the company to which this user belongs.
     */
    public Int32? getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * If this user is locked to one company (and its children), this is the unique ID number of the company to which this user belongs.
     */
    public void setcompanyId(Int32? value) {;
        this.companyId = value;;
    }


    private String userName;

    /**
     * Getter for userName;
     * The username which is used to log on to the AvaTax website, or to authenticate against API calls.
     */
    public String getuserName() {;
        return this.userName;;
    }

    /**
     * Setter for userName;
     * The username which is used to log on to the AvaTax website, or to authenticate against API calls.
     */
    public void setuserName(String value) {;
        this.userName = value;;
    }


    private String firstName;

    /**
     * Getter for firstName;
     * The first or given name of the user.
     */
    public String getfirstName() {;
        return this.firstName;;
    }

    /**
     * Setter for firstName;
     * The first or given name of the user.
     */
    public void setfirstName(String value) {;
        this.firstName = value;;
    }


    private String lastName;

    /**
     * Getter for lastName;
     * The last or family name of the user.
     */
    public String getlastName() {;
        return this.lastName;;
    }

    /**
     * Setter for lastName;
     * The last or family name of the user.
     */
    public void setlastName(String value) {;
        this.lastName = value;;
    }


    private String email;

    /**
     * Getter for email;
     * The email address to be used to contact this user. If the user has forgotten a password, an email can be sent to this email address with information on how to reset this password.
     */
    public String getemail() {;
        return this.email;;
    }

    /**
     * Setter for email;
     * The email address to be used to contact this user. If the user has forgotten a password, an email can be sent to this email address with information on how to reset this password.
     */
    public void setemail(String value) {;
        this.email = value;;
    }


    private String postalCode;

    /**
     * Getter for postalCode;
     * The postal code in which this user resides.
     */
    public String getpostalCode() {;
        return this.postalCode;;
    }

    /**
     * Setter for postalCode;
     * The postal code in which this user resides.
     */
    public void setpostalCode(String value) {;
        this.postalCode = value;;
    }


    private SecurityRoleId securityRoleId;

    /**
     * Getter for securityRoleId;
     * The security level for this user.
     */
    public SecurityRoleId getsecurityRoleId() {;
        return this.securityRoleId;;
    }

    /**
     * Setter for securityRoleId;
     * The security level for this user.
     */
    public void setsecurityRoleId(SecurityRoleId value) {;
        this.securityRoleId = value;;
    }


    private PasswordStatusId? passwordStatus;

    /**
     * Getter for passwordStatus;
     * The status of the user's password.
     */
    public PasswordStatusId? getpasswordStatus() {;
        return this.passwordStatus;;
    }

    /**
     * Setter for passwordStatus;
     * The status of the user's password.
     */
    public void setpasswordStatus(PasswordStatusId? value) {;
        this.passwordStatus = value;;
    }


    private Boolean? isActive;

    /**
     * Getter for isActive;
     * True if this user is currently active.
     */
    public Boolean? getisActive() {;
        return this.isActive;;
    }

    /**
     * Setter for isActive;
     * True if this user is currently active.
     */
    public void setisActive(Boolean? value) {;
        this.isActive = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    /**
     * Returns a JSON string representation of UserModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
