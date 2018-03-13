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
 * The PersonalisationDto model.
 */
public class PersonalisationDto {
    /**
     * Possible values include: 'User', 'Group', 'Default', 'All'.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /**
     * The scopeValue property.
     */
    @JsonProperty(value = "scopeValue")
    private String scopeValue;

    /**
     * The settingKey property.
     */
    @JsonProperty(value = "settingKey")
    private String settingKey;

    /**
     * The settingValue property.
     */
    @JsonProperty(value = "settingValue")
    private String settingValue;

    /**
     * The dataType property.
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

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
     * @return the PersonalisationDto object itself.
     */
    public PersonalisationDto withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the scopeValue value.
     *
     * @return the scopeValue value
     */
    public String scopeValue() {
        return this.scopeValue;
    }

    /**
     * Set the scopeValue value.
     *
     * @param scopeValue the scopeValue value to set
     * @return the PersonalisationDto object itself.
     */
    public PersonalisationDto withScopeValue(String scopeValue) {
        this.scopeValue = scopeValue;
        return this;
    }

    /**
     * Get the settingKey value.
     *
     * @return the settingKey value
     */
    public String settingKey() {
        return this.settingKey;
    }

    /**
     * Set the settingKey value.
     *
     * @param settingKey the settingKey value to set
     * @return the PersonalisationDto object itself.
     */
    public PersonalisationDto withSettingKey(String settingKey) {
        this.settingKey = settingKey;
        return this;
    }

    /**
     * Get the settingValue value.
     *
     * @return the settingValue value
     */
    public String settingValue() {
        return this.settingValue;
    }

    /**
     * Set the settingValue value.
     *
     * @param settingValue the settingValue value to set
     * @return the PersonalisationDto object itself.
     */
    public PersonalisationDto withSettingValue(String settingValue) {
        this.settingValue = settingValue;
        return this;
    }

    /**
     * Get the dataType value.
     *
     * @return the dataType value
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType value.
     *
     * @param dataType the dataType value to set
     * @return the PersonalisationDto object itself.
     */
    public PersonalisationDto withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

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
     * @return the PersonalisationDto object itself.
     */
    public PersonalisationDto withHref(String href) {
        this.href = href;
        return this;
    }

}
