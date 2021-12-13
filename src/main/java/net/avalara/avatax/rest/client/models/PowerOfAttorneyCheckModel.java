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
 * Response when checking if a company has a POA on file with Avalara
 */
public class PowerOfAttorneyCheckModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * companyId of the request
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * companyId of the request
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * Country POA is for
	 * 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Country POA is for
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String region;

    /**
     * Getter for region
     *
     * Region POA is for
	 * 
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Region POA is for
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private Boolean activePoa;

    /**
     * Getter for activePoa
     *
     * Notes if there is an actice POA
	 * 
     */
    public Boolean getActivePoa() {
        return this.activePoa;
    }

    /**
     * Setter for activePoa
     *
     * Notes if there is an actice POA
     */
    public void setActivePoa(Boolean value) {
        this.activePoa = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * Effective Date of the POA
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * Effective Date of the POA
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date expirationDate;

    /**
     * Getter for expirationDate
     *
     * End Date of POA
	 * 
     */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Setter for expirationDate
     *
     * End Date of POA
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    private ResourceFileDownloadResult availablePoa;

    /**
     * Getter for availablePoa
     *
     * 
	 * 
     */
    public ResourceFileDownloadResult getAvailablePoa() {
        return this.availablePoa;
    }

    /**
     * Setter for availablePoa
     *
     * 
     */
    public void setAvailablePoa(ResourceFileDownloadResult value) {
        this.availablePoa = value;
    }

    /**
     * Returns a JSON string representation of PowerOfAttorneyCheckModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
