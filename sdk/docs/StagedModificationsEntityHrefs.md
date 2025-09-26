# com.finbourne.lusid.model.StagedModificationsEntityHrefs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**whenStaged** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for the staged modification change at the time when the change was requested. | [optional] [default to URI]
**preview** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for the preview of staged modification change once applied. | [optional] [default to URI]
**latest** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for the staged modification at latest time. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.StagedModificationsEntityHrefs;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI WhenStaged = URI.create("http://example.com/WhenStaged");
@jakarta.annotation.Nullable URI Preview = URI.create("http://example.com/Preview");
@jakarta.annotation.Nullable URI Latest = URI.create("http://example.com/Latest");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


StagedModificationsEntityHrefs stagedModificationsEntityHrefsInstance = new StagedModificationsEntityHrefs()
    .WhenStaged(WhenStaged)
    .Preview(Preview)
    .Latest(Latest)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
