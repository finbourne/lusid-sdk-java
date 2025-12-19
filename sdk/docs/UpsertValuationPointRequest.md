# com.finbourne.lusid.model.UpsertValuationPointRequest
A definition for the period you wish to close

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code for the Valuation Point. | [default to String]
**diaryEntryVariant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]
**name** | **String** | Identifiable Name assigned to the Valuation Point. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the diary entry. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the diary entry. Defaults to latest. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]
**applyClearDown** | **Boolean** | Defaults to false. Set to true if you want that the closed period to have the clear down applied. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.UpsertValuationPointRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DiaryEntryCode = "example DiaryEntryCode";
@jakarta.annotation.Nullable String DiaryEntryVariant = "example DiaryEntryVariant";
@jakarta.annotation.Nullable String Name = "example Name";
OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime QueryAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Boolean ApplyClearDown = true;


UpsertValuationPointRequest upsertValuationPointRequestInstance = new UpsertValuationPointRequest()
    .DiaryEntryCode(DiaryEntryCode)
    .DiaryEntryVariant(DiaryEntryVariant)
    .Name(Name)
    .EffectiveAt(EffectiveAt)
    .QueryAsAt(QueryAsAt)
    .Properties(Properties)
    .ApplyClearDown(ApplyClearDown);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
