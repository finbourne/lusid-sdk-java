# com.finbourne.lusid.model.FeeRuleUpsertRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [optional] [default to String]
**transactionPropertyKey** | **String** |  | [default to String]
**transactionType** | **String** |  | [default to String]
**country** | **String** |  | [default to String]
**counterparty** | **String** |  | [default to String]
**transactionCurrency** | **String** |  | [default to String]
**settlementCurrency** | **String** |  | [default to String]
**executionBroker** | **String** |  | [default to String]
**custodian** | **String** |  | [default to String]
**exchange** | **String** |  | [default to String]
**fee** | [**CalculationInfo**](CalculationInfo.md) |  | [default to CalculationInfo]
**minFee** | [**CalculationInfo**](CalculationInfo.md) |  | [optional] [default to CalculationInfo]
**maxFee** | [**CalculationInfo**](CalculationInfo.md) |  | [optional] [default to CalculationInfo]
**additionalKeys** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.FeeRuleUpsertRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Code = "example Code";
String TransactionPropertyKey = "example TransactionPropertyKey";
String TransactionType = "example TransactionType";
String Country = "example Country";
String Counterparty = "example Counterparty";
String TransactionCurrency = "example TransactionCurrency";
String SettlementCurrency = "example SettlementCurrency";
String ExecutionBroker = "example ExecutionBroker";
String Custodian = "example Custodian";
String Exchange = "example Exchange";
CalculationInfo Fee = new CalculationInfo();
CalculationInfo MinFee = new CalculationInfo();
CalculationInfo MaxFee = new CalculationInfo();
@jakarta.annotation.Nullable Map<String, String> AdditionalKeys = new Map<String, String>();
@jakarta.annotation.Nullable String Description = "example Description";


FeeRuleUpsertRequest feeRuleUpsertRequestInstance = new FeeRuleUpsertRequest()
    .Code(Code)
    .TransactionPropertyKey(TransactionPropertyKey)
    .TransactionType(TransactionType)
    .Country(Country)
    .Counterparty(Counterparty)
    .TransactionCurrency(TransactionCurrency)
    .SettlementCurrency(SettlementCurrency)
    .ExecutionBroker(ExecutionBroker)
    .Custodian(Custodian)
    .Exchange(Exchange)
    .Fee(Fee)
    .MinFee(MinFee)
    .MaxFee(MaxFee)
    .AdditionalKeys(AdditionalKeys)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
