

# LegDefinition

Definition of the set of flow and index conventions along with other miscellaneous information required to generate an instrument leg.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conventionName** | [**FlowConventionName**](FlowConventionName.md) |  |  [optional] |
|**conventions** | [**FlowConventions**](FlowConventions.md) |  |  [optional] |
|**indexConvention** | [**IndexConvention**](IndexConvention.md) |  |  [optional] |
|**indexConventionName** | [**FlowConventionName**](FlowConventionName.md) |  |  [optional] |
|**notionalExchangeType** | **String** | what type of notional exchange does the leg have    Supported string (enumeration) values are: [None, Initial, Final, Both]. |  |
|**payReceive** | **String** | Is the leg to be paid or received    Supported string (enumeration) values are: [Pay, Receive]. |  |
|**rateOrSpread** | **java.math.BigDecimal** | Is there either a fixed rate (non-zero) or spread to be paid over the value of the leg. |  |
|**resetConvention** | **String** | Control how resets are generated relative to swap payment convention(s).    Supported string (enumeration) values are: [InAdvance, InArrears]. |  [optional] |
|**stubType** | **String** | If a stub is required should it be at the front or back of the leg.    Supported string (enumeration) values are: [None, ShortFront, ShortBack, LongBack, LongFront, Both]. |  |
|**compounding** | [**Compounding**](Compounding.md) |  |  [optional] |
|**amortisation** | [**StepSchedule**](StepSchedule.md) |  |  [optional] |
|**firstRegularPaymentDate** | **OffsetDateTime** | Optional payment date of the first regular coupon.  Must be greater than the StartDate.  If set, the regular coupon schedule will be built such that the first regular coupon  will end on this date. The start date of this coupon will be calculated as normal and  a stub coupon will be created from the StartDate to the start of the first regular coupon. |  [optional] |
|**firstCouponType** | **String** | Optional coupon type setting for the first coupon, can be used with Stub coupons.  If set to \&quot;ProRata\&quot; (the default), the coupon year fraction is calculated as normal,  however if set to \&quot;Full\&quot; the year fraction is overwritten with the standard year fraction  for a regular ful\&quot; coupon. Note this does not use the day count convention but rather is defined  directly from the tenor (i.e. a quarterly leg will be set to 0.25).    Supported string (enumeration) values are: [ProRata, Full]. |  [optional] |
|**lastRegularPaymentDate** | **OffsetDateTime** | Optional payment date of the last regular coupon.  Must be less than the Maturity date.  If set, the regular coupon schedule will be built up to this date and the final  coupon will be a stub between this date and the Maturity date. |  [optional] |
|**lastCouponType** | **String** | Optional coupon type setting for the last coupon, can be used with Stub coupons.  If set to \&quot;ProRata\&quot; (the default), the coupon year fraction is calculated as normal,  however if set to \&quot;Full\&quot; the year fraction is overwritten with the standard year fraction  for a regular ful\&quot; coupon. Note this does not use the day count convention but rather is defined  directly from the tenor (i.e. a quarterly leg will be set to 0.25).    Supported string (enumeration) values are: [ProRata, Full]. |  [optional] |



