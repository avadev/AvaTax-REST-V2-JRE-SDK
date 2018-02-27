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
 * Contains information about a company's exemption certificate status.
* 
* This model can be used to determine if your company is able to use the Customers, Certificates, and
* CertExpressInvites APIs within AvaTax.
 */
public class ProvisionStatusModel {


    private CertCaptureProvisionStatus status;

    /**
     * Getter for status
     *
     * The status of exemption certificate setup for this company.
    * 
    * If this value is `Finished`, this company will then be able to use the Customers, Certificates, and
    * CertExpressInvites APIs within AvaTax.
     */
    public CertCaptureProvisionStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of exemption certificate setup for this company.
    * 
    * If this value is `Finished`, this company will then be able to use the Customers, Certificates, and
    * CertExpressInvites APIs within AvaTax.
     */
    public void setStatus(CertCaptureProvisionStatus value) {
        this.status = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The accountId of the company represented by this status
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The accountId of the company represented by this status
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    /**
     * Returns a JSON string representation of ProvisionStatusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
