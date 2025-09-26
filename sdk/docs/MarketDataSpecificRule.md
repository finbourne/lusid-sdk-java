# com.finbourne.lusid.model.MarketDataSpecificRule
Extends market data key rules to be able to catch dependencies depending on where the dependency comes from, as opposed to what the dependency is asking for.  For example, a market data rule might instruct all rates curves to be retrieved from a particular scope.  This class gives the ability to set different behaviour depending on what is requesting the rates curve.  Using two specific rules, one could instruct rates curves requested by bonds to be retrieved from a different scope than rates curves requested by swaps.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The market data key pattern which this is a rule for. A dot separated string (A.B.C.D.*) | [default to String]
**supplier** | **String** | The market data supplier (where the data comes from) | [default to String]
**dataScope** | **String** | The scope in which the data should be found when using this rule. | [default to String]
**quoteType** | **String** | The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor, InflationAssumption, DirtyPrice, PrincipalWriteOff, InterestDeferred, InterestShortfall, ConstituentWeightFactor | [default to String]
**field** | **String** | The conceptual qualification for the field, such as bid, mid, or ask.  The field must be one of a defined set for the given supplier, in the same way as it  is for the Quotes.QuoteSeriesId\&quot; | [default to String]
**quoteInterval** | **String** | Shorthand for the time interval used to select market data. This must be a dot-separated string   nominating a start and end date, for example &#39;5D.0D&#39; to look back 5 days from today (0 days ago). The syntax   is &lt;i&gt;int&lt;/i&gt;&lt;i&gt;char&lt;/i&gt;.&lt;i&gt;int&lt;/i&gt;&lt;i&gt;char&lt;/i&gt;, where &lt;i&gt;char&lt;/i&gt; is one of D(ay), W(eek), M(onth) or Y(ear). | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | Deprecated field which no longer has any effect on market data resolution. | [optional] [default to OffsetDateTime]
**priceSource** | **String** | The source of the quote. For a given provider/supplier of market data there may be an additional qualifier, e.g. the exchange or bank that provided the quote | [optional] [default to String]
**mask** | **String** | Allows for partial or complete override of the market asset resolved for a dependency  Either a named override or a dot separated string (A.B.C.D.*).  e.g. for Rates curve &#39;EUR.*&#39; will replace the resolve MarketAsset &#39;GBP/12M&#39;, &#39;GBP/3M&#39; with the EUR equivalent, if there  are no wildcards in the mask, the mask is taken as the MarketAsset for any dependency matching the rule. | [optional] [default to String]
**dependencySourceFilter** | [**DependencySourceFilter**](DependencySourceFilter.md) |  | [default to DependencySourceFilter]
**sourceSystem** | **String** | Determines from where LUSID should attempt to find the data. Optional and, if omitted, will default to \&quot;Lusid\&quot;.  This means that data will be retrieved from the Quotes store and the ComplexMarketData store.  These can be populated using the Quotes and ComplexMarketData endpoints. | [optional] [default to String]
**fallThroughOnAccessDenied** | **Boolean** | When a user attempts to use a rule to access data to which they are not entitled,  the rule will fail to resolve any market data.  By default, such an access denied failure will stop any further attempts to resolve market data.  This is so that differently entitled users always receive the same market data from market data resolution,  if they have sufficient entitlements to retrieve the required data.  If set to true, then an access denied failure will not stop further market data resolution,  and resolution will continue with the next specified MarketDataKeyRule.  Optional, and defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.MarketDataSpecificRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Supplier = "example Supplier";
String DataScope = "example DataScope";
String QuoteType = "example QuoteType";
String Field = "example Field";
@jakarta.annotation.Nullable String QuoteInterval = "example QuoteInterval";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String PriceSource = "example PriceSource";
@jakarta.annotation.Nullable String Mask = "example Mask";
DependencySourceFilter DependencySourceFilter = new DependencySourceFilter();
@jakarta.annotation.Nullable String SourceSystem = "example SourceSystem";
Boolean FallThroughOnAccessDenied = true;


MarketDataSpecificRule marketDataSpecificRuleInstance = new MarketDataSpecificRule()
    .Key(Key)
    .Supplier(Supplier)
    .DataScope(DataScope)
    .QuoteType(QuoteType)
    .Field(Field)
    .QuoteInterval(QuoteInterval)
    .AsAt(AsAt)
    .PriceSource(PriceSource)
    .Mask(Mask)
    .DependencySourceFilter(DependencySourceFilter)
    .SourceSystem(SourceSystem)
    .FallThroughOnAccessDenied(FallThroughOnAccessDenied);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
