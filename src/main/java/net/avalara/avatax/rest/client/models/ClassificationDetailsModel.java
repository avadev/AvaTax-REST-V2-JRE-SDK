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
 * Represents classification details model
 */
public class ClassificationDetailsModel {


    private Integer classified;

    /**
     * Getter for classified
     *
     * The number of items which are classified
     */
    public Integer getClassified() {
        return this.classified;
    }

    /**
     * Setter for classified
     *
     * The number of items which are classified
     */
    public void setClassified(Integer value) {
        this.classified = value;
    }

    private Integer inProgress;

    /**
     * Getter for inProgress
     *
     * The number of items which are in progress state
     */
    public Integer getInProgress() {
        return this.inProgress;
    }

    /**
     * Setter for inProgress
     *
     * The number of items which are in progress state
     */
    public void setInProgress(Integer value) {
        this.inProgress = value;
    }

    private Integer notClassified;

    /**
     * Getter for notClassified
     *
     * The number of items which are not classified
     */
    public Integer getNotClassified() {
        return this.notClassified;
    }

    /**
     * Setter for notClassified
     *
     * The number of items which are not classified
     */
    public void setNotClassified(Integer value) {
        this.notClassified = value;
    }

    /**
     * Returns a JSON string representation of ClassificationDetailsModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
