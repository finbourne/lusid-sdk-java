# com.finbourne.lusid.model.MdkrGroupShiftDefinition
A group of keyed market data key rules (e.g. bid/mid/ask). When the scenario is used in a  valuation, each key's rule re-resolves the matching market data dependencies independently and  produces its own result column named scenario:key, alongside the base column - which continues to  resolve through the recipe's own rules in the standard waterfall, whether or not the same rules  appear here.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rules** | [**List&lt;KeyedMarketDataKeyRule&gt;**](KeyedMarketDataKeyRule.md) | The keyed rules of the group. Keys must be unique within the group; each key produces one  result column. | [default to List<KeyedMarketDataKeyRule>]

```java
import com.finbourne.lusid.model.MdkrGroupShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<KeyedMarketDataKeyRule> Rules = new List<KeyedMarketDataKeyRule>();


MdkrGroupShiftDefinition mdkrGroupShiftDefinitionInstance = new MdkrGroupShiftDefinition()
    .Rules(Rules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
