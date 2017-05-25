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
 * NoticeResponsibility Model
 */
public class NoticeResponsibilityDetailModel {


    private Int32? id;

    /**
     * Getter for id;
     * The unique ID number of this filing frequency.
     */
    public Int32? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this filing frequency.
     */
    public void setid(Int32? value) {;
        this.id = value;;
    }


    private Int32 noticeId;

    /**
     * Getter for noticeId;
     * TaxNoticeId
     */
    public Int32 getnoticeId() {;
        return this.noticeId;;
    }

    /**
     * Setter for noticeId;
     * TaxNoticeId
     */
    public void setnoticeId(Int32 value) {;
        this.noticeId = value;;
    }


    private Int32 taxNoticeResponsibilityId;

    /**
     * Getter for taxNoticeResponsibilityId;
     * TaxNoticeResponsibilityId
     */
    public Int32 gettaxNoticeResponsibilityId() {;
        return this.taxNoticeResponsibilityId;;
    }

    /**
     * Setter for taxNoticeResponsibilityId;
     * TaxNoticeResponsibilityId
     */
    public void settaxNoticeResponsibilityId(Int32 value) {;
        this.taxNoticeResponsibilityId = value;;
    }


    private String description;

    /**
     * Getter for description;
     * The description name of this filing frequency
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * The description name of this filing frequency
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    /**
     * Returns a JSON string representation of NoticeResponsibilityDetailModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
