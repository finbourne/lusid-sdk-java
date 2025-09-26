# com.finbourne.lusid.model.Calendar

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** |  | [default to String]
**weekendMask** | [**WeekendMask**](WeekendMask.md) |  | [default to WeekendMask]
**sourceProvider** | **String** |  | [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) |  | [default to List<Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Calendar;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
String Type = "example Type";
WeekendMask WeekendMask = new WeekendMask();
String SourceProvider = "example SourceProvider";
List<Property> Properties = new List<Property>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Calendar calendarInstance = new Calendar()
    .Href(Href)
    .Id(Id)
    .Type(Type)
    .WeekendMask(WeekendMask)
    .SourceProvider(SourceProvider)
    .Properties(Properties)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
