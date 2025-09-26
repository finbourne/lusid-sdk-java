# com.finbourne.lusid.model.TransactionSetConfigurationDataRequest
A bundle of requests to configure a set of transaction types.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionConfigRequests** | [**List&lt;TransactionConfigurationDataRequest&gt;**](TransactionConfigurationDataRequest.md) | Collection of transaction type models | [default to List<TransactionConfigurationDataRequest>]
**sideConfigRequests** | [**List&lt;SideConfigurationDataRequest&gt;**](SideConfigurationDataRequest.md) | Collection of side definition requests. | [optional] [default to List<SideConfigurationDataRequest>]

```java
import com.finbourne.lusid.model.TransactionSetConfigurationDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionConfigurationDataRequest> TransactionConfigRequests = new List<TransactionConfigurationDataRequest>();
@jakarta.annotation.Nullable List<SideConfigurationDataRequest> SideConfigRequests = new List<SideConfigurationDataRequest>();


TransactionSetConfigurationDataRequest transactionSetConfigurationDataRequestInstance = new TransactionSetConfigurationDataRequest()
    .TransactionConfigRequests(TransactionConfigRequests)
    .SideConfigRequests(SideConfigRequests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
