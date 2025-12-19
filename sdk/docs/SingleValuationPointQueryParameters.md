# com.finbourne.lusid.model.SingleValuationPointQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateOrDiaryEntry** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [default to DateOrDiaryEntry]
**variant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]

```java
import com.finbourne.lusid.model.SingleValuationPointQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry DateOrDiaryEntry = new DateOrDiaryEntry();
@jakarta.annotation.Nullable String Variant = "example Variant";


SingleValuationPointQueryParameters singleValuationPointQueryParametersInstance = new SingleValuationPointQueryParameters()
    .DateOrDiaryEntry(DateOrDiaryEntry)
    .Variant(Variant);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
