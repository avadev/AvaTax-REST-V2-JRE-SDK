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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Certificate model in CertCapture
 */
public class CertificateModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Cerificate ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Cerificate ID
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


    private Date signedDate;

    /**
     * Getter for signedDate
     *
     * When the certifcate was signed
     */
    public Date getSignedDate() {
        return this.signedDate;
    }

    /**
     * Setter for signedDate
     *
     * When the certifcate was signed
     */
    public void setSignedDate(Date value) {
        this.signedDate = value;
    }


    private Date expirationDate;

    /**
     * Getter for expirationDate
     *
     * When the certificate will be/was expired
     */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Setter for expirationDate
     *
     * When the certificate will be/was expired
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }


    private String filename;

    /**
     * Getter for filename
     *
     * File name for the certificate
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Setter for filename
     *
     * File name for the certificate
     */
    public void setFilename(String value) {
        this.filename = value;
    }


    private Boolean valid;

    /**
     * Getter for valid
     *
     * Is the certificate valid?
     */
    public Boolean getValid() {
        return this.valid;
    }

    /**
     * Setter for valid
     *
     * Is the certificate valid?
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }


    private Boolean verified;

    /**
     * Getter for verified
     *
     * Is the certificate verified?
     */
    public Boolean getVerified() {
        return this.verified;
    }

    /**
     * Setter for verified
     *
     * Is the certificate verified?
     */
    public void setVerified(Boolean value) {
        this.verified = value;
    }


    private Boolean neverRenew;

    /**
     * Getter for neverRenew
     *
     * The certificate is never renewed
     */
    public Boolean getNeverRenew() {
        return this.neverRenew;
    }

    /**
     * Setter for neverRenew
     *
     * The certificate is never renewed
     */
    public void setNeverRenew(Boolean value) {
        this.neverRenew = value;
    }


    private Boolean renewable;

    /**
     * Getter for renewable
     *
     * Is this certificate renewable?
     */
    public Boolean getRenewable() {
        return this.renewable;
    }

    /**
     * Setter for renewable
     *
     * Is this certificate renewable?
     */
    public void setRenewable(Boolean value) {
        this.renewable = value;
    }


    private Boolean unusedMultiCert;

    /**
     * Getter for unusedMultiCert
     *
     * TODO
     */
    public Boolean getUnusedMultiCert() {
        return this.unusedMultiCert;
    }

    /**
     * Setter for unusedMultiCert
     *
     * TODO
     */
    public void setUnusedMultiCert(Boolean value) {
        this.unusedMultiCert = value;
    }


    private BigDecimal exemptPercentage;

    /**
     * Getter for exemptPercentage
     *
     * What is the exempt percentage from this certificate
     */
    public BigDecimal getExemptPercentage() {
        return this.exemptPercentage;
    }

    /**
     * Setter for exemptPercentage
     *
     * What is the exempt percentage from this certificate
     */
    public void setExemptPercentage(BigDecimal value) {
        this.exemptPercentage = value;
    }


    private Integer verificationNumber;

    /**
     * Getter for verificationNumber
     *
     * TODO
     */
    public Integer getVerificationNumber() {
        return this.verificationNumber;
    }

    /**
     * Setter for verificationNumber
     *
     * TODO
     */
    public void setVerificationNumber(Integer value) {
        this.verificationNumber = value;
    }


    private Integer taxNumber;

    /**
     * Getter for taxNumber
     *
     * TODO
     */
    public Integer getTaxNumber() {
        return this.taxNumber;
    }

    /**
     * Setter for taxNumber
     *
     * TODO
     */
    public void setTaxNumber(Integer value) {
        this.taxNumber = value;
    }


    private Boolean barcodeRead;

    /**
     * Getter for barcodeRead
     *
     * TODO
     */
    public Boolean getBarcodeRead() {
        return this.barcodeRead;
    }

    /**
     * Setter for barcodeRead
     *
     * TODO
     */
    public void setBarcodeRead(Boolean value) {
        this.barcodeRead = value;
    }


    private Boolean isSingle;

    /**
     * Getter for isSingle
     *
     * TODO
     */
    public Boolean getIsSingle() {
        return this.isSingle;
    }

    /**
     * Setter for isSingle
     *
     * TODO
     */
    public void setIsSingle(Boolean value) {
        this.isSingle = value;
    }


    private Integer legacyCertificateId;

    /**
     * Getter for legacyCertificateId
     *
     * TODO
     */
    public Integer getLegacyCertificateId() {
        return this.legacyCertificateId;
    }

    /**
     * Setter for legacyCertificateId
     *
     * TODO
     */
    public void setLegacyCertificateId(Integer value) {
        this.legacyCertificateId = value;
    }


    private Integer calcId;

    /**
     * Getter for calcId
     *
     * TODO
     */
    public Integer getCalcId() {
        return this.calcId;
    }

    /**
     * Setter for calcId
     *
     * TODO
     */
    public void setCalcId(Integer value) {
        this.calcId = value;
    }


    private CertificateTaxCodeModel expectedTaxCode;

    /**
     * Getter for expectedTaxCode
     *
     * TODO
     */
    public CertificateTaxCodeModel getExpectedTaxCode() {
        return this.expectedTaxCode;
    }

    /**
     * Setter for expectedTaxCode
     *
     * TODO
     */
    public void setExpectedTaxCode(CertificateTaxCodeModel value) {
        this.expectedTaxCode = value;
    }


    private CertificateTaxCodeModel actualTaxCode;

    /**
     * Getter for actualTaxCode
     *
     * TODO
     */
    public CertificateTaxCodeModel getActualTaxCode() {
        return this.actualTaxCode;
    }

    /**
     * Setter for actualTaxCode
     *
     * TODO
     */
    public void setActualTaxCode(CertificateTaxCodeModel value) {
        this.actualTaxCode = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * TODO
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * TODO
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * TODO
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * TODO
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private ExposureZoneModel exposureZone;

    /**
     * Getter for exposureZone
     *
     * TODO
     */
    public ExposureZoneModel getExposureZone() {
        return this.exposureZone;
    }

    /**
     * Setter for exposureZone
     *
     * TODO
     */
    public void setExposureZone(ExposureZoneModel value) {
        this.exposureZone = value;
    }


    private Integer replacement;

    /**
     * Getter for replacement
     *
     * TODO
     */
    public Integer getReplacement() {
        return this.replacement;
    }

    /**
     * Setter for replacement
     *
     * TODO
     */
    public void setReplacement(Integer value) {
        this.replacement = value;
    }


    private String certificateNumber;

    /**
     * Getter for certificateNumber
     *
     * TODO
     */
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    /**
     * Setter for certificateNumber
     *
     * TODO
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }


    private Boolean jsSingle;

    /**
     * Getter for jsSingle
     *
     * TODO
     */
    public Boolean getJsSingle() {
        return this.jsSingle;
    }

    /**
     * Setter for jsSingle
     *
     * TODO
     */
    public void setJsSingle(Boolean value) {
        this.jsSingle = value;
    }


    private String taxNumberType;

    /**
     * Getter for taxNumberType
     *
     * TODO
     */
    public String getTaxNumberType() {
        return this.taxNumberType;
    }

    /**
     * Setter for taxNumberType
     *
     * TODO
     */
    public void setTaxNumberType(String value) {
        this.taxNumberType = value;
    }


    private Integer businessNumber;

    /**
     * Getter for businessNumber
     *
     * TODO
     */
    public Integer getBusinessNumber() {
        return this.businessNumber;
    }

    /**
     * Setter for businessNumber
     *
     * TODO
     */
    public void setBusinessNumber(Integer value) {
        this.businessNumber = value;
    }


    private String businessNumberType;

    /**
     * Getter for businessNumberType
     *
     * TODO
     */
    public String getBusinessNumberType() {
        return this.businessNumberType;
    }

    /**
     * Setter for businessNumberType
     *
     * TODO
     */
    public void setBusinessNumberType(String value) {
        this.businessNumberType = value;
    }


    private String exemptReasonDescription;

    /**
     * Getter for exemptReasonDescription
     *
     * TODO
     */
    public String getExemptReasonDescription() {
        return this.exemptReasonDescription;
    }

    /**
     * Setter for exemptReasonDescription
     *
     * TODO
     */
    public void setExemptReasonDescription(String value) {
        this.exemptReasonDescription = value;
    }


    private String sstMetadata;

    /**
     * Getter for sstMetadata
     *
     * TODO
     */
    public String getSstMetadata() {
        return this.sstMetadata;
    }

    /**
     * Setter for sstMetadata
     *
     * TODO
     */
    public void setSstMetadata(String value) {
        this.sstMetadata = value;
    }


    private Integer pageCount;

    /**
     * Getter for pageCount
     *
     * TODO
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * Setter for pageCount
     *
     * TODO
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }


    private Integer communicationId;

    /**
     * Getter for communicationId
     *
     * TODO
     */
    public Integer getCommunicationId() {
        return this.communicationId;
    }

    /**
     * Setter for communicationId
     *
     * TODO
     */
    public void setCommunicationId(Integer value) {
        this.communicationId = value;
    }


    private Integer locationId;

    /**
     * Getter for locationId
     *
     * TODO
     */
    public Integer getLocationId() {
        return this.locationId;
    }

    /**
     * Setter for locationId
     *
     * TODO
     */
    public void setLocationId(Integer value) {
        this.locationId = value;
    }


    private Integer documentTypeId;

    /**
     * Getter for documentTypeId
     *
     * TODO
     */
    public Integer getDocumentTypeId() {
        return this.documentTypeId;
    }

    /**
     * Setter for documentTypeId
     *
     * TODO
     */
    public void setDocumentTypeId(Integer value) {
        this.documentTypeId = value;
    }


    private ArrayList<CustomerModel> customers;

    /**
     * Getter for customers
     *
     * A list of customers to which this certificate applies.
     */
    public ArrayList<CustomerModel> getCustomers() {
        return this.customers;
    }

    /**
     * Setter for customers
     *
     * A list of customers to which this certificate applies.
     */
    public void setCustomers(ArrayList<CustomerModel> value) {
        this.customers = value;
    }


    private ArrayList<PoNumberModel> poNumber;

    /**
     * Getter for poNumber
     *
     * TODO
     */
    public ArrayList<PoNumberModel> getPoNumber() {
        return this.poNumber;
    }

    /**
     * Setter for poNumber
     *
     * TODO
     */
    public void setPoNumber(ArrayList<PoNumberModel> value) {
        this.poNumber = value;
    }


    /**
     * Returns a JSON string representation of CertificateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
