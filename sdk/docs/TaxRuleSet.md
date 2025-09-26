# com.finbourne.lusid.model.TaxRuleSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | A user-friendly name | [default to String]
**description** | **String** | A description of what this rule set is for | [default to String]
**outputPropertyKey** | **String** | The property key that this rule set will write to | [default to String]
**rules** | [**List&lt;TaxRule&gt;**](TaxRule.md) | The rules of this rule set, which stipulate what rate to apply (i.e. write to the OutputPropertyKey) under certain conditions | [default to List<TaxRule>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TaxRuleSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
String Description = "example Description";
String OutputPropertyKey = "example OutputPropertyKey";
List<TaxRule> Rules = new List<TaxRule>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TaxRuleSet taxRuleSetInstance = new TaxRuleSet()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .OutputPropertyKey(OutputPropertyKey)
    .Rules(Rules)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
