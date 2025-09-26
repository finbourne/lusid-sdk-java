# com.finbourne.lusid.model.FieldSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**type** | **String** | The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText | [optional] [default to String]
**displayOrder** | **Integer** |  | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.FieldSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Type = "example Type";
Integer DisplayOrder = new Integer("100.00");


FieldSchema fieldSchemaInstance = new FieldSchema()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .Type(Type)
    .DisplayOrder(DisplayOrder);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
