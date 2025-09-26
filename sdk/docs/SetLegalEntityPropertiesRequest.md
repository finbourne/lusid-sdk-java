# com.finbourne.lusid.model.SetLegalEntityPropertiesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties to set for a Legal Entity. All time-variant properties must have same EffectiveFrom date. Properties not included in the request will not be amended. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.SetLegalEntityPropertiesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


SetLegalEntityPropertiesRequest setLegalEntityPropertiesRequestInstance = new SetLegalEntityPropertiesRequest()
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
