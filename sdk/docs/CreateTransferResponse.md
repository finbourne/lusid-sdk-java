# com.finbourne.lusid.model.CreateTransferResponse
The transfer that was created, and the transaction legs it booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transferType** | **String** | The derived type of the transfer: &#39;Transfer&#39; when the position moves between portfolios, &#39;Switch&#39; when one instrument is exchanged for another within a portfolio, and &#39;Twitch&#39; when the position moves between portfolios and changes instrument at the same time. | [optional] [default to String]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionIdOut** | **String** | The transaction id of the created outgoing leg. | [optional] [default to String]
**transactionIdIn** | **String** | The transaction id of the created incoming leg. | [optional] [default to String]

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
