# com.finbourne.lusid.model.UpsertPersonRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | The identifiers the person will be upserted with.The provided keys should be idTypeScope, idTypeCode, code | [default to Map<String, Property>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Person. There can be multiple properties associated with a property key. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Person | [default to String]
**description** | **String** | The description of the Person | [optional] [default to String]

```java
import com.finbourne.lusid.model.UpsertPersonRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, Property> Identifiers = new Map<String, Property>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


UpsertPersonRequest upsertPersonRequestInstance = new UpsertPersonRequest()
    .Identifiers(Identifiers)
    .Properties(Properties)
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
