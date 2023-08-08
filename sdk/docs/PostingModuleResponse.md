

# PostingModuleResponse

A posting Module request definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  |  |
|**name** | **String** | The name to identify the Posting Module by |  |
|**description** | **String** | The description for the posting module |  [optional] |
|**ruleCount** | **Integer** | The number of posting rules that apply for the Posting Module |  [optional] |
|**status** | **String** | The Posting Module status. Can be Active, Inactive or Deleted. Defaults to Active. |  |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



