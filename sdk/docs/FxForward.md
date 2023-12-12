

# FxForward

LUSID representation of an FX Forward.  Including FX Spot and Non-Deliverable Forwards.     This instrument has multiple legs, to see how legs are used in LUSID see https://support.lusid.com/knowledgebase/article/KA-02252.     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | DomesticLeg | Cash flows in the domestic currency of the forward. |  | 2 | ForeignLeg | Cash flows in the foreign currency of the forward (not present for non-deliverable forwards). |

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. |  |
|**domAmount** | **java.math.BigDecimal** | The amount that is to be paid in the domestic currency on the maturity date. |  |
|**domCcy** | **String** | The domestic currency of the instrument. |  |
|**fgnAmount** | **java.math.BigDecimal** | The amount that is to be paid in the foreign currency on the maturity date. |  |
|**fgnCcy** | **String** | The foreign (other) currency of the instrument. In the NDF case, only payments are made in the domestic currency.  For the outright forward, currencies are exchanged. By domestic is then that of the portfolio. |  |
|**refSpotRate** | **java.math.BigDecimal** | The reference Fx Spot rate for currency pair Foreign-Domestic that was seen on the trade start date (time). |  [optional] |
|**isNdf** | **Boolean** | Is the contract an Fx-Forward of \&quot;Non-Deliverable\&quot; type, meaning a single payment in the domestic currency based on the change in fx-rate vs  a reference rate is used. |  [optional] |
|**fixingDate** | **OffsetDateTime** | The fixing date. |  [optional] |
|**settlementCcy** | **String** | The settlement currency.  If provided, present value will be calculated in settlement currency, otherwise the domestic currency. Applies only to non-deliverable FX Forwards. |  [optional] |



