# com.finbourne.lusid.model.ReferenceData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldDefinitions** | [**List&lt;FieldDefinition&gt;**](FieldDefinition.md) |  | [default to List<FieldDefinition>]
**values** | [**List&lt;FieldValue&gt;**](FieldValue.md) |  | [default to List<FieldValue>]

```java
import com.finbourne.lusid.model.ReferenceData;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<FieldDefinition> FieldDefinitions = new List<FieldDefinition>();
List<FieldValue> Values = new List<FieldValue>();


ReferenceData referenceDataInstance = new ReferenceData()
    .FieldDefinitions(FieldDefinitions)
    .Values(Values);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
