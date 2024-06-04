

# CashAndSecurityOfferElection



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cashOfferCurrency** | **String** | Currency of the cash offer |  |
|**cashOfferPrice** | **java.math.BigDecimal** | Price per share of the cash offer |  |
|**costFactor** | **java.math.BigDecimal** | Optional. The fraction of cost that is transferred from the existing shares to the new shares. |  [optional] |
|**electionKey** | **String** | Unique key associated to this election. |  |
|**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. |  [optional] |
|**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. |  [optional] |
|**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  |  |



