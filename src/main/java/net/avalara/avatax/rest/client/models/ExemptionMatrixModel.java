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
 * A single entry in a company's exemption matrix.
*  
* The exemption matrix holds, for each combination of exposure zone and exempt
* reason that a company has configured, the rule used to work out when a
* certificate for that combination expires, and the qualifying statement shown
* to the customer.
 */
public class ExemptionMatrixModel {


    private Integer id;

    /**
     * Getter for id
     *
     * A unique ID number representing this exemption matrix entry.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number representing this exemption matrix entry.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer exposureZoneId;

    /**
     * Getter for exposureZoneId
     *
     * The ID number of the exposure zone this entry applies to.
     */
    public Integer getExposureZoneId() {
        return this.exposureZoneId;
    }

    /**
     * Setter for exposureZoneId
     *
     * The ID number of the exposure zone this entry applies to.
     */
    public void setExposureZoneId(Integer value) {
        this.exposureZoneId = value;
    }

    private String exposureZoneName;

    /**
     * Getter for exposureZoneName
     *
     * The name of the exposure zone this entry applies to, for example "Alabama".
     */
    public String getExposureZoneName() {
        return this.exposureZoneName;
    }

    /**
     * Setter for exposureZoneName
     *
     * The name of the exposure zone this entry applies to, for example "Alabama".
     */
    public void setExposureZoneName(String value) {
        this.exposureZoneName = value;
    }

    private String exposureZoneTag;

    /**
     * Getter for exposureZoneTag
     *
     * The Avalara tag of the exposure zone, for example "AV_US_AL".
     */
    public String getExposureZoneTag() {
        return this.exposureZoneTag;
    }

    /**
     * Setter for exposureZoneTag
     *
     * The Avalara tag of the exposure zone, for example "AV_US_AL".
     */
    public void setExposureZoneTag(String value) {
        this.exposureZoneTag = value;
    }

    private Integer exemptReasonId;

    /**
     * Getter for exemptReasonId
     *
     * The ID number of the exempt reason this entry applies to.
     */
    public Integer getExemptReasonId() {
        return this.exemptReasonId;
    }

    /**
     * Setter for exemptReasonId
     *
     * The ID number of the exempt reason this entry applies to.
     */
    public void setExemptReasonId(Integer value) {
        this.exemptReasonId = value;
    }

    private String exemptReasonName;

    /**
     * Getter for exemptReasonName
     *
     * The name of the exempt reason this entry applies to, for example "Resale".
     */
    public String getExemptReasonName() {
        return this.exemptReasonName;
    }

    /**
     * Setter for exemptReasonName
     *
     * The name of the exempt reason this entry applies to, for example "Resale".
     */
    public void setExemptReasonName(String value) {
        this.exemptReasonName = value;
    }

    private String exemptReasonTag;

    /**
     * Getter for exemptReasonTag
     *
     * The Avalara tag of the exempt reason, for example "AV_OO_RESL".
     */
    public String getExemptReasonTag() {
        return this.exemptReasonTag;
    }

    /**
     * Setter for exemptReasonTag
     *
     * The Avalara tag of the exempt reason, for example "AV_OO_RESL".
     */
    public void setExemptReasonTag(String value) {
        this.exemptReasonTag = value;
    }

    private String timeLength;

    /**
     * Getter for timeLength
     *
     * The encoded rule used to calculate a certificate's expiration date from its
    * signed date. One of five markers, optionally combined with an interval:
    *  
    * * `IMM` - expires on the signed date.
    * * `NVR` - never expires; the expiration date is `9999-12-31`.
    * * `OVR` - no rule configured; an expiration date must be supplied when the
    *  certificate is recorded, otherwise recording it fails.
    * * `EOM` - end of the signing month, rolling to the next month when that is
    *  within 7 days of the signed date.
    * * `EOY` - end of the signing year, rolling to the next year when that is
    *  within 31 days of the signed date.
    *  
    * An interval may appear on its own or combined with `EOM` / `EOY`:
    * `36 months` is added to the signed date; `EOM+2 years` applies the marker and
    * then adds the interval; `18 months+EOY` adds the interval and then rounds up.
    * An interval is a whole number followed by a unit, most commonly `days`,
    * `months` or `years` - for example `30 days`, `36 months`, `2 years`.
     */
    public String getTimeLength() {
        return this.timeLength;
    }

    /**
     * Setter for timeLength
     *
     * The encoded rule used to calculate a certificate's expiration date from its
    * signed date. One of five markers, optionally combined with an interval:
    *  
    * * `IMM` - expires on the signed date.
    * * `NVR` - never expires; the expiration date is `9999-12-31`.
    * * `OVR` - no rule configured; an expiration date must be supplied when the
    *  certificate is recorded, otherwise recording it fails.
    * * `EOM` - end of the signing month, rolling to the next month when that is
    *  within 7 days of the signed date.
    * * `EOY` - end of the signing year, rolling to the next year when that is
    *  within 31 days of the signed date.
    *  
    * An interval may appear on its own or combined with `EOM` / `EOY`:
    * `36 months` is added to the signed date; `EOM+2 years` applies the marker and
    * then adds the interval; `18 months+EOY` adds the interval and then rounds up.
    * An interval is a whole number followed by a unit, most commonly `days`,
    * `months` or `years` - for example `30 days`, `36 months`, `2 years`.
     */
    public void setTimeLength(String value) {
        this.timeLength = value;
    }

    private String qualifyingStatement;

    /**
     * Getter for qualifyingStatement
     *
     * The statement the customer qualifies themselves against when they request a
    * certificate for this exposure zone and exempt reason, for display to the
    * customer. Null when none is configured.
     */
    public String getQualifyingStatement() {
        return this.qualifyingStatement;
    }

    /**
     * Setter for qualifyingStatement
     *
     * The statement the customer qualifies themselves against when they request a
    * certificate for this exposure zone and exempt reason, for display to the
    * customer. Null when none is configured.
     */
    public void setQualifyingStatement(String value) {
        this.qualifyingStatement = value;
    }

    /**
     * Returns a JSON string representation of ExemptionMatrixModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
