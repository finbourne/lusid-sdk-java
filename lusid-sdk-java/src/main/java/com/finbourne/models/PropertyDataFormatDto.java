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
 * The PropertyDataFormatDto model.
 */
public class PropertyDataFormatDto {
    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * Possible values include: 'Basic', 'Limited', 'Currency'.
     */
    @JsonProperty(value = "formatType")
    private String formatType;

    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private ResourceId id;

    /**
     * The order property.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Possible values include: 'String', 'Int', 'Decimal', 'DateTime',
     * 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage', 'Currency',
     * 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTxnAliases',
     * 'ArrayofTxnMovements'.
     */
    @JsonProperty(value = "valueType")
    private String valueType;

    /**
     * The acceptableValues property.
     */
    @JsonProperty(value = "acceptableValues")
    private List<Object> acceptableValues;

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
     * @return the PropertyDataFormatDto object itself.
     */
    public PropertyDataFormatDto withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get possible values include: 'Basic', 'Limited', 'Currency'.
     *
     * @return the formatType value
     */
    public String formatType() {
        return this.formatType;
    }

    /**
     * Set possible values include: 'Basic', 'Limited', 'Currency'.
     *
     * @param formatType the formatType value to set
     * @return the PropertyDataFormatDto object itself.
     */
    public PropertyDataFormatDto withFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public ResourceId id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the PropertyDataFormatDto object itself.
     */
    public PropertyDataFormatDto withId(ResourceId id) {
        this.id = id;
        return this;
    }

    /**
     * Get the order value.
     *
     * @return the order value
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order value.
     *
     * @param order the order value to set
     * @return the PropertyDataFormatDto object itself.
     */
    public PropertyDataFormatDto withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the PropertyDataFormatDto object itself.
     */
    public PropertyDataFormatDto withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get possible values include: 'String', 'Int', 'Decimal', 'DateTime', 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage', 'Currency', 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTxnAliases', 'ArrayofTxnMovements'.
     *
     * @return the valueType value
     */
    public String valueType() {
        return this.valueType;
    }

    /**
     * Set possible values include: 'String', 'Int', 'Decimal', 'DateTime', 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage', 'Currency', 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTxnAliases', 'ArrayofTxnMovements'.
     *
     * @param valueType the valueType value to set
     * @return the PropertyDataFormatDto object itself.
     */
    public PropertyDataFormatDto withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * Get the acceptableValues value.
     *
     * @return the acceptableValues value
     */
    public List<Object> acceptableValues() {
        return this.acceptableValues;
    }

    /**
     * Set the acceptableValues value.
     *
     * @param acceptableValues the acceptableValues value to set
     * @return the PropertyDataFormatDto object itself.
     */
    public PropertyDataFormatDto withAcceptableValues(List<Object> acceptableValues) {
        this.acceptableValues = acceptableValues;
        return this;
    }

}
