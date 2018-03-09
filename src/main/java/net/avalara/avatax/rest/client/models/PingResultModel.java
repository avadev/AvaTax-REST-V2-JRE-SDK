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
 * Ping Result Model
 */
public class PingResultModel {


    private String version;

    /**
     * Getter for version
     *
     * Version number
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Setter for version
     *
     * Version number
     */
    public void setVersion(String value) {
        this.version = value;
    }


    private Boolean authenticated;

    /**
     * Getter for authenticated
     *
     * Returns true if you provided authentication for this API call; false if you did not.
     */
    public Boolean getAuthenticated() {
        return this.authenticated;
    }

    /**
     * Setter for authenticated
     *
     * Returns true if you provided authentication for this API call; false if you did not.
     */
    public void setAuthenticated(Boolean value) {
        this.authenticated = value;
    }


    private AuthenticationTypeId authenticationType;

    /**
     * Getter for authenticationType
     *
     * Returns the type of authentication you provided, if authenticated
     */
    public AuthenticationTypeId getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Setter for authenticationType
     *
     * Returns the type of authentication you provided, if authenticated
     */
    public void setAuthenticationType(AuthenticationTypeId value) {
        this.authenticationType = value;
    }


    private String authenticatedUserName;

    /**
     * Getter for authenticatedUserName
     *
     * The username of the currently authenticated user, if any.
     */
    public String getAuthenticatedUserName() {
        return this.authenticatedUserName;
    }

    /**
     * Setter for authenticatedUserName
     *
     * The username of the currently authenticated user, if any.
     */
    public void setAuthenticatedUserName(String value) {
        this.authenticatedUserName = value;
    }


    private Integer authenticatedUserId;

    /**
     * Getter for authenticatedUserId
     *
     * The ID number of the currently authenticated user, if any.
     */
    public Integer getAuthenticatedUserId() {
        return this.authenticatedUserId;
    }

    /**
     * Setter for authenticatedUserId
     *
     * The ID number of the currently authenticated user, if any.
     */
    public void setAuthenticatedUserId(Integer value) {
        this.authenticatedUserId = value;
    }


    private Integer authenticatedAccountId;

    /**
     * Getter for authenticatedAccountId
     *
     * The ID number of the currently authenticated user's account, if any.
     */
    public Integer getAuthenticatedAccountId() {
        return this.authenticatedAccountId;
    }

    /**
     * Setter for authenticatedAccountId
     *
     * The ID number of the currently authenticated user's account, if any.
     */
    public void setAuthenticatedAccountId(Integer value) {
        this.authenticatedAccountId = value;
    }


    private String crmid;

    /**
     * Getter for crmid
     *
     * The connected Salesforce account.
     */
    public String getCrmid() {
        return this.crmid;
    }

    /**
     * Setter for crmid
     *
     * The connected Salesforce account.
     */
    public void setCrmid(String value) {
        this.crmid = value;
    }


    /**
     * Returns a JSON string representation of PingResultModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
