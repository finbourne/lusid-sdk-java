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

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is intended to be the external facing property specification data type.
 */
public class Property {
    /**
     * The property key made up of the PropertyDomain, scope and name delimited
     * with a '/'
     * e.g. trade/myscope/myproperty.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /**
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /**
     * Date for which the property is effective from.
     */
    @JsonProperty(value = "effectiveDate")
    private DateTime effectiveDate;

    /**
     * The version property.
     */
    @JsonProperty(value = "version")
    private Integer version;

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
     * @return the Property object itself.
     */
    public Property withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the Property object itself.
     */
    public Property withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the effectiveDate value.
     *
     * @return the effectiveDate value
     */
    public DateTime effectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Set the effectiveDate value.
     *
     * @param effectiveDate the effectiveDate value to set
     * @return the Property object itself.
     */
    public Property withEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the Property object itself.
     */
    public Property withVersion(Integer version) {
        this.version = version;
        return this;
    }

}
