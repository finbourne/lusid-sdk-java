# com.finbourne.lusid.model.WeightedAllocationServiceRunRequest
The request body for the RunAllocationServiceWithWeights endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The set of Placement IDs to allocate. | [default to List<ResourceId>]
**portfolioWeights** | [**List&lt;PortfolioWeight&gt;**](PortfolioWeight.md) | The set of Portfolios and their associated weights to use for allocation. | [optional] [default to List<PortfolioWeight>]

```java
import com.finbourne.lusid.model.WeightedAllocationServiceRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> PlacementIds = new List<ResourceId>();
@jakarta.annotation.Nullable List<PortfolioWeight> PortfolioWeights = new List<PortfolioWeight>();


WeightedAllocationServiceRunRequest weightedAllocationServiceRunRequestInstance = new WeightedAllocationServiceRunRequest()
    .PlacementIds(PlacementIds)
    .PortfolioWeights(PortfolioWeights);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
