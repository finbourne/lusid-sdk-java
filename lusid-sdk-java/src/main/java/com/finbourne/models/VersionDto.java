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
 * Describes the version metadata of an entity.
 */
public class VersionDto {
    /**
     * The time at which this version became valid. Only applies when a single
     * entity is being interacted with.
     */
    @JsonProperty(value = "effectiveFrom")
    private DateTime effectiveFrom;

    /**
     * The time at which this version was durably persisted.
     */
    @JsonProperty(value = "asAtDate")
    private DateTime asAtDate;

    /**
     * The name of the person or system which created this version.
     */
    @JsonProperty(value = "updatedBy")
    private String updatedBy;

    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

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
     * @return the VersionDto object itself.
     */
    public VersionDto withEffectiveFrom(DateTime effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
        return this;
    }

    /**
     * Get the asAtDate value.
     *
     * @return the asAtDate value
     */
    public DateTime asAtDate() {
        return this.asAtDate;
    }

    /**
     * Set the asAtDate value.
     *
     * @param asAtDate the asAtDate value to set
     * @return the VersionDto object itself.
     */
    public VersionDto withAsAtDate(DateTime asAtDate) {
        this.asAtDate = asAtDate;
        return this;
    }

    /**
     * Get the updatedBy value.
     *
     * @return the updatedBy value
     */
    public String updatedBy() {
        return this.updatedBy;
    }

    /**
     * Set the updatedBy value.
     *
     * @param updatedBy the updatedBy value to set
     * @return the VersionDto object itself.
     */
    public VersionDto withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
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
     * @return the VersionDto object itself.
     */
    public VersionDto withHref(String href) {
        this.href = href;
        return this;
    }

}
