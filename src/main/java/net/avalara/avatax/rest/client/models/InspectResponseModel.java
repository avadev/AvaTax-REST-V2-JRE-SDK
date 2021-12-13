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
 * Response model used as output for InspectLine API.
 */
public class InspectResponseModel {


    private ArrayList<DeterminationFactorModel> determinationFactors;

    /**
     * Getter for determinationFactors
     *
     * A list of determination factors for a line that is being inspected through the InspectLine API.
	 * 
     */
    public ArrayList<DeterminationFactorModel> getDeterminationFactors() {
        return this.determinationFactors;
    }

    /**
     * Setter for determinationFactors
     *
     * A list of determination factors for a line that is being inspected through the InspectLine API.
     */
    public void setDeterminationFactors(ArrayList<DeterminationFactorModel> value) {
        this.determinationFactors = value;
    }

    /**
     * Returns a JSON string representation of InspectResponseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
