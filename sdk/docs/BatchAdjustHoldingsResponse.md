# com.finbourne.lusid.model.BatchAdjustHoldingsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, HoldingAdjustmentWithDate&gt;**](HoldingAdjustmentWithDate.md) | The holdings which have been successfully adjusted. | [optional] [default to Map<String, HoldingAdjustmentWithDate>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The holdings that could not be adjusted along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to adjusted holdings | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BatchAdjustHoldingsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, HoldingAdjustmentWithDate> Values = new Map<String, HoldingAdjustmentWithDate>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchAdjustHoldingsResponse batchAdjustHoldingsResponseInstance = new BatchAdjustHoldingsResponse()
    .Values(Values)
    .Failed(Failed)
    .Metadata(Metadata)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
