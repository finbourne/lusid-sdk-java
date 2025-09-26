# com.finbourne.lusid.model.DiaryEntryRequest
The request to add a diary entry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | The code of the diary entry. | [default to String]
**name** | **String** | The name of the diary entry. | [optional] [default to String]
**status** | **String** | The status of a Diary Entry of Type &#39;Other&#39;. Defaults to &#39;Undefined&#39; and supports &#39;Undefined&#39;, &#39;Estimate&#39;, &#39;Candidate&#39;, and &#39;Final&#39;. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the diary entry. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the diary entry. Defaults to latest. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.DiaryEntryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DiaryEntryCode = "example DiaryEntryCode";
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Status = "example Status";
OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime QueryAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


DiaryEntryRequest diaryEntryRequestInstance = new DiaryEntryRequest()
    .DiaryEntryCode(DiaryEntryCode)
    .Name(Name)
    .Status(Status)
    .EffectiveAt(EffectiveAt)
    .QueryAsAt(QueryAsAt)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
