# com.finbourne.lusid.model.FacilityPayableDifference
A date on which a Facility's principal balance and its payable differ.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the principal balance and the payable differ on. | [default to OffsetDateTime]
**balance** | **java.math.BigDecimal** | The principal balance at the end of the date. | [default to java.math.BigDecimal]
**payable** | **java.math.BigDecimal** | The principal on the payable at the end of the date. | [default to java.math.BigDecimal]
**difference** | **java.math.BigDecimal** | The principal balance less the payable. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FacilityPayableDifference;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Balance = new java.math.BigDecimal("100.00");
java.math.BigDecimal Payable = new java.math.BigDecimal("100.00");
java.math.BigDecimal Difference = new java.math.BigDecimal("100.00");


FacilityPayableDifference facilityPayableDifferenceInstance = new FacilityPayableDifference()
    .Date(Date)
    .Balance(Balance)
    .Payable(Payable)
    .Difference(Difference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
