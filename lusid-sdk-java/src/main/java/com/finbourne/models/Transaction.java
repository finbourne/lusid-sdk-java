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
 * The Transaction model.
 */
public class Transaction {
    /**
     * Unique transaction identifier.
     */
    @JsonProperty(value = "transactionId", required = true)
    private String transactionId;

    /**
     * LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Unique instrument identifier.
     */
    @JsonProperty(value = "instrumentUid", required = true)
    private String instrumentUid;

    /**
     * Transaction date.
     */
    @JsonProperty(value = "transactionDate", required = true)
    private DateTime transactionDate;

    /**
     * Settlement date.
     */
    @JsonProperty(value = "settlementDate", required = true)
    private DateTime settlementDate;

    /**
     * Quantity of transaction in units of the instrument.
     */
    @JsonProperty(value = "units", required = true)
    private double units;

    /**
     * Execution price for the transaction.
     */
    @JsonProperty(value = "transactionPrice", required = true)
    private TransactionPrice transactionPrice;

    /**
     * Total value of the transaction in settlement currency.
     */
    @JsonProperty(value = "totalConsideration", required = true)
    private CurrencyAndAmount totalConsideration;

    /**
     * Rate between transaction and settle currency.
     */
    @JsonProperty(value = "exchangeRate")
    private Double exchangeRate;

    /**
     * Transaction currency.
     */
    @JsonProperty(value = "transactionCurrency")
    private String transactionCurrency;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PerpetualProperty> properties;

    /**
     * Counterparty identifier.
     */
    @JsonProperty(value = "counterpartyId")
    private String counterpartyId;

    /**
     * Where this transaction came from. Possible values include: 'System',
     * 'Client'.
     */
    @JsonProperty(value = "source", required = true)
    private String source;

    /**
     * The nettingSet property.
     */
    @JsonProperty(value = "nettingSet")
    private String nettingSet;

    /**
     * Get unique transaction identifier.
     *
     * @return the transactionId value
     */
    public String transactionId() {
        return this.transactionId;
    }

    /**
     * Set unique transaction identifier.
     *
     * @param transactionId the transactionId value to set
     * @return the Transaction object itself.
     */
    public Transaction withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
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
     * Set lUSID transaction type code - Buy, Sell, StockIn, StockOut, etc.
     *
     * @param type the type value to set
     * @return the Transaction object itself.
     */
    public Transaction withType(String type) {
        this.type = type;
        return this;
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
     * Set unique instrument identifier.
     *
     * @param instrumentUid the instrumentUid value to set
     * @return the Transaction object itself.
     */
    public Transaction withInstrumentUid(String instrumentUid) {
        this.instrumentUid = instrumentUid;
        return this;
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
     * Set transaction date.
     *
     * @param transactionDate the transactionDate value to set
     * @return the Transaction object itself.
     */
    public Transaction withTransactionDate(DateTime transactionDate) {
        this.transactionDate = transactionDate;
        return this;
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
     * Set settlement date.
     *
     * @param settlementDate the settlementDate value to set
     * @return the Transaction object itself.
     */
    public Transaction withSettlementDate(DateTime settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    /**
     * Get quantity of transaction in units of the instrument.
     *
     * @return the units value
     */
    public double units() {
        return this.units;
    }

    /**
     * Set quantity of transaction in units of the instrument.
     *
     * @param units the units value to set
     * @return the Transaction object itself.
     */
    public Transaction withUnits(double units) {
        this.units = units;
        return this;
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
     * Set execution price for the transaction.
     *
     * @param transactionPrice the transactionPrice value to set
     * @return the Transaction object itself.
     */
    public Transaction withTransactionPrice(TransactionPrice transactionPrice) {
        this.transactionPrice = transactionPrice;
        return this;
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
     * Set total value of the transaction in settlement currency.
     *
     * @param totalConsideration the totalConsideration value to set
     * @return the Transaction object itself.
     */
    public Transaction withTotalConsideration(CurrencyAndAmount totalConsideration) {
        this.totalConsideration = totalConsideration;
        return this;
    }

    /**
     * Get rate between transaction and settle currency.
     *
     * @return the exchangeRate value
     */
    public Double exchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Set rate between transaction and settle currency.
     *
     * @param exchangeRate the exchangeRate value to set
     * @return the Transaction object itself.
     */
    public Transaction withExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
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
     * Set transaction currency.
     *
     * @param transactionCurrency the transactionCurrency value to set
     * @return the Transaction object itself.
     */
    public Transaction withTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
        return this;
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
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the Transaction object itself.
     */
    public Transaction withProperties(List<PerpetualProperty> properties) {
        this.properties = properties;
        return this;
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
     * Set counterparty identifier.
     *
     * @param counterpartyId the counterpartyId value to set
     * @return the Transaction object itself.
     */
    public Transaction withCounterpartyId(String counterpartyId) {
        this.counterpartyId = counterpartyId;
        return this;
    }

    /**
     * Get where this transaction came from. Possible values include: 'System', 'Client'.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set where this transaction came from. Possible values include: 'System', 'Client'.
     *
     * @param source the source value to set
     * @return the Transaction object itself.
     */
    public Transaction withSource(String source) {
        this.source = source;
        return this;
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
     * Set the nettingSet value.
     *
     * @param nettingSet the nettingSet value to set
     * @return the Transaction object itself.
     */
    public Transaction withNettingSet(String nettingSet) {
        this.nettingSet = nettingSet;
        return this;
    }

}
