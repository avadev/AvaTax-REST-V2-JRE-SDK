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
 * Represents one TPS tax-type node returned by the `ListCertificateTaxTypes` API.
*  
* The pair (`taxType`, `taxTypeId`) is what the caller uses to
* populate `taxTypeMappings` on a certificate jurisdiction.
 */
public class CertificateTaxTypeModel {


    private String taxType;

    /**
     * Getter for taxType
     *
     * TPS label for the tax type (e.g. `"Automotive"`).
     */
    public String getTaxType() {
        return this.taxType;
    }

    /**
     * Setter for taxType
     *
     * TPS label for the tax type (e.g. `"Automotive"`).
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    private Integer taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * TPS surrogate identifier for the tax type.
     */
    public Integer getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * TPS surrogate identifier for the tax type.
     */
    public void setTaxTypeId(Integer value) {
        this.taxTypeId = value;
    }

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

    private ArrayList<CertificateTaxSubTypeModel> taxSubTypeDetails;

    /**
     * Getter for taxSubTypeDetails
     *
     * Sub-tax-type details under this tax type.
     */
    public ArrayList<CertificateTaxSubTypeModel> getTaxSubTypeDetails() {
        return this.taxSubTypeDetails;
    }

    /**
     * Setter for taxSubTypeDetails
     *
     * Sub-tax-type details under this tax type.
     */
    public void setTaxSubTypeDetails(ArrayList<CertificateTaxSubTypeModel> value) {
        this.taxSubTypeDetails = value;
    }

    /**
     * Returns a JSON string representation of CertificateTaxTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
