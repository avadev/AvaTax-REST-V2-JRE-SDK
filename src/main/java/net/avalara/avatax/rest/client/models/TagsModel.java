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
 * Represents a tag for an item in your company's product catalog.
 */
public class TagsModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of the tag.
	 * 
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of the tag.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private String tagName;

    /**
     * Getter for tagName
     *
     * The tag name.
	 * 
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * Setter for tagName
     *
     * The tag name.
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

    /**
     * Returns a JSON string representation of TagsModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
