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
 * Represents a form that can be filed with a tax authority.
 */
public class TaxAuthorityFormModel {


    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * The unique ID number of the tax authority.
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * The unique ID number of the tax authority.
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }


    private String formName;

    /**
     * Getter for formName
     *
     * The form name of the form for this tax authority.
     */
    public String getFormName() {
        return this.formName;
    }

    /**
     * Setter for formName
     *
     * The form name of the form for this tax authority.
     */
    public void setFormName(String value) {
        this.formName = value;
    }


    /**
     * Returns a JSON string representation of TaxAuthorityFormModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
