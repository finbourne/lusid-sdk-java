# com.finbourne.lusid.model.AllocationEventNotice
A capital call or distribution notice for one partner on an allocation event: the lines allocated to the  partner, the net amount due, the partner's unfunded commitment rolled through the event, cumulative balances  for the partner and the general partner, and a DRAFT watermark while the event is not yet booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fund** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**event** | [**AllocationEventNoticeEvent**](AllocationEventNoticeEvent.md) |  | [default to AllocationEventNoticeEvent]
**partner** | [**AllocationEventNoticePartner**](AllocationEventNoticePartner.md) |  | [default to AllocationEventNoticePartner]
**currency** | **String** | The currency the notice amounts are expressed in. | [default to String]
**lines** | [**List&lt;AllocationEventNoticeLine&gt;**](AllocationEventNoticeLine.md) | The notice lines, one per component of the partner&#39;s allocation. | [default to List<AllocationEventNoticeLine>]
**netAmountDue** | **java.math.BigDecimal** | The net amount due, positive when the partner pays the fund and negative when the fund pays the partner. | [default to java.math.BigDecimal]
**unfundedReconciliation** | [**AllocationEventNoticeUnfundedReconciliation**](AllocationEventNoticeUnfundedReconciliation.md) |  | [default to AllocationEventNoticeUnfundedReconciliation]
**cumulative** | [**AllocationEventNoticeCumulative**](AllocationEventNoticeCumulative.md) |  | [default to AllocationEventNoticeCumulative]
**gpColumn** | [**AllocationEventNoticeCumulative**](AllocationEventNoticeCumulative.md) |  | [optional] [default to AllocationEventNoticeCumulative]
**wire** | [**AllocationEventNoticeWire**](AllocationEventNoticeWire.md) |  | [optional] [default to AllocationEventNoticeWire]
**paymentHold** | [**AllocationPaymentHold**](AllocationPaymentHold.md) |  | [optional] [default to AllocationPaymentHold]
**watermark** | **String** | DRAFT until the allocation event is booked, otherwise null. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventNotice;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Fund = new ResourceId();
AllocationEventNoticeEvent Event = new AllocationEventNoticeEvent();
AllocationEventNoticePartner Partner = new AllocationEventNoticePartner();
String Currency = "example Currency";
List<AllocationEventNoticeLine> Lines = new List<AllocationEventNoticeLine>();
java.math.BigDecimal NetAmountDue = new java.math.BigDecimal("100.00");
AllocationEventNoticeUnfundedReconciliation UnfundedReconciliation = new AllocationEventNoticeUnfundedReconciliation();
AllocationEventNoticeCumulative Cumulative = new AllocationEventNoticeCumulative();
AllocationEventNoticeCumulative GpColumn = new AllocationEventNoticeCumulative();
AllocationEventNoticeWire Wire = new AllocationEventNoticeWire();
AllocationPaymentHold PaymentHold = new AllocationPaymentHold();
@jakarta.annotation.Nullable String Watermark = "example Watermark";


AllocationEventNotice allocationEventNoticeInstance = new AllocationEventNotice()
    .Fund(Fund)
    .Event(Event)
    .Partner(Partner)
    .Currency(Currency)
    .Lines(Lines)
    .NetAmountDue(NetAmountDue)
    .UnfundedReconciliation(UnfundedReconciliation)
    .Cumulative(Cumulative)
    .GpColumn(GpColumn)
    .Wire(Wire)
    .PaymentHold(PaymentHold)
    .Watermark(Watermark);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
