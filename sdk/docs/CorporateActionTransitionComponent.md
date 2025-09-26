# com.finbourne.lusid.model.CorporateActionTransitionComponent
A single transition component, when grouped with other components a corporate action transition is formed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the instrument lies. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**instrumentUid** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers | [default to String]
**unitsFactor** | **java.math.BigDecimal** | The factor to scale units by | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | The factor to scale cost by | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CorporateActionTransitionComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentScope = "example InstrumentScope";
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
String InstrumentUid = "example InstrumentUid";
java.math.BigDecimal UnitsFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal CostFactor = new java.math.BigDecimal("100.00");


CorporateActionTransitionComponent corporateActionTransitionComponentInstance = new CorporateActionTransitionComponent()
    .InstrumentScope(InstrumentScope)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .InstrumentUid(InstrumentUid)
    .UnitsFactor(UnitsFactor)
    .CostFactor(CostFactor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
