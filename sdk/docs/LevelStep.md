# com.finbourne.lusid.model.LevelStep
Item which is stepped in level/quantity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date from which the level should apply. | [default to OffsetDateTime]
**quantity** | **java.math.BigDecimal** | The quantity which is applied. This might be an absolute, percentage, fractional or other value. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.LevelStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");


LevelStep levelStepInstance = new LevelStep()
    .Date(Date)
    .Quantity(Quantity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
