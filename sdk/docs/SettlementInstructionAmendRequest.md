# com.finbourne.lusid.model.SettlementInstructionAmendRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstructionId** | **String** |  | [default to String]
**operation** | **String** |  | [optional] [default to String]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to List<PerpetualProperty>]

```java
import com.finbourne.lusid.model.SettlementInstructionAmendRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SettlementInstructionId = "example SettlementInstructionId";
@jakarta.annotation.Nullable String Operation = "example Operation";
@jakarta.annotation.Nullable List<PerpetualProperty> Properties = new List<PerpetualProperty>();


SettlementInstructionAmendRequest settlementInstructionAmendRequestInstance = new SettlementInstructionAmendRequest()
    .SettlementInstructionId(SettlementInstructionId)
    .Operation(Operation)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
