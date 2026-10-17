# com.finbourne.lusid.model.UpdateRecDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the rec definition. | [default to String]
**description** | **String** | A description of the rec definition. | [optional] [default to String]
**sideNames** | [**RecDefSideNames**](RecDefSideNames.md) |  | [optional] [default to RecDefSideNames]
**details** | [**RecDefinitionDetails**](RecDefinitionDetails.md) |  | [default to RecDefinitionDetails]
**reviewConfiguration** | [**RecReviewConfiguration**](RecReviewConfiguration.md) |  | [optional] [default to RecReviewConfiguration]
**datePolicy** | [**RecDatePolicy**](RecDatePolicy.md) |  | [optional] [default to RecDatePolicy]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecDefinition domain. On update, a property with a null value is deleted and omitted properties are left unchanged. Filterable and sortable. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.UpdateRecDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
RecDefSideNames SideNames = new RecDefSideNames();
RecDefinitionDetails Details = new RecDefinitionDetails();
RecReviewConfiguration ReviewConfiguration = new RecReviewConfiguration();
RecDatePolicy DatePolicy = new RecDatePolicy();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


UpdateRecDefinitionRequest updateRecDefinitionRequestInstance = new UpdateRecDefinitionRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .SideNames(SideNames)
    .Details(Details)
    .ReviewConfiguration(ReviewConfiguration)
    .DatePolicy(DatePolicy)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
