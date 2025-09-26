# com.finbourne.lusid.model.AccumulationEvent
Accumulation dividend

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the dividend was announced / declared. | [optional] [default to OffsetDateTime]
**dividendCurrency** | **String** | Payment currency | [default to String]
**dividendRate** | **java.math.BigDecimal** | Dividend rate or payment rate as a percentage. i.e. 5% is written as 0.05 | [default to java.math.BigDecimal]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the dividend is not owed to the buying party.  Typically this is T-1 from the RecordDate. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the company pays out dividends to shareholders. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AccumulationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
String DividendCurrency = "example DividendCurrency";
java.math.BigDecimal DividendRate = new java.math.BigDecimal("100.00");
OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();


AccumulationEvent accumulationEventInstance = new AccumulationEvent()
    .AnnouncementDate(AnnouncementDate)
    .DividendCurrency(DividendCurrency)
    .DividendRate(DividendRate)
    .ExDate(ExDate)
    .PaymentDate(PaymentDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
