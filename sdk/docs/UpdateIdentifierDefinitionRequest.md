# com.finbourne.lusid.model.UpdateIdentifierDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hierarchyLevel** | **String** | Optional metadata associated with the identifier definition. | [optional] [default to String]
**displayName** | **String** | A display name for the identifier. E.g. Figi. | [optional] [default to String]
**description** | **String** | An optional description for the identifier. | [optional] [default to String]
**hierarchyUsage** | **String** | Optional. When supplied, relaxes the identifier definition from MasterIdentifier (unique) to ParentIdentifier (non-unique).  Tightening from ParentIdentifier back to MasterIdentifier is refused.  Omit to leave the HierarchyUsage unchanged. Available values: MasterIdentifier, ParentIdentifier. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the identifier definition. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.UpdateIdentifierDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String HierarchyLevel = "example HierarchyLevel";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String HierarchyUsage = "example HierarchyUsage";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


UpdateIdentifierDefinitionRequest updateIdentifierDefinitionRequestInstance = new UpdateIdentifierDefinitionRequest()
    .HierarchyLevel(HierarchyLevel)
    .DisplayName(DisplayName)
    .Description(Description)
    .HierarchyUsage(HierarchyUsage)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
