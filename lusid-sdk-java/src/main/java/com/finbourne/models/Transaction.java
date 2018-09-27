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
    @JsonProperty(value = "instrumentUid")
    private String instrumentUid;

    /**
     * Transaction date.
     */
    @JsonProperty(value = "transactionDate")
    private DateTime transactionDate;

    /**
     * Settlement date.
     */
    @JsonProperty(value = "settlementDate")
    private DateTime settlementDate;

    /**
     * Quantity of transaction in units of the instrument.
     */
    @JsonProperty(value = "units")
    private Double units;

    /**
     * Execution price for the transaction.
     */
    @JsonProperty(value = "transactionPrice")
    private Double transactionPrice;

    /**
     * Total value of the transaction.
     */
    @JsonProperty(value = "totalConsideration")
    private Double totalConsideration;

    /**
     * Rate between transaction and settle currency.
     */
    @JsonProperty(value = "exchangeRate")
    private Double exchangeRate;

    /**
     * Settlement currency.
     */
    @JsonProperty(value = "settlementCurrency")
    private String settlementCurrency;

    /**
     * Transaction currency.
     */
    @JsonProperty(value = "transactionCurrency")
    private NullableOfCurrency transactionCurrency;

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
    @JsonProperty(value = "source")
    private String source;

    /**
     * Possible values include: 'Default', 'ExDividend', 'CumDividend'.
     */
    @JsonProperty(value = "dividendState")
    private String dividendState;

    /**
     * Possible values include: 'Price', 'Yield', 'Spread'.
     */
    @JsonProperty(value = "transactionPriceType")
    private String transactionPriceType;

    /**
     * Possible values include: 'Nominal', 'Shares', 'FaceValue', 'Contracts'.
     */
    @JsonProperty(value = "unitType")
    private String unitType;

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
    public Double units() {
        return this.units;
    }

    /**
     * Set quantity of transaction in units of the instrument.
     *
     * @param units the units value to set
     * @return the Transaction object itself.
     */
    public Transaction withUnits(Double units) {
        this.units = units;
        return this;
    }

    /**
     * Get execution price for the transaction.
     *
     * @return the transactionPrice value
     */
    public Double transactionPrice() {
        return this.transactionPrice;
    }

    /**
     * Set execution price for the transaction.
     *
     * @param transactionPrice the transactionPrice value to set
     * @return the Transaction object itself.
     */
    public Transaction withTransactionPrice(Double transactionPrice) {
        this.transactionPrice = transactionPrice;
        return this;
    }

    /**
     * Get total value of the transaction.
     *
     * @return the totalConsideration value
     */
    public Double totalConsideration() {
        return this.totalConsideration;
    }

    /**
     * Set total value of the transaction.
     *
     * @param totalConsideration the totalConsideration value to set
     * @return the Transaction object itself.
     */
    public Transaction withTotalConsideration(Double totalConsideration) {
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
     * Get settlement currency.
     *
     * @return the settlementCurrency value
     */
    public String settlementCurrency() {
        return this.settlementCurrency;
    }

    /**
     * Set settlement currency.
     *
     * @param settlementCurrency the settlementCurrency value to set
     * @return the Transaction object itself.
     */
    public Transaction withSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
        return this;
    }

    /**
     * Get transaction currency.
     *
     * @return the transactionCurrency value
     */
    public NullableOfCurrency transactionCurrency() {
        return this.transactionCurrency;
    }

    /**
     * Set transaction currency.
     *
     * @param transactionCurrency the transactionCurrency value to set
     * @return the Transaction object itself.
     */
    public Transaction withTransactionCurrency(NullableOfCurrency transactionCurrency) {
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
     * Get possible values include: 'Default', 'ExDividend', 'CumDividend'.
     *
     * @return the dividendState value
     */
    public String dividendState() {
        return this.dividendState;
    }

    /**
     * Set possible values include: 'Default', 'ExDividend', 'CumDividend'.
     *
     * @param dividendState the dividendState value to set
     * @return the Transaction object itself.
     */
    public Transaction withDividendState(String dividendState) {
        this.dividendState = dividendState;
        return this;
    }

    /**
     * Get possible values include: 'Price', 'Yield', 'Spread'.
     *
     * @return the transactionPriceType value
     */
    public String transactionPriceType() {
        return this.transactionPriceType;
    }

    /**
     * Set possible values include: 'Price', 'Yield', 'Spread'.
     *
     * @param transactionPriceType the transactionPriceType value to set
     * @return the Transaction object itself.
     */
    public Transaction withTransactionPriceType(String transactionPriceType) {
        this.transactionPriceType = transactionPriceType;
        return this;
    }

    /**
     * Get possible values include: 'Nominal', 'Shares', 'FaceValue', 'Contracts'.
     *
     * @return the unitType value
     */
    public String unitType() {
        return this.unitType;
    }

    /**
     * Set possible values include: 'Nominal', 'Shares', 'FaceValue', 'Contracts'.
     *
     * @param unitType the unitType value to set
     * @return the Transaction object itself.
     */
    public Transaction withUnitType(String unitType) {
        this.unitType = unitType;
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
