package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * 
 */
public class AvaFileFormModel {
    private String formName;

    /**
     * Getter for formName - 
     */
    public String getFormName() {
        return this.formName;
    }

    /**
     * Setter for formName - 
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }

    
    private Byte efileDueDay;

    /**
     * Getter for efileDueDay - 
     */
    public Byte getEfileDueDay() {
        return this.efileDueDay;
    }

    /**
     * Setter for efileDueDay - 
     */
    public void setEfileDueDay(Byte efileDueDay) {
        this.efileDueDay = efileDueDay;
    }

    
    private Byte formTypeId;

    /**
     * Getter for formTypeId - 
     */
    public Byte getFormTypeId() {
        return this.formTypeId;
    }

    /**
     * Setter for formTypeId - 
     */
    public void setFormTypeId(Byte formTypeId) {
        this.formTypeId = formTypeId;
    }

    
    private Date endDate;

    /**
     * Getter for endDate - 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - 
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String returnName;

    /**
     * Getter for returnName - 
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName - 
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    
    private String description;

    /**
     * Getter for description - 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Byte roundingTypeId;

    /**
     * Getter for roundingTypeId - 
     */
    public Byte getRoundingTypeId() {
        return this.roundingTypeId;
    }

    /**
     * Setter for roundingTypeId - 
     */
    public void setRoundingTypeId(Byte roundingTypeId) {
        this.roundingTypeId = roundingTypeId;
    }

    
    private Byte efileDueDateTypeId;

    /**
     * Getter for efileDueDateTypeId - 
     */
    public Byte getEfileDueDateTypeId() {
        return this.efileDueDateTypeId;
    }

    /**
     * Setter for efileDueDateTypeId - 
     */
    public void setEfileDueDateTypeId(Byte efileDueDateTypeId) {
        this.efileDueDateTypeId = efileDueDateTypeId;
    }

    
    private Byte dueDay;

    /**
     * Getter for dueDay - 
     */
    public Byte getDueDay() {
        return this.dueDay;
    }

    /**
     * Setter for dueDay - 
     */
    public void setDueDay(Byte dueDay) {
        this.dueDay = dueDay;
    }

    
    private Date effDate;

    /**
     * Getter for effDate - 
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate - 
     */
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    
    private String country;

    /**
     * Getter for country - 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - 
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private Byte dueDateTypeId;

    /**
     * Getter for dueDateTypeId - 
     */
    public Byte getDueDateTypeId() {
        return this.dueDateTypeId;
    }

    /**
     * Setter for dueDateTypeId - 
     */
    public void setDueDateTypeId(Byte dueDateTypeId) {
        this.dueDateTypeId = dueDateTypeId;
    }

    
    private Integer id;

    /**
     * Getter for id - 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String region;

    /**
     * Getter for region - 
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - 
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private Boolean hasVendorDiscount;

    /**
     * Getter for hasVendorDiscount - 
     */
    public Boolean getHasVendorDiscount() {
        return this.hasVendorDiscount;
    }

    /**
     * Setter for hasVendorDiscount - 
     */
    public void setHasVendorDiscount(Boolean hasVendorDiscount) {
        this.hasVendorDiscount = hasVendorDiscount;
    }

    
    private Byte filingOptionTypeId;

    /**
     * Getter for filingOptionTypeId - 
     */
    public Byte getFilingOptionTypeId() {
        return this.filingOptionTypeId;
    }

    /**
     * Setter for filingOptionTypeId - 
     */
    public void setFilingOptionTypeId(Byte filingOptionTypeId) {
        this.filingOptionTypeId = filingOptionTypeId;
    }

    
    private Date efileDueTime;

    /**
     * Getter for efileDueTime - 
     */
    public Date getEfileDueTime() {
        return this.efileDueTime;
    }

    /**
     * Setter for efileDueTime - 
     */
    public void setEfileDueTime(Date efileDueTime) {
        this.efileDueTime = efileDueTime;
    }

    


    /**
     * Returns a JSON string representation of AvaFileFormModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    