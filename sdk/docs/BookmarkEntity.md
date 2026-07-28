# com.finbourne.lusid.model.BookmarkEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [default to URI]
**entityUniqueId** | **String** | The unique id of the entity. | [default to String]
**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) | [optional] [default to Integer]
**status** | **String** | The status of the entity at the current time. Available values: Prevailing, Deleted, DoesNotExist. | [default to String]
**asAtDeleted** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity was deleted. | [optional] [default to OffsetDateTime]
**userIdDeleted** | **String** | The unique id of the user who deleted the entity. | [optional] [default to String]
**requestIdDeleted** | **String** | The unique request id of the command that deleted the entity. | [optional] [default to String]
**effectiveAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The EffectiveAt this Entity is created, if entity does not currently exist in EffectiveAt. | [optional] [default to OffsetDateTime]
**prevailingBookmark** | [**FundCalendarEntry**](FundCalendarEntry.md) |  | [optional] [default to FundCalendarEntry]
**deletedBookmark** | [**FundCalendarEntry**](FundCalendarEntry.md) |  | [optional] [default to FundCalendarEntry]
**previewedStatus** | **String** | The status of the previewed entity. Available values: Prevailing, Deleted, DoesNotExist. | [optional] [default to String]
**previewedBookmark** | [**FundCalendarEntry**](FundCalendarEntry.md) |  | [optional] [default to FundCalendarEntry]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BookmarkEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

URI Href = URI.create("http://example.com/Href");
String EntityUniqueId = "example EntityUniqueId";
@jakarta.annotation.Nullable Integer AsAtVersionNumber = new Integer("100.00");
String Status = "example Status";
@jakarta.annotation.Nullable OffsetDateTime AsAtDeleted = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdDeleted = "example UserIdDeleted";
@jakarta.annotation.Nullable String RequestIdDeleted = "example RequestIdDeleted";
@jakarta.annotation.Nullable OffsetDateTime EffectiveAtCreated = OffsetDateTime.now();
FundCalendarEntry PrevailingBookmark = new FundCalendarEntry();
FundCalendarEntry DeletedBookmark = new FundCalendarEntry();
@jakarta.annotation.Nullable String PreviewedStatus = "example PreviewedStatus";
FundCalendarEntry PreviewedBookmark = new FundCalendarEntry();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BookmarkEntity bookmarkEntityInstance = new BookmarkEntity()
    .Href(Href)
    .EntityUniqueId(EntityUniqueId)
    .AsAtVersionNumber(AsAtVersionNumber)
    .Status(Status)
    .AsAtDeleted(AsAtDeleted)
    .UserIdDeleted(UserIdDeleted)
    .RequestIdDeleted(RequestIdDeleted)
    .EffectiveAtCreated(EffectiveAtCreated)
    .PrevailingBookmark(PrevailingBookmark)
    .DeletedBookmark(DeletedBookmark)
    .PreviewedStatus(PreviewedStatus)
    .PreviewedBookmark(PreviewedBookmark)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
