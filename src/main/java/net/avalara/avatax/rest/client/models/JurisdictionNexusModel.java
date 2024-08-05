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
 * Model to represent the detail of NexusTaxTpeGroup and TaxName for Jurisdiction
 */
public class JurisdictionNexusModel {


    private String taxTypeGroupId;

    /**
     * Getter for taxTypeGroupId
     *
     * TaxTypeGroupId for Nexus of Jurisdiction
     */
    public String getTaxTypeGroupId() {
        return this.taxTypeGroupId;
    }

    /**
     * Setter for taxTypeGroupId
     *
     * TaxTypeGroupId for Nexus of Jurisdiction
     */
    public void setTaxTypeGroupId(String value) {
        this.taxTypeGroupId = value;
    }

    private String nexusTaxTypeGroupId;

    /**
     * Getter for nexusTaxTypeGroupId
     *
     * NexusTaxTypeGroupId for Nexus of Jurisdiction
     */
    public String getNexusTaxTypeGroupId() {
        return this.nexusTaxTypeGroupId;
    }

    /**
     * Setter for nexusTaxTypeGroupId
     *
     * NexusTaxTypeGroupId for Nexus of Jurisdiction
     */
    public void setNexusTaxTypeGroupId(String value) {
        this.nexusTaxTypeGroupId = value;
    }

    private String taxName;

    /**
     * Getter for taxName
     *
     * TaxName for Nexus of Jurisdiction
     */
    public String getTaxName() {
        return this.taxName;
    }

    /**
     * Setter for taxName
     *
     * TaxName for Nexus of Jurisdiction
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    private Boolean taxableNexus;

    /**
     * Getter for taxableNexus
     *
     * Shows if system nexus records are associated with tax collection
     */
    public Boolean getTaxableNexus() {
        return this.taxableNexus;
    }

    /**
     * Setter for taxableNexus
     *
     * Shows if system nexus records are associated with tax collection
     */
    public void setTaxableNexus(Boolean value) {
        this.taxableNexus = value;
    }

    /**
     * Returns a JSON string representation of JurisdictionNexusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
