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
 * A price with its associated type.
 */
public class TransactionPrice {
    /**
     * The price property.
     */
    @JsonProperty(value = "price")
    private Double price;

    /**
     * Possible values include: 'Price', 'Yield', 'Spread'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the price value.
     *
     * @return the price value
     */
    public Double price() {
        return this.price;
    }

    /**
     * Set the price value.
     *
     * @param price the price value to set
     * @return the TransactionPrice object itself.
     */
    public TransactionPrice withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Get possible values include: 'Price', 'Yield', 'Spread'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set possible values include: 'Price', 'Yield', 'Spread'.
     *
     * @param type the type value to set
     * @return the TransactionPrice object itself.
     */
    public TransactionPrice withType(String type) {
        this.type = type;
        return this;
    }

}
