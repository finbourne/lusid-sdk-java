# com.finbourne.lusid.model.RecDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the rec definition. | [default to String]
**description** | **String** | A description of the rec definition. | [optional] [default to String]
**sideNames** | [**RecDefSideNames**](RecDefSideNames.md) |  | [optional] [default to RecDefSideNames]
**details** | [**RecDefinitionDetails**](RecDefinitionDetails.md) |  | [default to RecDefinitionDetails]
**reviewConfiguration** | [**RecReviewConfiguration**](RecReviewConfiguration.md) |  | [default to RecReviewConfiguration]
**datePolicy** | [**RecDatePolicy**](RecDatePolicy.md) |  | [default to RecDatePolicy]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecDefinition domain. On update, a property with a null value is deleted and omitted properties are left unchanged. Filterable and sortable. | [optional] [default to Map<String, PerpetualProperty>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.RecDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
RecDefSideNames SideNames = new RecDefSideNames();
RecDefinitionDetails Details = new RecDefinitionDetails();
RecReviewConfiguration ReviewConfiguration = new RecReviewConfiguration();
RecDatePolicy DatePolicy = new RecDatePolicy();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RecDefinition recDefinitionInstance = new RecDefinition()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .SideNames(SideNames)
    .Details(Details)
    .ReviewConfiguration(ReviewConfiguration)
    .DatePolicy(DatePolicy)
    .Properties(Properties)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
