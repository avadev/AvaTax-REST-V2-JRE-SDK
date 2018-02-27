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
 * The CoverLetter model represents a message sent along with an invitation to use CertExpress to
* upload certificates. An invitation allows customers to use CertExpress to upload their exemption 
* certificates directly; this cover letter explains why the invitation was sent.
 */
public class CoverLetterModel {


    private Integer id;

    /**
     * Getter for id
     *
     * A unique ID number representing a cover letter sent with a CertExpress invitation.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number representing a cover letter sent with a CertExpress invitation.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the AvaTax company that received this certificate.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the AvaTax company that received this certificate.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String title;

    /**
     * Getter for title
     *
     * The title used when sending the cover letter.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * The title used when sending the cover letter.
     */
    public void setTitle(String value) {
        this.title = value;
    }


    private String subject;

    /**
     * Getter for subject
     *
     * The subject message used when sending the cover letter via email.
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Setter for subject
     *
     * The subject message used when sending the cover letter via email.
     */
    public void setSubject(String value) {
        this.subject = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A full description of the cover letter's contents and message.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A full description of the cover letter's contents and message.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private Boolean active;

    /**
     * Getter for active
     *
     * Is this cover letter active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for active
     *
     * Is this cover letter active
     */
    public void setActive(Boolean value) {
        this.active = value;
    }


    private Integer pageCount;

    /**
     * Getter for pageCount
     *
     * How many pages this cover letter encompasses
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * Setter for pageCount
     *
     * How many pages this cover letter encompasses
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }


    private String templateFilename;

    /**
     * Getter for templateFilename
     *
     * The file name of the cover letter template
     */
    public String getTemplateFilename() {
        return this.templateFilename;
    }

    /**
     * Setter for templateFilename
     *
     * The file name of the cover letter template
     */
    public void setTemplateFilename(String value) {
        this.templateFilename = value;
    }


    private Integer version;

    /**
     * Getter for version
     *
     * The version number of the template
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Setter for version
     *
     * The version number of the template
     */
    public void setVersion(Integer value) {
        this.version = value;
    }


    /**
     * Returns a JSON string representation of CoverLetterModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
