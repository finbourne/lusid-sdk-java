# com.finbourne.lusid.model.UpsertExternalDealingEstimateResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**dealingPoint** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**late** | **Boolean** |  | [optional] [default to Boolean]
**upsertedEstimates** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [default to List<ResourceId>]
**deletedEstimates** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [default to List<ResourceId>]

```java
import com.finbourne.lusid.model.UpsertExternalDealingEstimateResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
OffsetDateTime DealingPoint = OffsetDateTime.now();
Boolean Late = true;
@jakarta.annotation.Nullable List<ResourceId> UpsertedEstimates = new List<ResourceId>();
@jakarta.annotation.Nullable List<ResourceId> DeletedEstimates = new List<ResourceId>();


UpsertExternalDealingEstimateResult upsertExternalDealingEstimateResultInstance = new UpsertExternalDealingEstimateResult()
    .FundId(FundId)
    .DealingPoint(DealingPoint)
    .Late(Late)
    .UpsertedEstimates(UpsertedEstimates)
    .DeletedEstimates(DeletedEstimates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
