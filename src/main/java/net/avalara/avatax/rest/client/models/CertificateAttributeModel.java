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
 * A certificate attribute can be thought of as a feature or flag that is applied to a certificate.
* A single certificate can be linked to zero, one, or many certificate attributes. The full list of 
* attributes can be obtained by calling the `ListCertificateAttributes` API.
 */
public class CertificateAttributeModel {


    private Integer id;

    /**
     * Getter for id
     *
     * A unique ID number representing this certificate attribute.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number representing this certificate attribute.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * A friendly readable name for this certificate attribute.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * A friendly readable name for this certificate attribute.
     */
    public void setName(String value) {
        this.name = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A full help text description of the certificate attribute.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A full help text description of the certificate attribute.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private Boolean isSystemCode;

    /**
     * Getter for isSystemCode
     *
     * This value is true if this is a system-defined certificate attribute. System-defined attributes
    * cannot be modified or deleted on the CertCapture website.
     */
    public Boolean getIsSystemCode() {
        return this.isSystemCode;
    }

    /**
     * Setter for isSystemCode
     *
     * This value is true if this is a system-defined certificate attribute. System-defined attributes
    * cannot be modified or deleted on the CertCapture website.
     */
    public void setIsSystemCode(Boolean value) {
        this.isSystemCode = value;
    }


    /**
     * Returns a JSON string representation of CertificateAttributeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
