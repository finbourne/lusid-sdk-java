# com.finbourne.lusid.model.RecResultCountByReviewStatus
Result counts broken down by review status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**required** | **Integer** | The number of results with review status Required. | [default to Integer]
**notRequired** | **Integer** | The number of results with review status Not Required. | [default to Integer]
**reviewed** | **Integer** | The number of results with review status Reviewed. | [default to Integer]

```java
import com.finbourne.lusid.model.RecResultCountByReviewStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Required = new Integer("100.00");
Integer NotRequired = new Integer("100.00");
Integer Reviewed = new Integer("100.00");


RecResultCountByReviewStatus recResultCountByReviewStatusInstance = new RecResultCountByReviewStatus()
    .Required(Required)
    .NotRequired(NotRequired)
    .Reviewed(Reviewed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
