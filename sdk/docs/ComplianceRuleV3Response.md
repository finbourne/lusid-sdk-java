# com.finbourne.lusid.model.ComplianceRuleV3Response
A V3 compliance rule as returned by the API: its identity and administrative fields, its full  definition, and its version.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**active** | **Boolean** |  | [optional] [default to Boolean]
**subject** | **String** | Available values: Holdings, Orders. | [optional] [default to String]
**filter** | [**ComplianceRuleV3FilterNode**](ComplianceRuleV3FilterNode.md) |  | [optional] [default to ComplianceRuleV3FilterNode]
**groupBy** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**measure** | [**ComplianceRuleV3Measure**](ComplianceRuleV3Measure.md) |  | [optional] [default to ComplianceRuleV3Measure]
**check** | [**ComplianceRuleV3Check**](ComplianceRuleV3Check.md) |  | [optional] [default to ComplianceRuleV3Check]
**computedFilter** | [**ComplianceRuleV3ComputedFilter**](ComplianceRuleV3ComputedFilter.md) |  | [optional] [default to ComplianceRuleV3ComputedFilter]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ComplianceRuleV3Response;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean Active = true;
@jakarta.annotation.Nullable String Subject = "example Subject";
ComplianceRuleV3FilterNode Filter = new ComplianceRuleV3FilterNode();
@jakarta.annotation.Nullable List<String> GroupBy = new List<String>();
ComplianceRuleV3Measure Measure = new ComplianceRuleV3Measure();
ComplianceRuleV3Check Check = new ComplianceRuleV3Check();
ComplianceRuleV3ComputedFilter ComputedFilter = new ComplianceRuleV3ComputedFilter();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ComplianceRuleV3Response complianceRuleV3ResponseInstance = new ComplianceRuleV3Response()
    .Id(Id)
    .Name(Name)
    .Description(Description)
    .Active(Active)
    .Subject(Subject)
    .Filter(Filter)
    .GroupBy(GroupBy)
    .Measure(Measure)
    .Check(Check)
    .ComputedFilter(ComputedFilter)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
