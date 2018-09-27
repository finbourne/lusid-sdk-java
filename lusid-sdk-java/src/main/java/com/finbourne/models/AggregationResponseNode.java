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
 * The AggregationResponseNode model.
 */
public class AggregationResponseNode {
    /**
     * The key property.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * The depth property.
     */
    @JsonProperty(value = "depth")
    private Integer depth;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private Map<String, Object> properties;

    /**
     * The children property.
     */
    @JsonProperty(value = "children")
    private List<AggregationResponseNode> children;

    /**
     * Get the key value.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key value.
     *
     * @param key the key value to set
     * @return the AggregationResponseNode object itself.
     */
    public AggregationResponseNode withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the AggregationResponseNode object itself.
     */
    public AggregationResponseNode withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the depth value.
     *
     * @return the depth value
     */
    public Integer depth() {
        return this.depth;
    }

    /**
     * Set the depth value.
     *
     * @param depth the depth value to set
     * @return the AggregationResponseNode object itself.
     */
    public AggregationResponseNode withDepth(Integer depth) {
        this.depth = depth;
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
     * @return the AggregationResponseNode object itself.
     */
    public AggregationResponseNode withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the children value.
     *
     * @return the children value
     */
    public List<AggregationResponseNode> children() {
        return this.children;
    }

    /**
     * Set the children value.
     *
     * @param children the children value to set
     * @return the AggregationResponseNode object itself.
     */
    public AggregationResponseNode withChildren(List<AggregationResponseNode> children) {
        this.children = children;
        return this;
    }

}
