# com.finbourne.lusid.model.SupersedePostingModuleRuleRequest
The next version of a Posting Rule, which takes over from its latest version on an accounting date

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The identifier of the Posting Rule. At most one rule in the request may have the ruleId of the superseded rule. If it does, the existing rule is capped so that it stops applying from this rule&#39;s EffectiveFrom, and this rule is created as its next version. Otherwise this rule is created as a new rule. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The inclusive accounting date from which this rule applies. If this rule has the ruleId of the superseded rule, the superseded rule&#39;s latest version stops applying from this date, unless it already ends by then; it is never extended. | [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive accounting date until which this rule applies. If not set, it applies until the end of time. | [optional] [default to OffsetDateTime]
**generalLedgerAccountCode** | **String** | The general ledger account this rule posts the Activity credit or debit to. | [default to String]
**ruleFilter** | **String** | The filter syntax for this rule. See https://support.lusid.com/docs/assigning-economic-activity-to-general-ledger-accounts-using-posting-rules for more information on filter syntax. | [default to String]

```java
import com.finbourne.lusid.model.SupersedePostingModuleRuleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleId = "example RuleId";
OffsetDateTime EffectiveFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveUntil = OffsetDateTime.now();
String GeneralLedgerAccountCode = "example GeneralLedgerAccountCode";
String RuleFilter = "example RuleFilter";


SupersedePostingModuleRuleRequest supersedePostingModuleRuleRequestInstance = new SupersedePostingModuleRuleRequest()
    .RuleId(RuleId)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil)
    .GeneralLedgerAccountCode(GeneralLedgerAccountCode)
    .RuleFilter(RuleFilter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
