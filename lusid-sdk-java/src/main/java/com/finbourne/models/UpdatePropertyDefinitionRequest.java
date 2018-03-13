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
 * The UpdatePropertyDefinitionRequest model.
 */
public class UpdatePropertyDefinitionRequest {
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
     * @return the UpdatePropertyDefinitionRequest object itself.
     */
    public UpdatePropertyDefinitionRequest withValueRequired(Boolean valueRequired) {
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
     * @return the UpdatePropertyDefinitionRequest object itself.
     */
    public UpdatePropertyDefinitionRequest withDisplayName(String displayName) {
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
     * @return the UpdatePropertyDefinitionRequest object itself.
     */
    public UpdatePropertyDefinitionRequest withDataFormatId(ResourceId dataFormatId) {
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
     * @return the UpdatePropertyDefinitionRequest object itself.
     */
    public UpdatePropertyDefinitionRequest withSort(String sort) {
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
     * @return the UpdatePropertyDefinitionRequest object itself.
     */
    public UpdatePropertyDefinitionRequest withLifeTime(String lifeTime) {
        this.lifeTime = lifeTime;
        return this;
    }

}
