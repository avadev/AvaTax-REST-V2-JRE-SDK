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
 * Security Role Assignment Update Request
 */
public class SecurityRoleAssignmentUpdate {


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

    private String companyId;

    /**
     * Getter for companyId
     *
     * Company Id. Must match the target user's own CompanyId exactly: omit it for an
    * account-level user (whose CompanyId is null), or provide the user's own CompanyId for
    * a company-level user. It cannot be used to assign a different company than the user's own.
     */
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Company Id. Must match the target user's own CompanyId exactly: omit it for an
    * account-level user (whose CompanyId is null), or provide the user's own CompanyId for
    * a company-level user. It cannot be used to assign a different company than the user's own.
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    private String securityRoleId;

    /**
     * Getter for securityRoleId
     *
     * Security Role Id - must be a CustomSecurityRole id (GUID) belonging to this account.
    * System SecurityRole ids are not supported here as of now.
     */
    public String getSecurityRoleId() {
        return this.securityRoleId;
    }

    /**
     * Setter for securityRoleId
     *
     * Security Role Id - must be a CustomSecurityRole id (GUID) belonging to this account.
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

    /**
     * Returns a JSON string representation of SecurityRoleAssignmentUpdate
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
