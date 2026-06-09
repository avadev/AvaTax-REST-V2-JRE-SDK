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
 * Represents a report within audit log report input parameters.
 */
public class ReportAuditLogReportInputModel {


    private String reportSubType;

    /**
     * Getter for reportSubType
     *
     * The report sub-type (e.g., "account").
     */
    public String getReportSubType() {
        return this.reportSubType;
    }

    /**
     * Setter for reportSubType
     *
     * The report sub-type (e.g., "account").
     */
    public void setReportSubType(String value) {
        this.reportSubType = value;
    }

    private ArrayList<ReportAuditLogFilterInputModel> filters;

    /**
     * Getter for filters
     *
     * The filters for this report.
     */
    public ArrayList<ReportAuditLogFilterInputModel> getFilters() {
        return this.filters;
    }

    /**
     * Setter for filters
     *
     * The filters for this report.
     */
    public void setFilters(ArrayList<ReportAuditLogFilterInputModel> value) {
        this.filters = value;
    }

    /**
     * Returns a JSON string representation of ReportAuditLogReportInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
