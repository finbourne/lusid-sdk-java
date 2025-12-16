# com.finbourne.lusid.model.ValuationPointDataRequest
The ValuationPointDataRequest.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code for the Valuation Point. | [default to String]
**diaryEntryVariant** | **String** | Unique Variant for the given Diary Entry Code. Together with the valuation point code marks the unique branch for the NavType. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ValuationPointDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DiaryEntryCode = "example DiaryEntryCode";
@jakarta.annotation.Nullable String DiaryEntryVariant = "example DiaryEntryVariant";


ValuationPointDataRequest valuationPointDataRequestInstance = new ValuationPointDataRequest()
    .DiaryEntryCode(DiaryEntryCode)
    .DiaryEntryVariant(DiaryEntryVariant);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
