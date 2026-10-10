# com.finbourne.lusid.model.SwingSpreads
The stored spreads a Single fund swings by, one set for each direction of net cashflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inflow** | [**DirectionSpreads**](DirectionSpreads.md) |  | [optional] [default to DirectionSpreads]
**outflow** | [**DirectionSpreads**](DirectionSpreads.md) |  | [optional] [default to DirectionSpreads]

```java
import com.finbourne.lusid.model.SwingSpreads;
import java.util.*;
import java.lang.System;
import java.net.URI;

DirectionSpreads Inflow = new DirectionSpreads();
DirectionSpreads Outflow = new DirectionSpreads();


SwingSpreads swingSpreadsInstance = new SwingSpreads()
    .Inflow(Inflow)
    .Outflow(Outflow);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
