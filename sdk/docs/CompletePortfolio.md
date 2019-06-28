

# CompletePortfolio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  |  [optional]
**href** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**displayName** | **String** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**isDerived** | **Boolean** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**properties** | [**List&lt;Property&gt;**](Property.md) |  |  [optional]
**baseCurrency** | **String** |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRANSACTION | &quot;Transaction&quot;
REFERENCE | &quot;Reference&quot;
DERIVEDTRANSACTION | &quot;DerivedTransaction&quot;



