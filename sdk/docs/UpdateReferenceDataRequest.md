# com.finbourne.lusid.model.UpdateReferenceDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestDefinitions** | [**List&lt;FieldDefinition&gt;**](FieldDefinition.md) | Definition of a reference data field. | [default to List<FieldDefinition>]
**requestValues** | [**List&lt;FieldValue&gt;**](FieldValue.md) | Reference data. | [default to List<FieldValue>]

```java
import com.finbourne.lusid.model.UpdateReferenceDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<FieldDefinition> RequestDefinitions = new List<FieldDefinition>();
List<FieldValue> RequestValues = new List<FieldValue>();


UpdateReferenceDataRequest updateReferenceDataRequestInstance = new UpdateReferenceDataRequest()
    .RequestDefinitions(RequestDefinitions)
    .RequestValues(RequestValues);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
