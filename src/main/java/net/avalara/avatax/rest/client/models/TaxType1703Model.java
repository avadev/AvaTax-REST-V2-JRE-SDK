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
 * Represents TaxType1703 Model
 */
public class TaxType1703Model {


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
     * Returns a JSON string representation of TaxType1703Model
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
