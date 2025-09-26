# com.finbourne.lusid.model.VirtualRow
Rows identified by the composite id, based on the data maps

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rowId** | **Map&lt;String, String&gt;** | The identifier for the row. This is keyed by address keys, and values obtained through applying the data map to the documents. | [optional] [default to Map<String, String>]
**rowData** | [**Map&lt;String, ResultValue&gt;**](ResultValue.md) | The data for the particular row | [optional] [default to Map<String, ResultValue>]

```java
import com.finbourne.lusid.model.VirtualRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, String> RowId = new Map<String, String>();
@jakarta.annotation.Nullable Map<String, ResultValue> RowData = new Map<String, ResultValue>();


VirtualRow virtualRowInstance = new VirtualRow()
    .RowId(RowId)
    .RowData(RowData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
