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
 * Contains information about nexus jurisdictions that were declared
* as a result of a call to `DeclareNexusByAddress`. For each address,
* this object model contains a list of the nexus objects that were declared
* according to the geocoding that corresponds to this address.
 */
public class NexusByAddressModel {


    private DeclareNexusByAddressModel address;

    /**
     * Getter for address
     *
     * 
	 * 
     */
    public DeclareNexusByAddressModel getAddress() {
        return this.address;
    }

    /**
     * Setter for address
     *
     * 
     */
    public void setAddress(DeclareNexusByAddressModel value) {
        this.address = value;
    }

    private ArrayList<NexusModel> declaredNexus;

    /**
     * Getter for declaredNexus
     *
     * List of all nexus objects that were affected by declaring nexus at the address specified
    * by `address`.
	 * 
     */
    public ArrayList<NexusModel> getDeclaredNexus() {
        return this.declaredNexus;
    }

    /**
     * Setter for declaredNexus
     *
     * List of all nexus objects that were affected by declaring nexus at the address specified
    * by `address`.
     */
    public void setDeclaredNexus(ArrayList<NexusModel> value) {
        this.declaredNexus = value;
    }

    /**
     * Returns a JSON string representation of NexusByAddressModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
