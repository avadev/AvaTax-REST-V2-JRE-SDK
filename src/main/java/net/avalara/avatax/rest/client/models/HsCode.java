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
 * 
 */
public class HsCode {


    private String original;

    /**
     * Getter for original
     *
     * 
     */
    public String getOriginal() {
        return this.original;
    }

    /**
     * Setter for original
     *
     * 
     */
    public void setOriginal(String value) {
        this.original = value;
    }

    private String modified;

    /**
     * Getter for modified
     *
     * 
     */
    public String getModified() {
        return this.modified;
    }

    /**
     * Setter for modified
     *
     * 
     */
    public void setModified(String value) {
        this.modified = value;
    }

    /**
     * Returns a JSON string representation of HsCode
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
