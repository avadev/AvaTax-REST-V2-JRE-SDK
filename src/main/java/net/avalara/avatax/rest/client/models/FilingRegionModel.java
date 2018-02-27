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


    private String country;

    /**
     * Getter for country
     *
     * The two-character ISO-3166 code for the country.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two-character ISO-3166 code for the country.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * The two or three character region code for the region.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The two or three character region code for the region.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private BigDecimal salesAmount;

    /**
     * Getter for salesAmount
     *
     * The sales amount.
     */
    public BigDecimal getSalesAmount() {
        return this.salesAmount;
    }

    /**
     * Setter for salesAmount
     *
     * The sales amount.
     */
    public void setSalesAmount(BigDecimal value) {
        this.salesAmount = value;
    }


    private BigDecimal taxableAmount;

    /**
     * Getter for taxableAmount
     *
     * The taxable amount.
     */
    public BigDecimal getTaxableAmount() {
        return this.taxableAmount;
    }

    /**
     * Setter for taxableAmount
     *
     * The taxable amount.
     */
    public void setTaxableAmount(BigDecimal value) {
        this.taxableAmount = value;
    }


    private BigDecimal taxAmount;

    /**
     * Getter for taxAmount
     *
     * The tax amount.
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * Setter for taxAmount
     *
     * The tax amount.
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }


    private BigDecimal taxDueAmount;

    /**
     * Getter for taxDueAmount
     *
     * The tax amount due.
     */
    public BigDecimal getTaxDueAmount() {
        return this.taxDueAmount;
    }

    /**
     * Setter for taxDueAmount
     *
     * The tax amount due.
     */
    public void setTaxDueAmount(BigDecimal value) {
        this.taxDueAmount = value;
    }


    private BigDecimal collectAmount;

    /**
     * Getter for collectAmount
     *
     * The amount collected by Avalara for this region
     */
    public BigDecimal getCollectAmount() {
        return this.collectAmount;
    }

    /**
     * Setter for collectAmount
     *
     * The amount collected by Avalara for this region
     */
    public void setCollectAmount(BigDecimal value) {
        this.collectAmount = value;
    }


    private BigDecimal totalRemittanceAmount;

    /**
     * Getter for totalRemittanceAmount
     *
     * Total remittance amount of all returns in region
     */
    public BigDecimal getTotalRemittanceAmount() {
        return this.totalRemittanceAmount;
    }

    /**
     * Setter for totalRemittanceAmount
     *
     * Total remittance amount of all returns in region
     */
    public void setTotalRemittanceAmount(BigDecimal value) {
        this.totalRemittanceAmount = value;
    }


    private BigDecimal nonTaxableAmount;

    /**
     * Getter for nonTaxableAmount
     *
     * The non-taxable amount.
     */
    public BigDecimal getNonTaxableAmount() {
        return this.nonTaxableAmount;
    }

    /**
     * Setter for nonTaxableAmount
     *
     * The non-taxable amount.
     */
    public void setNonTaxableAmount(BigDecimal value) {
        this.nonTaxableAmount = value;
    }


    private BigDecimal consumerUseTaxAmount;

    /**
     * Getter for consumerUseTaxAmount
     *
     * Consumer use tax liability.
     */
    public BigDecimal getConsumerUseTaxAmount() {
        return this.consumerUseTaxAmount;
    }

    /**
     * Setter for consumerUseTaxAmount
     *
     * Consumer use tax liability.
     */
    public void setConsumerUseTaxAmount(BigDecimal value) {
        this.consumerUseTaxAmount = value;
    }


    private BigDecimal consumerUseNonTaxableAmount;

    /**
     * Getter for consumerUseNonTaxableAmount
     *
     * Consumer use non-taxable amount.
     */
    public BigDecimal getConsumerUseNonTaxableAmount() {
        return this.consumerUseNonTaxableAmount;
    }

    /**
     * Setter for consumerUseNonTaxableAmount
     *
     * Consumer use non-taxable amount.
     */
    public void setConsumerUseNonTaxableAmount(BigDecimal value) {
        this.consumerUseNonTaxableAmount = value;
    }


    private BigDecimal consumerUseTaxableAmount;

    /**
     * Getter for consumerUseTaxableAmount
     *
     * Consumer use taxable amount.
     */
    public BigDecimal getConsumerUseTaxableAmount() {
        return this.consumerUseTaxableAmount;
    }

    /**
     * Setter for consumerUseTaxableAmount
     *
     * Consumer use taxable amount.
     */
    public void setConsumerUseTaxableAmount(BigDecimal value) {
        this.consumerUseTaxableAmount = value;
    }


    private Date approveDate;

    /**
     * Getter for approveDate
     *
     * The date the filing region was approved.
     */
    public Date getApproveDate() {
        return this.approveDate;
    }

    /**
     * Setter for approveDate
     *
     * The date the filing region was approved.
     */
    public void setApproveDate(Date value) {
        this.approveDate = value;
    }


    private Date startDate;

    /**
     * Getter for startDate
     *
     * The start date for the filing cycle.
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate
     *
     * The start date for the filing cycle.
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The end date for the filing cycle.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date for the filing cycle.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private Boolean hasNexus;

    /**
     * Getter for hasNexus
     *
     * Whether or not you have nexus in this region.
     */
    public Boolean getHasNexus() {
        return this.hasNexus;
    }

    /**
     * Setter for hasNexus
     *
     * Whether or not you have nexus in this region.
     */
    public void setHasNexus(Boolean value) {
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


    private ArrayList<FilingReturnModel> returns;

    /**
     * Getter for returns
     *
     * A list of tax returns in this region.
     */
    public ArrayList<FilingReturnModel> getReturns() {
        return this.returns;
    }

    /**
     * Setter for returns
     *
     * A list of tax returns in this region.
     */
    public void setReturns(ArrayList<FilingReturnModel> value) {
        this.returns = value;
    }


    private ArrayList<FilingsCheckupSuggestedFormModel> suggestReturns;

    /**
     * Getter for suggestReturns
     *
     * A list of tax returns in this region.
     */
    public ArrayList<FilingsCheckupSuggestedFormModel> getSuggestReturns() {
        return this.suggestReturns;
    }

    /**
     * Setter for suggestReturns
     *
     * A list of tax returns in this region.
     */
    public void setSuggestReturns(ArrayList<FilingsCheckupSuggestedFormModel> value) {
        this.suggestReturns = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
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


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
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
