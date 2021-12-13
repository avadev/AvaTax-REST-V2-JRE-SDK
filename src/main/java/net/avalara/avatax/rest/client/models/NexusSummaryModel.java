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
 * Nexus summary model
 */
public class NexusSummaryModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Company Id
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Company Id
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private ArrayList<NexusTaxTypeGroupCountModel> nexusSummary;

    /**
     * Getter for nexusSummary
     *
     * Nexus summary for this company
	 * 
     */
    public ArrayList<NexusTaxTypeGroupCountModel> getNexusSummary() {
        return this.nexusSummary;
    }

    /**
     * Setter for nexusSummary
     *
     * Nexus summary for this company
     */
    public void setNexusSummary(ArrayList<NexusTaxTypeGroupCountModel> value) {
        this.nexusSummary = value;
    }

    /**
     * Returns a JSON string representation of NexusSummaryModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
