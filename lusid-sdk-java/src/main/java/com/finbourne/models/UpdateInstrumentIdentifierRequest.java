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
 * The UpdateInstrumentIdentifierRequest model.
 */
public class UpdateInstrumentIdentifierRequest {
    /**
     * The type of the identifier to upsert. This must be one of the code types
     * marked as
     * allowable for instrument identifiers. Possible values include:
     * 'Undefined', 'LusidInstrumentId', 'ReutersAssetId', 'CINS', 'Isin',
     * 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi',
     * 'ShareClassFigi', 'Wertpapier', 'RIC', 'QuotePermId'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The value of the identifier. If set to `null`, this will remove the
     * identifier completely.
     * Note that, if an instrument only has one identifier, it is an error to
     * remove this.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * The date at which the identifier modification is to be effective from.
     * If unset, will
     * default to `now`.
     */
    @JsonProperty(value = "effectiveFrom")
    private DateTime effectiveFrom;

    /**
     * Get the type of the identifier to upsert. This must be one of the code types marked as
     allowable for instrument identifiers. Possible values include: 'Undefined', 'LusidInstrumentId', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier', 'RIC', 'QuotePermId'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the identifier to upsert. This must be one of the code types marked as
     allowable for instrument identifiers. Possible values include: 'Undefined', 'LusidInstrumentId', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier', 'RIC', 'QuotePermId'.
     *
     * @param type the type value to set
     * @return the UpdateInstrumentIdentifierRequest object itself.
     */
    public UpdateInstrumentIdentifierRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value of the identifier. If set to `null`, this will remove the identifier completely.
     Note that, if an instrument only has one identifier, it is an error to remove this.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the identifier. If set to `null`, this will remove the identifier completely.
     Note that, if an instrument only has one identifier, it is an error to remove this.
     *
     * @param value the value value to set
     * @return the UpdateInstrumentIdentifierRequest object itself.
     */
    public UpdateInstrumentIdentifierRequest withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the date at which the identifier modification is to be effective from. If unset, will
     default to `now`.
     *
     * @return the effectiveFrom value
     */
    public DateTime effectiveFrom() {
        return this.effectiveFrom;
    }

    /**
     * Set the date at which the identifier modification is to be effective from. If unset, will
     default to `now`.
     *
     * @param effectiveFrom the effectiveFrom value to set
     * @return the UpdateInstrumentIdentifierRequest object itself.
     */
    public UpdateInstrumentIdentifierRequest withEffectiveFrom(DateTime effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
        return this;
    }

}
