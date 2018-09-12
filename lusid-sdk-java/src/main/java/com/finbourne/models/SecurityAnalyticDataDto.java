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
 * The SecurityAnalyticDataDto model.
 */
public class SecurityAnalyticDataDto {
    /**
     * Unique security identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Value of the analytic, eg price.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Underlying unit of the analytic, eg currency, EPS etc.
     */
    @JsonProperty(value = "denomination")
    private String denomination;

    /**
     * Get unique security identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set unique security identifier.
     *
     * @param id the id value to set
     * @return the SecurityAnalyticDataDto object itself.
     */
    public SecurityAnalyticDataDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get value of the analytic, eg price.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set value of the analytic, eg price.
     *
     * @param value the value value to set
     * @return the SecurityAnalyticDataDto object itself.
     */
    public SecurityAnalyticDataDto withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Get underlying unit of the analytic, eg currency, EPS etc.
     *
     * @return the denomination value
     */
    public String denomination() {
        return this.denomination;
    }

    /**
     * Set underlying unit of the analytic, eg currency, EPS etc.
     *
     * @param denomination the denomination value to set
     * @return the SecurityAnalyticDataDto object itself.
     */
    public SecurityAnalyticDataDto withDenomination(String denomination) {
        this.denomination = denomination;
        return this;
    }

}
