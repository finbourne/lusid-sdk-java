# com.finbourne.lusid.model.ReferenceList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. The available values are: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList | [default to String]

```java
import com.finbourne.lusid.model.ReferenceList;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ReferenceListType = "example ReferenceListType";


ReferenceList referenceListInstance = new ReferenceList()
    .ReferenceListType(ReferenceListType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
