# com.finbourne.lusid.model.CreateTransferResponse
The transfer that was created, and the transaction legs it booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transferType** | **String** |  | [optional] [default to String]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionIdOut** | **String** |  | [optional] [default to String]
**transactionIdIn** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreateTransferResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TransferId = new ResourceId();
@jakarta.annotation.Nullable String TransferType = "example TransferType";
ResourceId PortfolioIdOut = new ResourceId();
ResourceId PortfolioIdIn = new ResourceId();
@jakarta.annotation.Nullable String TransactionIdOut = "example TransactionIdOut";
@jakarta.annotation.Nullable String TransactionIdIn = "example TransactionIdIn";


CreateTransferResponse createTransferResponseInstance = new CreateTransferResponse()
    .TransferId(TransferId)
    .TransferType(TransferType)
    .PortfolioIdOut(PortfolioIdOut)
    .PortfolioIdIn(PortfolioIdIn)
    .TransactionIdOut(TransactionIdOut)
    .TransactionIdIn(TransactionIdIn);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
