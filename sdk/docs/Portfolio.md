
# Portfolio

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | Link to retrieve the current entity |  [optional]
**id** | [**ResourceId**](ResourceId.md) | Identifier for the portfolio |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of portfolio this is (e.g. Transaction Portfolio, Reference  Portfolio) |  [optional]
**displayName** | **String** | Display name of the portfolio |  [optional]
**description** | **String** | Description of the portfolio |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Portfolio creation time in UTC |  [optional]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) | If this is a derived portfolio, the identifier of the portfolio from which it is derived |  [optional]
**version** | [**Version**](Version.md) | The version of the portfolio |  [optional]
**isDerived** | **Boolean** |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRANSACTION | &quot;Transaction&quot;
REFERENCE | &quot;Reference&quot;
DERIVEDTRANSACTION | &quot;DerivedTransaction&quot;



