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
 * Summary information about an overall transaction.
 */
public class TransactionSummary {


    private string country;

    /**
     * Getter for country
     *
     * Two character ISO-3166 country code.
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Two character ISO-3166 country code.
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * Two or three character ISO region, state or province code, if applicable.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Two or three character ISO region, state or province code, if applicable.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private JurisdictionType jurisType;

    /**
     * Getter for jurisType
     *
     * The type of jurisdiction that collects this tax.
     */
    public JurisdictionType getJurisType() {
        return this.jurisType;
    }

    /**
     * Setter for jurisType
     *
     * The type of jurisdiction that collects this tax.
     */
    public void setJurisType(JurisdictionType value) {
        this.jurisType = value;
    }


    private string jurisCode;

    /**
     * Getter for jurisCode
     *
     * Jurisdiction Code for the taxing jurisdiction
     */
    public string getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode
     *
     * Jurisdiction Code for the taxing jurisdiction
     */
    public void setJurisCode(string value) {
        this.jurisCode = value;
    }


    private string jurisName;

    /**
     * Getter for jurisName
     *
     * The name of the jurisdiction that collects this tax.
     */
    public string getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * The name of the jurisdiction that collects this tax.
     */
    public void setJurisName(string value) {
        this.jurisName = value;
    }


    private Integer taxAuthorityType;

    /**
     * Getter for taxAuthorityType
     *
     * The unique ID of the Tax Authority Type that collects this tax.
     */
    public Integer getTaxAuthorityType() {
        return this.taxAuthorityType;
    }

    /**
     * Setter for taxAuthorityType
     *
     * The unique ID of the Tax Authority Type that collects this tax.
     */
    public void setTaxAuthorityType(Integer value) {
        this.taxAuthorityType = value;
    }


    private string stateAssignedNo;

    /**
     * Getter for stateAssignedNo
     *
     * The state assigned number of the jurisdiction that collects this tax.
     */
    public string getStateAssignedNo() {
        return this.stateAssignedNo;
    }

    /**
     * Setter for stateAssignedNo
     *
     * The state assigned number of the jurisdiction that collects this tax.
     */
    public void setStateAssignedNo(string value) {
        this.stateAssignedNo = value;
    }


    private TaxType taxType;

    /**
     * Getter for taxType
     *
     * The tax type of this tax.
     */
    public TaxType getTaxType() {
        return this.taxType;
    }

    /**
     * Setter for taxType
     *
     * The tax type of this tax.
     */
    public void setTaxType(TaxType value) {
        this.taxType = value;
    }


    private string taxName;

    /**
     * Getter for taxName
     *
     * The name of the tax.
     */
    public string getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName
     *
     * The name of the tax.
     */
    public void setTaxName(string value) {
        this.taxName = value;
    }


    private string taxGroup;

    /**
     * Getter for taxGroup
     *
     * Group code when special grouping is enabled.
     */
    public string getTaxGroup() {
        return this.taxGroup;
    }

    /**
     * Setter for taxGroup
     *
     * Group code when special grouping is enabled.
     */
    public void setTaxGroup(string value) {
        this.taxGroup = value;
    }


    private RateType rateType;

    /**
     * Getter for rateType
     *
     * (DEPRECATED) Indicates the tax rate type. Please use rateTypeCode instead.
     */
    public RateType getRateType() {
        return this.rateType;
    }

    /**
     * Setter for rateType
     *
     * (DEPRECATED) Indicates the tax rate type. Please use rateTypeCode instead.
     */
    public void setRateType(RateType value) {
        this.rateType = value;
    }


    private string rateTypeCode;

    /**
     * Getter for rateTypeCode
     *
     * Indicates the code of the rate type. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public string getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Setter for rateTypeCode
     *
     * Indicates the code of the rate type. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public void setRateTypeCode(string value) {
        this.rateTypeCode = value;
    }


    private Decimal taxable;

    /**
     * Getter for taxable
     *
     * Tax Base - The adjusted taxable amount.
     */
    public Decimal getTaxable() {
        return this.taxable;
    }

    /**
     * Setter for taxable
     *
     * Tax Base - The adjusted taxable amount.
     */
    public void setTaxable(Decimal value) {
        this.taxable = value;
    }


    private Decimal rate;

    /**
     * Getter for rate
     *
     * Tax Rate - The rate of taxation, as a fraction of the amount.
     */
    public Decimal getRate() {
        return this.rate;
    }

    /**
     * Setter for rate
     *
     * Tax Rate - The rate of taxation, as a fraction of the amount.
     */
    public void setRate(Decimal value) {
        this.rate = value;
    }


    private Decimal tax;

    /**
     * Getter for tax
     *
     * Tax amount - The calculated tax (Base * Rate).
     */
    public Decimal getTax() {
        return this.tax;
    }

    /**
     * Setter for tax
     *
     * Tax amount - The calculated tax (Base * Rate).
     */
    public void setTax(Decimal value) {
        this.tax = value;
    }


    private Decimal taxCalculated;

    /**
     * Getter for taxCalculated
     *
     * Tax Calculated by Avalara AvaTax. This may be overriden by a TaxOverride.TaxAmount.
     */
    public Decimal getTaxCalculated() {
        return this.taxCalculated;
    }

    /**
     * Setter for taxCalculated
     *
     * Tax Calculated by Avalara AvaTax. This may be overriden by a TaxOverride.TaxAmount.
     */
    public void setTaxCalculated(Decimal value) {
        this.taxCalculated = value;
    }


    private Decimal nonTaxable;

    /**
     * Getter for nonTaxable
     *
     * The amount of the transaction that was non-taxable.
     */
    public Decimal getNonTaxable() {
        return this.nonTaxable;
    }

    /**
     * Setter for nonTaxable
     *
     * The amount of the transaction that was non-taxable.
     */
    public void setNonTaxable(Decimal value) {
        this.nonTaxable = value;
    }


    private Decimal exemption;

    /**
     * Getter for exemption
     *
     * The amount of the transaction that was exempt.
     */
    public Decimal getExemption() {
        return this.exemption;
    }

    /**
     * Setter for exemption
     *
     * The amount of the transaction that was exempt.
     */
    public void setExemption(Decimal value) {
        this.exemption = value;
    }


    /**
     * Returns a JSON string representation of TransactionSummary
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
