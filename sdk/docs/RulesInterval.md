# com.finbourne.lusid.model.RulesInterval

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveRange** | [**DateRange**](DateRange.md) |  | [default to DateRange]
**rules** | [**List&lt;AmortisationRule&gt;**](AmortisationRule.md) | The rules of this rule set. | [default to List<AmortisationRule>]

```java
import com.finbourne.lusid.model.RulesInterval;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateRange EffectiveRange = new DateRange();
List<AmortisationRule> Rules = new List<AmortisationRule>();


RulesInterval rulesIntervalInstance = new RulesInterval()
    .EffectiveRange(EffectiveRange)
    .Rules(Rules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
