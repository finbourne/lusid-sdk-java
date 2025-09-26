# com.finbourne.lusid.model.CapletFloorletCashFlowEvent
Definition of a cap or floor (or collar) cash flow event.  This is an event that describes the occurence of a caplet or floorlet payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Ex-Dividend / entitlement date of the cashflow payment.  Required field. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the cashflow payment  Required field. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the cashflow payment | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | The total payment per unit of the held instrument, if entitled.  Not required. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CapletFloorletCashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EntitlementDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
java.math.BigDecimal CashFlowPerUnit = new java.math.BigDecimal("100.00");


CapletFloorletCashFlowEvent capletFloorletCashFlowEventInstance = new CapletFloorletCashFlowEvent()
    .EntitlementDate(EntitlementDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .CashFlowPerUnit(CashFlowPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
