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
 * One (provider, frequency) pair that AvaTax offers for exchange rate provider configuration.
* <br>
* Read this catalogue before writing an `ExchangeRateProviderConfig`: the write contract
* carries Avalara.AvaTax.AccountServices.Models.v2.ExchangeRateProviderDefinitionOutputModel.providerCode and Avalara.AvaTax.AccountServices.Models.v2.ExchangeRateProviderDefinitionOutputModel.frequency, and both must name a pair
* listed here. The pair also determines the configuration's currency, which is why
* Avalara.AvaTax.AccountServices.Models.v2.ExchangeRateProviderDefinitionOutputModel.baseCurrency is returned but never supplied.
* <br>
* A provider offered at more than one frequency appears as multiple entries sharing the same
* Avalara.AvaTax.AccountServices.Models.v2.ExchangeRateProviderDefinitionOutputModel.providerCode (for example SNB Daily and SNB Monthly).
 */
public class ExchangeRateProviderDefinitionOutputModel {


    private String providerCode;

    /**
     * Getter for providerCode
     *
     * The provider's code, for example `SNB` or `ECB`. Supply this as
    * `providerCode` when creating a configuration.
     */
    public String getProviderCode() {
        return this.providerCode;
    }

    /**
     * Setter for providerCode
     *
     * The provider's code, for example `SNB` or `ECB`. Supply this as
    * `providerCode` when creating a configuration.
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    private String providerName;

    /**
     * Getter for providerName
     *
     * The provider's display name, for example `Swiss National Bank`.
     */
    public String getProviderName() {
        return this.providerName;
    }

    /**
     * Setter for providerName
     *
     * The provider's display name, for example `Swiss National Bank`.
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    private String frequency;

    /**
     * Getter for frequency
     *
     * The refresh frequency this provider is offered at, for example `Daily` or
    * `Monthly`. Supply this as `frequency` when creating a configuration.
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * Setter for frequency
     *
     * The refresh frequency this provider is offered at, for example `Daily` or
    * `Monthly`. Supply this as `frequency` when creating a configuration.
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    private String baseCurrency;

    /**
     * Getter for baseCurrency
     *
     * The currency this provider publishes rates against. A configuration's
    * `currencyCode` is derived from this, which is why the write contract does not
    * accept a currency.
     */
    public String getBaseCurrency() {
        return this.baseCurrency;
    }

    /**
     * Setter for baseCurrency
     *
     * The currency this provider publishes rates against. A configuration's
    * `currencyCode` is derived from this, which is why the write contract does not
    * accept a currency.
     */
    public void setBaseCurrency(String value) {
        this.baseCurrency = value;
    }

    /**
     * Returns a JSON string representation of ExchangeRateProviderDefinitionOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
