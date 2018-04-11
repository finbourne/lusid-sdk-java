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
 * A 'transition' within a corporate action, representing a single incoming or
 * outgoing component.
 */
public class CorporateActionTransitionDto {
    /**
     * Possible values include: 'In', 'Out'.
     */
    @JsonProperty(value = "direction", required = true)
    private String direction;

    /**
     * The securityUid property.
     */
    @JsonProperty(value = "securityUid", required = true)
    private String securityUid;

    /**
     * The unitsFactor property.
     */
    @JsonProperty(value = "unitsFactor", required = true)
    private double unitsFactor;

    /**
     * The costFactor property.
     */
    @JsonProperty(value = "costFactor", required = true)
    private double costFactor;

    /**
     * Get the direction value.
     *
     * @return the direction value
     */
    public String direction() {
        return this.direction;
    }

    /**
     * Set the direction value.
     *
     * @param direction the direction value to set
     * @return the CorporateActionTransitionDto object itself.
     */
    public CorporateActionTransitionDto withDirection(String direction) {
        this.direction = direction;
        return this;
    }

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
     * @return the CorporateActionTransitionDto object itself.
     */
    public CorporateActionTransitionDto withSecurityUid(String securityUid) {
        this.securityUid = securityUid;
        return this;
    }

    /**
     * Get the unitsFactor value.
     *
     * @return the unitsFactor value
     */
    public double unitsFactor() {
        return this.unitsFactor;
    }

    /**
     * Set the unitsFactor value.
     *
     * @param unitsFactor the unitsFactor value to set
     * @return the CorporateActionTransitionDto object itself.
     */
    public CorporateActionTransitionDto withUnitsFactor(double unitsFactor) {
        this.unitsFactor = unitsFactor;
        return this;
    }

    /**
     * Get the costFactor value.
     *
     * @return the costFactor value
     */
    public double costFactor() {
        return this.costFactor;
    }

    /**
     * Set the costFactor value.
     *
     * @param costFactor the costFactor value to set
     * @return the CorporateActionTransitionDto object itself.
     */
    public CorporateActionTransitionDto withCostFactor(double costFactor) {
        this.costFactor = costFactor;
        return this;
    }

}
