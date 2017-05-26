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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Tax Rate Model
 */
public class TaxRateModel {


    private BigDecimal totalRate;

    /**
     * Getter for totalRate
     *
     * Total Rate
     */
    public BigDecimal getTotalRate() {
        return this.totalRate;
    }

    /**
     * Setter for totalRate
     *
     * Total Rate
     */
    public void setTotalRate(BigDecimal value) {
        this.totalRate = value;
    }


    private RateModel[] rates;

    /**
     * Getter for rates
     *
     * Rates
     */
    public RateModel[] getRates() {
        return this.rates;
    }

    /**
     * Setter for rates
     *
     * Rates
     */
    public void setRates(RateModel[] value) {
        this.rates = value;
    }


    /**
     * Returns a JSON string representation of TaxRateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
