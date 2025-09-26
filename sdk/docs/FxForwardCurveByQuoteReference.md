# com.finbourne.lusid.model.FxForwardCurveByQuoteReference
Contains data (i.e. tenors and rates + metadata) for building fx forward curves (when combined with a date to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domCcy** | **String** | Domestic currency of the fx forward | [default to String]
**fgnCcy** | **String** | Foreign currency of the fx forward | [default to String]
**tenors** | **List&lt;String&gt;** | Tenors for which the forward rates apply.  For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to List<String>]
**quoteReferences** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) | For each tenor, a collection of identifiers. These will be looked up in the LUSID Quote Store to resolve the actual rates.  Accepts an array of Dictionary&lt;string, string&gt;. The keys of each dictionary must be chosen from the following enumeration:  [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode].  For example:    \&quot;quoteReferences\&quot;: [{\&quot;ClientInternal\&quot;: \&quot;SomeIdentifierForFirstTenor\&quot;},{\&quot;ClientInternal\&quot;: \&quot;SomeIdentifierForSecondTenor\&quot;} | [default to List<Map<String, String>>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**calendars** | [**List&lt;FxTenorConvention&gt;**](FxTenorConvention.md) | The list of conventions that should be used when interpreting tenors as dates. | [optional] [default to List<FxTenorConvention>]
**spotDaysCalculationType** | **String** | Configures how to calculate the spot date from the build date using the Calendars provided.  Supported string (enumeration) values are: [ SingleCalendar, UnionCalendars ] | [optional] [default to String]

```java
import com.finbourne.lusid.model.FxForwardCurveByQuoteReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DomCcy = "example DomCcy";
String FgnCcy = "example FgnCcy";
List<String> Tenors = new List<String>();
List<Map<String, String>> QuoteReferences = new List<Map<String, String>>();
@jakarta.annotation.Nullable String Lineage = "example Lineage";
MarketDataOptions MarketDataOptions = new MarketDataOptions();
@jakarta.annotation.Nullable List<FxTenorConvention> Calendars = new List<FxTenorConvention>();
@jakarta.annotation.Nullable String SpotDaysCalculationType = "example SpotDaysCalculationType";


FxForwardCurveByQuoteReference fxForwardCurveByQuoteReferenceInstance = new FxForwardCurveByQuoteReference()
    .DomCcy(DomCcy)
    .FgnCcy(FgnCcy)
    .Tenors(Tenors)
    .QuoteReferences(QuoteReferences)
    .Lineage(Lineage)
    .MarketDataOptions(MarketDataOptions)
    .Calendars(Calendars)
    .SpotDaysCalculationType(SpotDaysCalculationType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
