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
 * SendSales Request Model.
 */
public class SendSalesRequestModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The companyId for which the send sales file is being generated.
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The companyId for which the send sales file is being generated.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private ArrayList<String> taxCodes;

    /**
     * Getter for taxCodes
     *
     * List of taxCodes to be included in send sales file.
	 * 
     */
    public ArrayList<String> getTaxCodes() {
        return this.taxCodes;
    }

    /**
     * Setter for taxCodes
     *
     * List of taxCodes to be included in send sales file.
     */
    public void setTaxCodes(ArrayList<String> value) {
        this.taxCodes = value;
    }

    private Date date;

    /**
     * Getter for date
     *
     * The date for which send sales file is being generated.
	 * 
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date
     *
     * The date for which send sales file is being generated.
     */
    public void setDate(Date value) {
        this.date = value;
    }

    private SendSalesOutputFileFormat format;

    /**
     * Getter for format
     *
     * The send sales file format.
	 * 
     */
    public SendSalesOutputFileFormat getFormat() {
        return this.format;
    }

    /**
     * Setter for format
     *
     * The send sales file format.
     */
    public void setFormat(SendSalesOutputFileFormat value) {
        this.format = value;
    }

    private SendSalesFileType type;

    /**
     * Getter for type
     *
     * The send sales file type
	 * 
     */
    public SendSalesFileType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The send sales file type
     */
    public void setType(SendSalesFileType value) {
        this.type = value;
    }

    /**
     * Returns a JSON string representation of SendSalesRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
