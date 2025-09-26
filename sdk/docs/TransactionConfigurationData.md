# com.finbourne.lusid.model.TransactionConfigurationData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List&lt;TransactionConfigurationTypeAlias&gt;**](TransactionConfigurationTypeAlias.md) | List of transaction types that map to this specific transaction configuration | [default to List<TransactionConfigurationTypeAlias>]
**movements** | [**List&lt;TransactionConfigurationMovementData&gt;**](TransactionConfigurationMovementData.md) | Movement data for the transaction type | [default to List<TransactionConfigurationMovementData>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties attached to the transaction type | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.TransactionConfigurationData;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionConfigurationTypeAlias> Aliases = new List<TransactionConfigurationTypeAlias>();
List<TransactionConfigurationMovementData> Movements = new List<TransactionConfigurationMovementData>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


TransactionConfigurationData transactionConfigurationDataInstance = new TransactionConfigurationData()
    .Aliases(Aliases)
    .Movements(Movements)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
