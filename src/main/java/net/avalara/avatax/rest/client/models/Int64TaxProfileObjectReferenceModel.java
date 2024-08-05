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
 * TaxProfile Service Object Reference Model
 */
public class Int64TaxProfileObjectReferenceModel {


    private Long identifier;

    /**
     * Getter for identifier
     *
     * Identifier or Id of data
     */
    public Long getIdentifier() {
        return this.identifier;
    }

    /**
     * Setter for identifier
     *
     * Identifier or Id of data
     */
    public void setIdentifier(Long value) {
        this.identifier = value;
    }

    private String displayName;

    /**
     * Getter for displayName
     *
     * Display name
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Setter for displayName
     *
     * Display name
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    private String location;

    /**
     * Getter for location
     *
     * Location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Setter for location
     *
     * Location
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Returns a JSON string representation of Int64TaxProfileObjectReferenceModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
