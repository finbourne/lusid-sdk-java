

# PortfolioSearchResult

A list of portfolios.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the portfolio. |  [readonly]
**href** | **String** | The specifc Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] [readonly]
**description** | **String** | The long form description of the portfolio. |  [optional] [readonly]
**displayName** | **String** | The name of the portfolio. |  [readonly]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. |  [optional] [readonly]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. |  [readonly]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**properties** | [**List&lt;Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. |  [optional] [readonly]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRANSACTION | &quot;Transaction&quot;
REFERENCE | &quot;Reference&quot;
DERIVEDTRANSACTION | &quot;DerivedTransaction&quot;



