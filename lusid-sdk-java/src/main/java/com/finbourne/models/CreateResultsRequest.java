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
 * The CreateResultsRequest model.
 */
public class CreateResultsRequest {
    /**
     * The data property.
     */
    @JsonProperty(value = "data")
    private Object data;

    /**
     * The scope property.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /**
     * The key property.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * The dateProperty property.
     */
    @JsonProperty(value = "date")
    private DateTime dateProperty;

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public Object data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     * @return the CreateResultsRequest object itself.
     */
    public CreateResultsRequest withData(Object data) {
        this.data = data;
        return this;
    }

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
     * @return the CreateResultsRequest object itself.
     */
    public CreateResultsRequest withScope(String scope) {
        this.scope = scope;
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
     * @return the CreateResultsRequest object itself.
     */
    public CreateResultsRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the dateProperty value.
     *
     * @return the dateProperty value
     */
    public DateTime dateProperty() {
        return this.dateProperty;
    }

    /**
     * Set the dateProperty value.
     *
     * @param dateProperty the dateProperty value to set
     * @return the CreateResultsRequest object itself.
     */
    public CreateResultsRequest withDateProperty(DateTime dateProperty) {
        this.dateProperty = dateProperty;
        return this;
    }

}
