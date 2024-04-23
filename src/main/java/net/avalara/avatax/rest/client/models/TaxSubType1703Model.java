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
 * Represents RateTypeTaxTypeMapping Model
 */
public class TaxSubType1703Model {


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

    private String description;

    /**
     * Getter for description
     *
     * Description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Returns a JSON string representation of TaxSubType1703Model
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
