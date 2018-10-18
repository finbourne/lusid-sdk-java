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
 * The PortfolioReconciliationRequest model.
 */
public class PortfolioReconciliationRequest {
    /**
     * The id of the portfolio to be reconciled.
     */
    @JsonProperty(value = "portfolioId", required = true)
    private ResourceId portfolioId;

    /**
     * The effective date of the portfolio.
     */
    @JsonProperty(value = "effectiveAt", required = true)
    private DateTime effectiveAt;

    /**
     * Optional. The AsAt date of the portfolio.
     */
    @JsonProperty(value = "asAt")
    private DateTime asAt;

    /**
     * Get the id of the portfolio to be reconciled.
     *
     * @return the portfolioId value
     */
    public ResourceId portfolioId() {
        return this.portfolioId;
    }

    /**
     * Set the id of the portfolio to be reconciled.
     *
     * @param portfolioId the portfolioId value to set
     * @return the PortfolioReconciliationRequest object itself.
     */
    public PortfolioReconciliationRequest withPortfolioId(ResourceId portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * Get the effective date of the portfolio.
     *
     * @return the effectiveAt value
     */
    public DateTime effectiveAt() {
        return this.effectiveAt;
    }

    /**
     * Set the effective date of the portfolio.
     *
     * @param effectiveAt the effectiveAt value to set
     * @return the PortfolioReconciliationRequest object itself.
     */
    public PortfolioReconciliationRequest withEffectiveAt(DateTime effectiveAt) {
        this.effectiveAt = effectiveAt;
        return this;
    }

    /**
     * Get optional. The AsAt date of the portfolio.
     *
     * @return the asAt value
     */
    public DateTime asAt() {
        return this.asAt;
    }

    /**
     * Set optional. The AsAt date of the portfolio.
     *
     * @param asAt the asAt value to set
     * @return the PortfolioReconciliationRequest object itself.
     */
    public PortfolioReconciliationRequest withAsAt(DateTime asAt) {
        this.asAt = asAt;
        return this;
    }

}
