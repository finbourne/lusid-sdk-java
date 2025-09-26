# com.finbourne.lusid.model.CalendarDate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**dateIdentifier** | **String** |  | [default to String]
**fromUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**toUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**_localDate** | **String** |  | [default to String]
**timezone** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**type** | **String** |  | [optional] [default to String]
**attributes** | [**DateAttributes**](DateAttributes.md) |  | [optional] [default to DateAttributes]
**sourceData** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]

```java
import com.finbourne.lusid.model.CalendarDate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String DateIdentifier = "example DateIdentifier";
OffsetDateTime FromUtc = OffsetDateTime.now();
OffsetDateTime ToUtc = OffsetDateTime.now();
String LocalDate = "example LocalDate";
String Timezone = "example Timezone";
String Description = "example Description";
@jakarta.annotation.Nullable String Type = "example Type";
DateAttributes Attributes = new DateAttributes();
@jakarta.annotation.Nullable Map<String, String> SourceData = new Map<String, String>();


CalendarDate calendarDateInstance = new CalendarDate()
    .Href(Href)
    .DateIdentifier(DateIdentifier)
    .FromUtc(FromUtc)
    .ToUtc(ToUtc)
    .LocalDate(LocalDate)
    .Timezone(Timezone)
    .Description(Description)
    .Type(Type)
    .Attributes(Attributes)
    .SourceData(SourceData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
