package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * An account user who is permitted to use AvaTax.
 */
public class UserModel {
    private PasswordStatusId passwordStatus;

    /**
     * Getter for passwordStatus - An account user who is permitted to use AvaTax.
     */
    public PasswordStatusId getPasswordStatus() {
        return this.passwordStatus;
    }

    /**
     * Setter for passwordStatus - An account user who is permitted to use AvaTax.
     */
    public void setPasswordStatus(PasswordStatusId passwordStatus) {
        this.passwordStatus = passwordStatus;
    }

    
    private SecurityRoleId securityRoleId;

    /**
     * Getter for securityRoleId - An account user who is permitted to use AvaTax.
     */
    public SecurityRoleId getSecurityRoleId() {
        return this.securityRoleId;
    }

    /**
     * Setter for securityRoleId - An account user who is permitted to use AvaTax.
     */
    public void setSecurityRoleId(SecurityRoleId securityRoleId) {
        this.securityRoleId = securityRoleId;
    }

    
    private String email;

    /**
     * Getter for email - An account user who is permitted to use AvaTax.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - An account user who is permitted to use AvaTax.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - An account user who is permitted to use AvaTax.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - An account user who is permitted to use AvaTax.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Integer accountId;

    /**
     * Getter for accountId - An account user who is permitted to use AvaTax.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId - An account user who is permitted to use AvaTax.
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - An account user who is permitted to use AvaTax.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - An account user who is permitted to use AvaTax.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private String lastName;

    /**
     * Getter for lastName - An account user who is permitted to use AvaTax.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName - An account user who is permitted to use AvaTax.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    private String firstName;

    /**
     * Getter for firstName - An account user who is permitted to use AvaTax.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName - An account user who is permitted to use AvaTax.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    private Integer id;

    /**
     * Getter for id - An account user who is permitted to use AvaTax.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - An account user who is permitted to use AvaTax.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Boolean isActive;

    /**
     * Getter for isActive - An account user who is permitted to use AvaTax.
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive - An account user who is permitted to use AvaTax.
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - An account user who is permitted to use AvaTax.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - An account user who is permitted to use AvaTax.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - An account user who is permitted to use AvaTax.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - An account user who is permitted to use AvaTax.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - An account user who is permitted to use AvaTax.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - An account user who is permitted to use AvaTax.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private String userName;

    /**
     * Getter for userName - An account user who is permitted to use AvaTax.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Setter for userName - An account user who is permitted to use AvaTax.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - An account user who is permitted to use AvaTax.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - An account user who is permitted to use AvaTax.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    


    /**
     * Returns a JSON string representation of UserModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    