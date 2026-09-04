# com.finbourne.lusid.model.CreateScenarioFromTemplateRequest
Request to create a scenario from a pre-built parameterised template. The template determines the  shape of the scenario's shifts; the parameters supply the targets (e.g. currency, instrument) and  optionally override the template's default shift size.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template** | **String** | The template to build the scenario from. Use ListScenarioTemplates to discover the available  templates and the parameters each accepts. | [default to String]
**code** | **String** | The code of the scenario to create. | [default to String]
**displayName** | **String** | The display name of the created scenario. Defaults to a name derived from the template. | [optional] [default to String]
**description** | **String** | The description of the created scenario. Defaults to a description derived from the template. | [optional] [default to String]
**parameters** | **Map&lt;String, String&gt;** | Template parameters. Which parameters each template requires and accepts - with defaults and  units for the numeric ones - is listed by ListScenarioTemplates. A parameter the template does  not read is rejected rather than ignored, and parameter names are case-sensitive. | [optional] [default to Map<String, String>]

```java
import com.finbourne.lusid.model.CreateScenarioFromTemplateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Template = "example Template";
String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable Map<String, String> Parameters = new Map<String, String>();


CreateScenarioFromTemplateRequest createScenarioFromTemplateRequestInstance = new CreateScenarioFromTemplateRequest()
    .Template(Template)
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .Parameters(Parameters);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
