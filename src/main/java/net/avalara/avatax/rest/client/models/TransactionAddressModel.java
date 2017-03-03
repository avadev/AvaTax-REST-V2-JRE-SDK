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
     * Getter for city - An address used within this transaction.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city - An address used within this transaction.
     */
    public void setCity(String city) {
        this.city = city;
    }

    
    private String latitude;

    /**
     * Getter for latitude - An address used within this transaction.
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * Setter for latitude - An address used within this transaction.
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    
    private BoundaryLevel boundaryLevel;

    /**
     * Getter for boundaryLevel - An address used within this transaction.
     */
    public BoundaryLevel getBoundaryLevel() {
        return this.boundaryLevel;
    }

    /**
     * Setter for boundaryLevel - An address used within this transaction.
     */
    public void setBoundaryLevel(BoundaryLevel boundaryLevel) {
        this.boundaryLevel = boundaryLevel;
    }

    
    private String country;

    /**
     * Getter for country - An address used within this transaction.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - An address used within this transaction.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private String longitude;

    /**
     * Getter for longitude - An address used within this transaction.
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * Setter for longitude - An address used within this transaction.
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    
    private String line1;

    /**
     * Getter for line1 - An address used within this transaction.
     */
    public String getLine1() {
        return this.line1;
    }

    /**
     * Setter for line1 - An address used within this transaction.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    
    private String postalCode;

    /**
     * Getter for postalCode - An address used within this transaction.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode - An address used within this transaction.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    private Integer taxRegionId;

    /**
     * Getter for taxRegionId - An address used within this transaction.
     */
    public Integer getTaxRegionId() {
        return this.taxRegionId;
    }

    /**
     * Setter for taxRegionId - An address used within this transaction.
     */
    public void setTaxRegionId(Integer taxRegionId) {
        this.taxRegionId = taxRegionId;
    }

    
    private Long id;

    /**
     * Getter for id - An address used within this transaction.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id - An address used within this transaction.
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    private String region;

    /**
     * Getter for region - An address used within this transaction.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - An address used within this transaction.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String line2;

    /**
     * Getter for line2 - An address used within this transaction.
     */
    public String getLine2() {
        return this.line2;
    }

    /**
     * Setter for line2 - An address used within this transaction.
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    
    private Long transactionId;

    /**
     * Getter for transactionId - An address used within this transaction.
     */
    public Long getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for transactionId - An address used within this transaction.
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    
    private String line3;

    /**
     * Getter for line3 - An address used within this transaction.
     */
    public String getLine3() {
        return this.line3;
    }

    /**
     * Setter for line3 - An address used within this transaction.
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
    