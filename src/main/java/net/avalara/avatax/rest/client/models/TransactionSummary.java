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


    private String country;

    /**
     * Getter for country;
     * Two character ISO-3166 country code.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * Two character ISO-3166 country code.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String region;

    /**
     * Getter for region;
     * Two or three character ISO region, state or province code, if applicable.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * Two or three character ISO region, state or province code, if applicable.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private JurisdictionType? jurisType;

    /**
     * Getter for jurisType;
     * The type of jurisdiction that collects this tax.
     */
    public JurisdictionType? getjurisType() {;
        return this.jurisType;;
    }

    /**
     * Setter for jurisType;
     * The type of jurisdiction that collects this tax.
     */
    public void setjurisType(JurisdictionType? value) {;
        this.jurisType = value;;
    }


    private String jurisCode;

    /**
     * Getter for jurisCode;
     * Jurisdiction Code for the taxing jurisdiction
     */
    public String getjurisCode() {;
        return this.jurisCode;;
    }

    /**
     * Setter for jurisCode;
     * Jurisdiction Code for the taxing jurisdiction
     */
    public void setjurisCode(String value) {;
        this.jurisCode = value;;
    }


    private String jurisName;

    /**
     * Getter for jurisName;
     * The name of the jurisdiction that collects this tax.
     */
    public String getjurisName() {;
        return this.jurisName;;
    }

    /**
     * Setter for jurisName;
     * The name of the jurisdiction that collects this tax.
     */
    public void setjurisName(String value) {;
        this.jurisName = value;;
    }


    private Int32? taxAuthorityType;

    /**
     * Getter for taxAuthorityType;
     * The unique ID of the Tax Authority Type that collects this tax.
     */
    public Int32? gettaxAuthorityType() {;
        return this.taxAuthorityType;;
    }

    /**
     * Setter for taxAuthorityType;
     * The unique ID of the Tax Authority Type that collects this tax.
     */
    public void settaxAuthorityType(Int32? value) {;
        this.taxAuthorityType = value;;
    }


    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo;
     * The state assigned number of the jurisdiction that collects this tax.
     */
    public String getstateAssignedNo() {;
        return this.stateAssignedNo;;
    }

    /**
     * Setter for stateAssignedNo;
     * The state assigned number of the jurisdiction that collects this tax.
     */
    public void setstateAssignedNo(String value) {;
        this.stateAssignedNo = value;;
    }


    private TaxType? taxType;

    /**
     * Getter for taxType;
     * The tax type of this tax.
     */
    public TaxType? gettaxType() {;
        return this.taxType;;
    }

    /**
     * Setter for taxType;
     * The tax type of this tax.
     */
    public void settaxType(TaxType? value) {;
        this.taxType = value;;
    }


    private String taxName;

    /**
     * Getter for taxName;
     * The name of the tax.
     */
    public String gettaxName() {;
        return this.taxName;;
    }

    /**
     * Setter for taxName;
     * The name of the tax.
     */
    public void settaxName(String value) {;
        this.taxName = value;;
    }


    private String taxGroup;

    /**
     * Getter for taxGroup;
     * Group code when special grouping is enabled.
     */
    public String gettaxGroup() {;
        return this.taxGroup;;
    }

    /**
     * Setter for taxGroup;
     * Group code when special grouping is enabled.
     */
    public void settaxGroup(String value) {;
        this.taxGroup = value;;
    }


    private RateType? rateType;

    /**
     * Getter for rateType;
     * (DEPRECATED) Indicates the tax rate type. Please use rateTypeCode instead.
     */
    public RateType? getrateType() {;
        return this.rateType;;
    }

    /**
     * Setter for rateType;
     * (DEPRECATED) Indicates the tax rate type. Please use rateTypeCode instead.
     */
    public void setrateType(RateType? value) {;
        this.rateType = value;;
    }


    private String rateTypeCode;

    /**
     * Getter for rateTypeCode;
     * Indicates the code of the rate type. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public String getrateTypeCode() {;
        return this.rateTypeCode;;
    }

    /**
     * Setter for rateTypeCode;
     * Indicates the code of the rate type. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public void setrateTypeCode(String value) {;
        this.rateTypeCode = value;;
    }


    private Decimal? taxable;

    /**
     * Getter for taxable;
     * Tax Base - The adjusted taxable amount.
     */
    public Decimal? gettaxable() {;
        return this.taxable;;
    }

    /**
     * Setter for taxable;
     * Tax Base - The adjusted taxable amount.
     */
    public void settaxable(Decimal? value) {;
        this.taxable = value;;
    }


    private Decimal? rate;

    /**
     * Getter for rate;
     * Tax Rate - The rate of taxation, as a fraction of the amount.
     */
    public Decimal? getrate() {;
        return this.rate;;
    }

    /**
     * Setter for rate;
     * Tax Rate - The rate of taxation, as a fraction of the amount.
     */
    public void setrate(Decimal? value) {;
        this.rate = value;;
    }


    private Decimal? tax;

    /**
     * Getter for tax;
     * Tax amount - The calculated tax (Base * Rate).
     */
    public Decimal? gettax() {;
        return this.tax;;
    }

    /**
     * Setter for tax;
     * Tax amount - The calculated tax (Base * Rate).
     */
    public void settax(Decimal? value) {;
        this.tax = value;;
    }


    private Decimal? taxCalculated;

    /**
     * Getter for taxCalculated;
     * Tax Calculated by Avalara AvaTax. This may be overriden by a TaxOverride.TaxAmount.
     */
    public Decimal? gettaxCalculated() {;
        return this.taxCalculated;;
    }

    /**
     * Setter for taxCalculated;
     * Tax Calculated by Avalara AvaTax. This may be overriden by a TaxOverride.TaxAmount.
     */
    public void settaxCalculated(Decimal? value) {;
        this.taxCalculated = value;;
    }


    private Decimal? nonTaxable;

    /**
     * Getter for nonTaxable;
     * The amount of the transaction that was non-taxable.
     */
    public Decimal? getnonTaxable() {;
        return this.nonTaxable;;
    }

    /**
     * Setter for nonTaxable;
     * The amount of the transaction that was non-taxable.
     */
    public void setnonTaxable(Decimal? value) {;
        this.nonTaxable = value;;
    }


    private Decimal? exemption;

    /**
     * Getter for exemption;
     * The amount of the transaction that was exempt.
     */
    public Decimal? getexemption() {;
        return this.exemption;;
    }

    /**
     * Setter for exemption;
     * The amount of the transaction that was exempt.
     */
    public void setexemption(Decimal? value) {;
        this.exemption = value;;
    }


    /**
     * Returns a JSON string representation of TransactionSummary
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
