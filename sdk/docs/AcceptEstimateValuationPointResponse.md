# com.finbourne.lusid.model.AcceptEstimateValuationPointResponse
The Valuation Point Data Response for AcceptEstimate called on the Fund and specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**candidateValuationPoint** | [**ValuationPointDataResponse**](ValuationPointDataResponse.md) |  | [default to ValuationPointDataResponse]
**latestValuationPoint** | [**ValuationPointDataResponse**](ValuationPointDataResponse.md) |  | [optional] [default to ValuationPointDataResponse]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.AcceptEstimateValuationPointResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ValuationPointDataResponse CandidateValuationPoint = new ValuationPointDataResponse();
ValuationPointDataResponse LatestValuationPoint = new ValuationPointDataResponse();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AcceptEstimateValuationPointResponse acceptEstimateValuationPointResponseInstance = new AcceptEstimateValuationPointResponse()
    .Href(Href)
    .CandidateValuationPoint(CandidateValuationPoint)
    .LatestValuationPoint(LatestValuationPoint)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
