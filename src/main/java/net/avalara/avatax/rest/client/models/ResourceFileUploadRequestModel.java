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
 * A request to upload a file to Resource Files
 */
public class ResourceFileUploadRequestModel {


    private Byte[] content;

    /**
     * Getter for content;
     * This stream contains the bytes of the file being uploaded.
     */
    public Byte[] getcontent() {;
        return this.content;;
    }

    /**
     * Setter for content;
     * This stream contains the bytes of the file being uploaded.
     */
    public void setcontent(Byte[] value) {;
        this.content = value;;
    }


    private String username;

    /**
     * Getter for username;
     * The username adding the file
     */
    public String getusername() {;
        return this.username;;
    }

    /**
     * Setter for username;
     * The username adding the file
     */
    public void setusername(String value) {;
        this.username = value;;
    }


    private Int32? accountId;

    /**
     * Getter for accountId;
     * The account ID to which this file will be attached.
     */
    public Int32? getaccountId() {;
        return this.accountId;;
    }

    /**
     * Setter for accountId;
     * The account ID to which this file will be attached.
     */
    public void setaccountId(Int32? value) {;
        this.accountId = value;;
    }


    private Int32? companyId;

    /**
     * Getter for companyId;
     * The company ID to which this file will be attached.
     */
    public Int32? getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The company ID to which this file will be attached.
     */
    public void setcompanyId(Int32? value) {;
        this.companyId = value;;
    }


    private String name;

    /**
     * Getter for name;
     * The original name of this file.
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The original name of this file.
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private Int32? resourceFileTypeId;

    /**
     * Getter for resourceFileTypeId;
     * The resource type ID of this file.
     */
    public Int32? getresourceFileTypeId() {;
        return this.resourceFileTypeId;;
    }

    /**
     * Setter for resourceFileTypeId;
     * The resource type ID of this file.
     */
    public void setresourceFileTypeId(Int32? value) {;
        this.resourceFileTypeId = value;;
    }


    private Int64? length;

    /**
     * Getter for length;
     * Length of the file in bytes.
     */
    public Int64? getlength() {;
        return this.length;;
    }

    /**
     * Setter for length;
     * Length of the file in bytes.
     */
    public void setlength(Int64? value) {;
        this.length = value;;
    }


    /**
     * Returns a JSON string representation of ResourceFileUploadRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
