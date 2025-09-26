# com.finbourne.lusid.model.ExpiryEvent
Definition of an Expiry Event  This is an event that describes the expiry of the instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the instrument | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.ExpiryEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExpiryDate = OffsetDateTime.now();


ExpiryEvent expiryEventInstance = new ExpiryEvent()
    .ExpiryDate(ExpiryDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
