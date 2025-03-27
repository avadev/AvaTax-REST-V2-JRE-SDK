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
 * UpdateCustomFieldsModel with list of UpdateCustomFields
 */
public class UpdateCustomFieldsModel {


    private ArrayList<UpdateCustomFields> customFields;

    /**
     * Getter for customFields
     *
     * List of UpdateCustomFields
     */
    public ArrayList<UpdateCustomFields> getCustomFields() {
        return this.customFields;
    }

    /**
     * Setter for customFields
     *
     * List of UpdateCustomFields
     */
    public void setCustomFields(ArrayList<UpdateCustomFields> value) {
        this.customFields = value;
    }

    /**
     * Returns a JSON string representation of UpdateCustomFieldsModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
