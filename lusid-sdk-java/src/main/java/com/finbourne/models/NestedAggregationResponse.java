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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NestedAggregationResponse model.
 */
public class NestedAggregationResponse {
    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The data property.
     */
    @JsonProperty(value = "data")
    private AggregationResponseNodeOfDictionaryOfStringToObject data;

    /**
     * The aggregationCurrency property.
     */
    @JsonProperty(value = "aggregationCurrency")
    private String aggregationCurrency;

    /**
     * The dataSchema property.
     */
    @JsonProperty(value = "dataSchema")
    private ResultDataSchema dataSchema;

    /**
     * Get the href value.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the href value.
     *
     * @param href the href value to set
     * @return the NestedAggregationResponse object itself.
     */
    public NestedAggregationResponse withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public AggregationResponseNodeOfDictionaryOfStringToObject data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     * @return the NestedAggregationResponse object itself.
     */
    public NestedAggregationResponse withData(AggregationResponseNodeOfDictionaryOfStringToObject data) {
        this.data = data;
        return this;
    }

    /**
     * Get the aggregationCurrency value.
     *
     * @return the aggregationCurrency value
     */
    public String aggregationCurrency() {
        return this.aggregationCurrency;
    }

    /**
     * Set the aggregationCurrency value.
     *
     * @param aggregationCurrency the aggregationCurrency value to set
     * @return the NestedAggregationResponse object itself.
     */
    public NestedAggregationResponse withAggregationCurrency(String aggregationCurrency) {
        this.aggregationCurrency = aggregationCurrency;
        return this;
    }

    /**
     * Get the dataSchema value.
     *
     * @return the dataSchema value
     */
    public ResultDataSchema dataSchema() {
        return this.dataSchema;
    }

    /**
     * Set the dataSchema value.
     *
     * @param dataSchema the dataSchema value to set
     * @return the NestedAggregationResponse object itself.
     */
    public NestedAggregationResponse withDataSchema(ResultDataSchema dataSchema) {
        this.dataSchema = dataSchema;
        return this;
    }

}
