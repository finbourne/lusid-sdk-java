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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ReferencePortfolioConstituentRequest model.
 */
public class ReferencePortfolioConstituentRequest {
    /**
     * The instrumentUid property.
     */
    @JsonProperty(value = "instrumentUid")
    private String instrumentUid;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private Map<String, CreatePerpetualPropertyRequest> properties;

    /**
     * The weight property.
     */
    @JsonProperty(value = "weight")
    private Double weight;

    /**
     * Possible values include: 'Shares', 'Weight', 'Nominal'.
     */
    @JsonProperty(value = "type")
    private String type;

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
     * @return the ReferencePortfolioConstituentRequest object itself.
     */
    public ReferencePortfolioConstituentRequest withInstrumentUid(String instrumentUid) {
        this.instrumentUid = instrumentUid;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public Map<String, CreatePerpetualPropertyRequest> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the ReferencePortfolioConstituentRequest object itself.
     */
    public ReferencePortfolioConstituentRequest withProperties(Map<String, CreatePerpetualPropertyRequest> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the weight value.
     *
     * @return the weight value
     */
    public Double weight() {
        return this.weight;
    }

    /**
     * Set the weight value.
     *
     * @param weight the weight value to set
     * @return the ReferencePortfolioConstituentRequest object itself.
     */
    public ReferencePortfolioConstituentRequest withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get possible values include: 'Shares', 'Weight', 'Nominal'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set possible values include: 'Shares', 'Weight', 'Nominal'.
     *
     * @param type the type value to set
     * @return the ReferencePortfolioConstituentRequest object itself.
     */
    public ReferencePortfolioConstituentRequest withType(String type) {
        this.type = type;
        return this;
    }

}
