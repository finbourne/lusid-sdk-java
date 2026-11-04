# com.finbourne.lusid.model.UpsertExternalDealingEstimatesRequest
One dealing point's dealing estimates for the fund named in the route, as a third-party transfer agent sends them.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealingPoint** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**source** | [**ExternalDealingEstimateSource**](ExternalDealingEstimateSource.md) |  | [default to ExternalDealingEstimateSource]
**complete** | **Boolean** |  | [optional] [default to Boolean]
**sentAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**lines** | [**Map&lt;String, ExternalDealingEstimateLine&gt;**](ExternalDealingEstimateLine.md) |  | [default to Map<String, ExternalDealingEstimateLine>]

```java
import com.finbourne.lusid.model.UpsertExternalDealingEstimatesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime DealingPoint = OffsetDateTime.now();
ExternalDealingEstimateSource Source = new ExternalDealingEstimateSource();
Boolean Complete = true;
@jakarta.annotation.Nullable OffsetDateTime SentAt = OffsetDateTime.now();
Map<String, ExternalDealingEstimateLine> Lines = new Map<String, ExternalDealingEstimateLine>();


UpsertExternalDealingEstimatesRequest upsertExternalDealingEstimatesRequestInstance = new UpsertExternalDealingEstimatesRequest()
    .DealingPoint(DealingPoint)
    .Source(Source)
    .Complete(Complete)
    .SentAt(SentAt)
    .Lines(Lines);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
