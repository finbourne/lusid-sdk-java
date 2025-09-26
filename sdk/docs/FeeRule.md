# com.finbourne.lusid.model.FeeRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
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
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FeeRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
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
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FeeRule feeRuleInstance = new FeeRule()
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
    .Description(Description)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
