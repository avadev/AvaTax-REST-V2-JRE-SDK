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
 * certificate log for a customer. Exposed in url $includes
 */
public class CertificateLogModel {


    private Long id;

    /**
     * Getter for id
     *
     * Log ID
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Log ID
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Long certificateId;

    /**
     * Getter for certificateId
     *
     * Certificate ID
     */
    public Long getCertificateId() {
        return this.certificateId;
    }

    /**
     * Setter for certificateId
     *
     * Certificate ID
     */
    public void setCertificateId(Long value) {
        this.certificateId = value;
    }

    private String account;

    /**
     * Getter for account
     *
     * Account name
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * Setter for account
     *
     * Account name
     */
    public void setAccount(String value) {
        this.account = value;
    }

    private String entry;

    /**
     * Getter for entry
     *
     * Log description
     */
    public String getEntry() {
        return this.entry;
    }

    /**
     * Setter for entry
     *
     * Log description
     */
    public void setEntry(String value) {
        this.entry = value;
    }

    private Date created;

    /**
     * Getter for created
     *
     * Date of creation for log entry
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Setter for created
     *
     * Date of creation for log entry
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
