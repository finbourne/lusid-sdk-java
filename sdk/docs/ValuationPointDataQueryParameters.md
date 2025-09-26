# com.finbourne.lusid.model.ValuationPointDataQueryParameters
The parameters used in getting the ValuationPointData.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [default to DateOrDiaryEntry]
**excludeCleardownModule** | **Boolean** | By deafult this flag is set to false, if this is set to true, no cleardown module will be applied to the trial balance. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ValuationPointDataQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry Start = new DateOrDiaryEntry();
DateOrDiaryEntry End = new DateOrDiaryEntry();
Boolean ExcludeCleardownModule = true;


ValuationPointDataQueryParameters valuationPointDataQueryParametersInstance = new ValuationPointDataQueryParameters()
    .Start(Start)
    .End(End)
    .ExcludeCleardownModule(ExcludeCleardownModule);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
