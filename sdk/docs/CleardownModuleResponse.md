

# CleardownModuleResponse

A Cleardown Module definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**cleardownModuleCode** | **String** | The code of the Cleardown Module. |  |
|**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | The name of the Cleardown Module. |  |
|**description** | **String** | A description for the Cleardown Module. |  [optional] |
|**rules** | [**List&lt;CleardownModuleRule&gt;**](CleardownModuleRule.md) | The Cleardown Rules that apply for the Cleardown Module. Rules are evaluated in the order they occur in this collection. |  [optional] |
|**status** | **String** | The Cleardown Module status. Can be Active, Inactive or Deleted. Defaults to Active. |  |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



