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
 * Swagger name: AvaTaxClient
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
* VAT transactions support a `goodsPlaceOrServiceRendered` address, which indicates where goods are located or where services 
* are rendered. VAT transactions also support an `import` address, which specifies the address of the buyer importing a good 
* from another country.
* 
* India GST transactions support a `billTo` address, which specifies where invoices and other billing-related information are sent to the buyer.
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
     * 
     */
    public AddressLocationInfo getSingleLocation() {
        return this.singleLocation;
    }

    /**
     * Setter for singleLocation
     *
     * 
     */
    public void setSingleLocation(AddressLocationInfo value) {
        this.singleLocation = value;
    }

    private AddressLocationInfo shipFrom;

    /**
     * Getter for shipFrom
     *
     * 
     */
    public AddressLocationInfo getShipFrom() {
        return this.shipFrom;
    }

    /**
     * Setter for shipFrom
     *
     * 
     */
    public void setShipFrom(AddressLocationInfo value) {
        this.shipFrom = value;
    }

    private AddressLocationInfo shipTo;

    /**
     * Getter for shipTo
     *
     * 
     */
    public AddressLocationInfo getShipTo() {
        return this.shipTo;
    }

    /**
     * Setter for shipTo
     *
     * 
     */
    public void setShipTo(AddressLocationInfo value) {
        this.shipTo = value;
    }

    private AddressLocationInfo pointOfOrderOrigin;

    /**
     * Getter for pointOfOrderOrigin
     *
     * 
     */
    public AddressLocationInfo getPointOfOrderOrigin() {
        return this.pointOfOrderOrigin;
    }

    /**
     * Setter for pointOfOrderOrigin
     *
     * 
     */
    public void setPointOfOrderOrigin(AddressLocationInfo value) {
        this.pointOfOrderOrigin = value;
    }

    private AddressLocationInfo pointOfOrderAcceptance;

    /**
     * Getter for pointOfOrderAcceptance
     *
     * 
     */
    public AddressLocationInfo getPointOfOrderAcceptance() {
        return this.pointOfOrderAcceptance;
    }

    /**
     * Setter for pointOfOrderAcceptance
     *
     * 
     */
    public void setPointOfOrderAcceptance(AddressLocationInfo value) {
        this.pointOfOrderAcceptance = value;
    }

    private AddressLocationInfo goodsPlaceOrServiceRendered;

    /**
     * Getter for goodsPlaceOrServiceRendered
     *
     * 
     */
    public AddressLocationInfo getGoodsPlaceOrServiceRendered() {
        return this.goodsPlaceOrServiceRendered;
    }

    /**
     * Setter for goodsPlaceOrServiceRendered
     *
     * 
     */
    public void setGoodsPlaceOrServiceRendered(AddressLocationInfo value) {
        this.goodsPlaceOrServiceRendered = value;
    }

    private AddressLocationInfo _import;

    /**
     * Getter for import
     *
     * 
     */
    public AddressLocationInfo getImport() {
        return this._import;
    }

    /**
     * Setter for import
     *
     * 
     */
    public void setImport(AddressLocationInfo value) {
        this._import = value;
    }

    private AddressLocationInfo billTo;

    /**
     * Getter for billTo
     *
     * 
     */
    public AddressLocationInfo getBillTo() {
        return this.billTo;
    }

    /**
     * Setter for billTo
     *
     * 
     */
    public void setBillTo(AddressLocationInfo value) {
        this.billTo = value;
    }

    /**
     * Returns a JSON string representation of AddressesModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
