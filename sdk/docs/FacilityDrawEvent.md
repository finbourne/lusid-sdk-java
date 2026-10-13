# com.finbourne.lusid.model.FacilityDrawEvent
A drawdown on a fund-level credit facility recorded against a CapitalInterest: cash comes in and the  facility payable goes up by the same amount. Financing, not capital: no partner balance moves.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**facilityId** | **String** | The code of the facility on the fund that the event relates to. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the draw is made. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The principal drawn, in the facility currency. Must be positive. | [default to java.math.BigDecimal]
**currency** | **String** | The currency of the facility, in which the amount is denominated. | [default to String]
**purpose** | **String** | What the draw funds: a deal identifier or an expense description. Optional. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FacilityDrawEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FacilityId = "example FacilityId";
OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
@jakarta.annotation.Nullable String Purpose = "example Purpose";


FacilityDrawEvent facilityDrawEventInstance = new FacilityDrawEvent()
    .FacilityId(FacilityId)
    .Date(Date)
    .Amount(Amount)
    .Currency(Currency)
    .Purpose(Purpose);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
