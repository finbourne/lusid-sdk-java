

# Portfolio

A list of portfolios.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | The specifc Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**id** | [**ResourceId**](ResourceId.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the portfolio. | 
**displayName** | **String** | The name of the portfolio. | 
**description** | **String** | The long form description of the portfolio. |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. | 
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. |  [optional]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRANSACTION | &quot;Transaction&quot;
REFERENCE | &quot;Reference&quot;
DERIVEDTRANSACTION | &quot;DerivedTransaction&quot;



