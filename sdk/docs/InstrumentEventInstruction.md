# com.finbourne.lusid.model.InstrumentEventInstruction
An instruction for an instrument event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventInstructionId** | **String** | The unique identifier for this instruction | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentEventId** | **String** | The identifier of the instrument event being instructed | [optional] [default to String]
**instructionType** | **String** | The type of instruction (Ignore, ElectForPortfolio, ElectForHolding) | [optional] [default to String]
**electionKey** | **String** | For elected instructions, the key to be chosen | [optional] [default to String]
**holdingId** | **Long** | For holding instructions, the id of the holding for which the instruction will apply | [optional] [default to Long]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The uri for this version of this instruction | [optional] [default to URI]
**entitlementDateInstructed** | [**OffsetDateTime**](OffsetDateTime.md) | The instructed entitlement date for the event (where none is set on the event itself) | [optional] [default to OffsetDateTime]
**quantityInstructed** | [**QuantityInstructed**](QuantityInstructed.md) |  | [optional] [default to QuantityInstructed]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.InstrumentEventInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InstrumentEventInstructionId = "example InstrumentEventInstructionId";
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String InstrumentEventId = "example InstrumentEventId";
@jakarta.annotation.Nullable String InstructionType = "example InstructionType";
@jakarta.annotation.Nullable String ElectionKey = "example ElectionKey";
@jakarta.annotation.Nullable Long HoldingId = new Long("100.00");
Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable OffsetDateTime EntitlementDateInstructed = OffsetDateTime.now();
QuantityInstructed QuantityInstructed = new QuantityInstructed();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


InstrumentEventInstruction instrumentEventInstructionInstance = new InstrumentEventInstruction()
    .InstrumentEventInstructionId(InstrumentEventInstructionId)
    .PortfolioId(PortfolioId)
    .InstrumentEventId(InstrumentEventId)
    .InstructionType(InstructionType)
    .ElectionKey(ElectionKey)
    .HoldingId(HoldingId)
    .Version(Version)
    .Href(Href)
    .EntitlementDateInstructed(EntitlementDateInstructed)
    .QuantityInstructed(QuantityInstructed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
