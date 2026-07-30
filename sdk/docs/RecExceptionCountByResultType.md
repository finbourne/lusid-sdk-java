# com.finbourne.lusid.model.RecExceptionCountByResultType
Exception result counts broken down by result type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_break** | **Integer** | The number of Break results. | [default to Integer]
**partialMatch** | **Integer** | The number of Partial Match results. | [default to Integer]
**partialCross** | **Integer** | The number of Partial Cross results. | [default to Integer]

```java
import com.finbourne.lusid.model.RecExceptionCountByResultType;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Break = new Integer("100.00");
Integer PartialMatch = new Integer("100.00");
Integer PartialCross = new Integer("100.00");


RecExceptionCountByResultType recExceptionCountByResultTypeInstance = new RecExceptionCountByResultType()
    .Break(Break)
    .PartialMatch(PartialMatch)
    .PartialCross(PartialCross);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
