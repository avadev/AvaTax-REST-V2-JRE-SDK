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
 * Invalid reason for the certificate
 */
public class CertificateInvalidReasonModel {


    private Integer id;

    /**
     * Getter for id
     *
     * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * 
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * 
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Boolean systemCode;

    /**
     * Getter for systemCode
     *
     * 
     */
    public Boolean getSystemCode() {
        return this.systemCode;
    }

    /**
     * Setter for systemCode
     *
     * 
     */
    public void setSystemCode(Boolean value) {
        this.systemCode = value;
    }

    /**
     * Returns a JSON string representation of CertificateInvalidReasonModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
