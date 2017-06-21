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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.6.0-85
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * A series of addresses information in a GetTax call
 */
public class AddressesModel {


    private AddressLocationInfo singleLocation;

    /**
     * Getter for singleLocation
     *
     * If this transaction occurred at a retail point-of-sale location, use this
     */
    public AddressLocationInfo getSingleLocation() {
        return this.singleLocation;
    }

    /**
     * Setter for singleLocation
     *
     * If this transaction occurred at a retail point-of-sale location, use this
     */
    public void setSingleLocation(AddressLocationInfo value) {
        this.singleLocation = value;
    }


    private AddressLocationInfo shipFrom;

    /**
     * Getter for shipFrom
     *
     * If this transaction was shipped from a warehouse location to a customer location, specify both "ShipFrom" and "ShipTo".
     */
    public AddressLocationInfo getShipFrom() {
        return this.shipFrom;
    }

    /**
     * Setter for shipFrom
     *
     * If this transaction was shipped from a warehouse location to a customer location, specify both "ShipFrom" and "ShipTo".
     */
    public void setShipFrom(AddressLocationInfo value) {
        this.shipFrom = value;
    }


    private AddressLocationInfo shipTo;

    /**
     * Getter for shipTo
     *
     * If this transaction was shipped from a warehouse location to a customer location, specify both "ShipFrom" and "ShipTo".
     */
    public AddressLocationInfo getShipTo() {
        return this.shipTo;
    }

    /**
     * Setter for shipTo
     *
     * If this transaction was shipped from a warehouse location to a customer location, specify both "ShipFrom" and "ShipTo".
     */
    public void setShipTo(AddressLocationInfo value) {
        this.shipTo = value;
    }


    private AddressLocationInfo pointOfOrderOrigin;

    /**
     * Getter for pointOfOrderOrigin
     *
     * The place of business where you receive the customer's order.
     */
    public AddressLocationInfo getPointOfOrderOrigin() {
        return this.pointOfOrderOrigin;
    }

    /**
     * Setter for pointOfOrderOrigin
     *
     * The place of business where you receive the customer's order.
     */
    public void setPointOfOrderOrigin(AddressLocationInfo value) {
        this.pointOfOrderOrigin = value;
    }


    private AddressLocationInfo pointOfOrderAcceptance;

    /**
     * Getter for pointOfOrderAcceptance
     *
     * The place of business where you accept/approve the customer’s order,
    * thereby becoming contractually obligated to make the sale.
     */
    public AddressLocationInfo getPointOfOrderAcceptance() {
        return this.pointOfOrderAcceptance;
    }

    /**
     * Setter for pointOfOrderAcceptance
     *
     * The place of business where you accept/approve the customer’s order,
    * thereby becoming contractually obligated to make the sale.
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
