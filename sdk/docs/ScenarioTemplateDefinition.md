# com.finbourne.lusid.model.ScenarioTemplateDefinition
One pre-built scenario template: the name to pass to CreateScenarioFromTemplate, what the  template does, and the parameters it accepts. A parameter not listed here is rejected by  the create call, not ignored.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The template name, as accepted by CreateScenarioFromTemplate. | [optional] [default to String]
**description** | **String** | What the template&#39;s scenario does. | [optional] [default to String]
**parameters** | [**List&lt;ScenarioTemplateParameter&gt;**](ScenarioTemplateParameter.md) | The parameters the template accepts, in the order they are documented. Parameter names are  case-sensitive; supplying one not in this list fails the create call. | [optional] [default to List<ScenarioTemplateParameter>]

```java
import com.finbourne.lusid.model.ScenarioTemplateDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<ScenarioTemplateParameter> Parameters = new List<ScenarioTemplateParameter>();


ScenarioTemplateDefinition scenarioTemplateDefinitionInstance = new ScenarioTemplateDefinition()
    .Name(Name)
    .Description(Description)
    .Parameters(Parameters);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
