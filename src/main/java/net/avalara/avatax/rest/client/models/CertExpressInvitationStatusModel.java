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
 * Represent what is the current status of certificate request
 */
public class CertExpressInvitationStatusModel {


    private CertExpressInvitationStatus status;

    /**
     * Getter for status
     *
     * The status of the CertExpress invitation for this customer. If this status says
	 * 
     */
    public CertExpressInvitationStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of the CertExpress invitation for this customer. If this status says
     */
    public void setStatus(CertExpressInvitationStatus value) {
        this.status = value;
    }

    private CertExpressInvitationModel invitation;

    /**
     * Getter for invitation
     *
     * 
	 * 
     */
    public CertExpressInvitationModel getInvitation() {
        return this.invitation;
    }

    /**
     * Setter for invitation
     *
     * 
     */
    public void setInvitation(CertExpressInvitationModel value) {
        this.invitation = value;
    }

    /**
     * Returns a JSON string representation of CertExpressInvitationStatusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
