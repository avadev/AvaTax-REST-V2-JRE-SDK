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
 * Represents information about a single legal taxing jurisdiction
 */
public class JurisdictionModel {


    private string code;

    /**
     * Getter for code
     *
     * The code that is used to identify this jurisdiction
     */
    public string getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The code that is used to identify this jurisdiction
     */
    public void setCode(string value) {
        this.code = value;
    }


    private string name;

    /**
     * Getter for name
     *
     * The name of this jurisdiction
     */
    public string getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this jurisdiction
     */
    public void setName(string value) {
        this.name = value;
    }


    private JurisdictionType type;

    /**
     * Getter for type
     *
     * The type of the jurisdiction, indicating whether it is a country, state/region, city, for example.
     */
    public JurisdictionType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of the jurisdiction, indicating whether it is a country, state/region, city, for example.
     */
    public void setType(JurisdictionType value) {
        this.type = value;
    }


    private BigDecimal rate;

    /**
     * Getter for rate
     *
     * The base rate of tax specific to this jurisdiction.
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * The base rate of tax specific to this jurisdiction.
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }


    private BigDecimal salesRate;

    /**
     * Getter for salesRate
     *
     * The "Sales" tax rate specific to this jurisdiction.
     */
    public BigDecimal getSalesRate() {
        return this.salesRate;
    }

    /**
     * Setter for salesRate
     *
     * The "Sales" tax rate specific to this jurisdiction.
     */
    public void setSalesRate(BigDecimal value) {
        this.salesRate = value;
    }


    private string signatureCode;

    /**
     * Getter for signatureCode
     *
     * The Avalara-supplied signature code for this jurisdiction.
     */
    public string getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode
     *
     * The Avalara-supplied signature code for this jurisdiction.
     */
    public void setSignatureCode(string value) {
        this.signatureCode = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * The state assigned code for this jurisdiction, if any.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The state assigned code for this jurisdiction, if any.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private BigDecimal useRate;

    /**
     * Getter for useRate
     *
     * The "Seller's Use" tax rate specific to this jurisdiction.
     */
    public BigDecimal getUseRate() {
        return this.useRate;
    }

    /**
     * Setter for useRate
     *
     * The "Seller's Use" tax rate specific to this jurisdiction.
     */
    public void setUseRate(BigDecimal value) {
        this.useRate = value;
    }


    /**
     * Returns a JSON string representation of JurisdictionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
