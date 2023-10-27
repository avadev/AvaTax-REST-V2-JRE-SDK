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
 * Cost Center Response Model
 */
public class CostCenterSuccessResponseModel {


    private Long costCenterId;

    /**
     * Getter for costCenterId
     *
     * The Cost center Id
     */
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    /**
     * Setter for costCenterId
     *
     * The Cost center Id
     */
    public void setCostCenterId(Long value) {
        this.costCenterId = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * CompanyId to which the cost center belongs
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * CompanyId to which the cost center belongs
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private TaxProfileMetaDataModel meta;

    /**
     * Getter for meta
     *
     * 
     */
    public TaxProfileMetaDataModel getMeta() {
        return this.meta;
    }

    /**
     * Setter for meta
     *
     * 
     */
    public void setMeta(TaxProfileMetaDataModel value) {
        this.meta = value;
    }

    private String entityUseCode;

    /**
     * Getter for entityUseCode
     *
     * The Entity Use Code
     */
    public String getEntityUseCode() {
        return this.entityUseCode;
    }

    /**
     * Setter for entityUseCode
     *
     * The Entity Use Code
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * Effective from Date
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * Effective from Date
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * End Date
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * End Date
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    private Int64TaxProfileObjectReferenceModel defaultItem;

    /**
     * Getter for defaultItem
     *
     * 
     */
    public Int64TaxProfileObjectReferenceModel getDefaultItem() {
        return this.defaultItem;
    }

    /**
     * Setter for defaultItem
     *
     * 
     */
    public void setDefaultItem(Int64TaxProfileObjectReferenceModel value) {
        this.defaultItem = value;
    }

    private String costCenterCode;

    /**
     * Getter for costCenterCode
     *
     * The Cost center Name
     */
    public String getCostCenterCode() {
        return this.costCenterCode;
    }

    /**
     * Setter for costCenterCode
     *
     * The Cost center Name
     */
    public void setCostCenterCode(String value) {
        this.costCenterCode = value;
    }

    /**
     * Returns a JSON string representation of CostCenterSuccessResponseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
