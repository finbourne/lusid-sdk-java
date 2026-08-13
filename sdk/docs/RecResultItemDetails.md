# com.finbourne.lusid.model.RecResultItemDetails
The individual items that make up a rec result, split by side. Zero counts and empty arrays for  results that have cleared.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countLeft** | **Integer** | The number of items grouped on the left side. | [default to Integer]
**countRight** | **Integer** | The number of items grouped on the right side. | [default to Integer]
**left** | [**List&lt;RecResultItem&gt;**](RecResultItem.md) | The left-side items. | [optional] [default to List<RecResultItem>]
**right** | [**List&lt;RecResultItem&gt;**](RecResultItem.md) | The right-side items. | [optional] [default to List<RecResultItem>]

```java
import com.finbourne.lusid.model.RecResultItemDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer CountLeft = new Integer("100.00");
Integer CountRight = new Integer("100.00");
@jakarta.annotation.Nullable List<RecResultItem> Left = new List<RecResultItem>();
@jakarta.annotation.Nullable List<RecResultItem> Right = new List<RecResultItem>();


RecResultItemDetails recResultItemDetailsInstance = new RecResultItemDetails()
    .CountLeft(CountLeft)
    .CountRight(CountRight)
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
