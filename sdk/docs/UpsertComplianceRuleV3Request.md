# com.finbourne.lusid.model.UpsertComplianceRuleV3Request
A request to create or update a V3 compliance rule. A V3 rule's own record fully describes what it  checks: the subject it runs over, the filter selecting rows, the grouping and measure reducing them to a  number, and the check that number must satisfy. Shares no type with ComplianceV1/V2.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**active** | **Boolean** |  | [default to Boolean]
**subject** | **String** | Available values: Holdings, Orders. | [default to String]
**filter** | [**ComplianceRuleV3FilterNode**](ComplianceRuleV3FilterNode.md) |  | [optional] [default to ComplianceRuleV3FilterNode]
**groupBy** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**measure** | [**ComplianceRuleV3Measure**](ComplianceRuleV3Measure.md) |  | [default to ComplianceRuleV3Measure]
**check** | [**ComplianceRuleV3Check**](ComplianceRuleV3Check.md) |  | [default to ComplianceRuleV3Check]
**computedFilter** | [**ComplianceRuleV3ComputedFilter**](ComplianceRuleV3ComputedFilter.md) |  | [optional] [default to ComplianceRuleV3ComputedFilter]

```java
import com.finbourne.lusid.model.UpsertComplianceRuleV3Request;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean Active = true;
String Subject = "example Subject";
ComplianceRuleV3FilterNode Filter = new ComplianceRuleV3FilterNode();
@jakarta.annotation.Nullable List<String> GroupBy = new List<String>();
ComplianceRuleV3Measure Measure = new ComplianceRuleV3Measure();
ComplianceRuleV3Check Check = new ComplianceRuleV3Check();
ComplianceRuleV3ComputedFilter ComputedFilter = new ComplianceRuleV3ComputedFilter();


UpsertComplianceRuleV3Request upsertComplianceRuleV3RequestInstance = new UpsertComplianceRuleV3Request()
    .Id(Id)
    .Name(Name)
    .Description(Description)
    .Active(Active)
    .Subject(Subject)
    .Filter(Filter)
    .GroupBy(GroupBy)
    .Measure(Measure)
    .Check(Check)
    .ComputedFilter(ComputedFilter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
