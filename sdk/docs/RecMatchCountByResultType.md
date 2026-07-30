# com.finbourne.lusid.model.RecMatchCountByResultType
Match result counts broken down by result type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match** | **Integer** | The number of Match results. | [default to Integer]
**cross** | **Integer** | The number of Cross results. | [default to Integer]

```java
import com.finbourne.lusid.model.RecMatchCountByResultType;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Match = new Integer("100.00");
Integer Cross = new Integer("100.00");


RecMatchCountByResultType recMatchCountByResultTypeInstance = new RecMatchCountByResultType()
    .Match(Match)
    .Cross(Cross);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
