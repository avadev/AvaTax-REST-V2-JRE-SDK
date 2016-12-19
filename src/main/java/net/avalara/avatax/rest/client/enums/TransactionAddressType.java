package net.avalara.avatax.rest.client.enums;

/**
 * 
 */
public enum TransactionAddressType {
    /**
     * This is the location from which the product was shipped
     */
    ShipFrom,
    
    /**
     * This is the location to which the product was shipped
     */
    ShipTo,
    
    /**
     * Location where the order was accepted; typically the call center, business office where purchase orders are accepted, server locations where orders are processed and accepted
     */
    PointOfOrderAcceptance,
    
    /**
     * Location from which the order was placed; typically the customer's home or business location
     */
    PointOfOrderOrigin,
    
    /**
     * Only used if all addresses for this transaction were identical; e.g. if this was a point-of-sale physical transaction
     */
    SingleLocation,
    

}
    