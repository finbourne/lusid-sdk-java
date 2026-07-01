# com.finbourne.lusid.model.ResolveTenorsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**calendars** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**spotDays** | **Integer** |  | [default to Integer]
**tenors** | **List&lt;String&gt;** |  | [default to List<String>]
**businessDayConvention** | **String** | Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**eomRule** | **String** |  | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.ResolveTenorsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
List<ResourceId> Calendars = new List<ResourceId>();
Integer SpotDays = new Integer("100.00");
List<String> Tenors = new List<String>();
@jakarta.annotation.Nullable String BusinessDayConvention = "example BusinessDayConvention";
@jakarta.annotation.Nullable String EomRule = "example EomRule";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


ResolveTenorsRequest resolveTenorsRequestInstance = new ResolveTenorsRequest()
    .StartDate(StartDate)
    .Calendars(Calendars)
    .SpotDays(SpotDays)
    .Tenors(Tenors)
    .BusinessDayConvention(BusinessDayConvention)
    .EomRule(EomRule)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
