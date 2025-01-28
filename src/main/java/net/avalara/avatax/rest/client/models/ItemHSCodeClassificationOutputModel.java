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
 * The output model for an HS code classification.
 */
public class ItemHSCodeClassificationOutputModel {


    private Integer total;

    /**
     * Getter for total
     *
     * The total items requested for classification.
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * Setter for total
     *
     * The total items requested for classification.
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

    private ArrayList<FailedHSCodeClassificationModel> failed;

    /**
     * Getter for failed
     *
     * A list of failed HS code classifications.
     */
    public ArrayList<FailedHSCodeClassificationModel> getFailed() {
        return this.failed;
    }

    /**
     * Setter for failed
     *
     * A list of failed HS code classifications.
     */
    public void setFailed(ArrayList<FailedHSCodeClassificationModel> value) {
        this.failed = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeClassificationOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
