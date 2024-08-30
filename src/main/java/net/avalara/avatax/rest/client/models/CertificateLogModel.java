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
 * The certificate log for a customer. This is exposed in the URL's `$includes`.
 */
public class CertificateLogModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this log entry.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this log entry.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Long certificateId;

    /**
     * Getter for certificateId
     *
     * The unique ID number of this certificate.
     */
    public Long getCertificateId() {
        return this.certificateId;
    }

    /**
     * Setter for certificateId
     *
     * The unique ID number of this certificate.
     */
    public void setCertificateId(Long value) {
        this.certificateId = value;
    }

    private String account;

    /**
     * Getter for account
     *
     * The name of this account.
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * Setter for account
     *
     * The name of this account.
     */
    public void setAccount(String value) {
        this.account = value;
    }

    private String entry;

    /**
     * Getter for entry
     *
     * The log entry description.
     */
    public String getEntry() {
        return this.entry;
    }

    /**
     * Setter for entry
     *
     * The log entry description.
     */
    public void setEntry(String value) {
        this.entry = value;
    }

    private Date created;

    /**
     * Getter for created
     *
     * The date/time when this certificate log was created.
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Setter for created
     *
     * The date/time when this certificate log was created.
     */
    public void setCreated(Date value) {
        this.created = value;
    }

    /**
     * Returns a JSON string representation of CertificateLogModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
