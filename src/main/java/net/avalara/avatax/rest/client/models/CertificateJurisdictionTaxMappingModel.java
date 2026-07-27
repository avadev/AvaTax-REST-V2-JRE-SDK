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
 * Represents one multi-tax mapping row attached to a certificate jurisdiction.
* Each row references a TPS tax-type / sub-tax-type combination that the
* certificate is exempt for.
 */
public class CertificateJurisdictionTaxMappingModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique ID number of this mapping row.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique ID number of this mapping row.
     */
    public void setId(Integer value) {
        this.id = value;
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

    private Integer sourceMappingId;

    /**
     * Getter for sourceMappingId
     *
     * TPS `taxTypeMappingId`. Used as the diff key on PUT.
     */
    public Integer getSourceMappingId() {
        return this.sourceMappingId;
    }

    /**
     * Setter for sourceMappingId
     *
     * TPS `taxTypeMappingId`. Used as the diff key on PUT.
     */
    public void setSourceMappingId(Integer value) {
        this.sourceMappingId = value;
    }

    /**
     * Returns a JSON string representation of CertificateJurisdictionTaxMappingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
