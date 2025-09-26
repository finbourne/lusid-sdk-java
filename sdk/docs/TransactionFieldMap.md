# com.finbourne.lusid.model.TransactionFieldMap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** |  | [default to String]
**type** | **String** |  | [default to String]
**source** | **String** |  | [default to String]
**instrument** | **String** |  | [default to String]
**transactionDate** | **String** |  | [default to String]
**settlementDate** | **String** |  | [default to String]
**units** | **String** |  | [default to String]
**transactionPrice** | [**TransactionPriceAndType**](TransactionPriceAndType.md) |  | [optional] [default to TransactionPriceAndType]
**transactionCurrency** | **String** |  | [default to String]
**exchangeRate** | **String** |  | [optional] [default to String]
**totalConsideration** | [**TransactionCurrencyAndAmount**](TransactionCurrencyAndAmount.md) |  | [default to TransactionCurrencyAndAmount]

```java
import com.finbourne.lusid.model.TransactionFieldMap;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionId = "example TransactionId";
String Type = "example Type";
String Source = "example Source";
String Instrument = "example Instrument";
String TransactionDate = "example TransactionDate";
String SettlementDate = "example SettlementDate";
String Units = "example Units";
TransactionPriceAndType TransactionPrice = new TransactionPriceAndType();
String TransactionCurrency = "example TransactionCurrency";
@jakarta.annotation.Nullable String ExchangeRate = "example ExchangeRate";
TransactionCurrencyAndAmount TotalConsideration = new TransactionCurrencyAndAmount();


TransactionFieldMap transactionFieldMapInstance = new TransactionFieldMap()
    .TransactionId(TransactionId)
    .Type(Type)
    .Source(Source)
    .Instrument(Instrument)
    .TransactionDate(TransactionDate)
    .SettlementDate(SettlementDate)
    .Units(Units)
    .TransactionPrice(TransactionPrice)
    .TransactionCurrency(TransactionCurrency)
    .ExchangeRate(ExchangeRate)
    .TotalConsideration(TotalConsideration);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
