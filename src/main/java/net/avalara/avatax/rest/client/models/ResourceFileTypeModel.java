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
 * Resource File Type Model
 */
public class ResourceFileTypeModel {


    private Int32? resourceFileTypeId;

    /**
     * Getter for resourceFileTypeId;
     * The resource file type id
     */
    public Int32? getresourceFileTypeId() {;
        return this.resourceFileTypeId;;
    }

    /**
     * Setter for resourceFileTypeId;
     * The resource file type id
     */
    public void setresourceFileTypeId(Int32? value) {;
        this.resourceFileTypeId = value;;
    }


    private String name;

    /**
     * Getter for name;
     * The name of the file type
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The name of the file type
     */
    public void setname(String value) {;
        this.name = value;;
    }


    /**
     * Returns a JSON string representation of ResourceFileTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
