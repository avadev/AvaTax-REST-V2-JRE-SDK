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
public class ProblemDetails {


    private String type;

    /**
     * Getter for type
     *
     * 
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * 
     */
    public void setType(String value) {
        this.type = value;
    }

    private String title;

    /**
     * Getter for title
     *
     * 
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * 
     */
    public void setTitle(String value) {
        this.title = value;
    }

    private Integer status;

    /**
     * Getter for status
     *
     * 
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * 
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    private String detail;

    /**
     * Getter for detail
     *
     * 
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * Setter for detail
     *
     * 
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    private String instance;

    /**
     * Getter for instance
     *
     * 
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * Setter for instance
     *
     * 
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    private HashMap<String, String> extensions;

    /**
     * Getter for extensions
     *
     * 
     */
    public HashMap<String, String> getExtensions() {
        return this.extensions;
    }

    /**
     * Setter for extensions
     *
     * 
     */
    public void setExtensions(HashMap<String, String> value) {
        this.extensions = value;
    }

    /**
     * Returns a JSON string representation of ProblemDetails
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
