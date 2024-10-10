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
 * ItemTaxCodeDetailsOutputModel
 */
public class ItemTaxCodeDetailsOutputModel {


    private String taxCode;

    /**
     * Getter for taxCode
     *
     * TaxCode assigned to Item
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * TaxCode assigned to Item
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Description for the TaxCode
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description for the TaxCode
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Boolean isActive;

    /**
     * Getter for isActive
     *
     * Provides if the TaxCode is Active or Not
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive
     *
     * Provides if the TaxCode is Active or Not
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Returns a JSON string representation of ItemTaxCodeDetailsOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
