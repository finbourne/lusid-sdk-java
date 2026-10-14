# com.finbourne.lusid.model.FundIdList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**navTypeCodesHint** | **List&lt;String&gt;** | The NAV type codes this list nominates, in priority order; entries may contain &#39;*&#39; wildcards.  For each fund the first matching code the fund defines is picked, falling back to the fund&#39;s  primary (official) NAV type when the list is empty or nothing matches. Optional. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.FundIdList;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> Values = new List<ResourceId>();
@jakarta.annotation.Nullable List<String> NavTypeCodesHint = new List<String>();


FundIdList fundIdListInstance = new FundIdList()
    .Values(Values)
    .NavTypeCodesHint(NavTypeCodesHint);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
