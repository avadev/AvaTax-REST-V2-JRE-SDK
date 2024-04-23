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
 * Request model for the returns specific nexus fetch API
 */
public class NexusForReturnsRequestModel {


    private String nexusTaxTypeGroup;

    /**
     * Getter for nexusTaxTypeGroup
     *
     * Description of the desired nexus tax type group (e.g. SalesAndUse, Lodging, etc.)
     */
    public String getNexusTaxTypeGroup() {
        return this.nexusTaxTypeGroup;
    }

    /**
     * Setter for nexusTaxTypeGroup
     *
     * Description of the desired nexus tax type group (e.g. SalesAndUse, Lodging, etc.)
     */
    public void setNexusTaxTypeGroup(String value) {
        this.nexusTaxTypeGroup = value;
    }

    private NexusTypeId nexusTypeId;

    /**
     * Getter for nexusTypeId
     *
     * The nexus type id desired (optional)
     */
    public NexusTypeId getNexusTypeId() {
        return this.nexusTypeId;
    }

    /**
     * Setter for nexusTypeId
     *
     * The nexus type id desired (optional)
     */
    public void setNexusTypeId(NexusTypeId value) {
        this.nexusTypeId = value;
    }

    private LocalNexusTypeId localNexusTypeId;

    /**
     * Getter for localNexusTypeId
     *
     * The local nexus type id desired (optional)
     */
    public LocalNexusTypeId getLocalNexusTypeId() {
        return this.localNexusTypeId;
    }

    /**
     * Setter for localNexusTypeId
     *
     * The local nexus type id desired (optional)
     */
    public void setLocalNexusTypeId(LocalNexusTypeId value) {
        this.localNexusTypeId = value;
    }

    private Boolean showHistorical;

    /**
     * Getter for showHistorical
     *
     * Flag indicating whether the response should include inactive nexus entries (optional)
     */
    public Boolean getShowHistorical() {
        return this.showHistorical;
    }

    /**
     * Setter for showHistorical
     *
     * Flag indicating whether the response should include inactive nexus entries (optional)
     */
    public void setShowHistorical(Boolean value) {
        this.showHistorical = value;
    }

    private Boolean showSSTOnly;

    /**
     * Getter for showSSTOnly
     *
     * Flag indicating whether to only include SST nexus entries in the response (optional)
     */
    public Boolean getShowSSTOnly() {
        return this.showSSTOnly;
    }

    /**
     * Setter for showSSTOnly
     *
     * Flag indicating whether to only include SST nexus entries in the response (optional)
     */
    public void setShowSSTOnly(Boolean value) {
        this.showSSTOnly = value;
    }

    /**
     * Returns a JSON string representation of NexusForReturnsRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
