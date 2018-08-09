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
 * The PropertyDto model.
 */
public class PropertyDto {
    /**
     * The key property.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /**
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /**
     * The unit property.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Date for which the property is effective from.
     */
    @JsonProperty(value = "effectiveFrom")
    private DateTime effectiveFrom;

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
     * @return the PropertyDto object itself.
     */
    public PropertyDto withKey(String key) {
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
     * @return the PropertyDto object itself.
     */
    public PropertyDto withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     * @return the PropertyDto object itself.
     */
    public PropertyDto withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get date for which the property is effective from.
     *
     * @return the effectiveFrom value
     */
    public DateTime effectiveFrom() {
        return this.effectiveFrom;
    }

    /**
     * Set date for which the property is effective from.
     *
     * @param effectiveFrom the effectiveFrom value to set
     * @return the PropertyDto object itself.
     */
    public PropertyDto withEffectiveFrom(DateTime effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
        return this;
    }

}
