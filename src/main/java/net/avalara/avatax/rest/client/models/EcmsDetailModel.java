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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * 
 */
public class EcmsDetailModel {


    private Integer exemptCertDetailId;

    /**
     * Getter for exemptCertDetailId
     *
     * detail id
     */
    public Integer getExemptCertDetailId() {
        return this.exemptCertDetailId;
    }

    /**
     * Setter for exemptCertDetailId
     *
     * detail id
     */
    public void setExemptCertDetailId(Integer value) {
        this.exemptCertDetailId = value;
    }


    private Integer exemptCertId;

    /**
     * Getter for exemptCertId
     *
     * exempt certificate id
     */
    public Integer getExemptCertId() {
        return this.exemptCertId;
    }

    /**
     * Setter for exemptCertId
     *
     * exempt certificate id
     */
    public void setExemptCertId(Integer value) {
        this.exemptCertId = value;
    }


    private String stateFips;

    /**
     * Getter for stateFips
     *
     * State FIPS
     */
    public String getStateFips() {
        return this.stateFips;
    }

    /**
     * Setter for stateFips
     *
     * State FIPS
     */
    public void setStateFips(String value) {
        this.stateFips = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * Region or State
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Region or State
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private String idNo;

    /**
     * Getter for idNo
     *
     * ID number
     */
    public String getIdNo() {
        return this.idNo;
    }

    /**
     * Setter for idNo
     *
     * ID number
     */
    public void setIdNo(String value) {
        this.idNo = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * Country that this exempt certificate is for
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Country that this exempt certificate is for
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * End date of this exempt certificate
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * End date of this exempt certificate
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private String idType;

    /**
     * Getter for idType
     *
     * ID type of this exempt certificate
     */
    public String getIdType() {
        return this.idType;
    }

    /**
     * Setter for idType
     *
     * ID type of this exempt certificate
     */
    public void setIdType(String value) {
        this.idType = value;
    }


    private Byte isTaxCodeListExclusionList;

    /**
     * Getter for isTaxCodeListExclusionList
     *
     * Is the tax code list an exculsion list?
     */
    public Byte getIsTaxCodeListExclusionList() {
        return this.isTaxCodeListExclusionList;
    }

    /**
     * Setter for isTaxCodeListExclusionList
     *
     * Is the tax code list an exculsion list?
     */
    public void setIsTaxCodeListExclusionList(Byte value) {
        this.isTaxCodeListExclusionList = value;
    }


    private ArrayList<EcmsDetailTaxCodeModel> taxCodes;

    /**
     * Getter for taxCodes
     *
     * optional: list of tax code associated with this exempt certificate detail
     */
    public ArrayList<EcmsDetailTaxCodeModel> getTaxCodes() {
        return this.taxCodes;
    }

    /**
     * Setter for taxCodes
     *
     * optional: list of tax code associated with this exempt certificate detail
     */
    public void setTaxCodes(ArrayList<EcmsDetailTaxCodeModel> value) {
        this.taxCodes = value;
    }


    /**
     * Returns a JSON string representation of EcmsDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
