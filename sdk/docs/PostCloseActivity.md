# com.finbourne.lusid.model.PostCloseActivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** |  | [default to String]
**entityUniqueId** | **String** |  | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.PostCloseActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
String EntityUniqueId = "example EntityUniqueId";
OffsetDateTime AsAt = OffsetDateTime.now();


PostCloseActivity postCloseActivityInstance = new PostCloseActivity()
    .EntityType(EntityType)
    .EntityUniqueId(EntityUniqueId)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
