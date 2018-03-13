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
 * The ErrorDetail model.
 */
public class ErrorDetail {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The type property.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The detail property.
     */
    @JsonProperty(value = "detail")
    private String detail;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the detail value.
     *
     * @return the detail value
     */
    public String detail() {
        return this.detail;
    }

    /**
     * Set the detail value.
     *
     * @param detail the detail value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withDetail(String detail) {
        this.detail = detail;
        return this;
    }

}
