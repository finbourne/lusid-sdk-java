# com.finbourne.lusid.model.FilteredFundIdList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | **String** |  | [default to String]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [readonly] [default to List<ResourceId>]
**navTypeCodesHint** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**navTypeSelection** | **String** | Available values: First, All. | [optional] [default to String]
**resolvedFundNavTypeCodes** | [**List&lt;FundNavTypeCodes&gt;**](FundNavTypeCodes.md) |  | [optional] [readonly] [default to List<FundNavTypeCodes>]

```java
import com.finbourne.lusid.model.FilteredFundIdList;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Filter = "example Filter";
@jakarta.annotation.Nullable List<ResourceId> Values = new List<ResourceId>();
@jakarta.annotation.Nullable List<String> NavTypeCodesHint = new List<String>();
String NavTypeSelection = "example NavTypeSelection";
@jakarta.annotation.Nullable List<FundNavTypeCodes> ResolvedFundNavTypeCodes = new List<FundNavTypeCodes>();


FilteredFundIdList filteredFundIdListInstance = new FilteredFundIdList()
    .Filter(Filter)
    .Values(Values)
    .NavTypeCodesHint(NavTypeCodesHint)
    .NavTypeSelection(NavTypeSelection)
    .ResolvedFundNavTypeCodes(ResolvedFundNavTypeCodes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
