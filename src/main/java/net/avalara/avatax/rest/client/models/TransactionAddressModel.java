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
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * An address used within this transaction.
 */
public class TransactionAddressModel {


    private Int64? id;

    /**
     * Getter for id;
     * The unique ID number of this address.
     */
    public Int64? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this address.
     */
    public void setid(Int64? value) {;
        this.id = value;;
    }


    private Int64? transactionId;

    /**
     * Getter for transactionId;
     * The unique ID number of the document to which this address belongs.
     */
    public Int64? gettransactionId() {;
        return this.transactionId;;
    }

    /**
     * Setter for transactionId;
     * The unique ID number of the document to which this address belongs.
     */
    public void settransactionId(Int64? value) {;
        this.transactionId = value;;
    }


    private BoundaryLevel? boundaryLevel;

    /**
     * Getter for boundaryLevel;
     * The boundary level at which this address was validated.
     */
    public BoundaryLevel? getboundaryLevel() {;
        return this.boundaryLevel;;
    }

    /**
     * Setter for boundaryLevel;
     * The boundary level at which this address was validated.
     */
    public void setboundaryLevel(BoundaryLevel? value) {;
        this.boundaryLevel = value;;
    }


    private String line1;

    /**
     * Getter for line1;
     * The first line of the address.
     */
    public String getline1() {;
        return this.line1;;
    }

    /**
     * Setter for line1;
     * The first line of the address.
     */
    public void setline1(String value) {;
        this.line1 = value;;
    }


    private String line2;

    /**
     * Getter for line2;
     * The second line of the address.
     */
    public String getline2() {;
        return this.line2;;
    }

    /**
     * Setter for line2;
     * The second line of the address.
     */
    public void setline2(String value) {;
        this.line2 = value;;
    }


    private String line3;

    /**
     * Getter for line3;
     * The third line of the address.
     */
    public String getline3() {;
        return this.line3;;
    }

    /**
     * Setter for line3;
     * The third line of the address.
     */
    public void setline3(String value) {;
        this.line3 = value;;
    }


    private String city;

    /**
     * Getter for city;
     * The city for the address.
     */
    public String getcity() {;
        return this.city;;
    }

    /**
     * Setter for city;
     * The city for the address.
     */
    public void setcity(String value) {;
        this.city = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The region, state, or province for the address.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The region, state, or province for the address.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private String postalCode;

    /**
     * Getter for postalCode;
     * The postal code or zip code for the address.
     */
    public String getpostalCode() {;
        return this.postalCode;;
    }

    /**
     * Setter for postalCode;
     * The postal code or zip code for the address.
     */
    public void setpostalCode(String value) {;
        this.postalCode = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The country for the address.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The country for the address.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private Int32? taxRegionId;

    /**
     * Getter for taxRegionId;
     * The unique ID number of the tax region for this address.
     */
    public Int32? gettaxRegionId() {;
        return this.taxRegionId;;
    }

    /**
     * Setter for taxRegionId;
     * The unique ID number of the tax region for this address.
     */
    public void settaxRegionId(Int32? value) {;
        this.taxRegionId = value;;
    }


    private String latitude;

    /**
     * Getter for latitude;
     * Latitude for this address (CALC - 13394)
     */
    public String getlatitude() {;
        return this.latitude;;
    }

    /**
     * Setter for latitude;
     * Latitude for this address (CALC - 13394)
     */
    public void setlatitude(String value) {;
        this.latitude = value;;
    }


    private String longitude;

    /**
     * Getter for longitude;
     * Longitude for this address (CALC - 13394)
     */
    public String getlongitude() {;
        return this.longitude;;
    }

    /**
     * Setter for longitude;
     * Longitude for this address (CALC - 13394)
     */
    public void setlongitude(String value) {;
        this.longitude = value;;
    }


    /**
     * Returns a JSON string representation of TransactionAddressModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
