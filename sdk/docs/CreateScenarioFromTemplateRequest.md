# com.finbourne.lusid.model.CreateScenarioFromTemplateRequest
Request to create a scenario from a pre-built parameterised template. The template determines the  shape of the scenario's shifts; the parameters supply the targets (e.g. currency, instrument) and  optionally override the template's default shift size.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template** | **String** | The template to build the scenario from. Available templates: RatesUp, RatesDown, CurveSteepener,  CurveFlattener, VolSpike, EquityCrash, FxShock, RiskOff. | [default to String]
**code** | **String** | The code of the scenario to create. | [default to String]
**displayName** | **String** | The display name of the created scenario. Defaults to a name derived from the template. | [optional] [default to String]
**description** | **String** | The description of the created scenario. Defaults to a description derived from the template. | [optional] [default to String]
**parameters** | **Map&lt;String, String&gt;** | Template parameters. Which parameters are required depends on the template: &#39;ccy&#39; for rate curve  templates, &#39;instrument&#39; for equity and vol templates, &#39;currencyPair&#39; for FX templates; RiskOff  requires &#39;ccy&#39; and &#39;instrument&#39;. All templates accept an optional &#39;amount&#39; override of the  template&#39;s default shift size. | [optional] [default to Map<String, String>]

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
