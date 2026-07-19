# com.finbourne.lusid.model.ScenarioDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**shifts** | [**List&lt;ScenarioShiftDefinition&gt;**](ScenarioShiftDefinition.md) |  | [optional] [default to List<ScenarioShiftDefinition>]

```java
import com.finbourne.lusid.model.ScenarioDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<ScenarioShiftDefinition> Shifts = new List<ScenarioShiftDefinition>();


ScenarioDefinition scenarioDefinitionInstance = new ScenarioDefinition()
    .Scope(Scope)
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .Shifts(Shifts);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
