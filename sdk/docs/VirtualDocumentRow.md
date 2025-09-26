# com.finbourne.lusid.model.VirtualDocumentRow
Rows identified by the composite id, based on the data maps

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rowId** | **Map&lt;String, String&gt;** | The identifier for the row. This is keyed by address keys, and values obtained through applying the data map to the documents. | [optional] [default to Map<String, String>]
**rowData** | [**GroupedResultOfAddressKey**](GroupedResultOfAddressKey.md) |  | [optional] [default to GroupedResultOfAddressKey]

```java
import com.finbourne.lusid.model.VirtualDocumentRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, String> RowId = new Map<String, String>();
GroupedResultOfAddressKey RowData = new GroupedResultOfAddressKey();


VirtualDocumentRow virtualDocumentRowInstance = new VirtualDocumentRow()
    .RowId(RowId)
    .RowData(RowData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
