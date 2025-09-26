# com.finbourne.lusid.model.OrderFlowConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeEntityTypes** | **String** | Controls whether Orders and Allocations orders are included in the Portfolio valuation. Valid values are  None (to account for Transactions only), Allocations (to include Allocations and Transactions) and  OrdersAndAllocations (to include Orders, Allocations and Transactions). | [default to String]

```java
import com.finbourne.lusid.model.OrderFlowConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String IncludeEntityTypes = "example IncludeEntityTypes";


OrderFlowConfiguration orderFlowConfigurationInstance = new OrderFlowConfiguration()
    .IncludeEntityTypes(IncludeEntityTypes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
