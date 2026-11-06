# com.finbourne.lusid.model.ShareClassRoundingConvention

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**precision** | **Integer** | The precision of the rounding: the number of decimal places, or of significant figures when PrecisionType is SignificantFigures. At most 28, and at least 1 for SignificantFigures. Defaults to 0. | [optional] [default to Integer]
**roundingType** | **String** | The type of rounding, applied at the last decimal place or significant figure. Defaults to None, which leaves the value unrounded. Available values: None, Down, Up, Nearest. | [optional] [default to String]
**precisionType** | **String** | What Precision counts: DecimalPlaces (the default) or SignificantFigures. A SignificantFigures convention is not copied onto an instrument created for the share class. Available values: DecimalPlaces, SignificantFigures. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ShareClassRoundingConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Precision = new Integer("100.00");
@jakarta.annotation.Nullable String RoundingType = "example RoundingType";
@jakarta.annotation.Nullable String PrecisionType = "example PrecisionType";


ShareClassRoundingConvention shareClassRoundingConventionInstance = new ShareClassRoundingConvention()
    .Precision(Precision)
    .RoundingType(RoundingType)
    .PrecisionType(PrecisionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
