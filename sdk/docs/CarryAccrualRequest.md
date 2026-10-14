# com.finbourne.lusid.model.CarryAccrualRequest
The request to accrue carried interest on a partnership fund from amounts a waterfall has produced.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The date carry is accrued to. | [default to OffsetDateTime]
**source** | **String** | The waterfall or model the carry amounts came from. | [default to String]
**amounts** | [**List&lt;CarryAccrualAmount&gt;**](CarryAccrualAmount.md) | The carry each partner has earned to the period end, as the source states it. | [default to List<CarryAccrualAmount>]
**book** | **Boolean** | When true, the accrual deltas are booked. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.CarryAccrualRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PeriodEnd = OffsetDateTime.now();
String Source = "example Source";
List<CarryAccrualAmount> Amounts = new List<CarryAccrualAmount>();
Boolean Book = true;


CarryAccrualRequest carryAccrualRequestInstance = new CarryAccrualRequest()
    .PeriodEnd(PeriodEnd)
    .Source(Source)
    .Amounts(Amounts)
    .Book(Book);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
