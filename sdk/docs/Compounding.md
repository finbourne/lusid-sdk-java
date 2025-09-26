# com.finbourne.lusid.model.Compounding
The compounding settings used on interest rate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**averagingMethod** | **String** | Defines whether a weighted or unweighted average is used when calculating the average rate.  It applies only when CompoundingMethod &#x3D; ‘Averaging‘.    Supported string (enumeration) values are: [Unweighted, UnweightedIncludingWeekends, Weighted].  Defaults to \&quot;None\&quot; if not set. | [optional] [default to String]
**calculationShiftMethod** | **String** | Defines which resets and day counts are used for the rate calculation    Supported string (enumeration) values are: [Lookback, NoShift, ObservationPeriodShift, Lockout].  Defaults to \&quot;NoShift\&quot; if not set. | [optional] [default to String]
**compoundingMethod** | **String** | If the interest rate is simple, compounded or using a pre-computed compounded index.    Supported string (enumeration) values are: [Averaging, Compounding, CompoundedIndex, NonCumulativeCompounding]. | [default to String]
**resetFrequency** | **String** | The interest payment frequency.    For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to String]
**shift** | **Integer** | Defines the number of days to lockout or shift observation period by - should be a non-negative integer.  Defaults to 0 if not set. | [optional] [default to Integer]
**spreadCompoundingMethod** | **String** | Defines how the computed leg spread is applied to compounded rate.  It applies only when CompoundingMethod &#x3D; ‘Compounding‘ or ‘CompoundedIndex‘.    Available compounding methods:    | Method | Description |  | ------ | ----------- |  | Straight | Compounding rate in each compound period includes the spread. |  | Flat | Compounding rate does not include the spread, and the spread is used for simple interest in each compound period. |  | SpreadExclusive | Compounding rate does not include the spread, and the spread is used for simple interest for whole accrual period. |    The values \&quot;IsdaCompounding\&quot;, \&quot;NoCompounding\&quot;, \&quot;IsdaFlatCompounding\&quot;, and \&quot;None\&quot; are accepted for compatibility  with existing instruments and their use is discouraged.    Supported string (enumeration) values are: [Straight, IsdaCompounding, NoCompounding, SpreadExclusive, IsdaFlatCompounding, Flat, None].  Defaults to \&quot;None\&quot; if not set. | [optional] [default to String]
**roundingPrecision** | **Integer** | Defines the number of decimal places the compounded rate (expressed as a decimal) should be rounded to.  This is an optional field, leaving it blank will mean no rounding takes place in Compounding. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.Compounding;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String AveragingMethod = "example AveragingMethod";
@jakarta.annotation.Nullable String CalculationShiftMethod = "example CalculationShiftMethod";
String CompoundingMethod = "example CompoundingMethod";
String ResetFrequency = "example ResetFrequency";
Integer Shift = new Integer("100.00");
@jakarta.annotation.Nullable String SpreadCompoundingMethod = "example SpreadCompoundingMethod";
@jakarta.annotation.Nullable Integer RoundingPrecision = new Integer("100.00");


Compounding compoundingInstance = new Compounding()
    .AveragingMethod(AveragingMethod)
    .CalculationShiftMethod(CalculationShiftMethod)
    .CompoundingMethod(CompoundingMethod)
    .ResetFrequency(ResetFrequency)
    .Shift(Shift)
    .SpreadCompoundingMethod(SpreadCompoundingMethod)
    .RoundingPrecision(RoundingPrecision);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
