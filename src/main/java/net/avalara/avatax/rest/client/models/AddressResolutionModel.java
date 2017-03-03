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
     * Getter for coordinates - Address Resolution Model
     */
    public CoordinateInfo getCoordinates() {
        return this.coordinates;
    }

    /**
     * Setter for coordinates - Address Resolution Model
     */
    public void setCoordinates(CoordinateInfo coordinates) {
        this.coordinates = coordinates;
    }

    
    private ArrayList<AvaTaxMessage> messages;

    /**
     * Getter for messages - Address Resolution Model
     */
    public ArrayList<AvaTaxMessage> getMessages() {
        return this.messages;
    }

    /**
     * Setter for messages - Address Resolution Model
     */
    public void setMessages(ArrayList<AvaTaxMessage> messages) {
        this.messages = messages;
    }

    
    private ArrayList<ValidatedAddressInfo> validatedAddresses;

    /**
     * Getter for validatedAddresses - Address Resolution Model
     */
    public ArrayList<ValidatedAddressInfo> getValidatedAddresses() {
        return this.validatedAddresses;
    }

    /**
     * Setter for validatedAddresses - Address Resolution Model
     */
    public void setValidatedAddresses(ArrayList<ValidatedAddressInfo> validatedAddresses) {
        this.validatedAddresses = validatedAddresses;
    }

    
    private ArrayList<TaxAuthorityInfo> taxAuthorities;

    /**
     * Getter for taxAuthorities - Address Resolution Model
     */
    public ArrayList<TaxAuthorityInfo> getTaxAuthorities() {
        return this.taxAuthorities;
    }

    /**
     * Setter for taxAuthorities - Address Resolution Model
     */
    public void setTaxAuthorities(ArrayList<TaxAuthorityInfo> taxAuthorities) {
        this.taxAuthorities = taxAuthorities;
    }

    
    private ResolutionQuality resolutionQuality;

    /**
     * Getter for resolutionQuality - Address Resolution Model
     */
    public ResolutionQuality getResolutionQuality() {
        return this.resolutionQuality;
    }

    /**
     * Setter for resolutionQuality - Address Resolution Model
     */
    public void setResolutionQuality(ResolutionQuality resolutionQuality) {
        this.resolutionQuality = resolutionQuality;
    }

    
    private AddressInfo address;

    /**
     * Getter for address - Address Resolution Model
     */
    public AddressInfo getAddress() {
        return this.address;
    }

    /**
     * Setter for address - Address Resolution Model
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
    