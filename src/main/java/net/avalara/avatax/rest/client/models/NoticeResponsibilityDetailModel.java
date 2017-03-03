package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * NoticeResponsibility Model
 */
public class NoticeResponsibilityDetailModel {
    private Integer id;

    /**
     * Getter for id - NoticeResponsibility Model
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - NoticeResponsibility Model
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Integer noticeId;

    /**
     * Getter for noticeId - NoticeResponsibility Model
     */
    public Integer getNoticeId() {
        return this.noticeId;
    }

    /**
     * Setter for noticeId - NoticeResponsibility Model
     */
    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    
    private Integer taxNoticeResponsibilityId;

    /**
     * Getter for taxNoticeResponsibilityId - NoticeResponsibility Model
     */
    public Integer getTaxNoticeResponsibilityId() {
        return this.taxNoticeResponsibilityId;
    }

    /**
     * Setter for taxNoticeResponsibilityId - NoticeResponsibility Model
     */
    public void setTaxNoticeResponsibilityId(Integer taxNoticeResponsibilityId) {
        this.taxNoticeResponsibilityId = taxNoticeResponsibilityId;
    }

    
    private String description;

    /**
     * Getter for description - NoticeResponsibility Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - NoticeResponsibility Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    


    /**
     * Returns a JSON string representation of NoticeResponsibilityDetailModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    