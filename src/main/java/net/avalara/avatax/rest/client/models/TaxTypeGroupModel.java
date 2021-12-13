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
 * Represents a tax type group
 */
public class TaxTypeGroupModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax type group.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax type group.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String taxTypeGroup;

    /**
     * Getter for taxTypeGroup
     *
     * The unique human readable Id of this tax type group.
	 * 
     */
    public String getTaxTypeGroup() {
        return this.taxTypeGroup;
    }

    /**
     * Setter for taxTypeGroup
     *
     * The unique human readable Id of this tax type group.
     */
    public void setTaxTypeGroup(String value) {
        this.taxTypeGroup = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * The description of this tax type group.
	 * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description of this tax type group.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private Integer subscriptionTypeId;

    /**
     * Getter for subscriptionTypeId
     *
     * If this tax type group requires a subscription, this contains the ID number of the subscription type required to use it.
	 * 
     */
    public Integer getSubscriptionTypeId() {
        return this.subscriptionTypeId;
    }

    /**
     * Setter for subscriptionTypeId
     *
     * If this tax type group requires a subscription, this contains the ID number of the subscription type required to use it.
     */
    public void setSubscriptionTypeId(Integer value) {
        this.subscriptionTypeId = value;
    }

    private String subscriptionDescription;

    /**
     * Getter for subscriptionDescription
     *
     * If this tax type group requires a subscription, this contains the friendly name of the subscription type required to use it.
	 * 
     */
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    /**
     * Setter for subscriptionDescription
     *
     * If this tax type group requires a subscription, this contains the friendly name of the subscription type required to use it.
     */
    public void setSubscriptionDescription(String value) {
        this.subscriptionDescription = value;
    }

    private String tabName;

    /**
     * Getter for tabName
     *
     * The name of the tab in the AvaTax website corresponding to this tax type group.
	 * 
     */
    public String getTabName() {
        return this.tabName;
    }

    /**
     * Setter for tabName
     *
     * The name of the tab in the AvaTax website corresponding to this tax type group.
     */
    public void setTabName(String value) {
        this.tabName = value;
    }

    private Boolean showColumn;

    /**
     * Getter for showColumn
     *
     * True if this tax type group is displayed in the user interface of the AvaTax website.
	 * 
     */
    public Boolean getShowColumn() {
        return this.showColumn;
    }

    /**
     * Setter for showColumn
     *
     * True if this tax type group is displayed in the user interface of the AvaTax website.
     */
    public void setShowColumn(Boolean value) {
        this.showColumn = value;
    }

    private Integer displaySequence;

    /**
     * Getter for displaySequence
     *
     * The order this record is being returned in the response
	 * 
     */
    public Integer getDisplaySequence() {
        return this.displaySequence;
    }

    /**
     * Setter for displaySequence
     *
     * The order this record is being returned in the response
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

    /**
     * Returns a JSON string representation of TaxTypeGroupModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
