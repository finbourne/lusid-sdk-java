# com.finbourne.lusid.model.GetTransferResponse
A transfer and both of the transactions it booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transferType** | **String** |  | [optional] [default to String]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionOut** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**transactionIn** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) |  | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.GetTransferResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TransferId = new ResourceId();
@jakarta.annotation.Nullable String TransferType = "example TransferType";
ResourceId PortfolioIdOut = new ResourceId();
ResourceId PortfolioIdIn = new ResourceId();
Transaction TransactionOut = new Transaction();
Transaction TransactionIn = new Transaction();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


GetTransferResponse getTransferResponseInstance = new GetTransferResponse()
    .TransferId(TransferId)
    .TransferType(TransferType)
    .PortfolioIdOut(PortfolioIdOut)
    .PortfolioIdIn(PortfolioIdIn)
    .TransactionOut(TransactionOut)
    .TransactionIn(TransactionIn)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
