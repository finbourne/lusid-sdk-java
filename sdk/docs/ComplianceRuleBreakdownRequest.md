# com.finbourne.lusid.model.ComplianceRuleBreakdownRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupStatus** | **String** |  | [default to String]
**resultsUsed** | **Map&lt;String, java.math.BigDecimal&gt;** |  | [default to Map<String, java.math.BigDecimal>]
**propertiesUsed** | [**Map&lt;String, List&lt;Property&gt;&gt;**](List.md) |  | [default to Map<String, List<Property>>]
**missingDataInformation** | **List&lt;String&gt;** |  | [default to List<String>]
**lineage** | [**List&lt;LineageMember&gt;**](LineageMember.md) |  | [default to List<LineageMember>]

```java
import com.finbourne.lusid.model.ComplianceRuleBreakdownRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String GroupStatus = "example GroupStatus";
Map<String, java.math.BigDecimal> ResultsUsed = new Map<String, java.math.BigDecimal>();
Map<String, List<Property>> PropertiesUsed = new Map<String, List<Property>>();
List<String> MissingDataInformation = new List<String>();
List<LineageMember> Lineage = new List<LineageMember>();


ComplianceRuleBreakdownRequest complianceRuleBreakdownRequestInstance = new ComplianceRuleBreakdownRequest()
    .GroupStatus(GroupStatus)
    .ResultsUsed(ResultsUsed)
    .PropertiesUsed(PropertiesUsed)
    .MissingDataInformation(MissingDataInformation)
    .Lineage(Lineage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
