

# ReconciliationBreak

A reconciliation break

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentScope** | **String** | The scope in which the instrument lies. |  [optional] |
|**instrumentUid** | **String** | Unique instrument identifier |  |
|**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Any other properties that comprise the Sub-Holding Key |  |
|**leftUnits** | **java.math.BigDecimal** | Units from the left hand side |  |
|**rightUnits** | **java.math.BigDecimal** | Units from the right hand side |  |
|**differenceUnits** | **java.math.BigDecimal** | Difference in units |  |
|**leftCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**rightCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**differenceCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**instrumentProperties** | [**List&lt;Property&gt;**](Property.md) | Additional features relating to the instrument |  |



