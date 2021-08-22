

# UpsertReferencePortfolioConstituentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | **String** | The first date from which the weights will apply | 
**weightType** | [**WeightTypeEnum**](#WeightTypeEnum) | The available values are: Static, Floating, Periodical | 
**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) | The available values are: Daily, Weekly, Monthly, Quarterly, Annually |  [optional]
**periodCount** | **Integer** |  |  [optional]
**constituents** | [**List&lt;ReferencePortfolioConstituentRequest&gt;**](ReferencePortfolioConstituentRequest.md) | Set of constituents (instrument/weight pairings) | 



## Enum: WeightTypeEnum

Name | Value
---- | -----
STATIC | &quot;Static&quot;
FLOATING | &quot;Floating&quot;
PERIODICAL | &quot;Periodical&quot;



## Enum: PeriodTypeEnum

Name | Value
---- | -----
DAILY | &quot;Daily&quot;
WEEKLY | &quot;Weekly&quot;
MONTHLY | &quot;Monthly&quot;
QUARTERLY | &quot;Quarterly&quot;
ANNUALLY | &quot;Annually&quot;



