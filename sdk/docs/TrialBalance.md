# com.finbourne.lusid.model.TrialBalance
A TrialBalance entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generalLedgerAccountCode** | **String** | The Account code that the trial balance results have been grouped against. | [default to String]
**description** | **String** | The description of the record. | [optional] [default to String]
**levels** | **List&lt;String&gt;** | The levels that have been derived from the specified General Ledger Profile. | [default to List<String>]
**accountType** | **String** | The account type attributed to the record. | [default to String]
**localCurrency** | **String** | The local currency for the amounts specified. Defaults to base currency if multiple different currencies present in the grouped line. | [default to String]
**opening** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  | [default to MultiCurrencyAmounts]
**closing** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  | [default to MultiCurrencyAmounts]
**debit** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  | [default to MultiCurrencyAmounts]
**credit** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  | [default to MultiCurrencyAmounts]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties found on the mapped &#39;Account&#39;, as specified in request. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TrialBalance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String GeneralLedgerAccountCode = "example GeneralLedgerAccountCode";
@jakarta.annotation.Nullable String Description = "example Description";
List<String> Levels = new List<String>();
String AccountType = "example AccountType";
String LocalCurrency = "example LocalCurrency";
MultiCurrencyAmounts Opening = new MultiCurrencyAmounts();
MultiCurrencyAmounts Closing = new MultiCurrencyAmounts();
MultiCurrencyAmounts Debit = new MultiCurrencyAmounts();
MultiCurrencyAmounts Credit = new MultiCurrencyAmounts();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TrialBalance trialBalanceInstance = new TrialBalance()
    .GeneralLedgerAccountCode(GeneralLedgerAccountCode)
    .Description(Description)
    .Levels(Levels)
    .AccountType(AccountType)
    .LocalCurrency(LocalCurrency)
    .Opening(Opening)
    .Closing(Closing)
    .Debit(Debit)
    .Credit(Credit)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
