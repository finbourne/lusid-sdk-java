

# CompletePortfolio


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**description** | **String** | The long form description of the portfolio. |  [optional] |
|**displayName** | **String** | The name of the portfolio. |  [optional] |
|**created** | **OffsetDateTime** | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. |  [optional] |
|**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**isDerived** | **Boolean** | Whether or not this is a derived portfolio. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the portfolio. The available values are: Transaction, Reference, DerivedTransaction, SimplePosition |  [optional] |
|**version** | [**Version**](Version.md) |  |  |
|**properties** | [**List&lt;Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. |  [optional] |
|**baseCurrency** | **String** | If the portfolio is a transaction portfolio or derived transaction portfolio, this is the base currency of the portfolio. |  [optional] |
|**subHoldingKeys** | **List&lt;String&gt;** | The sub holding key properties configured for the portfolio |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TRANSACTION | &quot;Transaction&quot; |
| REFERENCE | &quot;Reference&quot; |
| DERIVEDTRANSACTION | &quot;DerivedTransaction&quot; |
| SIMPLEPOSITION | &quot;SimplePosition&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


