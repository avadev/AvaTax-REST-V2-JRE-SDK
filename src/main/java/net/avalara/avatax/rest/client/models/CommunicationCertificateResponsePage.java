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
 * Encloses count and model value details
 */
public class CommunicationCertificateResponsePage {


    private Integer count;

    /**
     * Getter for count
     *
     * Count of records
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Setter for count
     *
     * Count of records
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    private ArrayList<CommunicationCertificateResponse> value;

    /**
     * Getter for value
     *
     * Requested model list
     */
    public ArrayList<CommunicationCertificateResponse> getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * Requested model list
     */
    public void setValue(ArrayList<CommunicationCertificateResponse> value) {
        this.value = value;
    }

    /**
     * Returns a JSON string representation of CommunicationCertificateResponsePage
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
