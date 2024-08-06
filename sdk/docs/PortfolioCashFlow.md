

# PortfolioCashFlow

The details for the cashflow for a given portfolio.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupById** | **Integer** | The groupBy subHoldings and currency. |  |
|**sequenceNumber** | **Integer** | Sequence number determining the order of the cash flow records. |  |
|**effectiveDate** | **OffsetDateTime** | Indicates the date when the cash-flow settles. |  [optional] |
|**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. |  [optional] |
|**type** | **String** | Indicates the record type (Closed, Open, Activity). |  |
|**movementName** | **String** | Indicates the specific movement of the transaction that generated this cash flow. |  |
|**cashflow** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**balance** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**fxRate** | **java.math.BigDecimal** | Exchange rate between the currency of this cash flow and the reporting currency. |  |
|**cashflowReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**balanceReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**translationGainLoss** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**costBasisReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**transaction** | [**Transaction**](Transaction.md) |  |  [optional] |
|**unrealisedGainLossReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


