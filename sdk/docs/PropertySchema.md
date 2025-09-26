# com.finbourne.lusid.model.PropertySchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**values** | [**Map&lt;String, FieldSchema&gt;**](FieldSchema.md) |  | [optional] [default to Map<String, FieldSchema>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PropertySchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, FieldSchema> Values = new Map<String, FieldSchema>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PropertySchema propertySchemaInstance = new PropertySchema()
    .Href(Href)
    .Values(Values)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
