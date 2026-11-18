# com.finbourne.lusid.model.CorrectPostingModuleRuleVersionRequest
The corrected content of one version of a Posting Rule. The version keeps its rule identifier and version number.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generalLedgerAccountCode** | **String** | The general ledger account this version of the rule posts the Activity credit or debit to. | [default to String]
**ruleFilter** | **String** | The filter syntax for this version of the rule. See https://support.lusid.com/docs/assigning-economic-activity-to-general-ledger-accounts-using-posting-rules for more information on filter syntax. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The inclusive accounting date from which this version of the rule applies. If not set, it applies from the beginning of time. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive accounting date until which this version of the rule applies. If not set, it applies until the end of time. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CorrectPostingModuleRuleVersionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String GeneralLedgerAccountCode = "example GeneralLedgerAccountCode";
String RuleFilter = "example RuleFilter";
@jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveUntil = OffsetDateTime.now();


CorrectPostingModuleRuleVersionRequest correctPostingModuleRuleVersionRequestInstance = new CorrectPostingModuleRuleVersionRequest()
    .GeneralLedgerAccountCode(GeneralLedgerAccountCode)
    .RuleFilter(RuleFilter)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
