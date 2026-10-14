# com.finbourne.lusid.model.PartnerStatementRequest
The request to produce a partner statement over a period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the statement period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the statement period, inclusive. | [default to OffsetDateTime]
**navTypeCode** | **String** | The NAV type to produce the statement under. Defaults to the fund&#39;s primary NAV type. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PartnerStatementRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime PeriodEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";


PartnerStatementRequest partnerStatementRequestInstance = new PartnerStatementRequest()
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .NavTypeCode(NavTypeCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
