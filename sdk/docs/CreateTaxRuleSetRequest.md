# com.finbourne.lusid.model.CreateTaxRuleSetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**outputPropertyKey** | **String** |  | [default to String]
**rules** | [**List&lt;TaxRule&gt;**](TaxRule.md) |  | [default to List<TaxRule>]

```java
import com.finbourne.lusid.model.CreateTaxRuleSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
String Description = "example Description";
String OutputPropertyKey = "example OutputPropertyKey";
List<TaxRule> Rules = new List<TaxRule>();


CreateTaxRuleSetRequest createTaxRuleSetRequestInstance = new CreateTaxRuleSetRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .OutputPropertyKey(OutputPropertyKey)
    .Rules(Rules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
