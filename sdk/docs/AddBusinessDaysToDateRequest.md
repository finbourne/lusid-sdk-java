# com.finbourne.lusid.model.AddBusinessDaysToDateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessDayOffset** | **Integer** |  | [default to Integer]
**holidayCodes** | **List&lt;String&gt;** |  | [default to List<String>]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AddBusinessDaysToDateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer BusinessDayOffset = new Integer("100.00");
List<String> HolidayCodes = new List<String>();
OffsetDateTime StartDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


AddBusinessDaysToDateRequest addBusinessDaysToDateRequestInstance = new AddBusinessDaysToDateRequest()
    .BusinessDayOffset(BusinessDayOffset)
    .HolidayCodes(HolidayCodes)
    .StartDate(StartDate)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
