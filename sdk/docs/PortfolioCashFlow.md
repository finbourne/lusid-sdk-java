

# PortfolioCashFlow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupById** | **Integer** | The groupBy subHoldings and currency. | 
**sequenceNumber** | **Integer** | Sequence number determining the order of the cash flow records. | 
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Indicates the date when the cash-flow settles. |  [optional]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured when a transaction portfolio is created. |  [optional]
**type** | **String** | Indicates the record type (Closed, Open, Activity). | 
**movementName** | **String** | Indicates the specific movement of the transaction that generated this cash flow. | 
**cashflow** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**balance** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**fxRate** | **Double** | Exchange rate between the currency of this cash flow and the reporting currency. | 
**cashflowReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**balanceReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**translationGainLoss** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**costBasisReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**transaction** | [**Transaction**](Transaction.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



