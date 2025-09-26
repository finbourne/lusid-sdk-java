# com.finbourne.lusid.model.UpsertComplianceRuleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**active** | **Boolean** |  | [default to Boolean]
**templateId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**variation** | **String** |  | [default to String]
**portfolioGroupId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**parameters** | [**Map&lt;String, ComplianceParameter&gt;**](ComplianceParameter.md) |  | [default to Map<String, ComplianceParameter>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.UpsertComplianceRuleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean Active = true;
ResourceId TemplateId = new ResourceId();
String Variation = "example Variation";
ResourceId PortfolioGroupId = new ResourceId();
Map<String, ComplianceParameter> Parameters = new Map<String, ComplianceParameter>();
Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


UpsertComplianceRuleRequest upsertComplianceRuleRequestInstance = new UpsertComplianceRuleRequest()
    .Id(Id)
    .Name(Name)
    .Description(Description)
    .Active(Active)
    .TemplateId(TemplateId)
    .Variation(Variation)
    .PortfolioGroupId(PortfolioGroupId)
    .Parameters(Parameters)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
