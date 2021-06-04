

# CreatePortfolioGroupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code that the portfolio group will be created with. Together with the scope this uniquely identifies the portfolio group. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio group was created. Defaults to the current LUSID system datetime if not specified. |  [optional]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The resource identifiers of the portfolios to be contained within the portfolio group. |  [optional]
**subGroups** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The resource identifiers of the portfolio groups to be contained within the portfolio group as sub groups. |  [optional]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of unique group properties to add to the portfolio group. Each property must be from the &#39;PortfolioGroup&#39; domain and should be identified by its key which has the format {domain}/{scope}/{code}, e.g. &#39;PortfolioGroup/Manager/Id&#39;. These properties must be pre-defined. |  [optional]
**displayName** | **String** | The name of the portfolio group. | 
**description** | **String** | A long form description of the portfolio group. |  [optional]



