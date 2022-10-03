

# Portfolio

A list of portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**id** | [**ResourceId**](ResourceId.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the portfolio. The available values are: Transaction, Reference, DerivedTransaction | 
**displayName** | **String** | The name of the portfolio. | 
**description** | **String** | The long form description of the portfolio. |  [optional]
**created** | **OffsetDateTime** | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. | 
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. |  [optional]
**baseCurrency** | **String** | The base currency of the portfolio. |  [optional]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. |  [optional]
**instrumentScopes** | **List&lt;String&gt;** | The instrument scope resolution strategy of this portfolio. |  [optional]
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst |  [optional]
**amortisationMethod** | **String** | The amortisation method the portfolio is using in the calculation. This can be &#39;NoAmortisation&#39;, &#39;StraightLine&#39; or &#39;EffectiveYield&#39;. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRANSACTION | &quot;Transaction&quot;
REFERENCE | &quot;Reference&quot;
DERIVEDTRANSACTION | &quot;DerivedTransaction&quot;



## Enum: AccountingMethodEnum

Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
AVERAGECOST | &quot;AverageCost&quot;
FIRSTINFIRSTOUT | &quot;FirstInFirstOut&quot;
LASTINFIRSTOUT | &quot;LastInFirstOut&quot;
HIGHESTCOSTFIRST | &quot;HighestCostFirst&quot;
LOWESTCOSTFIRST | &quot;LowestCostFirst&quot;



