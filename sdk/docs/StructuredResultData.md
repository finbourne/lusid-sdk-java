

# StructuredResultData

An item of structured result data that is to be inserted into Lusid. This will typically be a Json or Xml document that  contains a set of result data appropriate to a specific entity such as an instrument or potentially an index.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentFormat** | **String** | The format of the accompanying document. |  |
|**version** | **String** | The semantic version of the document format; MAJOR.MINOR.PATCH |  [optional] |
|**name** | **String** | The name or description for the document |  [optional] |
|**document** | **String** | The document that will be stored (or retrieved) and which describes a unit result data entity such as a set of prices or yields |  |
|**dataMapKey** | [**DataMapKey**](DataMapKey.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


