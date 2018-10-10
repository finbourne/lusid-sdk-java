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
public class ReconciliationBreak {
    /**
     * Unique instrument identifier.
     */
    @JsonProperty(value = "instrumentUid", required = true)
    private String instrumentUid;

    /**
     * The subHoldingKeys property.
     */
    @JsonProperty(value = "subHoldingKeys", required = true)
    private List<Property> subHoldingKeys;

    /**
     * Units from the left hand side.
     */
    @JsonProperty(value = "leftUnits", required = true)
    private double leftUnits;

    /**
     * Units from the right hand side.
     */
    @JsonProperty(value = "rightUnits", required = true)
    private double rightUnits;

    /**
     * Difference in units.
     */
    @JsonProperty(value = "differenceUnits", required = true)
    private double differenceUnits;

    /**
     * Cost from the left hand side.
     */
    @JsonProperty(value = "leftCost", required = true)
    private CurrencyAndAmount leftCost;

    /**
     * Cost from the right hand side.
     */
    @JsonProperty(value = "rightCost", required = true)
    private CurrencyAndAmount rightCost;

    /**
     * Difference in cost.
     */
    @JsonProperty(value = "differenceCost", required = true)
    private CurrencyAndAmount differenceCost;

    /**
     * Additional features relating to the security.
     */
    @JsonProperty(value = "instrumentProperties", required = true)
    private List<Property> instrumentProperties;

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
     * @return the ReconciliationBreak object itself.
     */
    public ReconciliationBreak withInstrumentUid(String instrumentUid) {
        this.instrumentUid = instrumentUid;
        return this;
    }

    /**
     * Get the subHoldingKeys value.
     *
     * @return the subHoldingKeys value
     */
    public List<Property> subHoldingKeys() {
        return this.subHoldingKeys;
    }

    /**
     * Set the subHoldingKeys value.
     *
     * @param subHoldingKeys the subHoldingKeys value to set
     * @return the ReconciliationBreak object itself.
     */
    public ReconciliationBreak withSubHoldingKeys(List<Property> subHoldingKeys) {
        this.subHoldingKeys = subHoldingKeys;
        return this;
    }

    /**
     * Get units from the left hand side.
     *
     * @return the leftUnits value
     */
    public double leftUnits() {
        return this.leftUnits;
    }

    /**
     * Set units from the left hand side.
     *
     * @param leftUnits the leftUnits value to set
     * @return the ReconciliationBreak object itself.
     */
    public ReconciliationBreak withLeftUnits(double leftUnits) {
        this.leftUnits = leftUnits;
        return this;
    }

    /**
     * Get units from the right hand side.
     *
     * @return the rightUnits value
     */
    public double rightUnits() {
        return this.rightUnits;
    }

    /**
     * Set units from the right hand side.
     *
     * @param rightUnits the rightUnits value to set
     * @return the ReconciliationBreak object itself.
     */
    public ReconciliationBreak withRightUnits(double rightUnits) {
        this.rightUnits = rightUnits;
        return this;
    }

    /**
     * Get difference in units.
     *
     * @return the differenceUnits value
     */
    public double differenceUnits() {
        return this.differenceUnits;
    }

    /**
     * Set difference in units.
     *
     * @param differenceUnits the differenceUnits value to set
     * @return the ReconciliationBreak object itself.
     */
    public ReconciliationBreak withDifferenceUnits(double differenceUnits) {
        this.differenceUnits = differenceUnits;
        return this;
    }

    /**
     * Get cost from the left hand side.
     *
     * @return the leftCost value
     */
    public CurrencyAndAmount leftCost() {
        return this.leftCost;
    }

    /**
     * Set cost from the left hand side.
     *
     * @param leftCost the leftCost value to set
     * @return the ReconciliationBreak object itself.
     */
    public ReconciliationBreak withLeftCost(CurrencyAndAmount leftCost) {
        this.leftCost = leftCost;
        return this;
    }

    /**
     * Get cost from the right hand side.
     *
     * @return the rightCost value
     */
    public CurrencyAndAmount rightCost() {
        return this.rightCost;
    }

    /**
     * Set cost from the right hand side.
     *
     * @param rightCost the rightCost value to set
     * @return the ReconciliationBreak object itself.
     */
    public ReconciliationBreak withRightCost(CurrencyAndAmount rightCost) {
        this.rightCost = rightCost;
        return this;
    }

    /**
     * Get difference in cost.
     *
     * @return the differenceCost value
     */
    public CurrencyAndAmount differenceCost() {
        return this.differenceCost;
    }

    /**
     * Set difference in cost.
     *
     * @param differenceCost the differenceCost value to set
     * @return the ReconciliationBreak object itself.
     */
    public ReconciliationBreak withDifferenceCost(CurrencyAndAmount differenceCost) {
        this.differenceCost = differenceCost;
        return this;
    }

    /**
     * Get additional features relating to the security.
     *
     * @return the instrumentProperties value
     */
    public List<Property> instrumentProperties() {
        return this.instrumentProperties;
    }

    /**
     * Set additional features relating to the security.
     *
     * @param instrumentProperties the instrumentProperties value to set
     * @return the ReconciliationBreak object itself.
     */
    public ReconciliationBreak withInstrumentProperties(List<Property> instrumentProperties) {
        this.instrumentProperties = instrumentProperties;
        return this;
    }

}
