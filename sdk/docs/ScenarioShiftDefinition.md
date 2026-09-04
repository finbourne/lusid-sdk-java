# com.finbourne.lusid.model.ScenarioShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenarioShiftType** | **String** | Available values: RateCurveShiftDefinition, FxShiftDefinition, PriceShiftDefinition, VolSurfaceShiftDefinition, MdkrGroupShiftDefinition, InflationCurveShiftDefinition, CreditSpreadShiftDefinition, ModelOptionShiftDefinition. | [default to String]

```java
import com.finbourne.lusid.model.ScenarioShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ScenarioShiftType = "example ScenarioShiftType";


ScenarioShiftDefinition scenarioShiftDefinitionInstance = new ScenarioShiftDefinition()
    .ScenarioShiftType(ScenarioShiftType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
