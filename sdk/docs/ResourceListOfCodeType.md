
# ResourceListOfCodeType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ValuesEnum&gt;**](#List&lt;ValuesEnum&gt;) |  |  [optional]
**href** | **String** | The Uri that returns the same result as the original request,  but may include resolved as at time(s). |  [optional]
**count** | **Integer** | The total number of records returned in the set.  Note: If count is set by the func &#39;AddDynamicCounter&#39;, Count will be zero until the values  are evaluated. This is due to lazy evaluation. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]


<a name="List<ValuesEnum>"></a>
## Enum: List&lt;ValuesEnum&gt;
Name | Value
---- | -----
UNDEFINED | &quot;Undefined&quot;
LUSIDINSTRUMENTID | &quot;LusidInstrumentId&quot;
REUTERSASSETID | &quot;ReutersAssetId&quot;
CINS | &quot;CINS&quot;
ISIN | &quot;Isin&quot;
SEDOL | &quot;Sedol&quot;
CUSIP | &quot;Cusip&quot;
TICKER | &quot;Ticker&quot;
CLIENTINTERNAL | &quot;ClientInternal&quot;
FIGI | &quot;Figi&quot;
COMPOSITEFIGI | &quot;CompositeFigi&quot;
SHARECLASSFIGI | &quot;ShareClassFigi&quot;
WERTPAPIER | &quot;Wertpapier&quot;
RIC | &quot;RIC&quot;
QUOTEPERMID | &quot;QuotePermId&quot;



