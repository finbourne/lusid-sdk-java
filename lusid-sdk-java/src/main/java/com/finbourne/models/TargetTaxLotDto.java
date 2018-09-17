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

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Used to specify holdings target amounts at the tax-lot level.
 */
public class TargetTaxLotDto {
    /**
     * Quantity of holding.
     */
    @JsonProperty(value = "units")
    private Double units;

    /**
     * Book cost of holding in trade currency.
     */
    @JsonProperty(value = "cost")
    private Double cost;

    /**
     * Book cost of holding in portfolio currency.
     */
    @JsonProperty(value = "portfolioCost")
    private Double portfolioCost;

    /**
     * Purchase price. Part of the unique key required for multiple taxlots.
     */
    @JsonProperty(value = "price")
    private Double price;

    /**
     * Purchase Date. Part of the unique key required for multiple taxlots.
     */
    @JsonProperty(value = "purchaseDate")
    private DateTime purchaseDate;

    /**
     * Original settlement date of the tax-lot's opening transaction.
     */
    @JsonProperty(value = "settlementDate")
    private DateTime settlementDate;

    /**
     * Get quantity of holding.
     *
     * @return the units value
     */
    public Double units() {
        return this.units;
    }

    /**
     * Set quantity of holding.
     *
     * @param units the units value to set
     * @return the TargetTaxLotDto object itself.
     */
    public TargetTaxLotDto withUnits(Double units) {
        this.units = units;
        return this;
    }

    /**
     * Get book cost of holding in trade currency.
     *
     * @return the cost value
     */
    public Double cost() {
        return this.cost;
    }

    /**
     * Set book cost of holding in trade currency.
     *
     * @param cost the cost value to set
     * @return the TargetTaxLotDto object itself.
     */
    public TargetTaxLotDto withCost(Double cost) {
        this.cost = cost;
        return this;
    }

    /**
     * Get book cost of holding in portfolio currency.
     *
     * @return the portfolioCost value
     */
    public Double portfolioCost() {
        return this.portfolioCost;
    }

    /**
     * Set book cost of holding in portfolio currency.
     *
     * @param portfolioCost the portfolioCost value to set
     * @return the TargetTaxLotDto object itself.
     */
    public TargetTaxLotDto withPortfolioCost(Double portfolioCost) {
        this.portfolioCost = portfolioCost;
        return this;
    }

    /**
     * Get purchase price. Part of the unique key required for multiple taxlots.
     *
     * @return the price value
     */
    public Double price() {
        return this.price;
    }

    /**
     * Set purchase price. Part of the unique key required for multiple taxlots.
     *
     * @param price the price value to set
     * @return the TargetTaxLotDto object itself.
     */
    public TargetTaxLotDto withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Get purchase Date. Part of the unique key required for multiple taxlots.
     *
     * @return the purchaseDate value
     */
    public DateTime purchaseDate() {
        return this.purchaseDate;
    }

    /**
     * Set purchase Date. Part of the unique key required for multiple taxlots.
     *
     * @param purchaseDate the purchaseDate value to set
     * @return the TargetTaxLotDto object itself.
     */
    public TargetTaxLotDto withPurchaseDate(DateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    /**
     * Get original settlement date of the tax-lot's opening transaction.
     *
     * @return the settlementDate value
     */
    public DateTime settlementDate() {
        return this.settlementDate;
    }

    /**
     * Set original settlement date of the tax-lot's opening transaction.
     *
     * @param settlementDate the settlementDate value to set
     * @return the TargetTaxLotDto object itself.
     */
    public TargetTaxLotDto withSettlementDate(DateTime settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

}
