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
 * Tax Code Recommendation Output Model
 */
public class TaxCodeRecommendationOutputModel {


    private String taxCode;

    /**
     * Getter for taxCode
     *
     * Recommended TaxCode
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * Recommended TaxCode
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private String level;

    /**
     * Getter for level
     *
     * Recommended TaxCode Level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * Setter for level
     *
     * Recommended TaxCode Level
     */
    public void setLevel(String value) {
        this.level = value;
    }

    private String dqLabel;

    /**
     * Getter for dqLabel
     *
     * The overall data quality label for the item (for example: "GOOD", "FAIR").
     */
    public String getDqLabel() {
        return this.dqLabel;
    }

    /**
     * Setter for dqLabel
     *
     * The overall data quality label for the item (for example: "GOOD", "FAIR").
     */
    public void setDqLabel(String value) {
        this.dqLabel = value;
    }

    private ArrayList<DataQualityIssueModel> dqIssues;

    /**
     * Getter for dqIssues
     *
     * The list of data quality issues detected for the item.
     */
    public ArrayList<DataQualityIssueModel> getDqIssues() {
        return this.dqIssues;
    }

    /**
     * Setter for dqIssues
     *
     * The list of data quality issues detected for the item.
     */
    public void setDqIssues(ArrayList<DataQualityIssueModel> value) {
        this.dqIssues = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The timestamp when this recommendation was generated.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The timestamp when this recommendation was generated.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    /**
     * Returns a JSON string representation of TaxCodeRecommendationOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
