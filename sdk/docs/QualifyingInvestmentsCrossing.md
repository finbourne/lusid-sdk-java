# com.finbourne.lusid.model.QualifyingInvestmentsCrossing
A flip of the qualifying-investments result between two consecutive observed days.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the observation before the flip. | [default to OffsetDateTime]
**to** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the observation after the flip. | [default to OffsetDateTime]
**wasBondFundBefore** | **Boolean** | Whether the scheme was a bond fund on the From date. | [default to Boolean]
**isBondFundAfter** | **Boolean** | Whether the scheme was a bond fund on the To date. | [default to Boolean]

```java
import com.finbourne.lusid.model.QualifyingInvestmentsCrossing;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime From = OffsetDateTime.now();
OffsetDateTime To = OffsetDateTime.now();
Boolean WasBondFundBefore = true;
Boolean IsBondFundAfter = true;


QualifyingInvestmentsCrossing qualifyingInvestmentsCrossingInstance = new QualifyingInvestmentsCrossing()
    .From(From)
    .To(To)
    .WasBondFundBefore(WasBondFundBefore)
    .IsBondFundAfter(IsBondFundAfter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
