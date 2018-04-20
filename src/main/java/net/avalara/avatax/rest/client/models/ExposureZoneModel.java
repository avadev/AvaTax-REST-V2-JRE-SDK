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
 * Information about a physical area or zone in which a certificate can apply.
* An exposure zone for an exemption certificate will generally be a tax authority such
* as a state, country, or local government entity.
 */
public class ExposureZoneModel {


    private Integer id;

    /**
     * Getter for id
     *
     * A unique ID number representing this exposure zone.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number representing this exposure zone.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the AvaTax company that recorded this customer.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the AvaTax company that recorded this customer.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * The short name of this exposure zone, suitable for use in a drop-down list.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The short name of this exposure zone, suitable for use in a drop-down list.
     */
    public void setName(String value) {
        this.name = value;
    }


    private String tag;

    /**
     * Getter for tag
     *
     * A tag indicating
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Setter for tag
     *
     * A tag indicating
     */
    public void setTag(String value) {
        this.tag = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A more complete description of this exposure zone, suitable for use as a tooltip or help text.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A more complete description of this exposure zone, suitable for use as a tooltip or help text.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private Date created;

    /**
     * Getter for created
     *
     * The date when this record was created.
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Setter for created
     *
     * The date when this record was created.
     */
    public void setCreated(Date value) {
        this.created = value;
    }


    private Date modified;

    /**
     * Getter for modified
     *
     * The date/time when this record was last modified.
     */
    public Date getModified() {
        return this.modified;
    }

    /**
     * Setter for modified
     *
     * The date/time when this record was last modified.
     */
    public void setModified(Date value) {
        this.modified = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * Two or three character ISO 3166 region, province, or state name of this exposure zone.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Two or three character ISO 3166 region, province, or state name of this exposure zone.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * Two character ISO 3166 county code for the country component of this exposure zone.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Two character ISO 3166 county code for the country component of this exposure zone.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    /**
     * Returns a JSON string representation of ExposureZoneModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
