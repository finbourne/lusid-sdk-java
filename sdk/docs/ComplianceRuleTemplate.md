# com.finbourne.lusid.model.ComplianceRuleTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**description** | **String** | The description of the Compliance Template | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties associated with the Compliance Template Variation | [optional] [default to Map<String, Property>]
**variations** | [**List&lt;ComplianceTemplateVariationDto&gt;**](ComplianceTemplateVariationDto.md) | Variation details of a Compliance Template | [optional] [default to List<ComplianceTemplateVariationDto>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ComplianceRuleTemplate;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<ComplianceTemplateVariationDto> Variations = new List<ComplianceTemplateVariationDto>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ComplianceRuleTemplate complianceRuleTemplateInstance = new ComplianceRuleTemplate()
    .Id(Id)
    .Description(Description)
    .Properties(Properties)
    .Variations(Variations)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
