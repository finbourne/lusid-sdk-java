

# LifeCycleEventValueAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | **OffsetDateTime** | The effective date of the event |  [optional]
**eventValues** | [**ResultValueDictionary**](ResultValueDictionary.md) |  |  [optional]
**eventLineage** | [**LifeCycleEventLineage**](LifeCycleEventLineage.md) |  |  [optional]
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



