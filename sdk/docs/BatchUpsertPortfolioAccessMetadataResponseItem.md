# com.finbourne.lusid.model.BatchUpsertPortfolioAccessMetadataResponseItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**metadata** | [**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md) |  | [default to Map<String, List<AccessMetadataValue>>]

```java
import com.finbourne.lusid.model.BatchUpsertPortfolioAccessMetadataResponseItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
Map<String, List<AccessMetadataValue>> Metadata = new Map<String, List<AccessMetadataValue>>();


BatchUpsertPortfolioAccessMetadataResponseItem batchUpsertPortfolioAccessMetadataResponseItemInstance = new BatchUpsertPortfolioAccessMetadataResponseItem()
    .PortfolioId(PortfolioId)
    .Metadata(Metadata);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
