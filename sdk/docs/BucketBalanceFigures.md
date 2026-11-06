# com.finbourne.lusid.model.BucketBalanceFigures
A bucket's opening balance, activity and closing balance, which always satisfy opening + activity = closing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**open** | **java.math.BigDecimal** | The balance at the start of the bucket. | [optional] [default to java.math.BigDecimal]
**activity** | **java.math.BigDecimal** | The sum of the bucket&#39;s cash flows. | [optional] [default to java.math.BigDecimal]
**close** | **java.math.BigDecimal** | The balance at the end of the bucket: Open + Activity. | [optional] [default to java.math.BigDecimal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketBalanceFigures;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Open = new java.math.BigDecimal("100.00");
java.math.BigDecimal Activity = new java.math.BigDecimal("100.00");
java.math.BigDecimal Close = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketBalanceFigures bucketBalanceFiguresInstance = new BucketBalanceFigures()
    .Open(Open)
    .Activity(Activity)
    .Close(Close)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
