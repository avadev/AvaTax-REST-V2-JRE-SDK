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
 * An exchange rate provider configuration: which ERS provider feed and refresh frequency a
* company uses when converting a given currency, optionally narrowed to a country.
* <br>`currencyCode` is derived from the resolved provider's base currency. The internal
* mapping id is not returned. System-default configurations are read-only over this API.
 */
public class ExchangeRateProviderConfigOutputModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID of this exchange rate provider configuration row.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID of this exchange rate provider configuration row.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The ID of the company that owns this configuration. Inherited defaults are system-owned.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The ID of the company that owns this configuration. Inherited defaults are system-owned.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * ISO 4217 alpha-3 code of the currency this configuration applies to. Derived from the
    * resolved provider's base currency; not supplied by the caller.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * ISO 4217 alpha-3 code of the currency this configuration applies to. Derived from the
    * resolved provider's base currency; not supplied by the caller.
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    private String countryCode;

    /**
     * Getter for countryCode
     *
     * ISO 3166-1 alpha-2 country code this configuration applies to. Null appears only on
    * system default rows.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for countryCode
     *
     * ISO 3166-1 alpha-2 country code this configuration applies to. Null appears only on
    * system default rows.
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    private String providerCode;

    /**
     * Getter for providerCode
     *
     * The provider feed this configuration selects (for example `SNB` or `ECB`).
     */
    public String getProviderCode() {
        return this.providerCode;
    }

    /**
     * Setter for providerCode
     *
     * The provider feed this configuration selects (for example `SNB` or `ECB`).
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    private String frequency;

    /**
     * Getter for frequency
     *
     * The refresh frequency this configuration selects (for example `Daily` or
    * `Monthly`).
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * Setter for frequency
     *
     * The refresh frequency this configuration selects (for example `Daily` or
    * `Monthly`).
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    private Date effDate;

    /**
     * Getter for effDate
     *
     * The date from which this configuration takes effect.
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * The date from which this configuration takes effect.
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date on which this configuration expires. A stored open-ended row uses
    * 9999-12-31.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date on which this configuration expires. A stored open-ended row uses
    * 9999-12-31.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Boolean isConfigurable;

    /**
     * Getter for isConfigurable
     *
     * Whether this row's country and provider combination is available for customer
    * configuration. System-default rows return the stored policy value; customer rows return a
    * value computed from their country and provider. In the first release, this is true only
    * for Switzerland with SNB. This value is null only when a system-default row has no stored
    * policy value.
     */
    public Boolean getIsConfigurable() {
        return this.isConfigurable;
    }

    /**
     * Setter for isConfigurable
     *
     * Whether this row's country and provider combination is available for customer
    * configuration. System-default rows return the stored policy value; customer rows return a
    * value computed from their country and provider. In the first release, this is true only
    * for Switzerland with SNB. This value is null only when a system-default row has no stored
    * policy value.
     */
    public void setIsConfigurable(Boolean value) {
        this.isConfigurable = value;
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

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The user ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The user ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    /**
     * Returns a JSON string representation of ExchangeRateProviderConfigOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
