# com.finbourne.lusid.model.ChangeEvent
Change event (CHAN) — a reorganisation in which an instrument's certificates, name, or  terms are changed. Holders of record on the record date have their positions converted  automatically to the new instrument at a fixed 1:1 ratio on the payment date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date — the eligibility cutoff. Holders of record on this date enter the  change. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date — the date the change fires and the paired StockMovement  transactions land. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**changeType** | **String** | The nature of the change — one of \&quot;Certificates\&quot;, \&quot;Name\&quot;, or \&quot;Terms\&quot;. Available values: Certificates, Name, Terms. | [default to String]
**termTarget** | **String** | The target of a terms change — one of \&quot;InstrumentDefinitionField\&quot; or  \&quot;InstrumentProperty\&quot;. Only applicable when ChangeType is \&quot;Terms\&quot;. Available values: InstrumentDefinitionField, InstrumentProperty. | [optional] [default to String]
**termTargetIdentifier** | **String** | The identifier of the term target being changed. Must be paired with TermTarget. | [optional] [default to String]
**additionalInformation** | **String** | Free-text additional information describing the change. | [optional] [default to String]
**carryRelationships** | **String** | Whether, and in which direction, the old instrument&#39;s Relationships are carried onto the new  instrument. One of \&quot;None\&quot;, \&quot;Outward\&quot; or \&quot;Both\&quot;; defaults to \&quot;Outward\&quot; when omitted.     Relationships resolve to the instrument entity, so nothing pointing at the old instrument  applies to the new one. This is a caller choice because relationship meaning is client-authored:  an index-to-constituent link should usually follow a rename, a historical order-to-instrument  link should not. Available values: None, Outward, Both. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ChangeEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
NewInstrument NewInstrument = new NewInstrument();
UnitsRatio UnitsRatio = new UnitsRatio();
String ChangeType = "example ChangeType";
@jakarta.annotation.Nullable String TermTarget = "example TermTarget";
@jakarta.annotation.Nullable String TermTargetIdentifier = "example TermTargetIdentifier";
@jakarta.annotation.Nullable String AdditionalInformation = "example AdditionalInformation";
@jakarta.annotation.Nullable String CarryRelationships = "example CarryRelationships";


ChangeEvent changeEventInstance = new ChangeEvent()
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .NewInstrument(NewInstrument)
    .UnitsRatio(UnitsRatio)
    .ChangeType(ChangeType)
    .TermTarget(TermTarget)
    .TermTargetIdentifier(TermTargetIdentifier)
    .AdditionalInformation(AdditionalInformation)
    .CarryRelationships(CarryRelationships);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
