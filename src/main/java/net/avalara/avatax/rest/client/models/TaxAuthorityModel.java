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
 * Tax Authority Model
 */
public class TaxAuthorityModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this tax authority.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this tax authority.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private String name;

    /**
     * Getter for name;
     * The friendly name of this tax authority.
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The friendly name of this tax authority.
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private Int32? taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId;
     * The type of this tax authority.
     */
    public Int32? gettaxAuthorityTypeId() {;
        return this.taxAuthorityTypeId;;
    }

    /**
     * Setter for taxAuthorityTypeId;
     * The type of this tax authority.
     */
    public void settaxAuthorityTypeId(Int32? value) {;
        this.taxAuthorityTypeId = value;;
    }


    private Int32? jurisdictionId;

    /**
     * Getter for jurisdictionId;
     * The unique ID number of the jurisdiction for this tax authority.
     */
    public Int32? getjurisdictionId() {;
        return this.jurisdictionId;;
    }

    /**
     * Setter for jurisdictionId;
     * The unique ID number of the jurisdiction for this tax authority.
     */
    public void setjurisdictionId(Int32? value) {;
        this.jurisdictionId = value;;
    }


    /**
     * Returns a JSON string representation of TaxAuthorityModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
