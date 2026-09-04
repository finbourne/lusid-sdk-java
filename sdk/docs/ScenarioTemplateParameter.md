# com.finbourne.lusid.model.ScenarioTemplateParameter
One parameter of a scenario template: its name (case-sensitive), whether it must be supplied,  what it means, and - for optional numeric parameters - the default used when omitted and the  unit the value is read in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The parameter name, as supplied in the create request&#39;s Parameters dictionary. Case-sensitive. | [optional] [default to String]
**required** | **Boolean** | Whether the parameter must be supplied. | [optional] [default to Boolean]
**description** | **String** | What the parameter means to this template. | [optional] [default to String]
**defaultValue** | **String** | The value used when the parameter is omitted. Null for required parameters. | [optional] [default to String]
**unit** | **String** | The unit a numeric value is read in: &#39;BasisPoints&#39;, &#39;PercentagePoints&#39; or &#39;Fraction&#39;  (0.20 meaning +20%). The templates do NOT share one unit - read this per template.  Null for non-numeric parameters. | [optional] [default to String]
**exclusiveGroup** | **String** | Parameters of a template sharing an ExclusiveGroup are alternatives: exactly one of them must  be supplied. Group members are not individually Required and carry no default. Null for  parameters that stand alone. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ScenarioTemplateParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
Boolean Required = true;
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String DefaultValue = "example DefaultValue";
@jakarta.annotation.Nullable String Unit = "example Unit";
@jakarta.annotation.Nullable String ExclusiveGroup = "example ExclusiveGroup";


ScenarioTemplateParameter scenarioTemplateParameterInstance = new ScenarioTemplateParameter()
    .Name(Name)
    .Required(Required)
    .Description(Description)
    .DefaultValue(DefaultValue)
    .Unit(Unit)
    .ExclusiveGroup(ExclusiveGroup);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
