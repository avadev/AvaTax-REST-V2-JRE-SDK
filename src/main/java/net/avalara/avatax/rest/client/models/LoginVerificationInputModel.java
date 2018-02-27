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
 * Represents a verification request using Skyscraper for a company
 */
public class LoginVerificationInputModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * CompanyId that we are verifying the login information for
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * CompanyId that we are verifying the login information for
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * AccountId of the login verification
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * AccountId of the login verification
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * Region of the verification request
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Region of the verification request
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String username;

    /**
     * Getter for username
     *
     * Username that we are using for verification
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for username
     *
     * Username that we are using for verification
     */
    public void setUsername(String value) {
        this.username = value;
    }


    private String password;

    /**
     * Getter for password
     *
     * Password we are using for verification
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for password
     *
     * Password we are using for verification
     */
    public void setPassword(String value) {
        this.password = value;
    }


    private String additionalOptions;

    /**
     * Getter for additionalOptions
     *
     * Additional options of the verification
     */
    public String getAdditionalOptions() {
        return this.additionalOptions;
    }

    /**
     * Setter for additionalOptions
     *
     * Additional options of the verification
     */
    public void setAdditionalOptions(String value) {
        this.additionalOptions = value;
    }


    private Integer bulkRequestId;

    /**
     * Getter for bulkRequestId
     *
     * Bulk Request Id of the verification
     */
    public Integer getBulkRequestId() {
        return this.bulkRequestId;
    }

    /**
     * Setter for bulkRequestId
     *
     * Bulk Request Id of the verification
     */
    public void setBulkRequestId(Integer value) {
        this.bulkRequestId = value;
    }


    private Integer priority;

    /**
     * Getter for priority
     *
     * Priority of the verification request
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Setter for priority
     *
     * Priority of the verification request
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }


    /**
     * Returns a JSON string representation of LoginVerificationInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
