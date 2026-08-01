# com.finbourne.lusid.model.KeyedMarketDataKeyRule
One keyed rule of an MdkrGroup shift: the key names the result column (scenario:key) and the rule  is a standard market data key rule resolved for that column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key naming this rule&#39;s result column, e.g. \&quot;bid\&quot;. | [default to String]
**rule** | [**MarketDataKeyRule**](MarketDataKeyRule.md) |  | [default to MarketDataKeyRule]

```java
import com.finbourne.lusid.model.KeyedMarketDataKeyRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
MarketDataKeyRule Rule = new MarketDataKeyRule();


KeyedMarketDataKeyRule keyedMarketDataKeyRuleInstance = new KeyedMarketDataKeyRule()
    .Key(Key)
    .Rule(Rule);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
