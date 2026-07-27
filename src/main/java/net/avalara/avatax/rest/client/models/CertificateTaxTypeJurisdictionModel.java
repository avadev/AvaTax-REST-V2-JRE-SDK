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
 * Represents one TPS-Nexus jurisdiction node nested under a Avalara.AvaTax.AccountServices.Models.v2.CertificateTaxSubTypeModel.
 */
public class CertificateTaxTypeJurisdictionModel {


    private String country;

    /**
     * Getter for country
     *
     * ISO-2 country code (e.g. `"US"`).
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * ISO-2 country code (e.g. `"US"`).
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * Region code within the country (e.g. two-letter state abbreviation).
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Region code within the country (e.g. two-letter state abbreviation).
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private String type;

    /**
     * Getter for type
     *
     * Jurisdiction type (e.g. `"State"`, `"County"`, `"City"`).
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Jurisdiction type (e.g. `"State"`, `"County"`, `"City"`).
     */
    public void setType(String value) {
        this.type = value;
    }

    private String code;

    /**
     * Getter for code
     *
     * FIPS-style jurisdiction code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * FIPS-style jurisdiction code.
     */
    public void setCode(String value) {
        this.code = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Human-readable name of the jurisdiction.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Human-readable name of the jurisdiction.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String shortName;

    /**
     * Getter for shortName
     *
     * Short display name.
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Setter for shortName
     *
     * Short display name.
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Returns a JSON string representation of CertificateTaxTypeJurisdictionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
