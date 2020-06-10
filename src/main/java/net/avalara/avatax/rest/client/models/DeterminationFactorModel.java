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
 * This object represents a single determination factor for a line that is being inspected through the InspectLine API.
 */
public class DeterminationFactorModel {


    private String code;

    /**
     * Getter for code
     *
     * Determination reason code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Determination reason code.
     */
    public void setCode(String value) {
        this.code = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * Determination reason description.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Determination reason description.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    /**
     * Returns a JSON string representation of DeterminationFactorModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
