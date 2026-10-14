# com.finbourne.lusid.model.ManagementFeeRequest
The request to calculate a period's management fee for the partners of a partnership fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the fee period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the fee period, inclusive. | [default to OffsetDateTime]
**basis** | **String** | The capital base the fee is charged on. Available values: Auto, CommittedCapital, InvestedCapital. Auto charges on committed capital until the investment period ends and on invested capital after. | [optional] [default to String]
**offsets** | [**List&lt;ManagementFeeOffset&gt;**](ManagementFeeOffset.md) | Fee income received by the manager that offsets the management fee. | [optional] [default to List<ManagementFeeOffset>]
**book** | **Boolean** | When true, the net fee per partner is booked. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ManagementFeeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime PeriodEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable String Basis = "example Basis";
@jakarta.annotation.Nullable List<ManagementFeeOffset> Offsets = new List<ManagementFeeOffset>();
Boolean Book = true;


ManagementFeeRequest managementFeeRequestInstance = new ManagementFeeRequest()
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .Basis(Basis)
    .Offsets(Offsets)
    .Book(Book);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
