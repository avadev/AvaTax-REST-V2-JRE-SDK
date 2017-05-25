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
 * Represents the current status of a funding ESign method
 */
public class FundingESignMethodReturn {


    private String method;

    /**
     * Getter for method;
     * Method
     */
    public String getmethod() {;
        return this.method;;
    }

    /**
     * Setter for method;
     * Method
     */
    public void setmethod(String value) {;
        this.method = value;;
    }


    private Boolean? javaScriptReady;

    /**
     * Getter for javaScriptReady;
     * JavaScriptReady
     */
    public Boolean? getjavaScriptReady() {;
        return this.javaScriptReady;;
    }

    /**
     * Setter for javaScriptReady;
     * JavaScriptReady
     */
    public void setjavaScriptReady(Boolean? value) {;
        this.javaScriptReady = value;;
    }


    private String javaScript;

    /**
     * Getter for javaScript;
     * The actual javascript to use to render this object
     */
    public String getjavaScript() {;
        return this.javaScript;;
    }

    /**
     * Setter for javaScript;
     * The actual javascript to use to render this object
     */
    public void setjavaScript(String value) {;
        this.javaScript = value;;
    }


    /**
     * Returns a JSON string representation of FundingESignMethodReturn
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
