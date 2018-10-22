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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FieldSchema model.
 */
public class FieldSchema {
    /**
     * The scope property.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Possible values include: 'String', 'Int', 'Decimal', 'DateTime',
     * 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage',
     * 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds',
     * 'ArrayOfTransactionAliases', 'ArrayofTransactionMovements',
     * 'ArrayofUnits', 'StringArray', 'CurrencyAndAmount', 'TradePrice',
     * 'UnitCreation', 'Currency', 'UserId', 'MetricValue', 'ArrayOfQuotes'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The isMetric property.
     */
    @JsonProperty(value = "isMetric")
    private Boolean isMetric;

    /**
     * The displayOrder property.
     */
    @JsonProperty(value = "displayOrder")
    private Integer displayOrder;

    /**
     * The propertySchema property.
     */
    @JsonProperty(value = "propertySchema")
    private Map<String, FieldSchema> propertySchema;

    /**
     * Get the scope value.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope value.
     *
     * @param scope the scope value to set
     * @return the FieldSchema object itself.
     */
    public FieldSchema withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the FieldSchema object itself.
     */
    public FieldSchema withName(String name) {
        this.name = name;
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
     * @return the FieldSchema object itself.
     */
    public FieldSchema withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get possible values include: 'String', 'Int', 'Decimal', 'DateTime', 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage', 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTransactionAliases', 'ArrayofTransactionMovements', 'ArrayofUnits', 'StringArray', 'CurrencyAndAmount', 'TradePrice', 'UnitCreation', 'Currency', 'UserId', 'MetricValue', 'ArrayOfQuotes'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set possible values include: 'String', 'Int', 'Decimal', 'DateTime', 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage', 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTransactionAliases', 'ArrayofTransactionMovements', 'ArrayofUnits', 'StringArray', 'CurrencyAndAmount', 'TradePrice', 'UnitCreation', 'Currency', 'UserId', 'MetricValue', 'ArrayOfQuotes'.
     *
     * @param type the type value to set
     * @return the FieldSchema object itself.
     */
    public FieldSchema withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the isMetric value.
     *
     * @return the isMetric value
     */
    public Boolean isMetric() {
        return this.isMetric;
    }

    /**
     * Set the isMetric value.
     *
     * @param isMetric the isMetric value to set
     * @return the FieldSchema object itself.
     */
    public FieldSchema withIsMetric(Boolean isMetric) {
        this.isMetric = isMetric;
        return this;
    }

    /**
     * Get the displayOrder value.
     *
     * @return the displayOrder value
     */
    public Integer displayOrder() {
        return this.displayOrder;
    }

    /**
     * Set the displayOrder value.
     *
     * @param displayOrder the displayOrder value to set
     * @return the FieldSchema object itself.
     */
    public FieldSchema withDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
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
     * @return the FieldSchema object itself.
     */
    public FieldSchema withPropertySchema(Map<String, FieldSchema> propertySchema) {
        this.propertySchema = propertySchema;
        return this;
    }

}
