# com.finbourne.lusid.model.UpsertExternalTransferAgencyOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**dealingPoint** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**late** | **Boolean** |  | [optional] [default to Boolean]
**upsertedOrders** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [default to List<ResourceId>]
**deletedOrders** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [default to List<ResourceId>]

```java
import com.finbourne.lusid.model.UpsertExternalTransferAgencyOrderResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
OffsetDateTime DealingPoint = OffsetDateTime.now();
Boolean Late = true;
@jakarta.annotation.Nullable List<ResourceId> UpsertedOrders = new List<ResourceId>();
@jakarta.annotation.Nullable List<ResourceId> DeletedOrders = new List<ResourceId>();


UpsertExternalTransferAgencyOrderResult upsertExternalTransferAgencyOrderResultInstance = new UpsertExternalTransferAgencyOrderResult()
    .FundId(FundId)
    .DealingPoint(DealingPoint)
    .Late(Late)
    .UpsertedOrders(UpsertedOrders)
    .DeletedOrders(DeletedOrders);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
