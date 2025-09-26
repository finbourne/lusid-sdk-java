# com.finbourne.lusid.model.SetTransactionConfigurationSourceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List&lt;SetTransactionConfigurationAlias&gt;**](SetTransactionConfigurationAlias.md) |  | [default to List<SetTransactionConfigurationAlias>]
**movements** | [**List&lt;TransactionConfigurationMovementDataRequest&gt;**](TransactionConfigurationMovementDataRequest.md) |  | [default to List<TransactionConfigurationMovementDataRequest>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.SetTransactionConfigurationSourceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<SetTransactionConfigurationAlias> Aliases = new List<SetTransactionConfigurationAlias>();
List<TransactionConfigurationMovementDataRequest> Movements = new List<TransactionConfigurationMovementDataRequest>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


SetTransactionConfigurationSourceRequest setTransactionConfigurationSourceRequestInstance = new SetTransactionConfigurationSourceRequest()
    .Aliases(Aliases)
    .Movements(Movements)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
