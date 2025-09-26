# com.finbourne.lusid.model.LockPeriodDiaryEntryRequest
A definition for the period you wish to lock

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code assigned to a period. When left blank last closed period will be located. | [optional] [default to String]
**closingOptions** | **List&lt;String&gt;** | The options which will be executed once a period is closed or locked. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.LockPeriodDiaryEntryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DiaryEntryCode = "example DiaryEntryCode";
@jakarta.annotation.Nullable List<String> ClosingOptions = new List<String>();


LockPeriodDiaryEntryRequest lockPeriodDiaryEntryRequestInstance = new LockPeriodDiaryEntryRequest()
    .DiaryEntryCode(DiaryEntryCode)
    .ClosingOptions(ClosingOptions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
