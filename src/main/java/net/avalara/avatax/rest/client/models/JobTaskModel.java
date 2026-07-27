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
 * A task within a certificate job phase.
 */
public class JobTaskModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this task.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this task.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer phaseId;

    /**
     * Getter for phaseId
     *
     * The ID of the phase this task belongs to.
     */
    public Integer getPhaseId() {
        return this.phaseId;
    }

    /**
     * Setter for phaseId
     *
     * The ID of the phase this task belongs to.
     */
    public void setPhaseId(Integer value) {
        this.phaseId = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of this task.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this task.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String taskCode;

    /**
     * Getter for taskCode
     *
     * The unique code for this task.
     */
    public String getTaskCode() {
        return this.taskCode;
    }

    /**
     * Setter for taskCode
     *
     * The unique code for this task.
     */
    public void setTaskCode(String value) {
        this.taskCode = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this task was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this task was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date when this task was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date when this task was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    /**
     * Returns a JSON string representation of JobTaskModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
