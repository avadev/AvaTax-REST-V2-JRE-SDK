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
 * Indicates one element of a sales tax rate.
 */
public class RateModel {


    private BigDecimal rate;

    /**
     * Getter for rate
     *
     * The sales tax rate for general tangible personal property in this jurisdiction.
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The sales tax rate for general tangible personal property in this jurisdiction.
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * A readable name of the tax or taxing jurisdiction related to this tax rate.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * A readable name of the tax or taxing jurisdiction related to this tax rate.
     */
    public void setName(String value) {
        this.name = value;
    }


    private JurisdictionType type;

    /**
     * Getter for type
     *
     * The type of jurisdiction associated with this tax rate.
     */
    public JurisdictionType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of jurisdiction associated with this tax rate.
     */
    public void setType(JurisdictionType value) {
        this.type = value;
    }


    /**
     * Returns a JSON string representation of RateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
