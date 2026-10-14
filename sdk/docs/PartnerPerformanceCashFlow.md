# com.finbourne.lusid.model.PartnerPerformanceCashFlow
One dated cash flow the net IRR was solved from, signed from the partner's point of view.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the cash flow. | [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The amount of the cash flow, negative for contributions and positive for distributions and the residual value. | [default to java.math.BigDecimal]
**kind** | **String** | The kind of cash flow: Contribution, Distribution or ResidualValue. | [default to String]

```java
import com.finbourne.lusid.model.PartnerPerformanceCashFlow;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Kind = "example Kind";


PartnerPerformanceCashFlow partnerPerformanceCashFlowInstance = new PartnerPerformanceCashFlow()
    .Date(Date)
    .Amount(Amount)
    .Kind(Kind);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
