# com.finbourne.lusid.model.AborConfigurationRequest
The request used to create an AborConfiguration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Abor Configuration. | [default to String]
**displayName** | **String** | The name of the Abor Configuration. | [optional] [default to String]
**description** | **String** | A description for the Abor Configuration. | [optional] [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**postingModuleCodes** | **List&lt;String&gt;** | The Posting Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**cleardownModuleCodes** | **List&lt;String&gt;** | The Cleardown Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor Configuration. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.AborConfigurationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId RecipeId = new ResourceId();
ResourceId ChartOfAccountsId = new ResourceId();
@jakarta.annotation.Nullable List<String> PostingModuleCodes = new List<String>();
@jakarta.annotation.Nullable List<String> CleardownModuleCodes = new List<String>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


AborConfigurationRequest aborConfigurationRequestInstance = new AborConfigurationRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .RecipeId(RecipeId)
    .ChartOfAccountsId(ChartOfAccountsId)
    .PostingModuleCodes(PostingModuleCodes)
    .CleardownModuleCodes(CleardownModuleCodes)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
