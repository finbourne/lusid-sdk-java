

# InflationSwap

LUSID representation of an Inflation Swap. The implementation supports the following swap types: * Zero Coupon inflation swap, with a single payment at maturity. * LPI Swap (capped and floored) * Year on Year inflation swap   This instrument has multiple legs, to see how legs are used in LUSID see [knowledge base article KA-02252](https://support.lusid.com/knowledgebase/article/KA-02252).   | Leg Index | Leg Identifier | Description | | --------- | -------------- | ----------- | | 1 | InflationLeg | Cash flows with a rate relating to an underlying inflation index. | | 2 | FixedLeg | Cash flows with a fixed rate. | | 3 | AdditionalPayments | Cash flows relating to any additional payments (optional). |

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount. For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. |  |
|**inflationLeg** | [**InflationLeg**](InflationLeg.md) |  |  |
|**fixedLeg** | [**FixedLeg**](FixedLeg.md) |  |  |
|**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven inflation swap. The dates must be distinct and either all payments are Pay or all payments are Receive. |  [optional] |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


