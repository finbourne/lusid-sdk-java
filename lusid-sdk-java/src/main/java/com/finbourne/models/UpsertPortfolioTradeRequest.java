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
 * The UpsertPortfolioTradeRequest model.
 */
public class UpsertPortfolioTradeRequest {
    /**
     * Unique trade identifier.
     */
    @JsonProperty(value = "tradeId", required = true)
    private String tradeId;

    /**
     * LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Unique security identifier.
     */
    @JsonProperty(value = "securityUid")
    private String securityUid;

    /**
     * Trade date.
     */
    @JsonProperty(value = "tradeDate")
    private DateTime tradeDate;

    /**
     * Settlement date.
     */
    @JsonProperty(value = "settlementDate")
    private DateTime settlementDate;

    /**
     * Quantity of trade in units of the security.
     */
    @JsonProperty(value = "units")
    private Double units;

    /**
     * Execution price for the trade.
     */
    @JsonProperty(value = "tradePrice")
    private Double tradePrice;

    /**
     * Total value of the trade.
     */
    @JsonProperty(value = "totalConsideration")
    private Double totalConsideration;

    /**
     * Rate between trade and settle currency.
     */
    @JsonProperty(value = "exchangeRate")
    private Double exchangeRate;

    /**
     * Settlement currency.
     */
    @JsonProperty(value = "settlementCurrency", required = true)
    private String settlementCurrency;

    /**
     * Trade currency.
     */
    @JsonProperty(value = "tradeCurrency")
    private String tradeCurrency;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<CreatePerpetualPropertyRequest> properties;

    /**
     * Counterparty identifier.
     */
    @JsonProperty(value = "counterpartyId")
    private String counterpartyId;

    /**
     * Where this trade came from, either Client or System. Possible values
     * include: 'System', 'Client'.
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
    @JsonProperty(value = "tradePriceType")
    private String tradePriceType;

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
     * Get unique trade identifier.
     *
     * @return the tradeId value
     */
    public String tradeId() {
        return this.tradeId;
    }

    /**
     * Set unique trade identifier.
     *
     * @param tradeId the tradeId value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withTradeId(String tradeId) {
        this.tradeId = tradeId;
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
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withType(String type) {
        this.type = type;
        return this;
    }

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
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withSecurityUid(String securityUid) {
        this.securityUid = securityUid;
        return this;
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
     * Set trade date.
     *
     * @param tradeDate the tradeDate value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withTradeDate(DateTime tradeDate) {
        this.tradeDate = tradeDate;
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
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withSettlementDate(DateTime settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    /**
     * Get quantity of trade in units of the security.
     *
     * @return the units value
     */
    public Double units() {
        return this.units;
    }

    /**
     * Set quantity of trade in units of the security.
     *
     * @param units the units value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withUnits(Double units) {
        this.units = units;
        return this;
    }

    /**
     * Get execution price for the trade.
     *
     * @return the tradePrice value
     */
    public Double tradePrice() {
        return this.tradePrice;
    }

    /**
     * Set execution price for the trade.
     *
     * @param tradePrice the tradePrice value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }

    /**
     * Get total value of the trade.
     *
     * @return the totalConsideration value
     */
    public Double totalConsideration() {
        return this.totalConsideration;
    }

    /**
     * Set total value of the trade.
     *
     * @param totalConsideration the totalConsideration value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withTotalConsideration(Double totalConsideration) {
        this.totalConsideration = totalConsideration;
        return this;
    }

    /**
     * Get rate between trade and settle currency.
     *
     * @return the exchangeRate value
     */
    public Double exchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Set rate between trade and settle currency.
     *
     * @param exchangeRate the exchangeRate value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withExchangeRate(Double exchangeRate) {
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
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
        return this;
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
     * Set trade currency.
     *
     * @param tradeCurrency the tradeCurrency value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withTradeCurrency(String tradeCurrency) {
        this.tradeCurrency = tradeCurrency;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<CreatePerpetualPropertyRequest> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withProperties(List<CreatePerpetualPropertyRequest> properties) {
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
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withCounterpartyId(String counterpartyId) {
        this.counterpartyId = counterpartyId;
        return this;
    }

    /**
     * Get where this trade came from, either Client or System. Possible values include: 'System', 'Client'.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set where this trade came from, either Client or System. Possible values include: 'System', 'Client'.
     *
     * @param source the source value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withSource(String source) {
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
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withDividendState(String dividendState) {
        this.dividendState = dividendState;
        return this;
    }

    /**
     * Get possible values include: 'Price', 'Yield', 'Spread'.
     *
     * @return the tradePriceType value
     */
    public String tradePriceType() {
        return this.tradePriceType;
    }

    /**
     * Set possible values include: 'Price', 'Yield', 'Spread'.
     *
     * @param tradePriceType the tradePriceType value to set
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withTradePriceType(String tradePriceType) {
        this.tradePriceType = tradePriceType;
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
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withUnitType(String unitType) {
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
     * @return the UpsertPortfolioTradeRequest object itself.
     */
    public UpsertPortfolioTradeRequest withNettingSet(String nettingSet) {
        this.nettingSet = nettingSet;
        return this;
    }

}
