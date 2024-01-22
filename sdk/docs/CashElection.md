

# CashElection

Cash election for Events that result in a cash payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**electionKey** | **String** | Unique key used to identify this election. |  |
|**exchangeRate** | **java.math.BigDecimal** | The exchange rate if this is not the declared CashElection. Defaults to 1 if Election is Declared. |  [optional] |
|**dividendRate** | **java.math.BigDecimal** | The payment rate for this CashElection. |  [optional] |
|**isChosen** | **Boolean** | Has this election been chosen. Only one Election may be Chosen per Event. |  [optional] |
|**isDeclared** | **Boolean** | Is this the declared CashElection. Only one Election may be Declared per Event. |  [optional] |
|**isDefault** | **Boolean** | Is this election the default. Only one Election may be Default per Event |  [optional] |
|**dividendCurrency** | **String** | The payment currency for this CashElection. |  |



