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
 * The TxnPropertyMappingDto model.
 */
public class TxnPropertyMappingDto {
    /**
     * The Side.
     */
    @JsonProperty(value = "propertyKey", required = true)
    private String propertyKey;

    /**
     * The Side.
     */
    @JsonProperty(value = "mapFrom")
    private String mapFrom;

    /**
     * The Side.
     */
    @JsonProperty(value = "setTo")
    private Object setTo;

    /**
     * Get the propertyKey value.
     *
     * @return the propertyKey value
     */
    public String propertyKey() {
        return this.propertyKey;
    }

    /**
     * Set the propertyKey value.
     *
     * @param propertyKey the propertyKey value to set
     * @return the TxnPropertyMappingDto object itself.
     */
    public TxnPropertyMappingDto withPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
        return this;
    }

    /**
     * Get the mapFrom value.
     *
     * @return the mapFrom value
     */
    public String mapFrom() {
        return this.mapFrom;
    }

    /**
     * Set the mapFrom value.
     *
     * @param mapFrom the mapFrom value to set
     * @return the TxnPropertyMappingDto object itself.
     */
    public TxnPropertyMappingDto withMapFrom(String mapFrom) {
        this.mapFrom = mapFrom;
        return this;
    }

    /**
     * Get the setTo value.
     *
     * @return the setTo value
     */
    public Object setTo() {
        return this.setTo;
    }

    /**
     * Set the setTo value.
     *
     * @param setTo the setTo value to set
     * @return the TxnPropertyMappingDto object itself.
     */
    public TxnPropertyMappingDto withSetTo(Object setTo) {
        this.setTo = setTo;
        return this;
    }

}
