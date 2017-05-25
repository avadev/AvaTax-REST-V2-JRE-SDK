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
 * Represents a commitment to file a tax return on a recurring basis.
* Only used if you subscribe to Avalara Returns.
 */
public class FilingRequestModel {


    private Int64? id;

    /**
     * Getter for id;
     * The unique ID number of this filing request.
     */
    public Int64? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this filing request.
     */
    public void setid(Int64? value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company to which this filing request belongs.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company to which this filing request belongs.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private FilingRequestStatus? filingRequestStatusId;

    /**
     * Getter for filingRequestStatusId;
     * The current status of this request
     */
    public FilingRequestStatus? getfilingRequestStatusId() {;
        return this.filingRequestStatusId;;
    }

    /**
     * Setter for filingRequestStatusId;
     * The current status of this request
     */
    public void setfilingRequestStatusId(FilingRequestStatus? value) {;
        this.filingRequestStatusId = value;;
    }


    private FilingRequestDataModel data;

    /**
     * Getter for data;
     * The data model object of the request
     */
    public FilingRequestDataModel getdata() {;
        return this.data;;
    }

    /**
     * Setter for data;
     * The data model object of the request
     */
    public void setdata(FilingRequestDataModel value) {;
        this.data = value;;
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
     * Returns a JSON string representation of FilingRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
