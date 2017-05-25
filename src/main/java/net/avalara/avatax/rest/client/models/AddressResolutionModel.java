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
 * Address Resolution Model
 */
public class AddressResolutionModel {


    private AddressInfo address;

    /**
     * Getter for address;
     * The original address
     */
    public AddressInfo getaddress() {;
        return this.address;;
    }

    /**
     * Setter for address;
     * The original address
     */
    public void setaddress(AddressInfo value) {;
        this.address = value;;
    }


    private List<ValidatedAddressInfo> validatedAddresses;

    /**
     * Getter for validatedAddresses;
     * The validated address or addresses
     */
    public List<ValidatedAddressInfo> getvalidatedAddresses() {;
        return this.validatedAddresses;;
    }

    /**
     * Setter for validatedAddresses;
     * The validated address or addresses
     */
    public void setvalidatedAddresses(List<ValidatedAddressInfo> value) {;
        this.validatedAddresses = value;;
    }


    private CoordinateInfo coordinates;

    /**
     * Getter for coordinates;
     * The geospatial coordinates of this address
     */
    public CoordinateInfo getcoordinates() {;
        return this.coordinates;;
    }

    /**
     * Setter for coordinates;
     * The geospatial coordinates of this address
     */
    public void setcoordinates(CoordinateInfo value) {;
        this.coordinates = value;;
    }


    private ResolutionQuality? resolutionQuality;

    /**
     * Getter for resolutionQuality;
     * The resolution quality of the geospatial coordinates
     */
    public ResolutionQuality? getresolutionQuality() {;
        return this.resolutionQuality;;
    }

    /**
     * Setter for resolutionQuality;
     * The resolution quality of the geospatial coordinates
     */
    public void setresolutionQuality(ResolutionQuality? value) {;
        this.resolutionQuality = value;;
    }


    private List<TaxAuthorityInfo> taxAuthorities;

    /**
     * Getter for taxAuthorities;
     * List of informational and warning messages regarding this address
     */
    public List<TaxAuthorityInfo> gettaxAuthorities() {;
        return this.taxAuthorities;;
    }

    /**
     * Setter for taxAuthorities;
     * List of informational and warning messages regarding this address
     */
    public void settaxAuthorities(List<TaxAuthorityInfo> value) {;
        this.taxAuthorities = value;;
    }


    private List<AvaTaxMessage> messages;

    /**
     * Getter for messages;
     * List of informational and warning messages regarding this address
     */
    public List<AvaTaxMessage> getmessages() {;
        return this.messages;;
    }

    /**
     * Setter for messages;
     * List of informational and warning messages regarding this address
     */
    public void setmessages(List<AvaTaxMessage> value) {;
        this.messages = value;;
    }


    /**
     * Returns a JSON string representation of AddressResolutionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
