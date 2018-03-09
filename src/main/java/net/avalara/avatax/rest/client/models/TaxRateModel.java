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
 * Contains information about the general tangible personal property sales tax rates for this jurisdiction.
* 
* This rate is calculated by making assumptions about the tax calculation process. It does not account for:
* 
* * Sourcing rules, such as origin-and-destination based transactions.
* * Product taxability rules, such as different tax rates for different product types.
* * Nexus declarations, where some customers are not obligated to collect tax in specific jurisdictions.
* * Tax thresholds and rate differences by amounts.
* * And many more custom use cases.
* 
* To upgrade to a fully-featured and accurate tax process that handles these scenarios correctly, please
* contact Avalara to upgrade to AvaTax!
 */
public class TaxRateModel {


    private BigDecimal totalRate;

    /**
     * Getter for totalRate
     *
     * The total sales tax rate for general tangible personal property sold at a retail point of presence
    * in this jurisdiction on this date.
     */
    public BigDecimal getTotalRate() {
        return this.totalRate;
    }

    /**
     * Setter for totalRate
     *
     * The total sales tax rate for general tangible personal property sold at a retail point of presence
    * in this jurisdiction on this date.
     */
    public void setTotalRate(BigDecimal value) {
        this.totalRate = value;
    }


    private ArrayList<RateModel> rates;

    /**
     * Getter for rates
     *
     * The list of individual rate elements for general tangible personal property sold at a retail
    * point of presence in this jurisdiction on this date.
     */
    public ArrayList<RateModel> getRates() {
        return this.rates;
    }

    /**
     * Setter for rates
     *
     * The list of individual rate elements for general tangible personal property sold at a retail
    * point of presence in this jurisdiction on this date.
     */
    public void setRates(ArrayList<RateModel> value) {
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
