# com.finbourne.lusid.model.InflationIndexConventions
A set of conventions that describe the conventions for an inflation index.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inflationIndexName** | **String** | Name of the index, e.g. UKRPI. | [default to String]
**currency** | **String** | Currency of the inflation index convention. | [default to String]
**observationLag** | **String** | Observation lag. This is a string that must have units of Month.  This field is typically 3 or 4 months, but can vary, older bonds and swaps have 8 months lag.  For Bonds with a calculation type of Ratio, this property, if set, must be 0Invalid.    For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to String]
**inflationInterpolation** | **String** | Inflation Interpolation. This is optional and defaults to Linear if not set.    Supported string (enumeration) values are: [Linear, Flat]. | [optional] [default to String]
**inflationFrequency** | **String** | Frequency of inflation updated. Optional and defaults to Monthly which is the most common.  However both Australian and New Zealand inflation is published Quarterly. Only tenors of 1M or 3M are supported.    For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [optional] [default to String]
**inflationRollDay** | **Integer** | Day of the month that inflation rolls from one month to the next. This is optional and defaults to 1, which is  the typically value for the majority of inflation bonds (exceptions include Japan which rolls on the 10th  and some LatAm bonds which roll on the 15th). | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.InflationIndexConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InflationIndexName = "example InflationIndexName";
String Currency = "example Currency";
String ObservationLag = "example ObservationLag";
@jakarta.annotation.Nullable String InflationInterpolation = "example InflationInterpolation";
@jakarta.annotation.Nullable String InflationFrequency = "example InflationFrequency";
Integer InflationRollDay = new Integer("100.00");


InflationIndexConventions inflationIndexConventionsInstance = new InflationIndexConventions()
    .InflationIndexName(InflationIndexName)
    .Currency(Currency)
    .ObservationLag(ObservationLag)
    .InflationInterpolation(InflationInterpolation)
    .InflationFrequency(InflationFrequency)
    .InflationRollDay(InflationRollDay);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
