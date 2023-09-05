

# PostingModuleResponse

A Posting Module definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | The name to identify the Posting Module by |  |
|**description** | **String** | The description for the Posting Module |  [optional] |
|**ruleCount** | **Integer** | The number of posting rules that apply for the Posting Module |  [optional] |
|**status** | **String** | The Posting Module status. Can be Active, Inactive or Deleted. Defaults to Active. |  |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



