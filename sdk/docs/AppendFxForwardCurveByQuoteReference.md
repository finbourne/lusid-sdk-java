

# AppendFxForwardCurveByQuoteReference

Used to append a new point to an FX curve defined using `FxForwardCurveByQuoteReference`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenor** | **String** | Tenor for which the forward rate applies. |  |
|**quoteReference** | **Map&lt;String, String&gt;** | A collection of identifiers for the tenor, which will be used to query the LUSID Quote Store to resolve the actual rates.  The keys must be chosen from the following enumeration:  [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode].    For example:    \&quot;quoteReference\&quot;: {\&quot;ClientInternal\&quot;: \&quot;SomeIdentifierForTenor\&quot;} |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


