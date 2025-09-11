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
 * Represents an enumeration value with title and value.
 */
public class DynamicRuleEnumValueModel {


    private String title;

    /**
     * Getter for title
     *
     * The display title for the enum value.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * The display title for the enum value.
     */
    public void setTitle(String value) {
        this.title = value;
    }

    private String value;

    /**
     * Getter for value
     *
     * The actual enum value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The actual enum value.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleEnumValueModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
