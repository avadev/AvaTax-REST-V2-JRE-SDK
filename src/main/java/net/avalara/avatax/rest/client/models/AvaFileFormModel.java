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
 * Represents information about a tax form known to Avalara
 */
public class AvaFileFormModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique Id of the form
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique Id of the form
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String returnName;

    /**
     * Getter for returnName
     *
     * Name of the file being returned
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName
     *
     * Name of the file being returned
     */
    public void setReturnName(String value) {
        this.returnName = value;
    }

    private String formName;

    /**
     * Getter for formName
     *
     * Name of the submitted form
     */
    public String getFormName() {
        return this.formName;
    }

    /**
     * Setter for formName
     *
     * Name of the submitted form
     */
    public void setFormName(String value) {
        this.formName = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * A description of the submitted form
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A description of the submitted form
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Date effDate;

    /**
     * Getter for effDate
     *
     * The date this form starts to take effect
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * The date this form starts to take effect
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The date the form finishes to take effect
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The date the form finishes to take effect
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * State/Province/Region where the form is submitted for
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * State/Province/Region where the form is submitted for
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The country this form is submitted for
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country this form is submitted for
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private FormTypeId formTypeId;

    /**
     * Getter for formTypeId
     *
     * The type of the form being submitted
     */
    public FormTypeId getFormTypeId() {
        return this.formTypeId;
    }

    /**
     * Setter for formTypeId
     *
     * The type of the form being submitted
     */
    public void setFormTypeId(FormTypeId value) {
        this.formTypeId = value;
    }

    private FilingOptionTypeId filingOptionTypeId;

    /**
     * Getter for filingOptionTypeId
     *
     * The type of Filing option
     */
    public FilingOptionTypeId getFilingOptionTypeId() {
        return this.filingOptionTypeId;
    }

    /**
     * Setter for filingOptionTypeId
     *
     * The type of Filing option
     */
    public void setFilingOptionTypeId(FilingOptionTypeId value) {
        this.filingOptionTypeId = value;
    }

    private DueDateTypeId dueDateTypeId;

    /**
     * Getter for dueDateTypeId
     *
     * The type of the due date
     */
    public DueDateTypeId getDueDateTypeId() {
        return this.dueDateTypeId;
    }

    /**
     * Setter for dueDateTypeId
     *
     * The type of the due date
     */
    public void setDueDateTypeId(DueDateTypeId value) {
        this.dueDateTypeId = value;
    }

    private Integer dueDay;

    /**
     * Getter for dueDay
     *
     * Due date
     */
    public Integer getDueDay() {
        return this.dueDay;
    }

    /**
     * Setter for dueDay
     *
     * Due date
     */
    public void setDueDay(Integer value) {
        this.dueDay = value;
    }

    private DueDateTypeId efileDueDateTypeId;

    /**
     * Getter for efileDueDateTypeId
     *
     * The type of E-file due date.
     */
    public DueDateTypeId getEfileDueDateTypeId() {
        return this.efileDueDateTypeId;
    }

    /**
     * Setter for efileDueDateTypeId
     *
     * The type of E-file due date.
     */
    public void setEfileDueDateTypeId(DueDateTypeId value) {
        this.efileDueDateTypeId = value;
    }

    private Integer efileDueDay;

    /**
     * Getter for efileDueDay
     *
     * The date by when the E-filing should be submitted
     */
    public Integer getEfileDueDay() {
        return this.efileDueDay;
    }

    /**
     * Setter for efileDueDay
     *
     * The date by when the E-filing should be submitted
     */
    public void setEfileDueDay(Integer value) {
        this.efileDueDay = value;
    }

    private Date efileDueTime;

    /**
     * Getter for efileDueTime
     *
     * The time of day by when the E-filing should be submitted
     */
    public Date getEfileDueTime() {
        return this.efileDueTime;
    }

    /**
     * Setter for efileDueTime
     *
     * The time of day by when the E-filing should be submitted
     */
    public void setEfileDueTime(Date value) {
        this.efileDueTime = value;
    }

    private Boolean hasVendorDiscount;

    /**
     * Getter for hasVendorDiscount
     *
     * Whether the customer has discount
     */
    public Boolean getHasVendorDiscount() {
        return this.hasVendorDiscount;
    }

    /**
     * Setter for hasVendorDiscount
     *
     * Whether the customer has discount
     */
    public void setHasVendorDiscount(Boolean value) {
        this.hasVendorDiscount = value;
    }

    private RoundingTypeId roundingTypeId;

    /**
     * Getter for roundingTypeId
     *
     * The way system does the rounding
     */
    public RoundingTypeId getRoundingTypeId() {
        return this.roundingTypeId;
    }

    /**
     * Setter for roundingTypeId
     *
     * The way system does the rounding
     */
    public void setRoundingTypeId(RoundingTypeId value) {
        this.roundingTypeId = value;
    }

    private OutletTypeId outletTypeId;

    /**
     * Getter for outletTypeId
     *
     * The outlet type of the form
     */
    public OutletTypeId getOutletTypeId() {
        return this.outletTypeId;
    }

    /**
     * Setter for outletTypeId
     *
     * The outlet type of the form
     */
    public void setOutletTypeId(OutletTypeId value) {
        this.outletTypeId = value;
    }

    /**
     * Returns a JSON string representation of AvaFileFormModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
