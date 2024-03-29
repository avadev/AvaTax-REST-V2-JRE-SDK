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
 * Model used for Domain control verification response
 */
public class DcvCreationResponse {


    private String message;

    /**
     * Getter for message
     *
     * Domain control verification is already exist or newly created
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * Domain control verification is already exist or newly created
     */
    public void setMessage(String value) {
        this.message = value;
    }

    private DcvViewModel dcvViewModel;

    /**
     * Getter for dcvViewModel
     *
     * 
     */
    public DcvViewModel getDcvViewModel() {
        return this.dcvViewModel;
    }

    /**
     * Setter for dcvViewModel
     *
     * 
     */
    public void setDcvViewModel(DcvViewModel value) {
        this.dcvViewModel = value;
    }

    /**
     * Returns a JSON string representation of DcvCreationResponse
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
