# com.finbourne.lusid.model.RecReview
A summary of the per-result review state across the result set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countReviewed** | **Integer** | The number of results with review status Reviewed. | [default to Integer]
**countRequired** | **Integer** | The number of results with review status Required. | [default to Integer]
**countNotRequired** | **Integer** | The number of results with review status Not Required. | [default to Integer]
**completionRatio** | **java.math.BigDecimal** | Reviewed / (Reviewed + Required). Is 1.0 when the denominator is zero, and null when execution failed. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.RecReview;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer CountReviewed = new Integer("100.00");
Integer CountRequired = new Integer("100.00");
Integer CountNotRequired = new Integer("100.00");
java.math.BigDecimal CompletionRatio = new java.math.BigDecimal("100.00");


RecReview recReviewInstance = new RecReview()
    .CountReviewed(CountReviewed)
    .CountRequired(CountRequired)
    .CountNotRequired(CountNotRequired)
    .CompletionRatio(CompletionRatio);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
