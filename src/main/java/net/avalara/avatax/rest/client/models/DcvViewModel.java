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
 * ViewModel to get Domain control verification
 */
public class DcvViewModel {


    private String id;

    /**
     * Getter for id
     *
     * Unique id of the Domain control verification
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique id of the Domain control verification
     */
    public void setId(String value) {
        this.id = value;
    }

    private String domainName;

    /**
     * Getter for domainName
     *
     * Domain name for which Domain control verification record is created
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Setter for domainName
     *
     * Domain name for which Domain control verification record is created
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    private Context context;

    /**
     * Getter for context
     *
     * 
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * Setter for context
     *
     * 
     */
    public void setContext(Context value) {
        this.context = value;
    }

    private String token;

    /**
     * Getter for token
     *
     * Unique token for Domain control verification
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Setter for token
     *
     * Unique token for Domain control verification
     */
    public void setToken(String value) {
        this.token = value;
    }

    private String status;

    /**
     * Getter for status
     *
     * Status of the domain Verified/Pending/Cancelled
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * Status of the domain Verified/Pending/Cancelled
     */
    public void setStatus(String value) {
        this.status = value;
    }

    private String emailId;

    /**
     * Getter for emailId
     *
     * Email id of the user who create Domain control verification
     */
    public String getEmailId() {
        return this.emailId;
    }

    /**
     * Setter for emailId
     *
     * Email id of the user who create Domain control verification
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    private String createdOn;

    /**
     * Getter for createdOn
     *
     * Domain control verification creation date
     */
    public String getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for createdOn
     *
     * Domain control verification creation date
     */
    public void setCreatedOn(String value) {
        this.createdOn = value;
    }

    private String createdBy;

    /**
     * Getter for createdBy
     *
     * Domain control verification created by
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for createdBy
     *
     * Domain control verification created by
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    private String updatedOn;

    /**
     * Getter for updatedOn
     *
     * Domain control verification update date
     */
    public String getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for updatedOn
     *
     * Domain control verification update date
     */
    public void setUpdatedOn(String value) {
        this.updatedOn = value;
    }

    private String updatedBy;

    /**
     * Getter for updatedBy
     *
     * Domain control verification update by
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for updatedBy
     *
     * Domain control verification update by
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Returns a JSON string representation of DcvViewModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
