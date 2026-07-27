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
 * A job associated with a certificate.
*  
* Used as both the input shape on certificate POST/PUT (only `id` and the nested
* Avalara.AvaTax.AccountServices.Models.v2.CertificateJobModel.phases ids are required to link existing jobs/phases/tasks to the certificate)
* and the response shape on certificate GET endpoints when `jobs` is requested via
* `$include`. Use `$include=jobs.phases` or `$include=jobs.tasks` on GET to
* additionally populate the nested Avalara.AvaTax.AccountServices.Models.v2.CertificateJobModel.phases collection and the tasks under each phase.
 */
public class CertificateJobModel {


    private Boolean isExplicit;

    /**
     * Getter for isExplicit
     *
     * Indicates whether this job was explicitly linked to the certificate.
    * Populated by CertCapture on GET responses; ignored on POST/PUT.
     */
    public Boolean getIsExplicit() {
        return this.isExplicit;
    }

    /**
     * Setter for isExplicit
     *
     * Indicates whether this job was explicitly linked to the certificate.
    * Populated by CertCapture on GET responses; ignored on POST/PUT.
     */
    public void setIsExplicit(Boolean value) {
        this.isExplicit = value;
    }

    private Boolean isDirect;

    /**
     * Getter for isDirect
     *
     * Indicates whether this is a direct association.
    * Populated by CertCapture on GET responses; ignored on POST/PUT.
     */
    public Boolean getIsDirect() {
        return this.isDirect;
    }

    /**
     * Setter for isDirect
     *
     * Indicates whether this is a direct association.
    * Populated by CertCapture on GET responses; ignored on POST/PUT.
     */
    public void setIsDirect(Boolean value) {
        this.isDirect = value;
    }

    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID of this job. Required on POST/PUT to link an existing job to the certificate.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID of this job. Required on POST/PUT to link an existing job to the certificate.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * The name of this job. Populated by CertCapture on GET responses; ignored on POST/PUT
    * (the job is identified by Avalara.AvaTax.AccountServices.Models.v2.CertificateJobModel.id).
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this job. Populated by CertCapture on GET responses; ignored on POST/PUT
    * (the job is identified by Avalara.AvaTax.AccountServices.Models.v2.CertificateJobModel.id).
     */
    public void setName(String value) {
        this.name = value;
    }

    private String jobNumber;

    /**
     * Getter for jobNumber
     *
     * The job number. Populated by CertCapture on GET responses; ignored on POST/PUT
    * (the job is identified by Avalara.AvaTax.AccountServices.Models.v2.CertificateJobModel.id).
     */
    public String getJobNumber() {
        return this.jobNumber;
    }

    /**
     * Setter for jobNumber
     *
     * The job number. Populated by CertCapture on GET responses; ignored on POST/PUT
    * (the job is identified by Avalara.AvaTax.AccountServices.Models.v2.CertificateJobModel.id).
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

    private String exposureZoneName;

    /**
     * Getter for exposureZoneName
     *
     * The name of the exposure zone associated with this job. Populated by CertCapture on
    * GET responses; ignored on POST/PUT.
     */
    public String getExposureZoneName() {
        return this.exposureZoneName;
    }

    /**
     * Setter for exposureZoneName
     *
     * The name of the exposure zone associated with this job. Populated by CertCapture on
    * GET responses; ignored on POST/PUT.
     */
    public void setExposureZoneName(String value) {
        this.exposureZoneName = value;
    }

    private ArrayList<JobPhaseModel> phases;

    /**
     * Getter for phases
     *
     * The nested list of phases for this job (each phase containing its own tasks).
    *  
    * On GET, populated by CertCapture only when `$include=jobs.phases` or
    * `$include=jobs.tasks` is requested; null otherwise. On POST/PUT, supply the
    * phase / task `id` values to link them to the certificate alongside the job.
     */
    public ArrayList<JobPhaseModel> getPhases() {
        return this.phases;
    }

    /**
     * Setter for phases
     *
     * The nested list of phases for this job (each phase containing its own tasks).
    *  
    * On GET, populated by CertCapture only when `$include=jobs.phases` or
    * `$include=jobs.tasks` is requested; null otherwise. On POST/PUT, supply the
    * phase / task `id` values to link them to the certificate alongside the job.
     */
    public void setPhases(ArrayList<JobPhaseModel> value) {
        this.phases = value;
    }

    /**
     * Returns a JSON string representation of CertificateJobModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
