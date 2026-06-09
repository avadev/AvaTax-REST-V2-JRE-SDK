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
 * The output model for audit log report parameter definitions.
 */
public class ReportAuditLogParametersModel {


    private String reportType;

    /**
     * Getter for reportType
     *
     * The type of the report (e.g., "audit").
     */
    public String getReportType() {
        return this.reportType;
    }

    /**
     * Setter for reportType
     *
     * The type of the report (e.g., "audit").
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    private ArrayList<ReportAuditLogReportModel> reports;

    /**
     * Getter for reports
     *
     * The list of reports for this audit log report.
     */
    public ArrayList<ReportAuditLogReportModel> getReports() {
        return this.reports;
    }

    /**
     * Setter for reports
     *
     * The list of reports for this audit log report.
     */
    public void setReports(ArrayList<ReportAuditLogReportModel> value) {
        this.reports = value;
    }

    private Date startDate;

    /**
     * Getter for startDate
     *
     * The start date for the audit log report.
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate
     *
     * The start date for the audit log report.
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * The end date for the audit log report.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * The end date for the audit log report.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Compression compression;

    /**
     * Getter for compression
     *
     * The compression type for the report output (e.g., "NONE", "GZIP").
     */
    public Compression getCompression() {
        return this.compression;
    }

    /**
     * Setter for compression
     *
     * The compression type for the report output (e.g., "NONE", "GZIP").
     */
    public void setCompression(Compression value) {
        this.compression = value;
    }

    /**
     * Returns a JSON string representation of ReportAuditLogParametersModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
