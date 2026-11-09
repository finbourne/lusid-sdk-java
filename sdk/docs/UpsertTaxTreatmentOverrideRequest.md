# com.finbourne.lusid.model.UpsertTaxTreatmentOverrideRequest
Pins an instrument to a treatment leaf in place of the system-derived one.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**treatment** | **String** | The treatment leaf to pin the instrument to, replacing the system-derived one. Available values: OutsideBlagab, LoanRelationship, IndexLinkedGilt, PrivateEquity, RealEstate, FinancialFuture, PooledDerivative, DerivativeProfitAndLoss, NonTransparentScheme, BondFund, TransparentScheme, StandardEquity, Exempt. | [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date the override applies from. Defaults to the start of time if not specified. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.UpsertTaxTreatmentOverrideRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Treatment = "example Treatment";
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();


UpsertTaxTreatmentOverrideRequest upsertTaxTreatmentOverrideRequestInstance = new UpsertTaxTreatmentOverrideRequest()
    .Treatment(Treatment)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
