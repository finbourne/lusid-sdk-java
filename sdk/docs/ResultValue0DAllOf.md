

# ResultValue0DAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **String** | Unit of the result |  [optional]
**value** | **java.math.BigDecimal** | The value of the result |  [optional]
**dimension** | **Integer** | The dimension of the result. Can be null if there is no sensible way of defining the dimension. This field should not be  populate by the user on upsertion. |  [optional]
**resultValueType** | [**ResultValueTypeEnum**](#ResultValueTypeEnum) | The available values are: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset | 



## Enum: ResultValueTypeEnum

Name | Value
---- | -----
RESULTVALUE | &quot;ResultValue&quot;
RESULTVALUEDICTIONARY | &quot;ResultValueDictionary&quot;
RESULTVALUE0D | &quot;ResultValue0D&quot;
RESULTVALUEDECIMAL | &quot;ResultValueDecimal&quot;
RESULTVALUEINT | &quot;ResultValueInt&quot;
RESULTVALUESTRING | &quot;ResultValueString&quot;
RESULTVALUEBOOL | &quot;ResultValueBool&quot;
RESULTVALUECURRENCY | &quot;ResultValueCurrency&quot;
CASHFLOWVALUE | &quot;CashFlowValue&quot;
CASHFLOWVALUESET | &quot;CashFlowValueSet&quot;
RESULTVALUELIFECYCLEEVENTVALUE | &quot;ResultValueLifeCycleEventValue&quot;
RESULTVALUEDATETIMEOFFSET | &quot;ResultValueDateTimeOffset&quot;



