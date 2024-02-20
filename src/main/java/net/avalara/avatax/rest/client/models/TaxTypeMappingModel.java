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
 * Represents TaxTypeMapping Model
 */
public class TaxTypeMappingModel {


    private Integer taxTypeMappingId;

    /**
     * Getter for taxTypeMappingId
     *
     * TaxTypeMappingId
     */
    public Integer getTaxTypeMappingId() {
        return this.taxTypeMappingId;
    }

    /**
     * Setter for taxTypeMappingId
     *
     * TaxTypeMappingId
     */
    public void setTaxTypeMappingId(Integer value) {
        this.taxTypeMappingId = value;
    }

    private Integer taxTypeGroupIdSK;

    /**
     * Getter for taxTypeGroupIdSK
     *
     * TaxTypeGroupIdSK
     */
    public Integer getTaxTypeGroupIdSK() {
        return this.taxTypeGroupIdSK;
    }

    /**
     * Setter for taxTypeGroupIdSK
     *
     * TaxTypeGroupIdSK
     */
    public void setTaxTypeGroupIdSK(Integer value) {
        this.taxTypeGroupIdSK = value;
    }

    private Integer taxTypeIdSK;

    /**
     * Getter for taxTypeIdSK
     *
     * TaxTypeIdSK
     */
    public Integer getTaxTypeIdSK() {
        return this.taxTypeIdSK;
    }

    /**
     * Setter for taxTypeIdSK
     *
     * TaxTypeIdSK
     */
    public void setTaxTypeIdSK(Integer value) {
        this.taxTypeIdSK = value;
    }

    private Integer taxSubTypeIdSK;

    /**
     * Getter for taxSubTypeIdSK
     *
     * TaxSubTypeIdSK
     */
    public Integer getTaxSubTypeIdSK() {
        return this.taxSubTypeIdSK;
    }

    /**
     * Setter for taxSubTypeIdSK
     *
     * TaxSubTypeIdSK
     */
    public void setTaxSubTypeIdSK(Integer value) {
        this.taxSubTypeIdSK = value;
    }

    private Integer generalOrStandardRateTypeIdSK;

    /**
     * Getter for generalOrStandardRateTypeIdSK
     *
     * GeneralOrStandardRateTypeIdSK
     */
    public Integer getGeneralOrStandardRateTypeIdSK() {
        return this.generalOrStandardRateTypeIdSK;
    }

    /**
     * Setter for generalOrStandardRateTypeIdSK
     *
     * GeneralOrStandardRateTypeIdSK
     */
    public void setGeneralOrStandardRateTypeIdSK(Integer value) {
        this.generalOrStandardRateTypeIdSK = value;
    }

    private String taxTypeGroupId;

    /**
     * Getter for taxTypeGroupId
     *
     * TaxTypeGroupId
     */
    public String getTaxTypeGroupId() {
        return this.taxTypeGroupId;
    }

    /**
     * Setter for taxTypeGroupId
     *
     * TaxTypeGroupId
     */
    public void setTaxTypeGroupId(String value) {
        this.taxTypeGroupId = value;
    }

    private String taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * TaxTypeId
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * TaxTypeId
     */
    public void setTaxTypeId(String value) {
        this.taxTypeId = value;
    }

    private String taxSubTypeId;

    /**
     * Getter for taxSubTypeId
     *
     * TaxSubTypeId
     */
    public String getTaxSubTypeId() {
        return this.taxSubTypeId;
    }

    /**
     * Setter for taxSubTypeId
     *
     * TaxSubTypeId
     */
    public void setTaxSubTypeId(String value) {
        this.taxSubTypeId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * Country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Country
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String generalOrStandardRateTypeId;

    /**
     * Getter for generalOrStandardRateTypeId
     *
     * GeneralOrStandardRateTypeId
     */
    public String getGeneralOrStandardRateTypeId() {
        return this.generalOrStandardRateTypeId;
    }

    /**
     * Setter for generalOrStandardRateTypeId
     *
     * GeneralOrStandardRateTypeId
     */
    public void setGeneralOrStandardRateTypeId(String value) {
        this.generalOrStandardRateTypeId = value;
    }

    /**
     * Returns a JSON string representation of TaxTypeMappingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
