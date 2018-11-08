
# PortfolioSearchResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**href** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**displayName** | **String** |  |  [optional]
**isDerived** | **Boolean** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**properties** | [**List&lt;Property&gt;**](Property.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRANSACTION | &quot;Transaction&quot;
REFERENCE | &quot;Reference&quot;
DERIVEDTRANSACTION | &quot;DerivedTransaction&quot;



