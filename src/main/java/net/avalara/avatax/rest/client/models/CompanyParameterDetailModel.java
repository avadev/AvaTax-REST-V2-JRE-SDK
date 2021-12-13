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
 * Represents a parameter associated with a company.
 */
public class CompanyParameterDetailModel {


    private Long id;

    /**
     * Getter for id
     *
     * Identifier for company parameter
	 * 
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Identifier for company parameter
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * CompanyId associated with the parameter
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * CompanyId associated with the parameter
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The parameter's name
	 * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The parameter's name
     */
    public void setName(String value) {
        this.name = value;
    }

    private String value;

    /**
     * Getter for value
     *
     * The value of the parameter
	 * 
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The value of the parameter
     */
    public void setValue(String value) {
        this.value = value;
    }

    private String unit;

    /**
     * Getter for unit
     *
     * The unit of measurement code for the parameter
	 * 
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Setter for unit
     *
     * The unit of measurement code for the parameter
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Returns a JSON string representation of CompanyParameterDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
