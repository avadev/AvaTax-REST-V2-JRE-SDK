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
 * Certificate with exemption reason and exposure zone. This is exposed in the URL's `$includes`.
 */
public class ActiveCertificateModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this certificate.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this certificate.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Date created;

    /**
     * Getter for created
     *
     * The date/time when this certificate was created.
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Setter for created
     *
     * The date/time when this certificate was created.
     */
    public void setCreated(Date value) {
        this.created = value;
    }

    private Date modified;

    /**
     * Getter for modified
     *
     * The date/time when this certificate was last modified.
     */
    public Date getModified() {
        return this.modified;
    }

    /**
     * Setter for modified
     *
     * The date/time when this certificate was last modified.
     */
    public void setModified(Date value) {
        this.modified = value;
    }

    private String expectedTaxNumber;

    /**
     * Getter for expectedTaxNumber
     *
     * The expected tax number for this certificate.
     */
    public String getExpectedTaxNumber() {
        return this.expectedTaxNumber;
    }

    /**
     * Setter for expectedTaxNumber
     *
     * The expected tax number for this certificate.
     */
    public void setExpectedTaxNumber(String value) {
        this.expectedTaxNumber = value;
    }

    private String actualTaxNumber;

    /**
     * Getter for actualTaxNumber
     *
     * The actual tax number for this certificate.
     */
    public String getActualTaxNumber() {
        return this.actualTaxNumber;
    }

    /**
     * Setter for actualTaxNumber
     *
     * The actual tax number for this certificate.
     */
    public void setActualTaxNumber(String value) {
        this.actualTaxNumber = value;
    }

    private ExposureZoneModel exposureZone;

    /**
     * Getter for exposureZone
     *
     * 
     */
    public ExposureZoneModel getExposureZone() {
        return this.exposureZone;
    }

    /**
     * Setter for exposureZone
     *
     * 
     */
    public void setExposureZone(ExposureZoneModel value) {
        this.exposureZone = value;
    }

    private ExemptionReasonModel expectedTaxCode;

    /**
     * Getter for expectedTaxCode
     *
     * 
     */
    public ExemptionReasonModel getExpectedTaxCode() {
        return this.expectedTaxCode;
    }

    /**
     * Setter for expectedTaxCode
     *
     * 
     */
    public void setExpectedTaxCode(ExemptionReasonModel value) {
        this.expectedTaxCode = value;
    }

    private ExemptionReasonModel actualTaxCode;

    /**
     * Getter for actualTaxCode
     *
     * 
     */
    public ExemptionReasonModel getActualTaxCode() {
        return this.actualTaxCode;
    }

    /**
     * Setter for actualTaxCode
     *
     * 
     */
    public void setActualTaxCode(ExemptionReasonModel value) {
        this.actualTaxCode = value;
    }

    private CertificateModel certificate;

    /**
     * Getter for certificate
     *
     * 
     */
    public CertificateModel getCertificate() {
        return this.certificate;
    }

    /**
     * Setter for certificate
     *
     * 
     */
    public void setCertificate(CertificateModel value) {
        this.certificate = value;
    }

    /**
     * Returns a JSON string representation of ActiveCertificateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
