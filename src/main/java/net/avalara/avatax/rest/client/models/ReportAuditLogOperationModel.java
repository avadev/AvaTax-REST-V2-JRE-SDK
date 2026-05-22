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
 * Represents an operation within audit log report parameters.
 */
public class ReportAuditLogOperationModel {


    private String table;

    /**
     * Getter for table
     *
     * The table name for this operation.
     */
    public String getTable() {
        return this.table;
    }

    /**
     * Setter for table
     *
     * The table name for this operation.
     */
    public void setTable(String value) {
        this.table = value;
    }

    private HashMap<String, String> filters;

    /**
     * Getter for filters
     *
     * The filters for this operation as key-value pairs.
     */
    public HashMap<String, String> getFilters() {
        return this.filters;
    }

    /**
     * Setter for filters
     *
     * The filters for this operation as key-value pairs.
     */
    public void setFilters(HashMap<String, String> value) {
        this.filters = value;
    }

    /**
     * Returns a JSON string representation of ReportAuditLogOperationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
