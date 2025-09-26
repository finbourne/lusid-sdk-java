# com.finbourne.lusid.model.ComplianceRuleResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**active** | **Boolean** |  | [optional] [default to Boolean]
**templateId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**variation** | **String** |  | [optional] [default to String]
**portfolioGroupId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**parameters** | [**Map&lt;String, ComplianceParameter&gt;**](ComplianceParameter.md) |  | [optional] [default to Map<String, ComplianceParameter>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ComplianceRuleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean Active = true;
ResourceId TemplateId = new ResourceId();
@jakarta.annotation.Nullable String Variation = "example Variation";
ResourceId PortfolioGroupId = new ResourceId();
@jakarta.annotation.Nullable Map<String, ComplianceParameter> Parameters = new Map<String, ComplianceParameter>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ComplianceRuleResponse complianceRuleResponseInstance = new ComplianceRuleResponse()
    .Id(Id)
    .Name(Name)
    .Description(Description)
    .Active(Active)
    .TemplateId(TemplateId)
    .Variation(Variation)
    .PortfolioGroupId(PortfolioGroupId)
    .Parameters(Parameters)
    .Properties(Properties)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
