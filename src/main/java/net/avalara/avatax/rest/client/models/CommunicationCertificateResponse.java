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
 * Encloses communication certificate details
 */
public class CommunicationCertificateResponse {


    private Integer id;

    /**
     * Getter for id
     *
     * Certificate Id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Certificate Id
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * Certificate effective date
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * Certificate effective date
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date expirationDate;

    /**
     * Getter for expirationDate
     *
     * Certificate expiration date
     */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Setter for expirationDate
     *
     * Certificate expiration date
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    private String exemptionReason;

    /**
     * Getter for exemptionReason
     *
     * Certificate exemption reason
     */
    public String getExemptionReason() {
        return this.exemptionReason;
    }

    /**
     * Setter for exemptionReason
     *
     * Certificate exemption reason
     */
    public void setExemptionReason(String value) {
        this.exemptionReason = value;
    }

    private String exemptionRegion;

    /**
     * Getter for exemptionRegion
     *
     * Certificate exemption region
     */
    public String getExemptionRegion() {
        return this.exemptionRegion;
    }

    /**
     * Setter for exemptionRegion
     *
     * Certificate exemption region
     */
    public void setExemptionRegion(String value) {
        this.exemptionRegion = value;
    }

    private String taxNumber;

    /**
     * Getter for taxNumber
     *
     * Certificate tax number
     */
    public String getTaxNumber() {
        return this.taxNumber;
    }

    /**
     * Setter for taxNumber
     *
     * Certificate tax number
     */
    public void setTaxNumber(String value) {
        this.taxNumber = value;
    }

    private String certificateStatus;

    /**
     * Getter for certificateStatus
     *
     * Certificate status
     */
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    /**
     * Setter for certificateStatus
     *
     * Certificate status
     */
    public void setCertificateStatus(String value) {
        this.certificateStatus = value;
    }

    private ArrayList<CommunicationCustomerResponse> customers;

    /**
     * Getter for customers
     *
     * Customers which have this certificate
     */
    public ArrayList<CommunicationCustomerResponse> getCustomers() {
        return this.customers;
    }

    /**
     * Setter for customers
     *
     * Customers which have this certificate
     */
    public void setCustomers(ArrayList<CommunicationCustomerResponse> value) {
        this.customers = value;
    }

    private ArrayList<CommunicationTaxTypeResponse> exemptions;

    /**
     * Getter for exemptions
     *
     * Tax details of this certificate
     */
    public ArrayList<CommunicationTaxTypeResponse> getExemptions() {
        return this.exemptions;
    }

    /**
     * Setter for exemptions
     *
     * Tax details of this certificate
     */
    public void setExemptions(ArrayList<CommunicationTaxTypeResponse> value) {
        this.exemptions = value;
    }

    /**
     * Returns a JSON string representation of CommunicationCertificateResponse
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
