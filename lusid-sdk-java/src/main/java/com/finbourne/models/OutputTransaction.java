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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OutputTransaction model.
 */
public class OutputTransaction {
    /**
     * Unique trade identifier.
     */
    @JsonProperty(value = "tradeId", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String tradeId;

    /**
     * LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc.
     */
    @JsonProperty(value = "type", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * LUSID transaction description.
     */
    @JsonProperty(value = "description", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Unique instrument identifier.
     */
    @JsonProperty(value = "instrumentUid", access = JsonProperty.Access.WRITE_ONLY)
    private String instrumentUid;

    /**
     * Trade date.
     */
    @JsonProperty(value = "tradeDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime tradeDate;

    /**
     * Settlement date.
     */
    @JsonProperty(value = "settlementDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime settlementDate;

    /**
     * Quantity of trade in units of the instrument.
     */
    @JsonProperty(value = "units", access = JsonProperty.Access.WRITE_ONLY)
    private Double units;

    /**
     * Execution price for the trade.
     */
    @JsonProperty(value = "tradePrice", access = JsonProperty.Access.WRITE_ONLY)
    private TransactionPrice tradePrice;

    /**
     * Total value of the trade.
     */
    @JsonProperty(value = "totalConsideration", access = JsonProperty.Access.WRITE_ONLY)
    private CurrencyAndAmount totalConsideration;

    /**
     * Rate between trade and settlement currency.
     */
    @JsonProperty(value = "exchangeRate", access = JsonProperty.Access.WRITE_ONLY)
    private Double exchangeRate;

    /**
     * Rate between trade and portfolio currency.
     */
    @JsonProperty(value = "tradeToPortfolioRate", access = JsonProperty.Access.WRITE_ONLY)
    private Double tradeToPortfolioRate;

    /**
     * Trade currency.
     */
    @JsonProperty(value = "tradeCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private String tradeCurrency;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private List<PerpetualProperty> properties;

    /**
     * Counterparty identifier.
     */
    @JsonProperty(value = "counterpartyId", access = JsonProperty.Access.WRITE_ONLY)
    private String counterpartyId;

    /**
     * Where this transaction came from, either Client or System. Possible
     * values include: 'System', 'Client'.
     */
    @JsonProperty(value = "source", access = JsonProperty.Access.WRITE_ONLY)
    private String source;

    /**
     * The nettingSet property.
     */
    @JsonProperty(value = "nettingSet", access = JsonProperty.Access.WRITE_ONLY)
    private String nettingSet;

    /**
     * Transaction status (active, amended or cancelled). Possible values
     * include: 'Active', 'Amended', 'Cancelled'.
     */
    @JsonProperty(value = "transactionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String transactionStatus;

    /**
     * Date/Time the transaction was booked into LUSID.
     */
    @JsonProperty(value = "entryDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime entryDateTime;

    /**
     * Date/Time the cancellation was booked into LUSID.
     */
    @JsonProperty(value = "cancelDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime cancelDateTime;

    /**
     * Collection of gains or losses.
     */
    @JsonProperty(value = "realisedGainLoss", access = JsonProperty.Access.WRITE_ONLY)
    private List<RealisedGainLoss> realisedGainLoss;

    /**
     * Get unique trade identifier.
     *
     * @return the tradeId value
     */
    public String tradeId() {
        return this.tradeId;
    }

    /**
     * Get lUSID transaction type code - Buy, Sell, StockIn, StockOut, etc.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get lUSID transaction description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get unique instrument identifier.
     *
     * @return the instrumentUid value
     */
    public String instrumentUid() {
        return this.instrumentUid;
    }

    /**
     * Get trade date.
     *
     * @return the tradeDate value
     */
    public DateTime tradeDate() {
        return this.tradeDate;
    }

    /**
     * Get settlement date.
     *
     * @return the settlementDate value
     */
    public DateTime settlementDate() {
        return this.settlementDate;
    }

    /**
     * Get quantity of trade in units of the instrument.
     *
     * @return the units value
     */
    public Double units() {
        return this.units;
    }

    /**
     * Get execution price for the trade.
     *
     * @return the tradePrice value
     */
    public TransactionPrice tradePrice() {
        return this.tradePrice;
    }

    /**
     * Get total value of the trade.
     *
     * @return the totalConsideration value
     */
    public CurrencyAndAmount totalConsideration() {
        return this.totalConsideration;
    }

    /**
     * Get rate between trade and settlement currency.
     *
     * @return the exchangeRate value
     */
    public Double exchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Get rate between trade and portfolio currency.
     *
     * @return the tradeToPortfolioRate value
     */
    public Double tradeToPortfolioRate() {
        return this.tradeToPortfolioRate;
    }

    /**
     * Get trade currency.
     *
     * @return the tradeCurrency value
     */
    public String tradeCurrency() {
        return this.tradeCurrency;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<PerpetualProperty> properties() {
        return this.properties;
    }

    /**
     * Get counterparty identifier.
     *
     * @return the counterpartyId value
     */
    public String counterpartyId() {
        return this.counterpartyId;
    }

    /**
     * Get where this transaction came from, either Client or System. Possible values include: 'System', 'Client'.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Get the nettingSet value.
     *
     * @return the nettingSet value
     */
    public String nettingSet() {
        return this.nettingSet;
    }

    /**
     * Get transaction status (active, amended or cancelled). Possible values include: 'Active', 'Amended', 'Cancelled'.
     *
     * @return the transactionStatus value
     */
    public String transactionStatus() {
        return this.transactionStatus;
    }

    /**
     * Get date/Time the transaction was booked into LUSID.
     *
     * @return the entryDateTime value
     */
    public DateTime entryDateTime() {
        return this.entryDateTime;
    }

    /**
     * Get date/Time the cancellation was booked into LUSID.
     *
     * @return the cancelDateTime value
     */
    public DateTime cancelDateTime() {
        return this.cancelDateTime;
    }

    /**
     * Get collection of gains or losses.
     *
     * @return the realisedGainLoss value
     */
    public List<RealisedGainLoss> realisedGainLoss() {
        return this.realisedGainLoss;
    }

}
