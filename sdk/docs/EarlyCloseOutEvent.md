# com.finbourne.lusid.model.EarlyCloseOutEvent
Early close out event - Ending an OTC instrument early.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closeOutAmount** | **java.math.BigDecimal** | The amount to be closed out early. Required. Must be strictly positive. | [default to java.math.BigDecimal]
**closeOutCcy** | **String** | The currency corresponding to the amount to be closed out early. Required. | [default to String]
**closeOutToOtherRate** | **java.math.BigDecimal** | The rate between close out amount and other amount. Optional. If provided, must be strictly positive. | [optional] [default to java.math.BigDecimal]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the event. | [optional] [default to OffsetDateTime]
**closeOutTolerance** | **java.math.BigDecimal** | Tolerance for inferring a full close-out. Optional. When set, and the recomputed close-out quantity is  within this tolerance of the holding&#39;s units, the full holding is closed out so the holding nets to zero;  otherwise the recomputed quantity is used. When absent, the recomputed quantity is always used, which may  leave a residual holding.  For example, if the tolerance is set to 0.01 and the calculated value returns 99.99 against a true  sub-holding of 100, the full holding will be closed out and no residual will be produced. | [optional] [default to java.math.BigDecimal]
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
@jakarta.annotation.Nullable java.math.BigDecimal CloseOutTolerance = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OtherAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String OtherCcy = "example OtherCcy";
@jakarta.annotation.Nullable java.math.BigDecimal OtherToCloseOutRate = new java.math.BigDecimal("100.00");
String SettlementCcy = "example SettlementCcy";


EarlyCloseOutEvent earlyCloseOutEventInstance = new EarlyCloseOutEvent()
    .CloseOutAmount(CloseOutAmount)
    .CloseOutCcy(CloseOutCcy)
    .CloseOutToOtherRate(CloseOutToOtherRate)
    .EffectiveDate(EffectiveDate)
    .CloseOutTolerance(CloseOutTolerance)
    .OtherAmount(OtherAmount)
    .OtherCcy(OtherCcy)
    .OtherToCloseOutRate(OtherToCloseOutRate)
    .SettlementCcy(SettlementCcy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
