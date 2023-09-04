

# Reconciliation

Representation of Reconciliation in LUSID Api

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ReconciliationId**](ReconciliationId.md) |  |  [optional] |
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**name** | **String** | The name of the scheduled reconciliation |  [optional] |
|**description** | **String** | A description of the scheduled reconciliation |  [optional] |
|**isPortfolioGroup** | **Boolean** | Specifies whether reconciliation is between portfolios or portfolio groups |  [optional] |
|**left** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**right** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**transactions** | [**ReconciliationTransactions**](ReconciliationTransactions.md) |  |  [optional] |
|**positions** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  |  [optional] |
|**valuations** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Reconciliation properties |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



