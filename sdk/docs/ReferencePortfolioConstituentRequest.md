# com.finbourne.lusid.model.ReferencePortfolioConstituentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]
**weight** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**currency** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ReferencePortfolioConstituentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Currency = "example Currency";


ReferencePortfolioConstituentRequest referencePortfolioConstituentRequestInstance = new ReferencePortfolioConstituentRequest()
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Properties(Properties)
    .Weight(Weight)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
