# com.finbourne.lusid.model.HoldingIdsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingIds** | **List&lt;Long&gt;** | The array of unique holding identifiers | [default to List<Long>]

```java
import com.finbourne.lusid.model.HoldingIdsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<Long> HoldingIds = new List<Long>();


HoldingIdsRequest holdingIdsRequestInstance = new HoldingIdsRequest()
    .HoldingIds(HoldingIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
