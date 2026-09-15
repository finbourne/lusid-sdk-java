# com.finbourne.lusid.model.ComplianceRuleResultDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**affectedPortfoliosDetails** | [**List&lt;ComplianceRuleResultPortfolioDetail&gt;**](ComplianceRuleResultPortfolioDetail.md) |  | [default to List<ComplianceRuleResultPortfolioDetail>]
**affectedOrders** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**templateId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**templateDescription** | **String** |  | [default to String]
**templateVariation** | **String** |  | [default to String]
**status** | **String** |  | [default to String]
**ruleName** | **String** |  | [default to String]
**ruleDescription** | **String** |  | [default to String]
**outcome** | **String** |  | [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.ComplianceRuleResultDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RuleId = new ResourceId();
List<ComplianceRuleResultPortfolioDetail> AffectedPortfoliosDetails = new List<ComplianceRuleResultPortfolioDetail>();
List<ResourceId> AffectedOrders = new List<ResourceId>();
ResourceId TemplateId = new ResourceId();
String TemplateDescription = "example TemplateDescription";
String TemplateVariation = "example TemplateVariation";
String Status = "example Status";
String RuleName = "example RuleName";
String RuleDescription = "example RuleDescription";
String Outcome = "example Outcome";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


ComplianceRuleResultDetail complianceRuleResultDetailInstance = new ComplianceRuleResultDetail()
    .RuleId(RuleId)
    .AffectedPortfoliosDetails(AffectedPortfoliosDetails)
    .AffectedOrders(AffectedOrders)
    .TemplateId(TemplateId)
    .TemplateDescription(TemplateDescription)
    .TemplateVariation(TemplateVariation)
    .Status(Status)
    .RuleName(RuleName)
    .RuleDescription(RuleDescription)
    .Outcome(Outcome)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
