# com.finbourne.lusid.model.UpsertCorporateActionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporateActionCode** | **String** | The unique identifier of this corporate action | [default to String]
**description** | **String** | The description of the corporate action. | [optional] [default to String]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The announcement date of the corporate action | [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date of the corporate action | [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date of the corporate action | [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the corporate action | [default to OffsetDateTime]
**transitions** | [**List&lt;CorporateActionTransitionRequest&gt;**](CorporateActionTransitionRequest.md) | The transitions that result from this corporate action | [default to List<CorporateActionTransitionRequest>]

```java
import com.finbourne.lusid.model.UpsertCorporateActionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CorporateActionCode = "example CorporateActionCode";
@jakarta.annotation.Nullable String Description = "example Description";
OffsetDateTime AnnouncementDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
List<CorporateActionTransitionRequest> Transitions = new List<CorporateActionTransitionRequest>();


UpsertCorporateActionRequest upsertCorporateActionRequestInstance = new UpsertCorporateActionRequest()
    .CorporateActionCode(CorporateActionCode)
    .Description(Description)
    .AnnouncementDate(AnnouncementDate)
    .ExDate(ExDate)
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .Transitions(Transitions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
