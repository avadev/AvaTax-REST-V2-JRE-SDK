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
 * Input model for creating or updating a company exchange rate provider configuration.
* <br>
* Name the feed with Avalara.AvaTax.AccountServices.Models.v2.ExchangeRateProviderConfigInputModel.providerCode and Avalara.AvaTax.AccountServices.Models.v2.ExchangeRateProviderConfigInputModel.frequency; both are resolved
* server-side against the catalogue from `ListExchangeRateProviderDefinitions`. The
* server derives `currencyCode` from that pair. Do not send
* `providerFrequencyMappingId`.
* <br>
* First release: only Switzerland (`CH`) with provider `SNB` may be written, and
* frequency is the only customer choice on that slot. System defaults are read-only.
* <br>
* On create, Avalara.AvaTax.AccountServices.Models.v2.ExchangeRateProviderConfigInputModel.effDate must be today or later (UTC). On update, restate the
* immutable fields and change only Avalara.AvaTax.AccountServices.Models.v2.ExchangeRateProviderConfigInputModel.endDate (today or later).
 */
public class ExchangeRateProviderConfigInputModel {


    private String countryCode;

    /**
     * Getter for countryCode
     *
     * ISO 3166-1 alpha-2 country code this configuration applies to. Required on a customer
    * write.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for countryCode
     *
     * ISO 3166-1 alpha-2 country code this configuration applies to. Required on a customer
    * write.
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    private String providerCode;

    /**
     * Getter for providerCode
     *
     * The provider feed this configuration selects, as reported by the definition endpoint
    * (for example `SNB` or `ECB`). Matched case-insensitively.
     */
    public String getProviderCode() {
        return this.providerCode;
    }

    /**
     * Setter for providerCode
     *
     * The provider feed this configuration selects, as reported by the definition endpoint
    * (for example `SNB` or `ECB`). Matched case-insensitively.
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    private String frequency;

    /**
     * Getter for frequency
     *
     * The refresh frequency this configuration selects, as reported by the definition
    * endpoint (for example `Daily` or `Monthly`). Matched case-insensitively.
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * Setter for frequency
     *
     * The refresh frequency this configuration selects, as reported by the definition
    * endpoint (for example `Daily` or `Monthly`). Matched case-insensitively.
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    private Date effDate;

    /**
     * Getter for effDate
     *
     * The date from which this configuration takes effect. Required on create; must be today
    * or a future date (UTC). Immutable after create.
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * The date from which this configuration takes effect. Required on create; must be today
    * or a future date (UTC). Immutable after create.
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date on which this configuration expires. Omitting it on create stores
    * 9999-12-31. Required on update; must be today or a future date (UTC).
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date on which this configuration expires. Omitting it on create stores
    * 9999-12-31. Required on update; must be today or a future date (UTC).
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of ExchangeRateProviderConfigInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
