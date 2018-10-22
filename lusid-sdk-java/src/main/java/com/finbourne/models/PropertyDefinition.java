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
 * The PropertyDefinition model.
 */
public class PropertyDefinition {
    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The key property.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Possible values include: 'String', 'Int', 'Decimal', 'DateTime',
     * 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage',
     * 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds',
     * 'ArrayOfTransactionAliases', 'ArrayofTransactionMovements',
     * 'ArrayofUnits', 'StringArray', 'CurrencyAndAmount', 'TradePrice',
     * 'UnitCreation', 'Currency', 'UserId', 'MetricValue', 'ArrayOfQuotes'.
     */
    @JsonProperty(value = "valueType")
    private String valueType;

    /**
     * The valueRequired property.
     */
    @JsonProperty(value = "valueRequired")
    private Boolean valueRequired;

    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The dataTypeId property.
     */
    @JsonProperty(value = "dataTypeId")
    private ResourceId dataTypeId;

    /**
     * Possible values include: 'Perpetual', 'TimeVariant'.
     */
    @JsonProperty(value = "lifeTime")
    private String lifeTime;

    /**
     * Possible values include: 'Label', 'Metric'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Possible values include: 'NoUnits', 'Basic', 'Iso4217Currency'.
     */
    @JsonProperty(value = "unitSchema")
    private String unitSchema;

    /**
     * Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding',
     * 'ReferenceHolding', 'TxnType'.
     */
    @JsonProperty(value = "domain", access = JsonProperty.Access.WRITE_ONLY)
    private String domain;

    /**
     * The scope property.
     */
    @JsonProperty(value = "scope", access = JsonProperty.Access.WRITE_ONLY)
    private String scope;

    /**
     * The code property.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The links property.
     */
    @JsonProperty(value = "links")
    private List<Link> links;

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
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withHref(String href) {
        this.href = href;
        return this;
    }

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
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get possible values include: 'String', 'Int', 'Decimal', 'DateTime', 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage', 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTransactionAliases', 'ArrayofTransactionMovements', 'ArrayofUnits', 'StringArray', 'CurrencyAndAmount', 'TradePrice', 'UnitCreation', 'Currency', 'UserId', 'MetricValue', 'ArrayOfQuotes'.
     *
     * @return the valueType value
     */
    public String valueType() {
        return this.valueType;
    }

    /**
     * Set possible values include: 'String', 'Int', 'Decimal', 'DateTime', 'Boolean', 'Map', 'List', 'PropertyArray', 'Percentage', 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTransactionAliases', 'ArrayofTransactionMovements', 'ArrayofUnits', 'StringArray', 'CurrencyAndAmount', 'TradePrice', 'UnitCreation', 'Currency', 'UserId', 'MetricValue', 'ArrayOfQuotes'.
     *
     * @param valueType the valueType value to set
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * Get the valueRequired value.
     *
     * @return the valueRequired value
     */
    public Boolean valueRequired() {
        return this.valueRequired;
    }

    /**
     * Set the valueRequired value.
     *
     * @param valueRequired the valueRequired value to set
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withValueRequired(Boolean valueRequired) {
        this.valueRequired = valueRequired;
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
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the dataTypeId value.
     *
     * @return the dataTypeId value
     */
    public ResourceId dataTypeId() {
        return this.dataTypeId;
    }

    /**
     * Set the dataTypeId value.
     *
     * @param dataTypeId the dataTypeId value to set
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withDataTypeId(ResourceId dataTypeId) {
        this.dataTypeId = dataTypeId;
        return this;
    }

    /**
     * Get possible values include: 'Perpetual', 'TimeVariant'.
     *
     * @return the lifeTime value
     */
    public String lifeTime() {
        return this.lifeTime;
    }

    /**
     * Set possible values include: 'Perpetual', 'TimeVariant'.
     *
     * @param lifeTime the lifeTime value to set
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withLifeTime(String lifeTime) {
        this.lifeTime = lifeTime;
        return this;
    }

    /**
     * Get possible values include: 'Label', 'Metric'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set possible values include: 'Label', 'Metric'.
     *
     * @param type the type value to set
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withType(String type) {
        this.type = type;
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
     * Set possible values include: 'NoUnits', 'Basic', 'Iso4217Currency'.
     *
     * @param unitSchema the unitSchema value to set
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withUnitSchema(String unitSchema) {
        this.unitSchema = unitSchema;
        return this;
    }

    /**
     * Get possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'.
     *
     * @return the domain value
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Get the scope value.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the links value.
     *
     * @return the links value
     */
    public List<Link> links() {
        return this.links;
    }

    /**
     * Set the links value.
     *
     * @param links the links value to set
     * @return the PropertyDefinition object itself.
     */
    public PropertyDefinition withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

}
