

# Portfolio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | Link to retrieve the current entity |  [optional]
**id** | [**ResourceId**](ResourceId.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of portfolio this is (e.g. Transaction Portfolio, Reference  Portfolio) |  [optional]
**displayName** | **String** | Display name of the portfolio |  [optional]
**description** | **String** | Description of the portfolio |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Portfolio creation time in UTC |  [optional]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**isDerived** | **Boolean** |  |  [optional]
**properties** | [**List&lt;Property&gt;**](Property.md) | Any requested portfolio properties |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRANSACTION | &quot;Transaction&quot;
REFERENCE | &quot;Reference&quot;
DERIVEDTRANSACTION | &quot;DerivedTransaction&quot;



