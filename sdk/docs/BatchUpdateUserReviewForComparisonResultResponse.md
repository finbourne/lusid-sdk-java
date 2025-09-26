# com.finbourne.lusid.model.BatchUpdateUserReviewForComparisonResultResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, GroupReconciliationComparisonResult&gt;**](GroupReconciliationComparisonResult.md) | The collection of comparison results that have been successfully updated. | [optional] [default to Map<String, GroupReconciliationComparisonResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The collection of comparison results that could not be updated with the provided user input along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to the updated comparison result user input | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BatchUpdateUserReviewForComparisonResultResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, GroupReconciliationComparisonResult> Values = new Map<String, GroupReconciliationComparisonResult>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchUpdateUserReviewForComparisonResultResponse batchUpdateUserReviewForComparisonResultResponseInstance = new BatchUpdateUserReviewForComparisonResultResponse()
    .Values(Values)
    .Failed(Failed)
    .Metadata(Metadata)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
