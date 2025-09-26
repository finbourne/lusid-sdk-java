# com.finbourne.lusid.model.AmortisationRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the rule. | [default to String]
**description** | **String** | A description of the rule. | [optional] [default to String]
**filter** | **String** | The filter for this rule. | [default to String]
**amortisationMethod** | **String** | The filter for this rule. | [default to String]

```java
import com.finbourne.lusid.model.AmortisationRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
String Filter = "example Filter";
String AmortisationMethod = "example AmortisationMethod";


AmortisationRule amortisationRuleInstance = new AmortisationRule()
    .Name(Name)
    .Description(Description)
    .Filter(Filter)
    .AmortisationMethod(AmortisationMethod);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
