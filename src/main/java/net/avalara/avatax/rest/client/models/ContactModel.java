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
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * A contact person for a company.
 */
public class ContactModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this contact.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this contact.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company to which this contact belongs.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company to which this contact belongs.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private String contactCode;

    /**
     * Getter for contactCode;
     * A unique code for this contact.
     */
    public String getcontactCode() {;
        return this.contactCode;;
    }

    /**
     * Setter for contactCode;
     * A unique code for this contact.
     */
    public void setcontactCode(String value) {;
        this.contactCode = value;;
    }


    private String firstName;

    /**
     * Getter for firstName;
     * The first or given name of this contact.
     */
    public String getfirstName() {;
        return this.firstName;;
    }

    /**
     * Setter for firstName;
     * The first or given name of this contact.
     */
    public void setfirstName(String value) {;
        this.firstName = value;;
    }


    private String middleName;

    /**
     * Getter for middleName;
     * The middle name of this contact.
     */
    public String getmiddleName() {;
        return this.middleName;;
    }

    /**
     * Setter for middleName;
     * The middle name of this contact.
     */
    public void setmiddleName(String value) {;
        this.middleName = value;;
    }


    private String lastName;

    /**
     * Getter for lastName;
     * The last or family name of this contact.
     */
    public String getlastName() {;
        return this.lastName;;
    }

    /**
     * Setter for lastName;
     * The last or family name of this contact.
     */
    public void setlastName(String value) {;
        this.lastName = value;;
    }


    private String title;

    /**
     * Getter for title;
     * Professional title of this contact.
     */
    public String gettitle() {;
        return this.title;;
    }

    /**
     * Setter for title;
     * Professional title of this contact.
     */
    public void settitle(String value) {;
        this.title = value;;
    }


    private String line1;

    /**
     * Getter for line1;
     * The first line of the postal mailing address of this contact.
     */
    public String getline1() {;
        return this.line1;;
    }

    /**
     * Setter for line1;
     * The first line of the postal mailing address of this contact.
     */
    public void setline1(String value) {;
        this.line1 = value;;
    }


    private String line2;

    /**
     * Getter for line2;
     * The second line of the postal mailing address of this contact.
     */
    public String getline2() {;
        return this.line2;;
    }

    /**
     * Setter for line2;
     * The second line of the postal mailing address of this contact.
     */
    public void setline2(String value) {;
        this.line2 = value;;
    }


    private String line3;

    /**
     * Getter for line3;
     * The third line of the postal mailing address of this contact.
     */
    public String getline3() {;
        return this.line3;;
    }

    /**
     * Setter for line3;
     * The third line of the postal mailing address of this contact.
     */
    public void setline3(String value) {;
        this.line3 = value;;
    }


    private String city;

    /**
     * Getter for city;
     * The city of the postal mailing address of this contact.
     */
    public String getcity() {;
        return this.city;;
    }

    /**
     * Setter for city;
     * The city of the postal mailing address of this contact.
     */
    public void setcity(String value) {;
        this.city = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The state, region, or province of the postal mailing address of this contact.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The state, region, or province of the postal mailing address of this contact.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private String postalCode;

    /**
     * Getter for postalCode;
     * The postal code or zip code of the postal mailing address of this contact.
     */
    public String getpostalCode() {;
        return this.postalCode;;
    }

    /**
     * Setter for postalCode;
     * The postal code or zip code of the postal mailing address of this contact.
     */
    public void setpostalCode(String value) {;
        this.postalCode = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The ISO 3166 two-character country code of the postal mailing address of this contact.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The ISO 3166 two-character country code of the postal mailing address of this contact.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String email;

    /**
     * Getter for email;
     * The email address of this contact.
     */
    public String getemail() {;
        return this.email;;
    }

    /**
     * Setter for email;
     * The email address of this contact.
     */
    public void setemail(String value) {;
        this.email = value;;
    }


    private String phone;

    /**
     * Getter for phone;
     * The main phone number for this contact.
     */
    public String getphone() {;
        return this.phone;;
    }

    /**
     * Setter for phone;
     * The main phone number for this contact.
     */
    public void setphone(String value) {;
        this.phone = value;;
    }


    private String mobile;

    /**
     * Getter for mobile;
     * The mobile phone number for this contact.
     */
    public String getmobile() {;
        return this.mobile;;
    }

    /**
     * Setter for mobile;
     * The mobile phone number for this contact.
     */
    public void setmobile(String value) {;
        this.mobile = value;;
    }


    private String fax;

    /**
     * Getter for fax;
     * The facsimile phone number for this contact.
     */
    public String getfax() {;
        return this.fax;;
    }

    /**
     * Setter for fax;
     * The facsimile phone number for this contact.
     */
    public void setfax(String value) {;
        this.fax = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    /**
     * Returns a JSON string representation of ContactModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
