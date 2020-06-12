

# PortfolioGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**id** | [**ResourceId**](ResourceId.md) |  | 
**displayName** | **String** | The name of the portfolio group. | 
**description** | **String** | The long form description of the portfolio group. |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio group was created. No portfolios or sub groups can be added to the group before this date. |  [optional]
**portfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collection of resource identifiers for the portfolios contained in the portfolio group. |  [optional]
**subGroups** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collection of resource identifiers for the portfolio groups contained in the portfolio group as sub groups. |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



