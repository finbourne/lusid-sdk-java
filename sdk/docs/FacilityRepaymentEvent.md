# com.finbourne.lusid.model.FacilityRepaymentEvent
A repayment of principal on a fund-level credit facility recorded against a CapitalInterest: cash goes  out and the facility payable comes down by the same amount. Financing, not capital: no partner balance moves.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**facilityId** | **String** | The code of the facility on the fund that the event relates to. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the repayment is made. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The principal repaid, in the facility currency. Must be positive. | [default to java.math.BigDecimal]
**currency** | **String** | The currency of the facility, in which the amount is denominated. | [default to String]

```java
import com.finbourne.lusid.model.FacilityRepaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FacilityId = "example FacilityId";
OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";


FacilityRepaymentEvent facilityRepaymentEventInstance = new FacilityRepaymentEvent()
    .FacilityId(FacilityId)
    .Date(Date)
    .Amount(Amount)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
