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
 * 
 */
public class UnitOfBasisModel {


    private Integer unitOfBasisId;

    /**
     * Getter for unitOfBasisId
     *
     * UnitOfBasisId
	 * 
     */
    public Integer getUnitOfBasisId() {
        return this.unitOfBasisId;
    }

    /**
     * Setter for unitOfBasisId
     *
     * UnitOfBasisId
     */
    public void setUnitOfBasisId(Integer value) {
        this.unitOfBasisId = value;
    }

    private String unitOfBasis;

    /**
     * Getter for unitOfBasis
     *
     * UnitOfBasis Name
	 * 
     */
    public String getUnitOfBasis() {
        return this.unitOfBasis;
    }

    /**
     * Setter for unitOfBasis
     *
     * UnitOfBasis Name
     */
    public void setUnitOfBasis(String value) {
        this.unitOfBasis = value;
    }

    /**
     * Returns a JSON string representation of UnitOfBasisModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
