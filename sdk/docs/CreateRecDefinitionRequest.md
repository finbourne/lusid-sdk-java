# com.finbourne.lusid.model.CreateRecDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the rec definition. | [default to String]
**description** | **String** | A description of the rec definition. | [optional] [default to String]
**sideNames** | [**RecDefSideNames**](RecDefSideNames.md) |  | [optional] [default to RecDefSideNames]
**details** | [**RecDefinitionDetails**](RecDefinitionDetails.md) |  | [default to RecDefinitionDetails]
**reviewConfiguration** | [**RecReviewConfiguration**](RecReviewConfiguration.md) |  | [optional] [default to RecReviewConfiguration]
**datePolicy** | [**RecDatePolicy**](RecDatePolicy.md) |  | [optional] [default to RecDatePolicy]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecDefinition domain. On update, a property with a null value is deleted and omitted properties are left unchanged. Filterable and sortable. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.CreateRecDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
RecDefSideNames SideNames = new RecDefSideNames();
RecDefinitionDetails Details = new RecDefinitionDetails();
RecReviewConfiguration ReviewConfiguration = new RecReviewConfiguration();
RecDatePolicy DatePolicy = new RecDatePolicy();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


CreateRecDefinitionRequest createRecDefinitionRequestInstance = new CreateRecDefinitionRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .SideNames(SideNames)
    .Details(Details)
    .ReviewConfiguration(ReviewConfiguration)
    .DatePolicy(DatePolicy)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
