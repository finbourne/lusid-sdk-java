

# AggregateSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The key that uniquely identifies a queryable address in Lusid. |  |
|**op** | [**OpEnum**](#OpEnum) | The available values are: Sum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears |  |
|**options** | **Map&lt;String, Object&gt;** | Additional options to apply when performing computations. Options that do not apply to the Key will be  ignored. Option values can be boolean, numeric, string or date-time. |  [optional] |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| SUM | &quot;Sum&quot; |
| PROPORTION | &quot;Proportion&quot; |
| AVERAGE | &quot;Average&quot; |
| COUNT | &quot;Count&quot; |
| MIN | &quot;Min&quot; |
| MAX | &quot;Max&quot; |
| VALUE | &quot;Value&quot; |
| SUMOFPOSITIVEVALUES | &quot;SumOfPositiveValues&quot; |
| SUMOFNEGATIVEVALUES | &quot;SumOfNegativeValues&quot; |
| SUMOFABSOLUTEVALUES | &quot;SumOfAbsoluteValues&quot; |
| PROPORTIONOFABSOLUTEVALUES | &quot;ProportionOfAbsoluteValues&quot; |
| SUMCUMULATIVEINADVANCE | &quot;SumCumulativeInAdvance&quot; |
| SUMCUMULATIVEINARREARS | &quot;SumCumulativeInArrears&quot; |



