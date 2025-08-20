

# PortfolioHolding

A list of holdings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentScope** | **String** | The scope in which the holding&#39;s instrument is in. |  [optional] |
|**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. |  |
|**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties which have been requested to be decorated onto the holding. These will be from the &#39;Instrument&#39; or &#39;Holding&#39; domain. |  [optional] |
|**holdingType** | **String** | The code for the type of the holding e.g. P, B, C, R, F etc. |  |
|**units** | **java.math.BigDecimal** | The total number of units of the holding. |  |
|**settledUnits** | **java.math.BigDecimal** | The total number of settled units of the holding. |  |
|**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**transaction** | [**Transaction**](Transaction.md) |  |  [optional] |
|**currency** | **String** | The holding currency. |  [optional] |
|**holdingTypeName** | **String** | The decoded type of the holding e.g. Position, Balance, CashCommitment, Receivable, ForwardFX etc. |  [optional] |
|**holdingId** | **Long** | A single identifier for the holding within the portfolio. The holdingId is constructed from the LusidInstrumentId, sub-holding keys and currrency and is unique within the portfolio. |  [optional] |
|**notionalCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**amortisedCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**amortisedCostPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**variationMargin** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**variationMarginPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**settlementSchedule** | [**List&lt;SettlementSchedule&gt;**](SettlementSchedule.md) | Where no. of days ahead has been specified, future dated settlements will be captured here. |  [optional] |
|**currentFace** | **java.math.BigDecimal** | Current face value of the holding. |  [optional] |
|**custodianAccountId** | [**ResourceId**](ResourceId.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


