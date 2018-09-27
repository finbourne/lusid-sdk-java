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
 * The RealisedGainLoss model.
 */
public class RealisedGainLoss {
    /**
     * Unique instrument identifier.
     */
    @JsonProperty(value = "instrumentUid", access = JsonProperty.Access.WRITE_ONLY)
    private String instrumentUid;

    /**
     * Quantity against which gain has been made in units of the instrument.
     */
    @JsonProperty(value = "units", access = JsonProperty.Access.WRITE_ONLY)
    private Double units;

    /**
     * Date the position was originally purchased.
     */
    @JsonProperty(value = "purchaseTradeDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime purchaseTradeDate;

    /**
     * Date the position originally settled.
     */
    @JsonProperty(value = "purchaseSettlementDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime purchaseSettlementDate;

    /**
     * Price the instrument was purchased at.
     */
    @JsonProperty(value = "purchasePrice", access = JsonProperty.Access.WRITE_ONLY)
    private Double purchasePrice;

    /**
     * Purchase cost in the trade currency.
     */
    @JsonProperty(value = "costTradeCcy", access = JsonProperty.Access.WRITE_ONLY)
    private CurrencyAndAmount costTradeCcy;

    /**
     * Purchase cost in the trade currency.
     */
    @JsonProperty(value = "costPortfolioCcy", access = JsonProperty.Access.WRITE_ONLY)
    private CurrencyAndAmount costPortfolioCcy;

    /**
     * Gains or losses in the trade currency.
     */
    @JsonProperty(value = "realisedTradeCcy", access = JsonProperty.Access.WRITE_ONLY)
    private CurrencyAndAmount realisedTradeCcy;

    /**
     * Total gains or losses in the portfolio currency.
     */
    @JsonProperty(value = "realisedTotal", access = JsonProperty.Access.WRITE_ONLY)
    private CurrencyAndAmount realisedTotal;

    /**
     * Market gains or losses in the portfolio currency.
     */
    @JsonProperty(value = "realisedMarket", access = JsonProperty.Access.WRITE_ONLY)
    private CurrencyAndAmount realisedMarket;

    /**
     * Currency gains or losses in the portfolio currency.
     */
    @JsonProperty(value = "realisedCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private CurrencyAndAmount realisedCurrency;

    /**
     * Get unique instrument identifier.
     *
     * @return the instrumentUid value
     */
    public String instrumentUid() {
        return this.instrumentUid;
    }

    /**
     * Get quantity against which gain has been made in units of the instrument.
     *
     * @return the units value
     */
    public Double units() {
        return this.units;
    }

    /**
     * Get date the position was originally purchased.
     *
     * @return the purchaseTradeDate value
     */
    public DateTime purchaseTradeDate() {
        return this.purchaseTradeDate;
    }

    /**
     * Get date the position originally settled.
     *
     * @return the purchaseSettlementDate value
     */
    public DateTime purchaseSettlementDate() {
        return this.purchaseSettlementDate;
    }

    /**
     * Get price the instrument was purchased at.
     *
     * @return the purchasePrice value
     */
    public Double purchasePrice() {
        return this.purchasePrice;
    }

    /**
     * Get purchase cost in the trade currency.
     *
     * @return the costTradeCcy value
     */
    public CurrencyAndAmount costTradeCcy() {
        return this.costTradeCcy;
    }

    /**
     * Get purchase cost in the trade currency.
     *
     * @return the costPortfolioCcy value
     */
    public CurrencyAndAmount costPortfolioCcy() {
        return this.costPortfolioCcy;
    }

    /**
     * Get gains or losses in the trade currency.
     *
     * @return the realisedTradeCcy value
     */
    public CurrencyAndAmount realisedTradeCcy() {
        return this.realisedTradeCcy;
    }

    /**
     * Get total gains or losses in the portfolio currency.
     *
     * @return the realisedTotal value
     */
    public CurrencyAndAmount realisedTotal() {
        return this.realisedTotal;
    }

    /**
     * Get market gains or losses in the portfolio currency.
     *
     * @return the realisedMarket value
     */
    public CurrencyAndAmount realisedMarket() {
        return this.realisedMarket;
    }

    /**
     * Get currency gains or losses in the portfolio currency.
     *
     * @return the realisedCurrency value
     */
    public CurrencyAndAmount realisedCurrency() {
        return this.realisedCurrency;
    }

}
