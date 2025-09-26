# com.finbourne.lusid.model.CheckDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Check Definition. | [optional] [default to String]
**description** | **String** | A description for the Check Definition. | [optional] [default to String]
**datasetSchema** | [**CheckDefinitionDatasetSchema**](CheckDefinitionDatasetSchema.md) |  | [optional] [default to CheckDefinitionDatasetSchema]
**ruleSets** | [**List&lt;CheckDefinitionRuleSet&gt;**](CheckDefinitionRuleSet.md) | A collection of rule sets for the Check Definition. | [optional] [default to List<CheckDefinitionRuleSet>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Check Definition. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CheckDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
CheckDefinitionDatasetSchema DatasetSchema = new CheckDefinitionDatasetSchema();
@jakarta.annotation.Nullable List<CheckDefinitionRuleSet> RuleSets = new List<CheckDefinitionRuleSet>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CheckDefinition checkDefinitionInstance = new CheckDefinition()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .DatasetSchema(DatasetSchema)
    .RuleSets(RuleSets)
    .Href(Href)
    .Version(Version)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
