# com.finbourne.lusid.model.CalculateOrderDatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifierType** | **String** |  | [default to String]
**instrumentIdentifier** | **String** |  | [default to String]
**instrumentScope** | **String** |  | [optional] [default to String]
**receivedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**priceDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**transactionCategory** | **String** |  | [optional] [default to String]
**liquidatingShareClassIdentifier** | **String** |  | [optional] [default to String]
**liquidatingShareClassIdentifierType** | **String** |  | [optional] [default to String]
**liquidatingShareClassInstrumentScope** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.CalculateOrderDatesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentIdentifierType = "example InstrumentIdentifierType";
String InstrumentIdentifier = "example InstrumentIdentifier";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable OffsetDateTime ReceivedDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PriceDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String TransactionCategory = "example TransactionCategory";
@jakarta.annotation.Nullable String LiquidatingShareClassIdentifier = "example LiquidatingShareClassIdentifier";
@jakarta.annotation.Nullable String LiquidatingShareClassIdentifierType = "example LiquidatingShareClassIdentifierType";
@jakarta.annotation.Nullable String LiquidatingShareClassInstrumentScope = "example LiquidatingShareClassInstrumentScope";


CalculateOrderDatesRequest calculateOrderDatesRequestInstance = new CalculateOrderDatesRequest()
    .InstrumentIdentifierType(InstrumentIdentifierType)
    .InstrumentIdentifier(InstrumentIdentifier)
    .InstrumentScope(InstrumentScope)
    .ReceivedDate(ReceivedDate)
    .PriceDate(PriceDate)
    .TransactionCategory(TransactionCategory)
    .LiquidatingShareClassIdentifier(LiquidatingShareClassIdentifier)
    .LiquidatingShareClassIdentifierType(LiquidatingShareClassIdentifierType)
    .LiquidatingShareClassInstrumentScope(LiquidatingShareClassInstrumentScope);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
