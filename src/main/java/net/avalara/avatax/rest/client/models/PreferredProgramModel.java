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
 * A preferred program is a customs and/or duty program that can be used to handle cross-border transactions.
* Customers who sign up for a preferred program may obtain better terms for their customs and duty payments.
* 
* To indicate that your company has signed up for a preferred program, specify the `code` value from this
* object as the value for the `AvaTax.LC.PreferredProgram` parameter in your transaction.
 */
public class PreferredProgramModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number representing this preferred program.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number representing this preferred program.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private String code;

    /**
     * Getter for code
     *
     * A code that identifies this preferred program. To select this program, specify this code
    * value in the `AvaTax.LC.PreferredProgram` parameter.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * A code that identifies this preferred program. To select this program, specify this code
    * value in the `AvaTax.LC.PreferredProgram` parameter.
     */
    public void setCode(String value) {
        this.code = value;
    }


    private String originCountry;

    /**
     * Getter for originCountry
     *
     * The ISO 3166 country code for the origin permitted by this program
     */
    public String getOriginCountry() {
        return this.originCountry;
    }

    /**
     * Setter for originCountry
     *
     * The ISO 3166 country code for the origin permitted by this program
     */
    public void setOriginCountry(String value) {
        this.originCountry = value;
    }


    private String destinationCountry;

    /**
     * Getter for destinationCountry
     *
     * The ISO 3166 country code for the destination permitted by this program
     */
    public String getDestinationCountry() {
        return this.destinationCountry;
    }

    /**
     * Setter for destinationCountry
     *
     * The ISO 3166 country code for the destination permitted by this program
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The earliest date for which this preferred program can be used in AvaTax. If `null`, this preferred program
    * is valid for all dates earlier than `endDate`.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The earliest date for which this preferred program can be used in AvaTax. If `null`, this preferred program
    * is valid for all dates earlier than `endDate`.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * The latest date for which this preferred program can be used in AvaTax. If `null`, this preferred program
    * is valid for all dates later than `effectiveDate`.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The latest date for which this preferred program can be used in AvaTax. If `null`, this preferred program
    * is valid for all dates later than `effectiveDate`.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    /**
     * Returns a JSON string representation of PreferredProgramModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
