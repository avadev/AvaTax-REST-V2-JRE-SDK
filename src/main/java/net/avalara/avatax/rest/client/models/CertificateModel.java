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
 * A certificate is a document stored in either AvaTax Exemptions or CertCapture. The certificate document
* can contain information about a customer's eligibility for exemption from sales or use taxes based on
* criteria you specify when you store the certificate. To view or manage your certificates directly, please
* log onto the administrative website for the product you purchased.
 */
public class CertificateModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique ID number of this certificate.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique ID number of this certificate.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the AvaTax company that recorded this certificate.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the AvaTax company that recorded this certificate.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private Date signedDate;

    /**
     * Getter for signedDate
     *
     * The date when this certificate was signed.
     */
    public Date getSignedDate() {
        return this.signedDate;
    }

    /**
     * Setter for signedDate
     *
     * The date when this certificate was signed.
     */
    public void setSignedDate(Date value) {
        this.signedDate = value;
    }

    private Date expirationDate;

    /**
     * Getter for expirationDate
     *
     * Expiration date when this certificate will no longer be valid.
     */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Setter for expirationDate
     *
     * Expiration date when this certificate will no longer be valid.
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    private String filename;

    /**
     * Getter for filename
     *
     * File name for the image of this certificate.
    *  
    * When creating a certificate, if you do not upload a PDF or JPG image, you must specify the filename
    * of the certificate as it is tracked in your repository.
    *  
    * To create a certificate, you must provide one of the following fields: either a `filename`, a `pdf` file,
    * or an array of JPG `pages`. The API will return an error if you omit these fields or if you attempt to
    * put values in more than one of them.
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Setter for filename
     *
     * File name for the image of this certificate.
    *  
    * When creating a certificate, if you do not upload a PDF or JPG image, you must specify the filename
    * of the certificate as it is tracked in your repository.
    *  
    * To create a certificate, you must provide one of the following fields: either a `filename`, a `pdf` file,
    * or an array of JPG `pages`. The API will return an error if you omit these fields or if you attempt to
    * put values in more than one of them.
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    private Boolean documentExists;

    /**
     * Getter for documentExists
     *
     * This value is true if there exists scanned PDF copy of this certificate or the PDF version of the form that the customer filled via the CertCapture wizard on S3 bucket.
     */
    public Boolean getDocumentExists() {
        return this.documentExists;
    }

    /**
     * Setter for documentExists
     *
     * This value is true if there exists scanned PDF copy of this certificate or the PDF version of the form that the customer filled via the CertCapture wizard on S3 bucket.
     */
    public void setDocumentExists(Boolean value) {
        this.documentExists = value;
    }

    private Boolean valid;

    /**
     * Getter for valid
     *
     * True if this certificate is marked as valid. A valid certificate can be considered for exemption purposes.
    * When a certificate is marked invalid, it will no longer be considered when calculating exemption for
    * a customer.
     */
    public Boolean getValid() {
        return this.valid;
    }

    /**
     * Setter for valid
     *
     * True if this certificate is marked as valid. A valid certificate can be considered for exemption purposes.
    * When a certificate is marked invalid, it will no longer be considered when calculating exemption for
    * a customer.
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

    private Boolean verified;

    /**
     * Getter for verified
     *
     * This value is true if the certificate has gone through the certificate validation process.
    * For more information on the certificate validation process, please see the Avalara Help Center.
     */
    public Boolean getVerified() {
        return this.verified;
    }

    /**
     * Setter for verified
     *
     * This value is true if the certificate has gone through the certificate validation process.
    * For more information on the certificate validation process, please see the Avalara Help Center.
     */
    public void setVerified(Boolean value) {
        this.verified = value;
    }

    private BigDecimal exemptPercentage;

    /**
     * Getter for exemptPercentage
     *
     * If this certificate provides exemption from transactional taxes, what percentage of the transaction
    * is considered exempt?
    *  
    * For a fully exempt certificate, this percentage should be 100.
     */
    public BigDecimal getExemptPercentage() {
        return this.exemptPercentage;
    }

    /**
     * Setter for exemptPercentage
     *
     * If this certificate provides exemption from transactional taxes, what percentage of the transaction
    * is considered exempt?
    *  
    * For a fully exempt certificate, this percentage should be 100.
     */
    public void setExemptPercentage(BigDecimal value) {
        this.exemptPercentage = value;
    }

    private Boolean isSingleCertificate;

    /**
     * Getter for isSingleCertificate
     *
     * This value is true if this certificate is a single (or standalone) certificate. This value is set
    * during the audit stage of the certificate validation process.
     */
    public Boolean getIsSingleCertificate() {
        return this.isSingleCertificate;
    }

    /**
     * Setter for isSingleCertificate
     *
     * This value is true if this certificate is a single (or standalone) certificate. This value is set
    * during the audit stage of the certificate validation process.
     */
    public void setIsSingleCertificate(Boolean value) {
        this.isSingleCertificate = value;
    }

    private String exemptionNumber;

    /**
     * Getter for exemptionNumber
     *
     * Indicates the tax number passed in for the certificate.
     */
    public String getExemptionNumber() {
        return this.exemptionNumber;
    }

    /**
     * Setter for exemptionNumber
     *
     * Indicates the tax number passed in for the certificate.
     */
    public void setExemptionNumber(String value) {
        this.exemptionNumber = value;
    }

    private ExemptionReasonModel validatedExemptionReason;

    /**
     * Getter for validatedExemptionReason
     *
     * The exemption reason that CertCapture audit/internal logic identifies for created certificate.
     */
    public ExemptionReasonModel getValidatedExemptionReason() {
        return this.validatedExemptionReason;
    }

    /**
     * Setter for validatedExemptionReason
     *
     * The exemption reason that CertCapture audit/internal logic identifies for created certificate.
     */
    public void setValidatedExemptionReason(ExemptionReasonModel value) {
        this.validatedExemptionReason = value;
    }

    private ExemptionReasonModel exemptionReason;

    /**
     * Getter for exemptionReason
     *
     * The exemption reason associated with this certificate. For example, the reason code for exemption
    * for purposes of resale is `RESALE`.
    *  
    * For a list of exemption reasons, call `ListCertificateExemptReasons`.
     */
    public ExemptionReasonModel getExemptionReason() {
        return this.exemptionReason;
    }

    /**
     * Setter for exemptionReason
     *
     * The exemption reason associated with this certificate. For example, the reason code for exemption
    * for purposes of resale is `RESALE`.
    *  
    * For a list of exemption reasons, call `ListCertificateExemptReasons`.
     */
    public void setExemptionReason(ExemptionReasonModel value) {
        this.exemptionReason = value;
    }

    private String status;

    /**
     * Getter for status
     *
     * The status of the certificate
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of the certificate
     */
    public void setStatus(String value) {
        this.status = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date/time when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date/time when this record was created.
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

    private String taxNumberType;

    /**
     * Getter for taxNumberType
     *
     * The tax number type for the certificate. For example, `FEIN`, `Social Security Number`, or `Employer Identification Number`.
     */
    public String getTaxNumberType() {
        return this.taxNumberType;
    }

    /**
     * Setter for taxNumberType
     *
     * The tax number type for the certificate. For example, `FEIN`, `Social Security Number`, or `Employer Identification Number`.
     */
    public void setTaxNumberType(String value) {
        this.taxNumberType = value;
    }

    private String businessNumberType;

    /**
     * Getter for businessNumberType
     *
     * Description of business for the certificate. For example, `Retail trade`, `Professional services`, or `Construction`.
     */
    public String getBusinessNumberType() {
        return this.businessNumberType;
    }

    /**
     * Setter for businessNumberType
     *
     * Description of business for the certificate. For example, `Retail trade`, `Professional services`, or `Construction`.
     */
    public void setBusinessNumberType(String value) {
        this.businessNumberType = value;
    }

    private Integer pageCount;

    /**
     * Getter for pageCount
     *
     * Number of pages contained within this certificate.
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * Setter for pageCount
     *
     * Number of pages contained within this certificate.
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    private ArrayList<CustomerModel> customers;

    /**
     * Getter for customers
     *
     * A list of customers to which this certificate applies. You can fetch this data by specifying
    * `$include=customers` when calling a certificate fetch API.
     */
    public ArrayList<CustomerModel> getCustomers() {
        return this.customers;
    }

    /**
     * Setter for customers
     *
     * A list of customers to which this certificate applies. You can fetch this data by specifying
    * `$include=customers` when calling a certificate fetch API.
     */
    public void setCustomers(ArrayList<CustomerModel> value) {
        this.customers = value;
    }

    private ArrayList<PoNumberModel> poNumbers;

    /**
     * Getter for poNumbers
     *
     * A list of purchase order numbers that are valid for use with this certificate.
    *  
    * If this certificate is applicable for all purchase order numbers, this field will be empty.
    *  
    * You can fetch this data by specifying `$include=po_numbers` when calling a certificate fetch API.
     */
    public ArrayList<PoNumberModel> getPoNumbers() {
        return this.poNumbers;
    }

    /**
     * Setter for poNumbers
     *
     * A list of purchase order numbers that are valid for use with this certificate.
    *  
    * If this certificate is applicable for all purchase order numbers, this field will be empty.
    *  
    * You can fetch this data by specifying `$include=po_numbers` when calling a certificate fetch API.
     */
    public void setPoNumbers(ArrayList<PoNumberModel> value) {
        this.poNumbers = value;
    }

    private ExposureZoneModel exposureZone;

    /**
     * Getter for exposureZone
     *
     * The exposure zone where this certificate is valid.
     */
    public ExposureZoneModel getExposureZone() {
        return this.exposureZone;
    }

    /**
     * Setter for exposureZone
     *
     * The exposure zone where this certificate is valid.
     */
    public void setExposureZone(ExposureZoneModel value) {
        this.exposureZone = value;
    }

    private ArrayList<CertificateAttributeModel> attributes;

    /**
     * Getter for attributes
     *
     * A list of certificate attributes that apply to this certificate.
    *  
    * You can fetch this data by specifying `$include=attributes` when calling a certificate fetch API.
     */
    public ArrayList<CertificateAttributeModel> getAttributes() {
        return this.attributes;
    }

    /**
     * Setter for attributes
     *
     * A list of certificate attributes that apply to this certificate.
    *  
    * You can fetch this data by specifying `$include=attributes` when calling a certificate fetch API.
     */
    public void setAttributes(ArrayList<CertificateAttributeModel> value) {
        this.attributes = value;
    }

    private Integer ecmsId;

    /**
     * Getter for ecmsId
     *
     * The unique ID number of current AvaTax Exemption Certificate that refers this certificate.
     */
    public Integer getEcmsId() {
        return this.ecmsId;
    }

    /**
     * Setter for ecmsId
     *
     * The unique ID number of current AvaTax Exemption Certificate that refers this certificate.
     */
    public void setEcmsId(Integer value) {
        this.ecmsId = value;
    }

    private String ecmsStatus;

    /**
     * Getter for ecmsStatus
     *
     * The status of current AvaTax Exemption Certificate that refers to this certificate.
     */
    public String getEcmsStatus() {
        return this.ecmsStatus;
    }

    /**
     * Setter for ecmsStatus
     *
     * The status of current AvaTax Exemption Certificate that refers to this certificate.
     */
    public void setEcmsStatus(String value) {
        this.ecmsStatus = value;
    }

    private String pdf;

    /**
     * Getter for pdf
     *
     * This field is available for input only. To retrieve the image after creation, use the
    * `DownloadCertificateImage` API.
    *  
    * When creating a certificate, you may optionally provide a PDF image in Base64 URLEncoded format.
    * PDFs are automatically parsed into individual page JPG images and can be retrieved back
    * later as either the original PDF or the individual pages.
    *  
    * To create a certificate, you must provide one of the following fields: either a `filename`, a `pdf` file,
    * or an array of JPG `pages`. The API will return an error if you omit these fields or if you attempt to
    * put values in more than one of them.
     */
    public String getPdf() {
        return this.pdf;
    }

    /**
     * Setter for pdf
     *
     * This field is available for input only. To retrieve the image after creation, use the
    * `DownloadCertificateImage` API.
    *  
    * When creating a certificate, you may optionally provide a PDF image in Base64 URLEncoded format.
    * PDFs are automatically parsed into individual page JPG images and can be retrieved back
    * later as either the original PDF or the individual pages.
    *  
    * To create a certificate, you must provide one of the following fields: either a `filename`, a `pdf` file,
    * or an array of JPG `pages`. The API will return an error if you omit these fields or if you attempt to
    * put values in more than one of them.
     */
    public void setPdf(String value) {
        this.pdf = value;
    }

    private ArrayList<String> pages;

    /**
     * Getter for pages
     *
     * This field is available for input only. To retrieve the image after creation, use the
    * `DownloadCertificateImage` API.
    *  
    * When creating a certificate, you may optionally provide a list of JPG images, one per page, in
    * Base64 URLEncoded format. These JPG images are automatically combined into a single downloadable
    * PDF and can be retrieved back later as either the original JPG images or the combined PDF.
    *  
    * To create a certificate, you must provide one of the following fields: either a `filename`, a `pdf` file,
    * or an array of JPG `pages`. The API will return an error if you omit these fields or if you attempt to
    * put values in more than one of them.
     */
    public ArrayList<String> getPages() {
        return this.pages;
    }

    /**
     * Setter for pages
     *
     * This field is available for input only. To retrieve the image after creation, use the
    * `DownloadCertificateImage` API.
    *  
    * When creating a certificate, you may optionally provide a list of JPG images, one per page, in
    * Base64 URLEncoded format. These JPG images are automatically combined into a single downloadable
    * PDF and can be retrieved back later as either the original JPG images or the combined PDF.
    *  
    * To create a certificate, you must provide one of the following fields: either a `filename`, a `pdf` file,
    * or an array of JPG `pages`. The API will return an error if you omit these fields or if you attempt to
    * put values in more than one of them.
     */
    public void setPages(ArrayList<String> value) {
        this.pages = value;
    }

    /**
     * Returns a JSON string representation of CertificateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
