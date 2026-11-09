# com.finbourne.lusid.model.TaxClassificationExceptionRecord
An instrument the engine could not classify, or a qualifying-investments flip, for the exceptions feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**luid** | **String** | The LUSID instrument identifier of the instrument the exception was raised for. | [default to String]
**instrumentName** | **String** | The name of the instrument the exception was raised for. | [optional] [default to String]
**exception** | [**TaxClassificationException**](TaxClassificationException.md) |  | [default to TaxClassificationException]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date the exception was observed at. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the exception was observed at. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.TaxClassificationExceptionRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Luid = "example Luid";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
TaxClassificationException Exception = new TaxClassificationException();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime AsAt = OffsetDateTime.now();


TaxClassificationExceptionRecord taxClassificationExceptionRecordInstance = new TaxClassificationExceptionRecord()
    .Luid(Luid)
    .InstrumentName(InstrumentName)
    .Exception(Exception)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
