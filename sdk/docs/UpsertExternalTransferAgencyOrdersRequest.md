# com.finbourne.lusid.model.UpsertExternalTransferAgencyOrdersRequest
One dealing point's orders for one fund, as a third-party transfer agent sends them.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**dealingPoint** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**source** | [**ExternalTransferAgencyOrderSource**](ExternalTransferAgencyOrderSource.md) |  | [default to ExternalTransferAgencyOrderSource]
**complete** | **Boolean** |  | [optional] [default to Boolean]
**sentAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**lines** | [**Map&lt;String, ExternalTransferAgencyOrderLine&gt;**](ExternalTransferAgencyOrderLine.md) |  | [default to Map<String, ExternalTransferAgencyOrderLine>]

```java
import com.finbourne.lusid.model.UpsertExternalTransferAgencyOrdersRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
OffsetDateTime DealingPoint = OffsetDateTime.now();
ExternalTransferAgencyOrderSource Source = new ExternalTransferAgencyOrderSource();
Boolean Complete = true;
@jakarta.annotation.Nullable OffsetDateTime SentAt = OffsetDateTime.now();
Map<String, ExternalTransferAgencyOrderLine> Lines = new Map<String, ExternalTransferAgencyOrderLine>();


UpsertExternalTransferAgencyOrdersRequest upsertExternalTransferAgencyOrdersRequestInstance = new UpsertExternalTransferAgencyOrdersRequest()
    .FundId(FundId)
    .DealingPoint(DealingPoint)
    .Source(Source)
    .Complete(Complete)
    .SentAt(SentAt)
    .Lines(Lines);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
