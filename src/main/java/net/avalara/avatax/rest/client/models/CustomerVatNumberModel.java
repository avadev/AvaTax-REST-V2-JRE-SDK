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
 * Represents a VAT Number record for a company.
 */
public class CustomerVatNumberModel {


    private Long id;

    /**
     * Getter for id
     *
     * Unique identifier for the VAT number record
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique identifier for the VAT number record
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Company ID associated with this VAT number
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Company ID associated with this VAT number
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String vatNumber;

    /**
     * Getter for vatNumber
     *
     * VAT identification number
     */
    public String getVatNumber() {
        return this.vatNumber;
    }

    /**
     * Setter for vatNumber
     *
     * VAT identification number
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    private String businessName;

    /**
     * Getter for businessName
     *
     * User input business/company name
     */
    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * Setter for businessName
     *
     * User input business/company name
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * ISO 2-character country code
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * ISO 2-character country code
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private Integer vatNumberStatus;

    /**
     * Getter for vatNumberStatus
     *
     * VAT number validation status: 0=NotValidated, 1=Valid, 2=Invalid, 3=Error
     */
    public Integer getVatNumberStatus() {
        return this.vatNumberStatus;
    }

    /**
     * Setter for vatNumberStatus
     *
     * VAT number validation status: 0=NotValidated, 1=Valid, 2=Invalid, 3=Error
     */
    public void setVatNumberStatus(Integer value) {
        this.vatNumberStatus = value;
    }

    private String registeredBusinessName;

    /**
     * Getter for registeredBusinessName
     *
     * Business name returned from VIES
     */
    public String getRegisteredBusinessName() {
        return this.registeredBusinessName;
    }

    /**
     * Setter for registeredBusinessName
     *
     * Business name returned from VIES
     */
    public void setRegisteredBusinessName(String value) {
        this.registeredBusinessName = value;
    }

    private Integer businessNameStatus;

    /**
     * Getter for businessNameStatus
     *
     * Business name comparison status: 0=NotValidated, 1=Valid, 2=Invalid, 3=Error
     */
    public Integer getBusinessNameStatus() {
        return this.businessNameStatus;
    }

    /**
     * Setter for businessNameStatus
     *
     * Business name comparison status: 0=NotValidated, 1=Valid, 2=Invalid, 3=Error
     */
    public void setBusinessNameStatus(Integer value) {
        this.businessNameStatus = value;
    }

    private Date validationDate;

    /**
     * Getter for validationDate
     *
     * Last validation timestamp
     */
    public Date getValidationDate() {
        return this.validationDate;
    }

    /**
     * Setter for validationDate
     *
     * Last validation timestamp
     */
    public void setValidationDate(Date value) {
        this.validationDate = value;
    }

    private String validationSource;

    /**
     * Getter for validationSource
     *
     * Validation source: 'VIES' or 'ELR'
     */
    public String getValidationSource() {
        return this.validationSource;
    }

    /**
     * Setter for validationSource
     *
     * Validation source: 'VIES' or 'ELR'
     */
    public void setValidationSource(String value) {
        this.validationSource = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * Date/time when this record was created
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * Date/time when this record was created
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * Date/time when this record was last modified
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * Date/time when this record was last modified
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    /**
     * Returns a JSON string representation of CustomerVatNumberModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
