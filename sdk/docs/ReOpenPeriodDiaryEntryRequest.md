# com.finbourne.lusid.model.ReOpenPeriodDiaryEntryRequest
A definition for the period you wish to re open

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code assigned to a period. When left blank last period will be used. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ReOpenPeriodDiaryEntryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DiaryEntryCode = "example DiaryEntryCode";


ReOpenPeriodDiaryEntryRequest reOpenPeriodDiaryEntryRequestInstance = new ReOpenPeriodDiaryEntryRequest()
    .DiaryEntryCode(DiaryEntryCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
