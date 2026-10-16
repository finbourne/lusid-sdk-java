# com.finbourne.lusid.model.PostingModuleRule
A Posting rule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The identifier for the Posting Rule. | [default to String]
**generalLedgerAccountCode** | **String** | The general ledger account to post the Activity credit or debit to. | [default to String]
**ruleFilter** | **String** | The filter syntax for the Posting Rule. See https://support.lusid.com/docs/assigning-economic-activity-to-general-ledger-accounts-using-posting-rules for more information on filter syntax. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The inclusive accounting date from which the Posting Rule applies. If not set, the rule applies from the beginning of time. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive accounting date until which the Posting Rule applies. If not set, the rule applies until the end of time. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.PostingModuleRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleId = "example RuleId";
String GeneralLedgerAccountCode = "example GeneralLedgerAccountCode";
String RuleFilter = "example RuleFilter";
@jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveUntil = OffsetDateTime.now();


PostingModuleRule postingModuleRuleInstance = new PostingModuleRule()
    .RuleId(RuleId)
    .GeneralLedgerAccountCode(GeneralLedgerAccountCode)
    .RuleFilter(RuleFilter)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
