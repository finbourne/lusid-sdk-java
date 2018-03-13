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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AggregationResponseNodeIDataRecord model.
 */
public class AggregationResponseNodeIDataRecord {
    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The idx property.
     */
    @JsonProperty(value = "idx")
    private Integer idx;

    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private QualifiedId id;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private IDataRecord properties;

    /**
     * The children property.
     */
    @JsonProperty(value = "children")
    private List<AggregationResponseNodeIDataRecord> children;

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the AggregationResponseNodeIDataRecord object itself.
     */
    public AggregationResponseNodeIDataRecord withDescription(String description) {
        this.description = description;
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
     * @return the AggregationResponseNodeIDataRecord object itself.
     */
    public AggregationResponseNodeIDataRecord withIdx(Integer idx) {
        this.idx = idx;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public QualifiedId id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the AggregationResponseNodeIDataRecord object itself.
     */
    public AggregationResponseNodeIDataRecord withId(QualifiedId id) {
        this.id = id;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public IDataRecord properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the AggregationResponseNodeIDataRecord object itself.
     */
    public AggregationResponseNodeIDataRecord withProperties(IDataRecord properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the children value.
     *
     * @return the children value
     */
    public List<AggregationResponseNodeIDataRecord> children() {
        return this.children;
    }

    /**
     * Set the children value.
     *
     * @param children the children value to set
     * @return the AggregationResponseNodeIDataRecord object itself.
     */
    public AggregationResponseNodeIDataRecord withChildren(List<AggregationResponseNodeIDataRecord> children) {
        this.children = children;
        return this;
    }

}
