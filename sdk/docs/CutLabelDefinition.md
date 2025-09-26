# com.finbourne.lusid.model.CutLabelDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**cutLocalTime** | [**CutLocalTime**](CutLocalTime.md) |  | [optional] [default to CutLocalTime]
**timeZone** | **String** |  | [optional] [default to String]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CutLabelDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
CutLocalTime CutLocalTime = new CutLocalTime();
@jakarta.annotation.Nullable String TimeZone = "example TimeZone";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CutLabelDefinition cutLabelDefinitionInstance = new CutLabelDefinition()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .CutLocalTime(CutLocalTime)
    .TimeZone(TimeZone)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
