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
 * Describes an element in the harmonized tariff system.
* 
* According to the [United States International Trade Commission](https://www.usitc.gov), the harmonized tariff schedule is defined as follows:
* 
* The HTS is a U.S. nomenclature system used to classify traded goods based on their material composition, product name, and/or intended 
* function. The HTS is designed so that each article falls into only one category. It is divided into chapters, each of which has a 2-digit 
* number. Each product category within the various chapters is designated by 4, 6, 8, or 10 digits. The 4-digit categories are called 
* "headings." The 6-, 8- and 10-digit classifications are called "subheadings."
* 
* Within AvaTax, the `HsCodeModel` object can refer to sections, chapters, headings, subheadings, or articles. Each object represents one
* classification. Many of these objects have child objects underneath them; these child objects are more specific than their parent objects.
 */
public class HsCodeModel {


    private String hsCode;

    /**
     * Getter for hsCode
     *
     * The harmonized tariff system code for this section and chapter. 
    * 
    * A full HS code contains more than six characters. Partial HS codes with two, four, or six characters may have child codes underneath them.
    * A child code is one that contains greater specificity than a parent code. It is recommended that when you identify a product you use
    * the most detailed code available to identify it.
    * 
    * Top level sections do not have HS Codes.
     */
    public String getHsCode() {
        return this.hsCode;
    }

    /**
     * Setter for hsCode
     *
     * The harmonized tariff system code for this section and chapter. 
    * 
    * A full HS code contains more than six characters. Partial HS codes with two, four, or six characters may have child codes underneath them.
    * A child code is one that contains greater specificity than a parent code. It is recommended that when you identify a product you use
    * the most detailed code available to identify it.
    * 
    * Top level sections do not have HS Codes.
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }


    private Long id;

    /**
     * Getter for id
     *
     * A unique identifier for this harmonized tariff system code.
    * 
    * To search for a list of child codes underneath a specific HS code, search for codes where the child's `parentHsCodeId` value matches the parent's `id` value.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique identifier for this harmonized tariff system code.
    * 
    * To search for a list of child codes underneath a specific HS code, search for codes where the child's `parentHsCodeId` value matches the parent's `id` value.
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Long parentHsCodeId;

    /**
     * Getter for parentHsCodeId
     *
     * The unique ID number of the parent HS code or HS code prefix.
    * 
    * To search for a list of child codes underneath a specific HS code, search for codes where the child's `parentHsCodeId` value matches the parent's `id` value.
     */
    public Long getParentHsCodeId() {
        return this.parentHsCodeId;
    }

    /**
     * Setter for parentHsCodeId
     *
     * The unique ID number of the parent HS code or HS code prefix.
    * 
    * To search for a list of child codes underneath a specific HS code, search for codes where the child's `parentHsCodeId` value matches the parent's `id` value.
     */
    public void setParentHsCodeId(Long value) {
        this.parentHsCodeId = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * A human readable description that identifies Code descriptive text for this Section, Chapter, Heading, or Subheading.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A human readable description that identifies Code descriptive text for this Section, Chapter, Heading, or Subheading.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private String system;

    /**
     * Getter for system
     *
     * The system to which this HS code belongs.
     */
    public String getSystem() {
        return this.system;
    }

    /**
     * Setter for system
     *
     * The system to which this HS code belongs.
     */
    public void setSystem(String value) {
        this.system = value;
    }


    private String destinationCountry;

    /**
     * Getter for destinationCountry
     *
     * The destination country identified with this HS Code. This value applies when certain products are classified in specific ways by
    * bilateral trade agreements.
     */
    public String getDestinationCountry() {
        return this.destinationCountry;
    }

    /**
     * Setter for destinationCountry
     *
     * The destination country identified with this HS Code. This value applies when certain products are classified in specific ways by
    * bilateral trade agreements.
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }


    private Date effDate;

    /**
     * Getter for effDate
     *
     * For codes that have been expired or defined on specific dates, this value indicates the earliest
    * date for which this code is considered valid.
    * 
    * If this value is null, this code can be used for any valid date earlier than its end date.
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * For codes that have been expired or defined on specific dates, this value indicates the earliest
    * date for which this code is considered valid.
    * 
    * If this value is null, this code can be used for any valid date earlier than its end date.
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * For codes that have been expired or defined on specific dates, this value indicates the latest
    * date for which this code is considered valid.
    * 
    * If this value is null, this code can be used for any valid date later than its effective date.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * For codes that have been expired or defined on specific dates, this value indicates the latest
    * date for which this code is considered valid.
    * 
    * If this value is null, this code can be used for any valid date later than its effective date.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    /**
     * Returns a JSON string representation of HsCodeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
