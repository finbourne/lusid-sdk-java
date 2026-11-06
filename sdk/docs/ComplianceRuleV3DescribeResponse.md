# com.finbourne.lusid.model.ComplianceRuleV3DescribeResponse
A plain-English description of a V3 compliance rule. This is a minimal placeholder shape: the plain-English  generator is delivered separately, so the Lines property is currently empty and only the rule's identity  and subject are populated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**subject** | **String** | Available values: Holdings, Orders. | [optional] [default to String]
**lines** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ComplianceRuleV3DescribeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Subject = "example Subject";
@jakarta.annotation.Nullable List<String> Lines = new List<String>();


ComplianceRuleV3DescribeResponse complianceRuleV3DescribeResponseInstance = new ComplianceRuleV3DescribeResponse()
    .Id(Id)
    .Subject(Subject)
    .Lines(Lines);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
