# com.finbourne.lusid.model.CustomDataModelCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | **List&lt;String&gt;** | The conditions that the bound entity must meet to be valid. | [optional] [default to List<String>]
**properties** | [**List&lt;CustomDataModelPropertySpecificationWithDisplayName&gt;**](CustomDataModelPropertySpecificationWithDisplayName.md) | The properties that are required or allowed on the bound entity. | [optional] [default to List<CustomDataModelPropertySpecificationWithDisplayName>]
**identifierTypes** | [**List&lt;CustomDataModelIdentifierTypeSpecificationWithDisplayName&gt;**](CustomDataModelIdentifierTypeSpecificationWithDisplayName.md) | The identifier types that are required or allowed on the bound entity. | [optional] [default to List<CustomDataModelIdentifierTypeSpecificationWithDisplayName>]
**attributeAliases** | [**List&lt;Alias&gt;**](Alias.md) | The aliases for property keys, identifier types, and fields on the bound entity. | [optional] [default to List<Alias>]
**recommendedSortBy** | [**List&lt;RecommendedSortBy&gt;**](RecommendedSortBy.md) | The preferred default sorting instructions. | [optional] [default to List<RecommendedSortBy>]

```java
import com.finbourne.lusid.model.CustomDataModelCriteria;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> Conditions = new List<String>();
@jakarta.annotation.Nullable List<CustomDataModelPropertySpecificationWithDisplayName> Properties = new List<CustomDataModelPropertySpecificationWithDisplayName>();
@jakarta.annotation.Nullable List<CustomDataModelIdentifierTypeSpecificationWithDisplayName> IdentifierTypes = new List<CustomDataModelIdentifierTypeSpecificationWithDisplayName>();
@jakarta.annotation.Nullable List<Alias> AttributeAliases = new List<Alias>();
@jakarta.annotation.Nullable List<RecommendedSortBy> RecommendedSortBy = new List<RecommendedSortBy>();


CustomDataModelCriteria customDataModelCriteriaInstance = new CustomDataModelCriteria()
    .Conditions(Conditions)
    .Properties(Properties)
    .IdentifierTypes(IdentifierTypes)
    .AttributeAliases(AttributeAliases)
    .RecommendedSortBy(RecommendedSortBy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
