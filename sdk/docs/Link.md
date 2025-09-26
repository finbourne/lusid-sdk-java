# com.finbourne.lusid.model.Link

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relation** | **String** |  | [default to String]
**href** | [**URI**](URI.md) |  | [default to URI]
**description** | **String** |  | [optional] [default to String]
**method** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.Link;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Relation = "example Relation";
URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String Description = "example Description";
String Method = "example Method";


Link linkInstance = new Link()
    .Relation(Relation)
    .Href(Href)
    .Description(Description)
    .Method(Method);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
