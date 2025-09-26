# com.finbourne.lusid.model.InstrumentEventInstructionRequest
The request to create an instruction for an instrument event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventInstructionId** | **String** | The unique identifier for this instruction | [default to String]
**instrumentEventId** | **String** | The identifier of the instrument event being instructed | [default to String]
**instructionType** | **String** | The type of instruction (Ignore, ElectForPortfolio, ElectForHolding) | [default to String]
**electionKey** | **String** | For elected instructions, the key to be chosen | [optional] [default to String]
**holdingId** | **Long** | For holding instructions, the id of the holding for which the instruction will apply | [optional] [default to Long]
**entitlementDateInstructed** | [**OffsetDateTime**](OffsetDateTime.md) | The instructed entitlement date for the event (where none is set on the event itself) | [optional] [default to OffsetDateTime]
**quantityInstructed** | [**QuantityInstructed**](QuantityInstructed.md) |  | [optional] [default to QuantityInstructed]

```java
import com.finbourne.lusid.model.InstrumentEventInstructionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentEventInstructionId = "example InstrumentEventInstructionId";
String InstrumentEventId = "example InstrumentEventId";
String InstructionType = "example InstructionType";
@jakarta.annotation.Nullable String ElectionKey = "example ElectionKey";
@jakarta.annotation.Nullable Long HoldingId = new Long("100.00");
@jakarta.annotation.Nullable OffsetDateTime EntitlementDateInstructed = OffsetDateTime.now();
QuantityInstructed QuantityInstructed = new QuantityInstructed();


InstrumentEventInstructionRequest instrumentEventInstructionRequestInstance = new InstrumentEventInstructionRequest()
    .InstrumentEventInstructionId(InstrumentEventInstructionId)
    .InstrumentEventId(InstrumentEventId)
    .InstructionType(InstructionType)
    .ElectionKey(ElectionKey)
    .HoldingId(HoldingId)
    .EntitlementDateInstructed(EntitlementDateInstructed)
    .QuantityInstructed(QuantityInstructed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
