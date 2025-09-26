# com.finbourne.lusid.model.CreateDateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateId** | **String** |  | [default to String]
**fromUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**toUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**timeZone** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**type** | **String** |  | [optional] [default to String]
**attributes** | [**DateAttributes**](DateAttributes.md) |  | [optional] [default to DateAttributes]
**sourceData** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]

```java
import com.finbourne.lusid.model.CreateDateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DateId = "example DateId";
OffsetDateTime FromUtc = OffsetDateTime.now();
OffsetDateTime ToUtc = OffsetDateTime.now();
String TimeZone = "example TimeZone";
String Description = "example Description";
@jakarta.annotation.Nullable String Type = "example Type";
DateAttributes Attributes = new DateAttributes();
@jakarta.annotation.Nullable Map<String, String> SourceData = new Map<String, String>();


CreateDateRequest createDateRequestInstance = new CreateDateRequest()
    .DateId(DateId)
    .FromUtc(FromUtc)
    .ToUtc(ToUtc)
    .TimeZone(TimeZone)
    .Description(Description)
    .Type(Type)
    .Attributes(Attributes)
    .SourceData(SourceData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
