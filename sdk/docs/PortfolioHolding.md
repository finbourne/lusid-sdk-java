
# PortfolioHolding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentUid** | **String** | Unique instrument identifier | 
**subHoldingKeys** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  |  [optional]
**properties** | [**List&lt;Property&gt;**](Property.md) |  |  [optional]
**holdingType** | **String** | Type of holding, eg Position, Balance, CashCommitment, Receivable, ForwardFX | 
**units** | **Double** | Quantity of holding | 
**settledUnits** | **Double** | Settled quantity of holding | 
**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Book cost of holding in transaction currency | 
**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Book cost of holding in portfolio currency | 
**transaction** | [**Transaction**](Transaction.md) | If this is commitment-type holding, the transaction behind it |  [optional]



