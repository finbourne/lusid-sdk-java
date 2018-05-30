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
 * Specification object for the parameters of an aggregation.
 */
public class AggregationRequest {
    /**
     * The recipeScope property.
     */
    @JsonProperty(value = "recipeScope")
    private String recipeScope;

    /**
     * The recipeKey property.
     */
    @JsonProperty(value = "recipeKey")
    private String recipeKey;

    /**
     * The loadReferencePortfolio property.
     */
    @JsonProperty(value = "loadReferencePortfolio")
    private Boolean loadReferencePortfolio;

    /**
     * The asAt date to use.
     */
    @JsonProperty(value = "asAt")
    private DateTime asAt;

    /**
     * The effectiveAt property.
     */
    @JsonProperty(value = "effectiveAt")
    private DateTime effectiveAt;

    /**
     * The metrics property.
     */
    @JsonProperty(value = "metrics")
    private List<AggregateSpec> metrics;

    /**
     * The groupBy property.
     */
    @JsonProperty(value = "groupBy")
    private List<String> groupBy;

    /**
     * The filters property.
     */
    @JsonProperty(value = "filters")
    private List<PropertyFilter> filters;

    /**
     * The limit property.
     */
    @JsonProperty(value = "limit")
    private Integer limit;

    /**
     * The sort property.
     */
    @JsonProperty(value = "sort")
    private String sort;

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
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withRecipeScope(String recipeScope) {
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
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withRecipeKey(String recipeKey) {
        this.recipeKey = recipeKey;
        return this;
    }

    /**
     * Get the loadReferencePortfolio value.
     *
     * @return the loadReferencePortfolio value
     */
    public Boolean loadReferencePortfolio() {
        return this.loadReferencePortfolio;
    }

    /**
     * Set the loadReferencePortfolio value.
     *
     * @param loadReferencePortfolio the loadReferencePortfolio value to set
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withLoadReferencePortfolio(Boolean loadReferencePortfolio) {
        this.loadReferencePortfolio = loadReferencePortfolio;
        return this;
    }

    /**
     * Get the asAt date to use.
     *
     * @return the asAt value
     */
    public DateTime asAt() {
        return this.asAt;
    }

    /**
     * Set the asAt date to use.
     *
     * @param asAt the asAt value to set
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withAsAt(DateTime asAt) {
        this.asAt = asAt;
        return this;
    }

    /**
     * Get the effectiveAt value.
     *
     * @return the effectiveAt value
     */
    public DateTime effectiveAt() {
        return this.effectiveAt;
    }

    /**
     * Set the effectiveAt value.
     *
     * @param effectiveAt the effectiveAt value to set
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withEffectiveAt(DateTime effectiveAt) {
        this.effectiveAt = effectiveAt;
        return this;
    }

    /**
     * Get the metrics value.
     *
     * @return the metrics value
     */
    public List<AggregateSpec> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics value.
     *
     * @param metrics the metrics value to set
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withMetrics(List<AggregateSpec> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the groupBy value.
     *
     * @return the groupBy value
     */
    public List<String> groupBy() {
        return this.groupBy;
    }

    /**
     * Set the groupBy value.
     *
     * @param groupBy the groupBy value to set
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * Get the filters value.
     *
     * @return the filters value
     */
    public List<PropertyFilter> filters() {
        return this.filters;
    }

    /**
     * Set the filters value.
     *
     * @param filters the filters value to set
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withFilters(List<PropertyFilter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the limit value.
     *
     * @return the limit value
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Set the limit value.
     *
     * @param limit the limit value to set
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the sort value.
     *
     * @return the sort value
     */
    public String sort() {
        return this.sort;
    }

    /**
     * Set the sort value.
     *
     * @param sort the sort value to set
     * @return the AggregationRequest object itself.
     */
    public AggregationRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

}
