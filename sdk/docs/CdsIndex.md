

# CdsIndex

LUSID representation of a Credit Default Swap Index (CDX).     This instrument has multiple legs, to see how legs are used in LUSID see [knowledge base article KA-02252](https://support.lusid.com/knowledgebase/article/KA-02252).     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | ProtectionLeg | Payments made by the protection seller in the case of default across all CDS instruments in the index. |  | 2 | PremiumLeg | The premium payments made by the protection buyer across all CDS instruments in the index. |  | 3 | AdditionalPayments | Cash flows relating to any additional payments (optional). |

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. |  |
|**flowConventions** | [**CdsFlowConventions**](CdsFlowConventions.md) |  |  [optional] |
|**couponRate** | **java.math.BigDecimal** | The coupon rate paid on each payment date of the premium leg as a fraction of 100 percent, e.g. \&quot;0.05\&quot; meaning 500 basis points or 5%.  For a standard corporate CDS (North American) this must be either 100bps or 500bps. |  |
|**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the cds index, e.g. a RED code, BBG ID or ICE code. |  |
|**basket** | [**Basket**](Basket.md) |  |  [optional] |
|**conventionName** | [**FlowConventionName**](FlowConventionName.md) |  |  [optional] |
|**notional** | **java.math.BigDecimal** | The notional quantity that applies to both the premium and protection legs. |  |
|**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven swap.  The dates must be distinct and either all payments are Pay or all payments are Receive. |  [optional] |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


