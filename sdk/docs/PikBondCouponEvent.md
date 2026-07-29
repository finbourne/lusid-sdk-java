# com.finbourne.lusid.model.PikBondCouponEvent
PIK Bond Coupon event. The election placeholder emitted once per Payment-in-Kind coupon period on a  ComplexBond, allowing holders to elect the PIK type and fraction. MandatoryWithChoices participation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) for making the election. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the coupon period this election governs. | [optional] [default to OffsetDateTime]
**elections** | [**List&lt;PikElection&gt;**](PikElection.md) | The available PIK elections for this period. | [optional] [default to List<PikElection>]

```java
import com.finbourne.lusid.model.PikBondCouponEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<PikElection> Elections = new List<PikElection>();


PikBondCouponEvent pikBondCouponEventInstance = new PikBondCouponEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Elections(Elections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
