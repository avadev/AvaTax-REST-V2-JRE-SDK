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
 * Regions
 */
public class FilingRegionModel {


    private Int64? id;

    /**
     * Getter for id;
     * The unique ID number of this filing region.
     */
    public Int64? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this filing region.
     */
    public void setid(Int64? value) {;
        this.id = value;;
    }


    private Int64? filingId;

    /**
     * Getter for filingId;
     * The filing id that this region belongs too
     */
    public Int64? getfilingId() {;
        return this.filingId;;
    }

    /**
     * Setter for filingId;
     * The filing id that this region belongs too
     */
    public void setfilingId(Int64? value) {;
        this.filingId = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The two-character ISO-3166 code for the country.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The two-character ISO-3166 code for the country.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The two or three character region code for the region.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The two or three character region code for the region.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private Decimal? salesAmount;

    /**
     * Getter for salesAmount;
     * The sales amount.
     */
    public Decimal? getsalesAmount() {;
        return this.salesAmount;;
    }

    /**
     * Setter for salesAmount;
     * The sales amount.
     */
    public void setsalesAmount(Decimal? value) {;
        this.salesAmount = value;;
    }


    private Decimal? taxableAmount;

    /**
     * Getter for taxableAmount;
     * The taxable amount.
     */
    public Decimal? gettaxableAmount() {;
        return this.taxableAmount;;
    }

    /**
     * Setter for taxableAmount;
     * The taxable amount.
     */
    public void settaxableAmount(Decimal? value) {;
        this.taxableAmount = value;;
    }


    private Decimal? taxAmount;

    /**
     * Getter for taxAmount;
     * The tax amount.
     */
    public Decimal? gettaxAmount() {;
        return this.taxAmount;;
    }

    /**
     * Setter for taxAmount;
     * The tax amount.
     */
    public void settaxAmount(Decimal? value) {;
        this.taxAmount = value;;
    }


    private Decimal? taxDueAmount;

    /**
     * Getter for taxDueAmount;
     * The tax amount due.
     */
    public Decimal? gettaxDueAmount() {;
        return this.taxDueAmount;;
    }

    /**
     * Setter for taxDueAmount;
     * The tax amount due.
     */
    public void settaxDueAmount(Decimal? value) {;
        this.taxDueAmount = value;;
    }


    private Decimal? collectAmount;

    /**
     * Getter for collectAmount;
     * The amount collected by Avalara for this region
     */
    public Decimal? getcollectAmount() {;
        return this.collectAmount;;
    }

    /**
     * Setter for collectAmount;
     * The amount collected by Avalara for this region
     */
    public void setcollectAmount(Decimal? value) {;
        this.collectAmount = value;;
    }


    private Decimal? totalRemittanceAmount;

    /**
     * Getter for totalRemittanceAmount;
     * Total remittance amount of all returns in region
     */
    public Decimal? gettotalRemittanceAmount() {;
        return this.totalRemittanceAmount;;
    }

    /**
     * Setter for totalRemittanceAmount;
     * Total remittance amount of all returns in region
     */
    public void settotalRemittanceAmount(Decimal? value) {;
        this.totalRemittanceAmount = value;;
    }


    private Decimal? nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount;
     * The non-taxable amount.
     */
    public Decimal? getnonTaxableAmount() {;
        return this.nonTaxableAmount;;
    }

    /**
     * Setter for nonTaxableAmount;
     * The non-taxable amount.
     */
    public void setnonTaxableAmount(Decimal? value) {;
        this.nonTaxableAmount = value;;
    }


    private Decimal? consumerUseTaxAmount;

    /**
     * Getter for consumerUseTaxAmount;
     * Consumer use tax liability.
     */
    public Decimal? getconsumerUseTaxAmount() {;
        return this.consumerUseTaxAmount;;
    }

    /**
     * Setter for consumerUseTaxAmount;
     * Consumer use tax liability.
     */
    public void setconsumerUseTaxAmount(Decimal? value) {;
        this.consumerUseTaxAmount = value;;
    }


    private Decimal? consumerUseNonTaxableAmount;

    /**
     * Getter for consumerUseNonTaxableAmount;
     * Consumer use non-taxable amount.
     */
    public Decimal? getconsumerUseNonTaxableAmount() {;
        return this.consumerUseNonTaxableAmount;;
    }

    /**
     * Setter for consumerUseNonTaxableAmount;
     * Consumer use non-taxable amount.
     */
    public void setconsumerUseNonTaxableAmount(Decimal? value) {;
        this.consumerUseNonTaxableAmount = value;;
    }


    private Decimal? consumerUseTaxableAmount;

    /**
     * Getter for consumerUseTaxableAmount;
     * Consumer use taxable amount.
     */
    public Decimal? getconsumerUseTaxableAmount() {;
        return this.consumerUseTaxableAmount;;
    }

    /**
     * Setter for consumerUseTaxableAmount;
     * Consumer use taxable amount.
     */
    public void setconsumerUseTaxableAmount(Decimal? value) {;
        this.consumerUseTaxableAmount = value;;
    }


    private DateTime? approveDate;

    /**
     * Getter for approveDate;
     * The date the filing region was approved.
     */
    public DateTime? getapproveDate() {;
        return this.approveDate;;
    }

    /**
     * Setter for approveDate;
     * The date the filing region was approved.
     */
    public void setapproveDate(DateTime? value) {;
        this.approveDate = value;;
    }


    private DateTime? startDate;

    /**
     * Getter for startDate;
     * The start date for the filing cycle.
     */
    public DateTime? getstartDate() {;
        return this.startDate;;
    }

    /**
     * Setter for startDate;
     * The start date for the filing cycle.
     */
    public void setstartDate(DateTime? value) {;
        this.startDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * The end date for the filing cycle.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * The end date for the filing cycle.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private Boolean? hasNexus;

    /**
     * Getter for hasNexus;
     * Whether or not you have nexus in this region.
     */
    public Boolean? gethasNexus() {;
        return this.hasNexus;;
    }

    /**
     * Setter for hasNexus;
     * Whether or not you have nexus in this region.
     */
    public void sethasNexus(Boolean? value) {;
        this.hasNexus = value;;
    }


    private FilingStatusId? status;

    /**
     * Getter for status;
     * The current status of the filing region.
     */
    public FilingStatusId? getstatus() {;
        return this.status;;
    }

    /**
     * Setter for status;
     * The current status of the filing region.
     */
    public void setstatus(FilingStatusId? value) {;
        this.status = value;;
    }


    private List<FilingReturnModel> returns;

    /**
     * Getter for returns;
     * A list of tax returns in this region.
     */
    public List<FilingReturnModel> getreturns() {;
        return this.returns;;
    }

    /**
     * Setter for returns;
     * A list of tax returns in this region.
     */
    public void setreturns(List<FilingReturnModel> value) {;
        this.returns = value;;
    }


    private List<FilingsCheckupSuggestedFormModel> suggestReturns;

    /**
     * Getter for suggestReturns;
     * A list of tax returns in this region.
     */
    public List<FilingsCheckupSuggestedFormModel> getsuggestReturns() {;
        return this.suggestReturns;;
    }

    /**
     * Setter for suggestReturns;
     * A list of tax returns in this region.
     */
    public void setsuggestReturns(List<FilingsCheckupSuggestedFormModel> value) {;
        this.suggestReturns = value;;
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


    /**
     * Returns a JSON string representation of FilingRegionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
