# com.finbourne.lusid.model.BankruptcyEvent
A Bankruptcy (BRUP) event recording the legal status of a company unable to meet its financial  obligations. Pure informational marker — generates no transactions and has no position impact.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the bankruptcy filing or court ruling. | [optional] [default to OffsetDateTime]
**notificationType** | **String** | Notification type: NEWM (new announcement), REPL (replacement/correction), or CANC (proceedings dismissed). Available values: NEWM, REPL, CANC. | [default to String]
**claimFilingDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Date by which creditors must file a proof of claim. Optional — null when not applicable.  If provided, overrides EffectiveDate as the settle date of the resulting virtual transactions. | [optional] [default to OffsetDateTime]
**narrative** | **String** | Free-text detail: court, jurisdiction, trustee, plan reference. Optional. | [optional] [default to String]

```java
import com.finbourne.lusid.model.BankruptcyEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
String NotificationType = "example NotificationType";
@jakarta.annotation.Nullable OffsetDateTime ClaimFilingDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable String Narrative = "example Narrative";


BankruptcyEvent bankruptcyEventInstance = new BankruptcyEvent()
    .EffectiveDate(EffectiveDate)
    .NotificationType(NotificationType)
    .ClaimFilingDeadline(ClaimFilingDeadline)
    .Narrative(Narrative);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
