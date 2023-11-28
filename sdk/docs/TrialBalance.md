

# TrialBalance

A TrialBalance entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**generalLedgerAccountCode** | **String** | The Account code that the trial balance results have been grouped against |  |
|**description** | **String** | The description of the record |  [optional] |
|**levels** | **List&lt;String&gt;** | The levels that have been derived from the specified General Ledger Profile |  |
|**accountType** | **String** | The account type attributed to the record |  |
|**opening** | **java.math.BigDecimal** | The opening balance at the start of the period |  |
|**closing** | **java.math.BigDecimal** | The closing balance at the end of the period |  |
|**debit** | **java.math.BigDecimal** | All debits that occured in the period |  |
|**credit** | **java.math.BigDecimal** | All credits that occured in the period |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties found on the mapped &#39;Account&#39;, as specified in request |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



