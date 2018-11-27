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
 * The ReferencePortfolioConstituent model.
 */
public class ReferencePortfolioConstituent {
    /**
     * The instrumentUid property.
     */
    @JsonProperty(value = "instrumentUid", required = true)
    private String instrumentUid;

    /**
     * The currency property.
     */
    @JsonProperty(value = "currency", required = true)
    private String currency;

    /**
     * Properties associated with the constituent.
     */
    @JsonProperty(value = "properties")
    private List<Property> properties;

    /**
     * The weight property.
     */
    @JsonProperty(value = "weight", required = true)
    private double weight;

    /**
     * The floatingWeight property.
     */
    @JsonProperty(value = "floatingWeight")
    private Double floatingWeight;

    /**
     * Get the instrumentUid value.
     *
     * @return the instrumentUid value
     */
    public String instrumentUid() {
        return this.instrumentUid;
    }

    /**
     * Set the instrumentUid value.
     *
     * @param instrumentUid the instrumentUid value to set
     * @return the ReferencePortfolioConstituent object itself.
     */
    public ReferencePortfolioConstituent withInstrumentUid(String instrumentUid) {
        this.instrumentUid = instrumentUid;
        return this;
    }

    /**
     * Get the currency value.
     *
     * @return the currency value
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Set the currency value.
     *
     * @param currency the currency value to set
     * @return the ReferencePortfolioConstituent object itself.
     */
    public ReferencePortfolioConstituent withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get properties associated with the constituent.
     *
     * @return the properties value
     */
    public List<Property> properties() {
        return this.properties;
    }

    /**
     * Set properties associated with the constituent.
     *
     * @param properties the properties value to set
     * @return the ReferencePortfolioConstituent object itself.
     */
    public ReferencePortfolioConstituent withProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the weight value.
     *
     * @return the weight value
     */
    public double weight() {
        return this.weight;
    }

    /**
     * Set the weight value.
     *
     * @param weight the weight value to set
     * @return the ReferencePortfolioConstituent object itself.
     */
    public ReferencePortfolioConstituent withWeight(double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the floatingWeight value.
     *
     * @return the floatingWeight value
     */
    public Double floatingWeight() {
        return this.floatingWeight;
    }

    /**
     * Set the floatingWeight value.
     *
     * @param floatingWeight the floatingWeight value to set
     * @return the ReferencePortfolioConstituent object itself.
     */
    public ReferencePortfolioConstituent withFloatingWeight(Double floatingWeight) {
        this.floatingWeight = floatingWeight;
        return this;
    }

}
