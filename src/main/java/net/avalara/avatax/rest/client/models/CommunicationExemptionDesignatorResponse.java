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
 * Encloses Communication exemption designator details
 */
public class CommunicationExemptionDesignatorResponse {


    private Integer id;

    /**
     * Getter for id
     *
     * Communication category Id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Communication category Id
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String type;

    /**
     * Getter for type
     *
     * Tax category
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Tax category
     */
    public void setType(String value) {
        this.type = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Communication category name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Communication category name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Returns a JSON string representation of CommunicationExemptionDesignatorResponse
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
