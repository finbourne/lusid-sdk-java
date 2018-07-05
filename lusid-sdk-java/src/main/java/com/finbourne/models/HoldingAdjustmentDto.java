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
 * Used to specify the 'target' holding when calling the AdjustHoldings Api.
 */
public class HoldingAdjustmentDto {
    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The securityUid property.
     */
    @JsonProperty(value = "securityUid")
    private String securityUid;

    /**
     * The units property.
     */
    @JsonProperty(value = "units")
    private Double units;

    /**
     * The cost property.
     */
    @JsonProperty(value = "cost")
    private Double cost;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<CreatePropertyRequest> properties;

    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * Get the href value.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the href value.
     *
     * @param href the href value to set
     * @return the HoldingAdjustmentDto object itself.
     */
    public HoldingAdjustmentDto withHref(String href) {
        this.href = href;
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
     * @return the HoldingAdjustmentDto object itself.
     */
    public HoldingAdjustmentDto withSecurityUid(String securityUid) {
        this.securityUid = securityUid;
        return this;
    }

    /**
     * Get the units value.
     *
     * @return the units value
     */
    public Double units() {
        return this.units;
    }

    /**
     * Set the units value.
     *
     * @param units the units value to set
     * @return the HoldingAdjustmentDto object itself.
     */
    public HoldingAdjustmentDto withUnits(Double units) {
        this.units = units;
        return this;
    }

    /**
     * Get the cost value.
     *
     * @return the cost value
     */
    public Double cost() {
        return this.cost;
    }

    /**
     * Set the cost value.
     *
     * @param cost the cost value to set
     * @return the HoldingAdjustmentDto object itself.
     */
    public HoldingAdjustmentDto withCost(Double cost) {
        this.cost = cost;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<CreatePropertyRequest> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the HoldingAdjustmentDto object itself.
     */
    public HoldingAdjustmentDto withProperties(List<CreatePropertyRequest> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the _links value.
     *
     * @return the _links value
     */
    public List<Link> _links() {
        return this._links;
    }

    /**
     * Set the _links value.
     *
     * @param _links the _links value to set
     * @return the HoldingAdjustmentDto object itself.
     */
    public HoldingAdjustmentDto with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

}
