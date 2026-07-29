# com.finbourne.lusid.model.ScenarioReference
A reference to a stored Scenario, identified by scope and code, optionally pinned to an AsAt version.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the scenario to apply. | [default to String]
**code** | **String** | The code of the scenario to apply. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt of the scenario version to apply. If not supplied, the latest version is used. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.ScenarioReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


ScenarioReference scenarioReferenceInstance = new ScenarioReference()
    .Scope(Scope)
    .Code(Code)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
