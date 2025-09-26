# com.finbourne.lusid.model.CustomEntityRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A display label for the custom entity. | [default to String]
**description** | **String** | A description of the custom entity. | [default to String]
**identifiers** | [**List&lt;CustomEntityId&gt;**](CustomEntityId.md) | The identifiers the custom entity will be upserted with. | [default to List<CustomEntityId>]
**fields** | [**List&lt;CustomEntityField&gt;**](CustomEntityField.md) | The fields that decorate the custom entity. | [optional] [default to List<CustomEntityField>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties that decorate the custom entity. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.CustomEntityRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
String Description = "example Description";
List<CustomEntityId> Identifiers = new List<CustomEntityId>();
@jakarta.annotation.Nullable List<CustomEntityField> Fields = new List<CustomEntityField>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


CustomEntityRequest customEntityRequestInstance = new CustomEntityRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Identifiers(Identifiers)
    .Fields(Fields)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
