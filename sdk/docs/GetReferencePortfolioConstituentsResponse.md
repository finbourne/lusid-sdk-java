

# GetReferencePortfolioConstituentsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveFrom** | **OffsetDateTime** |  |  |
|**weightType** | [**WeightTypeEnum**](#WeightTypeEnum) | The available values are: Static, Floating, Periodical |  |
|**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) | The available values are: Daily, Weekly, Monthly, Quarterly, Annually |  [optional] |
|**periodCount** | **Integer** |  |  [optional] |
|**constituents** | [**List&lt;ReferencePortfolioConstituent&gt;**](ReferencePortfolioConstituent.md) | Set of constituents (instrument/weight pairings) |  |
|**href** | **URI** | The Uri that returns the same result as the original request, but may include resolved as at time(s). |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: WeightTypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;Static&quot; |
| FLOATING | &quot;Floating&quot; |
| PERIODICAL | &quot;Periodical&quot; |



## Enum: PeriodTypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;Daily&quot; |
| WEEKLY | &quot;Weekly&quot; |
| MONTHLY | &quot;Monthly&quot; |
| QUARTERLY | &quot;Quarterly&quot; |
| ANNUALLY | &quot;Annually&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


