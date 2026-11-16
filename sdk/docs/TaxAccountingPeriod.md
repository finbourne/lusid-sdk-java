# com.finbourne.lusid.model.TaxAccountingPeriod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the period, for example the four-digit year. | [optional] [default to String]
**start** | [**OffsetDateTime**](OffsetDateTime.md) | The first day of the period, inclusive. | [optional] [default to OffsetDateTime]
**end** | [**OffsetDateTime**](OffsetDateTime.md) | The last day of the period, inclusive. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.TaxAccountingPeriod;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Label = "example Label";
OffsetDateTime Start = OffsetDateTime.now();
OffsetDateTime End = OffsetDateTime.now();


TaxAccountingPeriod taxAccountingPeriodInstance = new TaxAccountingPeriod()
    .Label(Label)
    .Start(Start)
    .End(End);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
