

# BondDefaultEvent

Indicates when an issuer has defaulted on an obligation due to technical default, missed payments, or bankruptcy filing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **java.math.BigDecimal** | Percentage or amount of each share held to be given to shareholders. |  |
|**couponPaidDate** | **OffsetDateTime** | Date that the missed coupon is paid if payment is made within grace period. |  |
|**defaultStatus** | **String** | The status of the bond default (i.e., technical or default)    Supported string (enumeration) values are: [Technical, Default]. |  |
|**defaultType** | **String** | The type of the default. (coupon payment, principal payment, covenant ...)    Supported string (enumeration) values are: [CouponPayment, CouponAndPrincipalPayment, PrincipalPayment, Covenant, Bankruptcy, BuyBackOption]. |  |
|**graceEndDate** | **OffsetDateTime** | Date the grace period for making coupon payment ends. |  |
|**paymentDate** | **OffsetDateTime** | The date the coupon payment was missed. |  |



