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
 * Restricts automated classification to all nexus countries or an explicit list.
 */
public class CountryScopeModel {


    private String type;

    /**
     * Getter for type
     *
     * Avalara.ItemMasterCoreService.Common.ClassificationSettingsConstants.CountryScopeTypes.All or Avalara.ItemMasterCoreService.Common.ClassificationSettingsConstants.CountryScopeTypes.Selected.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Avalara.ItemMasterCoreService.Common.ClassificationSettingsConstants.CountryScopeTypes.All or Avalara.ItemMasterCoreService.Common.ClassificationSettingsConstants.CountryScopeTypes.Selected.
     */
    public void setType(String value) {
        this.type = value;
    }

    private ArrayList<String> countries;

    /**
     * Getter for countries
     *
     * ISO 3166 alpha-2 codes when `type` is `selected`; ignored for `all`.
     */
    public ArrayList<String> getCountries() {
        return this.countries;
    }

    /**
     * Setter for countries
     *
     * ISO 3166 alpha-2 codes when `type` is `selected`; ignored for `all`.
     */
    public void setCountries(ArrayList<String> value) {
        this.countries = value;
    }

    /**
     * Returns a JSON string representation of CountryScopeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
