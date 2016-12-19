package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * An address used within this transaction.
 */
public class TransactionAddressModel {
    private String city;

    /**
     * Getter for city - The city for the address.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - The city for the address.
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private BoundaryLevel boundaryLevel;

    /**
     * Getter for boundaryLevel - The boundary level at which this address was validated.
     */
    public BoundaryLevel getBoundaryLevel() {
        return this.boundaryLevel;
    }

    /**
     * Setter for boundaryLevel - The boundary level at which this address was validated.
     */
    public void setBoundaryLevel(BoundaryLevel boundaryLevel) {
        this.boundaryLevel = boundaryLevel;
    }

    
    private String country;

    /**
     * Getter for country - The country for the address.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - The country for the address.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String line1;

    /**
     * Getter for line1 - The first line of the address.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - The first line of the address.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - The postal code or zip code for the address.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - The postal code or zip code for the address.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private Integer taxRegionId;

    /**
     * Getter for taxRegionId - The unique ID number of the tax region for this address.
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId - The unique ID number of the tax region for this address.
     */
    public void setTaxRegionId(Integer taxRegionId) {
        this.taxRegionId = taxRegionId;
    }

    
    private Long id;

    /**
     * Getter for id - The unique ID number of this address.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this address.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String region;

    /**
     * Getter for region - The region, state, or province for the address.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - The region, state, or province for the address.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String line2;

    /**
     * Getter for line2 - The second line of the address.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - The second line of the address.
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private Long transactionId;

    /**
     * Getter for transactionId - The unique ID number of the document to which this address belongs.
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId - The unique ID number of the document to which this address belongs.
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    
    private String line3;

    /**
     * Getter for line3 - The third line of the address.
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3 - The third line of the address.
     */
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    


    /**
     * Returns a JSON string representation of TransactionAddressModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    