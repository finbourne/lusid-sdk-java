

# FeeAccrual


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveAt** | **OffsetDateTime** | The effective date for which the fee accrual has been calculated. |  |
|**code** | **String** | The code of the fee for which the accrual has been calculated. |  |
|**name** | **String** | The name of the fee for which the accrual has been calculated. |  |
|**calculationBase** | **java.math.BigDecimal** | The result of the evaluating the fee&#39;s calculation base expression. |  [optional] |
|**amount** | **java.math.BigDecimal** | The result of applying the fee to the calculation base, and scaled down to a day. |  [optional] |
|**previousAccrual** | **java.math.BigDecimal** | The previous valuation point&#39;s total accrual. |  [optional] |
|**totalAccrual** | **java.math.BigDecimal** | The sum of the PreviousAccrual and Amount. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


