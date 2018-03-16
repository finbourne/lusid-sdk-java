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
 * The HoldingDto model.
 */
public class HoldingDto {
    /**
     * The securityUid property.
     */
    @JsonProperty(value = "securityUid", required = true)
    private String securityUid;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PropertyDto> properties;

    /**
     * The holdingType property.
     */
    @JsonProperty(value = "holdingType", required = true)
    private String holdingType;

    /**
     * The units property.
     */
    @JsonProperty(value = "units", required = true)
    private double units;

    /**
     * The settledUnits property.
     */
    @JsonProperty(value = "settledUnits", required = true)
    private double settledUnits;

    /**
     * The cost property.
     */
    @JsonProperty(value = "cost", required = true)
    private double cost;

    /**
     * The transaction property.
     */
    @JsonProperty(value = "transaction")
    private TradeDto transaction;

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
     * @return the HoldingDto object itself.
     */
    public HoldingDto withSecurityUid(String securityUid) {
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
     * @return the HoldingDto object itself.
     */
    public HoldingDto withProperties(List<PropertyDto> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the holdingType value.
     *
     * @return the holdingType value
     */
    public String holdingType() {
        return this.holdingType;
    }

    /**
     * Set the holdingType value.
     *
     * @param holdingType the holdingType value to set
     * @return the HoldingDto object itself.
     */
    public HoldingDto withHoldingType(String holdingType) {
        this.holdingType = holdingType;
        return this;
    }

    /**
     * Get the units value.
     *
     * @return the units value
     */
    public double units() {
        return this.units;
    }

    /**
     * Set the units value.
     *
     * @param units the units value to set
     * @return the HoldingDto object itself.
     */
    public HoldingDto withUnits(double units) {
        this.units = units;
        return this;
    }

    /**
     * Get the settledUnits value.
     *
     * @return the settledUnits value
     */
    public double settledUnits() {
        return this.settledUnits;
    }

    /**
     * Set the settledUnits value.
     *
     * @param settledUnits the settledUnits value to set
     * @return the HoldingDto object itself.
     */
    public HoldingDto withSettledUnits(double settledUnits) {
        this.settledUnits = settledUnits;
        return this;
    }

    /**
     * Get the cost value.
     *
     * @return the cost value
     */
    public double cost() {
        return this.cost;
    }

    /**
     * Set the cost value.
     *
     * @param cost the cost value to set
     * @return the HoldingDto object itself.
     */
    public HoldingDto withCost(double cost) {
        this.cost = cost;
        return this;
    }

    /**
     * Get the transaction value.
     *
     * @return the transaction value
     */
    public TradeDto transaction() {
        return this.transaction;
    }

    /**
     * Set the transaction value.
     *
     * @param transaction the transaction value to set
     * @return the HoldingDto object itself.
     */
    public HoldingDto withTransaction(TradeDto transaction) {
        this.transaction = transaction;
        return this;
    }

}
