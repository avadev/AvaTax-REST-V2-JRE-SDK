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
 * Identifies all nexus that match a particular tax form
 */
public class NexusByTaxFormModel {


    private String formCode;

    /**
     * Getter for formCode;
     * The code of the tax form that was requested
     */
    public String getformCode() {;
        return this.formCode;;
    }

    /**
     * Setter for formCode;
     * The code of the tax form that was requested
     */
    public void setformCode(String value) {;
        this.formCode = value;;
    }


    private Int32? companyId;

    /**
     * Getter for companyId;
     * The company ID of the company that was used to load the companyNexus array. If this value is null, no company data was loaded.
     */
    public Int32? getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The company ID of the company that was used to load the companyNexus array. If this value is null, no company data was loaded.
     */
    public void setcompanyId(Int32? value) {;
        this.companyId = value;;
    }


    private List<NexusModel> nexusDefinitions;

    /**
     * Getter for nexusDefinitions;
     * A list of all Avalara-defined nexus that are relevant to this tax form
     */
    public List<NexusModel> getnexusDefinitions() {;
        return this.nexusDefinitions;;
    }

    /**
     * Setter for nexusDefinitions;
     * A list of all Avalara-defined nexus that are relevant to this tax form
     */
    public void setnexusDefinitions(List<NexusModel> value) {;
        this.nexusDefinitions = value;;
    }


    private List<NexusModel> companyNexus;

    /**
     * Getter for companyNexus;
     * A list of all currently-defined company nexus that are related to this tax form
     */
    public List<NexusModel> getcompanyNexus() {;
        return this.companyNexus;;
    }

    /**
     * Setter for companyNexus;
     * A list of all currently-defined company nexus that are related to this tax form
     */
    public void setcompanyNexus(List<NexusModel> value) {;
        this.companyNexus = value;;
    }


    /**
     * Returns a JSON string representation of NexusByTaxFormModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
