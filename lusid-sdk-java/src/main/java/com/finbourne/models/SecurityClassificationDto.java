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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SecurityClassificationDto model.
 */
public class SecurityClassificationDto {
    /**
     * Unique security identifier.
     */
    @JsonProperty(value = "uid")
    private String uid;

    /**
     * Date from which this classification is effective.
     */
    @JsonProperty(value = "effectiveFrom")
    private DateTime effectiveFrom;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PropertyDto> properties;

    /**
     * Get the uid value.
     *
     * @return the uid value
     */
    public String uid() {
        return this.uid;
    }

    /**
     * Set the uid value.
     *
     * @param uid the uid value to set
     * @return the SecurityClassificationDto object itself.
     */
    public SecurityClassificationDto withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Get the effectiveFrom value.
     *
     * @return the effectiveFrom value
     */
    public DateTime effectiveFrom() {
        return this.effectiveFrom;
    }

    /**
     * Set the effectiveFrom value.
     *
     * @param effectiveFrom the effectiveFrom value to set
     * @return the SecurityClassificationDto object itself.
     */
    public SecurityClassificationDto withEffectiveFrom(DateTime effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<PropertyDto> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the SecurityClassificationDto object itself.
     */
    public SecurityClassificationDto withProperties(List<PropertyDto> properties) {
        this.properties = properties;
        return this;
    }

}
