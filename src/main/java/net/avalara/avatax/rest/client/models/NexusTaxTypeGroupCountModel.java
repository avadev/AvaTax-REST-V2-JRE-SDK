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
 * Nexus tax type groupe with count
 */
public class NexusTaxTypeGroupCountModel {


    private String nexusTaxTypeGroup;

    /**
     * Getter for nexusTaxTypeGroup
     *
     * Which nexus tax type group
	 * 
     */
    public String getNexusTaxTypeGroup() {
        return this.nexusTaxTypeGroup;
    }

    /**
     * Setter for nexusTaxTypeGroup
     *
     * Which nexus tax type group
     */
    public void setNexusTaxTypeGroup(String value) {
        this.nexusTaxTypeGroup = value;
    }

    private Integer count;

    /**
     * Getter for count
     *
     * How many nexus in the group
	 * 
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Setter for count
     *
     * How many nexus in the group
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Returns a JSON string representation of NexusTaxTypeGroupCountModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
