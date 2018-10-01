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
     * Unique transaction identifier.
     */
    @JsonProperty(value = "transactionId", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String transactionId;

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
     * Transaction date.
     */
    @JsonProperty(value = "transactionDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime transactionDate;

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
     * Execution price for the transaction.
     */
    @JsonProperty(value = "transactionPrice", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private TransactionPrice transactionPrice;

    /**
     * Total value of the transaction in settlement currency.
     */
    @JsonProperty(value = "totalConsideration", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private CurrencyAndAmount totalConsideration;

    /**
     * Rate between transaction and settlement currency.
     */
    @JsonProperty(value = "exchangeRate", access = JsonProperty.Access.WRITE_ONLY)
    private Double exchangeRate;

    /**
     * Rate between transaction and portfolio currency.
     */
    @JsonProperty(value = "transactionToPortfolioRate", access = JsonProperty.Access.WRITE_ONLY)
    private Double transactionToPortfolioRate;

    /**
     * Transaction currency.
     */
    @JsonProperty(value = "transactionCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private String transactionCurrency;

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
     * Get unique transaction identifier.
     *
     * @return the transactionId value
     */
    public String transactionId() {
        return this.transactionId;
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
     * Get transaction date.
     *
     * @return the transactionDate value
     */
    public DateTime transactionDate() {
        return this.transactionDate;
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
     * Get execution price for the transaction.
     *
     * @return the transactionPrice value
     */
    public TransactionPrice transactionPrice() {
        return this.transactionPrice;
    }

    /**
     * Get total value of the transaction in settlement currency.
     *
     * @return the totalConsideration value
     */
    public CurrencyAndAmount totalConsideration() {
        return this.totalConsideration;
    }

    /**
     * Get rate between transaction and settlement currency.
     *
     * @return the exchangeRate value
     */
    public Double exchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Get rate between transaction and portfolio currency.
     *
     * @return the transactionToPortfolioRate value
     */
    public Double transactionToPortfolioRate() {
        return this.transactionToPortfolioRate;
    }

    /**
     * Get transaction currency.
     *
     * @return the transactionCurrency value
     */
    public String transactionCurrency() {
        return this.transactionCurrency;
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
