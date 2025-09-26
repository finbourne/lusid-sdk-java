# com.finbourne.lusid.model.ChangeHistory
A group of changes made by the same person at the same time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The unique identifier of the user that made the change. | [default to String]
**modifiedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date/time of the change. | [default to OffsetDateTime]
**requestId** | **String** | The unique identifier of the request that the changes were part of. | [default to String]
**action** | **String** | The action performed on the transaction, either created, updated, or deleted. The available values are: Create, Update, Delete | [default to String]
**changes** | [**List&lt;ChangeItem&gt;**](ChangeItem.md) | The collection of changes that were made. | [default to List<ChangeItem>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ChangeHistory;
import java.util.*;
import java.lang.System;
import java.net.URI;

String UserId = "example UserId";
OffsetDateTime ModifiedAsAt = OffsetDateTime.now();
String RequestId = "example RequestId";
String Action = "example Action";
List<ChangeItem> Changes = new List<ChangeItem>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ChangeHistory changeHistoryInstance = new ChangeHistory()
    .UserId(UserId)
    .ModifiedAsAt(ModifiedAsAt)
    .RequestId(RequestId)
    .Action(Action)
    .Changes(Changes)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
