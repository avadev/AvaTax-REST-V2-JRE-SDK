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
 * Item HSCode Classification Status Output Model
 */
public class ItemHSCodeClassificationStatusOutputModel {


    private String name;

    /**
     * Getter for name
     *
     * Status
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Status
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeClassificationStatusOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
