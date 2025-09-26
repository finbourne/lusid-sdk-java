# com.finbourne.lusid.model.BondDefaultEvent
Indicates when an issuer has defaulted on an obligation due to technical default, missed payments, or bankruptcy filing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the bond default occurred. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.BondDefaultEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();


BondDefaultEvent bondDefaultEventInstance = new BondDefaultEvent()
    .EffectiveDate(EffectiveDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
