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
 * Information about Avalara-defined tax code types.
* This list is used when creating tax codes and tax rules.
 */
public class TaxCodeTypesModel {


    private HashMap<String, String> types;

    /**
     * Getter for types
     *
     * The list of Avalara-defined tax code types.
     */
    public HashMap<String, String> getTypes() {
        return this.types;
    }

    /**
     * Setter for types
     *
     * The list of Avalara-defined tax code types.
     */
    public void setTypes(HashMap<String, String> value) {
        this.types = value;
    }


    /**
     * Returns a JSON string representation of TaxCodeTypesModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
