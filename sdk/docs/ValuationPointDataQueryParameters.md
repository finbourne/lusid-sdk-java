# com.finbourne.lusid.model.ValuationPointDataQueryParameters
The parameters used in getting the ValuationPointData.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [default to DateOrDiaryEntry]
**variant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ValuationPointDataQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry Start = new DateOrDiaryEntry();
DateOrDiaryEntry End = new DateOrDiaryEntry();
@jakarta.annotation.Nullable String Variant = "example Variant";


ValuationPointDataQueryParameters valuationPointDataQueryParametersInstance = new ValuationPointDataQueryParameters()
    .Start(Start)
    .End(End)
    .Variant(Variant);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
