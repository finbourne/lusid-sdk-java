/**
 * Copyright © 2018 FINBOURNE TECHNOLOGY LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.finbourne.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UpsertCorporateActionRequest model.
 */
public class UpsertCorporateActionRequest {
    /**
     * The corporateActionId property.
     */
    @JsonProperty(value = "corporateActionId", required = true)
    private String corporateActionId;

    /**
     * The announcementDate property.
     */
    @JsonProperty(value = "announcementDate", required = true)
    private DateTime announcementDate;

    /**
     * The exDate property.
     */
    @JsonProperty(value = "exDate", required = true)
    private DateTime exDate;

    /**
     * The recordDate property.
     */
    @JsonProperty(value = "recordDate", required = true)
    private DateTime recordDate;

    /**
     * The paymentDate property.
     */
    @JsonProperty(value = "paymentDate", required = true)
    private DateTime paymentDate;

    /**
     * The transitions property.
     */
    @JsonProperty(value = "transitions", required = true)
    private List<CorporateActionTransitionDto> transitions;

    /**
     * Get the corporateActionId value.
     *
     * @return the corporateActionId value
     */
    public String corporateActionId() {
        return this.corporateActionId;
    }

    /**
     * Set the corporateActionId value.
     *
     * @param corporateActionId the corporateActionId value to set
     * @return the UpsertCorporateActionRequest object itself.
     */
    public UpsertCorporateActionRequest withCorporateActionId(String corporateActionId) {
        this.corporateActionId = corporateActionId;
        return this;
    }

    /**
     * Get the announcementDate value.
     *
     * @return the announcementDate value
     */
    public DateTime announcementDate() {
        return this.announcementDate;
    }

    /**
     * Set the announcementDate value.
     *
     * @param announcementDate the announcementDate value to set
     * @return the UpsertCorporateActionRequest object itself.
     */
    public UpsertCorporateActionRequest withAnnouncementDate(DateTime announcementDate) {
        this.announcementDate = announcementDate;
        return this;
    }

    /**
     * Get the exDate value.
     *
     * @return the exDate value
     */
    public DateTime exDate() {
        return this.exDate;
    }

    /**
     * Set the exDate value.
     *
     * @param exDate the exDate value to set
     * @return the UpsertCorporateActionRequest object itself.
     */
    public UpsertCorporateActionRequest withExDate(DateTime exDate) {
        this.exDate = exDate;
        return this;
    }

    /**
     * Get the recordDate value.
     *
     * @return the recordDate value
     */
    public DateTime recordDate() {
        return this.recordDate;
    }

    /**
     * Set the recordDate value.
     *
     * @param recordDate the recordDate value to set
     * @return the UpsertCorporateActionRequest object itself.
     */
    public UpsertCorporateActionRequest withRecordDate(DateTime recordDate) {
        this.recordDate = recordDate;
        return this;
    }

    /**
     * Get the paymentDate value.
     *
     * @return the paymentDate value
     */
    public DateTime paymentDate() {
        return this.paymentDate;
    }

    /**
     * Set the paymentDate value.
     *
     * @param paymentDate the paymentDate value to set
     * @return the UpsertCorporateActionRequest object itself.
     */
    public UpsertCorporateActionRequest withPaymentDate(DateTime paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * Get the transitions value.
     *
     * @return the transitions value
     */
    public List<CorporateActionTransitionDto> transitions() {
        return this.transitions;
    }

    /**
     * Set the transitions value.
     *
     * @param transitions the transitions value to set
     * @return the UpsertCorporateActionRequest object itself.
     */
    public UpsertCorporateActionRequest withTransitions(List<CorporateActionTransitionDto> transitions) {
        this.transitions = transitions;
        return this;
    }

}
