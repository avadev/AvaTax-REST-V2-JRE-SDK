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
 * Represents HS Code Restriction Details.
 */
public class ItemHSCodeRestrictionDetailModel {


    private String type;

    /**
     * Getter for type
     *
     * The type of restriction.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The type of restriction.
     */
    public void setType(String value) {
        this.type = value;
    }

    private String regulation;

    /**
     * Getter for regulation
     *
     * The regulation governing this restriction.
     */
    public String getRegulation() {
        return this.regulation;
    }

    /**
     * Setter for regulation
     *
     * The regulation governing this restriction.
     */
    public void setRegulation(String value) {
        this.regulation = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of the restriction.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of the restriction.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String summary;

    /**
     * Getter for summary
     *
     * The summary of the restriction.
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Setter for summary
     *
     * The summary of the restriction.
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    private String governmentAgency;

    /**
     * Getter for governmentAgency
     *
     * The government agency responsible for this restriction.
     */
    public String getGovernmentAgency() {
        return this.governmentAgency;
    }

    /**
     * Setter for governmentAgency
     *
     * The government agency responsible for this restriction.
     */
    public void setGovernmentAgency(String value) {
        this.governmentAgency = value;
    }

    private String complianceTitle;

    /**
     * Getter for complianceTitle
     *
     * The compliance title.
     */
    public String getComplianceTitle() {
        return this.complianceTitle;
    }

    /**
     * Setter for complianceTitle
     *
     * The compliance title.
     */
    public void setComplianceTitle(String value) {
        this.complianceTitle = value;
    }

    private String complianceMessage;

    /**
     * Getter for complianceMessage
     *
     * The compliance message.
     */
    public String getComplianceMessage() {
        return this.complianceMessage;
    }

    /**
     * Setter for complianceMessage
     *
     * The compliance message.
     */
    public void setComplianceMessage(String value) {
        this.complianceMessage = value;
    }

    private String complianceCitation;

    /**
     * Getter for complianceCitation
     *
     * The compliance citation or reference.
     */
    public String getComplianceCitation() {
        return this.complianceCitation;
    }

    /**
     * Setter for complianceCitation
     *
     * The compliance citation or reference.
     */
    public void setComplianceCitation(String value) {
        this.complianceCitation = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeRestrictionDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
