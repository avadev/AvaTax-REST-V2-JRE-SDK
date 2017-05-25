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
 * Company Initialization Model
 */
public class CompanyInitializationModel {


    private String name;

    /**
     * Getter for name;
     * Company Name
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * Company Name
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private String companyCode;

    /**
     * Getter for companyCode;
     * Company Code - used to distinguish between companies within your accounting system
     */
    public String getcompanyCode() {;
        return this.companyCode;;
    }

    /**
     * Setter for companyCode;
     * Company Code - used to distinguish between companies within your accounting system
     */
    public void setcompanyCode(String value) {;
        this.companyCode = value;;
    }


    private String vatRegistrationId;

    /**
     * Getter for vatRegistrationId;
     * Vat Registration Id - leave blank if not known.
     */
    public String getvatRegistrationId() {;
        return this.vatRegistrationId;;
    }

    /**
     * Setter for vatRegistrationId;
     * Vat Registration Id - leave blank if not known.
     */
    public void setvatRegistrationId(String value) {;
        this.vatRegistrationId = value;;
    }


    private String taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber;
     * United States Taxpayer ID number, usually your Employer Identification Number if you are a business or your 
    * Social Security Number if you are an individual.
    * This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
    * but it is optional if you do not subscribe to either of those services.
     */
    public String gettaxpayerIdNumber() {;
        return this.taxpayerIdNumber;;
    }

    /**
     * Setter for taxpayerIdNumber;
     * United States Taxpayer ID number, usually your Employer Identification Number if you are a business or your 
    * Social Security Number if you are an individual.
    * This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
    * but it is optional if you do not subscribe to either of those services.
     */
    public void settaxpayerIdNumber(String value) {;
        this.taxpayerIdNumber = value;;
    }


    private String line1;

    /**
     * Getter for line1;
     * Address Line1
     */
    public String getline1() {;
        return this.line1;;
    }

    /**
     * Setter for line1;
     * Address Line1
     */
    public void setline1(String value) {;
        this.line1 = value;;
    }


    private String line2;

    /**
     * Getter for line2;
     * Line2
     */
    public String getline2() {;
        return this.line2;;
    }

    /**
     * Setter for line2;
     * Line2
     */
    public void setline2(String value) {;
        this.line2 = value;;
    }


    private String line3;

    /**
     * Getter for line3;
     * Line3
     */
    public String getline3() {;
        return this.line3;;
    }

    /**
     * Setter for line3;
     * Line3
     */
    public void setline3(String value) {;
        this.line3 = value;;
    }


    private String city;

    /**
     * Getter for city;
     * City
     */
    public String getcity() {;
        return this.city;;
    }

    /**
     * Setter for city;
     * City
     */
    public void setcity(String value) {;
        this.city = value;;
    }


    private String region;

    /**
     * Getter for region;
     * Two character ISO 3166 Region code for this company's primary business location.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * Two character ISO 3166 Region code for this company's primary business location.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private String postalCode;

    /**
     * Getter for postalCode;
     * Postal Code
     */
    public String getpostalCode() {;
        return this.postalCode;;
    }

    /**
     * Setter for postalCode;
     * Postal Code
     */
    public void setpostalCode(String value) {;
        this.postalCode = value;;
    }


    private String country;

    /**
     * Getter for country;
     * Two character ISO 3166 Country code for this company's primary business location.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * Two character ISO 3166 Country code for this company's primary business location.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String firstName;

    /**
     * Getter for firstName;
     * First Name
     */
    public String getfirstName() {;
        return this.firstName;;
    }

    /**
     * Setter for firstName;
     * First Name
     */
    public void setfirstName(String value) {;
        this.firstName = value;;
    }


    private String lastName;

    /**
     * Getter for lastName;
     * Last Name
     */
    public String getlastName() {;
        return this.lastName;;
    }

    /**
     * Setter for lastName;
     * Last Name
     */
    public void setlastName(String value) {;
        this.lastName = value;;
    }


    private String title;

    /**
     * Getter for title;
     * Title
     */
    public String gettitle() {;
        return this.title;;
    }

    /**
     * Setter for title;
     * Title
     */
    public void settitle(String value) {;
        this.title = value;;
    }


    private String email;

    /**
     * Getter for email;
     * Email
     */
    public String getemail() {;
        return this.email;;
    }

    /**
     * Setter for email;
     * Email
     */
    public void setemail(String value) {;
        this.email = value;;
    }


    private String phoneNumber;

    /**
     * Getter for phoneNumber;
     * Phone Number
     */
    public String getphoneNumber() {;
        return this.phoneNumber;;
    }

    /**
     * Setter for phoneNumber;
     * Phone Number
     */
    public void setphoneNumber(String value) {;
        this.phoneNumber = value;;
    }


    private String mobileNumber;

    /**
     * Getter for mobileNumber;
     * Mobile Number
     */
    public String getmobileNumber() {;
        return this.mobileNumber;;
    }

    /**
     * Setter for mobileNumber;
     * Mobile Number
     */
    public void setmobileNumber(String value) {;
        this.mobileNumber = value;;
    }


    private String faxNumber;

    /**
     * Getter for faxNumber;
     * Fax Number
     */
    public String getfaxNumber() {;
        return this.faxNumber;;
    }

    /**
     * Setter for faxNumber;
     * Fax Number
     */
    public void setfaxNumber(String value) {;
        this.faxNumber = value;;
    }


    /**
     * Returns a JSON string representation of CompanyInitializationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
