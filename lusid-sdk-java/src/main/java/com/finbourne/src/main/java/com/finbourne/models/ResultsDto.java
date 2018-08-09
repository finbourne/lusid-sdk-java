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
 * The ResultsDto model.
 */
public class ResultsDto {
    /**
     * The version property.
     */
    @JsonProperty(value = "version")
    private VersionDto version;

    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The values property.
     */
    @JsonProperty(value = "values")
    private Object values;

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public VersionDto version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the ResultsDto object itself.
     */
    public ResultsDto withVersion(VersionDto version) {
        this.version = version;
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
     * @return the ResultsDto object itself.
     */
    public ResultsDto withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the values value.
     *
     * @return the values value
     */
    public Object values() {
        return this.values;
    }

    /**
     * Set the values value.
     *
     * @param values the values value to set
     * @return the ResultsDto object itself.
     */
    public ResultsDto withValues(Object values) {
        this.values = values;
        return this;
    }

}
