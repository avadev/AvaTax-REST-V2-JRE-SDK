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
 * Represents a tax rule that changes the behavior of Avalara's tax engine for certain products in certain jurisdictions.
 */
public class TaxRuleModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this tax rule.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this tax rule.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company that owns this tax rule.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company that owns this tax rule.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private Int32? taxCodeId;

    /**
     * Getter for taxCodeId;
     * The unique ID number of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public Int32? gettaxCodeId() {;
        return this.taxCodeId;;
    }

    /**
     * Setter for taxCodeId;
     * The unique ID number of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public void settaxCodeId(Int32? value) {;
        this.taxCodeId = value;;
    }


    private String taxCode;

    /**
     * Getter for taxCode;
     * The code string of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public String gettaxCode() {;
        return this.taxCode;;
    }

    /**
     * Setter for taxCode;
     * The code string of the tax code for this rule.
    * When creating or updating a tax rule, you may specify either the taxCodeId value or the taxCode value.
     */
    public void settaxCode(String value) {;
        this.taxCode = value;;
    }


    private String stateFIPS;

    /**
     * Getter for stateFIPS;
     * For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
     */
    public String getstateFIPS() {;
        return this.stateFIPS;;
    }

    /**
     * Setter for stateFIPS;
     * For U.S. tax rules, this is the state's Federal Information Processing Standard (FIPS) code.
     */
    public void setstateFIPS(String value) {;
        this.stateFIPS = value;;
    }


    private String jurisName;

    /**
     * Getter for jurisName;
     * The name of the jurisdiction to which this tax rule applies.
     */
    public String getjurisName() {;
        return this.jurisName;;
    }

    /**
     * Setter for jurisName;
     * The name of the jurisdiction to which this tax rule applies.
     */
    public void setjurisName(String value) {;
        this.jurisName = value;;
    }


    private String jurisCode;

    /**
     * Getter for jurisCode;
     * The code of the jurisdiction to which this tax rule applies.
     */
    public String getjurisCode() {;
        return this.jurisCode;;
    }

    /**
     * Setter for jurisCode;
     * The code of the jurisdiction to which this tax rule applies.
     */
    public void setjurisCode(String value) {;
        this.jurisCode = value;;
    }


    private JurisTypeId? jurisTypeId;

    /**
     * Getter for jurisTypeId;
     * The type of the jurisdiction to which this tax rule applies.
     */
    public JurisTypeId? getjurisTypeId() {;
        return this.jurisTypeId;;
    }

    /**
     * Setter for jurisTypeId;
     * The type of the jurisdiction to which this tax rule applies.
     */
    public void setjurisTypeId(JurisTypeId? value) {;
        this.jurisTypeId = value;;
    }


    private String customerUsageType;

    /**
     * Getter for customerUsageType;
     * The type of customer usage to which this rule applies.
     */
    public String getcustomerUsageType() {;
        return this.customerUsageType;;
    }

    /**
     * Setter for customerUsageType;
     * The type of customer usage to which this rule applies.
     */
    public void setcustomerUsageType(String value) {;
        this.customerUsageType = value;;
    }


    private MatchingTaxType? taxTypeId;

    /**
     * Getter for taxTypeId;
     * Indicates which tax types to which this rule applies.
     */
    public MatchingTaxType? gettaxTypeId() {;
        return this.taxTypeId;;
    }

    /**
     * Setter for taxTypeId;
     * Indicates which tax types to which this rule applies.
     */
    public void settaxTypeId(MatchingTaxType? value) {;
        this.taxTypeId = value;;
    }


    private RateType? rateTypeId;

    /**
     * Getter for rateTypeId;
     * (DEPRECATED) Enumerated rate type to which this rule applies. Please use rateTypeCode instead.
     */
    public RateType? getrateTypeId() {;
        return this.rateTypeId;;
    }

    /**
     * Setter for rateTypeId;
     * (DEPRECATED) Enumerated rate type to which this rule applies. Please use rateTypeCode instead.
     */
    public void setrateTypeId(RateType? value) {;
        this.rateTypeId = value;;
    }


    private String rateTypeCode;

    /**
     * Getter for rateTypeCode;
     * Indicates the code of the rate type that applies to this rule. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public String getrateTypeCode() {;
        return this.rateTypeCode;;
    }

    /**
     * Setter for rateTypeCode;
     * Indicates the code of the rate type that applies to this rule. Use `/api/v2/definitions/ratetypes` for a full list of rate type codes.
     */
    public void setrateTypeCode(String value) {;
        this.rateTypeCode = value;;
    }


    private TaxRuleTypeId? taxRuleTypeId;

    /**
     * Getter for taxRuleTypeId;
     * This type value determines the behavior of the tax rule.
    * You can specify that this rule controls the product's taxability or exempt / nontaxable status, the product's rate 
    * (for example, if you have been granted an official ruling for your product's rate that differs from the official rate), 
    * or other types of behavior.
     */
    public TaxRuleTypeId? gettaxRuleTypeId() {;
        return this.taxRuleTypeId;;
    }

    /**
     * Setter for taxRuleTypeId;
     * This type value determines the behavior of the tax rule.
    * You can specify that this rule controls the product's taxability or exempt / nontaxable status, the product's rate 
    * (for example, if you have been granted an official ruling for your product's rate that differs from the official rate), 
    * or other types of behavior.
     */
    public void settaxRuleTypeId(TaxRuleTypeId? value) {;
        this.taxRuleTypeId = value;;
    }


    private Boolean? isAllJuris;

    /**
     * Getter for isAllJuris;
     * Set this value to true if this tax rule applies in all jurisdictions.
     */
    public Boolean? getisAllJuris() {;
        return this.isAllJuris;;
    }

    /**
     * Setter for isAllJuris;
     * Set this value to true if this tax rule applies in all jurisdictions.
     */
    public void setisAllJuris(Boolean? value) {;
        this.isAllJuris = value;;
    }


    private Decimal? value;

    /**
     * Getter for value;
     * The corrected rate for this tax rule.
     */
    public Decimal? getvalue() {;
        return this.value;;
    }

    /**
     * Setter for value;
     * The corrected rate for this tax rule.
     */
    public void setvalue(Decimal? value) {;
        this.value = value;;
    }


    private Decimal? cap;

    /**
     * Getter for cap;
     * The maximum cap for the price of this item according to this rule.
     */
    public Decimal? getcap() {;
        return this.cap;;
    }

    /**
     * Setter for cap;
     * The maximum cap for the price of this item according to this rule.
     */
    public void setcap(Decimal? value) {;
        this.cap = value;;
    }


    private Decimal? threshold;

    /**
     * Getter for threshold;
     * The per-unit threshold that must be met before this rule applies.
     */
    public Decimal? getthreshold() {;
        return this.threshold;;
    }

    /**
     * Setter for threshold;
     * The per-unit threshold that must be met before this rule applies.
     */
    public void setthreshold(Decimal? value) {;
        this.threshold = value;;
    }


    private String options;

    /**
     * Getter for options;
     * Custom option flags for this rule.
     */
    public String getoptions() {;
        return this.options;;
    }

    /**
     * Setter for options;
     * Custom option flags for this rule.
     */
    public void setoptions(String value) {;
        this.options = value;;
    }


    private DateTime? effectiveDate;

    /**
     * Getter for effectiveDate;
     * The first date at which this rule applies. If null, this rule will apply to all dates prior to the end date.
     */
    public DateTime? geteffectiveDate() {;
        return this.effectiveDate;;
    }

    /**
     * Setter for effectiveDate;
     * The first date at which this rule applies. If null, this rule will apply to all dates prior to the end date.
     */
    public void seteffectiveDate(DateTime? value) {;
        this.effectiveDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * The last date for which this rule applies. If null, this rule will apply to all dates after the effective date.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * The last date for which this rule applies. If null, this rule will apply to all dates after the effective date.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private String description;

    /**
     * Getter for description;
     * A friendly name for this tax rule.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * A friendly name for this tax rule.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private String countyFIPS;

    /**
     * Getter for countyFIPS;
     * For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
     */
    public String getcountyFIPS() {;
        return this.countyFIPS;;
    }

    /**
     * Setter for countyFIPS;
     * For U.S. tax rules, this is the county's Federal Information Processing Standard (FIPS) code.
     */
    public void setcountyFIPS(String value) {;
        this.countyFIPS = value;;
    }


    private Boolean? isSTPro;

    /**
     * Getter for isSTPro;
     * If true, indicates this rule is for Sales Tax Pro.
     */
    public Boolean? getisSTPro() {;
        return this.isSTPro;;
    }

    /**
     * Setter for isSTPro;
     * If true, indicates this rule is for Sales Tax Pro.
     */
    public void setisSTPro(Boolean? value) {;
        this.isSTPro = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The two character ISO 3166 country code for the locations where this rule applies.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The two character ISO 3166 country code for the locations where this rule applies.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The state, region, or province name for the locations where this rule applies.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The state, region, or province name for the locations where this rule applies.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private Sourcing? sourcing;

    /**
     * Getter for sourcing;
     * The sourcing types to which this rule applies.
     */
    public Sourcing? getsourcing() {;
        return this.sourcing;;
    }

    /**
     * Setter for sourcing;
     * The sourcing types to which this rule applies.
     */
    public void setsourcing(Sourcing? value) {;
        this.sourcing = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    private String taxTypeGroup;

    /**
     * Getter for taxTypeGroup;
     * The group Id of tax types supported by Avalara. Refer to /api/v2/definitions/taxtypegroups for types we support.
     */
    public String gettaxTypeGroup() {;
        return this.taxTypeGroup;;
    }

    /**
     * Setter for taxTypeGroup;
     * The group Id of tax types supported by Avalara. Refer to /api/v2/definitions/taxtypegroups for types we support.
     */
    public void settaxTypeGroup(String value) {;
        this.taxTypeGroup = value;;
    }


    private String taxSubType;

    /**
     * Getter for taxSubType;
     * The Id of sub tax types supported by Avalara. Refer to /api/v2/definitions/taxsubtypes for types we support.
     */
    public String gettaxSubType() {;
        return this.taxSubType;;
    }

    /**
     * Setter for taxSubType;
     * The Id of sub tax types supported by Avalara. Refer to /api/v2/definitions/taxsubtypes for types we support.
     */
    public void settaxSubType(String value) {;
        this.taxSubType = value;;
    }


    private Int32? taxTypeMappingId;

    /**
     * Getter for taxTypeMappingId;
     * Id for TaxTypeMapping object
     */
    public Int32? gettaxTypeMappingId() {;
        return this.taxTypeMappingId;;
    }

    /**
     * Setter for taxTypeMappingId;
     * Id for TaxTypeMapping object
     */
    public void settaxTypeMappingId(Int32? value) {;
        this.taxTypeMappingId = value;;
    }


    private Int32? rateTypeTaxTypeMappingId;

    /**
     * Getter for rateTypeTaxTypeMappingId;
     * Id for RateTypeTaxTypeMapping object
     */
    public Int32? getrateTypeTaxTypeMappingId() {;
        return this.rateTypeTaxTypeMappingId;;
    }

    /**
     * Setter for rateTypeTaxTypeMappingId;
     * Id for RateTypeTaxTypeMapping object
     */
    public void setrateTypeTaxTypeMappingId(Int32? value) {;
        this.rateTypeTaxTypeMappingId = value;;
    }


    /**
     * Returns a JSON string representation of TaxRuleModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
