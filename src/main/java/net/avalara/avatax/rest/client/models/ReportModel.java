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
 * A model for displaying report task metadata
 */
public class ReportModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique identifier of the report task
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique identifier of the report task
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The ID of the account the reported transactions are from
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The ID of the account the reported transactions are from
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The ID of the company the reported transactions are from
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The ID of the company the reported transactions are from
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String reportType;

    /**
     * Getter for reportType
     *
     * The type of the report: ExportDocumentLine, etc.
     */
    public String getReportType() {
        return this.reportType;
    }

    /**
     * Setter for reportType
     *
     * The type of the report: ExportDocumentLine, etc.
     */
    public void setReportType(String value) {
        this.reportType = value;
    }


    private ReportParametersModel parameters;

    /**
     * Getter for parameters
     *
     * The parametes used to build the report
     */
    public ReportParametersModel getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * The parametes used to build the report
     */
    public void setParameters(ReportParametersModel value) {
        this.parameters = value;
    }


    private String status;

    /**
     * Getter for status
     *
     * The current status of the report building task
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The current status of the report building task
     */
    public void setStatus(String value) {
        this.status = value;
    }


    private Integer size;

    /**
     * Getter for size
     *
     * The size of the report file, if available
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * Setter for size
     *
     * The size of the report file, if available
     */
    public void setSize(Integer value) {
        this.size = value;
    }


    private String format;

    /**
     * Getter for format
     *
     * The format of the report file
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * Setter for format
     *
     * The format of the report file
     */
    public void setFormat(String value) {
        this.format = value;
    }


    private String file;

    /**
     * Getter for file
     *
     * The name of the report file, if available
     */
    public String getFile() {
        return this.file;
    }

    /**
     * Setter for file
     *
     * The name of the report file, if available
     */
    public void setFile(String value) {
        this.file = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The time when the report task was initiated
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The time when the report task was initiated
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The Id of the user who initiated this task
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The Id of the user who initiated this task
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private String createdUser;

    /**
     * Getter for createdUser
     *
     * The userName of the user who initiated the report task
     */
    public String getCreatedUser() {
        return this.createdUser;
    }

    /**
     * Setter for createdUser
     *
     * The userName of the user who initiated the report task
     */
    public void setCreatedUser(String value) {
        this.createdUser = value;
    }


    private Date completedDate;

    /**
     * Getter for completedDate
     *
     * The time when the report was finished building, if completed
     */
    public Date getCompletedDate() {
        return this.completedDate;
    }

    /**
     * Setter for completedDate
     *
     * The time when the report was finished building, if completed
     */
    public void setCompletedDate(Date value) {
        this.completedDate = value;
    }


    /**
     * Returns a JSON string representation of ReportModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
