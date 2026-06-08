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
 * Represents a valid jurisdiction that can be linked to a certificate.
*  
* This model is returned by the `ListJurisdictions` API, which lists the jurisdictions
* that are valid for a given exposure zone and exemption tax code. The returned
* jurisdictions can then be used to add valid jurisdictions to a certificate.
 */
public class CertificateJurisdictionListModel {


    private String code;

    /**
     * Getter for code
     *
     * The code identifying the jurisdiction.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The code identifying the jurisdiction.
     */
    public void setCode(String value) {
        this.code = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the jurisdiction.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the jurisdiction.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String type;

    /**
     * Getter for type
     *
     * The type of the jurisdiction (e.g., Special, State, County, City).
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of the jurisdiction (e.g., Special, State, County, City).
     */
    public void setType(String value) {
        this.type = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * The region (for example, the two-letter state or province abbreviation) where
    * this jurisdiction applies.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The region (for example, the two-letter state or province abbreviation) where
    * this jurisdiction applies.
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The ISO country code for this jurisdiction.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The ISO country code for this jurisdiction.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * The customer usage type (entity use code) associated with this jurisdiction.
     */
    public String getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * The customer usage type (entity use code) associated with this jurisdiction.
     */
    public void setCustomerUsageType(String value) {
        this.customerUsageType = value;
    }

    /**
     * Returns a JSON string representation of CertificateJurisdictionListModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
