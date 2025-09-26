# com.finbourne.lusid.model.FlexibleRepoInterestPaymentEvent
Definition of FlexibleRepoInterestPaymentEvent, which represents the regular interest payments associated with an  open repo contract modelled as a FlexibleRepo.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date of the interest payment. This is a required field. | [optional] [default to OffsetDateTime]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | EntitlementDate of the interest payment. This is a required field. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the interest payment. This is a required field. | [default to String]
**interestPerUnit** | **java.math.BigDecimal** | Interest payment per unit held of the FlexibleRepo. This field is optional. If not specified, the system  will not generate a virtual transaction for this event | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FlexibleRepoInterestPaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime SettlementDate = OffsetDateTime.now();
OffsetDateTime EntitlementDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal InterestPerUnit = new java.math.BigDecimal("100.00");


FlexibleRepoInterestPaymentEvent flexibleRepoInterestPaymentEventInstance = new FlexibleRepoInterestPaymentEvent()
    .SettlementDate(SettlementDate)
    .EntitlementDate(EntitlementDate)
    .Currency(Currency)
    .InterestPerUnit(InterestPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
