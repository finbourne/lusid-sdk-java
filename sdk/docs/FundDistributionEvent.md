# com.finbourne.lusid.model.FundDistributionEvent
A distribution from the fund to the holder of a CapitalInterest. A recallable distribution restores  unfunded capital (the fund may call it again); a non-recallable distribution permanently returns capital.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the distribution takes effect. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The amount distributed. Must be positive. | [default to java.math.BigDecimal]
**isRecallable** | **Boolean** | True when the fund may recall the distributed amount: the distribution restores unfunded capital  rather than permanently returning it. Defaults to false. This field is optional. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.FundDistributionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
Boolean IsRecallable = true;


FundDistributionEvent fundDistributionEventInstance = new FundDistributionEvent()
    .Date(Date)
    .Amount(Amount)
    .IsRecallable(IsRecallable);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
