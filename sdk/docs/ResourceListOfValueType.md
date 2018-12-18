
# ResourceListOfValueType

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
STRING | &quot;String&quot;
INT | &quot;Int&quot;
DECIMAL | &quot;Decimal&quot;
DATETIME | &quot;DateTime&quot;
BOOLEAN | &quot;Boolean&quot;
MAP | &quot;Map&quot;
LIST | &quot;List&quot;
PROPERTYARRAY | &quot;PropertyArray&quot;
PERCENTAGE | &quot;Percentage&quot;
BENCHMARKTYPE | &quot;BenchmarkType&quot;
CODE | &quot;Code&quot;
ID | &quot;Id&quot;
URI | &quot;Uri&quot;
ARRAYOFIDS | &quot;ArrayOfIds&quot;
ARRAYOFTRANSACTIONALIASES | &quot;ArrayOfTransactionAliases&quot;
ARRAYOFTRANSACTIONMOVEMENTS | &quot;ArrayofTransactionMovements&quot;
ARRAYOFUNITS | &quot;ArrayofUnits&quot;
STRINGARRAY | &quot;StringArray&quot;
CURRENCYANDAMOUNT | &quot;CurrencyAndAmount&quot;
TRADEPRICE | &quot;TradePrice&quot;
UNITCREATION | &quot;UnitCreation&quot;
CURRENCY | &quot;Currency&quot;
USERID | &quot;UserId&quot;
METRICVALUE | &quot;MetricValue&quot;
QUOTEID | &quot;QuoteId&quot;
ARRAYOFQUOTEIDS | &quot;ArrayOfQuoteIds&quot;



