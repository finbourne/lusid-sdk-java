# com.finbourne.lusid.model.TransactionsReconciliationsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapping** | [**Mapping**](Mapping.md) |  | [optional] [default to Mapping]
**data** | [**List&lt;ReconciledTransaction&gt;**](ReconciledTransaction.md) | The result of this reconciliation | [optional] [default to List<ReconciledTransaction>]

```java
import com.finbourne.lusid.model.TransactionsReconciliationsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Mapping Mapping = new Mapping();
@jakarta.annotation.Nullable List<ReconciledTransaction> Data = new List<ReconciledTransaction>();


TransactionsReconciliationsResponse transactionsReconciliationsResponseInstance = new TransactionsReconciliationsResponse()
    .Mapping(Mapping)
    .Data(Data);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
