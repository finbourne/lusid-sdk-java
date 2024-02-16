

# FxForwardSettlementEvent

Settlement for FX Forward, including NDF and deliverable.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maturityDate** | **OffsetDateTime** | Maturity date of the forward |  |
|**domAmountPerUnit** | **java.math.BigDecimal** | Amount per unit in the DomCcy (domestic currency) |  |
|**domCcy** | **String** | The domestic currency of the forward |  |
|**fgnAmountPerUnit** | **java.math.BigDecimal** | Amount per unit in the FgnCcy (foreign currency) |  |
|**fgnCcy** | **String** | The foreign currency of the forward. |  |
|**isNdf** | **Boolean** | Is this settlement corresponding to a deliverable forward, or an NDF |  |
|**fixingDate** | **OffsetDateTime** | Optional. Required if the event is an NDF (i.e. if IsNdf &#x3D; true).  Date of the FxRate fixings. |  [optional] |
|**settlementCcy** | **String** | Optional. Required if the event is an NDF (i.e. if IsNdf &#x3D; true).  May be set to either DomCcy or FgnCcy, or a third currency. |  [optional] |
|**cashFlowPerUnit** | **java.math.BigDecimal** | Optional. Required if the event is an NDF (i.e. if IsNdf &#x3D; true).  CashFlow per unit. Paid in the SettlementCcy. |  [optional] |
|**domesticToForeignRate** | **java.math.BigDecimal** | Domestic currency to foreign currency FX rate.  Not required, only used to override quotes. |  [optional] |
|**domesticToSettlementRate** | **java.math.BigDecimal** | Domestic currency to settlement currency FX rate  Not required, only used to override quotes. |  [optional] |



