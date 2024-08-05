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
 * Represents RateTypeTaxTypeMappingModel Model
 */
public class RateTypeTaxTypeMappingModel {


    private Integer rateTypeTaxTypeMappingId;

    /**
     * Getter for rateTypeTaxTypeMappingId
     *
     * TaxTypeMappingId
     */
    public Integer getRateTypeTaxTypeMappingId() {
        return this.rateTypeTaxTypeMappingId;
    }

    /**
     * Setter for rateTypeTaxTypeMappingId
     *
     * TaxTypeMappingId
     */
    public void setRateTypeTaxTypeMappingId(Integer value) {
        this.rateTypeTaxTypeMappingId = value;
    }

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

    private Integer rateTypeIdSK;

    /**
     * Getter for rateTypeIdSK
     *
     * RateTypeIdSK
     */
    public Integer getRateTypeIdSK() {
        return this.rateTypeIdSK;
    }

    /**
     * Setter for rateTypeIdSK
     *
     * RateTypeIdSK
     */
    public void setRateTypeIdSK(Integer value) {
        this.rateTypeIdSK = value;
    }

    private String rateTypeId;

    /**
     * Getter for rateTypeId
     *
     * RateTypeId
     */
    public String getRateTypeId() {
        return this.rateTypeId;
    }

    /**
     * Setter for rateTypeId
     *
     * RateTypeId
     */
    public void setRateTypeId(String value) {
        this.rateTypeId = value;
    }

    /**
     * Returns a JSON string representation of RateTypeTaxTypeMappingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
