# com.finbourne.lusid.model.MarketContext
Market context node. This defines how LUSID processes parts of a request that require resolution of market data such as instrument prices or  Fx rates. It controls where the data is loaded from and which sources take precedence.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketRules** | [**List&lt;MarketDataKeyRule&gt;**](MarketDataKeyRule.md) | The set of rules that define how to resolve particular use cases. These can be relatively general or specific in nature.  Nominally any number are possible and will be processed in order where applicable. However, there is evidently a potential  for increased computational cost where many rules must be applied to resolve data. Ensuring that portfolios are structured in  such a way as to reduce the number of rules required is therefore sensible. | [optional] [default to List<MarketDataKeyRule>]
**suppliers** | [**MarketContextSuppliers**](MarketContextSuppliers.md) |  | [optional] [default to MarketContextSuppliers]
**options** | [**MarketOptions**](MarketOptions.md) |  | [optional] [default to MarketOptions]
**specificRules** | [**List&lt;MarketDataSpecificRule&gt;**](MarketDataSpecificRule.md) | Extends market data key rules to be able to catch dependencies depending on where the dependency comes from, as opposed to what the dependency is asking for.  Using two specific rules, one could instruct rates curves requested by bonds to be retrieved from a different scope than rates curves requested by swaps.  WARNING: The use of specific rules impacts performance. Where possible, one should use MarketDataKeyRules only. | [optional] [default to List<MarketDataSpecificRule>]
**groupedMarketRules** | [**List&lt;GroupOfMarketDataKeyRules&gt;**](GroupOfMarketDataKeyRules.md) | The list of groups of rules that will be used in market data resolution.  Rules given within a group will, if the group is being used to resolve data,  all be applied with the results of those individual resolution attempts combined into a single result.  The method for combining results is determined by the operation detailed in the GroupOfMarketDataKeyRules.     Notes:  - When resolving MarketData, MarketRules will be applied first followed by GroupedMarketRules  if data could not be found using only the MarketRules provided.  - GroupedMarketRules can only be used for resolving data from the QuoteStore.     Caution: As every rule in a given group will be applied in resolution if the group is applied,  groups are computationally expensive for market data resolution.  Therefore, heuristically, rule groups should be kept as small as possible. | [optional] [default to List<GroupOfMarketDataKeyRules>]
**bidMarketRules** | [**List&lt;MarketDataKeyRule&gt;**](MarketDataKeyRule.md) | An optional, separate set of market data key rules for the bid side of a valuation, used when a bid  result is requested (a Valuation/PV address key with the PricingBasis option set to Bid) or the recipe&#39;s  pricing basis (MarketOptions.PricingBasis) is Bid. When supplied,  instrument prices (Price, DirtyPrice and ForwardPrice quotes) are resolved from these rules only, and are  reported as missing if none of them finds the price; rates curves and volatility surfaces are taken from  these rules where one of them matches, and from the market rules otherwise; FX rates, fixings and resets  always come from the market rules. Each rule reads the quote field it is written with. When omitted, the  bid side re-targets the instrument price rules in MarketRules onto the bid field, as before. | [optional] [default to List<MarketDataKeyRule>]
**offerMarketRules** | [**List&lt;MarketDataKeyRule&gt;**](MarketDataKeyRule.md) | An optional, separate set of market data key rules for the offer (ask) side of a valuation, used when an  ask result is requested (a Valuation/PV address key with the PricingBasis option set to Ask) or the recipe&#39;s  pricing basis (MarketOptions.PricingBasis) is Ask. Resolved in the  same way as BidMarketRules. When omitted, the offer side re-targets the instrument price rules in  MarketRules onto the ask field, as before. | [optional] [default to List<MarketDataKeyRule>]

```java
import com.finbourne.lusid.model.MarketContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<MarketDataKeyRule> MarketRules = new List<MarketDataKeyRule>();
@jakarta.annotation.Nullable MarketContextSuppliers Suppliers = new MarketContextSuppliers();
MarketOptions Options = new MarketOptions();
@jakarta.annotation.Nullable List<MarketDataSpecificRule> SpecificRules = new List<MarketDataSpecificRule>();
@jakarta.annotation.Nullable List<GroupOfMarketDataKeyRules> GroupedMarketRules = new List<GroupOfMarketDataKeyRules>();
@jakarta.annotation.Nullable List<MarketDataKeyRule> BidMarketRules = new List<MarketDataKeyRule>();
@jakarta.annotation.Nullable List<MarketDataKeyRule> OfferMarketRules = new List<MarketDataKeyRule>();


MarketContext marketContextInstance = new MarketContext()
    .MarketRules(MarketRules)
    .Suppliers(Suppliers)
    .Options(Options)
    .SpecificRules(SpecificRules)
    .GroupedMarketRules(GroupedMarketRules)
    .BidMarketRules(BidMarketRules)
    .OfferMarketRules(OfferMarketRules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
