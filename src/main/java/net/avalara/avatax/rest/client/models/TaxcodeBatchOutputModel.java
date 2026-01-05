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
 * Represents the output model for tax code batches creation.
 */
public class TaxcodeBatchOutputModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID of the company.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID of the company.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private Long batchId;

    /**
     * Getter for batchId
     *
     * The batch identifier.
     */
    public Long getBatchId() {
        return this.batchId;
    }

    /**
     * Setter for batchId
     *
     * The batch identifier.
     */
    public void setBatchId(Long value) {
        this.batchId = value;
    }

    /**
     * Returns a JSON string representation of TaxcodeBatchOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
