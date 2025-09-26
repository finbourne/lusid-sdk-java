# com.finbourne.lusid.model.BondConversionSchedule
A BondConversionSchedule object represents a class containing the  information required for the creation of convertible features in a ComplexBond

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | **Map&lt;String, String&gt;** | The market identifier(s) of the share that the bond converts to. The instrument  will not fail validation if no identifier is supplied. | [optional] [default to Map<String, String>]
**bondConversionEntries** | [**List&lt;BondConversionEntry&gt;**](BondConversionEntry.md) | The dates at which the bond may be converted and associated information required about the conversion. | [optional] [default to List<BondConversionEntry>]
**conversionTrigger** | **String** | Corporate event that triggers a conversion    Supported string (enumeration) values are: [NextEquityFinancing, IpoConversion, KnownDates, SoftCall]. | [default to String]
**deliveryType** | **String** | Is a conversion made into cash or into shares?  Defaults to \&quot;Physical\&quot; if not set.    Supported string (enumeration) values are: [Cash, Physical]. | [optional] [default to String]
**exerciseType** | **String** | The exercise type of the conversion schedule (American or European).  For American type, the bond is convertible from a given exercise date until the next date in the schedule, or until it matures.  For European type, the bond is only convertible on the given exercise date.    Supported string (enumeration) values are: [European, Bermudan, American]. | [default to String]
**includesAccrued** | **Boolean** | Set this to true if a accrued interest is included in the conversion. Defaults to true. | [optional] [default to Boolean]
**mandatoryConversion** | **Boolean** | Set this to true if a conversion is mandatory if the trigger occurs. Defaults to false. | [optional] [default to Boolean]
**notificationPeriodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The last day in the notification period for the conversion of the bond | [optional] [default to OffsetDateTime]
**notificationPeriodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The first day in the notification period for the conversion of the bond | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.BondConversionSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable List<BondConversionEntry> BondConversionEntries = new List<BondConversionEntry>();
String ConversionTrigger = "example ConversionTrigger";
@jakarta.annotation.Nullable String DeliveryType = "example DeliveryType";
String ExerciseType = "example ExerciseType";
Boolean IncludesAccrued = true;
Boolean MandatoryConversion = true;
OffsetDateTime NotificationPeriodEnd = OffsetDateTime.now();
OffsetDateTime NotificationPeriodStart = OffsetDateTime.now();


BondConversionSchedule bondConversionScheduleInstance = new BondConversionSchedule()
    .Identifiers(Identifiers)
    .BondConversionEntries(BondConversionEntries)
    .ConversionTrigger(ConversionTrigger)
    .DeliveryType(DeliveryType)
    .ExerciseType(ExerciseType)
    .IncludesAccrued(IncludesAccrued)
    .MandatoryConversion(MandatoryConversion)
    .NotificationPeriodEnd(NotificationPeriodEnd)
    .NotificationPeriodStart(NotificationPeriodStart);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
