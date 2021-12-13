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
 * This object represents a single determination factor for a line that is being inspected through the InspectLine API.
 */
public class DeterminationFactorModel {


    private String code;

    /**
     * Getter for code
     *
     * Determination reason code.
	 * 
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Determination reason code.
     */
    public void setCode(String value) {
        this.code = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Determination reason description.
	 * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Determination reason description.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private ArrayList<String> ids;

    /**
     * Getter for ids
     *
     * The ids of any applied determination factor.
	 * 
     */
    public ArrayList<String> getIds() {
        return this.ids;
    }

    /**
     * Setter for ids
     *
     * The ids of any applied determination factor.
     */
    public void setIds(ArrayList<String> value) {
        this.ids = value;
    }

    private ArrayList<String> names;

    /**
     * Getter for names
     *
     * The name of any applied determination factor.
	 * 
     */
    public ArrayList<String> getNames() {
        return this.names;
    }

    /**
     * Setter for names
     *
     * The name of any applied determination factor.
     */
    public void setNames(ArrayList<String> value) {
        this.names = value;
    }

    private String createdBy;

    /**
     * Getter for createdBy
     *
     * The name of the user who created the determination factor.
	 * 
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for createdBy
     *
     * The name of the user who created the determination factor.
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Returns a JSON string representation of DeterminationFactorModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
