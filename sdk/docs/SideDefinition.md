# com.finbourne.lusid.model.SideDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | **String** | A unique label identifying the side definition. | [default to String]
**security** | **String** | The field or property key defining the side&#39;s security, or instrument. | [default to String]
**currency** | **String** | The field or property key defining the side&#39;s currency. | [default to String]
**rate** | **String** | The field or property key defining the side&#39;s rate. | [default to String]
**units** | **String** | The value, field or property key defining the side&#39;s units. | [default to String]
**amount** | **String** | The value, field or property key defining the side&#39;s amount | [default to String]
**notionalAmount** | **String** | The value, field or property key defining the side&#39;s notional amount | [optional] [default to String]
**currentFace** | **String** | The value, field or property key defining the side&#39;s current face / outstanding notional. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.SideDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Side = "example Side";
String Security = "example Security";
String Currency = "example Currency";
String Rate = "example Rate";
String Units = "example Units";
String Amount = "example Amount";
@jakarta.annotation.Nullable String NotionalAmount = "example NotionalAmount";
@jakarta.annotation.Nullable String CurrentFace = "example CurrentFace";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


SideDefinition sideDefinitionInstance = new SideDefinition()
    .Side(Side)
    .Security(Security)
    .Currency(Currency)
    .Rate(Rate)
    .Units(Units)
    .Amount(Amount)
    .NotionalAmount(NotionalAmount)
    .CurrentFace(CurrentFace)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
