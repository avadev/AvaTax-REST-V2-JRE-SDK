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
 * Represents a change request for filing status for a company
 */
public class FilingStatusChangeModel {


    private CompanyFilingStatus requestedStatus;

    /**
     * Getter for requestedStatus
     *
     * Indicates the filing status you are requesting for this company
     */
    public CompanyFilingStatus getRequestedStatus() {
        return this.requestedStatus;
    }

    /**
     * Setter for requestedStatus
     *
     * Indicates the filing status you are requesting for this company
     */
    public void setRequestedStatus(CompanyFilingStatus value) {
        this.requestedStatus = value;
    }


    /**
     * Returns a JSON string representation of FilingStatusChangeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
