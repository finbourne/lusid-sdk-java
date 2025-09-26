# com.finbourne.lusid.model.ReconciliationTransactions
Specification for the transactions of a scheduled reconciliation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionWindow** | [**DateRange**](DateRange.md) |  | [optional] [default to DateRange]
**mappingId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.ReconciliationTransactions;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateRange TransactionWindow = new DateRange();
ResourceId MappingId = new ResourceId();


ReconciliationTransactions reconciliationTransactionsInstance = new ReconciliationTransactions()
    .TransactionWindow(TransactionWindow)
    .MappingId(MappingId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
