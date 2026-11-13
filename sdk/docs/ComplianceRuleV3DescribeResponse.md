# com.finbourne.lusid.model.ComplianceRuleV3DescribeResponse
A plain-English description of a V3 compliance rule: its identity, the kind of entity it examines, and a  single sentence describing what it checks. The sentence is empty for a rule the generator cannot fully  express.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**subject** | **String** | Available values: Holdings, Orders. | [optional] [default to String]
**plainEnglish** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ComplianceRuleV3DescribeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Subject = "example Subject";
@jakarta.annotation.Nullable String PlainEnglish = "example PlainEnglish";


ComplianceRuleV3DescribeResponse complianceRuleV3DescribeResponseInstance = new ComplianceRuleV3DescribeResponse()
    .Id(Id)
    .Subject(Subject)
    .PlainEnglish(PlainEnglish);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
