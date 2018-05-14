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
 * The PropertyDefinitionDto model.
 */
public class PropertyDefinitionDto {
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
     * 'Boolean', 'Map', 'PropertyArray', 'Percentage', 'Currency',
     * 'BenchmarkType', 'Code', 'Id', 'Uri', 'ArrayOfIds', 'ArrayOfTxnAliases',
     * 'ArrayofTxnMovements'.
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
     * The dataFormatId property.
     */
    @JsonProperty(value = "dataFormatId")
    private ResourceId dataFormatId;

    /**
     * The sort property.
     */
    @JsonProperty(value = "sort")
    private String sort;

    /**
     * Possible values include: 'Perpetual', 'TimeVariant'.
     */
    @JsonProperty(value = "lifeTime")
    private String lifeTime;

    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

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
     * @return the PropertyDefinitionDto object itself.
     */
    public PropertyDefinitionDto withHref(String href) {
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
     * @return the PropertyDefinitionDto object itself.
     */
    public PropertyDefinitionDto withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the valueType value.
     *
     * @return the valueType value
     */
    public String valueType() {
        return this.valueType;
    }

    /**
     * Set the valueType value.
     *
     * @param valueType the valueType value to set
     * @return the PropertyDefinitionDto object itself.
     */
    public PropertyDefinitionDto withValueType(String valueType) {
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
     * @return the PropertyDefinitionDto object itself.
     */
    public PropertyDefinitionDto withValueRequired(Boolean valueRequired) {
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
     * @return the PropertyDefinitionDto object itself.
     */
    public PropertyDefinitionDto withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the dataFormatId value.
     *
     * @return the dataFormatId value
     */
    public ResourceId dataFormatId() {
        return this.dataFormatId;
    }

    /**
     * Set the dataFormatId value.
     *
     * @param dataFormatId the dataFormatId value to set
     * @return the PropertyDefinitionDto object itself.
     */
    public PropertyDefinitionDto withDataFormatId(ResourceId dataFormatId) {
        this.dataFormatId = dataFormatId;
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
     * @return the PropertyDefinitionDto object itself.
     */
    public PropertyDefinitionDto withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get the lifeTime value.
     *
     * @return the lifeTime value
     */
    public String lifeTime() {
        return this.lifeTime;
    }

    /**
     * Set the lifeTime value.
     *
     * @param lifeTime the lifeTime value to set
     * @return the PropertyDefinitionDto object itself.
     */
    public PropertyDefinitionDto withLifeTime(String lifeTime) {
        this.lifeTime = lifeTime;
        return this;
    }

    /**
     * Get the _links value.
     *
     * @return the _links value
     */
    public List<Link> _links() {
        return this._links;
    }

    /**
     * Set the _links value.
     *
     * @param _links the _links value to set
     * @return the PropertyDefinitionDto object itself.
     */
    public PropertyDefinitionDto with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

}
