

# VirtualDocument

Virtual document consists of (potentially several) upserted documents.     The documents get parsed according to the provided data map on upsert, the collection of resulting values in  aggregated in a virtual document

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | [**StructuredResultDataId**](StructuredResultDataId.md) |  |  [optional] |
|**data** | [**List&lt;VirtualDocumentRow&gt;**](VirtualDocumentRow.md) | The data inside the document |  [optional] |



