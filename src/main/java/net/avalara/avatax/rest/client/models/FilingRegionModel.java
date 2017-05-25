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


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this filing region.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this filing region.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Long filingId;

    /**
     * Getter for filingId
     *
     * The filing id that this region belongs too
     */
    public Long getFilingId() {
        return this.filingId;
    }

    /**
     * Setter for filingId
     *
     * The filing id that this region belongs too
     */
    public void setFilingId(Long value) {
        this.filingId = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * The two-character ISO-3166 code for the country.
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two-character ISO-3166 code for the country.
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * The two or three character region code for the region.
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The two or three character region code for the region.
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private Decimal salesAmount;

    /**
     * Getter for salesAmount
     *
     * The sales amount.
     */
    public Decimal getSalesAmount() {
        return this.salesAmount;
    }

    /**
     * Setter for salesAmount
     *
     * The sales amount.
     */
    public void setSalesAmount(Decimal value) {
        this.salesAmount = value;
    }


    private Decimal taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * The taxable amount.
     */
    public Decimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * The taxable amount.
     */
    public void setTaxableAmount(Decimal value) {
        this.taxableAmount = value;
    }


    private Decimal taxAmount;

    /**
     * Getter for taxAmount
     *
     * The tax amount.
     */
    public Decimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount
     *
     * The tax amount.
     */
    public void setTaxAmount(Decimal value) {
        this.taxAmount = value;
    }


    private Decimal taxDueAmount;

    /**
     * Getter for taxDueAmount
     *
     * The tax amount due.
     */
    public Decimal getTaxDueAmount() {
        return this.taxDueAmount;
    }

    /**
     * Setter for taxDueAmount
     *
     * The tax amount due.
     */
    public void setTaxDueAmount(Decimal value) {
        this.taxDueAmount = value;
    }


    private Decimal collectAmount;

    /**
     * Getter for collectAmount
     *
     * The amount collected by Avalara for this region
     */
    public Decimal getCollectAmount() {
        return this.collectAmount;
    }

    /**
     * Setter for collectAmount
     *
     * The amount collected by Avalara for this region
     */
    public void setCollectAmount(Decimal value) {
        this.collectAmount = value;
    }


    private Decimal totalRemittanceAmount;

    /**
     * Getter for totalRemittanceAmount
     *
     * Total remittance amount of all returns in region
     */
    public Decimal getTotalRemittanceAmount() {
        return this.totalRemittanceAmount;
    }

    /**
     * Setter for totalRemittanceAmount
     *
     * Total remittance amount of all returns in region
     */
    public void setTotalRemittanceAmount(Decimal value) {
        this.totalRemittanceAmount = value;
    }


    private Decimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount
     *
     * The non-taxable amount.
     */
    public Decimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount
     *
     * The non-taxable amount.
     */
    public void setNonTaxableAmount(Decimal value) {
        this.nonTaxableAmount = value;
    }


    private Decimal consumerUseTaxAmount;

    /**
     * Getter for consumerUseTaxAmount
     *
     * Consumer use tax liability.
     */
    public Decimal getConsumerUseTaxAmount() {
        return this.consumerUseTaxAmount;
    }

    /**
     * Setter for consumerUseTaxAmount
     *
     * Consumer use tax liability.
     */
    public void setConsumerUseTaxAmount(Decimal value) {
        this.consumerUseTaxAmount = value;
    }


    private Decimal consumerUseNonTaxableAmount;

    /**
     * Getter for consumerUseNonTaxableAmount
     *
     * Consumer use non-taxable amount.
     */
    public Decimal getConsumerUseNonTaxableAmount() {
        return this.consumerUseNonTaxableAmount;
    }

    /**
     * Setter for consumerUseNonTaxableAmount
     *
     * Consumer use non-taxable amount.
     */
    public void setConsumerUseNonTaxableAmount(Decimal value) {
        this.consumerUseNonTaxableAmount = value;
    }


    private Decimal consumerUseTaxableAmount;

    /**
     * Getter for consumerUseTaxableAmount
     *
     * Consumer use taxable amount.
     */
    public Decimal getConsumerUseTaxableAmount() {
        return this.consumerUseTaxableAmount;
    }

    /**
     * Setter for consumerUseTaxableAmount
     *
     * Consumer use taxable amount.
     */
    public void setConsumerUseTaxableAmount(Decimal value) {
        this.consumerUseTaxableAmount = value;
    }


    private Instant approveDate;

    /**
     * Getter for approveDate
     *
     * The date the filing region was approved.
     */
    public Instant getApproveDate() {
        return this.approveDate;
    }

    /**
     * Setter for approveDate
     *
     * The date the filing region was approved.
     */
    public void setApproveDate(Instant value) {
        this.approveDate = value;
    }


    private Instant startDate;

    /**
     * Getter for startDate
     *
     * The start date for the filing cycle.
     */
    public Instant getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate
     *
     * The start date for the filing cycle.
     */
    public void setStartDate(Instant value) {
        this.startDate = value;
    }


    private Instant endDate;

    /**
     * Getter for endDate
     *
     * The end date for the filing cycle.
     */
    public Instant getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date for the filing cycle.
     */
    public void setEndDate(Instant value) {
        this.endDate = value;
    }


    private object hasNexus;

    /**
     * Getter for hasNexus
     *
     * Whether or not you have nexus in this region.
     */
    public object getHasNexus() {
        return this.hasNexus;
    }

    /**
     * Setter for hasNexus
     *
     * Whether or not you have nexus in this region.
     */
    public void setHasNexus(object value) {
        this.hasNexus = value;
    }


    private FilingStatusId status;

    /**
     * Getter for status
     *
     * The current status of the filing region.
     */
    public FilingStatusId getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The current status of the filing region.
     */
    public void setStatus(FilingStatusId value) {
        this.status = value;
    }


    private FilingReturnModel[] returns;

    /**
     * Getter for returns
     *
     * A list of tax returns in this region.
     */
    public FilingReturnModel[] getReturns() {
        return this.returns;
    }

    /**
     * Setter for returns
     *
     * A list of tax returns in this region.
     */
    public void setReturns(FilingReturnModel[] value) {
        this.returns = value;
    }


    private FilingsCheckupSuggestedFormModel[] suggestReturns;

    /**
     * Getter for suggestReturns
     *
     * A list of tax returns in this region.
     */
    public FilingsCheckupSuggestedFormModel[] getSuggestReturns() {
        return this.suggestReturns;
    }

    /**
     * Setter for suggestReturns
     *
     * A list of tax returns in this region.
     */
    public void setSuggestReturns(FilingsCheckupSuggestedFormModel[] value) {
        this.suggestReturns = value;
    }


    private Instant createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Instant getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Instant value) {
        this.createdDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Instant modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Instant getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Instant value) {
        this.modifiedDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    /**
     * Returns a JSON string representation of FilingRegionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
