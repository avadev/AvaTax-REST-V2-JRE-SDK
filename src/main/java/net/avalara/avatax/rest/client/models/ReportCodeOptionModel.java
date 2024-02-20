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
 * Represents ReportCodeOption Model
 */
public class ReportCodeOptionModel {


    private String stateAssignedCode;

    /**
     * Getter for stateAssignedCode
     *
     * Value
     */
    public String getStateAssignedCode() {
        return this.stateAssignedCode;
    }

    /**
     * Setter for stateAssignedCode
     *
     * Value
     */
    public void setStateAssignedCode(String value) {
        this.stateAssignedCode = value;
    }

    private String label;

    /**
     * Getter for label
     *
     * Label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Setter for label
     *
     * Label
     */
    public void setLabel(String value) {
        this.label = value;
    }

    private String jurisName;

    /**
     * Getter for jurisName
     *
     * JurisName
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName
     *
     * JurisName
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }

    /**
     * Returns a JSON string representation of ReportCodeOptionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
