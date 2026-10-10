# com.finbourne.lusid.model.UpsertTransferAgencyTransactionFromOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**priceDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.UpsertTransferAgencyTransactionFromOrderRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId OrderId = new ResourceId();
OffsetDateTime PriceDate = OffsetDateTime.now();


UpsertTransferAgencyTransactionFromOrderRequest upsertTransferAgencyTransactionFromOrderRequestInstance = new UpsertTransferAgencyTransactionFromOrderRequest()
    .OrderId(OrderId)
    .PriceDate(PriceDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
