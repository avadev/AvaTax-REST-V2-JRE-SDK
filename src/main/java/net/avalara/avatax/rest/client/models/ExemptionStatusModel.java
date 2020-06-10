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
 * Indicates the customer's exemption status in a specific country and region.
 */
public class ExemptionStatusModel {


    private String status;

    /**
     * Getter for status
     *
     * The exemption status of this customer in this country/region.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The exemption status of this customer in this country/region.
     */
    public void setStatus(String value) {
        this.status = value;
    }


    private CertificateModel certificate;

    /**
     * Getter for certificate
     *
     * Certificate if the customer is exempted
     */
    public CertificateModel getCertificate() {
        return this.certificate;
    }

    /**
     * Setter for certificate
     *
     * Certificate if the customer is exempted
     */
    public void setCertificate(CertificateModel value) {
        this.certificate = value;
    }


    /**
     * Returns a JSON string representation of ExemptionStatusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
