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
 * Represents a listing of all tax calculation data for filings and for accruing to future filings.
 */
public class MultiTaxFilingModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this filing.
	 * 
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this filing.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company for this filing.
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company for this filing.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private Integer month;

    /**
     * Getter for month
     *
     * The month of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing.
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
	 * 
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * Setter for month
     *
     * The month of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing.
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setMonth(Integer value) {
        this.month = value;
    }

    private Short year;

    /**
     * Getter for year
     *
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing.
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
	 * 
     */
    public Short getYear() {
        return this.year;
    }

    /**
     * Setter for year
     *
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing.
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setYear(Short value) {
        this.year = value;
    }

    private WorksheetTypeId type;

    /**
     * Getter for type
     *
     * Indicates whether this is an original or an amended filing.
	 * 
     */
    public WorksheetTypeId getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Indicates whether this is an original or an amended filing.
     */
    public void setType(WorksheetTypeId value) {
        this.type = value;
    }

    private FilingsTaxSummaryModel taxSummary;

    /**
     * Getter for taxSummary
     *
     * 
	 * 
     */
    public FilingsTaxSummaryModel getTaxSummary() {
        return this.taxSummary;
    }

    /**
     * Setter for taxSummary
     *
     * 
     */
    public void setTaxSummary(FilingsTaxSummaryModel value) {
        this.taxSummary = value;
    }

    private ArrayList<FilingsTaxDetailsModel> taxDetails;

    /**
     * Getter for taxDetails
     *
     * A detailed breakdown of the taxes in this filing
	 * 
     */
    public ArrayList<FilingsTaxDetailsModel> getTaxDetails() {
        return this.taxDetails;
    }

    /**
     * Setter for taxDetails
     *
     * A detailed breakdown of the taxes in this filing
     */
    public void setTaxDetails(ArrayList<FilingsTaxDetailsModel> value) {
        this.taxDetails = value;
    }

    private ArrayList<MultiTaxFilingRegionModel> filingRegions;

    /**
     * Getter for filingRegions
     *
     * A listing of regional tax filings within this time period.
	 * 
     */
    public ArrayList<MultiTaxFilingRegionModel> getFilingRegions() {
        return this.filingRegions;
    }

    /**
     * Setter for filingRegions
     *
     * A listing of regional tax filings within this time period.
     */
    public void setFilingRegions(ArrayList<MultiTaxFilingRegionModel> value) {
        this.filingRegions = value;
    }

    /**
     * Returns a JSON string representation of MultiTaxFilingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
