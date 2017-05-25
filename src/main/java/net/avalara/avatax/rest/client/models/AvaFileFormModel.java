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
 * 
 */
public class AvaFileFormModel {


    private Int32? id;

    /**
     * Getter for id;
     * Unique Id of the form
     */
    public Int32? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * Unique Id of the form
     */
    public void setid(Int32? value) {;
        this.id = value;;
    }


    private String returnName;

    /**
     * Getter for returnName;
     * Name of the file being returned
     */
    public String getreturnName() {;
        return this.returnName;;
    }

    /**
     * Setter for returnName;
     * Name of the file being returned
     */
    public void setreturnName(String value) {;
        this.returnName = value;;
    }


    private String formName;

    /**
     * Getter for formName;
     * Name of the submitted form
     */
    public String getformName() {;
        return this.formName;;
    }

    /**
     * Setter for formName;
     * Name of the submitted form
     */
    public void setformName(String value) {;
        this.formName = value;;
    }


    private String description;

    /**
     * Getter for description;
     * A description of the submitted form
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * A description of the submitted form
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private DateTime? effDate;

    /**
     * Getter for effDate;
     * The date this form starts to take effect
     */
    public DateTime? geteffDate() {;
        return this.effDate;;
    }

    /**
     * Setter for effDate;
     * The date this form starts to take effect
     */
    public void seteffDate(DateTime? value) {;
        this.effDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * The date the form finishes to take effect
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * The date the form finishes to take effect
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private String region;

    /**
     * Getter for region;
     * State/Province/Region where the form is submitted for
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * State/Province/Region where the form is submitted for
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The country this form is submitted for
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The country this form is submitted for
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private Byte? formTypeId;

    /**
     * Getter for formTypeId;
     * The type of the form being submitted
     */
    public Byte? getformTypeId() {;
        return this.formTypeId;;
    }

    /**
     * Setter for formTypeId;
     * The type of the form being submitted
     */
    public void setformTypeId(Byte? value) {;
        this.formTypeId = value;;
    }


    private Byte? filingOptionTypeId;

    /**
     * Getter for filingOptionTypeId;
     * 
     */
    public Byte? getfilingOptionTypeId() {;
        return this.filingOptionTypeId;;
    }

    /**
     * Setter for filingOptionTypeId;
     * 
     */
    public void setfilingOptionTypeId(Byte? value) {;
        this.filingOptionTypeId = value;;
    }


    private Byte? dueDateTypeId;

    /**
     * Getter for dueDateTypeId;
     * The type of the due date
     */
    public Byte? getdueDateTypeId() {;
        return this.dueDateTypeId;;
    }

    /**
     * Setter for dueDateTypeId;
     * The type of the due date
     */
    public void setdueDateTypeId(Byte? value) {;
        this.dueDateTypeId = value;;
    }


    private Byte? dueDay;

    /**
     * Getter for dueDay;
     * Due date
     */
    public Byte? getdueDay() {;
        return this.dueDay;;
    }

    /**
     * Setter for dueDay;
     * Due date
     */
    public void setdueDay(Byte? value) {;
        this.dueDay = value;;
    }


    private Byte? efileDueDateTypeId;

    /**
     * Getter for efileDueDateTypeId;
     * 
     */
    public Byte? getefileDueDateTypeId() {;
        return this.efileDueDateTypeId;;
    }

    /**
     * Setter for efileDueDateTypeId;
     * 
     */
    public void setefileDueDateTypeId(Byte? value) {;
        this.efileDueDateTypeId = value;;
    }


    private Byte? efileDueDay;

    /**
     * Getter for efileDueDay;
     * The date by when the E-filing should be submitted
     */
    public Byte? getefileDueDay() {;
        return this.efileDueDay;;
    }

    /**
     * Setter for efileDueDay;
     * The date by when the E-filing should be submitted
     */
    public void setefileDueDay(Byte? value) {;
        this.efileDueDay = value;;
    }


    private DateTime? efileDueTime;

    /**
     * Getter for efileDueTime;
     * The time of day by when the E-filing should be submitted
     */
    public DateTime? getefileDueTime() {;
        return this.efileDueTime;;
    }

    /**
     * Setter for efileDueTime;
     * The time of day by when the E-filing should be submitted
     */
    public void setefileDueTime(DateTime? value) {;
        this.efileDueTime = value;;
    }


    private Boolean? hasVendorDiscount;

    /**
     * Getter for hasVendorDiscount;
     * Whether the customer has discount
     */
    public Boolean? gethasVendorDiscount() {;
        return this.hasVendorDiscount;;
    }

    /**
     * Setter for hasVendorDiscount;
     * Whether the customer has discount
     */
    public void sethasVendorDiscount(Boolean? value) {;
        this.hasVendorDiscount = value;;
    }


    private Byte? roundingTypeId;

    /**
     * Getter for roundingTypeId;
     * The way system does the rounding
     */
    public Byte? getroundingTypeId() {;
        return this.roundingTypeId;;
    }

    /**
     * Setter for roundingTypeId;
     * The way system does the rounding
     */
    public void setroundingTypeId(Byte? value) {;
        this.roundingTypeId = value;;
    }


    /**
     * Returns a JSON string representation of AvaFileFormModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
