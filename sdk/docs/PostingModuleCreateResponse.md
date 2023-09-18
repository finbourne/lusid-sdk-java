

# PostingModuleCreateResponse

A Posting Module Create response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**postingModuleCode** | **String** | The code of the Posting Module. |  |
|**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | The name to identify the Posting Module by |  |
|**description** | **String** | The description for the Posting Module |  [optional] |
|**rules** | [**List&lt;PostingModuleRule&gt;**](PostingModuleRule.md) | The posting rules that apply for the Posting Module |  [optional] |
|**status** | **String** | The Posting Module status. Can be Active, Inactive or Deleted. Defaults to Active. |  |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



