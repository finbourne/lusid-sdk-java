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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AnalyticsItemDto model.
 */
public class AnalyticsItemDto {
    /**
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /**
     * The securityUid property.
     */
    @JsonProperty(value = "securityUid")
    private String securityUid;

    /**
     * The analyticDate property.
     */
    @JsonProperty(value = "analyticDate")
    private DateTime analyticDate;

    /**
     * The recipeScope property.
     */
    @JsonProperty(value = "recipeScope")
    private String recipeScope;

    /**
     * The recipeKey property.
     */
    @JsonProperty(value = "recipeKey", required = true)
    private String recipeKey;

    /**
     * The metricKey property.
     */
    @JsonProperty(value = "metricKey", required = true)
    private Map<String, Object> metricKey;

    /**
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private Map<String, Object> value;

    /**
     * Get the label value.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label value.
     *
     * @param label the label value to set
     * @return the AnalyticsItemDto object itself.
     */
    public AnalyticsItemDto withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the securityUid value.
     *
     * @return the securityUid value
     */
    public String securityUid() {
        return this.securityUid;
    }

    /**
     * Set the securityUid value.
     *
     * @param securityUid the securityUid value to set
     * @return the AnalyticsItemDto object itself.
     */
    public AnalyticsItemDto withSecurityUid(String securityUid) {
        this.securityUid = securityUid;
        return this;
    }

    /**
     * Get the analyticDate value.
     *
     * @return the analyticDate value
     */
    public DateTime analyticDate() {
        return this.analyticDate;
    }

    /**
     * Set the analyticDate value.
     *
     * @param analyticDate the analyticDate value to set
     * @return the AnalyticsItemDto object itself.
     */
    public AnalyticsItemDto withAnalyticDate(DateTime analyticDate) {
        this.analyticDate = analyticDate;
        return this;
    }

    /**
     * Get the recipeScope value.
     *
     * @return the recipeScope value
     */
    public String recipeScope() {
        return this.recipeScope;
    }

    /**
     * Set the recipeScope value.
     *
     * @param recipeScope the recipeScope value to set
     * @return the AnalyticsItemDto object itself.
     */
    public AnalyticsItemDto withRecipeScope(String recipeScope) {
        this.recipeScope = recipeScope;
        return this;
    }

    /**
     * Get the recipeKey value.
     *
     * @return the recipeKey value
     */
    public String recipeKey() {
        return this.recipeKey;
    }

    /**
     * Set the recipeKey value.
     *
     * @param recipeKey the recipeKey value to set
     * @return the AnalyticsItemDto object itself.
     */
    public AnalyticsItemDto withRecipeKey(String recipeKey) {
        this.recipeKey = recipeKey;
        return this;
    }

    /**
     * Get the metricKey value.
     *
     * @return the metricKey value
     */
    public Map<String, Object> metricKey() {
        return this.metricKey;
    }

    /**
     * Set the metricKey value.
     *
     * @param metricKey the metricKey value to set
     * @return the AnalyticsItemDto object itself.
     */
    public AnalyticsItemDto withMetricKey(Map<String, Object> metricKey) {
        this.metricKey = metricKey;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Map<String, Object> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the AnalyticsItemDto object itself.
     */
    public AnalyticsItemDto withValue(Map<String, Object> value) {
        this.value = value;
        return this;
    }

}
