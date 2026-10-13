# com.finbourne.lusid.model.FeeStepDown

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trigger** | **String** | Available values: EndOfInvestmentPeriod, Date, Closing. | [default to String]
**stepDownDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**closingId** | **String** |  | [optional] [default to String]
**rate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**basis** | **String** | Available values: CommittedCapital, InvestedCapital, NetInvestedCapital, Nav. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FeeStepDown;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Trigger = "example Trigger";
@jakarta.annotation.Nullable OffsetDateTime StepDownDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String ClosingId = "example ClosingId";
@jakarta.annotation.Nullable java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Basis = "example Basis";


FeeStepDown feeStepDownInstance = new FeeStepDown()
    .Trigger(Trigger)
    .StepDownDate(StepDownDate)
    .ClosingId(ClosingId)
    .Rate(Rate)
    .Basis(Basis);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
