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
 * One Universal Product Code object as defined for your company.
 */
public class UPCModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number for this UPC.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number for this UPC.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company to which this UPC belongs.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company to which this UPC belongs.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private String upc;

    /**
     * Getter for upc;
     * The 12-14 character Universal Product Code, European Article Number, or Global Trade Identification Number.
     */
    public String getupc() {;
        return this.upc;;
    }

    /**
     * Setter for upc;
     * The 12-14 character Universal Product Code, European Article Number, or Global Trade Identification Number.
     */
    public void setupc(String value) {;
        this.upc = value;;
    }


    private String legacyTaxCode;

    /**
     * Getter for legacyTaxCode;
     * Legacy Tax Code applied to any product sold with this UPC.
     */
    public String getlegacyTaxCode() {;
        return this.legacyTaxCode;;
    }

    /**
     * Setter for legacyTaxCode;
     * Legacy Tax Code applied to any product sold with this UPC.
     */
    public void setlegacyTaxCode(String value) {;
        this.legacyTaxCode = value;;
    }


    private String description;

    /**
     * Getter for description;
     * Description of the product to which this UPC applies.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * Description of the product to which this UPC applies.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private DateTime? effectiveDate;

    /**
     * Getter for effectiveDate;
     * If this UPC became effective on a certain date, this contains the first date on which the UPC was effective.
     */
    public DateTime? geteffectiveDate() {;
        return this.effectiveDate;;
    }

    /**
     * Setter for effectiveDate;
     * If this UPC became effective on a certain date, this contains the first date on which the UPC was effective.
     */
    public void seteffectiveDate(DateTime? value) {;
        this.effectiveDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * If this UPC expired or will expire on a certain date, this contains the last date on which the UPC was effective.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * If this UPC expired or will expire on a certain date, this contains the last date on which the UPC was effective.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private Int32? usage;

    /**
     * Getter for usage;
     * A usage identifier for this UPC code.
     */
    public Int32? getusage() {;
        return this.usage;;
    }

    /**
     * Setter for usage;
     * A usage identifier for this UPC code.
     */
    public void setusage(Int32? value) {;
        this.usage = value;;
    }


    private Int32? isSystem;

    /**
     * Getter for isSystem;
     * A flag indicating whether this UPC code is attached to the AvaTax system or to a company.
     */
    public Int32? getisSystem() {;
        return this.isSystem;;
    }

    /**
     * Setter for isSystem;
     * A flag indicating whether this UPC code is attached to the AvaTax system or to a company.
     */
    public void setisSystem(Int32? value) {;
        this.isSystem = value;;
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
     * Returns a JSON string representation of UPCModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
