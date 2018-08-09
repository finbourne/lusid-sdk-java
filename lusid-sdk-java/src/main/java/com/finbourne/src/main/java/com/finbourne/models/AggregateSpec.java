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
 * The AggregateSpec model.
 */
public class AggregateSpec {
    /**
     * The key property.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Possible values include: 'Sum', 'Proportion'.
     */
    @JsonProperty(value = "op")
    private String op;

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
     * @return the AggregateSpec object itself.
     */
    public AggregateSpec withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get possible values include: 'Sum', 'Proportion'.
     *
     * @return the op value
     */
    public String op() {
        return this.op;
    }

    /**
     * Set possible values include: 'Sum', 'Proportion'.
     *
     * @param op the op value to set
     * @return the AggregateSpec object itself.
     */
    public AggregateSpec withOp(String op) {
        this.op = op;
        return this;
    }

}
