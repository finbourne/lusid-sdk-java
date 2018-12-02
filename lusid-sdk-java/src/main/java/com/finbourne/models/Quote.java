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
 * The Quote model.
 */
public class Quote {
    /**
     * The quoteId property.
     */
    @JsonProperty(value = "quoteId", required = true)
    private QuoteId quoteId;

    /**
     * The metricValue property.
     */
    @JsonProperty(value = "metricValue", required = true)
    private MetricValue metricValue;

    /**
     * The effectiveAtDate property.
     */
    @JsonProperty(value = "effectiveAtDate")
    private DateTime effectiveAtDate;

    /**
     * The asAtDate property.
     */
    @JsonProperty(value = "asAtDate")
    private DateTime asAtDate;

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
     * @return the Quote object itself.
     */
    public Quote withQuoteId(QuoteId quoteId) {
        this.quoteId = quoteId;
        return this;
    }

    /**
     * Get the metricValue value.
     *
     * @return the metricValue value
     */
    public MetricValue metricValue() {
        return this.metricValue;
    }

    /**
     * Set the metricValue value.
     *
     * @param metricValue the metricValue value to set
     * @return the Quote object itself.
     */
    public Quote withMetricValue(MetricValue metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * Get the effectiveAtDate value.
     *
     * @return the effectiveAtDate value
     */
    public DateTime effectiveAtDate() {
        return this.effectiveAtDate;
    }

    /**
     * Set the effectiveAtDate value.
     *
     * @param effectiveAtDate the effectiveAtDate value to set
     * @return the Quote object itself.
     */
    public Quote withEffectiveAtDate(DateTime effectiveAtDate) {
        this.effectiveAtDate = effectiveAtDate;
        return this;
    }

    /**
     * Get the asAtDate value.
     *
     * @return the asAtDate value
     */
    public DateTime asAtDate() {
        return this.asAtDate;
    }

    /**
     * Set the asAtDate value.
     *
     * @param asAtDate the asAtDate value to set
     * @return the Quote object itself.
     */
    public Quote withAsAtDate(DateTime asAtDate) {
        this.asAtDate = asAtDate;
        return this;
    }

}
