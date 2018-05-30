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
 * A reconciliation break.
 */
public class ReconciliationBreakDto {
    /**
     * Unique security identifier.
     */
    @JsonProperty(value = "securityUid", required = true)
    private String securityUid;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PropertyDto> properties;

    /**
     * Difference in units.
     */
    @JsonProperty(value = "unitsDifference")
    private Double unitsDifference;

    /**
     * Difference in cost.
     */
    @JsonProperty(value = "costDifference")
    private Double costDifference;

    /**
     * Get unique security identifier.
     *
     * @return the securityUid value
     */
    public String securityUid() {
        return this.securityUid;
    }

    /**
     * Set unique security identifier.
     *
     * @param securityUid the securityUid value to set
     * @return the ReconciliationBreakDto object itself.
     */
    public ReconciliationBreakDto withSecurityUid(String securityUid) {
        this.securityUid = securityUid;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<PropertyDto> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the ReconciliationBreakDto object itself.
     */
    public ReconciliationBreakDto withProperties(List<PropertyDto> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get difference in units.
     *
     * @return the unitsDifference value
     */
    public Double unitsDifference() {
        return this.unitsDifference;
    }

    /**
     * Set difference in units.
     *
     * @param unitsDifference the unitsDifference value to set
     * @return the ReconciliationBreakDto object itself.
     */
    public ReconciliationBreakDto withUnitsDifference(Double unitsDifference) {
        this.unitsDifference = unitsDifference;
        return this;
    }

    /**
     * Get difference in cost.
     *
     * @return the costDifference value
     */
    public Double costDifference() {
        return this.costDifference;
    }

    /**
     * Set difference in cost.
     *
     * @param costDifference the costDifference value to set
     * @return the ReconciliationBreakDto object itself.
     */
    public ReconciliationBreakDto withCostDifference(Double costDifference) {
        this.costDifference = costDifference;
        return this;
    }

}
