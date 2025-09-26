# com.finbourne.lusid.model.UpsertCustomEntityAccessMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | [**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md) | The access control metadata to assign to a CustomEntity that matches the identifier | [optional] [default to List<AccessMetadataValue>]

```java
import com.finbourne.lusid.model.UpsertCustomEntityAccessMetadataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<AccessMetadataValue> Metadata = new List<AccessMetadataValue>();


UpsertCustomEntityAccessMetadataRequest upsertCustomEntityAccessMetadataRequestInstance = new UpsertCustomEntityAccessMetadataRequest()
    .Metadata(Metadata);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
