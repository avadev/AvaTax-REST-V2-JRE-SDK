package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Address Resolution Model
 */
public class AddressResolutionModel {
    private CoordinateInfo coordinates;

    /**
     * Getter for coordinates - The geospatial coordinates of this address
     */
    public CoordinateInfo getCoordinates() {
        return this.coordinates;
    }

    /**
     * Setter for coordinates - The geospatial coordinates of this address
     */
    public void setCoordinates(CoordinateInfo coordinates) {
        this.coordinates = coordinates;
    }

    
    private ArrayList<AvaTaxMessage> messages;

    /**
     * Getter for messages - List of informational and warning messages regarding this address
     */
    public ArrayList<AvaTaxMessage> getMessages() {
        return this.messages;
    }

    /**
     * Setter for messages - List of informational and warning messages regarding this address
     */
    public void setMessages(ArrayList<AvaTaxMessage> messages) {
        this.messages = messages;
    }

    
    private ArrayList<AddressInfo> validatedAddresses;

    /**
     * Getter for validatedAddresses - The validated address or addresses
     */
    public ArrayList<AddressInfo> getValidatedAddresses() {
        return this.validatedAddresses;
    }

    /**
     * Setter for validatedAddresses - The validated address or addresses
     */
    public void setValidatedAddresses(ArrayList<AddressInfo> validatedAddresses) {
        this.validatedAddresses = validatedAddresses;
    }

    
    private ArrayList<TaxAuthorityInfo> taxAuthorities;

    /**
     * Getter for taxAuthorities - List of informational and warning messages regarding this address
     */
    public ArrayList<TaxAuthorityInfo> getTaxAuthorities() {
        return this.taxAuthorities;
    }

    /**
     * Setter for taxAuthorities - List of informational and warning messages regarding this address
     */
    public void setTaxAuthorities(ArrayList<TaxAuthorityInfo> taxAuthorities) {
        this.taxAuthorities = taxAuthorities;
    }

    
    private ResolutionQuality resolutionQuality;

    /**
     * Getter for resolutionQuality - The resolution quality of the geospatial coordinates
     */
    public ResolutionQuality getResolutionQuality() {
        return this.resolutionQuality;
    }

    /**
     * Setter for resolutionQuality - The resolution quality of the geospatial coordinates
     */
    public void setResolutionQuality(ResolutionQuality resolutionQuality) {
        this.resolutionQuality = resolutionQuality;
    }

    
    private AddressInfo address;

    /**
     * Getter for address - The original address
     */
    public AddressInfo getAddress() {
        return this.address;
    }

    /**
     * Setter for address - The original address
     */
    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    


    /**
     * Returns a JSON string representation of AddressResolutionModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    