

# PortfolioHolding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentUid** | **String** | The unqiue Lusid Instrument Id (LUID) of the instrument that the holding is in. | 
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured when a transaction portfolio is created. |  [optional]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties which have been requested to be decorated onto the holding. These will be from the &#39;Instrument&#39; or &#39;Holding&#39; domain. |  [optional]
**holdingType** | **String** | The type of the holding e.g. Position, Balance, CashCommitment, Receivable, ForwardFX etc. | 
**units** | **Double** | The total number of units of the holding. | 
**settledUnits** | **Double** | The total number of settled units of the holding. | 
**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**transaction** | [**Transaction**](Transaction.md) |  |  [optional]
**currency** | **String** | The holding currency. | 



