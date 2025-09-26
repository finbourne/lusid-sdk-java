# com.finbourne.lusid.model.GroupReconciliationCoreAttributeValues

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftCoreAttributes** | [**List&lt;ComparisonAttributeValuePair&gt;**](ComparisonAttributeValuePair.md) | Core attribute names and values for the left hand entity being reconciled. | [default to List<ComparisonAttributeValuePair>]
**rightCoreAttributes** | [**List&lt;ComparisonAttributeValuePair&gt;**](ComparisonAttributeValuePair.md) | Core attribute names and values for the right hand entity being reconciled. | [default to List<ComparisonAttributeValuePair>]

```java
import com.finbourne.lusid.model.GroupReconciliationCoreAttributeValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ComparisonAttributeValuePair> LeftCoreAttributes = new List<ComparisonAttributeValuePair>();
List<ComparisonAttributeValuePair> RightCoreAttributes = new List<ComparisonAttributeValuePair>();


GroupReconciliationCoreAttributeValues groupReconciliationCoreAttributeValuesInstance = new GroupReconciliationCoreAttributeValues()
    .LeftCoreAttributes(LeftCoreAttributes)
    .RightCoreAttributes(RightCoreAttributes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
