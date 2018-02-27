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
 * Status of an Avalara Managed Returns funding configuration for a company
 */
public class FundingConfigurationModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * CompanyID
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * CompanyID
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String systemType;

    /**
     * Getter for systemType
     *
     * Domain
     */
    public String getSystemType() {
        return this.systemType;
    }

    /**
     * Setter for systemType
     *
     * Domain
     */
    public void setSystemType(String value) {
        this.systemType = value;
    }


    private String currency;

    /**
     * Getter for currency
     *
     * Recipient
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Setter for currency
     *
     * Recipient
     */
    public void setCurrency(String value) {
        this.currency = value;
    }


    private Boolean isFundingSetup;

    /**
     * Getter for isFundingSetup
     *
     * Sender
     */
    public Boolean getIsFundingSetup() {
        return this.isFundingSetup;
    }

    /**
     * Setter for isFundingSetup
     *
     * Sender
     */
    public void setIsFundingSetup(Boolean value) {
        this.isFundingSetup = value;
    }


    private String fundingMethod;

    /**
     * Getter for fundingMethod
     *
     * DocumentKey
     */
    public String getFundingMethod() {
        return this.fundingMethod;
    }

    /**
     * Setter for fundingMethod
     *
     * DocumentKey
     */
    public void setFundingMethod(String value) {
        this.fundingMethod = value;
    }


    private Date lastUpdated;

    /**
     * Getter for lastUpdated
     *
     * LastPolled
     */
    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Setter for lastUpdated
     *
     * LastPolled
     */
    public void setLastUpdated(Date value) {
        this.lastUpdated = value;
    }


    /**
     * Returns a JSON string representation of FundingConfigurationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
