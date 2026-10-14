# com.finbourne.lusid.model.PartnershipConfigPack
The partnership configuration pack a fund resolves to: the transaction types, chart of accounts and posting rules  the partners' ledger is booked under.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the configuration pack. | [default to String]
**code** | **String** | The code of the configuration pack. | [default to String]
**version** | **String** | The version of the configuration pack. | [default to String]
**transactionTypes** | [**List&lt;PackTransactionType&gt;**](PackTransactionType.md) | The partnership transaction types the pack provides. | [default to List<PackTransactionType>]
**chartOfAccounts** | [**List&lt;PackAccount&gt;**](PackAccount.md) | The accounts the pack posts partner capital to. | [default to List<PackAccount>]
**postingRules** | [**List&lt;PackPostingRule&gt;**](PackPostingRule.md) | The rules that move each transaction type between its accounts. | [default to List<PackPostingRule>]
**generalLedgerProfileCode** | **String** | The code of the general ledger profile the pack&#39;s posting rules belong to. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PartnershipConfigPack;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String Version = "example Version";
List<PackTransactionType> TransactionTypes = new List<PackTransactionType>();
List<PackAccount> ChartOfAccounts = new List<PackAccount>();
List<PackPostingRule> PostingRules = new List<PackPostingRule>();
@jakarta.annotation.Nullable String GeneralLedgerProfileCode = "example GeneralLedgerProfileCode";


PartnershipConfigPack partnershipConfigPackInstance = new PartnershipConfigPack()
    .Scope(Scope)
    .Code(Code)
    .Version(Version)
    .TransactionTypes(TransactionTypes)
    .ChartOfAccounts(ChartOfAccounts)
    .PostingRules(PostingRules)
    .GeneralLedgerProfileCode(GeneralLedgerProfileCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
