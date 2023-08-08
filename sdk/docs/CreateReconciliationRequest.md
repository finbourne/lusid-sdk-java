

# CreateReconciliationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The unique identifier associated with the reconciliation |  |
|**name** | **String** | The name of the scheduled reconciliation |  [optional] |
|**description** | **String** | A description of the scheduled reconciliation |  [optional] |
|**isPortfolioGroup** | **Boolean** | Specifies whether reconciliation is between portfolios or portfolio groups |  [optional] |
|**left** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**right** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**transactions** | [**ReconciliationTransactions**](ReconciliationTransactions.md) |  |  [optional] |
|**positions** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  |  [optional] |
|**valuations** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Reconciliation properties |  [optional] |



