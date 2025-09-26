# com.finbourne.lusid.model.UpsertReferencePortfolioConstituentPropertiesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the constituent to a unique instrument. | [default to Map<String, String>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The updated collection of properties of the constituent. | [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.UpsertReferencePortfolioConstituentPropertiesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> Identifiers = new Map<String, String>();
Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


UpsertReferencePortfolioConstituentPropertiesRequest upsertReferencePortfolioConstituentPropertiesRequestInstance = new UpsertReferencePortfolioConstituentPropertiesRequest()
    .Identifiers(Identifiers)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
