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
 * Swagger name: AvaTaxClient
 */

/**
 * Regions
 */
public class MultiTaxFilingRegionModel {


    private String country;

    /**
     * Getter for country
     *
     * The two-character ISO-3166 code for the country.
	 * 
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
	 * 
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

    private Boolean hasNexus;

    /**
     * Getter for hasNexus
     *
     * Whether or not you have nexus in this region.
	 * 
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
	 * 
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

    private FilingsTaxSummaryModel regionTaxSummary;

    /**
     * Getter for regionTaxSummary
     *
     * 
	 * 
     */
    public FilingsTaxSummaryModel getRegionTaxSummary() {
        return this.regionTaxSummary;
    }

    /**
     * Setter for regionTaxSummary
     *
     * 
     */
    public void setRegionTaxSummary(FilingsTaxSummaryModel value) {
        this.regionTaxSummary = value;
    }

    private ArrayList<FilingsTaxDetailsModel> regionTaxDetails;

    /**
     * Getter for regionTaxDetails
     *
     * A detailed breakdown of the taxes in this filing
	 * 
     */
    public ArrayList<FilingsTaxDetailsModel> getRegionTaxDetails() {
        return this.regionTaxDetails;
    }

    /**
     * Setter for regionTaxDetails
     *
     * A detailed breakdown of the taxes in this filing
     */
    public void setRegionTaxDetails(ArrayList<FilingsTaxDetailsModel> value) {
        this.regionTaxDetails = value;
    }

    private ArrayList<FilingsCheckupSuggestedFormModel> suggestReturns;

    /**
     * Getter for suggestReturns
     *
     * A list of tax returns in this region.
	 * 
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

    private ArrayList<MultiTaxFilingReturnModel> returns;

    /**
     * Getter for returns
     *
     * A list of tax returns in this region.
	 * 
     */
    public ArrayList<MultiTaxFilingReturnModel> getReturns() {
        return this.returns;
    }

    /**
     * Setter for returns
     *
     * A list of tax returns in this region.
     */
    public void setReturns(ArrayList<MultiTaxFilingReturnModel> value) {
        this.returns = value;
    }

    /**
     * Returns a JSON string representation of MultiTaxFilingRegionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
