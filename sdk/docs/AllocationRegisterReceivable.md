# com.finbourne.lusid.model.AllocationRegisterReceivable
What one register is owed on a booked capital call, across every record called on its lines.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**called** | **java.math.BigDecimal** | What was called on the register&#39;s lines. | [optional] [default to java.math.BigDecimal]
**received** | **java.math.BigDecimal** | What has settled the register&#39;s lines so far. | [optional] [default to java.math.BigDecimal]
**outstanding** | **java.math.BigDecimal** | What the register is still owed. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationRegisterReceivable;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Portfolio = new ResourceId();
java.math.BigDecimal Called = new java.math.BigDecimal("100.00");
java.math.BigDecimal Received = new java.math.BigDecimal("100.00");
java.math.BigDecimal Outstanding = new java.math.BigDecimal("100.00");


AllocationRegisterReceivable allocationRegisterReceivableInstance = new AllocationRegisterReceivable()
    .Portfolio(Portfolio)
    .Called(Called)
    .Received(Received)
    .Outstanding(Outstanding);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
