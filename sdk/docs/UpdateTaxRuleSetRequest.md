# com.finbourne.lusid.model.UpdateTaxRuleSetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**rules** | [**List&lt;TaxRule&gt;**](TaxRule.md) |  | [default to List<TaxRule>]

```java
import com.finbourne.lusid.model.UpdateTaxRuleSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
String Description = "example Description";
List<TaxRule> Rules = new List<TaxRule>();


UpdateTaxRuleSetRequest updateTaxRuleSetRequestInstance = new UpdateTaxRuleSetRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Rules(Rules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
