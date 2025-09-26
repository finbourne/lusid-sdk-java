# com.finbourne.lusid.model.InformationalErrorEvent
Event holder containing error information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorDetail** | **String** | The details of the error | [default to String]
**errorReason** | **String** | The error reason | [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the evaulation | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.InformationalErrorEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ErrorDetail = "example ErrorDetail";
String ErrorReason = "example ErrorReason";
OffsetDateTime EffectiveAt = OffsetDateTime.now();


InformationalErrorEvent informationalErrorEventInstance = new InformationalErrorEvent()
    .ErrorDetail(ErrorDetail)
    .ErrorReason(ErrorReason)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
