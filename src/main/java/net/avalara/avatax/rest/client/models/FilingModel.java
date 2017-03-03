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
     * Getter for filingRegions - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public ArrayList<FilingRegionModel> getFilingRegions() {
        return this.filingRegions;
    }

    /**
     * Setter for filingRegions - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public void setFilingRegions(ArrayList<FilingRegionModel> filingRegions) {
        this.filingRegions = filingRegions;
    }

    
    private Short year;

    /**
     * Getter for year - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public Short getYear() {
        return this.year;
    }

    /**
     * Setter for year - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public void setYear(Short year) {
        this.year = year;
    }

    
    private Long id;

    /**
     * Getter for id - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private WorksheetTypeId type;

    /**
     * Getter for type - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public WorksheetTypeId getType() {
        return this.type;
    }

    /**
     * Setter for type - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public void setType(WorksheetTypeId type) {
        this.type = type;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Byte month;

    /**
     * Getter for month - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public Byte getMonth() {
        return this.month;
    }

    /**
     * Setter for month - Represents a listing of all tax calculation data for filings and for accruing to future filings.
     */
    public void setMonth(Byte month) {
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
    