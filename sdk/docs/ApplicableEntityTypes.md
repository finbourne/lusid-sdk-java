# com.finbourne.lusid.model.ApplicableEntityTypes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicableEntityTypesToAdd** | **List&lt;String&gt;** | The types of entities this relational dataset definition can be applied to (e.g. Instrument, Portfolio, etc.). | [optional] [default to List<String>]
**applicableEntityTypesToRemove** | **List&lt;String&gt;** | The types of entities this relational dataset definition can be applied to (e.g. Instrument, Portfolio, etc.). | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ApplicableEntityTypes;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> ApplicableEntityTypesToAdd = new List<String>();
@jakarta.annotation.Nullable List<String> ApplicableEntityTypesToRemove = new List<String>();


ApplicableEntityTypes applicableEntityTypesInstance = new ApplicableEntityTypes()
    .ApplicableEntityTypesToAdd(ApplicableEntityTypesToAdd)
    .ApplicableEntityTypesToRemove(ApplicableEntityTypesToRemove);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
