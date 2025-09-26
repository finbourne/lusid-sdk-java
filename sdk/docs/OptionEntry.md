# com.finbourne.lusid.model.OptionEntry
Strike price against par and associated date for a bond call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strike** | **java.math.BigDecimal** | The strike on this date | [default to java.math.BigDecimal]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the option can be actioned at this strike | [default to OffsetDateTime]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | If American exercise, this is the end of the exercise period.  Optional field. Defaults to the Date field if not set. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.OptionEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
OffsetDateTime Date = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EndDate = OffsetDateTime.now();


OptionEntry optionEntryInstance = new OptionEntry()
    .Strike(Strike)
    .Date(Date)
    .EndDate(EndDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
