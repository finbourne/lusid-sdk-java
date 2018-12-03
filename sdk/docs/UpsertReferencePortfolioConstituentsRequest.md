
# UpsertReferencePortfolioConstituentsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**weightType** | [**WeightTypeEnum**](#WeightTypeEnum) |  | 
**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) |  |  [optional]
**periodCount** | **Integer** |  |  [optional]
**constituents** | [**List&lt;ReferencePortfolioConstituentRequest&gt;**](ReferencePortfolioConstituentRequest.md) | Set of constituents (instrument/weight pairings) | 


<a name="WeightTypeEnum"></a>
## Enum: WeightTypeEnum
Name | Value
---- | -----
STATIC | &quot;Static&quot;
FLOATING | &quot;Floating&quot;
PERIODICAL | &quot;Periodical&quot;


<a name="PeriodTypeEnum"></a>
## Enum: PeriodTypeEnum
Name | Value
---- | -----
DAILY | &quot;Daily&quot;
WEEKLY | &quot;Weekly&quot;
MONTHLY | &quot;Monthly&quot;
QUARTERLY | &quot;Quarterly&quot;
ANNUALLY | &quot;Annually&quot;



