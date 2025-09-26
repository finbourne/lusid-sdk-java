# com.finbourne.lusid.model.GroupReconciliationAggregateAttributeValues

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftAggregateAttributes** | [**List&lt;ComparisonAttributeValuePair&gt;**](ComparisonAttributeValuePair.md) | Aggregate attribute names and values for the left hand entity being reconciled. | [default to List<ComparisonAttributeValuePair>]
**rightAggregateAttributes** | [**List&lt;ComparisonAttributeValuePair&gt;**](ComparisonAttributeValuePair.md) | Aggregate attribute names and values for the right hand entity being reconciled. | [default to List<ComparisonAttributeValuePair>]

```java
import com.finbourne.lusid.model.GroupReconciliationAggregateAttributeValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ComparisonAttributeValuePair> LeftAggregateAttributes = new List<ComparisonAttributeValuePair>();
List<ComparisonAttributeValuePair> RightAggregateAttributes = new List<ComparisonAttributeValuePair>();


GroupReconciliationAggregateAttributeValues groupReconciliationAggregateAttributeValuesInstance = new GroupReconciliationAggregateAttributeValues()
    .LeftAggregateAttributes(LeftAggregateAttributes)
    .RightAggregateAttributes(RightAggregateAttributes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
