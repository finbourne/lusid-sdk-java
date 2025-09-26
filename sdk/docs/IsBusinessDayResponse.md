# com.finbourne.lusid.model.IsBusinessDayResponse
Whether or not a DateTimeOffset is a business DateTime

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestedDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**isBusinessDay** | **Boolean** |  | [default to Boolean]

```java
import com.finbourne.lusid.model.IsBusinessDayResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime RequestedDateTime = OffsetDateTime.now();
Boolean IsBusinessDay = true;


IsBusinessDayResponse isBusinessDayResponseInstance = new IsBusinessDayResponse()
    .RequestedDateTime(RequestedDateTime)
    .IsBusinessDay(IsBusinessDay);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
