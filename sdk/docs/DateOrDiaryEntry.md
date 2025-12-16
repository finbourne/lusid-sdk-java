# com.finbourne.lusid.model.DateOrDiaryEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **String** | A date. If specified, DiaryEntry must not be specified. | [optional] [default to String]
**diaryEntry** | **String** | The code of a diary entry. If specified, Date must not be specified. | [optional] [default to String]
**diaryEntryVariant** | **String** | Unique Variant for the given Diary Entry Code. If not provided, defaults to empty string. | [optional] [default to String]

```java
import com.finbourne.lusid.model.DateOrDiaryEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Date = "example Date";
@jakarta.annotation.Nullable String DiaryEntry = "example DiaryEntry";
@jakarta.annotation.Nullable String DiaryEntryVariant = "example DiaryEntryVariant";


DateOrDiaryEntry dateOrDiaryEntryInstance = new DateOrDiaryEntry()
    .Date(Date)
    .DiaryEntry(DiaryEntry)
    .DiaryEntryVariant(DiaryEntryVariant);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
