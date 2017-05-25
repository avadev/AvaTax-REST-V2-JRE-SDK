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
 * Represents a listing of all tax calculation data for filings and for accruing to future filings.
 */
public class FilingModel {


    private Int64? id;

    /**
     * Getter for id;
     * The unique ID number of this filing.
     */
    public Int64? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this filing.
     */
    public void setid(Int64? value) {;
        this.id = value;;
    }


    private Int32? companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company for this filing.
     */
    public Int32? getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company for this filing.
     */
    public void setcompanyId(Int32? value) {;
        this.companyId = value;;
    }


    private Byte? month;

    /**
     * Getter for month;
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Byte? getmonth() {;
        return this.month;;
    }

    /**
     * Setter for month;
     * The month of the filing period for this tax filing. 
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setmonth(Byte? value) {;
        this.month = value;;
    }


    private Int16? year;

    /**
     * Getter for year;
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Int16? getyear() {;
        return this.year;;
    }

    /**
     * Setter for year;
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing. 
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setyear(Int16? value) {;
        this.year = value;;
    }


    private WorksheetTypeId? type;

    /**
     * Getter for type;
     * Indicates whether this is an original or an amended filing.
     */
    public WorksheetTypeId? gettype() {;
        return this.type;;
    }

    /**
     * Setter for type;
     * Indicates whether this is an original or an amended filing.
     */
    public void settype(WorksheetTypeId? value) {;
        this.type = value;;
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


    private List<FilingRegionModel> filingRegions;

    /**
     * Getter for filingRegions;
     * A listing of regional tax filings within this time period.
     */
    public List<FilingRegionModel> getfilingRegions() {;
        return this.filingRegions;;
    }

    /**
     * Setter for filingRegions;
     * A listing of regional tax filings within this time period.
     */
    public void setfilingRegions(List<FilingRegionModel> value) {;
        this.filingRegions = value;;
    }


    /**
     * Returns a JSON string representation of FilingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
