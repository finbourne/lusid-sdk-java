# com.finbourne.lusid.model.UpsertPortfolioAccessMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | [**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md) | The access control metadata to assign to portfolios that match the identifier | [default to List<AccessMetadataValue>]

```java
import com.finbourne.lusid.model.UpsertPortfolioAccessMetadataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<AccessMetadataValue> Metadata = new List<AccessMetadataValue>();


UpsertPortfolioAccessMetadataRequest upsertPortfolioAccessMetadataRequestInstance = new UpsertPortfolioAccessMetadataRequest()
    .Metadata(Metadata);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
