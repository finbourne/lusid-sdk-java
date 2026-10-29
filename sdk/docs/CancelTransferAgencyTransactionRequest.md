# com.finbourne.lusid.model.CancelTransferAgencyTransactionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**transactionId** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.CancelTransferAgencyTransactionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
String TransactionId = "example TransactionId";


CancelTransferAgencyTransactionRequest cancelTransferAgencyTransactionRequestInstance = new CancelTransferAgencyTransactionRequest()
    .PortfolioId(PortfolioId)
    .TransactionId(TransactionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
