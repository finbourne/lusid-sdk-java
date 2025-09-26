# com.finbourne.lusid.model.ReferencePortfolioConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [optional] [default to Map<String, String>]
**instrumentUid** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers | [default to String]
**currency** | **String** |  | [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties associated with the constituent | [optional] [default to Map<String, PerpetualProperty>]
**weight** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**floatingWeight** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**instrumentScope** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ReferencePortfolioConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, String> InstrumentIdentifiers = new Map<String, String>();
String InstrumentUid = "example InstrumentUid";
String Currency = "example Currency";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FloatingWeight = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";


ReferencePortfolioConstituent referencePortfolioConstituentInstance = new ReferencePortfolioConstituent()
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .InstrumentUid(InstrumentUid)
    .Currency(Currency)
    .Properties(Properties)
    .Weight(Weight)
    .FloatingWeight(FloatingWeight)
    .InstrumentScope(InstrumentScope);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
