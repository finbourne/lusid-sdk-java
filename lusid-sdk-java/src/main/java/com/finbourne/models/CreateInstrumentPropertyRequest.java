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
 * The CreateInstrumentPropertyRequest model.
 */
public class CreateInstrumentPropertyRequest {
    /**
     * The instrumentPropertyKey property.
     */
    @JsonProperty(value = "instrumentPropertyKey")
    private String instrumentPropertyKey;

    /**
     * The property property.
     */
    @JsonProperty(value = "property")
    private CreatePropertyRequest property;

    /**
     * Get the instrumentPropertyKey value.
     *
     * @return the instrumentPropertyKey value
     */
    public String instrumentPropertyKey() {
        return this.instrumentPropertyKey;
    }

    /**
     * Set the instrumentPropertyKey value.
     *
     * @param instrumentPropertyKey the instrumentPropertyKey value to set
     * @return the CreateInstrumentPropertyRequest object itself.
     */
    public CreateInstrumentPropertyRequest withInstrumentPropertyKey(String instrumentPropertyKey) {
        this.instrumentPropertyKey = instrumentPropertyKey;
        return this;
    }

    /**
     * Get the property value.
     *
     * @return the property value
     */
    public CreatePropertyRequest property() {
        return this.property;
    }

    /**
     * Set the property value.
     *
     * @param property the property value to set
     * @return the CreateInstrumentPropertyRequest object itself.
     */
    public CreateInstrumentPropertyRequest withProperty(CreatePropertyRequest property) {
        this.property = property;
        return this;
    }

}
