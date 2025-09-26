# com.finbourne.lusid.model.CreateCustomDataModelRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Custom Data Model. | [default to String]
**description** | **String** | A description for the Custom Data Model. | [default to String]
**parentDataModel** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**conditions** | **String** | The conditions that the bound entity must meet to be valid. | [optional] [default to String]
**properties** | [**List&lt;CustomDataModelPropertySpecification&gt;**](CustomDataModelPropertySpecification.md) | The properties that are required or allowed on the bound entity. | [optional] [default to List<CustomDataModelPropertySpecification>]
**identifierTypes** | [**List&lt;CustomDataModelIdentifierTypeSpecification&gt;**](CustomDataModelIdentifierTypeSpecification.md) | The identifier types that are required or allowed on the bound entity. | [optional] [default to List<CustomDataModelIdentifierTypeSpecification>]
**attributeAliases** | [**List&lt;Alias&gt;**](Alias.md) | The aliases for property keys, identifier types, and fields on the bound entity. | [optional] [default to List<Alias>]
**recommendedSortBy** | [**List&lt;RecommendedSortBy&gt;**](RecommendedSortBy.md) | The preferred default sorting instructions. | [optional] [default to List<RecommendedSortBy>]

```java
import com.finbourne.lusid.model.CreateCustomDataModelRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
String Description = "example Description";
ResourceId ParentDataModel = new ResourceId();
@jakarta.annotation.Nullable String Conditions = "example Conditions";
@jakarta.annotation.Nullable List<CustomDataModelPropertySpecification> Properties = new List<CustomDataModelPropertySpecification>();
@jakarta.annotation.Nullable List<CustomDataModelIdentifierTypeSpecification> IdentifierTypes = new List<CustomDataModelIdentifierTypeSpecification>();
@jakarta.annotation.Nullable List<Alias> AttributeAliases = new List<Alias>();
@jakarta.annotation.Nullable List<RecommendedSortBy> RecommendedSortBy = new List<RecommendedSortBy>();


CreateCustomDataModelRequest createCustomDataModelRequestInstance = new CreateCustomDataModelRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .ParentDataModel(ParentDataModel)
    .Conditions(Conditions)
    .Properties(Properties)
    .IdentifierTypes(IdentifierTypes)
    .AttributeAliases(AttributeAliases)
    .RecommendedSortBy(RecommendedSortBy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
