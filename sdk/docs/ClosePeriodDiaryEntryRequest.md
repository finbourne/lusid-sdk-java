# com.finbourne.lusid.model.ClosePeriodDiaryEntryRequest
A definition for the period you wish to close

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code assigned to a period. When left blank a code will be created by the system in the format &#39;yyyyMMDD&#39;. | [optional] [default to String]
**name** | **String** | Identifiable Name assigned to the period. Where left blank, the system will generate a name in the format &#39;yyyyMMDD&#39;. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the diary entry. | [optional] [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the diary entry. Defaults to latest. | [optional] [default to OffsetDateTime]
**status** | **String** | The status of a Diary Entry of Type &#39;PeriodBoundary&#39;. Defaults to &#39;Estimate&#39; when closing a period, and supports &#39;Estimate&#39; and &#39;Final&#39; for closing periods and &#39;Final&#39; for locking periods. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]
**closingOptions** | **List&lt;String&gt;** | The options which will be executed once a period is closed or locked. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ClosePeriodDiaryEntryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DiaryEntryCode = "example DiaryEntryCode";
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime QueryAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<String> ClosingOptions = new List<String>();


ClosePeriodDiaryEntryRequest closePeriodDiaryEntryRequestInstance = new ClosePeriodDiaryEntryRequest()
    .DiaryEntryCode(DiaryEntryCode)
    .Name(Name)
    .EffectiveAt(EffectiveAt)
    .QueryAsAt(QueryAsAt)
    .Status(Status)
    .Properties(Properties)
    .ClosingOptions(ClosingOptions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
