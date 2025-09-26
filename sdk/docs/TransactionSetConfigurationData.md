# com.finbourne.lusid.model.TransactionSetConfigurationData
A collection of the data required to configure transaction types..

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionConfigs** | [**List&lt;TransactionConfigurationData&gt;**](TransactionConfigurationData.md) | Collection of transaction type models | [default to List<TransactionConfigurationData>]
**sideDefinitions** | [**List&lt;SideConfigurationData&gt;**](SideConfigurationData.md) | Collection of side definitions | [optional] [default to List<SideConfigurationData>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TransactionSetConfigurationData;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionConfigurationData> TransactionConfigs = new List<TransactionConfigurationData>();
@jakarta.annotation.Nullable List<SideConfigurationData> SideDefinitions = new List<SideConfigurationData>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TransactionSetConfigurationData transactionSetConfigurationDataInstance = new TransactionSetConfigurationData()
    .TransactionConfigs(TransactionConfigs)
    .SideDefinitions(SideDefinitions)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
