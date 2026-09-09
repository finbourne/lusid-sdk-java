# com.finbourne.lusid.model.UnitDimension
One factor of a result's unit, modelled as dimensional analysis rather than a label, e.g. a  rates delta is GBP^1 . GBP.LIBOR.3M^-1 - \"GBP per basis point\". A result's `units` is a  flat list of these; the count tracks the order of the derivative (a ratio), not the result's  axes, and must not be indexed by axis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unitDomain** | **String** | The domain this factor is drawn from, e.g. \&quot;Ccy\&quot;, \&quot;Rate\&quot;, \&quot;Vol\&quot;, \&quot;Security\&quot;. | [optional] [default to String]
**name** | **String** | The name within the domain, e.g. a currency code or a curve identifier. | [optional] [default to String]
**power** | **Integer** | The exponent this factor is raised to. | [optional] [default to Integer]
**scale** | **java.math.BigDecimal** | The scale of one unit of this factor, e.g. 1e-4 for a basis point. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.UnitDimension;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String UnitDomain = "example UnitDomain";
@jakarta.annotation.Nullable String Name = "example Name";
Integer Power = new Integer("100.00");
java.math.BigDecimal Scale = new java.math.BigDecimal("100.00");


UnitDimension unitDimensionInstance = new UnitDimension()
    .UnitDomain(UnitDomain)
    .Name(Name)
    .Power(Power)
    .Scale(Scale);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
