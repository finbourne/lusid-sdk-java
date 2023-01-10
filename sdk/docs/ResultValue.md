

# ResultValue

Base class for representing result values in LUSID.  This base class should not be directly instantiated; each supported ResultValueType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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



