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
 * Information about all the addresses involved in this transaction.
* 
* For a physical in-person transaction at a retail point-of-sale location, please specify only one address using
* the `singleLocation` field.
* 
* For a transaction that was shipped, delivered, or provided from an origin location such as a warehouse to
* a destination location such as a customer, please specify the `shipFrom` and `shipTo` addresses.
* 
* In the United States, some jurisdictions recognize the address types `pointOfOrderOrigin` and `pointOfOrderAcceptance`.
* These address types affect the sourcing models of some transactions.
* 
* If latitude and longitude information is provided for any of these addresses along with line, city, region, country and postal code information, 
* we will be using only latitude and longitude and will discard line, city, region, country and postal code information for the transaction. 
* Please ensure that you have the correct latitude/longitude information for the addresses prior to using the API. 
* If you provide either latitude or longitude information but not both, we will be using the line, city, region, country and postal code information for the addresses.
 */
public class AddressesModel {


    private AddressLocationInfo singleLocation;

    /**
     * Getter for singleLocation
     *
     * If this transaction occurred at a retail point-of-sale location, provide that single address here and leave
    * all other address types null.
     */
    public AddressLocationInfo getSingleLocation() {
        return this.singleLocation;
    }

    /**
     * Setter for singleLocation
     *
     * If this transaction occurred at a retail point-of-sale location, provide that single address here and leave
    * all other address types null.
     */
    public void setSingleLocation(AddressLocationInfo value) {
        this.singleLocation = value;
    }


    private AddressLocationInfo shipFrom;

    /**
     * Getter for shipFrom
     *
     * The origination address where the products were shipped from, or from where the services originated.
     */
    public AddressLocationInfo getShipFrom() {
        return this.shipFrom;
    }

    /**
     * Setter for shipFrom
     *
     * The origination address where the products were shipped from, or from where the services originated.
     */
    public void setShipFrom(AddressLocationInfo value) {
        this.shipFrom = value;
    }


    private AddressLocationInfo shipTo;

    /**
     * Getter for shipTo
     *
     * The destination address where the products were shipped to, or where the services were delivered.
     */
    public AddressLocationInfo getShipTo() {
        return this.shipTo;
    }

    /**
     * Setter for shipTo
     *
     * The destination address where the products were shipped to, or where the services were delivered.
     */
    public void setShipTo(AddressLocationInfo value) {
        this.shipTo = value;
    }


    private AddressLocationInfo pointOfOrderOrigin;

    /**
     * Getter for pointOfOrderOrigin
     *
     * The place of business where you receive the customer's order. This address type is valid in the United States only
    * and only applies to tangible personal property.
     */
    public AddressLocationInfo getPointOfOrderOrigin() {
        return this.pointOfOrderOrigin;
    }

    /**
     * Setter for pointOfOrderOrigin
     *
     * The place of business where you receive the customer's order. This address type is valid in the United States only
    * and only applies to tangible personal property.
     */
    public void setPointOfOrderOrigin(AddressLocationInfo value) {
        this.pointOfOrderOrigin = value;
    }


    private AddressLocationInfo pointOfOrderAcceptance;

    /**
     * Getter for pointOfOrderAcceptance
     *
     * The place of business where you accept/approve the customer’s order,
    * thereby becoming contractually obligated to make the sale. This address type is valid in the United States only
    * and only applies to tangible personal property.
     */
    public AddressLocationInfo getPointOfOrderAcceptance() {
        return this.pointOfOrderAcceptance;
    }

    /**
     * Setter for pointOfOrderAcceptance
     *
     * The place of business where you accept/approve the customer’s order,
    * thereby becoming contractually obligated to make the sale. This address type is valid in the United States only
    * and only applies to tangible personal property.
     */
    public void setPointOfOrderAcceptance(AddressLocationInfo value) {
        this.pointOfOrderAcceptance = value;
    }


    /**
     * Returns a JSON string representation of AddressesModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
