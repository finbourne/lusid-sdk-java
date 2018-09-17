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
 * The CorporateActionTransitionComponentDto model.
 */
public class CorporateActionTransitionComponentDto {
    /**
     * The securityUid property.
     */
    @JsonProperty(value = "securityUid")
    private String securityUid;

    /**
     * The unitsFactor property.
     */
    @JsonProperty(value = "unitsFactor")
    private Double unitsFactor;

    /**
     * The costFactor property.
     */
    @JsonProperty(value = "costFactor")
    private Double costFactor;

    /**
     * Get the securityUid value.
     *
     * @return the securityUid value
     */
    public String securityUid() {
        return this.securityUid;
    }

    /**
     * Set the securityUid value.
     *
     * @param securityUid the securityUid value to set
     * @return the CorporateActionTransitionComponentDto object itself.
     */
    public CorporateActionTransitionComponentDto withSecurityUid(String securityUid) {
        this.securityUid = securityUid;
        return this;
    }

    /**
     * Get the unitsFactor value.
     *
     * @return the unitsFactor value
     */
    public Double unitsFactor() {
        return this.unitsFactor;
    }

    /**
     * Set the unitsFactor value.
     *
     * @param unitsFactor the unitsFactor value to set
     * @return the CorporateActionTransitionComponentDto object itself.
     */
    public CorporateActionTransitionComponentDto withUnitsFactor(Double unitsFactor) {
        this.unitsFactor = unitsFactor;
        return this;
    }

    /**
     * Get the costFactor value.
     *
     * @return the costFactor value
     */
    public Double costFactor() {
        return this.costFactor;
    }

    /**
     * Set the costFactor value.
     *
     * @param costFactor the costFactor value to set
     * @return the CorporateActionTransitionComponentDto object itself.
     */
    public CorporateActionTransitionComponentDto withCostFactor(Double costFactor) {
        this.costFactor = costFactor;
        return this;
    }

}
