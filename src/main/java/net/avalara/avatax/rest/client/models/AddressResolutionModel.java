package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Address Resolution Model
 */
public class AddressResolutionModel {


    private AddressInfo address;

    /**
     * Getter for address
     *
     * The original address
     */
    public AddressInfo getAddress() {
        return this.address;
    }

    /**
     * Setter for address
     *
     * The original address
     */
    public void setAddress(AddressInfo value) {
        this.address = value;
    }


    private ArrayList<ValidatedAddressInfo> validatedAddresses;

    /**
     * Getter for validatedAddresses
     *
     * The validated address or addresses
     */
    public ArrayList<ValidatedAddressInfo> getValidatedAddresses() {
        return this.validatedAddresses;
    }

    /**
     * Setter for validatedAddresses
     *
     * The validated address or addresses
     */
    public void setValidatedAddresses(ArrayList<ValidatedAddressInfo> value) {
        this.validatedAddresses = value;
    }


    private CoordinateInfo coordinates;

    /**
     * Getter for coordinates
     *
     * The geospatial coordinates of this address
     */
    public CoordinateInfo getCoordinates() {
        return this.coordinates;
    }

    /**
     * Setter for coordinates
     *
     * The geospatial coordinates of this address
     */
    public void setCoordinates(CoordinateInfo value) {
        this.coordinates = value;
    }


    private ResolutionQuality resolutionQuality;

    /**
     * Getter for resolutionQuality
     *
     * The resolution quality of the geospatial coordinates
     */
    public ResolutionQuality getResolutionQuality() {
        return this.resolutionQuality;
    }

    /**
     * Setter for resolutionQuality
     *
     * The resolution quality of the geospatial coordinates
     */
    public void setResolutionQuality(ResolutionQuality value) {
        this.resolutionQuality = value;
    }


    private ArrayList<TaxAuthorityInfo> taxAuthorities;

    /**
     * Getter for taxAuthorities
     *
     * List of informational and warning messages regarding this address
     */
    public ArrayList<TaxAuthorityInfo> getTaxAuthorities() {
        return this.taxAuthorities;
    }

    /**
     * Setter for taxAuthorities
     *
     * List of informational and warning messages regarding this address
     */
    public void setTaxAuthorities(ArrayList<TaxAuthorityInfo> value) {
        this.taxAuthorities = value;
    }


    private ArrayList<AvaTaxMessage> messages;

    /**
     * Getter for messages
     *
     * List of informational and warning messages regarding this address
     */
    public ArrayList<AvaTaxMessage> getMessages() {
        return this.messages;
    }

    /**
     * Setter for messages
     *
     * List of informational and warning messages regarding this address
     */
    public void setMessages(ArrayList<AvaTaxMessage> value) {
        this.messages = value;
    }


    /**
     * Returns a JSON string representation of AddressResolutionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
