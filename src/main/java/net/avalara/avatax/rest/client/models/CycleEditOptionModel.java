package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Model with options for actual filing calendar output based on user edits to filing calendar.
 */
public class CycleEditOptionModel {
    private Boolean success;

    /**
     * Getter for success - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * Setter for success - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    
    private Date clonedCalendarEffDate;

    /**
     * Getter for clonedCalendarEffDate - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public Date getClonedCalendarEffDate() {
        return this.clonedCalendarEffDate;
    }

    /**
     * Setter for clonedCalendarEffDate - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public void setClonedCalendarEffDate(Date clonedCalendarEffDate) {
        this.clonedCalendarEffDate = clonedCalendarEffDate;
    }

    
    private Boolean customerMustApprove;

    /**
     * Getter for customerMustApprove - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public Boolean getCustomerMustApprove() {
        return this.customerMustApprove;
    }

    /**
     * Setter for customerMustApprove - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public void setCustomerMustApprove(Boolean customerMustApprove) {
        this.customerMustApprove = customerMustApprove;
    }

    
    private Boolean mustCloneFilingCalendar;

    /**
     * Getter for mustCloneFilingCalendar - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public Boolean getMustCloneFilingCalendar() {
        return this.mustCloneFilingCalendar;
    }

    /**
     * Setter for mustCloneFilingCalendar - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public void setMustCloneFilingCalendar(Boolean mustCloneFilingCalendar) {
        this.mustCloneFilingCalendar = mustCloneFilingCalendar;
    }

    
    private String message;

    /**
     * Getter for message - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    private Date expiredCalendarEndDate;

    /**
     * Getter for expiredCalendarEndDate - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public Date getExpiredCalendarEndDate() {
        return this.expiredCalendarEndDate;
    }

    /**
     * Setter for expiredCalendarEndDate - Model with options for actual filing calendar output based on user edits to filing calendar.
     */
    public void setExpiredCalendarEndDate(Date expiredCalendarEndDate) {
        this.expiredCalendarEndDate = expiredCalendarEndDate;
    }

    


    /**
     * Returns a JSON string representation of CycleEditOptionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    