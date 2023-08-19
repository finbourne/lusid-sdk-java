

# ExDividendConfiguration

Configure the ex-dividend periods for the instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useBusinessDays** | **Boolean** | Is the ex-dividend period counted in business days or calendar days.  Defaults to true if not set. |  [optional]
**exDividendDays** | **Integer** | Number of days in the ex-dividend period.  If the settlement date falls in the ex-dividend period then the coupon paid is zero and the accrued interest is negative.  If set, this must be a non-negative number.  If not set, or set to 0, than there is no ex-dividend period. | 
**returnNegativeAccrued** | **Boolean** | Does the accrued interest go negative in the ex-dividend period, or does it go to zero.  Defaults to true if not set. |  [optional]



