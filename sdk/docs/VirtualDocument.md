# com.finbourne.lusid.model.VirtualDocument
Virtual document consists of (potentially several) upserted documents.     The documents get parsed according to the provided data map on upsert, the collection of resulting values in  aggregated in a virtual document

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentId** | [**StructuredResultDataId**](StructuredResultDataId.md) |  | [optional] [default to StructuredResultDataId]
**data** | [**List&lt;VirtualDocumentRow&gt;**](VirtualDocumentRow.md) | The data inside the document | [optional] [default to List<VirtualDocumentRow>]

```java
import com.finbourne.lusid.model.VirtualDocument;
import java.util.*;
import java.lang.System;
import java.net.URI;

StructuredResultDataId DocumentId = new StructuredResultDataId();
@jakarta.annotation.Nullable List<VirtualDocumentRow> Data = new List<VirtualDocumentRow>();


VirtualDocument virtualDocumentInstance = new VirtualDocument()
    .DocumentId(DocumentId)
    .Data(Data);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
