# com.finbourne.lusid.model.Schema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | **String** |  | [optional] [default to String]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**values** | [**Map&lt;String, FieldSchema&gt;**](FieldSchema.md) |  | [optional] [default to Map<String, FieldSchema>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Schema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Entity = "example Entity";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, FieldSchema> Values = new Map<String, FieldSchema>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Schema schemaInstance = new Schema()
    .Entity(Entity)
    .Href(Href)
    .Values(Values)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
