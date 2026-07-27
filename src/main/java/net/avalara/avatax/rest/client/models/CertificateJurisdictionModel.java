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
 * Represents a jurisdiction associated with a certificate.
* A certificate can be linked to one or more jurisdictions indicating the tax
* authority regions where the certificate applies.
 */
public class CertificateJurisdictionModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique ID number
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique ID number
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String type;

    /**
     * Getter for type
     *
     * The type of the jurisdiction (e.g., State, County, City).
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of the jurisdiction (e.g., State, County, City).
     */
    public void setType(String value) {
        this.type = value;
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

    private String code;

    /**
     * Getter for code
     *
     * The FIPS code or identifier for the jurisdiction.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * The FIPS code or identifier for the jurisdiction.
     */
    public void setCode(String value) {
        this.code = value;
    }

    private Boolean isSalesTaxApplicable;

    /**
     * Getter for isSalesTaxApplicable
     *
     * Whether sales-tax exemption applies for this jurisdiction. Default `true`.
    * Set `false` to opt the jurisdiction out of the sales-tax validator while
    * keeping any `taxTypeMappings` rows in scope.
     */
    public Boolean getIsSalesTaxApplicable() {
        return this.isSalesTaxApplicable;
    }

    /**
     * Setter for isSalesTaxApplicable
     *
     * Whether sales-tax exemption applies for this jurisdiction. Default `true`.
    * Set `false` to opt the jurisdiction out of the sales-tax validator while
    * keeping any `taxTypeMappings` rows in scope.
     */
    public void setIsSalesTaxApplicable(Boolean value) {
        this.isSalesTaxApplicable = value;
    }

    private ArrayList<CertificateJurisdictionTaxMappingModel> taxTypeMappings;

    /**
     * Getter for taxTypeMappings
     *
     * List of multi-tax mapping rows attached to this jurisdiction. Each row references
    * a TPS tax-type / sub-tax-type combination sourced from `GET /v2/tax-types`.
     */
    public ArrayList<CertificateJurisdictionTaxMappingModel> getTaxTypeMappings() {
        return this.taxTypeMappings;
    }

    /**
     * Setter for taxTypeMappings
     *
     * List of multi-tax mapping rows attached to this jurisdiction. Each row references
    * a TPS tax-type / sub-tax-type combination sourced from `GET /v2/tax-types`.
     */
    public void setTaxTypeMappings(ArrayList<CertificateJurisdictionTaxMappingModel> value) {
        this.taxTypeMappings = value;
    }

    /**
     * Returns a JSON string representation of CertificateJurisdictionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
