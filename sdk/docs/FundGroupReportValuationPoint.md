# com.finbourne.lusid.model.FundGroupReportValuationPoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | The code of the valuation point the row was produced for. | [optional] [default to String]
**status** | **String** | The status of the valuation point the row was produced for, such as Final or Estimate. | [optional] [default to String]
**effectiveEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The effective end date of the valuation point the row was produced for. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.FundGroupReportValuationPoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DiaryEntryCode = "example DiaryEntryCode";
@jakarta.annotation.Nullable String Status = "example Status";
OffsetDateTime EffectiveEnd = OffsetDateTime.now();


FundGroupReportValuationPoint fundGroupReportValuationPointInstance = new FundGroupReportValuationPoint()
    .DiaryEntryCode(DiaryEntryCode)
    .Status(Status)
    .EffectiveEnd(EffectiveEnd);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
