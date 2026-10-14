# com.finbourne.lusid.model.FundStructureCloseRequest
The request to close a fund structure: finalise the named valuation point on every member, members first.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valuationPointCode** | **String** | The code of the valuation point to finalise on every member fund. | [default to String]
**navTypeCode** | **String** | The NAV type to finalise under. Defaults to each fund&#39;s primary NAV type. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FundStructureCloseRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ValuationPointCode = "example ValuationPointCode";
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";


FundStructureCloseRequest fundStructureCloseRequestInstance = new FundStructureCloseRequest()
    .ValuationPointCode(ValuationPointCode)
    .NavTypeCode(NavTypeCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
