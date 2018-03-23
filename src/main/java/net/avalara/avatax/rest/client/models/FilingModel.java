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
 * Represents a listing of all tax calculation data for filings and for accruing to future filings.
 */
public class FilingModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this filing.
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


    private Byte month;

    /**
     * Getter for month
     *
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Byte getMonth() {
        return this.month;
    }

    /**
     * Setter for month
     *
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setMonth(Byte value) {
        this.month = value;
    }


    private Short year;

    /**
     * Getter for year
     *
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
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


    private ArrayList<FilingRegionModel> filingRegions;

    /**
     * Getter for filingRegions
     *
     * A listing of regional tax filings within this time period.
     */
    public ArrayList<FilingRegionModel> getFilingRegions() {
        return this.filingRegions;
    }

    /**
     * Setter for filingRegions
     *
     * A listing of regional tax filings within this time period.
     */
    public void setFilingRegions(ArrayList<FilingRegionModel> value) {
        this.filingRegions = value;
    }


    /**
     * Returns a JSON string representation of FilingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
