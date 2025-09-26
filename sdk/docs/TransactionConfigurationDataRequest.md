# com.finbourne.lusid.model.TransactionConfigurationDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List&lt;TransactionConfigurationTypeAlias&gt;**](TransactionConfigurationTypeAlias.md) | List of transaction codes that map to this specific transaction model | [default to List<TransactionConfigurationTypeAlias>]
**movements** | [**List&lt;TransactionConfigurationMovementDataRequest&gt;**](TransactionConfigurationMovementDataRequest.md) | Movement data for the transaction code | [default to List<TransactionConfigurationMovementDataRequest>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties attached to the underlying holding. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.TransactionConfigurationDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionConfigurationTypeAlias> Aliases = new List<TransactionConfigurationTypeAlias>();
List<TransactionConfigurationMovementDataRequest> Movements = new List<TransactionConfigurationMovementDataRequest>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


TransactionConfigurationDataRequest transactionConfigurationDataRequestInstance = new TransactionConfigurationDataRequest()
    .Aliases(Aliases)
    .Movements(Movements)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
