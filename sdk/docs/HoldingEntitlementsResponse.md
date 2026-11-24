# com.finbourne.lusid.model.HoldingEntitlementsResponse
The holding entitlements that were upserted, and the failures for those that could not be.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, HoldingEntitlement&gt;**](HoldingEntitlement.md) | The collection of successfully upserted entitlements | [optional] [default to Map<String, HoldingEntitlement>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The collection of error information for entitlements that could not be upserted | [optional] [default to Map<String, ErrorDetail>]

```java
import com.finbourne.lusid.model.HoldingEntitlementsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, HoldingEntitlement> Values = new Map<String, HoldingEntitlement>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();


HoldingEntitlementsResponse holdingEntitlementsResponseInstance = new HoldingEntitlementsResponse()
    .Values(Values)
    .Failed(Failed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
