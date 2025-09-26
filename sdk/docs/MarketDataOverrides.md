# com.finbourne.lusid.model.MarketDataOverrides
Class which holds market data overrides to be used in valuation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complexMarketData** | [**List&lt;EconomicDependencyWithComplexMarketData&gt;**](EconomicDependencyWithComplexMarketData.md) | A list of EconomicDependency paired with quote data satisfying that economic dependency | [optional] [default to List<EconomicDependencyWithComplexMarketData>]
**quotes** | [**List&lt;EconomicDependencyWithQuote&gt;**](EconomicDependencyWithQuote.md) | A list of EconomicDependency paired with a ComplexMarketData satisfying that economic dependency | [optional] [default to List<EconomicDependencyWithQuote>]

```java
import com.finbourne.lusid.model.MarketDataOverrides;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<EconomicDependencyWithComplexMarketData> ComplexMarketData = new List<EconomicDependencyWithComplexMarketData>();
@jakarta.annotation.Nullable List<EconomicDependencyWithQuote> Quotes = new List<EconomicDependencyWithQuote>();


MarketDataOverrides marketDataOverridesInstance = new MarketDataOverrides()
    .ComplexMarketData(ComplexMarketData)
    .Quotes(Quotes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
