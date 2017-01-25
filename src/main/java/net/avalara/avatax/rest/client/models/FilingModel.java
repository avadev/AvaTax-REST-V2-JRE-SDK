package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a listing of all tax calculation data for filings and for accruing to future filings.
 */
public class FilingModel {
    private ArrayList<FilingRegionModel> filingRegions;

    /**
     * Getter for filingRegions - A listing of regional tax filings within this time period.
     */
    public ArrayList<FilingRegionModel> getFilingRegions() {
        return this.filingRegions;
    }

    /**
     * Setter for filingRegions - A listing of regional tax filings within this time period.
     */
    public void setFilingRegions(ArrayList<FilingRegionModel> filingRegions) {
        this.filingRegions = filingRegions;
    }

    
    private Integer year;

    /**
     * Getter for year - The year of the filing period for this tax filing.
            The filing period represents the year and month of the last day of taxes being reported on this filing.  
            For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * Setter for year - The year of the filing period for this tax filing.
            The filing period represents the year and month of the last day of taxes being reported on this filing.  
            For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    
    private Long id;

    /**
     * Getter for id - The unique ID number of this filing.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this filing.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private WorksheetTypeId type;

    /**
     * Getter for type - Indicates whether this is an original or an amended filing.
     */
    public WorksheetTypeId getType() {
        return this.type;
    }

    /**
     * Setter for type - Indicates whether this is an original or an amended filing.
     */
    public void setType(WorksheetTypeId type) {
        this.type = type;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company for this filing.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company for this filing.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Integer month;

    /**
     * Getter for month - The month of the filing period for this tax filing.  
            The filing period represents the year and month of the last day of taxes being reported on this filing.  
            For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * Setter for month - The month of the filing period for this tax filing.  
            The filing period represents the year and month of the last day of taxes being reported on this filing.  
            For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    


    /**
     * Returns a JSON string representation of FilingModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    