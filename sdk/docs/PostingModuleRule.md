# com.finbourne.lusid.model.PostingModuleRule
A Posting rule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The identifier for the Posting Rule. | [default to String]
**generalLedgerAccountCode** | **String** | The general ledger account to post the Activity credit or debit to. | [default to String]
**ruleFilter** | **String** | The filter syntax for the Posting Rule. See https://support.lusid.com/knowledgebase/article/KA-02140 for more information on filter syntax. | [default to String]

```java
import com.finbourne.lusid.model.PostingModuleRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleId = "example RuleId";
String GeneralLedgerAccountCode = "example GeneralLedgerAccountCode";
String RuleFilter = "example RuleFilter";


PostingModuleRule postingModuleRuleInstance = new PostingModuleRule()
    .RuleId(RuleId)
    .GeneralLedgerAccountCode(GeneralLedgerAccountCode)
    .RuleFilter(RuleFilter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
