# com.finbourne.lusid.model.PackPostingRule
A posting rule on a partnership configuration pack.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The posting rule identifier. | [default to String]
**transactionType** | **String** | The transaction type. | [default to String]
**debitAccount** | **String** | The account debited. | [default to String]
**creditAccount** | **String** | The account credited. | [default to String]

```java
import com.finbourne.lusid.model.PackPostingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleId = "example RuleId";
String TransactionType = "example TransactionType";
String DebitAccount = "example DebitAccount";
String CreditAccount = "example CreditAccount";


PackPostingRule packPostingRuleInstance = new PackPostingRule()
    .RuleId(RuleId)
    .TransactionType(TransactionType)
    .DebitAccount(DebitAccount)
    .CreditAccount(CreditAccount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
