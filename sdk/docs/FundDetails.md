# com.finbourne.lusid.model.FundDetails
The details of a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The currency of the fund which is the same as the base currency of all the portfolios of the fund&#39;s Abor. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FundDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Currency = "example Currency";


FundDetails fundDetailsInstance = new FundDetails()
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
