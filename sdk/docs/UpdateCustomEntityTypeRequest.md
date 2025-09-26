# com.finbourne.lusid.model.UpdateCustomEntityTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A display label for the custom entity type. | [default to String]
**description** | **String** | A description for the custom entity type. | [default to String]
**fieldSchema** | [**List&lt;CustomEntityFieldDefinition&gt;**](CustomEntityFieldDefinition.md) | The description of the fields on the custom entity type. | [default to List<CustomEntityFieldDefinition>]

```java
import com.finbourne.lusid.model.UpdateCustomEntityTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
String Description = "example Description";
List<CustomEntityFieldDefinition> FieldSchema = new List<CustomEntityFieldDefinition>();


UpdateCustomEntityTypeRequest updateCustomEntityTypeRequestInstance = new UpdateCustomEntityTypeRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .FieldSchema(FieldSchema);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
