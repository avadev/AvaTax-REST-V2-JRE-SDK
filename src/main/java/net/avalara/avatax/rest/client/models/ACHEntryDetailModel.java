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
 * An edit to be made on a filing calendar.
 */
public class ACHEntryDetailModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Company Id
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

    private String companyName;

    /**
     * Getter for companyName
     *
     * Company Name
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * Setter for companyName
     *
     * Company Name
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    private String state;

    /**
     * Getter for state
     *
     * State
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for state
     *
     * State
     */
    public void setState(String value) {
        this.state = value;
    }

    private String stateRegion;

    /**
     * Getter for stateRegion
     *
     * State Region
     */
    public String getStateRegion() {
        return this.stateRegion;
    }

    /**
     * Setter for stateRegion
     *
     * State Region
     */
    public void setStateRegion(String value) {
        this.stateRegion = value;
    }

    private String individualId;

    /**
     * Getter for individualId
     *
     * Individual Id
     */
    public String getIndividualId() {
        return this.individualId;
    }

    /**
     * Setter for individualId
     *
     * Individual Id
     */
    public void setIndividualId(String value) {
        this.individualId = value;
    }

    private String individualName;

    /**
     * Getter for individualName
     *
     * IndividualName
     */
    public String getIndividualName() {
        return this.individualName;
    }

    /**
     * Setter for individualName
     *
     * IndividualName
     */
    public void setIndividualName(String value) {
        this.individualName = value;
    }

    private BigDecimal amount;

    /**
     * Getter for amount
     *
     * Amount
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for amount
     *
     * Amount
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    private String traceNumber;

    /**
     * Getter for traceNumber
     *
     * TraceNumber
     */
    public String getTraceNumber() {
        return this.traceNumber;
    }

    /**
     * Setter for traceNumber
     *
     * TraceNumber
     */
    public void setTraceNumber(String value) {
        this.traceNumber = value;
    }

    /**
     * Returns a JSON string representation of ACHEntryDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
