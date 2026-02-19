# com.finbourne.lusid.model.NavTypeDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**postingModuleCodes** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**cleardownModuleCodes** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**valuationRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**holdingRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**accountingMethod** | **String** |  | [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | Set of unique holding identifiers, e.g. trader, desk, strategy. | [optional] [default to List<String>]
**amortisationMethod** | **String** |  | [default to String]
**transactionTypeScope** | **String** |  | [default to String]
**cashGainLossCalculationDate** | **String** |  | [default to String]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**leaderNavTypeCode** | **String** |  | [optional] [default to String]
**transactionTemplateScope** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.NavTypeDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

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


NavTypeDefinition navTypeDefinitionInstance = new NavTypeDefinition()
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
