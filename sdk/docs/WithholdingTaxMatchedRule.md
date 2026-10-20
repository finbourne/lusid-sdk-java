# com.finbourne.lusid.model.WithholdingTaxMatchedRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchedRuleId** | **String** | The identifier booking stamps for the matched row: its series identifiers and effective date. | [default to String]
**matchedDataset** | **String** | The dataset the matched row came from: Main or Anomaly. | [default to String]
**ruleSource** | **String** | The rule source of the matched row. Null when the row has none. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the matched row version. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.WithholdingTaxMatchedRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MatchedRuleId = "example MatchedRuleId";
String MatchedDataset = "example MatchedDataset";
@jakarta.annotation.Nullable String RuleSource = "example RuleSource";
OffsetDateTime EffectiveAt = OffsetDateTime.now();


WithholdingTaxMatchedRule withholdingTaxMatchedRuleInstance = new WithholdingTaxMatchedRule()
    .MatchedRuleId(MatchedRuleId)
    .MatchedDataset(MatchedDataset)
    .RuleSource(RuleSource)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
