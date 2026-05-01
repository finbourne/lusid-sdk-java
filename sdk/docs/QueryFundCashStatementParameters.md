# com.finbourne.lusid.model.QueryFundCashStatementParameters
Request body for querying a Fund Cash Statement.  Extends the diary entry query pattern with cash statement display mode.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [default to DateOrDiaryEntry]
**variant** | **String** | Optional diary entry variant (e.g. for multi-estimate scenarios). | [optional] [default to String]
**displayMode** | **String** | Cash statement display mode: ShowReversal (default) shows full reversal/TrueUp detail; Consolidated collapses reversals into AvgRateCorrection rows. | [optional] [default to String]

```java
import com.finbourne.lusid.model.QueryFundCashStatementParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry Start = new DateOrDiaryEntry();
DateOrDiaryEntry End = new DateOrDiaryEntry();
@jakarta.annotation.Nullable String Variant = "example Variant";
@jakarta.annotation.Nullable String DisplayMode = "example DisplayMode";


QueryFundCashStatementParameters queryFundCashStatementParametersInstance = new QueryFundCashStatementParameters()
    .Start(Start)
    .End(End)
    .Variant(Variant)
    .DisplayMode(DisplayMode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
