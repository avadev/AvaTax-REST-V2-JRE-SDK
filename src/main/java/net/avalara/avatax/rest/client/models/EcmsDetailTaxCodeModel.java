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
 */

/**
 * 
 */
public class EcmsDetailTaxCodeModel {


    private Integer exemptCertDetailTaxCodeId;

    /**
     * Getter for exemptCertDetailTaxCodeId
     *
     * Id of the exempt certificate detail tax code
     */
    public Integer getExemptCertDetailTaxCodeId() {
        return this.exemptCertDetailTaxCodeId;
    }

    /**
     * Setter for exemptCertDetailTaxCodeId
     *
     * Id of the exempt certificate detail tax code
     */
    public void setExemptCertDetailTaxCodeId(Integer value) {
        this.exemptCertDetailTaxCodeId = value;
    }


    private Integer exemptCertDetailId;

    /**
     * Getter for exemptCertDetailId
     *
     * exempt certificate detail id
     */
    public Integer getExemptCertDetailId() {
        return this.exemptCertDetailId;
    }

    /**
     * Setter for exemptCertDetailId
     *
     * exempt certificate detail id
     */
    public void setExemptCertDetailId(Integer value) {
        this.exemptCertDetailId = value;
    }


    private Integer taxCodeId;

    /**
     * Getter for taxCodeId
     *
     * tax code id
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId
     *
     * tax code id
     */
    public void setTaxCodeId(Integer value) {
        this.taxCodeId = value;
    }


    /**
     * Returns a JSON string representation of EcmsDetailTaxCodeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
