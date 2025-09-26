# com.finbourne.lusid.model.UpdateRelationalDatasetDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A user-friendly display name for the relational dataset definition. | [default to String]
**description** | **String** | A detailed description of the relational dataset definition and its purpose. | [optional] [default to String]
**applicableEntityTypes** | **List&lt;String&gt;** | The types of entities this relational dataset definition can be applied to (e.g. Instrument, Portfolio, etc.). | [default to List<String>]
**fieldSchema** | [**List&lt;RelationalDatasetFieldDefinition&gt;**](RelationalDatasetFieldDefinition.md) | The schema defining the structure and data types of the relational dataset. | [default to List<RelationalDatasetFieldDefinition>]

```java
import com.finbourne.lusid.model.UpdateRelationalDatasetDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<String> ApplicableEntityTypes = new List<String>();
List<RelationalDatasetFieldDefinition> FieldSchema = new List<RelationalDatasetFieldDefinition>();


UpdateRelationalDatasetDefinitionRequest updateRelationalDatasetDefinitionRequestInstance = new UpdateRelationalDatasetDefinitionRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .ApplicableEntityTypes(ApplicableEntityTypes)
    .FieldSchema(FieldSchema);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
