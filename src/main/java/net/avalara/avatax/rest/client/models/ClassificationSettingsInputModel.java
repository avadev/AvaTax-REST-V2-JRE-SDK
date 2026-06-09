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
 * Request body for creating company classification settings (`POST /classification-settings`).
 */
public class ClassificationSettingsInputModel {


    private String mode;

    /**
     * Getter for mode
     *
     * Classification mode: typically Avalara.ItemMasterCoreService.Common.ClassificationSettingsConstants.Modes.AutoFull or Avalara.ItemMasterCoreService.Common.ClassificationSettingsConstants.Modes.AutoPartial.
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * Setter for mode
     *
     * Classification mode: typically Avalara.ItemMasterCoreService.Common.ClassificationSettingsConstants.Modes.AutoFull or Avalara.ItemMasterCoreService.Common.ClassificationSettingsConstants.Modes.AutoPartial.
     */
    public void setMode(String value) {
        this.mode = value;
    }

    private ClassificationCriteriaModel criteria;

    /**
     * Getter for criteria
     *
     * 
     */
    public ClassificationCriteriaModel getCriteria() {
        return this.criteria;
    }

    /**
     * Setter for criteria
     *
     * 
     */
    public void setCriteria(ClassificationCriteriaModel value) {
        this.criteria = value;
    }

    private CountryScopeModel countryScope;

    /**
     * Getter for countryScope
     *
     * 
     */
    public CountryScopeModel getCountryScope() {
        return this.countryScope;
    }

    /**
     * Setter for countryScope
     *
     * 
     */
    public void setCountryScope(CountryScopeModel value) {
        this.countryScope = value;
    }

    /**
     * Returns a JSON string representation of ClassificationSettingsInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
