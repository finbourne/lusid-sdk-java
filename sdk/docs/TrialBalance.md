

# TrialBalance

A TrialBalance entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**generalLedgerAccountCode** | **String** | The Account code that the trial balance results have been grouped against. |  |
|**description** | **String** | The description of the record. |  [optional] |
|**levels** | **List&lt;String&gt;** | The levels that have been derived from the specified General Ledger Profile. |  |
|**accountType** | **String** | The account type attributed to the record. |  |
|**localCurrency** | **String** | The local currency for the amounts specified. Defaults to base currency if multiple different currencies present in the grouped line. |  |
|**opening** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  |  |
|**closing** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  |  |
|**debit** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  |  |
|**credit** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties found on the mapped &#39;Account&#39;, as specified in request. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


