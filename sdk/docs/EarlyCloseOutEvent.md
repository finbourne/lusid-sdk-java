# com.finbourne.lusid.model.EarlyCloseOutEvent
Early close out event - Ending an OTC instrument early.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closeOutAmount** | **java.math.BigDecimal** | The amount to be closed out early. Required. Must be strictly positive. | [default to java.math.BigDecimal]
**closeOutCcy** | **String** | The currency corresponding to the amount to be closed out early. Required. | [default to String]
**closeOutToOtherRate** | **java.math.BigDecimal** | The rate between close out amount and other amount. Optional. If provided, must be strictly positive. | [optional] [default to java.math.BigDecimal]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the event. | [optional] [default to OffsetDateTime]
**otherAmount** | **java.math.BigDecimal** | The other amount to be closed out early. Optional. If provided, must be strictly positive. | [optional] [default to java.math.BigDecimal]
**otherCcy** | **String** | The currency corresponding to the other amount to be closed out early. Optional. | [optional] [default to String]
**otherToCloseOutRate** | **java.math.BigDecimal** | The rate between other amount and close out amount. Optional. If provided, must be strictly positive. | [optional] [default to java.math.BigDecimal]
**settlementCcy** | **String** | The settlement currency. Required. | [default to String]

```java
import com.finbourne.lusid.model.EarlyCloseOutEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal CloseOutAmount = new java.math.BigDecimal("100.00");
String CloseOutCcy = "example CloseOutCcy";
@jakarta.annotation.Nullable java.math.BigDecimal CloseOutToOtherRate = new java.math.BigDecimal("100.00");
OffsetDateTime EffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal OtherAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String OtherCcy = "example OtherCcy";
@jakarta.annotation.Nullable java.math.BigDecimal OtherToCloseOutRate = new java.math.BigDecimal("100.00");
String SettlementCcy = "example SettlementCcy";


EarlyCloseOutEvent earlyCloseOutEventInstance = new EarlyCloseOutEvent()
    .CloseOutAmount(CloseOutAmount)
    .CloseOutCcy(CloseOutCcy)
    .CloseOutToOtherRate(CloseOutToOtherRate)
    .EffectiveDate(EffectiveDate)
    .OtherAmount(OtherAmount)
    .OtherCcy(OtherCcy)
    .OtherToCloseOutRate(OtherToCloseOutRate)
    .SettlementCcy(SettlementCcy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
