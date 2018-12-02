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
 * The QuoteId model.
 */
public class QuoteId {
    /**
     * The instrumentId property.
     */
    @JsonProperty(value = "instrumentId", required = true)
    private String instrumentId;

    /**
     * The instrumentIdType property.
     */
    @JsonProperty(value = "instrumentIdType", required = true)
    private String instrumentIdType;

    /**
     * The quoteConvention property.
     */
    @JsonProperty(value = "quoteConvention", required = true)
    private String quoteConvention;

    /**
     * The quoteType property.
     */
    @JsonProperty(value = "quoteType", required = true)
    private String quoteType;

    /**
     * The priceSource property.
     */
    @JsonProperty(value = "priceSource")
    private String priceSource;

    /**
     * Get the instrumentId value.
     *
     * @return the instrumentId value
     */
    public String instrumentId() {
        return this.instrumentId;
    }

    /**
     * Set the instrumentId value.
     *
     * @param instrumentId the instrumentId value to set
     * @return the QuoteId object itself.
     */
    public QuoteId withInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
        return this;
    }

    /**
     * Get the instrumentIdType value.
     *
     * @return the instrumentIdType value
     */
    public String instrumentIdType() {
        return this.instrumentIdType;
    }

    /**
     * Set the instrumentIdType value.
     *
     * @param instrumentIdType the instrumentIdType value to set
     * @return the QuoteId object itself.
     */
    public QuoteId withInstrumentIdType(String instrumentIdType) {
        this.instrumentIdType = instrumentIdType;
        return this;
    }

    /**
     * Get the quoteConvention value.
     *
     * @return the quoteConvention value
     */
    public String quoteConvention() {
        return this.quoteConvention;
    }

    /**
     * Set the quoteConvention value.
     *
     * @param quoteConvention the quoteConvention value to set
     * @return the QuoteId object itself.
     */
    public QuoteId withQuoteConvention(String quoteConvention) {
        this.quoteConvention = quoteConvention;
        return this;
    }

    /**
     * Get the quoteType value.
     *
     * @return the quoteType value
     */
    public String quoteType() {
        return this.quoteType;
    }

    /**
     * Set the quoteType value.
     *
     * @param quoteType the quoteType value to set
     * @return the QuoteId object itself.
     */
    public QuoteId withQuoteType(String quoteType) {
        this.quoteType = quoteType;
        return this;
    }

    /**
     * Get the priceSource value.
     *
     * @return the priceSource value
     */
    public String priceSource() {
        return this.priceSource;
    }

    /**
     * Set the priceSource value.
     *
     * @param priceSource the priceSource value to set
     * @return the QuoteId object itself.
     */
    public QuoteId withPriceSource(String priceSource) {
        this.priceSource = priceSource;
        return this;
    }

}
