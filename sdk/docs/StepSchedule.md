

# StepSchedule

Schedule that steps at known dated points in time.  Used in representation of a sinking bond, also called amortisation, steps in coupons for fixed bonds and spreads for floating bonds.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**levelType** | **String** | The type of shift or adjustment that the quantity represents.    Supported string (enumeration) values are: [Absolute, AbsoluteShift, Percentage, AbsolutePercentage]. | 
**stepScheduleType** | **String** | The type of step that this schedule is for.  Supported string (enumeration) values are: [Coupon, Notional, Spread]. | 
**steps** | [**List&lt;LevelStep&gt;**](LevelStep.md) | The level steps which are applied. | 



