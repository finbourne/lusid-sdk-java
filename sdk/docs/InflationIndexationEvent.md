# com.finbourne.lusid.model.InflationIndexationEvent
The day-on-day change in the indexed face of an inflation-linked bond, as its inflation index ratio moves  from one day to the next. A memo event: downstream it books a transaction whose units carry the day's indexed-face  change (the principal uplift) and whose cash is zero; nothing moves.  Mandatory participation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The bond&#39;s domestic currency. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The calendar day on which the new index ratio applies. On an event LUSID generates it carries the bond&#39;s  local offset, so its date part is the bond&#39;s local calendar day; it is returned as generated and not  normalised to UTC. An upserted event may give it with any offset; it is normalised to UTC when stored. | [optional] [default to OffsetDateTime]
**indexRatioAfter** | **java.math.BigDecimal** | The bond&#39;s un-floored inflation index ratio on the event date. | [default to java.math.BigDecimal]
**indexRatioBefore** | **java.math.BigDecimal** | The bond&#39;s un-floored inflation index ratio on the day before the event date. | [default to java.math.BigDecimal]
**indexedFaceChangePerUnit** | **java.math.BigDecimal** | The day&#39;s change in indexed face per unit: the un-indexed face per unit multiplied by  (index ratio after minus index ratio before). | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.InflationIndexationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Currency = "example Currency";
OffsetDateTime EventDate = OffsetDateTime.now();
java.math.BigDecimal IndexRatioAfter = new java.math.BigDecimal("100.00");
java.math.BigDecimal IndexRatioBefore = new java.math.BigDecimal("100.00");
java.math.BigDecimal IndexedFaceChangePerUnit = new java.math.BigDecimal("100.00");


InflationIndexationEvent inflationIndexationEventInstance = new InflationIndexationEvent()
    .Currency(Currency)
    .EventDate(EventDate)
    .IndexRatioAfter(IndexRatioAfter)
    .IndexRatioBefore(IndexRatioBefore)
    .IndexedFaceChangePerUnit(IndexedFaceChangePerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
