# com.finbourne.lusid.model.BucketAmounts
An amount in the payment currency and, when a report currency was requested, in the report currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**local** | **java.math.BigDecimal** | The amount in the payment currency. | [optional] [default to java.math.BigDecimal]
**reportCurrency** | **java.math.BigDecimal** | The amount in the report currency. Absent when no report currency was requested. | [optional] [default to java.math.BigDecimal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketAmounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Local = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ReportCurrency = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketAmounts bucketAmountsInstance = new BucketAmounts()
    .Local(Local)
    .ReportCurrency(ReportCurrency)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
