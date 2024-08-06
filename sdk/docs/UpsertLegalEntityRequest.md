

# UpsertLegalEntityRequest

Request to create or update an legal entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | The identifiers the legal entity will be upserted with.The provided keys should be idTypeScope, idTypeCode, code |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Legal Entity. |  [optional] |
|**displayName** | **String** | The display name of the Legal Entity |  |
|**description** | **String** | The description of the Legal Entity |  [optional] |
|**counterpartyRiskInformation** | [**CounterpartyRiskInformation**](CounterpartyRiskInformation.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


