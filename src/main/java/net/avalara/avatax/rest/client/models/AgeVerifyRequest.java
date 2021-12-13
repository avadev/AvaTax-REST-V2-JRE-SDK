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
 * Swagger name: AvaTaxBeverageClient
 */

/**
 * The Request for the /ageVerification/verify endpoint. Describes information about the person whose age is being verified.
 */
public class AgeVerifyRequest {


    private String firstName;

    /**
     * Getter for firstName
     *
     * 
	 * 
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName
     *
     * 
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    private String lastName;

    /**
     * Getter for lastName
     *
     * 
	 * 
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName
     *
     * 
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    private HashMap<String, String> address;

    /**
     * Getter for address
     *
     * 
	 * 
     */
    public HashMap<String, String> getAddress() {
        return this.address;
    }

    /**
     * Setter for address
     *
     * 
     */
    public void setAddress(HashMap<String, String> value) {
        this.address = value;
    }

    private String dOB;

    /**
     * Getter for dOB
     *
     * The value should be ISO-8601 compliant (e.g. 2020-07-21).
	 * 
     */
    public String getDOB() {
        return this.dOB;
    }

    /**
     * Setter for dOB
     *
     * The value should be ISO-8601 compliant (e.g. 2020-07-21).
     */
    public void setDOB(String value) {
        this.dOB = value;
    }

    /**
     * Returns a JSON string representation of AgeVerifyRequest
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
