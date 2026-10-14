# com.finbourne.lusid.model.AllocationEventNoticeEvent
The allocation event a notice is issued for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type of the allocation event. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the allocation event. | [default to OffsetDateTime]
**noticeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the notice is issued. | [optional] [default to OffsetDateTime]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the payment is due. | [optional] [default to OffsetDateTime]
**status** | **String** | The status of the allocation event. | [default to String]

```java
import com.finbourne.lusid.model.AllocationEventNoticeEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String Type = "example Type";
OffsetDateTime EventDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime NoticeDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime DueDate = OffsetDateTime.now();
String Status = "example Status";


AllocationEventNoticeEvent allocationEventNoticeEventInstance = new AllocationEventNoticeEvent()
    .Id(Id)
    .Type(Type)
    .EventDate(EventDate)
    .NoticeDate(NoticeDate)
    .DueDate(DueDate)
    .Status(Status);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
