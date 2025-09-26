# com.finbourne.lusid.model.StagingRuleSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The entity type the staging rule set applies to. | [default to String]
**stagingRuleSetId** | **String** | System generated unique id for the staging rule set. | [default to String]
**displayName** | **String** | The name of the staging rule set. | [default to String]
**description** | **String** | A description for the staging rule set. | [optional] [default to String]
**rules** | [**List&lt;StagingRule&gt;**](StagingRule.md) | The list of staging rules that apply to a specific entity type. | [default to List<StagingRule>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.StagingRuleSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
String StagingRuleSetId = "example StagingRuleSetId";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<StagingRule> Rules = new List<StagingRule>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


StagingRuleSet stagingRuleSetInstance = new StagingRuleSet()
    .EntityType(EntityType)
    .StagingRuleSetId(StagingRuleSetId)
    .DisplayName(DisplayName)
    .Description(Description)
    .Rules(Rules)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
