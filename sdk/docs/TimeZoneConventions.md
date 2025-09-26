# com.finbourne.lusid.model.TimeZoneConventions
Provides information on the primary time zone of an instrument and optional cut labels  for defining times to be used by instrument events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primaryTimeZone** | **String** | The IANA time zone code for the instrument. | [default to String]
**startOfDay** | **String** | A LUSID Cut Label code used for generating instrument events at a time other than local midnight. | [optional] [default to String]
**primaryMarketOpen** | **String** | A LUSID Cut Label code used for delaying the transaction time of certain instrument events until market open. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TimeZoneConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PrimaryTimeZone = "example PrimaryTimeZone";
@jakarta.annotation.Nullable String StartOfDay = "example StartOfDay";
@jakarta.annotation.Nullable String PrimaryMarketOpen = "example PrimaryMarketOpen";


TimeZoneConventions timeZoneConventionsInstance = new TimeZoneConventions()
    .PrimaryTimeZone(PrimaryTimeZone)
    .StartOfDay(StartOfDay)
    .PrimaryMarketOpen(PrimaryMarketOpen);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
