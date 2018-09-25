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

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This 'dto' contains target holdings. i.e. holding data that the
 * system should match. When processed by the movement
 * engine, it will create 'true-up' adjustments on the fly.
 */
public class AdjustHoldingRequest {
    /**
     * Unique instrument identifier.
     */
    @JsonProperty(value = "instrumentUid")
    private String instrumentUid;

    /**
     * Key fields to uniquely index the sub holdings of a instrument.
     */
    @JsonProperty(value = "subHoldingKeys")
    private Map<String, CreatePerpetualPropertyRequest> subHoldingKeys;

    /**
     * Arbitrary properties to store with the holding.
     */
    @JsonProperty(value = "properties")
    private Map<String, CreatePerpetualPropertyRequest> properties;

    /**
     * 1 or more quantity amounts.
     */
    @JsonProperty(value = "taxLots", required = true)
    private List<TargetTaxLotRequest> taxLots;

    /**
     * Get unique instrument identifier.
     *
     * @return the instrumentUid value
     */
    public String instrumentUid() {
        return this.instrumentUid;
    }

    /**
     * Set unique instrument identifier.
     *
     * @param instrumentUid the instrumentUid value to set
     * @return the AdjustHoldingRequest object itself.
     */
    public AdjustHoldingRequest withInstrumentUid(String instrumentUid) {
        this.instrumentUid = instrumentUid;
        return this;
    }

    /**
     * Get key fields to uniquely index the sub holdings of a instrument.
     *
     * @return the subHoldingKeys value
     */
    public Map<String, CreatePerpetualPropertyRequest> subHoldingKeys() {
        return this.subHoldingKeys;
    }

    /**
     * Set key fields to uniquely index the sub holdings of a instrument.
     *
     * @param subHoldingKeys the subHoldingKeys value to set
     * @return the AdjustHoldingRequest object itself.
     */
    public AdjustHoldingRequest withSubHoldingKeys(Map<String, CreatePerpetualPropertyRequest> subHoldingKeys) {
        this.subHoldingKeys = subHoldingKeys;
        return this;
    }

    /**
     * Get arbitrary properties to store with the holding.
     *
     * @return the properties value
     */
    public Map<String, CreatePerpetualPropertyRequest> properties() {
        return this.properties;
    }

    /**
     * Set arbitrary properties to store with the holding.
     *
     * @param properties the properties value to set
     * @return the AdjustHoldingRequest object itself.
     */
    public AdjustHoldingRequest withProperties(Map<String, CreatePerpetualPropertyRequest> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get 1 or more quantity amounts.
     *
     * @return the taxLots value
     */
    public List<TargetTaxLotRequest> taxLots() {
        return this.taxLots;
    }

    /**
     * Set 1 or more quantity amounts.
     *
     * @param taxLots the taxLots value to set
     * @return the AdjustHoldingRequest object itself.
     */
    public AdjustHoldingRequest withTaxLots(List<TargetTaxLotRequest> taxLots) {
        this.taxLots = taxLots;
        return this;
    }

}
