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
 * NoticeRootCause Model
 */
public class NoticeRootCauseDetailModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this filing frequency.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this filing frequency.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer noticeId;

    /**
     * Getter for noticeId
     *
     * TaxNoticeId
     */
    public Integer getNoticeId() {
        return this.noticeId;
    }

    /**
     * Setter for noticeId
     *
     * TaxNoticeId
     */
    public void setNoticeId(Integer value) {
        this.noticeId = value;
    }


    private Integer taxNoticeRootCauseId;

    /**
     * Getter for taxNoticeRootCauseId
     *
     * TaxNoticeRootCauseId
     */
    public Integer getTaxNoticeRootCauseId() {
        return this.taxNoticeRootCauseId;
    }

    /**
     * Setter for taxNoticeRootCauseId
     *
     * TaxNoticeRootCauseId
     */
    public void setTaxNoticeRootCauseId(Integer value) {
        this.taxNoticeRootCauseId = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * The description name of this root cause
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description name of this root cause
     */
    public void setDescription(String value) {
        this.description = value;
    }


    /**
     * Returns a JSON string representation of NoticeRootCauseDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
