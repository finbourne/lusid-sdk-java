# com.finbourne.lusid.model.ApplicableInstrumentEvent
Represents applicable instrument event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**holdingId** | **Long** |  | [default to Long]
**lusidInstrumentId** | **String** |  | [default to String]
**instrumentScope** | **String** |  | [default to String]
**instrumentType** | **String** |  | [default to String]
**instrumentEventType** | **String** |  | [default to String]
**instrumentEventId** | **String** |  | [default to String]
**generatedEvent** | [**InstrumentEventHolder**](InstrumentEventHolder.md) |  | [optional] [default to InstrumentEventHolder]
**generatedEventDiagnostics** | [**GeneratedEventDiagnostics**](GeneratedEventDiagnostics.md) |  | [optional] [default to GeneratedEventDiagnostics]
**loadedEvent** | [**InstrumentEventHolder**](InstrumentEventHolder.md) |  | [optional] [default to InstrumentEventHolder]
**appliedInstrumentEventInstructionId** | **String** |  | [optional] [default to String]
**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) |  | [optional] [default to List<Transaction>]
**transactionDiagnostics** | [**TransactionDiagnostics**](TransactionDiagnostics.md) |  | [optional] [default to TransactionDiagnostics]

```java
import com.finbourne.lusid.model.ApplicableInstrumentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
Long HoldingId = new Long("100.00");
String LusidInstrumentId = "example LusidInstrumentId";
String InstrumentScope = "example InstrumentScope";
String InstrumentType = "example InstrumentType";
String InstrumentEventType = "example InstrumentEventType";
String InstrumentEventId = "example InstrumentEventId";
InstrumentEventHolder GeneratedEvent = new InstrumentEventHolder();
GeneratedEventDiagnostics GeneratedEventDiagnostics = new GeneratedEventDiagnostics();
InstrumentEventHolder LoadedEvent = new InstrumentEventHolder();
@jakarta.annotation.Nullable String AppliedInstrumentEventInstructionId = "example AppliedInstrumentEventInstructionId";
@jakarta.annotation.Nullable List<Transaction> Transactions = new List<Transaction>();
TransactionDiagnostics TransactionDiagnostics = new TransactionDiagnostics();


ApplicableInstrumentEvent applicableInstrumentEventInstance = new ApplicableInstrumentEvent()
    .PortfolioId(PortfolioId)
    .HoldingId(HoldingId)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .InstrumentType(InstrumentType)
    .InstrumentEventType(InstrumentEventType)
    .InstrumentEventId(InstrumentEventId)
    .GeneratedEvent(GeneratedEvent)
    .GeneratedEventDiagnostics(GeneratedEventDiagnostics)
    .LoadedEvent(LoadedEvent)
    .AppliedInstrumentEventInstructionId(AppliedInstrumentEventInstructionId)
    .Transactions(Transactions)
    .TransactionDiagnostics(TransactionDiagnostics);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
