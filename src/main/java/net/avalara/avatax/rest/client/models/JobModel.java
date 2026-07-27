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
 * A job associated with a certificate or customer. Used for $include=jobs on certificate/customer
* fetch APIs, and as the request/response body for the standalone Jobs CRUD endpoints.
 */
public class JobModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this job.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this job.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String jobNumber;

    /**
     * Getter for jobNumber
     *
     * The job number of this job.
     */
    public String getJobNumber() {
        return this.jobNumber;
    }

    /**
     * Setter for jobNumber
     *
     * The job number of this job.
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of this job.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this job.
     */
    public void setName(String value) {
        this.name = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this job was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this job was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date when this job was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date when this job was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private ExposureZoneModel exposureZone;

    /**
     * Getter for exposureZone
     *
     * 
     */
    public ExposureZoneModel getExposureZone() {
        return this.exposureZone;
    }

    /**
     * Setter for exposureZone
     *
     * 
     */
    public void setExposureZone(ExposureZoneModel value) {
        this.exposureZone = value;
    }

    private ArrayList<JobPhaseModel> phases;

    /**
     * Getter for phases
     *
     * A list of phases associated with this job.
    *  
    * You can fetch this data by specifying `$include=phases` when calling a job fetch API.
    * Use `$include=phases,tasks` to also expand the tasks within each phase.
     */
    public ArrayList<JobPhaseModel> getPhases() {
        return this.phases;
    }

    /**
     * Setter for phases
     *
     * A list of phases associated with this job.
    *  
    * You can fetch this data by specifying `$include=phases` when calling a job fetch API.
    * Use `$include=phases,tasks` to also expand the tasks within each phase.
     */
    public void setPhases(ArrayList<JobPhaseModel> value) {
        this.phases = value;
    }

    /**
     * Returns a JSON string representation of JobModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
