# com.finbourne.lusid.model.EstimateTransferAgencyOrderRequest
A request to estimate the values of one order. `OrderId` is required whether or not the order has been  saved, because it is the identity the estimate is returned against. Supply `Order` to estimate values  that differ from - or do not yet exist in - the saved order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**order** | [**TransferAgencyOrderToEstimate**](TransferAgencyOrderToEstimate.md) |  | [optional] [default to TransferAgencyOrderToEstimate]

```java
import com.finbourne.lusid.model.EstimateTransferAgencyOrderRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId OrderId = new ResourceId();
TransferAgencyOrderToEstimate Order = new TransferAgencyOrderToEstimate();


EstimateTransferAgencyOrderRequest estimateTransferAgencyOrderRequestInstance = new EstimateTransferAgencyOrderRequest()
    .OrderId(OrderId)
    .Order(Order);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
