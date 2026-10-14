# com.finbourne.lusid.model.FundNavTypeCodes
A fund resolved by a filtered fund list, with the NAV type codes matched by the list's hint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**navTypeCodes** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.FundNavTypeCodes;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
@jakarta.annotation.Nullable List<String> NavTypeCodes = new List<String>();


FundNavTypeCodes fundNavTypeCodesInstance = new FundNavTypeCodes()
    .FundId(FundId)
    .NavTypeCodes(NavTypeCodes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
