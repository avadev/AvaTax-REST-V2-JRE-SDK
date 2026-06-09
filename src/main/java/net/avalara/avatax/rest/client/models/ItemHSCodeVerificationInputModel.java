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
 * Represents a HsCodeClassification SLA Response for a given company.
 */
public class ItemHSCodeVerificationInputModel {


    private Long itemId;

    /**
     * Getter for itemId
     *
     * The unique ID of this item.
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * The unique ID of this item.
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The country code for HS code verification (2-letter ISO 3166 country code).
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country code for HS code verification (2-letter ISO 3166 country code).
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String hsCode;

    /**
     * Getter for hsCode
     *
     * The HS code to verify.
     */
    public String getHsCode() {
        return this.hsCode;
    }

    /**
     * Setter for hsCode
     *
     * The HS code to verify.
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeVerificationInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
