# com.finbourne.lusid.model.AmortisationRuleSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | A user-friendly name. | [default to String]
**description** | **String** | A description of what this rule set is for. | [optional] [default to String]
**rulesInterval** | [**RulesInterval**](RulesInterval.md) |  | [default to RulesInterval]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.AmortisationRuleSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
RulesInterval RulesInterval = new RulesInterval();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AmortisationRuleSet amortisationRuleSetInstance = new AmortisationRuleSet()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .RulesInterval(RulesInterval)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
