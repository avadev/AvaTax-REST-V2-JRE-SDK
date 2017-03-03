package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * NoticeRootCause Model
 */
public class NoticeRootCauseDetailModel {
    private Integer id;

    /**
     * Getter for id - NoticeRootCause Model
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - NoticeRootCause Model
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Integer noticeId;

    /**
     * Getter for noticeId - NoticeRootCause Model
     */
    public Integer getNoticeId() {
        return this.noticeId;
    }

    /**
     * Setter for noticeId - NoticeRootCause Model
     */
    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    
    private Integer taxNoticeRootCauseId;

    /**
     * Getter for taxNoticeRootCauseId - NoticeRootCause Model
     */
    public Integer getTaxNoticeRootCauseId() {
        return this.taxNoticeRootCauseId;
    }

    /**
     * Setter for taxNoticeRootCauseId - NoticeRootCause Model
     */
    public void setTaxNoticeRootCauseId(Integer taxNoticeRootCauseId) {
        this.taxNoticeRootCauseId = taxNoticeRootCauseId;
    }

    
    private String description;

    /**
     * Getter for description - NoticeRootCause Model
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - NoticeRootCause Model
     */
    public void setDescription(String description) {
        this.description = description;
    }

    


    /**
     * Returns a JSON string representation of NoticeRootCauseDetailModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    