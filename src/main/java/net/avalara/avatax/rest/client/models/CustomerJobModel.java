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
 * Customer job model. This is exposed in the URL's `$includes`.
 */
public class CustomerJobModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this customer's job.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this customer's job.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer jobNumber;

    /**
     * Getter for jobNumber
     *
     * The job number of this customer.
     */
    public Integer getJobNumber() {
        return this.jobNumber;
    }

    /**
     * Setter for jobNumber
     *
     * The job number of this customer.
     */
    public void setJobNumber(Integer value) {
        this.jobNumber = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The job name of this customer.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The job name of this customer.
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Returns a JSON string representation of CustomerJobModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
