

# CashFlowValueAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | **OffsetDateTime** | The payment date of the cash flow | 
**diagnostics** | [**ResultValueDictionary**](ResultValueDictionary.md) |  |  [optional]
**cashFlowLineage** | [**CashFlowLineage**](CashFlowLineage.md) |  |  [optional]
**paymentAmount** | **java.math.BigDecimal** | The amount paid or received | 
**paymentCcy** | **String** | The currency of the transaction | 
**resultValueType** | [**ResultValueTypeEnum**](#ResultValueTypeEnum) | The available values are: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset | 



## Enum: ResultValueTypeEnum

Name | Value
---- | -----
RESULTVALUE | &quot;ResultValue&quot;
RESULTVALUEDICTIONARY | &quot;ResultValueDictionary&quot;
RESULTVALUE0D | &quot;ResultValue0D&quot;
RESULTVALUEDECIMAL | &quot;ResultValueDecimal&quot;
RESULTVALUEINT | &quot;ResultValueInt&quot;
RESULTVALUESTRING | &quot;ResultValueString&quot;
CASHFLOWVALUE | &quot;CashFlowValue&quot;
CASHFLOWVALUESET | &quot;CashFlowValueSet&quot;
RESULTVALUELIFECYCLEEVENTVALUE | &quot;ResultValueLifeCycleEventValue&quot;
RESULTVALUEDATETIMEOFFSET | &quot;ResultValueDateTimeOffset&quot;



