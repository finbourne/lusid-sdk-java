# com.finbourne.lusid.model.QualifyingInvestmentsObservation
The qualifying-investments test result for one scheme on one day.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the test was evaluated for. | [default to OffsetDateTime]
**nonEquityPercent** | **java.math.BigDecimal** | The percentage of the scheme&#39;s assets that were qualifying (non-equity) investments on the date. | [default to java.math.BigDecimal]
**isBondFund** | **Boolean** | Whether more than the threshold percentage of the scheme&#39;s assets were qualifying investments on the date, making it a bond fund. | [default to Boolean]

```java
import com.finbourne.lusid.model.QualifyingInvestmentsObservation;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal NonEquityPercent = new java.math.BigDecimal("100.00");
Boolean IsBondFund = true;


QualifyingInvestmentsObservation qualifyingInvestmentsObservationInstance = new QualifyingInvestmentsObservation()
    .Date(Date)
    .NonEquityPercent(NonEquityPercent)
    .IsBondFund(IsBondFund);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
