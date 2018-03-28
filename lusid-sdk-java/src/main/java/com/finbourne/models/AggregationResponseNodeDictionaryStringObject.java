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

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AggregationResponseNodeDictionaryStringObject model.
 */
public class AggregationResponseNodeDictionaryStringObject {
    /**
     * The groupPropertyKey property.
     */
    @JsonProperty(value = "groupPropertyKey")
    private String groupPropertyKey;

    /**
     * The groupPropertyValue property.
     */
    @JsonProperty(value = "groupPropertyValue")
    private String groupPropertyValue;

    /**
     * The idx property.
     */
    @JsonProperty(value = "idx")
    private Integer idx;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private Map<String, Object> properties;

    /**
     * The children property.
     */
    @JsonProperty(value = "children")
    private List<AggregationResponseNodeDictionaryStringObject> children;

    /**
     * Get the groupPropertyKey value.
     *
     * @return the groupPropertyKey value
     */
    public String groupPropertyKey() {
        return this.groupPropertyKey;
    }

    /**
     * Set the groupPropertyKey value.
     *
     * @param groupPropertyKey the groupPropertyKey value to set
     * @return the AggregationResponseNodeDictionaryStringObject object itself.
     */
    public AggregationResponseNodeDictionaryStringObject withGroupPropertyKey(String groupPropertyKey) {
        this.groupPropertyKey = groupPropertyKey;
        return this;
    }

    /**
     * Get the groupPropertyValue value.
     *
     * @return the groupPropertyValue value
     */
    public String groupPropertyValue() {
        return this.groupPropertyValue;
    }

    /**
     * Set the groupPropertyValue value.
     *
     * @param groupPropertyValue the groupPropertyValue value to set
     * @return the AggregationResponseNodeDictionaryStringObject object itself.
     */
    public AggregationResponseNodeDictionaryStringObject withGroupPropertyValue(String groupPropertyValue) {
        this.groupPropertyValue = groupPropertyValue;
        return this;
    }

    /**
     * Get the idx value.
     *
     * @return the idx value
     */
    public Integer idx() {
        return this.idx;
    }

    /**
     * Set the idx value.
     *
     * @param idx the idx value to set
     * @return the AggregationResponseNodeDictionaryStringObject object itself.
     */
    public AggregationResponseNodeDictionaryStringObject withIdx(Integer idx) {
        this.idx = idx;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public Map<String, Object> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the AggregationResponseNodeDictionaryStringObject object itself.
     */
    public AggregationResponseNodeDictionaryStringObject withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the children value.
     *
     * @return the children value
     */
    public List<AggregationResponseNodeDictionaryStringObject> children() {
        return this.children;
    }

    /**
     * Set the children value.
     *
     * @param children the children value to set
     * @return the AggregationResponseNodeDictionaryStringObject object itself.
     */
    public AggregationResponseNodeDictionaryStringObject withChildren(List<AggregationResponseNodeDictionaryStringObject> children) {
        this.children = children;
        return this;
    }

}
