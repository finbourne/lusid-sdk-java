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
 * The DeleteInstrumentPropertyRequest model.
 */
public class DeleteInstrumentPropertyRequest {
    /**
     * The property key of the property to be removed from the instrument, e.g
     * 'Instrument/default/Cusip`.
     */
    @JsonProperty(value = "instrumentPropertyKey")
    private String instrumentPropertyKey;

    /**
     * The date at which the property removal should be effective from. If no
     * value is set, then 'now' is used.
     */
    @JsonProperty(value = "effectiveFrom")
    private DateTime effectiveFrom;

    /**
     * Get the property key of the property to be removed from the instrument, e.g 'Instrument/default/Cusip`.
     *
     * @return the instrumentPropertyKey value
     */
    public String instrumentPropertyKey() {
        return this.instrumentPropertyKey;
    }

    /**
     * Set the property key of the property to be removed from the instrument, e.g 'Instrument/default/Cusip`.
     *
     * @param instrumentPropertyKey the instrumentPropertyKey value to set
     * @return the DeleteInstrumentPropertyRequest object itself.
     */
    public DeleteInstrumentPropertyRequest withInstrumentPropertyKey(String instrumentPropertyKey) {
        this.instrumentPropertyKey = instrumentPropertyKey;
        return this;
    }

    /**
     * Get the date at which the property removal should be effective from. If no value is set, then 'now' is used.
     *
     * @return the effectiveFrom value
     */
    public DateTime effectiveFrom() {
        return this.effectiveFrom;
    }

    /**
     * Set the date at which the property removal should be effective from. If no value is set, then 'now' is used.
     *
     * @param effectiveFrom the effectiveFrom value to set
     * @return the DeleteInstrumentPropertyRequest object itself.
     */
    public DeleteInstrumentPropertyRequest withEffectiveFrom(DateTime effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
        return this;
    }

}
