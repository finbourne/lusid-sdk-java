# com.finbourne.lusid.model.UpsertPersonAccessMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | [**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md) | The access control metadata to assign to a Person that matches the identifier | [optional] [default to List<AccessMetadataValue>]

```java
import com.finbourne.lusid.model.UpsertPersonAccessMetadataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<AccessMetadataValue> Metadata = new List<AccessMetadataValue>();


UpsertPersonAccessMetadataRequest upsertPersonAccessMetadataRequestInstance = new UpsertPersonAccessMetadataRequest()
    .Metadata(Metadata);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
