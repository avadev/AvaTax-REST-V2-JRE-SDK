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
 */

/**
 * Identifies all nexus that match a particular tax form
 */
public class NexusByTaxFormModel {


    private String formCode;

    /**
     * Getter for formCode
     *
     * The code of the tax form that was requested
     */
    public String getFormCode() {
        return this.formCode;
    }

    /**
     * Setter for formCode
     *
     * The code of the tax form that was requested
     */
    public void setFormCode(String value) {
        this.formCode = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The company ID of the company that was used to load the companyNexus array. If this value is null, no company data was loaded.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The company ID of the company that was used to load the companyNexus array. If this value is null, no company data was loaded.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private ArrayList<NexusModel> nexusDefinitions;

    /**
     * Getter for nexusDefinitions
     *
     * A list of all Avalara-defined nexus that are relevant to this tax form
     */
    public ArrayList<NexusModel> getNexusDefinitions() {
        return this.nexusDefinitions;
    }

    /**
     * Setter for nexusDefinitions
     *
     * A list of all Avalara-defined nexus that are relevant to this tax form
     */
    public void setNexusDefinitions(ArrayList<NexusModel> value) {
        this.nexusDefinitions = value;
    }


    private ArrayList<NexusModel> companyNexus;

    /**
     * Getter for companyNexus
     *
     * A list of all currently-defined company nexus that are related to this tax form
     */
    public ArrayList<NexusModel> getCompanyNexus() {
        return this.companyNexus;
    }

    /**
     * Setter for companyNexus
     *
     * A list of all currently-defined company nexus that are related to this tax form
     */
    public void setCompanyNexus(ArrayList<NexusModel> value) {
        this.companyNexus = value;
    }


    /**
     * Returns a JSON string representation of NexusByTaxFormModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
