# com.finbourne.lusid.model.UpsertIndexConventionRequest
Index convention that is to be stored in the convention data store.  Only one of these must be present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**indexConvention** | [**IndexConvention**](IndexConvention.md) |  | [optional] [default to IndexConvention]

```java
import com.finbourne.lusid.model.UpsertIndexConventionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

IndexConvention IndexConvention = new IndexConvention();


UpsertIndexConventionRequest upsertIndexConventionRequestInstance = new UpsertIndexConventionRequest()
    .IndexConvention(IndexConvention);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
