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
 * Information about a tax authority relevant for an address.
 */
public class TaxAuthorityInfo {


    private String avalaraId;

    /**
     * Getter for avalaraId
     *
     * A unique ID number assigned by Avalara to this tax authority.
     */
    public String getAvalaraId() {
        return this.avalaraId;
    }

    /**
     * Setter for avalaraId
     *
     * A unique ID number assigned by Avalara to this tax authority.
     */
    public void setAvalaraId(String value) {
        this.avalaraId = value;
    }


    private String jurisdictionName;

    /**
     * Getter for jurisdictionName
     *
     * The friendly jurisdiction name for this tax authority.
     */
    public String getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName
     *
     * The friendly jurisdiction name for this tax authority.
     */
    public void setJurisdictionName(String value) {
        this.jurisdictionName = value;
    }


    private JurisdictionType jurisdictionType;

    /**
     * Getter for jurisdictionType
     *
     * The type of jurisdiction referenced by this tax authority.
     */
    public JurisdictionType getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType
     *
     * The type of jurisdiction referenced by this tax authority.
     */
    public void setJurisdictionType(JurisdictionType value) {
        this.jurisdictionType = value;
    }


    private String signatureCode;

    /**
     * Getter for signatureCode
     *
     * An Avalara-assigned signature code for this tax authority.
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode
     *
     * An Avalara-assigned signature code for this tax authority.
     */
    public void setSignatureCode(String value) {
        this.signatureCode = value;
    }


    /**
     * Returns a JSON string representation of TaxAuthorityInfo
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
