# com.finbourne.lusid.model.VersionedResourceListWithWarningsOfRegistryLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;RegistryLine&gt;**](RegistryLine.md) | The resources to list. | [default to List<RegistryLine>]
**href** | [**URI**](URI.md) | The URI of the resource list. | [optional] [default to URI]
**nextPage** | **String** | The next page of results. | [optional] [default to String]
**previousPage** | **String** | The previous page of results. | [optional] [default to String]
**warnings** | [**List&lt;Warning&gt;**](Warning.md) |  | [optional] [default to List<Warning>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.VersionedResourceListWithWarningsOfRegistryLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
List<RegistryLine> Values = new List<RegistryLine>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";
@jakarta.annotation.Nullable List<Warning> Warnings = new List<Warning>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


VersionedResourceListWithWarningsOfRegistryLine versionedResourceListWithWarningsOfRegistryLineInstance = new VersionedResourceListWithWarningsOfRegistryLine()
    .Version(Version)
    .Values(Values)
    .Href(Href)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Warnings(Warnings)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
