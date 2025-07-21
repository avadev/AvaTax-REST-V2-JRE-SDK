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
 * Represents a physical location used in exemption certificate management.
 */
public class ClerkLocationModel {


    private Integer id;

    /**
     * Getter for id
     *
     * Unique identifier for the location.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique identifier for the location.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Display name of the location.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Display name of the location.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String code;

    /**
     * Getter for code
     *
     * Code used to reference this location.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Code used to reference this location.
     */
    public void setCode(String value) {
        this.code = value;
    }

    private String addressLine1;

    /**
     * Getter for addressLine1
     *
     * Primary street address of the location.
     */
    public String getAddressLine1() {
        return this.addressLine1;
    }

    /**
     * Setter for addressLine1
     *
     * Primary street address of the location.
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    private String addressLine2;

    /**
     * Getter for addressLine2
     *
     * Additional address details (e.g., suite, building).
     */
    public String getAddressLine2() {
        return this.addressLine2;
    }

    /**
     * Setter for addressLine2
     *
     * Additional address details (e.g., suite, building).
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    private String city;

    /**
     * Getter for city
     *
     * City in which the location is situated.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for city
     *
     * City in which the location is situated.
     */
    public void setCity(String value) {
        this.city = value;
    }

    private String zip;

    /**
     * Getter for zip
     *
     * Postal or ZIP code of the location.
     */
    public String getZip() {
        return this.zip;
    }

    /**
     * Setter for zip
     *
     * Postal or ZIP code of the location.
     */
    public void setZip(String value) {
        this.zip = value;
    }

    private Integer stateId;

    /**
     * Getter for stateId
     *
     * A unique ID number that represents this state, region, or province.
     */
    public Integer getStateId() {
        return this.stateId;
    }

    /**
     * Setter for stateId
     *
     * A unique ID number that represents this state, region, or province.
     */
    public void setStateId(Integer value) {
        this.stateId = value;
    }

    private String stateName;

    /**
     * Getter for stateName
     *
     * The state, region, or province name as known in US English.
     */
    public String getStateName() {
        return this.stateName;
    }

    /**
     * Setter for stateName
     *
     * The state, region, or province name as known in US English.
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    private String stateInitials;

    /**
     * Getter for stateInitials
     *
     * The abbreviated two or three character ISO 3166 state, province, or region code.
     */
    public String getStateInitials() {
        return this.stateInitials;
    }

    /**
     * Setter for stateInitials
     *
     * The abbreviated two or three character ISO 3166 state, province, or region code.
     */
    public void setStateInitials(String value) {
        this.stateInitials = value;
    }

    private Integer countryId;

    /**
     * Getter for countryId
     *
     * The unique ID number of this country as defined in Avalara's certificate management system.
     */
    public Integer getCountryId() {
        return this.countryId;
    }

    /**
     * Setter for countryId
     *
     * The unique ID number of this country as defined in Avalara's certificate management system.
     */
    public void setCountryId(Integer value) {
        this.countryId = value;
    }

    private String countryName;

    /**
     * Getter for countryName
     *
     * The name of this country in US English.
     */
    public String getCountryName() {
        return this.countryName;
    }

    /**
     * Setter for countryName
     *
     * The name of this country in US English.
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    private String countryInitials;

    /**
     * Getter for countryInitials
     *
     * The three-character ISO 3166 code for this country.
     */
    public String getCountryInitials() {
        return this.countryInitials;
    }

    /**
     * Setter for countryInitials
     *
     * The three-character ISO 3166 code for this country.
     */
    public void setCountryInitials(String value) {
        this.countryInitials = value;
    }

    private Integer clientId;

    /**
     * Getter for clientId
     *
     * id of the client (client_id)
     */
    public Integer getClientId() {
        return this.clientId;
    }

    /**
     * Setter for clientId
     *
     * id of the client (client_id)
     */
    public void setClientId(Integer value) {
        this.clientId = value;
    }

    private String clientName;

    /**
     * Getter for clientName
     *
     * name of the client
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * Setter for clientName
     *
     * name of the client
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    private String avataxCompanyId;

    /**
     * Getter for avataxCompanyId
     *
     * The Avalara AvaTax™ CompanyId this client maps to.
     */
    public String getAvataxCompanyId() {
        return this.avataxCompanyId;
    }

    /**
     * Setter for avataxCompanyId
     *
     * The Avalara AvaTax™ CompanyId this client maps to.
     */
    public void setAvataxCompanyId(String value) {
        this.avataxCompanyId = value;
    }

    /**
     * Returns a JSON string representation of ClerkLocationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
