

# CompletePortfolio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | 
**href** | **String** | The specifc Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] [readonly]
**description** | **String** | The long form description of the portfolio. |  [optional] [readonly]
**displayName** | **String** | The name of the portfolio. |  [optional] [readonly]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. |  [optional] [readonly]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) | The type of the portfolio. |  [optional] [readonly]
**version** | [**Version**](Version.md) |  | 
**properties** | [**List&lt;Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. |  [optional]
**baseCurrency** | **String** | If the portfolio is a transaction portfolio or derived transaction portfolio, this is the base currency of the portfolio. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRANSACTION | &quot;Transaction&quot;
REFERENCE | &quot;Reference&quot;
DERIVEDTRANSACTION | &quot;DerivedTransaction&quot;



