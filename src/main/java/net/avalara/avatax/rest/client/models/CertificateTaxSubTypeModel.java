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
 * Represents one TPS sub-tax-type node nested under a Avalara.AvaTax.AccountServices.Models.v2.CertificateTaxTypeModel.
 */
public class CertificateTaxSubTypeModel {


    private String subTaxType;

    /**
     * Getter for subTaxType
     *
     * TPS label for the sub-tax type.
     */
    public String getSubTaxType() {
        return this.subTaxType;
    }

    /**
     * Setter for subTaxType
     *
     * TPS label for the sub-tax type.
     */
    public void setSubTaxType(String value) {
        this.subTaxType = value;
    }

    private Integer subTaxTypeId;

    /**
     * Getter for subTaxTypeId
     *
     * TPS surrogate identifier for the sub-tax type.
     */
    public Integer getSubTaxTypeId() {
        return this.subTaxTypeId;
    }

    /**
     * Setter for subTaxTypeId
     *
     * TPS surrogate identifier for the sub-tax type.
     */
    public void setSubTaxTypeId(Integer value) {
        this.subTaxTypeId = value;
    }

    private Integer sourceMappingId;

    /**
     * Getter for sourceMappingId
     *
     * TPS source mapping identifier for this (tax_type, sub_tax_type) pair. Round-trips into
    * `CertificateJurisdictionTaxMappingModel.sourceMappingId` on POST/PUT certificates
    * and is the diff key the CertCapture API uses to reconcile PUT updates.
     */
    public Integer getSourceMappingId() {
        return this.sourceMappingId;
    }

    /**
     * Setter for sourceMappingId
     *
     * TPS source mapping identifier for this (tax_type, sub_tax_type) pair. Round-trips into
    * `CertificateJurisdictionTaxMappingModel.sourceMappingId` on POST/PUT certificates
    * and is the diff key the CertCapture API uses to reconcile PUT updates.
     */
    public void setSourceMappingId(Integer value) {
        this.sourceMappingId = value;
    }

    private ArrayList<CertificateTaxTypeJurisdictionModel> jurisdictions;

    /**
     * Getter for jurisdictions
     *
     * Jurisdictions in which the (tax_type, sub_tax_type) pair is registered.
     */
    public ArrayList<CertificateTaxTypeJurisdictionModel> getJurisdictions() {
        return this.jurisdictions;
    }

    /**
     * Setter for jurisdictions
     *
     * Jurisdictions in which the (tax_type, sub_tax_type) pair is registered.
     */
    public void setJurisdictions(ArrayList<CertificateTaxTypeJurisdictionModel> value) {
        this.jurisdictions = value;
    }

    /**
     * Returns a JSON string representation of CertificateTaxSubTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
