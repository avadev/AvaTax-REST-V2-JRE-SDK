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
 * Failed HS code classification model.
 */
public class FailedHSCodeClassificationModel {


    private Long itemId;

    /**
     * Getter for itemId
     *
     * The failed item ID.
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * The failed item ID.
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    private ArrayList<HSCodeClassificationError> errors;

    /**
     * Getter for errors
     *
     * A list of errors, if any.
     */
    public ArrayList<HSCodeClassificationError> getErrors() {
        return this.errors;
    }

    /**
     * Setter for errors
     *
     * A list of errors, if any.
     */
    public void setErrors(ArrayList<HSCodeClassificationError> value) {
        this.errors = value;
    }

    /**
     * Returns a JSON string representation of FailedHSCodeClassificationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
