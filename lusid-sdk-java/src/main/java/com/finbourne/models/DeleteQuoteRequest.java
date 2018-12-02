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
 * The DeleteQuoteRequest model.
 */
public class DeleteQuoteRequest {
    /**
     * The quoteId property.
     */
    @JsonProperty(value = "quoteId", required = true)
    private QuoteId quoteId;

    /**
     * The effectiveAt property.
     */
    @JsonProperty(value = "effectiveAt", required = true)
    private DateTime effectiveAt;

    /**
     * Get the quoteId value.
     *
     * @return the quoteId value
     */
    public QuoteId quoteId() {
        return this.quoteId;
    }

    /**
     * Set the quoteId value.
     *
     * @param quoteId the quoteId value to set
     * @return the DeleteQuoteRequest object itself.
     */
    public DeleteQuoteRequest withQuoteId(QuoteId quoteId) {
        this.quoteId = quoteId;
        return this;
    }

    /**
     * Get the effectiveAt value.
     *
     * @return the effectiveAt value
     */
    public DateTime effectiveAt() {
        return this.effectiveAt;
    }

    /**
     * Set the effectiveAt value.
     *
     * @param effectiveAt the effectiveAt value to set
     * @return the DeleteQuoteRequest object itself.
     */
    public DeleteQuoteRequest withEffectiveAt(DateTime effectiveAt) {
        this.effectiveAt = effectiveAt;
        return this;
    }

}
