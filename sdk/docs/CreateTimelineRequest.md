# com.finbourne.lusid.model.CreateTimelineRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Timeline. | [default to String]
**description** | **String** | A description for the Timeline. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Timelines properties. These will be from the &#39;Timeline&#39; domain. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.CreateTimelineRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


CreateTimelineRequest createTimelineRequestInstance = new CreateTimelineRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
