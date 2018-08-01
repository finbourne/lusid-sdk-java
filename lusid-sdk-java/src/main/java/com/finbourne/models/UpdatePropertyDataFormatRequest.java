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
 * The UpdatePropertyDataFormatRequest model.
 */
public class UpdatePropertyDataFormatRequest {
    /**
     * Possible values include: 'Open', 'Closed'.
     */
    @JsonProperty(value = "formatType", required = true)
    private String formatType;

    /**
     * The order property.
     */
    @JsonProperty(value = "order", required = true)
    private int order;

    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /**
     * The description property.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Possible values include: 'String', 'Int', 'Decimal', 'DateTime',
     * 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage',
     * 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTxnAliases',
     * 'ArrayofTxnMovements', 'ArrayofUnits', 'StringArray', 'UnitCreation'.
     */
    @JsonProperty(value = "valueType", required = true)
    private String valueType;

    /**
     * The acceptableValues property.
     */
    @JsonProperty(value = "acceptableValues")
    private List<Object> acceptableValues;

    /**
     * Possible values include: 'NoUnits', 'Basic', 'Iso4217Currency'.
     */
    @JsonProperty(value = "unitSchema", access = JsonProperty.Access.WRITE_ONLY)
    private String unitSchema;

    /**
     * The acceptableUnits property.
     */
    @JsonProperty(value = "acceptableUnits", access = JsonProperty.Access.WRITE_ONLY)
    private List<CreateUnitDefinition> acceptableUnits;

    /**
     * Get possible values include: 'Open', 'Closed'.
     *
     * @return the formatType value
     */
    public String formatType() {
        return this.formatType;
    }

    /**
     * Set possible values include: 'Open', 'Closed'.
     *
     * @param formatType the formatType value to set
     * @return the UpdatePropertyDataFormatRequest object itself.
     */
    public UpdatePropertyDataFormatRequest withFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }

    /**
     * Get the order value.
     *
     * @return the order value
     */
    public int order() {
        return this.order;
    }

    /**
     * Set the order value.
     *
     * @param order the order value to set
     * @return the UpdatePropertyDataFormatRequest object itself.
     */
    public UpdatePropertyDataFormatRequest withOrder(int order) {
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
     * @return the UpdatePropertyDataFormatRequest object itself.
     */
    public UpdatePropertyDataFormatRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

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
     * @return the UpdatePropertyDataFormatRequest object itself.
     */
    public UpdatePropertyDataFormatRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get possible values include: 'String', 'Int', 'Decimal', 'DateTime', 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage', 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTxnAliases', 'ArrayofTxnMovements', 'ArrayofUnits', 'StringArray', 'UnitCreation'.
     *
     * @return the valueType value
     */
    public String valueType() {
        return this.valueType;
    }

    /**
     * Set possible values include: 'String', 'Int', 'Decimal', 'DateTime', 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage', 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTxnAliases', 'ArrayofTxnMovements', 'ArrayofUnits', 'StringArray', 'UnitCreation'.
     *
     * @param valueType the valueType value to set
     * @return the UpdatePropertyDataFormatRequest object itself.
     */
    public UpdatePropertyDataFormatRequest withValueType(String valueType) {
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
     * @return the UpdatePropertyDataFormatRequest object itself.
     */
    public UpdatePropertyDataFormatRequest withAcceptableValues(List<Object> acceptableValues) {
        this.acceptableValues = acceptableValues;
        return this;
    }

    /**
     * Get possible values include: 'NoUnits', 'Basic', 'Iso4217Currency'.
     *
     * @return the unitSchema value
     */
    public String unitSchema() {
        return this.unitSchema;
    }

    /**
     * Get the acceptableUnits value.
     *
     * @return the acceptableUnits value
     */
    public List<CreateUnitDefinition> acceptableUnits() {
        return this.acceptableUnits;
    }

}
