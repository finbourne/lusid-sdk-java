# com.finbourne.lusid.model.CancelSwapEvent
A cancel opportunity on a cancellable InterestRateSwap, generated once per date in the swap's cancel  schedule. The holder submits the SubscribeElection by the NoticeDueDate to cancel  the swap, and the opportunity lapses if no election is made. When the swap is cancelled, the current  period's coupon still settles and the position then closes at zero cost and proceeds.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the swap terminates if cancellation is elected. Always a date from the swap&#39;s cancel  schedule. | [optional] [default to OffsetDateTime]
**noticeDueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date by which the election must be made, else the cancel opportunity lapses. Derived from the  CancelDate and the swap&#39;s notice convention. Must be &lt;&#x3D; CancelDate. | [optional] [default to OffsetDateTime]
**subscribeElections** | [**List&lt;SubscribeElection&gt;**](SubscribeElection.md) | The elections available on this cancel opportunity: exactly one SubscribeElection, keyed &#39;Cancel&#39;.  A chosen election cancels the swap. No chosen election means the opportunity lapsed and the swap  continues unchanged. | [optional] [default to List<SubscribeElection>]

```java
import com.finbourne.lusid.model.CancelSwapEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime CancelDate = OffsetDateTime.now();
OffsetDateTime NoticeDueDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<SubscribeElection> SubscribeElections = new List<SubscribeElection>();


CancelSwapEvent cancelSwapEventInstance = new CancelSwapEvent()
    .CancelDate(CancelDate)
    .NoticeDueDate(NoticeDueDate)
    .SubscribeElections(SubscribeElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
