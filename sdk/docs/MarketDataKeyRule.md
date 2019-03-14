
# MarketDataKeyRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The market data key pattern which this is a rule for. A dot separated string (A.B.C.D.*) | 
**supplier** | [**SupplierEnum**](#SupplierEnum) | the market data supplier (where the data comes from) | 
**dataScope** | **String** | the scope in which the data should be found when using this rule. | 
**quoteType** | [**QuoteTypeEnum**](#QuoteTypeEnum) | is the quote to be looked for a price, yield etc. |  [optional]
**priceSide** | [**PriceSideEnum**](#PriceSideEnum) | the conceptual qualification for the field. Something like Bid, Ask or Mid. |  [optional]


<a name="SupplierEnum"></a>
## Enum: SupplierEnum
Name | Value
---- | -----
DATASCOPE | &quot;DataScope&quot;
LUSID | &quot;Lusid&quot;


<a name="QuoteTypeEnum"></a>
## Enum: QuoteTypeEnum
Name | Value
---- | -----
PRICE | &quot;Price&quot;
SPREAD | &quot;Spread&quot;
RATE | &quot;Rate&quot;


<a name="PriceSideEnum"></a>
## Enum: PriceSideEnum
Name | Value
---- | -----
BID | &quot;Bid&quot;
MID | &quot;Mid&quot;
ASK | &quot;Ask&quot;



