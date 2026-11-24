# com.finbourne.lusid.model.FundGroupReportResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**navTypeCode** | **String** | The code of the NAV type the row, or result, was produced for. | [optional] [default to String]
**status** | **String** | Whether the fund was reported. Available values: Succeeded, Failed. | [optional] [default to String]
**valuationPoints** | [**List&lt;FundGroupReportValuationPoint&gt;**](FundGroupReportValuationPoint.md) | The valuation points reported for the fund and NAV type, oldest first. Empty when it failed. | [optional] [default to List<FundGroupReportValuationPoint>]
**error** | [**ErrorDetail**](ErrorDetail.md) |  | [optional] [default to ErrorDetail]

```java
import com.finbourne.lusid.model.FundGroupReportResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable List<FundGroupReportValuationPoint> ValuationPoints = new List<FundGroupReportValuationPoint>();
ErrorDetail Error = new ErrorDetail();


FundGroupReportResult fundGroupReportResultInstance = new FundGroupReportResult()
    .FundId(FundId)
    .NavTypeCode(NavTypeCode)
    .Status(Status)
    .ValuationPoints(ValuationPoints)
    .Error(Error);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
