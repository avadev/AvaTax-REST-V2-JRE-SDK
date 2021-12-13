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
 * A Customer's linked attribute denoting what features applied to the customer. A customer can
* be linked to multiple customer attributes and vice versa.
 */
public class CustomerAttributeModel {


    private Integer id;

    /**
     * Getter for id
     *
     * A unique ID number representing this attribute.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number representing this attribute.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * A friendly readable name for this attribute.
	 * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * A friendly readable name for this attribute.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * A full help text description of the attribute.
	 * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A full help text description of the attribute.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Boolean isSystemCode;

    /**
     * Getter for isSystemCode
     *
     * This value is true if this is a system-defined attribute. System-defined attributes
    * cannot be modified or deleted on the CertCapture website.
	 * 
     */
    public Boolean getIsSystemCode() {
        return this.isSystemCode;
    }

    /**
     * Setter for isSystemCode
     *
     * This value is true if this is a system-defined attribute. System-defined attributes
    * cannot be modified or deleted on the CertCapture website.
     */
    public void setIsSystemCode(Boolean value) {
        this.isSystemCode = value;
    }

    private Boolean isNonDeliver;

    /**
     * Getter for isNonDeliver
     *
     * A flag denotes that future exemption certificate request won't be mailed to the customer
	 * 
     */
    public Boolean getIsNonDeliver() {
        return this.isNonDeliver;
    }

    /**
     * Setter for isNonDeliver
     *
     * A flag denotes that future exemption certificate request won't be mailed to the customer
     */
    public void setIsNonDeliver(Boolean value) {
        this.isNonDeliver = value;
    }

    private Boolean isChangeable;

    /**
     * Getter for isChangeable
     *
     * A flag denotes that this attribute can't be removed/added to a customer record
	 * 
     */
    public Boolean getIsChangeable() {
        return this.isChangeable;
    }

    /**
     * Setter for isChangeable
     *
     * A flag denotes that this attribute can't be removed/added to a customer record
     */
    public void setIsChangeable(Boolean value) {
        this.isChangeable = value;
    }

    /**
     * Returns a JSON string representation of CustomerAttributeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
