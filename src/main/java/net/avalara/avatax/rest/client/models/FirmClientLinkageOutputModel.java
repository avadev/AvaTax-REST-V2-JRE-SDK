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
 * Account Linkage output model
 */
public class FirmClientLinkageOutputModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of firm-client linkage.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of firm-client linkage.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer firmAccountId;

    /**
     * Getter for firmAccountId
     *
     * Firm Account to be linked with the firm
	 * 
     */
    public Integer getFirmAccountId() {
        return this.firmAccountId;
    }

    /**
     * Setter for firmAccountId
     *
     * Firm Account to be linked with the firm
     */
    public void setFirmAccountId(Integer value) {
        this.firmAccountId = value;
    }

    private String firmAccountName;

    /**
     * Getter for firmAccountName
     *
     * FIrm Account name
	 * 
     */
    public String getFirmAccountName() {
        return this.firmAccountName;
    }

    /**
     * Setter for firmAccountName
     *
     * FIrm Account name
     */
    public void setFirmAccountName(String value) {
        this.firmAccountName = value;
    }

    private Integer clientAccountId;

    /**
     * Getter for clientAccountId
     *
     * Client Account to be linked with the firm
	 * 
     */
    public Integer getClientAccountId() {
        return this.clientAccountId;
    }

    /**
     * Setter for clientAccountId
     *
     * Client Account to be linked with the firm
     */
    public void setClientAccountId(Integer value) {
        this.clientAccountId = value;
    }

    private String clientAccountName;

    /**
     * Getter for clientAccountName
     *
     * Client Account name
	 * 
     */
    public String getClientAccountName() {
        return this.clientAccountName;
    }

    /**
     * Setter for clientAccountName
     *
     * Client Account name
     */
    public void setClientAccountName(String value) {
        this.clientAccountName = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * Created date of the linkage
	 * 
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * Created date of the linkage
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * User who created the linkage
	 * 
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * User who created the linkage
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * Modified date of the linkage
	 * 
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * Modified date of the linkage
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * User who modified the linkage
	 * 
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * User who modified the linkage
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    private FirmClientLinkageStatus status;

    /**
     * Getter for status
     *
     * The status of the account linkage. The following are the available statuses
    * * Requested - When a linkage is requested
    * * Approved - When the linkage is approved
    * * Rejected - When the linkage is rejected
    * * Revoked - When the linkage is revoked.
	 * 
     */
    public FirmClientLinkageStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of the account linkage. The following are the available statuses
    * * Requested - When a linkage is requested
    * * Approved - When the linkage is approved
    * * Rejected - When the linkage is rejected
    * * Revoked - When the linkage is revoked.
     */
    public void setStatus(FirmClientLinkageStatus value) {
        this.status = value;
    }

    private Boolean isDeleted;

    /**
     * Getter for isDeleted
     *
     * This is set to 1 if the linkage is deleted.
	 * 
     */
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for isDeleted
     *
     * This is set to 1 if the linkage is deleted.
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    private String firmContactName;

    /**
     * Getter for firmContactName
     *
     * Name of the firm's point of contact person for the client
	 * 
     */
    public String getFirmContactName() {
        return this.firmContactName;
    }

    /**
     * Setter for firmContactName
     *
     * Name of the firm's point of contact person for the client
     */
    public void setFirmContactName(String value) {
        this.firmContactName = value;
    }

    private String firmContactEmail;

    /**
     * Getter for firmContactEmail
     *
     * Email of the firm's point of contact person for the client
	 * 
     */
    public String getFirmContactEmail() {
        return this.firmContactEmail;
    }

    /**
     * Setter for firmContactEmail
     *
     * Email of the firm's point of contact person for the client
     */
    public void setFirmContactEmail(String value) {
        this.firmContactEmail = value;
    }

    /**
     * Returns a JSON string representation of FirmClientLinkageOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
