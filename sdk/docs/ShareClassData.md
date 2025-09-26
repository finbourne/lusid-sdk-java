# com.finbourne.lusid.model.ShareClassData
The data for a Share Class. Includes Valuation Point Data and instrument information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassBreakdown** | [**ShareClassBreakdown**](ShareClassBreakdown.md) |  | [default to ShareClassBreakdown]
**shareClassDetails** | [**ShareClassDetails**](ShareClassDetails.md) |  | [optional] [default to ShareClassDetails]

```java
import com.finbourne.lusid.model.ShareClassData;
import java.util.*;
import java.lang.System;
import java.net.URI;

ShareClassBreakdown ShareClassBreakdown = new ShareClassBreakdown();
ShareClassDetails ShareClassDetails = new ShareClassDetails();


ShareClassData shareClassDataInstance = new ShareClassData()
    .ShareClassBreakdown(ShareClassBreakdown)
    .ShareClassDetails(ShareClassDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
