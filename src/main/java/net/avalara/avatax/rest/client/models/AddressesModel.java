package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A series of addresses information in a GetTax call
 */
public class AddressesModel {
    private AddressLocationInfo shipTo;

    /**
     * Getter for shipTo - A series of addresses information in a GetTax call
     */
    public AddressLocationInfo getShipTo() {
        return this.shipTo;
    }

    /**
     * Setter for shipTo - A series of addresses information in a GetTax call
     */
    public void setShipTo(AddressLocationInfo shipTo) {
        this.shipTo = shipTo;
    }

    
    private AddressLocationInfo singleLocation;

    /**
     * Getter for singleLocation - A series of addresses information in a GetTax call
     */
    public AddressLocationInfo getSingleLocation() {
        return this.singleLocation;
    }

    /**
     * Setter for singleLocation - A series of addresses information in a GetTax call
     */
    public void setSingleLocation(AddressLocationInfo singleLocation) {
        this.singleLocation = singleLocation;
    }

    
    private AddressLocationInfo pointOfOrderOrigin;

    /**
     * Getter for pointOfOrderOrigin - A series of addresses information in a GetTax call
     */
    public AddressLocationInfo getPointOfOrderOrigin() {
        return this.pointOfOrderOrigin;
    }

    /**
     * Setter for pointOfOrderOrigin - A series of addresses information in a GetTax call
     */
    public void setPointOfOrderOrigin(AddressLocationInfo pointOfOrderOrigin) {
        this.pointOfOrderOrigin = pointOfOrderOrigin;
    }

    
    private AddressLocationInfo shipFrom;

    /**
     * Getter for shipFrom - A series of addresses information in a GetTax call
     */
    public AddressLocationInfo getShipFrom() {
        return this.shipFrom;
    }

    /**
     * Setter for shipFrom - A series of addresses information in a GetTax call
     */
    public void setShipFrom(AddressLocationInfo shipFrom) {
        this.shipFrom = shipFrom;
    }

    
    private AddressLocationInfo pointOfOrderAcceptance;

    /**
     * Getter for pointOfOrderAcceptance - A series of addresses information in a GetTax call
     */
    public AddressLocationInfo getPointOfOrderAcceptance() {
        return this.pointOfOrderAcceptance;
    }

    /**
     * Setter for pointOfOrderAcceptance - A series of addresses information in a GetTax call
     */
    public void setPointOfOrderAcceptance(AddressLocationInfo pointOfOrderAcceptance) {
        this.pointOfOrderAcceptance = pointOfOrderAcceptance;
    }

    


    /**
     * Returns a JSON string representation of AddressesModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    