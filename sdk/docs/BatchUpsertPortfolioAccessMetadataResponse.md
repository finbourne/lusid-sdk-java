# com.finbourne.lusid.model.BatchUpsertPortfolioAccessMetadataResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, BatchUpsertPortfolioAccessMetadataResponseItem&gt;**](BatchUpsertPortfolioAccessMetadataResponseItem.md) | The items have been successfully updated or created. | [optional] [default to Map<String, BatchUpsertPortfolioAccessMetadataResponseItem>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The items that could not be updated or created along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BatchUpsertPortfolioAccessMetadataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, BatchUpsertPortfolioAccessMetadataResponseItem> Values = new Map<String, BatchUpsertPortfolioAccessMetadataResponseItem>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchUpsertPortfolioAccessMetadataResponse batchUpsertPortfolioAccessMetadataResponseInstance = new BatchUpsertPortfolioAccessMetadataResponse()
    .Values(Values)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
