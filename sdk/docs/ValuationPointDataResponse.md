# com.finbourne.lusid.model.ValuationPointDataResponse
The Valuation Point Data Response for the Fund and specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**type** | **String** | The Type of the associated Diary Entry (&#39;PeriodBoundary&#39;,&#39;ValuationPoint&#39;,&#39;Other&#39; or &#39;Adhoc&#39; when a diary entry wasn&#39;t used). | [default to String]
**status** | **String** | The status of a Diary Entry of Type &#39;ValuationPoint&#39;. Defaults to &#39;Estimate&#39; when upserting a diary entry, moves to &#39;Candidate&#39; or &#39;Final&#39; when a ValuationPoint is accepted, and &#39;Final&#39; when it is finalised. The status of a Diary Entry becomes &#39;Unofficial&#39; when a diary entry wasn&#39;t used. | [default to String]
**fundDetails** | [**FundDetails**](FundDetails.md) |  | [default to FundDetails]
**fundValuationPointData** | [**FundValuationPointData**](FundValuationPointData.md) |  | [default to FundValuationPointData]
**shareClassData** | [**List&lt;ShareClassData&gt;**](ShareClassData.md) | The data for all share classes in fund. Share classes are identified by their short codes. | [default to List<ShareClassData>]
**valuationPointCode** | **String** | The code of the valuation point. | [optional] [default to String]
**previousValuationPointCode** | **String** | The code of the previous valuation point. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ValuationPointDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String Type = "example Type";
String Status = "example Status";
FundDetails FundDetails = new FundDetails();
FundValuationPointData FundValuationPointData = new FundValuationPointData();
List<ShareClassData> ShareClassData = new List<ShareClassData>();
@jakarta.annotation.Nullable String ValuationPointCode = "example ValuationPointCode";
@jakarta.annotation.Nullable String PreviousValuationPointCode = "example PreviousValuationPointCode";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ValuationPointDataResponse valuationPointDataResponseInstance = new ValuationPointDataResponse()
    .Href(Href)
    .Type(Type)
    .Status(Status)
    .FundDetails(FundDetails)
    .FundValuationPointData(FundValuationPointData)
    .ShareClassData(ShareClassData)
    .ValuationPointCode(ValuationPointCode)
    .PreviousValuationPointCode(PreviousValuationPointCode)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
