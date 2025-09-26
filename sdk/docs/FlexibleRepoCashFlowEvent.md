# com.finbourne.lusid.model.FlexibleRepoCashFlowEvent
Definition of FlexibleRepoCashFlowEvent which represents a cash transfer as part of a repo contract modelled  as a FlexibleRepo, either as part of the purchase leg or repurchase leg, or any early closure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the cash payment settles. This is a required field. | [optional] [default to OffsetDateTime]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the recipient of the cash payment is entitled to receive the cash. This is a required field. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the payment. This is a required field. | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | Amount of cash to be paid per unit of the instrument.  This amount is signed to indicate direction of the payment, i.e. as part of the purchase leg vs the repurchase leg.  This field is optional. If not specified, the system will not generate a virtual transaction for this event. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FlexibleRepoCashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime SettlementDate = OffsetDateTime.now();
OffsetDateTime EntitlementDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal CashFlowPerUnit = new java.math.BigDecimal("100.00");


FlexibleRepoCashFlowEvent flexibleRepoCashFlowEventInstance = new FlexibleRepoCashFlowEvent()
    .SettlementDate(SettlementDate)
    .EntitlementDate(EntitlementDate)
    .Currency(Currency)
    .CashFlowPerUnit(CashFlowPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
