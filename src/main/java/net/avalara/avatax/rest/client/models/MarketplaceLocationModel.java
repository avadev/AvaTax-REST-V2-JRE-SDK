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
 * Marketplace Location Output model
 */
public class MarketplaceLocationModel {


    private String region;

    /**
     * Getter for region
     *
     * Marketplace Location State
	 * 
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Marketplace Location State
     */
    public void setRegion(String value) {
        this.region = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * Marketplace Location Country
	 * 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Marketplace Location Country
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private String marketplaceId;

    /**
     * Getter for marketplaceId
     *
     * Marketplace Location Id
	 * 
     */
    public String getMarketplaceId() {
        return this.marketplaceId;
    }

    /**
     * Setter for marketplaceId
     *
     * Marketplace Location Id
     */
    public void setMarketplaceId(String value) {
        this.marketplaceId = value;
    }

    private String marketplace;

    /**
     * Getter for marketplace
     *
     * Marketplace Location
	 * 
     */
    public String getMarketplace() {
        return this.marketplace;
    }

    /**
     * Setter for marketplace
     *
     * Marketplace Location
     */
    public void setMarketplace(String value) {
        this.marketplace = value;
    }

    private Date marketplaceAdoptionDate;

    /**
     * Getter for marketplaceAdoptionDate
     *
     * Marketplace Location Adoption Date
	 * 
     */
    public Date getMarketplaceAdoptionDate() {
        return this.marketplaceAdoptionDate;
    }

    /**
     * Setter for marketplaceAdoptionDate
     *
     * Marketplace Location Adoption Date
     */
    public void setMarketplaceAdoptionDate(Date value) {
        this.marketplaceAdoptionDate = value;
    }

    private Date marketplaceEndDate;

    /**
     * Getter for marketplaceEndDate
     *
     * Marketplace Location End Date
	 * 
     */
    public Date getMarketplaceEndDate() {
        return this.marketplaceEndDate;
    }

    /**
     * Setter for marketplaceEndDate
     *
     * Marketplace Location End Date
     */
    public void setMarketplaceEndDate(Date value) {
        this.marketplaceEndDate = value;
    }

    private Date legislativeEffectiveDate;

    /**
     * Getter for legislativeEffectiveDate
     *
     * Marketplace Location Legislative Effective Date
	 * 
     */
    public Date getLegislativeEffectiveDate() {
        return this.legislativeEffectiveDate;
    }

    /**
     * Setter for legislativeEffectiveDate
     *
     * Marketplace Location Legislative Effective Date
     */
    public void setLegislativeEffectiveDate(Date value) {
        this.legislativeEffectiveDate = value;
    }

    private Date enforcementDate;

    /**
     * Getter for enforcementDate
     *
     * Marketplace Location Enforcement Date
	 * 
     */
    public Date getEnforcementDate() {
        return this.enforcementDate;
    }

    /**
     * Setter for enforcementDate
     *
     * Marketplace Location Enforcement Date
     */
    public void setEnforcementDate(Date value) {
        this.enforcementDate = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * Marketplace Location Created Date
	 * 
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * Marketplace Location Created Date
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * Marketplace Location Modified Date
	 * 
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * Marketplace Location Modified Date
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    /**
     * Returns a JSON string representation of MarketplaceLocationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
