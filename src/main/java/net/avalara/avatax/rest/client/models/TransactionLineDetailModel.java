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
 * An individual tax detail element. Represents the amount of tax calculated for a particular jurisdiction, for a particular line in an invoice.
 */
public class TransactionLineDetailModel {


    private Int64? id;

    /**
     * Getter for id;
     * The unique ID number of this tax detail.
     */
    public Int64? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this tax detail.
     */
    public void setid(Int64? value) {;
        this.id = value;;
    }


    private Int64? transactionLineId;

    /**
     * Getter for transactionLineId;
     * The unique ID number of the line within this transaction.
     */
    public Int64? gettransactionLineId() {;
        return this.transactionLineId;;
    }

    /**
     * Setter for transactionLineId;
     * The unique ID number of the line within this transaction.
     */
    public void settransactionLineId(Int64? value) {;
        this.transactionLineId = value;;
    }


    private Int64? transactionId;

    /**
     * Getter for transactionId;
     * The unique ID number of this transaction.
     */
    public Int64? gettransactionId() {;
        return this.transactionId;;
    }

    /**
     * Setter for transactionId;
     * The unique ID number of this transaction.
     */
    public void settransactionId(Int64? value) {;
        this.transactionId = value;;
    }


    private Int64? addressId;

    /**
     * Getter for addressId;
     * The unique ID number of the address used for this tax detail.
     */
    public Int64? getaddressId() {;
        return this.addressId;;
    }

    /**
     * Setter for addressId;
     * The unique ID number of the address used for this tax detail.
     */
    public void setaddressId(Int64? value) {;
        this.addressId = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The two character ISO 3166 country code of the country where this tax detail is assigned.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The two character ISO 3166 country code of the country where this tax detail is assigned.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The two-or-three character ISO region code for the region where this tax detail is assigned.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The two-or-three character ISO region code for the region where this tax detail is assigned.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private String countyFIPS;

    /**
     * Getter for countyFIPS;
     * For U.S. transactions, the Federal Information Processing Standard (FIPS) code for the county where this tax detail is assigned.
     */
    public String getcountyFIPS() {;
        return this.countyFIPS;;
    }

    /**
     * Setter for countyFIPS;
     * For U.S. transactions, the Federal Information Processing Standard (FIPS) code for the county where this tax detail is assigned.
     */
    public void setcountyFIPS(String value) {;
        this.countyFIPS = value;;
    }


    private String stateFIPS;

    /**
     * Getter for stateFIPS;
     * For U.S. transactions, the Federal Information Processing Standard (FIPS) code for the state where this tax detail is assigned.
     */
    public String getstateFIPS() {;
        return this.stateFIPS;;
    }

    /**
     * Setter for stateFIPS;
     * For U.S. transactions, the Federal Information Processing Standard (FIPS) code for the state where this tax detail is assigned.
     */
    public void setstateFIPS(String value) {;
        this.stateFIPS = value;;
    }


    private Decimal? exemptAmount;

    /**
     * Getter for exemptAmount;
     * The amount of this line that was considered exempt in this tax detail.
     */
    public Decimal? getexemptAmount() {;
        return this.exemptAmount;;
    }

    /**
     * Setter for exemptAmount;
     * The amount of this line that was considered exempt in this tax detail.
     */
    public void setexemptAmount(Decimal? value) {;
        this.exemptAmount = value;;
    }


    private Int32? exemptReasonId;

    /**
     * Getter for exemptReasonId;
     * The unique ID number of the exemption reason for this tax detail.
     */
    public Int32? getexemptReasonId() {;
        return this.exemptReasonId;;
    }

    /**
     * Setter for exemptReasonId;
     * The unique ID number of the exemption reason for this tax detail.
     */
    public void setexemptReasonId(Int32? value) {;
        this.exemptReasonId = value;;
    }


    private Boolean? inState;

    /**
     * Getter for inState;
     * True if this detail element represented an in-state transaction.
     */
    public Boolean? getinState() {;
        return this.inState;;
    }

    /**
     * Setter for inState;
     * True if this detail element represented an in-state transaction.
     */
    public void setinState(Boolean? value) {;
        this.inState = value;;
    }


    private String jurisCode;

    /**
     * Getter for jurisCode;
     * The code of the jurisdiction to which this tax detail applies.
     */
    public String getjurisCode() {;
        return this.jurisCode;;
    }

    /**
     * Setter for jurisCode;
     * The code of the jurisdiction to which this tax detail applies.
     */
    public void setjurisCode(String value) {;
        this.jurisCode = value;;
    }


    private String jurisName;

    /**
     * Getter for jurisName;
     * The name of the jurisdiction to which this tax detail applies.
     */
    public String getjurisName() {;
        return this.jurisName;;
    }

    /**
     * Setter for jurisName;
     * The name of the jurisdiction to which this tax detail applies.
     */
    public void setjurisName(String value) {;
        this.jurisName = value;;
    }


    private Int32? jurisdictionId;

    /**
     * Getter for jurisdictionId;
     * The unique ID number of the jurisdiction to which this tax detail applies.
     */
    public Int32? getjurisdictionId() {;
        return this.jurisdictionId;;
    }

    /**
     * Setter for jurisdictionId;
     * The unique ID number of the jurisdiction to which this tax detail applies.
     */
    public void setjurisdictionId(Int32? value) {;
        this.jurisdictionId = value;;
    }


    private String signatureCode;

    /**
     * Getter for signatureCode;
     * The Avalara-specified signature code of the jurisdiction to which this tax detail applies.
     */
    public String getsignatureCode() {;
        return this.signatureCode;;
    }

    /**
     * Setter for signatureCode;
     * The Avalara-specified signature code of the jurisdiction to which this tax detail applies.
     */
    public void setsignatureCode(String value) {;
        this.signatureCode = value;;
    }


    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo;
     * The state assigned number of the jurisdiction to which this tax detail applies.
     */
    public String getstateAssignedNo() {;
        return this.stateAssignedNo;;
    }

    /**
     * Setter for stateAssignedNo;
     * The state assigned number of the jurisdiction to which this tax detail applies.
     */
    public void setstateAssignedNo(String value) {;
        this.stateAssignedNo = value;;
    }


    private JurisTypeId? jurisType;

    /**
     * Getter for jurisType;
     * The type of the jurisdiction to which this tax detail applies.
     */
    public JurisTypeId? getjurisType() {;
        return this.jurisType;;
    }

    /**
     * Setter for jurisType;
     * The type of the jurisdiction to which this tax detail applies.
     */
    public void setjurisType(JurisTypeId? value) {;
        this.jurisType = value;;
    }


    private Decimal? nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount;
     * The amount of this line item that was considered nontaxable in this tax detail.
     */
    public Decimal? getnonTaxableAmount() {;
        return this.nonTaxableAmount;;
    }

    /**
     * Setter for nonTaxableAmount;
     * The amount of this line item that was considered nontaxable in this tax detail.
     */
    public void setnonTaxableAmount(Decimal? value) {;
        this.nonTaxableAmount = value;;
    }


    private Int32? nonTaxableRuleId;

    /**
     * Getter for nonTaxableRuleId;
     * The rule according to which portion of this detail was considered nontaxable.
     */
    public Int32? getnonTaxableRuleId() {;
        return this.nonTaxableRuleId;;
    }

    /**
     * Setter for nonTaxableRuleId;
     * The rule according to which portion of this detail was considered nontaxable.
     */
    public void setnonTaxableRuleId(Int32? value) {;
        this.nonTaxableRuleId = value;;
    }


    private TaxRuleTypeId? nonTaxableType;

    /**
     * Getter for nonTaxableType;
     * The type of nontaxability that was applied to this tax detail.
     */
    public TaxRuleTypeId? getnonTaxableType() {;
        return this.nonTaxableType;;
    }

    /**
     * Setter for nonTaxableType;
     * The type of nontaxability that was applied to this tax detail.
     */
    public void setnonTaxableType(TaxRuleTypeId? value) {;
        this.nonTaxableType = value;;
    }


    private Decimal? rate;

    /**
     * Getter for rate;
     * The rate at which this tax detail was calculated.
     */
    public Decimal? getrate() {;
        return this.rate;;
    }

    /**
     * Setter for rate;
     * The rate at which this tax detail was calculated.
     */
    public void setrate(Decimal? value) {;
        this.rate = value;;
    }


    private Int32? rateRuleId;

    /**
     * Getter for rateRuleId;
     * The unique ID number of the rule according to which this tax detail was calculated.
     */
    public Int32? getrateRuleId() {;
        return this.rateRuleId;;
    }

    /**
     * Setter for rateRuleId;
     * The unique ID number of the rule according to which this tax detail was calculated.
     */
    public void setrateRuleId(Int32? value) {;
        this.rateRuleId = value;;
    }


    private Int32? rateSourceId;

    /**
     * Getter for rateSourceId;
     * The unique ID number of the source of the rate according to which this tax detail was calculated.
     */
    public Int32? getrateSourceId() {;
        return this.rateSourceId;;
    }

    /**
     * Setter for rateSourceId;
     * The unique ID number of the source of the rate according to which this tax detail was calculated.
     */
    public void setrateSourceId(Int32? value) {;
        this.rateSourceId = value;;
    }


    private String serCode;

    /**
     * Getter for serCode;
     * For Streamlined Sales Tax customers, the SST Electronic Return code under which this tax detail should be applied.
     */
    public String getserCode() {;
        return this.serCode;;
    }

    /**
     * Setter for serCode;
     * For Streamlined Sales Tax customers, the SST Electronic Return code under which this tax detail should be applied.
     */
    public void setserCode(String value) {;
        this.serCode = value;;
    }


    private Sourcing? sourcing;

    /**
     * Getter for sourcing;
     * Indicates whether this tax detail applies to the origin or destination of the transaction.
     */
    public Sourcing? getsourcing() {;
        return this.sourcing;;
    }

    /**
     * Setter for sourcing;
     * Indicates whether this tax detail applies to the origin or destination of the transaction.
     */
    public void setsourcing(Sourcing? value) {;
        this.sourcing = value;;
    }


    private Decimal? tax;

    /**
     * Getter for tax;
     * The amount of tax for this tax detail.
     */
    public Decimal? gettax() {;
        return this.tax;;
    }

    /**
     * Setter for tax;
     * The amount of tax for this tax detail.
     */
    public void settax(Decimal? value) {;
        this.tax = value;;
    }


    private Decimal? taxableAmount;

    /**
     * Getter for taxableAmount;
     * The taxable amount of this tax detail.
     */
    public Decimal? gettaxableAmount() {;
        return this.taxableAmount;;
    }

    /**
     * Setter for taxableAmount;
     * The taxable amount of this tax detail.
     */
    public void settaxableAmount(Decimal? value) {;
        this.taxableAmount = value;;
    }


    private TaxType? taxType;

    /**
     * Getter for taxType;
     * The type of tax that was calculated. Depends on the company's nexus settings as well as the jurisdiction's tax laws.
     */
    public TaxType? gettaxType() {;
        return this.taxType;;
    }

    /**
     * Setter for taxType;
     * The type of tax that was calculated. Depends on the company's nexus settings as well as the jurisdiction's tax laws.
     */
    public void settaxType(TaxType? value) {;
        this.taxType = value;;
    }


    private String taxName;

    /**
     * Getter for taxName;
     * The name of the tax against which this tax amount was calculated.
     */
    public String gettaxName() {;
        return this.taxName;;
    }

    /**
     * Setter for taxName;
     * The name of the tax against which this tax amount was calculated.
     */
    public void settaxName(String value) {;
        this.taxName = value;;
    }


    private Int32? taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId;
     * The type of the tax authority to which this tax will be remitted.
     */
    public Int32? gettaxAuthorityTypeId() {;
        return this.taxAuthorityTypeId;;
    }

    /**
     * Setter for taxAuthorityTypeId;
     * The type of the tax authority to which this tax will be remitted.
     */
    public void settaxAuthorityTypeId(Int32? value) {;
        this.taxAuthorityTypeId = value;;
    }


    private Int32? taxRegionId;

    /**
     * Getter for taxRegionId;
     * The unique ID number of the tax region.
     */
    public Int32? gettaxRegionId() {;
        return this.taxRegionId;;
    }

    /**
     * Setter for taxRegionId;
     * The unique ID number of the tax region.
     */
    public void settaxRegionId(Int32? value) {;
        this.taxRegionId = value;;
    }


    private Decimal? taxCalculated;

    /**
     * Getter for taxCalculated;
     * The amount of tax that was calculated. This amount may be different if a tax override was used.
    * If the customer specified a tax override, this calculated tax value represents the amount of tax that would
    * have been charged if Avalara had calculated the tax for the rule.
     */
    public Decimal? gettaxCalculated() {;
        return this.taxCalculated;;
    }

    /**
     * Setter for taxCalculated;
     * The amount of tax that was calculated. This amount may be different if a tax override was used.
    * If the customer specified a tax override, this calculated tax value represents the amount of tax that would
    * have been charged if Avalara had calculated the tax for the rule.
     */
    public void settaxCalculated(Decimal? value) {;
        this.taxCalculated = value;;
    }


    private Decimal? taxOverride;

    /**
     * Getter for taxOverride;
     * The amount of tax override that was specified for this tax line.
     */
    public Decimal? gettaxOverride() {;
        return this.taxOverride;;
    }

    /**
     * Setter for taxOverride;
     * The amount of tax override that was specified for this tax line.
     */
    public void settaxOverride(Decimal? value) {;
        this.taxOverride = value;;
    }


    private RateType? rateType;

    /**
     * Getter for rateType;
     * (DEPRECATED) The rate type for this tax detail. Please use rateTypeCode instead.
     */
    public RateType? getrateType() {;
        return this.rateType;;
    }

    /**
     * Setter for rateType;
     * (DEPRECATED) The rate type for this tax detail. Please use rateTypeCode instead.
     */
    public void setrateType(RateType? value) {;
        this.rateType = value;;
    }


    private String rateTypeCode;

    /**
     * Getter for rateTypeCode;
     * Indicates the code of the rate type that was used to calculate this tax detail. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public String getrateTypeCode() {;
        return this.rateTypeCode;;
    }

    /**
     * Setter for rateTypeCode;
     * Indicates the code of the rate type that was used to calculate this tax detail. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public void setrateTypeCode(String value) {;
        this.rateTypeCode = value;;
    }


    private Decimal? taxableUnits;

    /**
     * Getter for taxableUnits;
     * Number of units in this line item that were calculated to be taxable according to this rate detail.
     */
    public Decimal? gettaxableUnits() {;
        return this.taxableUnits;;
    }

    /**
     * Setter for taxableUnits;
     * Number of units in this line item that were calculated to be taxable according to this rate detail.
     */
    public void settaxableUnits(Decimal? value) {;
        this.taxableUnits = value;;
    }


    private Decimal? nonTaxableUnits;

    /**
     * Getter for nonTaxableUnits;
     * Number of units in this line item that were calculated to be nontaxable according to this rate detail.
     */
    public Decimal? getnonTaxableUnits() {;
        return this.nonTaxableUnits;;
    }

    /**
     * Setter for nonTaxableUnits;
     * Number of units in this line item that were calculated to be nontaxable according to this rate detail.
     */
    public void setnonTaxableUnits(Decimal? value) {;
        this.nonTaxableUnits = value;;
    }


    private Decimal? exemptUnits;

    /**
     * Getter for exemptUnits;
     * Number of units in this line item that were calculated to be exempt according to this rate detail.
     */
    public Decimal? getexemptUnits() {;
        return this.exemptUnits;;
    }

    /**
     * Setter for exemptUnits;
     * Number of units in this line item that were calculated to be exempt according to this rate detail.
     */
    public void setexemptUnits(Decimal? value) {;
        this.exemptUnits = value;;
    }


    private String unitOfBasis;

    /**
     * Getter for unitOfBasis;
     * When calculating units, what basis of measurement did we use for calculating the units?
     */
    public String getunitOfBasis() {;
        return this.unitOfBasis;;
    }

    /**
     * Setter for unitOfBasis;
     * When calculating units, what basis of measurement did we use for calculating the units?
     */
    public void setunitOfBasis(String value) {;
        this.unitOfBasis = value;;
    }


    /**
     * Returns a JSON string representation of TransactionLineDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
