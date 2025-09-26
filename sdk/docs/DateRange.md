# com.finbourne.lusid.model.DateRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**untilDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.DateRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime FromDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime UntilDate = OffsetDateTime.now();


DateRange dateRangeInstance = new DateRange()
    .FromDate(FromDate)
    .UntilDate(UntilDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
