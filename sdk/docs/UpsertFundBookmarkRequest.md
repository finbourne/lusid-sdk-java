# com.finbourne.lusid.model.UpsertFundBookmarkRequest
A definition for the period you wish to close

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmarkCode** | **String** | Unique code for the Bookmark. | [default to String]
**displayName** | **String** | Identifiable Name assigned to the Bookmark. | [default to String]
**description** | **String** | Description assigned to the Bookmark. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the Bookmark. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the Bookmark. Defaults to latest. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Bookmark. | [optional] [default to Map<String, Property>]
**holdingsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for building holdings in the Bookmark. Defaults to Latest. | [optional] [default to OffsetDateTime]
**valuationsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for performing valuations in the Bookmark. Defaults to Latest. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.UpsertFundBookmarkRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BookmarkCode = "example BookmarkCode";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime QueryAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable OffsetDateTime HoldingsAsAtOverride = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ValuationsAsAtOverride = OffsetDateTime.now();


UpsertFundBookmarkRequest upsertFundBookmarkRequestInstance = new UpsertFundBookmarkRequest()
    .BookmarkCode(BookmarkCode)
    .DisplayName(DisplayName)
    .Description(Description)
    .EffectiveAt(EffectiveAt)
    .QueryAsAt(QueryAsAt)
    .Properties(Properties)
    .HoldingsAsAtOverride(HoldingsAsAtOverride)
    .ValuationsAsAtOverride(ValuationsAsAtOverride);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
