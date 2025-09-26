# com.finbourne.lusid.model.SimpleRoundingConvention
Certain bonds will follow certain rounding conventions.  For example, Thai government bonds will round accrued interest and cashflow values 2dp, whereas for  French government bonds, the rounding is to 7dp.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**precision** | **Integer** | The precision of the rounding. The decimal places or significant figures to which the rounding takes place.  Defaults to 0 if not set. | [optional] [default to Integer]
**roundingType** | **String** | The type of rounding. e.g. Round Up, Round Down    Supported string (enumeration) values are: [Down, Up, Nearest].  Defaults to \&quot;None\&quot; if not set. | [optional] [default to String]

```java
import com.finbourne.lusid.model.SimpleRoundingConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Precision = new Integer("100.00");
@jakarta.annotation.Nullable String RoundingType = "example RoundingType";


SimpleRoundingConvention simpleRoundingConventionInstance = new SimpleRoundingConvention()
    .Precision(Precision)
    .RoundingType(RoundingType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
