# com.finbourne.lusid.model.NavReportEvent
An informational report of the net asset value of a CapitalInterest as of a date. Carries no entitlement  and generates no movements; the reported value anchors the instrument's fair-value precedence at  valuation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the net asset value is reported as of. | [optional] [default to OffsetDateTime]
**netAssetValue** | **java.math.BigDecimal** | The reported net asset value of the interest. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.NavReportEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal NetAssetValue = new java.math.BigDecimal("100.00");


NavReportEvent navReportEventInstance = new NavReportEvent()
    .Date(Date)
    .NetAssetValue(NetAssetValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
