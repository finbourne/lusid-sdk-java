# com.finbourne.lusid.model.UpsertLegalEntityAccessMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | [**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md) | The access control metadata to assign to a Legal Entity that matches the identifier | [optional] [default to List<AccessMetadataValue>]

```java
import com.finbourne.lusid.model.UpsertLegalEntityAccessMetadataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<AccessMetadataValue> Metadata = new List<AccessMetadataValue>();


UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequestInstance = new UpsertLegalEntityAccessMetadataRequest()
    .Metadata(Metadata);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
