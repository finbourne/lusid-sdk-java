# com.finbourne.lusid.model.MaturityEvent
Definition of a Maturity Event  This is an event that describes the maturity of the instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | Maturity date of the instrument | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.MaturityEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime MaturityDate = OffsetDateTime.now();


MaturityEvent maturityEventInstance = new MaturityEvent()
    .MaturityDate(MaturityDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
