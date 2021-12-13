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
public class UserModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this user.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this user.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number of the account to which this user belongs.
	 * 
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number of the account to which this user belongs.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * If this user is locked to one company (and its children), this is the unique ID number of the company to which this user belongs.
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * If this user is locked to one company (and its children), this is the unique ID number of the company to which this user belongs.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String userName;

    /**
     * Getter for userName
     *
     * The username which is used to log on to the AvaTax website, or to authenticate against API calls.
	 * 
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Setter for userName
     *
     * The username which is used to log on to the AvaTax website, or to authenticate against API calls.
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    private String firstName;

    /**
     * Getter for firstName
     *
     * The first or given name of the user.
	 * 
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName
     *
     * The first or given name of the user.
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    private String lastName;

    /**
     * Getter for lastName
     *
     * The last or family name of the user.
	 * 
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName
     *
     * The last or family name of the user.
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    private String email;

    /**
     * Getter for email
     *
     * The email address to be used to contact this user. If the user has forgotten a password, an email can be sent to this email address with information on how to reset this password.
	 * 
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * The email address to be used to contact this user. If the user has forgotten a password, an email can be sent to this email address with information on how to reset this password.
     */
    public void setEmail(String value) {
        this.email = value;
    }

    private String postalCode;

    /**
     * Getter for postalCode
     *
     * The postal code in which this user resides.
	 * 
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * The postal code in which this user resides.
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    private SecurityRoleId securityRoleId;

    /**
     * Getter for securityRoleId
     *
     * The security level for this user.
	 * 
     */
    public SecurityRoleId getSecurityRoleId() {
        return this.securityRoleId;
    }

    /**
     * Setter for securityRoleId
     *
     * The security level for this user.
     */
    public void setSecurityRoleId(SecurityRoleId value) {
        this.securityRoleId = value;
    }

    private PasswordStatusId passwordStatus;

    /**
     * Getter for passwordStatus
     *
     * The status of the user's password. For a new user created, this is always going to be `UserMustChange`
	 * 
     */
    public PasswordStatusId getPasswordStatus() {
        return this.passwordStatus;
    }

    /**
     * Setter for passwordStatus
     *
     * The status of the user's password. For a new user created, this is always going to be `UserMustChange`
     */
    public void setPasswordStatus(PasswordStatusId value) {
        this.passwordStatus = value;
    }

    private Boolean isActive;

    /**
     * Getter for isActive
     *
     * True if this user is currently active.
	 * 
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive
     *
     * True if this user is currently active.
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
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

    private String subjectId;

    /**
     * Getter for subjectId
     *
     * Matches the subjectId of corresponding user record in AI.
	 * 
     */
    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * Setter for subjectId
     *
     * Matches the subjectId of corresponding user record in AI.
     */
    public void setSubjectId(String value) {
        this.subjectId = value;
    }

    private Boolean suppressNewUserEmail;

    /**
     * Getter for suppressNewUserEmail
     *
     * Suppress new user email
	 * 
     */
    public Boolean getSuppressNewUserEmail() {
        return this.suppressNewUserEmail;
    }

    /**
     * Setter for suppressNewUserEmail
     *
     * Suppress new user email
     */
    public void setSuppressNewUserEmail(Boolean value) {
        this.suppressNewUserEmail = value;
    }

    /**
     * Returns a JSON string representation of UserModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
