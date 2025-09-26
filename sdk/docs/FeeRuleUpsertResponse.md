# com.finbourne.lusid.model.FeeRuleUpsertResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, FeeRule&gt;**](FeeRule.md) |  | [default to Map<String, FeeRule>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FeeRuleUpsertResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, FeeRule> Values = new Map<String, FeeRule>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FeeRuleUpsertResponse feeRuleUpsertResponseInstance = new FeeRuleUpsertResponse()
    .Values(Values)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
