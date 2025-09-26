# com.finbourne.lusid.model.TaxRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A user-friendly name | [default to String]
**description** | **String** | A description for this rule | [default to String]
**rate** | **java.math.BigDecimal** | The rate to be applied if all criteria are met | [default to java.math.BigDecimal]
**matchCriteria** | [**List&lt;MatchCriterion&gt;**](MatchCriterion.md) | A set of criteria to be met for this rule to be applied | [default to List<MatchCriterion>]

```java
import com.finbourne.lusid.model.TaxRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Description = "example Description";
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
List<MatchCriterion> MatchCriteria = new List<MatchCriterion>();


TaxRule taxRuleInstance = new TaxRule()
    .Name(Name)
    .Description(Description)
    .Rate(Rate)
    .MatchCriteria(MatchCriteria);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
