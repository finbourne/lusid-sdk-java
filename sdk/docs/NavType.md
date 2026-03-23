# com.finbourne.lusid.model.NavType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The Status of the Nav Type. Can be &#39;Active&#39; or &#39;Inactive&#39;. | [default to String]
**code** | **String** | The Code for the Nav Type. Must be unique within the Fund. | [optional] [default to String]
**displayName** | **String** | The Display Name for the Nav Type. Must be unique within the Fund. | [optional] [default to String]
**description** | **String** | The Description for the Nav Type. | [optional] [default to String]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**postingModuleCodes** | **List&lt;String&gt;** | The Posting Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**cleardownModuleCodes** | **List&lt;String&gt;** | The Cleardown Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**valuationRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**holdingRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**accountingMethod** | **String** | Determines the accounting treatment given to the simple position portfolio&#39;s tax lots. A non-default value is required. | [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the derived transaction portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. See https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information. | [optional] [default to List<String>]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. The available values are: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate | [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [default to String]
**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated, TransactionDate/SettlementDate. A non-default value is required. | [default to String]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**leaderNavTypeCode** | **String** | The code of the Nav Type that this Nav Type will follow when set. | [optional] [default to String]
**transactionTemplateScope** | **String** | The Transaction Template Scope used by the NavType. Will default to the scope set on the parent portfolio. If the fund has multiple parent portfolios, then the Transaction Template Scope must be provided. | [optional] [default to String]

```java
import com.finbourne.lusid.model.NavType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId ChartOfAccountsId = new ResourceId();
@jakarta.annotation.Nullable List<String> PostingModuleCodes = new List<String>();
@jakarta.annotation.Nullable List<String> CleardownModuleCodes = new List<String>();
ResourceId ValuationRecipeId = new ResourceId();
ResourceId HoldingRecipeId = new ResourceId();
String AccountingMethod = "example AccountingMethod";
@jakarta.annotation.Nullable List<String> SubHoldingKeys = new List<String>();
String AmortisationMethod = "example AmortisationMethod";
String TransactionTypeScope = "example TransactionTypeScope";
String CashGainLossCalculationDate = "example CashGainLossCalculationDate";
ResourceId AmortisationRuleSetId = new ResourceId();
@jakarta.annotation.Nullable String LeaderNavTypeCode = "example LeaderNavTypeCode";
@jakarta.annotation.Nullable String TransactionTemplateScope = "example TransactionTemplateScope";


NavType navTypeInstance = new NavType()
    .Status(Status)
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .ChartOfAccountsId(ChartOfAccountsId)
    .PostingModuleCodes(PostingModuleCodes)
    .CleardownModuleCodes(CleardownModuleCodes)
    .ValuationRecipeId(ValuationRecipeId)
    .HoldingRecipeId(HoldingRecipeId)
    .AccountingMethod(AccountingMethod)
    .SubHoldingKeys(SubHoldingKeys)
    .AmortisationMethod(AmortisationMethod)
    .TransactionTypeScope(TransactionTypeScope)
    .CashGainLossCalculationDate(CashGainLossCalculationDate)
    .AmortisationRuleSetId(AmortisationRuleSetId)
    .LeaderNavTypeCode(LeaderNavTypeCode)
    .TransactionTemplateScope(TransactionTemplateScope);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
