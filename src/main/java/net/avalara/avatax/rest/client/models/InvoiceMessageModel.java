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
 * Represents a message to be displayed on an invoice.
 */
public class InvoiceMessageModel {


    private String content;

    /**
     * Getter for content
     *
     * The content of the invoice message.
	 * 
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for content
     *
     * The content of the invoice message.
     */
    public void setContent(String value) {
        this.content = value;
    }

    private ArrayList<String> lineNumbers;

    /**
     * Getter for lineNumbers
     *
     * The applicable tax line numbers and codes.
	 * 
     */
    public ArrayList<String> getLineNumbers() {
        return this.lineNumbers;
    }

    /**
     * Setter for lineNumbers
     *
     * The applicable tax line numbers and codes.
     */
    public void setLineNumbers(ArrayList<String> value) {
        this.lineNumbers = value;
    }

    /**
     * Returns a JSON string representation of InvoiceMessageModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
