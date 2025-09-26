# com.finbourne.lusid.model.CorporateActionTransitionComponentRequest
A single transition component request, when grouped with other transition component requests a corporate action  transition request is formed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**unitsFactor** | **java.math.BigDecimal** | The factor to scale units by | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | The factor to scale cost by | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CorporateActionTransitionComponentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> InstrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal UnitsFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal CostFactor = new java.math.BigDecimal("100.00");


CorporateActionTransitionComponentRequest corporateActionTransitionComponentRequestInstance = new CorporateActionTransitionComponentRequest()
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .UnitsFactor(UnitsFactor)
    .CostFactor(CostFactor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
