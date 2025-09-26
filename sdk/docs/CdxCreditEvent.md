# com.finbourne.lusid.model.CdxCreditEvent
Definition of a credit event for credit default swap index (CDX) instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the credit default - i.e. date on which the debt issuer defaulted on its repayment obligation. | [optional] [default to OffsetDateTime]
**auctionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the credit event auction - i.e. date on which the defaulted debt is sold via auction, and a recovery rate determined. | [optional] [default to OffsetDateTime]
**recoveryRate** | **java.math.BigDecimal** | The fraction of the defaulted debt that can be recovered. | [optional] [default to java.math.BigDecimal]
**constituentWeight** | **java.math.BigDecimal** | The relative weight of the CDX constituent. | [default to java.math.BigDecimal]
**constituentReference** | **String** | Reference value used to identify the CDX constituent. | [optional] [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the credit event auction settlement. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CdxCreditEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AuctionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal RecoveryRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal ConstituentWeight = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ConstituentReference = "example ConstituentReference";
@jakarta.annotation.Nullable OffsetDateTime PaymentDate = OffsetDateTime.now();


CdxCreditEvent cdxCreditEventInstance = new CdxCreditEvent()
    .EffectiveDate(EffectiveDate)
    .AuctionDate(AuctionDate)
    .RecoveryRate(RecoveryRate)
    .ConstituentWeight(ConstituentWeight)
    .ConstituentReference(ConstituentReference)
    .PaymentDate(PaymentDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
