

# Compounding

The compounding settings used on interest rate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculationShiftMethod** | **String** | Defines which resets and day counts are used for the rate calculation    Supported string (enumeration) values are: [Lookback, NoShift, ObservationPeriodShift, Lockout]. |  [optional]
**compoundingMethod** | **String** | If the interest rate is simple or compounded.    Supported string (enumeration) values are: [Average, Compounded]. | 
**resetFrequency** | **String** | The interest payment frequency. | 
**shift** | **Integer** | Defines the number of days to lockout or shift observation period by - should be a non-negative integer |  [optional]
**spreadCompoundingMethod** | **String** | Defines how the computed leg spread is applied to compounded rate.  It applies only when CompoundingMethod &#x3D; ‘Compounded‘.    Supported string (enumeration) values are: [Straight, IsdaCompounding, NoCompounding, SpreadExclusive, IsdaFlatCompounding, Flat, None]. | 



