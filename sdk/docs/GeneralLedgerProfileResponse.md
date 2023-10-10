

# GeneralLedgerProfileResponse

A General Ledger Profile Definition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  |  |
|**generalLedgerProfileCode** | **String** | The unique code for the General Ledger Profile |  |
|**displayName** | **String** | The name of the General Ledger Profile |  |
|**description** | **String** | A description for the General Ledger Profile |  [optional] |
|**generalLedgerProfileMappings** | [**List&lt;GeneralLedgerProfileMapping&gt;**](GeneralLedgerProfileMapping.md) | Rules for mapping Account or property values to aggregation pattern definitions |  |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



