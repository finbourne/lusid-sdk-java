# com.finbourne.lusid.model.PariPassuEvent
Pari-Passu event (PARI) — a mandatory reorganisation in which two securities with  different characteristics become fungible and are merged into a single class on the  assimilation payment date. Holders of record on the record date have their positions  converted automatically to the new ISIN at a fixed 1:1 ratio with cost basis preserved.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date — the eligibility cutoff. Holders of record on this date enter the  assimilation. Required per AMI-SeCo Annex 2 (Record Date Required &#x3D; Yes for PARI). | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date — the date the assimilation fires and the paired StockMovement  transactions land. Required per AMI-SeCo § 4.42 Table 108 Key Date. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]

```java
import com.finbourne.lusid.model.PariPassuEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
NewInstrument NewInstrument = new NewInstrument();
UnitsRatio UnitsRatio = new UnitsRatio();


PariPassuEvent pariPassuEventInstance = new PariPassuEvent()
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .NewInstrument(NewInstrument)
    .UnitsRatio(UnitsRatio);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
