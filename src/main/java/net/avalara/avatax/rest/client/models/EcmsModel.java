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
 * Exempt certificate
 */
public class EcmsModel {


    private Integer exemptCertId;

    /**
     * Getter for exemptCertId
     *
     * Exempt certificate ID
     */
    public Integer getExemptCertId() {
        return this.exemptCertId;
    }

    /**
     * Setter for exemptCertId
     *
     * Exempt certificate ID
     */
    public void setExemptCertId(Integer value) {
        this.exemptCertId = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Company ID
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Company ID
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String customerCode;

    /**
     * Getter for customerCode
     *
     * Customer code
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode
     *
     * Customer code
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }


    private String customerName;

    /**
     * Getter for customerName
     *
     * Customer name
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * Setter for customerName
     *
     * Customer name
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }


    private String address1;

    /**
     * Getter for address1
     *
     * Address line 1
     */
    public String getAddress1() {
        return this.address1;
    }

    /**
     * Setter for address1
     *
     * Address line 1
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }


    private String address2;

    /**
     * Getter for address2
     *
     * Address line 2
     */
    public String getAddress2() {
        return this.address2;
    }

    /**
     * Setter for address2
     *
     * Address line 2
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }


    private String address3;

    /**
     * Getter for address3
     *
     * Address line 3
     */
    public String getAddress3() {
        return this.address3;
    }

    /**
     * Setter for address3
     *
     * Address line 3
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }


    private String city;

    /**
     * Getter for city
     *
     * City
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City
     */
    public void setCity(String value) {
        this.city = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * Name or ISO 3166 code identifying the region within the country.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Name or ISO 3166 code identifying the region within the country.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String postalCode;

    /**
     * Getter for postalCode
     *
     * Postal code / zip code
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for postalCode
     *
     * Postal code / zip code
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * Name or ISO 3166 code identifying the country.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Name or ISO 3166 code identifying the country.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private ExemptCertTypeId exemptCertTypeId;

    /**
     * Getter for exemptCertTypeId
     *
     * Exempt cert type
     */
    public ExemptCertTypeId getExemptCertTypeId() {
        return this.exemptCertTypeId;
    }

    /**
     * Setter for exemptCertTypeId
     *
     * Exempt cert type
     */
    public void setExemptCertTypeId(ExemptCertTypeId value) {
        this.exemptCertTypeId = value;
    }


    private String documentRefNo;

    /**
     * Getter for documentRefNo
     *
     * Document Reference Number
     */
    public String getDocumentRefNo() {
        return this.documentRefNo;
    }

    /**
     * Setter for documentRefNo
     *
     * Document Reference Number
     */
    public void setDocumentRefNo(String value) {
        this.documentRefNo = value;
    }


    private Byte businessTypeId;

    /**
     * Getter for businessTypeId
     *
     * Business type
     */
    public Byte getBusinessTypeId() {
        return this.businessTypeId;
    }

    /**
     * Setter for businessTypeId
     *
     * Business type
     */
    public void setBusinessTypeId(Byte value) {
        this.businessTypeId = value;
    }


    private String businessTypeOtherDescription;

    /**
     * Getter for businessTypeOtherDescription
     *
     * Other description for this business type
     */
    public String getBusinessTypeOtherDescription() {
        return this.businessTypeOtherDescription;
    }

    /**
     * Setter for businessTypeOtherDescription
     *
     * Other description for this business type
     */
    public void setBusinessTypeOtherDescription(String value) {
        this.businessTypeOtherDescription = value;
    }


    private String exemptReasonId;

    /**
     * Getter for exemptReasonId
     *
     * Exempt reason ID
     */
    public String getExemptReasonId() {
        return this.exemptReasonId;
    }

    /**
     * Setter for exemptReasonId
     *
     * Exempt reason ID
     */
    public void setExemptReasonId(String value) {
        this.exemptReasonId = value;
    }


    private String exemptReasonOtherDescription;

    /**
     * Getter for exemptReasonOtherDescription
     *
     * Other description for exempt reason
     */
    public String getExemptReasonOtherDescription() {
        return this.exemptReasonOtherDescription;
    }

    /**
     * Setter for exemptReasonOtherDescription
     *
     * Other description for exempt reason
     */
    public void setExemptReasonOtherDescription(String value) {
        this.exemptReasonOtherDescription = value;
    }


    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * Effective date for this exempt certificate
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * Effective date for this exempt certificate
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }


    private String regionsApplicable;

    /**
     * Getter for regionsApplicable
     *
     * A list of applicable regions for this exempt certificate.
    * 
    * To list more than one applicable region, separate the list of region codes with commas.
     */
    public String getRegionsApplicable() {
        return this.regionsApplicable;
    }

    /**
     * Setter for regionsApplicable
     *
     * A list of applicable regions for this exempt certificate.
    * 
    * To list more than one applicable region, separate the list of region codes with commas.
     */
    public void setRegionsApplicable(String value) {
        this.regionsApplicable = value;
    }


    private ExemptCertStatusId exemptCertStatusId;

    /**
     * Getter for exemptCertStatusId
     *
     * Status for this exempt certificate
     */
    public ExemptCertStatusId getExemptCertStatusId() {
        return this.exemptCertStatusId;
    }

    /**
     * Setter for exemptCertStatusId
     *
     * Status for this exempt certificate
     */
    public void setExemptCertStatusId(ExemptCertStatusId value) {
        this.exemptCertStatusId = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * Date when this exempt certificate was created
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * Date when this exempt certificate was created
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Date lastTransactionDate;

    /**
     * Getter for lastTransactionDate
     *
     * Date when last transaction with this exempt certificate happened
     */
    public Date getLastTransactionDate() {
        return this.lastTransactionDate;
    }

    /**
     * Setter for lastTransactionDate
     *
     * Date when last transaction with this exempt certificate happened
     */
    public void setLastTransactionDate(Date value) {
        this.lastTransactionDate = value;
    }


    private Date expiryDate;

    /**
     * Getter for expiryDate
     *
     * When this exempt certificate will expire
     */
    public Date getExpiryDate() {
        return this.expiryDate;
    }

    /**
     * Setter for expiryDate
     *
     * When this exempt certificate will expire
     */
    public void setExpiryDate(Date value) {
        this.expiryDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * User that creates the certificate
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * User that creates the certificate
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * Date when this exempt certificate was modified
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * Date when this exempt certificate was modified
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * Who modified this exempt certificate
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * Who modified this exempt certificate
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    private String countryIssued;

    /**
     * Getter for countryIssued
     *
     * Name or ISO 3166 code identifying the country that issued this ECMS certificate.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public String getCountryIssued() {
        return this.countryIssued;
    }

    /**
     * Setter for countryIssued
     *
     * Name or ISO 3166 code identifying the country that issued this ECMS certificate.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setCountryIssued(String value) {
        this.countryIssued = value;
    }


    private String avaCertId;

    /**
     * Getter for avaCertId
     *
     * Certificate ID for AvaTax?
     */
    public String getAvaCertId() {
        return this.avaCertId;
    }

    /**
     * Setter for avaCertId
     *
     * Certificate ID for AvaTax?
     */
    public void setAvaCertId(String value) {
        this.avaCertId = value;
    }


    private ExemptCertReviewStatusId exemptCertReviewStatusId;

    /**
     * Getter for exemptCertReviewStatusId
     *
     * Review status for this exempt certificate
     */
    public ExemptCertReviewStatusId getExemptCertReviewStatusId() {
        return this.exemptCertReviewStatusId;
    }

    /**
     * Setter for exemptCertReviewStatusId
     *
     * Review status for this exempt certificate
     */
    public void setExemptCertReviewStatusId(ExemptCertReviewStatusId value) {
        this.exemptCertReviewStatusId = value;
    }


    private ArrayList<EcmsDetailModel> details;

    /**
     * Getter for details
     *
     * Exempt Cert details
     */
    public ArrayList<EcmsDetailModel> getDetails() {
        return this.details;
    }

    /**
     * Setter for details
     *
     * Exempt Cert details
     */
    public void setDetails(ArrayList<EcmsDetailModel> value) {
        this.details = value;
    }


    /**
     * Returns a JSON string representation of EcmsModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
