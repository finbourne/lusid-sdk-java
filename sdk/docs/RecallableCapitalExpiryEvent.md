# com.finbourne.lusid.model.RecallableCapitalExpiryEvent
The lapse of a recallable portion of an earlier distribution on a CapitalInterest: the amount leaves  RecallableCapital and joins NonRecallableCapital. Raised when the recall window of the source  distribution closes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the recall window closes. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The recallable amount that lapses, in the commitment currency. Must be positive. | [default to java.math.BigDecimal]
**sourceDistributionEventId** | **String** | The identifier of the distribution event whose recallable portion lapses. | [default to String]

```java
import com.finbourne.lusid.model.RecallableCapitalExpiryEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String SourceDistributionEventId = "example SourceDistributionEventId";


RecallableCapitalExpiryEvent recallableCapitalExpiryEventInstance = new RecallableCapitalExpiryEvent()
    .Date(Date)
    .Amount(Amount)
    .SourceDistributionEventId(SourceDistributionEventId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
