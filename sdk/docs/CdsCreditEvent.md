# com.finbourne.lusid.model.CdsCreditEvent
Definition of a credit event for credit default swap (CDS) instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the credit default - i.e. date on which the debt issuer defaulted on its repayment obligation. | [optional] [default to OffsetDateTime]
**auctionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the credit event auction - i.e. date on which the defaulted debt is sold via auction, and a recovery rate determined. | [optional] [default to OffsetDateTime]
**recoveryRate** | **java.math.BigDecimal** | The fraction of the defaulted debt that can be recovered. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CdsCreditEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AuctionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal RecoveryRate = new java.math.BigDecimal("100.00");


CdsCreditEvent cdsCreditEventInstance = new CdsCreditEvent()
    .EffectiveDate(EffectiveDate)
    .AuctionDate(AuctionDate)
    .RecoveryRate(RecoveryRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
