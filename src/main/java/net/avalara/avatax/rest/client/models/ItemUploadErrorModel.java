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
 * Represents a item upload error model.
 */
public class ItemUploadErrorModel {


    private Integer rowIndex;

    /**
     * Getter for rowIndex
     *
     * Row index of an item
	 * 
     */
    public Integer getRowIndex() {
        return this.rowIndex;
    }

    /**
     * Setter for rowIndex
     *
     * Row index of an item
     */
    public void setRowIndex(Integer value) {
        this.rowIndex = value;
    }

    private String itemCode;

    /**
     * Getter for itemCode
     *
     * Item code
	 * 
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * Item code
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    private ArrayList<String> errors;

    /**
     * Getter for errors
     *
     * List of errors for against given item code
	 * 
     */
    public ArrayList<String> getErrors() {
        return this.errors;
    }

    /**
     * Setter for errors
     *
     * List of errors for against given item code
     */
    public void setErrors(ArrayList<String> value) {
        this.errors = value;
    }

    /**
     * Returns a JSON string representation of ItemUploadErrorModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
