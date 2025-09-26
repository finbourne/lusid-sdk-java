# com.finbourne.lusid.model.TransactionTypePropertyMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The key that uniquely identifies the property. It has the format {domain}/{scope}/{code} | [default to String]
**mapFrom** | **String** | The Property Key of the Property to map from | [optional] [default to String]
**setTo** | **String** | A pointer to the Property being mapped from | [optional] [default to String]
**templateFrom** | **String** | The template that defines how the property value is constructed from transaction, instrument and portfolio details. | [optional] [default to String]
**nullify** | **Boolean** | Flag to unset the Property Key for the mapping | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.TransactionTypePropertyMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PropertyKey = "example PropertyKey";
@jakarta.annotation.Nullable String MapFrom = "example MapFrom";
@jakarta.annotation.Nullable String SetTo = "example SetTo";
@jakarta.annotation.Nullable String TemplateFrom = "example TemplateFrom";
@jakarta.annotation.Nullable Boolean Nullify = true;


TransactionTypePropertyMapping transactionTypePropertyMappingInstance = new TransactionTypePropertyMapping()
    .PropertyKey(PropertyKey)
    .MapFrom(MapFrom)
    .SetTo(SetTo)
    .TemplateFrom(TemplateFrom)
    .Nullify(Nullify);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
