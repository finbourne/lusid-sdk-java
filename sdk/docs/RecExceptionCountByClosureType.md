# com.finbourne.lusid.model.RecExceptionCountByClosureType
Closed exception result counts broken down by closure type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleared** | **Integer** | The number of Cleared results. | [default to Integer]
**accepted** | **Integer** | The number of Accepted results. | [default to Integer]
**forceMatched** | **Integer** | The number of Force Matched results. | [default to Integer]

```java
import com.finbourne.lusid.model.RecExceptionCountByClosureType;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Cleared = new Integer("100.00");
Integer Accepted = new Integer("100.00");
Integer ForceMatched = new Integer("100.00");


RecExceptionCountByClosureType recExceptionCountByClosureTypeInstance = new RecExceptionCountByClosureType()
    .Cleared(Cleared)
    .Accepted(Accepted)
    .ForceMatched(ForceMatched);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
