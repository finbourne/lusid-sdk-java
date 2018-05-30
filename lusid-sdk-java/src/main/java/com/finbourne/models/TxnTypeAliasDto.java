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
 * The TxnTypeAliasDto model.
 */
public class TxnTypeAliasDto {
    /**
     * The transaction type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Brief description of the transaction.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Get the transaction type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the transaction type.
     *
     * @param type the type value to set
     * @return the TxnTypeAliasDto object itself.
     */
    public TxnTypeAliasDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get brief description of the transaction.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set brief description of the transaction.
     *
     * @param description the description value to set
     * @return the TxnTypeAliasDto object itself.
     */
    public TxnTypeAliasDto withDescription(String description) {
        this.description = description;
        return this;
    }

}
