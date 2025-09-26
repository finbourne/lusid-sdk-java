# com.finbourne.lusid.model.SideConfigurationData
Configuration needed to define a side. Sides are referenced by Label. Beyond that, other properties  can be used to reference either transaction fields, or transaction properties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | **String** | The side&#39;s label. | [default to String]
**security** | **String** | The security, or instrument. | [default to String]
**currency** | **String** | The currency. | [default to String]
**rate** | **String** | The rate. | [default to String]
**units** | **String** | The units. | [default to String]
**amount** | **String** | The amount. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.SideConfigurationData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Side = "example Side";
String Security = "example Security";
String Currency = "example Currency";
String Rate = "example Rate";
String Units = "example Units";
String Amount = "example Amount";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


SideConfigurationData sideConfigurationDataInstance = new SideConfigurationData()
    .Side(Side)
    .Security(Security)
    .Currency(Currency)
    .Rate(Rate)
    .Units(Units)
    .Amount(Amount)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
