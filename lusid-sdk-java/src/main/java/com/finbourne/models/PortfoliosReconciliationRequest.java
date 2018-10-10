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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PortfoliosReconciliationRequest model.
 */
public class PortfoliosReconciliationRequest {
    /**
     * The left property.
     */
    @JsonProperty(value = "left", required = true)
    private PortfolioReconciliationRequest left;

    /**
     * The right property.
     */
    @JsonProperty(value = "right", required = true)
    private PortfolioReconciliationRequest right;

    /**
     * The instrumentPropertyKeys property.
     */
    @JsonProperty(value = "instrumentPropertyKeys", required = true)
    private List<String> instrumentPropertyKeys;

    /**
     * Get the left value.
     *
     * @return the left value
     */
    public PortfolioReconciliationRequest left() {
        return this.left;
    }

    /**
     * Set the left value.
     *
     * @param left the left value to set
     * @return the PortfoliosReconciliationRequest object itself.
     */
    public PortfoliosReconciliationRequest withLeft(PortfolioReconciliationRequest left) {
        this.left = left;
        return this;
    }

    /**
     * Get the right value.
     *
     * @return the right value
     */
    public PortfolioReconciliationRequest right() {
        return this.right;
    }

    /**
     * Set the right value.
     *
     * @param right the right value to set
     * @return the PortfoliosReconciliationRequest object itself.
     */
    public PortfoliosReconciliationRequest withRight(PortfolioReconciliationRequest right) {
        this.right = right;
        return this;
    }

    /**
     * Get the instrumentPropertyKeys value.
     *
     * @return the instrumentPropertyKeys value
     */
    public List<String> instrumentPropertyKeys() {
        return this.instrumentPropertyKeys;
    }

    /**
     * Set the instrumentPropertyKeys value.
     *
     * @param instrumentPropertyKeys the instrumentPropertyKeys value to set
     * @return the PortfoliosReconciliationRequest object itself.
     */
    public PortfoliosReconciliationRequest withInstrumentPropertyKeys(List<String> instrumentPropertyKeys) {
        this.instrumentPropertyKeys = instrumentPropertyKeys;
        return this;
    }

}
