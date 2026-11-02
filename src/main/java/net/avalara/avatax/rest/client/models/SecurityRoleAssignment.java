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
 * Security Role Assignment Response Model
 */
public class SecurityRoleAssignment {


    private String userRoleMatrixId;

    /**
     * Getter for userRoleMatrixId
     *
     * Assignment identifier (dbo.UserRoleMatrix.UserRoleMatrixId).
     */
    public String getUserRoleMatrixId() {
        return this.userRoleMatrixId;
    }

    /**
     * Setter for userRoleMatrixId
     *
     * Assignment identifier (dbo.UserRoleMatrix.UserRoleMatrixId).
     */
    public void setUserRoleMatrixId(String value) {
        this.userRoleMatrixId = value;
    }

    private String userId;

    /**
     * Getter for userId
     *
     * User Id.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Setter for userId
     *
     * User Id.
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    private String securityRoleId;

    /**
     * Getter for securityRoleId
     *
     * Security Role Id - a CustomSecurityRole id (GUID) belonging to this account.
    * System SecurityRole ids are not supported here as of now.
     */
    public String getSecurityRoleId() {
        return this.securityRoleId;
    }

    /**
     * Setter for securityRoleId
     *
     * Security Role Id - a CustomSecurityRole id (GUID) belonging to this account.
    * System SecurityRole ids are not supported here as of now.
     */
    public void setSecurityRoleId(String value) {
        this.securityRoleId = value;
    }

    private String accountId;

    /**
     * Getter for accountId
     *
     * Account Id.
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * Account Id.
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    private String companyId;

    /**
     * Getter for companyId
     *
     * Company Id. Optional.
     */
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Company Id. Optional.
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
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

    /**
     * Returns a JSON string representation of SecurityRoleAssignment
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
