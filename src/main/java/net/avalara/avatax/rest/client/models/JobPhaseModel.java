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
 * A phase within a certificate job.
 */
public class JobPhaseModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this phase.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this phase.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of this phase.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this phase.
     */
    public void setName(String value) {
        this.name = value;
    }

    private Integer jobId;

    /**
     * Getter for jobId
     *
     * The ID of the job this phase belongs to.
     */
    public Integer getJobId() {
        return this.jobId;
    }

    /**
     * Setter for jobId
     *
     * The ID of the job this phase belongs to.
     */
    public void setJobId(Integer value) {
        this.jobId = value;
    }

    private String phaseCode;

    /**
     * Getter for phaseCode
     *
     * The unique code for this phase.
     */
    public String getPhaseCode() {
        return this.phaseCode;
    }

    /**
     * Setter for phaseCode
     *
     * The unique code for this phase.
     */
    public void setPhaseCode(String value) {
        this.phaseCode = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this phase was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this phase was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date when this phase was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date when this phase was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private ArrayList<JobTaskModel> tasks;

    /**
     * Getter for tasks
     *
     * A list of tasks within this phase.
     */
    public ArrayList<JobTaskModel> getTasks() {
        return this.tasks;
    }

    /**
     * Setter for tasks
     *
     * A list of tasks within this phase.
     */
    public void setTasks(ArrayList<JobTaskModel> value) {
        this.tasks = value;
    }

    /**
     * Returns a JSON string representation of JobPhaseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
