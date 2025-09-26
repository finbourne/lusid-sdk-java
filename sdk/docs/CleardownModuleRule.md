# com.finbourne.lusid.model.CleardownModuleRule
A Cleardown rule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The identifier for the Cleardown Rule. | [default to String]
**generalLedgerAccountCode** | **String** | The account to post the residual P&amp;L to. | [default to String]
**ruleFilter** | **String** | The filter syntax for the Cleardown Rule. See https://support.lusid.com/knowledgebase/article/KA-02140 for more information on filter syntax. | [default to String]

```java
import com.finbourne.lusid.model.CleardownModuleRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleId = "example RuleId";
String GeneralLedgerAccountCode = "example GeneralLedgerAccountCode";
String RuleFilter = "example RuleFilter";


CleardownModuleRule cleardownModuleRuleInstance = new CleardownModuleRule()
    .RuleId(RuleId)
    .GeneralLedgerAccountCode(GeneralLedgerAccountCode)
    .RuleFilter(RuleFilter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
