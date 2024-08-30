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
 * Encloses communication tax type details
 */
public class CommunicationTaxTypeResponse {


    private CommunicationLocationResponse location;

    /**
     * Getter for location
     *
     * 
     */
    public CommunicationLocationResponse getLocation() {
        return this.location;
    }

    /**
     * Setter for location
     *
     * 
     */
    public void setLocation(CommunicationLocationResponse value) {
        this.location = value;
    }

    private CommunicationExemptionDesignatorResponse exemptionDesignator;

    /**
     * Getter for exemptionDesignator
     *
     * 
     */
    public CommunicationExemptionDesignatorResponse getExemptionDesignator() {
        return this.exemptionDesignator;
    }

    /**
     * Setter for exemptionDesignator
     *
     * 
     */
    public void setExemptionDesignator(CommunicationExemptionDesignatorResponse value) {
        this.exemptionDesignator = value;
    }

    private ArrayList<String> scope;

    /**
     * Getter for scope
     *
     * Communication scope
     */
    public ArrayList<String> getScope() {
        return this.scope;
    }

    /**
     * Setter for scope
     *
     * Communication scope
     */
    public void setScope(ArrayList<String> value) {
        this.scope = value;
    }

    private String domain;

    /**
     * Getter for domain
     *
     * Communication domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * Setter for domain
     *
     * Communication domain
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Returns a JSON string representation of CommunicationTaxTypeResponse
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
