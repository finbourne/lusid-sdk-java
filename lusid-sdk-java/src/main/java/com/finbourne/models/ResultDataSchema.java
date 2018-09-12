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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResultDataSchema model.
 */
public class ResultDataSchema {
    /**
     * The nodeValueSchema property.
     */
    @JsonProperty(value = "nodeValueSchema")
    private List<KeyValuePairOfPropertyKeyToFieldSchema> nodeValueSchema;

    /**
     * The propertySchema property.
     */
    @JsonProperty(value = "propertySchema")
    private Map<String, FieldSchema> propertySchema;

    /**
     * Get the nodeValueSchema value.
     *
     * @return the nodeValueSchema value
     */
    public List<KeyValuePairOfPropertyKeyToFieldSchema> nodeValueSchema() {
        return this.nodeValueSchema;
    }

    /**
     * Set the nodeValueSchema value.
     *
     * @param nodeValueSchema the nodeValueSchema value to set
     * @return the ResultDataSchema object itself.
     */
    public ResultDataSchema withNodeValueSchema(List<KeyValuePairOfPropertyKeyToFieldSchema> nodeValueSchema) {
        this.nodeValueSchema = nodeValueSchema;
        return this;
    }

    /**
     * Get the propertySchema value.
     *
     * @return the propertySchema value
     */
    public Map<String, FieldSchema> propertySchema() {
        return this.propertySchema;
    }

    /**
     * Set the propertySchema value.
     *
     * @param propertySchema the propertySchema value to set
     * @return the ResultDataSchema object itself.
     */
    public ResultDataSchema withPropertySchema(Map<String, FieldSchema> propertySchema) {
        this.propertySchema = propertySchema;
        return this;
    }

}
