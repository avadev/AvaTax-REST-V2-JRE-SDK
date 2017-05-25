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
 * Represents a declaration of nexus within a particular taxing jurisdiction.
 */
public class NexusModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this declaration of nexus.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this declaration of nexus.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company that declared nexus.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company that declared nexus.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The two character ISO-3166 country code of the country in which this company declared nexus.
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The two character ISO-3166 country code of the country in which this company declared nexus.
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The two or three character ISO region code of the region, state, or province in which this company declared nexus.
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The two or three character ISO region code of the region, state, or province in which this company declared nexus.
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private JurisTypeId? jurisTypeId;

    /**
     * Getter for jurisTypeId;
     * The jurisdiction type of the jurisdiction in which this company declared nexus.
     */
    public JurisTypeId? getjurisTypeId() {;
        return this.jurisTypeId;;
    }

    /**
     * Setter for jurisTypeId;
     * The jurisdiction type of the jurisdiction in which this company declared nexus.
     */
    public void setjurisTypeId(JurisTypeId? value) {;
        this.jurisTypeId = value;;
    }


    private String jurisCode;

    /**
     * Getter for jurisCode;
     * The code identifying the jurisdiction in which this company declared nexus.
     */
    public String getjurisCode() {;
        return this.jurisCode;;
    }

    /**
     * Setter for jurisCode;
     * The code identifying the jurisdiction in which this company declared nexus.
     */
    public void setjurisCode(String value) {;
        this.jurisCode = value;;
    }


    private String jurisName;

    /**
     * Getter for jurisName;
     * The common name of the jurisdiction in which this company declared nexus.
     */
    public String getjurisName() {;
        return this.jurisName;;
    }

    /**
     * Setter for jurisName;
     * The common name of the jurisdiction in which this company declared nexus.
     */
    public void setjurisName(String value) {;
        this.jurisName = value;;
    }


    private DateTime? effectiveDate;

    /**
     * Getter for effectiveDate;
     * The date when this nexus began. If not known, set to null.
     */
    public DateTime? geteffectiveDate() {;
        return this.effectiveDate;;
    }

    /**
     * Setter for effectiveDate;
     * The date when this nexus began. If not known, set to null.
     */
    public void seteffectiveDate(DateTime? value) {;
        this.effectiveDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * If this nexus will end or has ended on a specific date, set this to the date when this nexus ends.
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * If this nexus will end or has ended on a specific date, set this to the date when this nexus ends.
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private String shortName;

    /**
     * Getter for shortName;
     * The short name of the jurisdiction.
     */
    public String getshortName() {;
        return this.shortName;;
    }

    /**
     * Setter for shortName;
     * The short name of the jurisdiction.
     */
    public void setshortName(String value) {;
        this.shortName = value;;
    }


    private String signatureCode;

    /**
     * Getter for signatureCode;
     * The signature code of the boundary region as defined by Avalara.
     */
    public String getsignatureCode() {;
        return this.signatureCode;;
    }

    /**
     * Setter for signatureCode;
     * The signature code of the boundary region as defined by Avalara.
     */
    public void setsignatureCode(String value) {;
        this.signatureCode = value;;
    }


    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo;
     * The state assigned number of this jurisdiction.
     */
    public String getstateAssignedNo() {;
        return this.stateAssignedNo;;
    }

    /**
     * Setter for stateAssignedNo;
     * The state assigned number of this jurisdiction.
     */
    public void setstateAssignedNo(String value) {;
        this.stateAssignedNo = value;;
    }


    private NexusTypeId? nexusTypeId;

    /**
     * Getter for nexusTypeId;
     * (DEPRECATED) The type of nexus that this company is declaring.
    * Please use NexusTaxTypeGroupId instead.
     */
    public NexusTypeId? getnexusTypeId() {;
        return this.nexusTypeId;;
    }

    /**
     * Setter for nexusTypeId;
     * (DEPRECATED) The type of nexus that this company is declaring.
    * Please use NexusTaxTypeGroupId instead.
     */
    public void setnexusTypeId(NexusTypeId? value) {;
        this.nexusTypeId = value;;
    }


    private Sourcing? sourcing;

    /**
     * Getter for sourcing;
     * Indicates whether this nexus is defined as origin or destination nexus.
     */
    public Sourcing? getsourcing() {;
        return this.sourcing;;
    }

    /**
     * Setter for sourcing;
     * Indicates whether this nexus is defined as origin or destination nexus.
     */
    public void setsourcing(Sourcing? value) {;
        this.sourcing = value;;
    }


    private Boolean? hasLocalNexus;

    /**
     * Getter for hasLocalNexus;
     * True if you are also declaring local nexus within this jurisdiction.
    * Many U.S. states have options for declaring nexus in local jurisdictions as well as within the state.
     */
    public Boolean? gethasLocalNexus() {;
        return this.hasLocalNexus;;
    }

    /**
     * Setter for hasLocalNexus;
     * True if you are also declaring local nexus within this jurisdiction.
    * Many U.S. states have options for declaring nexus in local jurisdictions as well as within the state.
     */
    public void sethasLocalNexus(Boolean? value) {;
        this.hasLocalNexus = value;;
    }


    private LocalNexusTypeId? localNexusTypeId;

    /**
     * Getter for localNexusTypeId;
     * If you are declaring local nexus within this jurisdiction, this indicates whether you are declaring only 
    * a specified list of local jurisdictions, all state-administered local jurisdictions, or all local jurisdictions.
     */
    public LocalNexusTypeId? getlocalNexusTypeId() {;
        return this.localNexusTypeId;;
    }

    /**
     * Setter for localNexusTypeId;
     * If you are declaring local nexus within this jurisdiction, this indicates whether you are declaring only 
    * a specified list of local jurisdictions, all state-administered local jurisdictions, or all local jurisdictions.
     */
    public void setlocalNexusTypeId(LocalNexusTypeId? value) {;
        this.localNexusTypeId = value;;
    }


    private Boolean? hasPermanentEstablishment;

    /**
     * Getter for hasPermanentEstablishment;
     * Set this value to true if your company has a permanent establishment within this jurisdiction.
     */
    public Boolean? gethasPermanentEstablishment() {;
        return this.hasPermanentEstablishment;;
    }

    /**
     * Setter for hasPermanentEstablishment;
     * Set this value to true if your company has a permanent establishment within this jurisdiction.
     */
    public void sethasPermanentEstablishment(Boolean? value) {;
        this.hasPermanentEstablishment = value;;
    }


    private String taxId;

    /**
     * Getter for taxId;
     * Optional - the tax identification number under which you declared nexus.
     */
    public String gettaxId() {;
        return this.taxId;;
    }

    /**
     * Setter for taxId;
     * Optional - the tax identification number under which you declared nexus.
     */
    public void settaxId(String value) {;
        this.taxId = value;;
    }


    private Boolean? streamlinedSalesTax;

    /**
     * Getter for streamlinedSalesTax;
     * For the United States, this flag indicates whether this particular nexus falls within a U.S. State that participates 
    * in the Streamlined Sales Tax program. For countries other than the US, this flag is null.
     */
    public Boolean? getstreamlinedSalesTax() {;
        return this.streamlinedSalesTax;;
    }

    /**
     * Setter for streamlinedSalesTax;
     * For the United States, this flag indicates whether this particular nexus falls within a U.S. State that participates 
    * in the Streamlined Sales Tax program. For countries other than the US, this flag is null.
     */
    public void setstreamlinedSalesTax(Boolean? value) {;
        this.streamlinedSalesTax = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    private String nexusTaxTypeGroup;

    /**
     * Getter for nexusTaxTypeGroup;
     * The type of nexus that this company is declaring.Replaces NexusTypeId.
    * Use /api/v2/definitions/nexustaxtypegroup for a list of tax type groups.
     */
    public String getnexusTaxTypeGroup() {;
        return this.nexusTaxTypeGroup;;
    }

    /**
     * Setter for nexusTaxTypeGroup;
     * The type of nexus that this company is declaring.Replaces NexusTypeId.
    * Use /api/v2/definitions/nexustaxtypegroup for a list of tax type groups.
     */
    public void setnexusTaxTypeGroup(String value) {;
        this.nexusTaxTypeGroup = value;;
    }


    /**
     * Returns a JSON string representation of NexusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
